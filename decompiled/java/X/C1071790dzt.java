package X;

import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.IAccountUserService;

/* JADX INFO: renamed from: X.0dzt, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1071790dzt implements InterfaceC1070270dxR {
    public static String LIZIZ;
    public static C1071790dzt LIZJ;
    public final Keva LIZ;

    @Override // X.InterfaceC1070270dxR
    public final void LIZIZ() {
        this.LIZ.erase("after_login_permission_pop_up");
    }

    @Override // X.InterfaceC1070270dxR
    public final boolean LIZJ() {
        return this.LIZ.getBoolean("after_login_permission_pop_up", false);
    }

    @Override // X.InterfaceC1070270dxR
    public final void LJ() {
        this.LIZ.storeLong("contact_did_pop_up_time", System.currentTimeMillis());
    }

    static {
        IAccountUserService iAccountUserServiceLJFF = C0XQ7.LJFF();
        LIZIZ = iAccountUserServiceLJFF != null ? ((AbstractC848400XPy) iAccountUserServiceLJFF).getCurUserId() : null;
    }

    public C1071790dzt() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("permission_dialog");
        sbLIZ.append(LIZIZ);
        this.LIZ = Keva.getRepo(C2188811AlT.LIZIZ(sbLIZ));
    }

    @Override // X.InterfaceC1070270dxR
    public final void LIZ(int i) {
        if (i != 1) {
            if (i == 2) {
                this.LIZ.storeBoolean("finish_facebook_permission_process", true);
            }
        } else {
            this.LIZ.storeBoolean("finish_contact_permission_process", true);
        }
        if (this.LIZ.getBoolean("finish_facebook_permission_process", false) && this.LIZ.getBoolean("finish_contact_permission_process", false)) {
            this.LIZ.storeBoolean("has_go_through_process", true);
        }
    }

    @Override // X.InterfaceC1070270dxR
    public final void LIZLLL(int i, long j) {
        if (i != 1) {
            if (i == 2) {
                this.LIZ.storeLong("sync_off_facebook_time", j);
                return;
            }
            return;
        }
        this.LIZ.storeLong("sync_off_contact_time", j);
    }
}
