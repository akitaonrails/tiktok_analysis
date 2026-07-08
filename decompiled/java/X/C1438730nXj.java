package X;

import com.ss.android.ugc.aweme.creative.model.music.AVMusic;

/* JADX INFO: renamed from: X.0nXj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1438730nXj {
    public static String LIZ(AVMusic aVMusic) {
        String mid;
        if (aVMusic != null && (mid = aVMusic.getMid()) != null) {
            return mid;
        }
        return "";
    }

    public static String LIZIZ(AVMusic aVMusic) {
        String imprId;
        if (aVMusic != null && aVMusic.getLogPb() != null && (imprId = aVMusic.getLogPb().getImprId()) != null) {
            return imprId;
        }
        return "";
    }
}
