package X;

import androidx.lifecycle.LifecycleObserver;
import androidx.lifecycle.LifecycleOwner;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0PIi, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C642580PIi extends C09AY implements Function0<Unit> {
    public final /* synthetic */ LifecycleOwner LL;
    public final /* synthetic */ LifecycleObserver LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C642580PIi(LifecycleOwner lifecycleOwner, LifecycleObserver lifecycleObserver) {
        super(0);
        this.LL = lifecycleOwner;
        this.LLILLJJLI = lifecycleObserver;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        ((C19FO) this.LL).getLifecycle().addObserver(this.LLILLJJLI);
        return Unit.LIZ;
    }
}
