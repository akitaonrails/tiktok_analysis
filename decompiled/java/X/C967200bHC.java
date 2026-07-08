package X;

import com.bytedance.android.livesdk.comp.api.linkcore.model.LinkUser;
import com.bytedance.android.livesdk.livesetting.linkmic.LinkMicRustCohostPrepareStateFix;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0bHC, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C967200bHC extends C09AY implements Function0<Unit> {
    public final /* synthetic */ int LL;
    public final /* synthetic */ EnumC2231411CVf LLILLJJLI;
    public final /* synthetic */ C967130bH5 LLILLL;
    public final /* synthetic */ boolean LLILZ = false;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C967200bHC(int i, EnumC2231411CVf enumC2231411CVf, C967770bI7 c967770bI7) {
        super(0);
        this.LL = i;
        this.LLILLJJLI = enumC2231411CVf;
        this.LLILLL = c967770bI7;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onInnerUserListChange");
        sbLIZ.append(", listChangeType = ");
        sbLIZ.append(this.LL);
        sbLIZ.append(", source <");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append('>');
        C1304630k3R.LIZLLL(6, C2188811AlT.LIZIZ(sbLIZ), this.LLILLL.LIZJ);
        List<LinkUser> listLIZ = LIZ(false);
        List<LinkUser> listLIZ2 = LIZ(true);
        if (LinkMicRustCohostPrepareStateFix.INSTANCE.enable()) {
            Iterator<InterfaceC967450bHb> it2 = this.LLILLL.LJIJJLI.iterator();
            while (it2.hasNext()) {
                it2.next().LJIILLIIL(listLIZ, listLIZ2);
            }
        }
        LIZ(true);
        LIZ(true);
        LIZ(true);
        LIZ(true);
        LIZ(true);
        LIZ(true);
        LIZ(true);
        int i = this.LL;
        if (i == 0 && this.LLILZ) {
            this.LLILLL.LIZ(31);
        } else {
            this.LLILLL.LIZ(i);
        }
        return Unit.LIZ;
    }
}
