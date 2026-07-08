package X;

import com.ss.android.ugc.aweme.creative.model.music.AVMusic;
import com.ss.android.ugc.aweme.music.model.StickPointBeanUtil;
import com.ss.android.vesdk.clipparam.VEAlgorithmPath;

/* JADX INFO: renamed from: X.0nk9, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1446430nk9 {
    public C0E27 LIZ;
    public AVMusic LIZIZ;

    public static VEAlgorithmPath LIZ(VEAlgorithmPath vEAlgorithmPath) {
        String veBeatsPath;
        String downBeatsPath;
        String noStrengthBeatsPath;
        String manMadePath;
        String onlineBeatsPath;
        VEAlgorithmPath vEAlgorithmPath2 = new VEAlgorithmPath();
        Integer numValueOf = null;
        if (vEAlgorithmPath != null) {
            veBeatsPath = vEAlgorithmPath.getVeBeatsPath();
        } else {
            veBeatsPath = null;
        }
        vEAlgorithmPath2.setVeBeatsPath(veBeatsPath);
        if (vEAlgorithmPath != null) {
            downBeatsPath = vEAlgorithmPath.getDownBeatsPath();
        } else {
            downBeatsPath = null;
        }
        vEAlgorithmPath2.setDownBeatsPath(downBeatsPath);
        if (vEAlgorithmPath != null) {
            noStrengthBeatsPath = vEAlgorithmPath.getNoStrengthBeatsPath();
        } else {
            noStrengthBeatsPath = null;
        }
        vEAlgorithmPath2.setNoStrengthBeatsPath(noStrengthBeatsPath);
        if (vEAlgorithmPath != null) {
            manMadePath = vEAlgorithmPath.getManMadePath();
        } else {
            manMadePath = null;
        }
        vEAlgorithmPath2.setManMadePath(manMadePath);
        if (vEAlgorithmPath != null) {
            onlineBeatsPath = vEAlgorithmPath.getOnlineBeatsPath();
        } else {
            onlineBeatsPath = null;
        }
        vEAlgorithmPath2.setOnlineBeatsPath(onlineBeatsPath);
        if (vEAlgorithmPath != null) {
            numValueOf = Integer.valueOf(vEAlgorithmPath.getMode());
        }
        vEAlgorithmPath2.setMode(numValueOf.intValue());
        vEAlgorithmPath2.setType(vEAlgorithmPath.getType());
        return vEAlgorithmPath2;
    }

    public static VEAlgorithmPath LIZIZ(AVMusic aVMusic) {
        String defaultLocalPath;
        int i;
        aVMusic.getClass();
        boolean z = C1444820nhY.LIZ;
        if (aVMusic.getStickPointMusicAlg() == null) {
            defaultLocalPath = "";
        } else {
            defaultLocalPath = aVMusic.getStickPointMusicAlg().getDefaultLocalPath();
        }
        String veBeatsPath = aVMusic.getStickPointMusicAlg().getVeBeatsPath();
        String downBeatsPath = aVMusic.getStickPointMusicAlg().getDownBeatsPath();
        String noStrengthBeatsPath = aVMusic.getStickPointMusicAlg().getNoStrengthBeatsPath();
        String manModeBeatsPath = aVMusic.getStickPointMusicAlg().getManModeBeatsPath();
        if (!C2354709Kn.LIZIZ(veBeatsPath)) {
            veBeatsPath = null;
        }
        if (!C2354709Kn.LIZIZ(downBeatsPath)) {
            downBeatsPath = null;
        }
        if (!C2354709Kn.LIZIZ(noStrengthBeatsPath)) {
            noStrengthBeatsPath = null;
        }
        if (!C2354709Kn.LIZIZ(manModeBeatsPath)) {
            manModeBeatsPath = null;
        }
        if (StickPointBeanUtil.isSuccessivelyAlgType(aVMusic.getStickPointMusicAlg()) && !StickPointBeanUtil.existSuccessivelyAlgFile(aVMusic.getStickPointMusicAlg())) {
            aVMusic.getStickPointMusicAlg().setAlgType(VEAlgorithmPath.BEATES_FILE_DEFAULT);
        }
        VEAlgorithmPath vEAlgorithmPath = new VEAlgorithmPath();
        vEAlgorithmPath.setVeBeatsPath(veBeatsPath);
        vEAlgorithmPath.setDownBeatsPath(downBeatsPath);
        if (!StickPointBeanUtil.isSuccessivelyAlgType(aVMusic.getStickPointMusicAlg())) {
            if (C2354709Kn.LIZIZ(downBeatsPath)) {
                vEAlgorithmPath.setNoStrengthBeatsPath(null);
            } else {
                vEAlgorithmPath.setNoStrengthBeatsPath(noStrengthBeatsPath);
            }
        }
        vEAlgorithmPath.setManMadePath(manModeBeatsPath);
        vEAlgorithmPath.setOnlineBeatsPath(defaultLocalPath);
        vEAlgorithmPath.setType(aVMusic.getStickPointMusicAlg().getAlgType());
        if (StickPointBeanUtil.isSuccessivelyAlgType(aVMusic.getStickPointMusicAlg())) {
            i = VEAlgorithmPath.MODE_SUCCESSIVELY;
        } else {
            i = VEAlgorithmPath.INTMODE_ONSET;
        }
        vEAlgorithmPath.setMode(i);
        return vEAlgorithmPath;
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0127  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x01cd  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x01d3  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x01d9  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0207  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0209  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x020b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.C1441180nbg LIZJ(java.lang.String r23, com.ss.android.vesdk.clipparam.VEAlgorithmPath r24, int r25) {
        /*
            Method dump skipped, instruction units count: 621
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1446430nk9.LIZJ(java.lang.String, com.ss.android.vesdk.clipparam.VEAlgorithmPath, int):X.0nbg");
    }
}
