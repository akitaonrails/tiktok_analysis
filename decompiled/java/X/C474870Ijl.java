package X;

import com.bytedance.android.livesdk.livesetting.watchlive.LiveSkylightNearByEntranceSetting;

/* JADX INFO: renamed from: X.0Ijl, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C474870Ijl implements InterfaceC474860Ijk {
    public static final C474870Ijl LIZ = new C474870Ijl();
    public static final int LIZIZ = LiveSkylightNearByEntranceSetting.nearbyRejectLocationMaxTimes();

    public static final void LIZ() {
        C20337914i1<Integer> c20337914i1 = InterfaceC1106030et7.q4;
        if (c20337914i1.LIZIZ().intValue() >= LIZIZ) {
            return;
        }
        c20337914i1.LJFF(Integer.valueOf(c20337914i1.LIZIZ().intValue() + 1));
    }
}
