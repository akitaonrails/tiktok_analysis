package X;

import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleRegistry;
import com.bytedance.android.live.liveinteract.multiguestv3.main.sharerevnue.ISharedRevenueAbility;
import com.bytedance.ies.sdk.datachannel.DataChannel;

/* JADX INFO: renamed from: X.0aYD, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C939310aYD implements LifecycleOwner {
    public final DataChannel LL;
    public final LifecycleRegistry LLILLJJLI = new LifecycleRegistry(this);
    public ISharedRevenueAbility LLILLL;

    @Override // androidx.lifecycle.LifecycleOwner
    public final Lifecycle getLifecycle() {
        return this.LLILLJJLI;
    }

    public C939310aYD(DataChannel dataChannel) {
        this.LL = dataChannel;
    }
}
