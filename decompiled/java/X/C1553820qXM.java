package X;

import android.graphics.Bitmap;
import android.webkit.PermissionRequest;

/* JADX INFO: renamed from: X.0qXM, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1553820qXM extends AbstractC1541650qDj<C1ET2> implements InterfaceC1524070plN {
    public final C1553840qXO LLIZ = new AbstractC1541650qDj<C1BVW>() { // from class: X.0qXO
        public final C1553850qXP LLIZ;

        @Override // X.AbstractC1541650qDj
        public final boolean LIZIZ() {
            return this.LLIZLLLIL.LLILZ;
        }

        @Override // X.AbstractC1541650qDj
        public final void LIZJ() {
            LJ("onPermissionRequest", this.LLIZ, 8000);
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [X.0qXP] */
        {
            this.LLIZ = new C1BVX() { // from class: X.0qXP
                @Override // X.C1BVX
                public final Bitmap getDefaultVideoPoster() {
                    return Bitmap.createBitmap(10, 10, Bitmap.Config.ARGB_8888);
                }

                @Override // X.AbstractC1541670qDl
                public final AbstractC1541650qDj<?> getExtension() {
                    return this.LL;
                }

                @Override // X.C1BVX
                public final void onPermissionRequest(final PermissionRequest permissionRequest) {
                    final C1553820qXM c1553820qXM = c1553820qXM;
                    C2487409ou.LIZJ(new Runnable() { // from class: X.14bY
                        /* JADX WARN: Removed duplicated region for block: B:31:0x009a  */
                        /* JADX WARN: Removed duplicated region for block: B:33:0x009e  */
                        /* JADX WARN: Removed duplicated region for block: B:39:0x00e0  */
                        /*
                            Code decompiled incorrectly, please refer to instructions dump.
                            To view partially-correct add '--show-bad-code' argument
                        */
                        public final void LIZ() throws java.lang.Throwable {
                            /*
                                Method dump skipped, instruction units count: 489
                                To view this dump add '--comments-level debug' option
                            */
                            throw new UnsupportedOperationException("Method not decompiled: X.RunnableC20297814bY.LIZ():void");
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            boolean zLIZ;
                            C1C7U.LIZ("KYCWebExtension$WebChromeContainerClientExtension@639c.webChromeContainerClientListenerStub$1$onPermissionRequest$1");
                            try {
                                LIZ();
                            } finally {
                                if (!zLIZ) {
                                }
                            }
                            C1C7U.LIZIZ("KYCWebExtension$WebChromeContainerClientExtension@639c.webChromeContainerClientListenerStub$1$onPermissionRequest$1");
                        }
                    });
                }
            };
        }
    };

    @Override // X.AbstractC1541650qDj
    public final void LIZJ() {
        this.LLILLL = "KYCWebExtension";
        C1541640qDi.LIZ(((C1BVV) LIZ()).getExtendableWebChromeClient(), this.LLIZ);
    }
}
