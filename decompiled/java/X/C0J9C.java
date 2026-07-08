package X;

import com.bytedance.android.livesdk.livesetting.other.FollowLiveBubbleConfig;
import java.lang.ref.WeakReference;

/* JADX INFO: renamed from: X.0J9C, reason: invalid class name */
/* JADX INFO: loaded from: classes8.dex */
public final class C0J9C implements InterfaceC19244510Qp {
    public final FollowLiveBubbleConfig LIZ;
    public final WeakReference<C0J6Q> LIZIZ;
    public final boolean LIZJ;

    @Override // X.InterfaceC19244510Qp
    public final int getScene() {
        return EnumC19243910Qj.FEED.getValue();
    }

    @Override // X.InterfaceC19244510Qp
    public final int getType() {
        return EnumC19243810Qi.FOLLOW_LIVE.getValue();
    }

    public C0J9C(FollowLiveBubbleConfig followLiveBubbleConfig, WeakReference weakReference, boolean z) {
        this.LIZ = followLiveBubbleConfig;
        this.LIZIZ = weakReference;
        this.LIZJ = z;
    }
}
