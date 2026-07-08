package X;

import android.media.MediaCodecInfo;

/* JADX INFO: renamed from: X.0jXF, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public class C1284670jXF implements InterfaceC1284570jX5 {
    public final String LIZ;

    public C1284670jXF(String str) {
        this.LIZ = str;
    }

    @Override // X.InterfaceC1284570jX5
    public final boolean LIZ(MediaCodecInfo mediaCodecInfo) {
        for (String str : mediaCodecInfo.getSupportedTypes()) {
            if (str.equalsIgnoreCase(this.LIZ)) {
                return true;
            }
        }
        return false;
    }
}
