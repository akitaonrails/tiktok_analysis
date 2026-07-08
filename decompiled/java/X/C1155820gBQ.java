package X;

import com.bytedance.android.livesdk.livesetting.linkmic.LinkMicFeedSeiExpirationTimeSetting;

/* JADX INFO: renamed from: X.0gBQ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1155820gBQ {
    public final C945320ahu LIZ;
    public final long LIZIZ;

    public final boolean LIZ() {
        return System.currentTimeMillis() - this.LIZIZ <= ((long) LinkMicFeedSeiExpirationTimeSetting.INSTANCE.getValue());
    }

    public C1155820gBQ(C945320ahu c945320ahu, long j) {
        this.LIZ = c945320ahu;
        this.LIZIZ = j;
    }
}
