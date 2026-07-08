package X;

import com.bytedance.android.livesdk.userservice.UserService;
import kotlin.Unit;

/* JADX INFO: renamed from: X.0xMs, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1816400xMs extends AbstractC233200vC {
    public final void LIZIZ(C1816270xMf c1816270xMf) {
        InterfaceC497601wk interfaceC497601wk = c1816270xMf.LIZLLL;
        C1DFH c1dfh = C0PEM.LIZ;
        C23250099c.LIZLLL(interfaceC497601wk, C2107308Nj.LIZ, null, new C1816420xMu(this, c1816270xMf, null), 2);
    }

    @Override // X.AbstractC233200vC
    public final Object LIZ(C1816270xMf c1816270xMf, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) throws Throwable {
        Object objLJI = C23250099c.LJI(interfaceC1364105Vn, C0PEM.LIZJ, new C1816470xMz(this, c1816270xMf, null));
        if (objLJI == C099R.LJFF()) {
            return objLJI;
        }
        return Unit.LIZ;
    }

    public static void LIZJ(String str, String str2, String str3) {
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_decoration_popup");
        c474500IjALIZ.LJJII(Long.valueOf(UserService.getInstance().user().getCurrentUserId()), "anchor_id");
        c474500IjALIZ.LJJII(str, "decoration_entrance");
        c474500IjALIZ.LJJII("click", "action_type");
        c474500IjALIZ.LJJII("smbReview", "popup_scene");
        c474500IjALIZ.LJJII(str2, "click_position");
        c474500IjALIZ.LJJII(str3, "block_reason");
        c474500IjALIZ.LIZ();
    }
}
