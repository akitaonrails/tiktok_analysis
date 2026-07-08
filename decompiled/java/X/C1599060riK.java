package X;

import androidx.lifecycle.LifecycleOwner;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.inbox.skylight.plat.InboxSkylightListState;
import com.ss.android.ugc.aweme.inbox.skylight.plat.SkylightListViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS264S0000000_24;

/* JADX INFO: renamed from: X.0riK, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1599060riK {
    public static final C1599060riK LIZ = new C1599060riK();
    public static final C2369609Qg LIZIZ = new C2369609Qg("InboxSkylightLoadMore");
    public static volatile boolean LIZJ;
    public static volatile C0ZP4 LIZLLL;

    public final boolean LIZ(SkylightListViewModel skylightListViewModel, LifecycleOwner lifecycleOwner, String str, Function0<Unit> function0) {
        C2369609Qg c2369609Qg = LIZIZ;
        if (c2369609Qg.LIZIZ.LIZIZ() || !c2369609Qg.LIZIZ(skylightListViewModel, str, function0)) {
            return false;
        }
        if (LIZJ) {
            return true;
        }
        synchronized (this) {
            try {
                if (LIZJ) {
                    return true;
                }
                LIZJ = true;
                LIZLLL = AssemViewModel.asyncSubscribe$default(skylightListViewModel, new C2217381BqS() { // from class: X.0riT
                    @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
                    public final Object get(Object obj) {
                        return ((InboxSkylightListState) obj).getLoadMoreState();
                    }
                }, lifecycleOwner, C736820SvI.LIZLLL(), AFwS264S0000000_24.get$arr$(737), null, AFwS264S0000000_24.get$arr$(738), 16, null);
                return true;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }
}
