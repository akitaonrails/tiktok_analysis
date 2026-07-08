package X;

import Y.ARunnableS76S0200000_7;
import android.app.Activity;
import android.content.Context;
import android.net.ConnectivityManager;
import androidx.lifecycle.ViewModelKt;
import com.ss.android.ugc.aweme.network.NetworkConnectivityUtil$createLifeCycleObserver$1;
import com.ss.android.ugc.aweme.portrait.tab.AIPortraitTabFragment;
import com.ss.android.ugc.aweme.portrait.tab.AIPortraitTabViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0MGY, reason: invalid class name */
/* JADX INFO: loaded from: classes9.dex */
@C09DV(c = "com.ss.android.ugc.aweme.portrait.tab.AIPortraitTabFragment$onViewCreated$1$1", f = "AIPortraitTabFragment.kt", l = {}, m = "invokeSuspend")
public final class C0MGY extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ AIPortraitTabFragment LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0MGY(AIPortraitTabFragment aIPortraitTabFragment, InterfaceC1364105Vn<? super C0MGY> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = aIPortraitTabFragment;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C0MGY(this.LL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        Activity activityLIZ;
        ConnectivityManager connectivityManager;
        C1C7U.LIZ("AIPortraitTabFragment@e881.onViewCreated$1$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        final AIPortraitTabFragment aIPortraitTabFragment = this.LL;
        Context context = aIPortraitTabFragment.getContext();
        if (context != null) {
            Object objH2 = C786410Ut5.H2(context, "connectivity");
            if ((objH2 instanceof ConnectivityManager) && (connectivityManager = (ConnectivityManager) objH2) != null) {
                aIPortraitTabFragment.getLifecycle().addObserver(new NetworkConnectivityUtil$createLifeCycleObserver$1(connectivityManager, new InterfaceC565580MGe() { // from class: X.0MGZ
                    @Override // X.InterfaceC565580MGe
                    public final void LIZ(EnumC565560MGc enumC565560MGc) {
                        Activity activityLIZ2;
                        int i = C565540MGa.LIZ[enumC565560MGc.ordinal()];
                        if (i != 1) {
                            if (i == 2) {
                                C201955140j.LIZIZ("AIPortraitTabFragment", "Network unavailable");
                                AIPortraitTabFragment aIPortraitTabFragment2 = aIPortraitTabFragment;
                                if (!aIPortraitTabFragment2.LLJJIJIIJIL && (activityLIZ2 = C06MM.LIZ(aIPortraitTabFragment2.getContext())) != null) {
                                    aIPortraitTabFragment2.LLJJIJIIJIL = true;
                                    activityLIZ2.runOnUiThread(new ARunnableS76S0200000_7(activityLIZ2, aIPortraitTabFragment2, 67));
                                    return;
                                }
                                return;
                            }
                            throw new C1954807lC();
                        }
                        C201955140j.LIZIZ("AIPortraitTabFragment", "Network available");
                        AIPortraitTabFragment aIPortraitTabFragment3 = aIPortraitTabFragment;
                        aIPortraitTabFragment3.LLJJIJIIJIL = false;
                        AIPortraitTabViewModel aIPortraitTabViewModelPR = aIPortraitTabFragment3.PR();
                        if (!((C569820MWm) aIPortraitTabViewModelPR.LLJI.getValue()).LIZLLL) {
                            return;
                        }
                        AnonymousClass0956 anonymousClass0956 = aIPortraitTabViewModelPR.LLJILLL;
                        if (anonymousClass0956 != null && !anonymousClass0956.isCompleted()) {
                            return;
                        }
                        aIPortraitTabViewModelPR.LLJILLL = C23250099c.LIZLLL(ViewModelKt.getViewModelScope(aIPortraitTabViewModelPR), null, null, new C316290CaZ(aIPortraitTabViewModelPR, null), 3);
                    }
                }));
            }
            if (!C0XF1.LIZLLL(context) && !aIPortraitTabFragment.LLJJIJIIJIL && (activityLIZ = C06MM.LIZ(aIPortraitTabFragment.getContext())) != null) {
                aIPortraitTabFragment.LLJJIJIIJIL = true;
                activityLIZ.runOnUiThread(new ARunnableS76S0200000_7(activityLIZ, aIPortraitTabFragment, 67));
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("AIPortraitTabFragment@e881.onViewCreated$1$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
