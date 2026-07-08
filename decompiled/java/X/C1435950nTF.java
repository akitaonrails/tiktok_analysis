package X;

import com.ss.android.vesdk.VEVideoEncodeSettings;

/* JADX INFO: renamed from: X.0nTF, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1435950nTF {
    public final VEVideoEncodeSettings LIZ;
    public final Throwable LIZIZ;

    public C1435950nTF(VEVideoEncodeSettings vEVideoEncodeSettings, Throwable th, int i) {
        vEVideoEncodeSettings = (i & 1) != 0 ? null : vEVideoEncodeSettings;
        th = (i & 2) != 0 ? null : th;
        this.LIZ = vEVideoEncodeSettings;
        this.LIZIZ = th;
    }
}
