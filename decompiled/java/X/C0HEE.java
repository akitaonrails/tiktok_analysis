package X;

import android.graphics.Bitmap;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import kotlin.jvm.internal.AFwS192S0000000_6;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0HEE, reason: invalid class name */
/* JADX INFO: loaded from: classes7.dex */
public final class C0HEE {
    public static final C0HEE LIZ = new C0HEE();
    public static final C01GW LIZIZ = C452501pT.LIZIZ(AFwS192S0000000_6.get$arr$(604));

    @C14EU
    public final void onPublishStatusUpdate(C1445970njP c1445970njP) {
        String stickerIDs;
        Aweme aweme;
        Object obj = c1445970njP.LIZJ;
        if ((obj instanceof Aweme) && (aweme = (Aweme) obj) != null) {
            stickerIDs = aweme.getStickerIDs();
        } else {
            stickerIDs = null;
        }
        if (Intrinsics.LJFF(stickerIDs, C437650HEd.LIZ().effectId)) {
            C844470XAv.LIZ.getClass();
            C23250099c.LIZLLL(C2296808zG.LIZ(C0PEM.LIZJ), null, null, new C437620HEa(C844470XAv.LIZ(), null), 3);
        }
    }

    public static Object LIZIZ(String str, InterfaceC1364105Vn interfaceC1364105Vn) {
        C2252611DEt c2252611DEt = new C2252611DEt(1, C099M.LIZLLL(interfaceC1364105Vn));
        c2252611DEt.LJIJJ();
        C1331670kl3 c1331670kl3LJIIIZ = C1331660kl2.LJIIIZ(str);
        c1331670kl3LJIIIZ.LJIL = Bitmap.Config.ARGB_8888;
        c1331670kl3LJIIIZ.LJJII(new C463080IDy(c2252611DEt, 4));
        Object objLJIJ = c2252611DEt.LJIJ();
        if (objLJIJ == C099R.LJFF()) {
            C099Q.LIZJ(interfaceC1364105Vn);
        }
        return objLJIJ;
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x0072  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZ(java.lang.Integer r8, X.InterfaceC1364105Vn<? super kotlin.Pair<java.lang.String, java.lang.String>> r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof X.C434360H1m
            if (r0 == 0) goto L72
            r6 = r9
            X.0H1m r6 = (X.C434360H1m) r6
            int r2 = r6.LLILLL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L72
            int r2 = r2 - r1
            r6.LLILLL = r2
        L12:
            java.lang.Object r5 = r6.LL
            java.lang.Object r3 = X.C099R.LJFF()
            int r0 = r6.LLILLL
            r1 = 1
            r4 = 0
            if (r0 == 0) goto L4e
            if (r0 != r1) goto L78
            X.C155000ia.LIZIZ(r5)
        L23:
            com.ss.android.ugc.ur.socialavatar.SocialAvatarAssetsResponse r5 = (com.ss.android.ugc.ur.socialavatar.SocialAvatarAssetsResponse) r5
            kotlin.Pair r3 = new kotlin.Pair
            r2 = 0
            if (r5 == 0) goto L4a
            java.util.List<com.ss.android.ugc.ur.socialavatar.AssetInput> r0 = r5.inputs
            if (r0 == 0) goto L4a
            java.lang.Object r0 = X.C13LP.LJJJLZIJ(r2, r0)
            com.ss.android.ugc.ur.socialavatar.AssetInput r0 = (com.ss.android.ugc.ur.socialavatar.AssetInput) r0
            if (r0 == 0) goto L4a
            java.lang.String r1 = r0.url
        L38:
            java.util.List<com.ss.android.ugc.ur.socialavatar.AssetOutput> r0 = r5.outputs
            if (r0 == 0) goto L46
            java.lang.Object r0 = X.C13LP.LJJJLZIJ(r2, r0)
            com.ss.android.ugc.ur.socialavatar.AssetOutput r0 = (com.ss.android.ugc.ur.socialavatar.AssetOutput) r0
            if (r0 == 0) goto L46
            java.lang.String r4 = r0.url
        L46:
            r3.<init>(r1, r4)
            return r3
        L4a:
            r1 = r4
            if (r5 == 0) goto L46
            goto L38
        L4e:
            X.C155000ia.LIZIZ(r5)
            X.0HMR r0 = X.C0HMR.LIZ
            r0.getClass()
            X.0HEN r2 = X.C0HMR.LIZ()
            r6.LLILLL = r1
            boolean r0 = X.C1644806cI.LIZJ()
            if (r0 != 0) goto L66
            r5 = r4
        L63:
            if (r5 != r3) goto L23
            return r3
        L66:
            X.0HEW r1 = X.C0HEN.LIZIZ
            X.0HEJ r0 = new X.0HEJ
            r0.<init>(r2, r8, r4)
            java.lang.Object r5 = r1.LIZ(r0, r6)
            goto L63
        L72:
            X.0H1m r6 = new X.0H1m
            r6.<init>(r7, r9)
            goto L12
        L78:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0HEE.LIZ(java.lang.Integer, X.05Vn):java.lang.Object");
    }
}
