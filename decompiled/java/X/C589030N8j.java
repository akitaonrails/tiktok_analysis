package X;

import X.C2022907wB;
import X.C2264471DkD;
import X.C584230Mvl;
import X.C589000N8g;
import X.C589080N8o;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;
import com.ss.android.ugc.aweme.commercialize.ams.context.MeasurementContext;
import com.ss.android.ugc.aweme.commercialize.feed.CommerceVideoDelegateKt;
import com.ss.android.ugc.aweme.commercialize.feed.CommerceVideoDelegateKt$exposureSourceLifecycleEventObserver$2$1;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS553S0100000_9;

/* JADX INFO: renamed from: X.0N8j, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C589030N8j extends C09AY implements Function0<CommerceVideoDelegateKt$exposureSourceLifecycleEventObserver$2$1> {
    public final /* synthetic */ CommerceVideoDelegateKt LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C589030N8j(CommerceVideoDelegateKt commerceVideoDelegateKt) {
        super(0);
        this.LL = commerceVideoDelegateKt;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [com.ss.android.ugc.aweme.commercialize.feed.CommerceVideoDelegateKt$exposureSourceLifecycleEventObserver$2$1] */
    @Override // kotlin.jvm.functions.Function0
    public final CommerceVideoDelegateKt$exposureSourceLifecycleEventObserver$2$1 invoke() {
        final CommerceVideoDelegateKt commerceVideoDelegateKt = this.LL;
        return new LifecycleEventObserver() { // from class: com.ss.android.ugc.aweme.commercialize.feed.CommerceVideoDelegateKt$exposureSourceLifecycleEventObserver$2$1
            @Override // androidx.lifecycle.LifecycleEventObserver
            public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
                int i = C2022907wB.LIZ[event.ordinal()];
                if (i != 1) {
                    if (i == 2) {
                        if (C2264471DkD.LIZLLL(commerceVideoDelegateKt.exposureSourceDelegate.LIZJ)) {
                            C589080N8o.LJ(this, null, new AwS553S0100000_9(commerceVideoDelegateKt, 73));
                            MeasurementContext.LIZ.getClass();
                            C584230Mvl.LIZ().LIZJ(commerceVideoDelegateKt.exposureSourceDelegate.LIZLLL);
                        }
                        commerceVideoDelegateKt.fragment.getLifecycle().removeObserver(this);
                        return;
                    }
                    return;
                }
                if (!C2264471DkD.LIZLLL(commerceVideoDelegateKt.exposureSourceDelegate.LIZJ)) {
                    return;
                }
                C589080N8o.LJ(this, null, new C589000N8g(commerceVideoDelegateKt));
                MeasurementContext.LIZ.getClass();
                C584230Mvl.LIZ().LJIIIZ(commerceVideoDelegateKt.LLLLIILL());
            }
        };
    }
}
