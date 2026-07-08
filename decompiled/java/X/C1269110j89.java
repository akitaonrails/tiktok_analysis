package X;

import com.ss.ttlivestreamer.livestreamv2.sdkparams.LiveSdkSetting;

/* JADX INFO: renamed from: X.0j89, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1269110j89 {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [boolean, int] */
    public static final int LIZ(LiveSdkSetting liveSdkSetting, C1269140j8C c1269140j8C) {
        ?? r1 = c1269140j8C.LJ;
        int i = r1;
        if (c1269140j8C.LIZLLL) {
            i = r1 + 1;
        }
        int i2 = i;
        if (liveSdkSetting.sandboxParams.enableVideoIntercept) {
            i2 = i + 1;
        }
        int i3 = i2;
        if (c1269140j8C.LIZJ) {
            i3 = i2 + 1;
        }
        int i4 = i3;
        if (c1269140j8C.LIZIZ) {
            i4 = i3 + 1;
        }
        if (liveSdkSetting.LJI) {
            return i4 + 1;
        }
        return i4;
    }
}
