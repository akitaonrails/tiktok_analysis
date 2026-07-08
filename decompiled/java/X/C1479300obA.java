package X;

import android.text.TextUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.playerkit.radar.SimRadar;
import com.ss.android.ugc.playerkit.simapicommon.model.SimVideo;
import com.ss.ttm.player.DummySurface;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0obA, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public class C1479300obA extends AbstractC1479520obW {
    @Override // X.AbstractC1479520obW
    public final void LJJLL() {
    }

    @Override // X.AbstractC1479520obW
    public final void LJJZ() {
    }

    @Override // X.AbstractC1479520obW
    public final void LJJZZIII() {
    }

    static {
        if (((Boolean) C1474810oTv.LJJZZIII.getValue()).booleanValue()) {
            SimRadar.keyScan("SimPlayer", "DummySurface.useCaches", new Object[0]);
            DummySurface.useCaches(true);
        }
    }

    @Override // X.AbstractC1479520obW
    public final C1479400obK LJIILJJIL() {
        return new C1479400obK(this.LIZIZ, this, this.LJIILJJIL);
    }

    @Override // X.InterfaceC1483670oiD
    public final int LJJLI() {
        InterfaceC1479560oba interfaceC1479560oba = this.LIZIZ;
        if (interfaceC1479560oba != null) {
            return interfaceC1479560oba.LJJLI();
        }
        return 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:107:0x0346  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x034f  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0352  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0359  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x035d  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x036b  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0377  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0115  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0179  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0205  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0226  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0233  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x023c  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0252  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0267  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0291  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x02b7  */
    @Override // X.AbstractC1479520obW
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.C1479510obV LJI(X.C1479360obG r25) {
        /*
            Method dump skipped, instruction units count: 911
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1479300obA.LJI(X.0obG):X.0obV");
    }

    @Override // X.AbstractC1479520obW
    public final C1479410obL LJIJI(SimVideo simVideo) {
        C1473440oRi c1473440oRi;
        if (simVideo.getVideoThumbs() != null && simVideo.getVideoThumbs().size() > 0) {
            try {
                c1473440oRi = new C1473440oRi();
                c1473440oRi.LIZ(new JSONObject(simVideo.getVideoThumbs().get(0).toString()));
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                c1473440oRi = null;
            }
        } else {
            c1473440oRi = null;
        }
        return new C1479410obL(c1473440oRi);
    }

    @Override // X.InterfaceC1483670oiD
    public final void LJJIJL(InterfaceC1472010oPP interfaceC1472010oPP) {
        InterfaceC1479560oba interfaceC1479560oba = this.LIZIZ;
        if (interfaceC1479560oba != null) {
            interfaceC1479560oba.LJJIJL(interfaceC1472010oPP);
        }
    }

    @Override // X.InterfaceC1483670oiD
    public final void LJJIJLIJ(boolean z) {
        InterfaceC1479560oba interfaceC1479560oba = this.LIZIZ;
        if (interfaceC1479560oba != null) {
            interfaceC1479560oba.LJJIJLIJ(z);
        }
    }

    @Override // X.InterfaceC1483670oiD
    public final void LJJLIIIJJI(int i) {
        InterfaceC1479560oba interfaceC1479560oba = this.LIZIZ;
        if (interfaceC1479560oba != null) {
            interfaceC1479560oba.LJJLIIIJJI(i);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x0063  */
    @Override // X.AbstractC1479520obW, X.InterfaceC1483670oiD
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void seek(float r8) {
        /*
            r7 = this;
            super.seek(r8)
            X.0obZ r0 = r7.LJIIIZ
            X.0oOa r2 = r0.getVideoInfo()
            X.0oTa r0 = r7.LJ
            X.0oMY r6 = X.C1471940oPI.LIZ(r0)
            X.0obN r1 = r7.LJFF
            r0 = 0
            if (r1 == 0) goto L1d
            X.0obL r1 = (X.C1479410obL) r1
            X.0oRi r4 = r1.LIZ
            if (r4 == 0) goto L1d
        L1a:
            if (r2 == 0) goto L29
            goto L1f
        L1d:
            r4 = r0
            goto L1a
        L1f:
            X.0oTa r0 = r2.LJII     // Catch: java.lang.Exception -> L84
            if (r0 == 0) goto L29
            X.0oTa r0 = r2.LJII     // Catch: java.lang.Exception -> L84
            X.0oMY r6 = X.C1471940oPI.LIZ(r0)     // Catch: java.lang.Exception -> L84
        L29:
            r3 = 0
            if (r6 == 0) goto L63
            X.0oRe r5 = r6.LIZJ     // Catch: java.lang.Exception -> L84
            if (r5 == 0) goto L63
            int r1 = r5.LIZ     // Catch: java.lang.Exception -> L84
            r2 = 2
            if (r1 != r2) goto L38
            java.util.List<X.0oRi> r0 = r5.LJLIIIL     // Catch: java.lang.Exception -> L84
            goto L3a
        L38:
            java.util.List<X.0oRi> r0 = r5.LJJIJLIJ     // Catch: java.lang.Exception -> L84
        L3a:
            if (r0 == 0) goto L63
            if (r1 != r2) goto L41
            java.util.List<X.0oRi> r0 = r5.LJLIIIL     // Catch: java.lang.Exception -> L84
            goto L43
        L41:
            java.util.List<X.0oRi> r0 = r5.LJJIJLIJ     // Catch: java.lang.Exception -> L84
        L43:
            java.util.ArrayList r0 = (java.util.ArrayList) r0     // Catch: java.lang.Exception -> L84
            int r0 = r0.size()     // Catch: java.lang.Exception -> L84
            if (r0 <= 0) goto L63
            X.0oRe r1 = r6.LIZJ     // Catch: java.lang.Exception -> L84
            int r0 = r1.LIZ     // Catch: java.lang.Exception -> L84
            if (r0 != r2) goto L5c
            java.util.List<X.0oRi> r0 = r1.LJLIIIL     // Catch: java.lang.Exception -> L84
        L53:
            java.util.ArrayList r0 = (java.util.ArrayList) r0     // Catch: java.lang.Exception -> L84
            java.lang.Object r0 = r0.get(r3)     // Catch: java.lang.Exception -> L84
            X.0oRi r0 = (X.C1473440oRi) r0     // Catch: java.lang.Exception -> L84
            goto L5f
        L5c:
            java.util.List<X.0oRi> r0 = r1.LJJIJLIJ     // Catch: java.lang.Exception -> L84
            goto L53
        L5f:
            if (r0 == 0) goto L63
            r4 = r0
            goto L65
        L63:
            if (r4 == 0) goto L88
        L65:
            java.util.ArrayList<java.lang.String> r0 = r4.LIZIZ     // Catch: java.lang.Exception -> L84
            if (r0 == 0) goto L80
            int r1 = r0.size()     // Catch: java.lang.Exception -> L84
            r0 = 1
            if (r1 <= r0) goto L80
            java.util.ArrayList<java.lang.String> r0 = r4.LIZIZ     // Catch: java.lang.Exception -> L84
            int r0 = r0.size()     // Catch: java.lang.Exception -> L84
            if (r0 <= 0) goto L80
        L78:
            X.C1473450oRj.LIZ(r4, r3)     // Catch: java.lang.Exception -> L84
            int r3 = r3 + 1
            if (r3 >= r0) goto L88
            goto L78
        L80:
            X.C1473450oRj.LIZ(r4, r3)     // Catch: java.lang.Exception -> L84
            return
        L84:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
        L88:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1479300obA.seek(float):void");
    }

    public C1479300obA(InterfaceC1479560oba interfaceC1479560oba, C1476570oWl c1476570oWl) {
        super(interfaceC1479560oba, c1476570oWl);
    }

    @Override // X.InterfaceC1483670oiD
    public final void LJJJZ(int i, JSONObject jSONObject) {
        InterfaceC1479560oba interfaceC1479560oba = this.LIZIZ;
        if (interfaceC1479560oba != null) {
            interfaceC1479560oba.LJJJZ(i, jSONObject);
        }
    }

    @Override // X.InterfaceC1483670oiD
    public final Object LJJJJJ(String str, String str2, Map<String, Object> map) {
        C1470240oMY c1470240oMYLIZIZ;
        if (map != null && !map.isEmpty()) {
            c1470240oMYLIZIZ = C1470270oMb.LIZJ(map);
        } else if (!TextUtils.isEmpty(str2)) {
            c1470240oMYLIZIZ = C1470270oMb.LIZIZ(str2);
        } else {
            c1470240oMYLIZIZ = null;
        }
        if (C1474810oTv.LLILL() && c1470240oMYLIZIZ != null && !TextUtils.isEmpty(str)) {
            C1477400oY6 c1477400oY6 = C1477400oY6.LJJJJI;
            c1477400oY6.getClass();
            if (!TextUtils.isEmpty(str)) {
                c1477400oY6.LJIILJJIL.put(str, c1470240oMYLIZIZ);
            }
        }
        return c1470240oMYLIZIZ;
    }
}
