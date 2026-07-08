package X;

/* JADX INFO: renamed from: X.0nuD, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1452670nuD {
    public static final /* synthetic */ int LIZ = 0;

    /* JADX WARN: Removed duplicated region for block: B:19:0x0038  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int LIZ(com.ss.android.ugc.aweme.creative.model.music.AVMusic r3, float r4, int r5, int r6, int r7, com.ss.android.ugc.aweme.creative.model.music.MusicBuzModel r8) {
        /*
            r2 = 15000(0x3a98, float:2.102E-41)
            if (r3 == 0) goto L53
            boolean r0 = r3.isLocalMusic()
            if (r0 != 0) goto L22
            int r0 = r3.getShootDuration()
            if (r0 <= 0) goto L53
            int r0 = r3.getShootDuration()
            int r0 = r6 - r0
            int r1 = java.lang.Math.abs(r0)
            r0 = 1000(0x3e8, float:1.401E-42)
            if (r1 < r0) goto L22
            int r6 = r3.getShootDuration()
        L22:
            if (r6 > 0) goto L55
        L24:
            boolean r0 = X.C1399580mWa.LIZ()
            if (r0 != 0) goto L40
            boolean r0 = X.C1452500ntw.LIZ()
            if (r0 != 0) goto L40
            if (r3 == 0) goto L57
        L32:
            com.ss.android.ugc.aweme.music.model.FullSongDetail r0 = r3.getFullSongDetail()
            if (r0 == 0) goto L57
            float r0 = (float) r7
            float r0 = r0 * r4
            int r0 = (int) r0
            int r0 = java.lang.Math.min(r2, r0)
            return r0
        L40:
            if (r3 == 0) goto L57
            if (r8 == 0) goto L32
            boolean r1 = X.C1459090o4Z.LIZ(r3)
            r0 = 1
            if (r1 != r0) goto L32
            int r1 = r8.originalMusicEndFromFollowup
            int r0 = r8.originalMusicStartFromFollowup
            if (r1 <= r0) goto L32
            int r1 = r1 - r0
            return r1
        L53:
            r6 = 15000(0x3a98, float:2.102E-41)
        L55:
            r2 = r6
            goto L24
        L57:
            int r2 = r2 - r5
            float r0 = (float) r7
            float r0 = r0 * r4
            int r0 = (int) r0
            int r0 = java.lang.Math.min(r2, r0)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1452670nuD.LIZ(com.ss.android.ugc.aweme.creative.model.music.AVMusic, float, int, int, int, com.ss.android.ugc.aweme.creative.model.music.MusicBuzModel):int");
    }
}
