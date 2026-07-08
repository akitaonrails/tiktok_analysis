package X;

import androidx.lifecycle.LifecycleOwner;
import java.lang.ref.WeakReference;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0JzT, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C510090JzT extends C09AY implements Function1<WeakReference<LifecycleOwner>, Boolean> {
    public final /* synthetic */ LifecycleOwner LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C510090JzT(LifecycleOwner lifecycleOwner) {
        super(1);
        this.LL = lifecycleOwner;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Boolean invoke(WeakReference<LifecycleOwner> weakReference) {
        return Boolean.valueOf(Intrinsics.LJFF(weakReference.get(), this.LL));
    }
}
