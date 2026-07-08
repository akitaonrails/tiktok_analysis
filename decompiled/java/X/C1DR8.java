package X;

import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.als.FeatureAlsLogicContainer;

/* JADX INFO: renamed from: X.1DR8, reason: invalid class name */
/* JADX INFO: loaded from: classes36.dex */
public final class C1DR8 implements LifecycleOwner {
    public final /* synthetic */ FeatureAlsLogicContainer LL;

    @Override // androidx.lifecycle.LifecycleOwner
    public final Lifecycle getLifecycle() {
        return this.LL.LLJIJIL;
    }

    public C1DR8(FeatureAlsLogicContainer featureAlsLogicContainer) {
        this.LL = featureAlsLogicContainer;
    }
}
