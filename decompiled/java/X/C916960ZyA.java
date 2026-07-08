package X;

import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleRegistry;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import kotlin.jvm.internal.AFwS203S0000000_15;
import kotlin.jvm.internal.AwS559S0100000_15;

/* JADX INFO: renamed from: X.0ZyA, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C916960ZyA implements LifecycleOwner {
    public final DataChannel LL;
    public final C01GW LLILLJJLI = C930540aK4.LJJIJIL(AFwS203S0000000_15.get$arr$(75));
    public final C01GW LLILLL = C452501pT.LIZIZ(new AwS559S0100000_15(this, 226));
    public final LifecycleRegistry LLILZ = new LifecycleRegistry(this);

    @Override // androidx.lifecycle.LifecycleOwner
    public final Lifecycle getLifecycle() {
        return this.LLILZ;
    }

    public C916960ZyA(DataChannel dataChannel) {
        this.LL = dataChannel;
    }
}
