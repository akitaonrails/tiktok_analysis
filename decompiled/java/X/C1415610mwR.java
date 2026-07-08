package X;

import com.ss.android.ugc.aweme.shortvideo.ScreenUtils;

/* JADX INFO: renamed from: X.0mwR, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1415610mwR {
    public static int LIZ = -1;
    public static int LIZIZ = -1;

    public static final int LIZ() {
        if (LIZIZ == -1) {
            LIZIZ = ScreenUtils.getFullScreenHeight(C0CHQ.LIZ);
        }
        return LIZIZ;
    }

    public static final int LIZIZ() {
        if (LIZ == -1) {
            LIZ = ScreenUtils.getScreenWidth(C0CHQ.LIZ);
        }
        return LIZ;
    }
}
