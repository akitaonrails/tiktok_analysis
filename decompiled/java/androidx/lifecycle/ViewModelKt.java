package androidx.lifecycle;

import X.C0PEM;
import X.C1284660jXE;
import X.C128X;
import X.C197058128a;
import X.C1DFH;
import X.C2107308Nj;
import X.C2296908zH;
import X.C23271099x;
import X.InterfaceC497601wk;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import kotlin.coroutines.CoroutineContext;

/* JADX INFO: loaded from: classes30.dex */
public final class ViewModelKt {
    public static final C128X VIEW_MODEL_SCOPE_LOCK = new C128X();

    public static final InterfaceC497601wk getViewModelScope(ViewModel viewModel) {
        C197058128a c197058128a;
        CoroutineContext coroutineContextLLIILII;
        synchronized (VIEW_MODEL_SCOPE_LOCK) {
            try {
                c197058128a = (C197058128a) viewModel.getCloseable("androidx.lifecycle.viewmodel.internal.ViewModelCoroutineScope.JOB_KEY");
                if (c197058128a == null) {
                    try {
                        C1DFH c1dfh = C0PEM.LIZ;
                        coroutineContextLLIILII = C2107308Nj.LIZ.LLIILII();
                    } catch (C1284660jXE e) {
                        TryCatchGuardChecker.doCheck(e);
                        coroutineContextLLIILII = C23271099x.INSTANCE;
                    } catch (IllegalStateException e2) {
                        TryCatchGuardChecker.doCheck(e2);
                        coroutineContextLLIILII = C23271099x.INSTANCE;
                    }
                    c197058128a = new C197058128a(coroutineContextLLIILII.plus(C2296908zH.LIZ()));
                    viewModel.addCloseable("androidx.lifecycle.viewmodel.internal.ViewModelCoroutineScope.JOB_KEY", c197058128a);
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        return c197058128a;
    }
}
