package X;

import androidx.lifecycle.LifecycleObserver;
import androidx.lifecycle.LifecycleRegistry;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.10mq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class C19348610mq extends C09AY implements Function0<Unit> {
    public final /* synthetic */ LifecycleRegistry LL;
    public final /* synthetic */ LifecycleObserver LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C19348610mq(LifecycleRegistry lifecycleRegistry, LifecycleObserver lifecycleObserver) {
        super(0);
        this.LL = lifecycleRegistry;
        this.LLILLJJLI = lifecycleObserver;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        this.LL.addObserver(this.LLILLJJLI);
        return Unit.LIZ;
    }
}
