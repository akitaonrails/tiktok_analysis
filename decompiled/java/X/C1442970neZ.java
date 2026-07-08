package X;

import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0neZ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1442970neZ extends C09AY implements Function0<Unit> {
    public final /* synthetic */ C19EG LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1442970neZ(C19EG c19eg) {
        super(0);
        this.LL = c19eg;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        LifecycleOwner lifecycleOwnerLIZIZ = C0SY5.LIZIZ(this.LL);
        if (lifecycleOwnerLIZIZ != null) {
            final C19EG c19eg = this.LL;
            C0R1H.LIZIZ(lifecycleOwnerLIZIZ, new LifecycleEventObserver() { // from class: com.ss.android.ugc.aweme.shortvideo.ui.publishprogress.PublishProgressDialogAddHelper$registerProgressCallback$2$1
                @Override // androidx.lifecycle.LifecycleEventObserver
                public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
                    if (event == Lifecycle.Event.ON_DESTROY) {
                        PublishProgressDialogAddHelper.LJII.remove(c19eg);
                    }
                }
            });
        }
        return Unit.LIZ;
    }
}
