package X;

import com.ss.android.ugc.aweme.IAccountService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0qwA, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1569200qwA {
    public static final boolean LIZ() {
        return ((IAccountService) ServiceManager.get().getService(IAccountService.class)).LJIIJ().isLogin();
    }

    public static final void LIZIZ(Function0<Unit> function0, Function0<Unit> function02) {
        if (LIZ()) {
            if (function0 != null) {
                function0.invoke();
            }
        } else {
            if (function02 == null) {
                return;
            }
            function02.invoke();
        }
    }
}
