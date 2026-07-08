package X;

import com.ss.android.ugc.aweme.framework.services.IUserService;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.tools.draft.migratedraft.launch.MigrateDraftLegoTask;
import com.ss.android.ugc.aweme.unifiedauth.service.PopupInfoServiceImpl;
import com.ss.android.ugc.aweme.unifiedauthapi.service.IPopupInfoService;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0Di6, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public class C346440Di6 implements InterfaceC586170Myt {
    public final int $t;
    public Object l0;

    @Override // X.InterfaceC586170Myt
    public final void onAccountResult(int i, boolean z, int i2, User user) {
        switch (this.$t) {
            case 0:
                onAccountResult$0(this, i, z, i2, user);
                break;
            case 1:
                onAccountResult$1(this, i, z, i2, user);
                break;
            case 2:
                onAccountResult$2(this, i, z, i2, user);
                break;
        }
    }

    public C346440Di6(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final void onAccountResult$0(C346440Di6 c346440Di6, int i, boolean z, int i2, User user) {
        IUserService iUserService;
        String currentUserID;
        if (!z) {
            return;
        }
        if ((i != 1 && i != 2) || (iUserService = (IUserService) PluggableExtentionKt.pluggableSpi$default(IUserService.class, false, false, false, 14, null)) == null || (currentUserID = iUserService.getCurrentUserID()) == null) {
            return;
        }
        C308540C7o.LIZ.getClass();
        if (!C308540C7o.LIZ(currentUserID)) {
            return;
        }
        ((MigrateDraftLegoTask) c346440Di6.l0).getClass();
        MigrateDraftLegoTask.LIZ();
    }

    public static final void onAccountResult$1(C346440Di6 c346440Di6, int i, boolean z, int i2, User user) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onLogin(");
        sbLIZ.append(z);
        sbLIZ.append(", ");
        sbLIZ.append(i);
        sbLIZ.append(", ");
        sbLIZ.append(user);
        sbLIZ.append(')');
        C2188811AlT.LIZIZ(sbLIZ);
        C211000rc.LIZ("PopupInfoServiceImpl");
        if (z) {
            if (i != 1 && i != 2) {
                if (i == 3) {
                    C211000rc.LIZ("PopupInfoServiceImpl");
                    ((IPopupInfoService) ServiceManager.get().getService(IPopupInfoService.class)).LJIIJ(true);
                    return;
                }
                return;
            }
            C211000rc.LIZ("PopupInfoServiceImpl");
            ((PopupInfoServiceImpl) c346440Di6.l0).LJIIIZ();
            ((PopupInfoServiceImpl) c346440Di6.l0).LJII();
            ((PopupInfoServiceImpl) c346440Di6.l0).LJ();
            ((IPopupInfoService) ServiceManager.get().getService(IPopupInfoService.class)).LJIIJ(true);
        }
    }

    public static final void onAccountResult$2(C346440Di6 c346440Di6, int i, boolean z, int i2, User user) {
        if (!z) {
            return;
        }
        if (i != 2) {
            if (i == 3) {
                ((Function1) c346440Di6.l0).invoke(C0DCO.LOGOUT);
                return;
            }
            return;
        }
        ((Function1) c346440Di6.l0).invoke(C0DCO.ACCOUNT_SWITCHED);
    }
}
