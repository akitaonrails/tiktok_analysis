package X;

import com.ss.android.ugc.aweme.compliance.api.services.statemachine.UserStateHandler;
import com.ss.android.ugc.aweme.compliance.business.statemachine.GatekeeperUserStateMachineHandler;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.profile.model.User;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.Intrinsics;
import org.greenrobot.eventbus.ThreadMode;

/* JADX INFO: renamed from: X.0ztK, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C1913400ztK {
    public static final C1913400ztK LIZ = new C1913400ztK();
    public static final AtomicBoolean LIZIZ = new AtomicBoolean(false);
    public static volatile String LIZJ;

    @C14EU(threadMode = ThreadMode.MAIN)
    public final void onAccountSwitchSuccessEvent(C1436005ji c1436005ji) {
        Object next;
        GatekeeperUserStateMachineHandler gatekeeperUserStateMachineHandler;
        LIZIZ.set(true);
        User curUser = ((AbstractC848400XPy) C0XQ7.LJFF()).getCurUser();
        if (curUser == null) {
            return;
        }
        LIZJ = curUser.getUid();
        Iterable services = ServiceManager.get().getServices(UserStateHandler.class);
        if (services == null) {
            services = C13BV.INSTANCE;
        }
        Iterator it2 = services.iterator();
        do {
            next = null;
            if (!it2.hasNext()) {
                break;
            } else {
                next = it2.next();
            }
        } while (!Intrinsics.LJFF(((UserStateHandler) next).key(), "gatekeeper_user_state_handler"));
        if ((next instanceof GatekeeperUserStateMachineHandler) && (gatekeeperUserStateMachineHandler = (GatekeeperUserStateMachineHandler) next) != null) {
            GatekeeperUserStateMachineHandler.LJII(gatekeeperUserStateMachineHandler, curUser, false, 4);
        }
    }

    @C14EU(threadMode = ThreadMode.MAIN)
    public final void onAfterLoginOrSwitchRestartEvent(C1913260zt6 c1913260zt6) {
        Object next;
        GatekeeperUserStateMachineHandler gatekeeperUserStateMachineHandler;
        LIZIZ.set(true);
        User curUser = ((AbstractC848400XPy) C0XQ7.LJFF()).getCurUser();
        if (curUser == null || Intrinsics.LJFF(curUser.getUid(), LIZJ)) {
            return;
        }
        LIZJ = curUser.getUid();
        Iterable services = ServiceManager.get().getServices(UserStateHandler.class);
        if (services == null) {
            services = C13BV.INSTANCE;
        }
        Iterator it2 = services.iterator();
        do {
            next = null;
            if (!it2.hasNext()) {
                break;
            } else {
                next = it2.next();
            }
        } while (!Intrinsics.LJFF(((UserStateHandler) next).key(), "gatekeeper_user_state_handler"));
        if ((next instanceof GatekeeperUserStateMachineHandler) && (gatekeeperUserStateMachineHandler = (GatekeeperUserStateMachineHandler) next) != null) {
            GatekeeperUserStateMachineHandler.LJII(gatekeeperUserStateMachineHandler, curUser, false, 6);
        }
    }
}
