package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.feed.model.PhotoModeImageInfo;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;

/* JADX INFO: renamed from: X.0SKN, reason: invalid class name */
/* JADX INFO: loaded from: classes12.dex */
public final class C0SKN {
    public static final boolean LIZIZ(VideoItemParams videoItemParams) {
        if (!C0SKM.LIZIZ()) {
            return false;
        }
        return LIZ(videoItemParams.getAweme(), videoItemParams.mEventType, videoItemParams.isMyProfile);
    }

    public static final boolean LJFF(VideoItemParams videoItemParams) {
        if (LJ(videoItemParams.getAweme(), videoItemParams.mEventType, videoItemParams.isMyProfile)) {
            if (C0SKM.LJI() || C0SKM.LJFF()) {
                return true;
            }
            return false;
        }
        return false;
    }

    public static final boolean LIZ(Aweme aweme, String str, boolean z) {
        boolean z2;
        boolean z3;
        if (aweme == null) {
            return false;
        }
        if (AwemeExtKt.getReviewDetailUrl(aweme).length() <= 0 && AwemeExtKt.getVideoDetailNotice(aweme).length() <= 0) {
            z2 = false;
        } else {
            z2 = true;
        }
        if (z && !z2) {
            z3 = true;
        } else {
            z3 = false;
        }
        return LIZJ(z3, AwemeExtKt.isPhotoMode(aweme), AwemeExtKt.isAdTraffic(aweme), C582980Mtk.LIZ(aweme), C720360SNm.LJIIJJI(aweme), str);
    }

    /* JADX WARN: Removed duplicated region for block: B:57:0x00ab A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00c0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final boolean LJ(com.ss.android.ugc.aweme.feed.model.Aweme r11, java.lang.String r12, boolean r13) {
        /*
            Method dump skipped, instruction units count: 202
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0SKN.LJ(com.ss.android.ugc.aweme.feed.model.Aweme, java.lang.String, boolean):boolean");
    }

    public static final boolean LJI(VideoItemParams videoItemParams, int i, int i2) {
        String videoDetailNotice;
        boolean z;
        boolean z2;
        float maxAspectRatio;
        Aweme aweme = videoItemParams.getAweme();
        String reviewDetailUrl = AwemeExtKt.getReviewDetailUrl(aweme);
        if ((reviewDetailUrl != null && reviewDetailUrl.length() > 0) || ((videoDetailNotice = AwemeExtKt.getVideoDetailNotice(aweme)) != null && videoDetailNotice.length() > 0)) {
            z = true;
        } else {
            z = false;
        }
        String str = videoItemParams.mEventType;
        boolean zIsAdTraffic = AwemeExtKt.isAdTraffic(aweme);
        boolean zIsPhotoMode = AwemeExtKt.isPhotoMode(aweme);
        boolean zLIZ = C582980Mtk.LIZ(aweme);
        boolean zLJIIJJI = C720360SNm.LJIIJJI(aweme);
        if (videoItemParams.isMyProfile && !z) {
            z2 = true;
        } else {
            z2 = false;
        }
        PhotoModeImageInfo photoModeImageInfo = aweme.getPhotoModeImageInfo();
        if (photoModeImageInfo != null) {
            C720360SNm.LIZLLL(photoModeImageInfo);
            maxAspectRatio = photoModeImageInfo.getMaxAspectRatio();
        } else {
            maxAspectRatio = 0.0f;
        }
        if (LIZLLL(i, i2, Float.valueOf(maxAspectRatio), str, zIsAdTraffic, zIsPhotoMode, zLIZ, zLJIIJJI, z2)) {
            if (C0SKM.LJI() || C0SKM.LJFF()) {
                return true;
            }
            return false;
        }
        return false;
    }

    public static final boolean LJIIIIZZ(int i, int i2, boolean z, Float f) {
        if (i + i2 <= 1) {
            return true;
        }
        if (z || f == null || f.floatValue() < 1.0f) {
            return false;
        }
        return true;
    }

    public static final boolean LIZJ(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, String str) {
        if (!C0SKM.LIZIZ()) {
            return false;
        }
        int iHashCode = str.hashCode();
        if (iHashCode != -1683576680) {
            return iHashCode == -562830579 ? false : false;
        }
        if (!str.equals("publish_preview") || !C0SKM.LJIIIZ(str)) {
            return false;
        }
        if (z3 || !z2) {
            return false;
        }
        if (!z4 && z5) {
            return false;
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:58:0x0098 A[PHI: r6
      0x0098: PHI (r6v2 boolean) = (r6v1 boolean), (r6v4 boolean) binds: [B:56:0x0095, B:51:0x008d] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final X.C0SL4 LJII(int r4, int r5, java.lang.Float r6, java.lang.String r7, boolean r8, boolean r9, boolean r10, boolean r11) {
        /*
            boolean r0 = X.C0SKM.LIZIZ()
            r1 = 0
            if (r0 != 0) goto Ld
            X.0SL4 r0 = new X.0SL4
            r0.<init>(r1)
            return r0
        Ld:
            if (r7 == 0) goto L2a
            int r2 = r7.hashCode()
            r0 = -1683576680(0xffffffff9ba6a898, float:-2.7571347E-22)
            if (r2 == r0) goto L30
            r0 = -562830579(0xffffffffde73e30d, float:-4.393476E18)
            if (r2 == r0) goto L3f
            r0 = 1691937916(0x64d8ec7c, float:3.2012298E22)
            if (r2 != r0) goto L2a
            java.lang.String r0 = "homepage_hot"
            boolean r0 = r7.equals(r0)
            if (r0 != 0) goto L4f
        L2a:
            X.0SL4 r0 = new X.0SL4
            r0.<init>(r1)
            return r0
        L30:
            java.lang.String r0 = "publish_preview"
            boolean r0 = r7.equals(r0)
            if (r0 == 0) goto L2a
            boolean r0 = X.C0SKM.LJIIIZ(r7)
            if (r0 != 0) goto L4f
            goto L2a
        L3f:
            java.lang.String r0 = "personal_homepage"
            boolean r0 = r7.equals(r0)
            if (r0 == 0) goto L2a
            if (r8 == 0) goto L2a
            boolean r0 = X.C0SKM.LJIIIZ(r7)
            if (r0 == 0) goto L2a
        L4f:
            if (r9 != 0) goto La1
            if (r10 != 0) goto L55
            if (r11 != 0) goto La1
        L55:
            r3 = 1
        L56:
            boolean r1 = LJIIIIZZ(r4, r5, r10, r6)
            if (r3 == 0) goto L9f
            if (r1 != 0) goto L9f
            boolean r0 = X.C0SKM.LIZLLL()
            if (r0 == 0) goto L9f
            r5 = 1
        L65:
            X.0SL4 r2 = new X.0SL4
            if (r3 == 0) goto L9d
            boolean r0 = X.C0SKM.LIZ()
            if (r0 == 0) goto L9a
            com.ss.android.ugc.aweme.experiment.PhotoModeNewFeedConfigModel r0 = X.C0SKM.LJIIIIZZ()
            boolean r0 = r0.enableNewFeedLayoutStyle
            if (r0 == 0) goto L9a
            com.ss.android.ugc.aweme.experiment.PhotoModeNewFeedConfigModel r0 = X.C0SKM.LJIIIIZZ()
            boolean r0 = r0.enableScaling
            if (r0 != 0) goto L9a
        L7f:
            r4 = 1
        L80:
            if (r5 == 0) goto L94
            boolean r0 = X.C0SKM.LJI()
            if (r0 == 0) goto L94
            r6 = 1
        L89:
            boolean r0 = X.C0SKM.LJFF()
            if (r0 == 0) goto L98
            r7 = 1
        L90:
            r2.<init>(r3, r4, r5, r6, r7)
            return r2
        L94:
            r6 = 0
            if (r5 == 0) goto L98
            goto L89
        L98:
            r7 = 0
            goto L90
        L9a:
            if (r1 == 0) goto L9d
            goto L7f
        L9d:
            r4 = 0
            goto L80
        L9f:
            r5 = 0
            goto L65
        La1:
            r3 = 0
            goto L56
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0SKN.LJII(int, int, java.lang.Float, java.lang.String, boolean, boolean, boolean, boolean):X.0SL4");
    }

    public static final boolean LIZLLL(int i, int i2, Float f, String str, boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        boolean z6;
        if (!C0SKM.LIZLLL()) {
            return false;
        }
        int iHashCode = str.hashCode();
        if (iHashCode != -1683576680) {
            return iHashCode == -562830579 ? false : false;
        }
        if (!str.equals("publish_preview") || !C0SKM.LJIIIZ(str)) {
            return false;
        }
        if (!z && z2 && (z3 || !z4)) {
            z6 = true;
        } else {
            z6 = false;
        }
        boolean zLJIIIIZZ = LJIIIIZZ(i, i2, z3, f);
        if (!z6 || zLJIIIIZZ) {
            return false;
        }
        return true;
    }
}
