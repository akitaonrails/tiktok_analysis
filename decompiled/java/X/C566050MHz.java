package X;

import com.bytedance.ies.abmock.SettingsManager;

/* JADX INFO: renamed from: X.0MHz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C566050MHz extends C1449640npK {
    public static final String LJIIZILJ = new C0VSJ(C0CHQ.LIZ.getFilesDir(), "sticker_1_0/3d/resources").getPath();

    public static long LIZIZ() {
        SettingsManager.LIZLLL().getClass();
        long jLJFF = SettingsManager.LJFF("video_duration_limit_ms", 1000L);
        if (jLJFF < 1000 || jLJFF >= 15000) {
            return 1000L;
        }
        return jLJFF;
    }
}
