package X;

import com.bytedance.android.livesdk.livesetting.roomfunction.LiveMtMockLandscapeSetting;

/* JADX INFO: renamed from: X.0IMR, reason: invalid class name */
/* JADX INFO: loaded from: classes8.dex */
public final class C0IMR {
    public final boolean LIZ;
    public final int LIZIZ;

    public final boolean LIZ() {
        if (LiveMtMockLandscapeSetting.INSTANCE.getValue()) {
            return true;
        }
        return this.LIZ;
    }

    public C0IMR(boolean z, int i) {
        this.LIZ = z;
        this.LIZIZ = i;
    }
}
