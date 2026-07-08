package X;

import android.graphics.Bitmap;
import android.util.LruCache;
import com.bytedance.lighten.loader.SmartImageView;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0l5V, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1344350l5V {
    public static final /* synthetic */ int LIZ = 0;

    public static void LIZIZ(C1341210l0R c1341210l0R) {
        LIZJ(c1341210l0R.LIZ, "preload");
        C1344650l5z.LIZ.getClass();
        String str = c1341210l0R.LIZLLL;
        if (str != null) {
            int i = C1341270l0X.LIZ[c1341210l0R.LIZ.ordinal()];
            if (i == 1 || i == 2 || i == 3) {
                LruCache<String, Long> lruCache = C1344650l5z.LIZIZ;
                EnumC1341600l14 enumC1341600l14 = c1341210l0R.LIZ;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append(enumC1341600l14.name());
                sbLIZ.append('|');
                sbLIZ.append(str);
                lruCache.put(C2188811AlT.LIZIZ(sbLIZ), Long.valueOf(System.currentTimeMillis()));
            }
        }
        C1341180l0O.LIZ.getClass();
        C1331670kl3 c1331670kl3LIZJ = C1341180l0O.LIZJ(c1341210l0R, false);
        c1331670kl3LIZJ.LJJIIJZLJL = C823050WQl.LIZLLL();
        c1331670kl3LIZJ.LJJIIJ(new InterfaceC1331910klR() { // from class: X.0l5W
            @Override // X.InterfaceC1331910klR
            public final void LIZ(Bitmap bitmap) {
            }

            @Override // X.InterfaceC1331910klR
            public final void onCanceled() {
            }

            @Override // X.InterfaceC1331910klR
            public final void onFailed(Throwable th) {
            }

            @Override // X.InterfaceC1331910klR
            public final void onProgress(float f) {
            }
        });
    }

    public static void LIZJ(EnumC1341600l14 enumC1341600l14, String str) {
        if (C294220Bg4.LIZ()) {
            return;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("CommentMediaLoader.");
        sbLIZ.append(str);
        sbLIZ.append(" called in LEGACY AB group at scene=");
        sbLIZ.append(enumC1341600l14);
        sbLIZ.append("; caller entered without 'if (useNewLoader)' gate (spec D12).");
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        C1AF0.LIZJ(strLIZIZ);
        C1344030l4z.LIZ("CommentMediaLoader", strLIZIZ);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [X.0l5y] */
    /* JADX WARN: Type inference failed for: r2v1, types: [X.0Psf] */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v3 */
    public static void LIZ(final C1341210l0R c1341210l0R, SmartImageView smartImageView, InterfaceC427850Gq7 interfaceC427850Gq7, final InterfaceC658750Psf interfaceC658750Psf, boolean z) {
        EnumC1341600l14 enumC1341600l14 = c1341210l0R.LIZ;
        if (enumC1341600l14 != EnumC1341600l14.INNER_FIRST_PHOTO) {
            LIZJ(enumC1341600l14, "display");
            C1344650l5z.LIZ.getClass();
            final long jCurrentTimeMillis = System.currentTimeMillis();
            final ?? r2 = new InterfaceC658750Psf() { // from class: X.0l5y
                public volatile C1344660l60 LL = C1344660l60.LJFF;

                /* JADX WARN: Removed duplicated region for block: B:26:0x0071  */
                /* JADX WARN: Removed duplicated region for block: B:33:0x00a0  */
                @Override // X.InterfaceC658750Psf
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final void Ck(org.json.JSONObject r23) throws org.json.JSONException {
                    /*
                        r22 = this;
                        java.lang.String r0 = "isSuccess"
                        r4 = r23
                        boolean r6 = r4.optBoolean(r0)
                        long r7 = java.lang.System.currentTimeMillis()
                        r5 = r22
                        long r0 = r2
                        long r7 = r7 - r0
                        X.0l60 r12 = r5.LL
                        java.lang.String r0 = r12.LJ
                        int r0 = r0.length()
                        if (r0 > 0) goto L3c
                        java.lang.String r0 = "image_type"
                        java.lang.String r21 = r4.optString(r0)
                        if (r21 != 0) goto L25
                        java.lang.String r21 = ""
                    L25:
                        int r0 = r21.length()
                        if (r0 == 0) goto L3c
                        long r13 = r12.LIZ
                        long r15 = r12.LIZIZ
                        long r2 = r12.LIZJ
                        long r0 = r12.LIZLLL
                        X.0l60 r12 = new X.0l60
                        r17 = r2
                        r19 = r0
                        r12.<init>(r13, r15, r17, r19, r21)
                    L3c:
                        if (r6 == 0) goto La4
                        java.lang.String r0 = "from"
                        java.lang.String r0 = r4.optString(r0)
                        if (r0 == 0) goto La2
                        java.lang.Integer r0 = X.C2095008Iq.LJIIJJI(r0)
                        if (r0 == 0) goto La2
                        int r0 = r0.intValue()
                        if (r0 <= 0) goto La2
                        r6 = 1
                    L53:
                        X.0l5z r0 = X.C1344650l5z.LIZ
                        X.0l0R r3 = r4
                        r0.getClass()
                        java.lang.String r4 = r3.LIZLLL
                        if (r4 == 0) goto L71
                        X.0l14 r0 = r3.LIZ
                        int[] r1 = X.C1341270l0X.LIZ
                        int r0 = r0.ordinal()
                        r1 = r1[r0]
                        r0 = 1
                        if (r1 == r0) goto L7b
                        r0 = 2
                        if (r1 == r0) goto L7b
                        r0 = 3
                        if (r1 == r0) goto L7b
                    L71:
                        r9 = -1
                    L72:
                        X.0l14 r4 = r3.LIZ
                        r5 = 1
                        r10 = 0
                        r11 = r10
                        X.C1344650l5z.LIZ(r4, r5, r6, r7, r9, r10, r11, r12)
                        return
                    L7b:
                        if (r6 == 0) goto La0
                        android.util.LruCache<java.lang.String, java.lang.Long> r2 = X.C1344650l5z.LIZIZ
                        X.0l14 r0 = r3.LIZ
                        java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()
                        java.lang.String r0 = r0.name()
                        r1.append(r0)
                        r0 = 124(0x7c, float:1.74E-43)
                        r1.append(r0)
                        r1.append(r4)
                        java.lang.String r0 = X.C2188811AlT.LIZIZ(r1)
                        java.lang.Object r0 = r2.get(r0)
                        if (r0 == 0) goto La0
                        r9 = 1
                        goto L72
                    La0:
                        r9 = 0
                        goto L72
                    La2:
                        r6 = 0
                        goto L53
                    La4:
                        X.0l5z r2 = X.C1344650l5z.LIZ
                        X.0l0R r1 = r4
                        java.lang.String r0 = "err_code"
                        java.lang.String r10 = r4.optString(r0)
                        java.lang.String r0 = "err_msg"
                        java.lang.String r11 = r4.optString(r0)
                        r2.getClass()
                        X.0l14 r4 = r1.LIZ
                        r5 = 0
                        r9 = -1
                        r6 = r5
                        X.C1344650l5z.LIZ(r4, r5, r6, r7, r9, r10, r11, r12)
                        return
                    */
                    throw new UnsupportedOperationException("Method not decompiled: X.C1344640l5y.Ck(org.json.JSONObject):void");
                }

                @Override // X.InterfaceC658750Psf
                public final void onImageLoaded(boolean z2, String str, JSONObject jSONObject) {
                    C1344660l60 c1344660l60;
                    if (jSONObject == null) {
                        c1344660l60 = C1344660l60.LJFF;
                    } else {
                        c1344660l60 = new C1344660l60(jSONObject.optLong("decode_duration", -1L), jSONObject.optLong("download_duration", -1L), jSONObject.optLong("queue_duration", -1L), jSONObject.optLong("file_size", -1L), jSONObject.optString("image_type", ""));
                    }
                    this.LL = c1344660l60;
                }
            };
            ?? r22 = r2;
            if (interfaceC658750Psf != null) {
                r22 = new InterfaceC658750Psf() { // from class: X.0l5X
                    @Override // X.InterfaceC658750Psf
                    public final void Ck(JSONObject jSONObject) {
                        r2.Ck(jSONObject);
                        interfaceC658750Psf.Ck(jSONObject);
                    }

                    @Override // X.InterfaceC658750Psf
                    public final void onImageLoaded(boolean z2, String str, JSONObject jSONObject) {
                        r2.onImageLoaded(z2, str, jSONObject);
                        interfaceC658750Psf.onImageLoaded(z2, str, jSONObject);
                    }
                };
            }
            C1341180l0O.LIZ.getClass();
            C1331670kl3 c1331670kl3LIZJ = C1341180l0O.LIZJ(c1341210l0R, z);
            c1331670kl3LIZJ.LJJ(smartImageView);
            c1331670kl3LIZJ.LJJJIL = r22;
            c1331670kl3LIZJ.LJIIL(interfaceC427850Gq7);
            return;
        }
        "INNER_FIRST_PHOTO is a preload-only scene; use DETAIL_FULL_* for detail page display".toString();
        throw new IllegalArgumentException("INNER_FIRST_PHOTO is a preload-only scene; use DETAIL_FULL_* for detail page display");
    }
}
