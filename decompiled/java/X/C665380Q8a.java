package X;

import X.C665430Q8f;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0Q8a, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C665380Q8a extends C09AY implements Function0<Unit> {
    public final /* synthetic */ Lifecycle LL;
    public final /* synthetic */ String LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C665380Q8a(Lifecycle lifecycle, String str) {
        super(0);
        this.LL = lifecycle;
        this.LLILLJJLI = str;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        final Lifecycle lifecycle = this.LL;
        final String str = this.LLILLJJLI;
        lifecycle.addObserver(new LifecycleEventObserver() { // from class: com.bytedance.provider.VScopeCacheManager$put$1$1$1
            @Override // androidx.lifecycle.LifecycleEventObserver
            public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
                if (event == Lifecycle.Event.ON_DESTROY) {
                    C665430Q8f.LIZ.remove(str);
                    lifecycle.removeObserver(this);
                }
            }
        });
        return Unit.LIZ;
    }
}
