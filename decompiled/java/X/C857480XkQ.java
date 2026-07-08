package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AFwS201S0000000_14;

/* JADX INFO: renamed from: X.0XkQ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C857480XkQ<METADATA> {
    public static final /* synthetic */ int LJFF = 0;
    public final InterfaceC856090XiB<METADATA> LIZ;
    public final AbstractC857980XlE<METADATA> LIZIZ;
    public final String LIZJ = C0CHQ.LIZ().getAccountService().getCurrentUserID();
    public final C01GW LIZLLL = C452501pT.LIZIZ(AFwS201S0000000_14.get$arr$(556));
    public final List<AbstractC858320Xlm<METADATA>> LJ = new ArrayList();

    public static void LIZIZ(String str) {
        C0CHQ.LIZ().getPublishService().LJJLIIIJ().LIZ("LexicalEditor", str);
    }

    public final C857530XkV<METADATA> LIZ(boolean z) {
        CharSequence charSequenceLIZ;
        String strLJIILL = "UNABLE_OBTAIN";
        try {
            CharSequence charSequenceLIZ2 = this.LIZ.LIZIZ().LIZ(z);
            if (charSequenceLIZ2 == null) {
                charSequenceLIZ2 = "";
            }
            C13E8 c13e8LIZ = this.LIZIZ.LIZIZ(charSequenceLIZ2, C858730XmR.LIZ(this.LIZ.LIZ(), this.LIZJ, z, 2)).LIZ();
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("block size: ");
            sbLIZ.append(c13e8LIZ.size());
            LIZIZ(C2188811AlT.LIZIZ(sbLIZ));
            return new C857530XkV<>(charSequenceLIZ2, c13e8LIZ);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            LIZIZ("lexical editor state generation failed.");
            try {
                charSequenceLIZ = this.LIZ.LIZIZ().LIZ(z);
                if (charSequenceLIZ == null) {
                    charSequenceLIZ = "EMPTY";
                }
            } catch (Exception e2) {
                TryCatchGuardChecker.doCheck(e2);
                charSequenceLIZ = "UNABLE_OBTAIN";
            }
            LIZIZ(charSequenceLIZ.toString());
            try {
                strLJIILL = C0CHQ.LIZ().getGson().LJIILL(C858730XmR.LIZ(this.LIZ.LIZ(), this.LIZJ, z, 2));
            } catch (Exception e3) {
                TryCatchGuardChecker.doCheck(e3);
            }
            LIZIZ(strLJIILL);
            C857510XkT.Companion.getClass();
            throw new C857510XkT("construct lexical editor state error", e);
        }
    }

    public C857480XkQ(InterfaceC856090XiB<METADATA> interfaceC856090XiB, AbstractC857980XlE<METADATA> abstractC857980XlE) {
        this.LIZ = interfaceC856090XiB;
        this.LIZIZ = abstractC857980XlE;
    }
}
