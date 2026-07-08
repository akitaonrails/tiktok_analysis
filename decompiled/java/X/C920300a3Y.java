package X;

import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleRegistry;
import com.bytedance.ies.sdk.datachannel.DataChannel;

/* JADX INFO: renamed from: X.0a3Y, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C920300a3Y implements LifecycleOwner {
    public final DataChannel LL;
    public final LifecycleRegistry LLILLJJLI = new LifecycleRegistry(this);
    public final C11NJ LLILLL = new C11NJ();

    @Override // androidx.lifecycle.LifecycleOwner
    public final Lifecycle getLifecycle() {
        return this.LLILLJJLI;
    }

    public C920300a3Y(DataChannel dataChannel) {
        this.LL = dataChannel;
    }
}
