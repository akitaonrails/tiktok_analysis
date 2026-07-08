package X;

import com.ss.android.ugc.aweme.tako.network.TakoRecoveryContext;
import com.ss.android.ugc.aweme.tako.network.TakoRecoveryTask;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0Cof, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C325030Cof implements TakoRecoveryTask {
    public static final C325030Cof LIZ = new C325030Cof();
    public static volatile Function1<? super InterfaceC1364105Vn<? super Unit>, ? extends Object> LIZIZ;
    public static volatile boolean LIZJ;

    @Override // com.ss.android.ugc.aweme.tako.network.TakoRecoveryTask
    public final String getId() {
        return "drawer_sub_conv";
    }

    @Override // com.ss.android.ugc.aweme.tako.network.TakoRecoveryTask
    public final int getPriority() {
        return 2;
    }

    @Override // com.ss.android.ugc.aweme.tako.network.TakoRecoveryTask
    public final boolean onlyWhenVisible() {
        return false;
    }

    @Override // com.ss.android.ugc.aweme.tako.network.TakoRecoveryTask
    public final Object onNetworkRecovered(TakoRecoveryContext takoRecoveryContext, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        if (!LIZJ) {
            return Unit.LIZ;
        }
        Function1<? super InterfaceC1364105Vn<? super Unit>, ? extends Object> function1 = LIZIZ;
        if (function1 == null) {
            return Unit.LIZ;
        }
        Object objInvoke = function1.invoke(interfaceC1364105Vn);
        if (objInvoke == C099R.LJFF()) {
            return objInvoke;
        }
        return Unit.LIZ;
    }
}
