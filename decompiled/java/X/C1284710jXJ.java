package X;

import android.media.MediaCodecInfo;

/* JADX INFO: renamed from: X.0jXJ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public class C1284710jXJ implements InterfaceC1284570jX5 {
    @Override // X.InterfaceC1284570jX5
    public final boolean LIZ(MediaCodecInfo mediaCodecInfo) {
        if (!mediaCodecInfo.isEncoder()) {
            return true;
        }
        return false;
    }
}
