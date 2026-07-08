package X;

import java.util.List;

/* JADX INFO: renamed from: X.0o3K, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1458320o3K {
    public static final List<String> LIZ = C1697810uHb.LJIILJJIL("prop_music_bind", "prop_music_soft_bind", "prop_music_recommended", "auto_cut_music_recommend", "single_song", "sync_page_recommend", "video_capsule_recommend", "slideshow_rec", "library_auto", "prop_auto", "effect_music_recommend", "mix_sync_page_recommend", "mix_template_music_recommend");

    public static boolean LIZIZ(String str) {
        if (str != null && str.length() != 0 && !LIZ.contains(str)) {
            return false;
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x00a4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static float LIZ(com.ss.android.ugc.aweme.creative.model.music.AVMusic r6, com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r7, boolean r8) {
        /*
            boolean r0 = X.C1458350o3N.LIZ()
            r4 = 0
            r5 = 1065353216(0x3f800000, float:1.0)
            if (r0 == 0) goto La4
            if (r8 == 0) goto L11
            boolean r0 = X.C1458330o3L.LIZ()
            if (r0 == 0) goto La4
        L11:
            if (r6 == 0) goto La1
            java.lang.String r1 = r6.getMusicVolumeInfo()
        L17:
            float r0 = X.C1458340o3M.LIZ
            float r2 = X.C1485020okO.LJFF(r1)
            float r1 = X.C1458340o3M.LIZ
            java.lang.Float r0 = java.lang.Float.valueOf(r2)
            boolean r0 = X.C1485020okO.LIZLLL(r0)
            if (r0 == 0) goto L9f
            java.lang.Float r0 = java.lang.Float.valueOf(r1)
            boolean r0 = X.C1485020okO.LIZLLL(r0)
            if (r0 == 0) goto L9f
            r0 = 1103101952(0x41c00000, float:24.0)
            float r1 = r1 - r2
            float r1 = java.lang.Math.min(r0, r1)
            r0 = 1101004800(0x41a00000, float:20.0)
            float r1 = r1 / r0
            double r2 = (double) r1
            r0 = 4621819117588971520(0x4024000000000000, double:10.0)
            double r0 = java.lang.Math.pow(r0, r2)
            float r2 = (float) r0
        L45:
            java.lang.Float r0 = java.lang.Float.valueOf(r2)
            boolean r0 = X.C1485020okO.LIZLLL(r0)
            if (r0 == 0) goto La4
            if (r6 == 0) goto L57
            r6.getMusicVolumeInfo()
            r6.getMusicId()
        L57:
            boolean r0 = X.C1458360o3O.LIZ()
            if (r0 == 0) goto L92
            boolean r0 = r7.isDuet()
            if (r0 != 0) goto L92
            if (r6 == 0) goto L69
            java.lang.String r4 = r6.getMusicId()
        L69:
            com.ss.android.ugc.aweme.creative.model.CreativeModel r0 = r7.creativeModel
            com.ss.android.ugc.aweme.creative.model.MusicVolumeInfoModel r0 = r0.musicVolumeInfoModel
            java.lang.String r0 = r0.musicId
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r4, r0)
            if (r0 == 0) goto L92
            com.ss.android.ugc.aweme.creative.model.CreativeModel r0 = r7.creativeModel
            com.ss.android.ugc.aweme.creative.model.MusicVolumeInfoModel r0 = r0.musicVolumeInfoModel
            java.lang.String r0 = r0.musicVolumeInfo
            float r1 = X.C1485020okO.LIZIZ(r0)
            java.lang.Float r0 = java.lang.Float.valueOf(r1)
            boolean r0 = X.C1485020okO.LIZLLL(r0)
            if (r0 == 0) goto L92
            if (r6 == 0) goto L91
            r6.getMusicVolumeInfo()
            r6.getMusicId()
        L91:
            r2 = r1
        L92:
            int r0 = (r2 > r5 ? 1 : (r2 == r5 ? 0 : -1))
            if (r0 != 0) goto L9e
            if (r6 == 0) goto L9e
            r6.getMusicVolumeInfo()
            r6.getMusicId()
        L9e:
            return r2
        L9f:
            r2 = 1
            goto L45
        La1:
            r1 = r4
            goto L17
        La4:
            r2 = 1065353216(0x3f800000, float:1.0)
            goto L57
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1458320o3K.LIZ(com.ss.android.ugc.aweme.creative.model.music.AVMusic, com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel, boolean):float");
    }
}
