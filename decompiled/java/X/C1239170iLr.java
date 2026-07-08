package X;

import kotlin.jvm.internal.AFwS207S0000000_19;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0iLr, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class C1239170iLr {
    public boolean LIZ;
    public boolean LIZJ;
    public long LIZIZ = -1;
    public long LIZLLL = -1;
    public final C1239180iLs LJ = new InterfaceC658750Psf() { // from class: X.0iLs
        @Override // X.InterfaceC658750Psf
        public final void Ck(JSONObject jSONObject) {
            boolean z;
            C1239170iLr c1239170iLr = this.LL;
            if (jSONObject.optInt("hit_cache") == 0) {
                z = true;
            } else {
                z = false;
            }
            c1239170iLr.LIZJ = !z;
            this.LL.LIZLLL = jSONObject.optInt("duration");
        }

        @Override // X.InterfaceC658750Psf
        public final void onImageLoaded(boolean z, String str, JSONObject jSONObject) {
            long jOptLong;
            boolean zOptBoolean;
            C1239170iLr c1239170iLr = this.LL;
            if (jSONObject != null) {
                jOptLong = jSONObject.optLong("file_size");
            } else {
                jOptLong = -1;
            }
            c1239170iLr.LIZIZ = jOptLong;
            C1239170iLr c1239170iLr2 = this.LL;
            if (jSONObject != null) {
                zOptBoolean = jSONObject.optBoolean("hit_cdn_cache");
            } else {
                zOptBoolean = false;
            }
            c1239170iLr2.LIZ = zOptBoolean;
        }
    };
    public final C1266210j3T LJFF = new C1266210j3T(this, 2);
    public final C01GW LJI = C452501pT.LIZIZ(AFwS207S0000000_19.get$arr$(733));

    /* JADX WARN: Removed duplicated region for block: B:8:0x002d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZ(boolean r5) {
        /*
            r4 = this;
            X.09Gk r3 = new X.09Gk
            r3.<init>()
            boolean r0 = r4.LIZ
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r0)
            java.lang.String r0 = "hit_cdn_cache"
            r3.LJ(r1, r0)
            X.01GW r0 = r4.LJI
            java.lang.Object r0 = r0.getValue()
            com.ss.android.ugc.aweme.network.spi.INetworkStateService r0 = (com.ss.android.ugc.aweme.network.spi.INetworkStateService) r0
            X.0Com r0 = r0.getNetworkStatus()
            int[] r1 = X.C0XHW.LIZ
            int r0 = r0.ordinal()
            r2 = r1[r0]
            r1 = 1
            if (r2 == r1) goto L2d
            r0 = 2
            if (r2 == r0) goto L63
            r0 = 3
            if (r2 == r0) goto L2e
        L2d:
            r1 = -1
        L2e:
            java.lang.String r0 = "net_status"
            r3.LIZJ(r1, r0)
            java.lang.String r2 = "load_time"
            long r0 = r4.LIZLLL
            r3.LIZLLL(r0, r2)
            boolean r0 = r4.LIZJ
            if (r0 == 0) goto L60
            java.lang.String r1 = "1"
        L40:
            java.lang.String r0 = "is_from_cache"
            r3.LJIIIIZZ(r0, r1)
            java.lang.String r2 = "file_size"
            long r0 = r4.LIZIZ
            r3.LIZLLL(r0, r2)
            if (r5 == 0) goto L5d
            java.lang.String r1 = "true"
        L50:
            java.lang.String r0 = "is_successful"
            r3.LJIIIIZZ(r0, r1)
            java.util.Map<java.lang.String, java.lang.String> r1 = r3.LIZ
            java.lang.String r0 = "ai_avatar_img_monitor"
            X.C20684815ws.LJIILLIIL(r0, r1)
            return
        L5d:
            java.lang.String r1 = "false"
            goto L50
        L60:
            java.lang.String r1 = "0"
            goto L40
        L63:
            r1 = 0
            goto L2e
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1239170iLr.LIZ(boolean):void");
    }
}
