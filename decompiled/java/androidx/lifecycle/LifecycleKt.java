package androidx.lifecycle;

import X.AbstractC1563340qmi;
import X.C09A1;
import X.C09IC;
import X.C0PEM;
import X.C1565730qqZ;
import X.C19EG;
import X.C1DFH;
import X.C2107308Nj;
import X.C2296908zH;
import X.C23119094b;
import X.EnumC682280QpW;
import X.InterfaceC346201Wa;
import android.content.Context;
import androidx.lifecycle.Lifecycle;
import kotlinx.coroutines.flow.b;

/* JADX INFO: loaded from: classes25.dex */
public final class LifecycleKt {
    public static final LifecycleCoroutineScope getCoroutineScope(Lifecycle lifecycle) {
        return androidx_lifecycle_LifecycleKt_com_ss_android_ugc_aweme_main_lancet_SAFTikTokLancet_getCoroutineScope(lifecycle);
    }

    public static final LifecycleCoroutineScope androidx_lifecycle_LifecycleKt__getCoroutineScope$___twin___(Lifecycle lifecycle) {
        LifecycleCoroutineScopeImpl lifecycleCoroutineScopeImpl;
        do {
            LifecycleCoroutineScope lifecycleCoroutineScope = (LifecycleCoroutineScope) lifecycle.getInternalScopeRef().get();
            if (lifecycleCoroutineScope != null) {
                return lifecycleCoroutineScope;
            }
            C23119094b c23119094bLIZ = C2296908zH.LIZ();
            C1DFH c1dfh = C0PEM.LIZ;
            lifecycleCoroutineScopeImpl = new LifecycleCoroutineScopeImpl(lifecycle, C09A1.LIZLLL(c23119094bLIZ, C2107308Nj.LIZ.LLIILII()));
        } while (!lifecycle.getInternalScopeRef().compareAndSet(null, lifecycleCoroutineScopeImpl));
        lifecycleCoroutineScopeImpl.register();
        return lifecycleCoroutineScopeImpl;
    }

    public static LifecycleCoroutineScope androidx_lifecycle_LifecycleKt_com_ss_android_ugc_aweme_main_lancet_SAFTikTokLancet_getCoroutineScope(Lifecycle lifecycle) {
        Context context;
        Integer numLIZ;
        if (lifecycle instanceof AbstractC1563340qmi) {
            AbstractC1563340qmi abstractC1563340qmi = (AbstractC1563340qmi) lifecycle;
            EnumC682280QpW enumC682280QpW = EnumC682280QpW.GET_CURRENT_STATE;
            if (abstractC1563340qmi.LJI(enumC682280QpW)) {
                Object obj = abstractC1563340qmi.LL;
                if ((obj instanceof C19EG) && (numLIZ = C1565730qqZ.LIZ(enumC682280QpW.getValue(), (context = (Context) obj))) != null) {
                    LifecycleCoroutineScope lifecycleCoroutineScopeAndroidx_lifecycle_LifecycleKt__getCoroutineScope$___twin___ = androidx_lifecycle_LifecycleKt__getCoroutineScope$___twin___(lifecycle);
                    C1565730qqZ.LIZIZ(numLIZ.intValue(), context);
                    return lifecycleCoroutineScopeAndroidx_lifecycle_LifecycleKt__getCoroutineScope$___twin___;
                }
            }
        }
        return androidx_lifecycle_LifecycleKt__getCoroutineScope$___twin___(lifecycle);
    }

    public static final InterfaceC346201Wa<Lifecycle.Event> getEventFlow(Lifecycle lifecycle) {
        b bVarLJ = C09IC.LJ(new LifecycleKt$eventFlow$1(lifecycle, null));
        C1DFH c1dfh = C0PEM.LIZ;
        return C09IC.LJIL(bVarLJ, C2107308Nj.LIZ.LLIILII());
    }
}
