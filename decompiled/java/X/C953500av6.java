package X;

import android.content.Context;
import android.view.View;
import com.bytedance.tux.icon.TuxIconView;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import kotlin.jvm.internal.AFwS203S0000000_15;

/* JADX INFO: renamed from: X.0av6, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C953500av6 extends AbstractC960440b6I<C953550avB> {
    public final Context LL;
    public final InterfaceC953490av5 LLILLJJLI;
    public final EnumC952890au7 LLILLL;
    public final HashSet<Long> LLILZ;
    public final C1324720kZq LLILZIL;
    public final C16F5 LLILZLL;
    public final C16F5 LLIZ;
    public final View LLIZLLLIL;
    public final C197039127h LLJ;
    public final View LLJI;
    public final C01GW LLJIJIL;
    public final View LLJILJIL;
    public final C16F5 LLJILJILJ;
    public final TuxIconView LLJILLL;
    public final C16F5 LLJJ;
    public final TuxIconView LLJJI;
    public final C16F5 LLJJIII;
    public final View LLJJIJI;
    public final C1324720kZq LLJJIJIIJIL;
    public final View LLJJIJIL;

    public static Long L5() {
        Object next;
        C953610avH.LJJI.getClass();
        String str = C953610avH.LJJII;
        if (str == null) {
            return null;
        }
        Iterator it2 = ((ArrayList) C953760avW.LIZIZ.LIZ().LIZLLL(3, str)).iterator();
        if (it2.hasNext()) {
            next = it2.next();
            if (it2.hasNext()) {
                long j = ((C953770avX) next).LIZJ;
                do {
                    Object next2 = it2.next();
                    long j2 = ((C953770avX) next2).LIZJ;
                    if (j < j2) {
                        next = next2;
                        j = j2;
                    }
                } while (it2.hasNext());
            }
        } else {
            next = null;
        }
        C953770avX c953770avX = (C953770avX) next;
        if (c953770avX != null) {
            return c953770avX.LJIIL;
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x004f A[PHI: r1
      0x004f: PHI (r1v21 java.lang.String) = (r1v19 java.lang.String), (r1v22 java.lang.String) binds: [B:29:0x004d, B:27:0x004a] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void N5(X.C953550avB r12) {
        /*
            Method dump skipped, instruction units count: 660
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C953500av6.N5(X.0avB):void");
    }

    @Override // X.AbstractC960440b6I
    public final /* bridge */ /* synthetic */ void I5(int i, Object obj) {
        N5((C953550avB) obj);
    }

    public C953500av6(View view, Context context, InterfaceC953490av5 interfaceC953490av5, EnumC952890au7 enumC952890au7, HashSet<Long> hashSet) {
        super(view);
        this.LL = context;
        this.LLILLJJLI = interfaceC953490av5;
        this.LLILLL = enumC952890au7;
        this.LLILZ = hashSet;
        this.LLILZIL = (C1324720kZq) view.findViewById(R.id.xgh);
        this.LLILZLL = (C16F5) view.findViewById(R.id.xgq);
        this.LLIZ = (C16F5) view.findViewById(R.id.xgo);
        this.LLIZLLLIL = view.findViewById(R.id.xgi);
        this.LLJ = (C197039127h) view.findViewById(R.id.xgn);
        this.LLJI = view.findViewById(R.id.xh8);
        this.LLJIJIL = C292401Bi.LIZ(AFwS203S0000000_15.get$arr$(20));
        this.LLJILJIL = view.findViewById(R.id.xgp);
        this.LLJILJILJ = (C16F5) view.findViewById(R.id.xgm);
        this.LLJILLL = (TuxIconView) view.findViewById(R.id.xgr);
        this.LLJJ = (C16F5) view.findViewById(R.id.xgs);
        this.LLJJI = (TuxIconView) view.findViewById(R.id.xgj);
        this.LLJJIII = (C16F5) view.findViewById(R.id.xgk);
        this.LLJJIJI = view.findViewById(R.id.xgg);
        this.LLJJIJIIJIL = (C1324720kZq) view.findViewById(R.id.xgf);
        this.LLJJIJIL = view.findViewById(R.id.xgl);
    }
}
