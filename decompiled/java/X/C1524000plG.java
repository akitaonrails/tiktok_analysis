package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0plG, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1524000plG extends AbstractC1541650qDj<C1ET2> implements InterfaceC1524070plN {
    public static final /* synthetic */ int LLIZLLLIL = 0;
    public final C1524050plL LLIZ = new AbstractC1541650qDj<C2205951BVh>(this) { // from class: X.0plL
        public final C1522820pjM LLIZ;

        @Override // X.AbstractC1541650qDj
        public final void LIZJ() {
            LJ("shouldInterceptRequest", this.LLIZ, 7000);
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [X.0pjM] */
        {
            this.LLIZ = new AbstractC2205961BVi() { // from class: X.0pjM
                @Override // X.AbstractC1541670qDl
                public final AbstractC1541650qDj<?> getExtension() {
                    return this.LL;
                }

                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Removed duplicated region for block: B:104:0x0278  */
                /* JADX WARN: Type inference failed for: r2v1, types: [android.net.Uri] */
                /* JADX WARN: Type inference failed for: r2v2 */
                /* JADX WARN: Type inference failed for: r2v22, types: [java.lang.String] */
                /* JADX WARN: Type inference failed for: r2v23 */
                /* JADX WARN: Type inference failed for: r2v24 */
                /* JADX WARN: Type inference failed for: r2v25 */
                /* JADX WARN: Type inference failed for: r2v3 */
                /* JADX WARN: Type inference failed for: r2v4, types: [android.webkit.WebResourceResponse] */
                /* JADX WARN: Type inference failed for: r2v5 */
                /* JADX WARN: Type inference failed for: r2v6 */
                /* JADX WARN: Type inference failed for: r2v8 */
                @Override // X.AbstractC2205961BVi
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final android.webkit.WebResourceResponse shouldInterceptRequest(final android.webkit.WebView r21, android.webkit.WebResourceRequest r22) throws org.json.JSONException {
                    /*
                        Method dump skipped, instruction units count: 639
                        To view this dump add '--comments-level debug' option
                    */
                    throw new UnsupportedOperationException("Method not decompiled: X.C1522820pjM.shouldInterceptRequest(android.webkit.WebView, android.webkit.WebResourceRequest):android.webkit.WebResourceResponse");
                }
            };
        }
    };

    @Override // X.AbstractC1541650qDj
    public final void LIZJ() {
        this.LLILLL = "image";
        C1541640qDi.LIZ(((C1BVV) LIZ()).getExtendableWebViewClient(), this.LLIZ);
    }

    public static boolean LJFF(C1522840pjO c1522840pjO, C1522780pjI c1522780pjI) {
        C0X0P c0x0pLIZ = C1522900pjU.LIZ(c1522840pjO.LIZIZ);
        if (c0x0pLIZ == null) {
            return false;
        }
        c1522780pjI.LJIIIZ = c0x0pLIZ.LIZJ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(c0x0pLIZ.LIZIZ);
        sbLIZ.append('/');
        sbLIZ.append(c0x0pLIZ.LIZJ);
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        if (!Intrinsics.LJFF(strLIZIZ, "image/heic") && !Intrinsics.LJFF(strLIZIZ, "image/heif")) {
            return false;
        }
        return true;
    }
}
