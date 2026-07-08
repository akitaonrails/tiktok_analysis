package X;

import com.ss.android.ugc.aweme.tako.network.TakoRecoveryContext;
import com.ss.android.ugc.aweme.tako.network.TakoRecoveryTask;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0Coj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C325070Coj implements TakoRecoveryTask {
    public static final C325070Coj LIZ = new C325070Coj();
    public static volatile Function1<? super InterfaceC1364105Vn<? super Unit>, ? extends Object> LIZIZ;

    @Override // com.ss.android.ugc.aweme.tako.network.TakoRecoveryTask
    public final String getId() {
        return "middle_page_sug";
    }

    @Override // com.ss.android.ugc.aweme.tako.network.TakoRecoveryTask
    public final int getPriority() {
        return 1;
    }

    @Override // com.ss.android.ugc.aweme.tako.network.TakoRecoveryTask
    public final boolean onlyWhenVisible() {
        return false;
    }

    @Override // com.ss.android.ugc.aweme.tako.network.TakoRecoveryTask
    public final Object onNetworkRecovered(TakoRecoveryContext takoRecoveryContext, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        if (LIZIZ != null) {
            Function1<? super InterfaceC1364105Vn<? super Unit>, ? extends Object> function1 = LIZIZ;
            if (function1 != null) {
                Object objInvoke = function1.invoke(interfaceC1364105Vn);
                if (objInvoke == C099R.LJFF()) {
                    return objInvoke;
                }
                return Unit.LIZ;
            }
            return Unit.LIZ;
        }
        return Unit.LIZ;
    }
}
