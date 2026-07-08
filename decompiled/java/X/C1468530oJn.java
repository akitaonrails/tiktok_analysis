package X;

import android.content.Context;
import android.os.SystemClock;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.ttvideoengine.net.BaseDNS;
import com.ss.ttvideoengine.utils.TTVideoEngineLog;
import fyo.e;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0oJn, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1468530oJn extends BaseDNS implements InterfaceC1468560oJq {
    public final int LJFF;
    public int LJI;
    public final int[] LJII;
    public BaseDNS LJIIIIZZ;
    public final Context LJIIIZ;
    public boolean LJIIJ;
    public final C1468540oJo LJIIJJI;
    public boolean LJIIL;
    public boolean LJIILIIL;
    public boolean LJIILJJIL;
    public int LJIILL;
    public boolean LJIILLIIL;
    public boolean LJIIZILJ;
    public JSONObject LJIJ;
    public long LJIJI;
    public long LJIJJ;

    @Override // X.InterfaceC1468560oJq
    public final void LIZ(e eVar) {
    }

    @Override // X.InterfaceC1468560oJq
    public final void onCancelled() {
    }

    @Override // com.ss.ttvideoengine.net.BaseDNS
    public final void LIZJ() {
        if (this.LIZIZ) {
            return;
        }
        this.LIZIZ = true;
        BaseDNS baseDNS = this.LJIIIIZZ;
        if (baseDNS != null) {
            baseDNS.LIZJ();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:49:0x00b5, code lost:
    
        if (r12 != false) goto L50;
     */
    @Override // com.ss.ttvideoengine.net.BaseDNS
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJFF() throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 381
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1468530oJn.LJFF():void");
    }

    public final void LJI() {
        int i = this.LJII[this.LJI];
        if (i == 0) {
            this.LJIIIIZZ = new C1468740oK8(this.LIZJ);
        } else if (i == 1) {
            this.LJIIIIZZ = new C1468750oK9(this.LIZJ, this.LJ, 1);
        } else if (i == 2) {
            this.LJIIIIZZ = new C1468750oK9(this.LIZJ, this.LJ, 2);
        }
        BaseDNS baseDNS = this.LJIIIIZZ;
        if (baseDNS != null) {
            baseDNS.LIZLLL = this;
            baseDNS.LJFF();
        }
    }

    @Override // X.InterfaceC1468560oJq
    public final void LIZIZ(JSONObject jSONObject, e eVar) {
        JSONArray jSONArrayOptJSONArray;
        if (this.LIZIZ) {
            if (!this.LJIIJ || this.LJIIL) {
                C786410Ut5.LJLILLLLZI(this.LIZ, 0);
                return;
            }
            return;
        }
        if (eVar == null) {
            if (jSONObject != null) {
                jSONArrayOptJSONArray = jSONObject.optJSONArray("ips");
            } else {
                jSONArrayOptJSONArray = null;
            }
            if (jSONArrayOptJSONArray != null && jSONArrayOptJSONArray.length() != 0) {
                JSONObject jSONObject2 = new JSONObject();
                try {
                    jSONObject2.put("ip", jSONArrayOptJSONArray.optString(0));
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                }
                long jOptLong = jSONObject.optLong("ttl");
                if (jOptLong == 0) {
                    jOptLong = this.LJIILL;
                }
                LJII(jSONObject2, jOptLong);
                if (!this.LJIIJ || this.LJIIL) {
                    try {
                        jSONObject2.put("time", jSONObject.optLong("time"));
                        jSONObject2.put("dns_type", jSONObject.optString("dns_type"));
                    } catch (Exception e2) {
                        TryCatchGuardChecker.doCheck(e2);
                        int i = C2187451AjH.LIZ;
                        TTVideoEngineLog.d("DNSParser", e2.toString());
                    }
                    C786410Ut5.LJLJJL(this.LIZ, this.LIZ.obtainMessage(3, jSONObject2));
                    return;
                }
                return;
            }
            if (this.LJII[this.LJI] == 0) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("dns result empty,type:");
                sbLIZ.append(this.LJII[this.LJI]);
                LJ(new e("kTTVideoErrorDomainLocalDNS", -9997, 0, C2188811AlT.LIZIZ(sbLIZ)));
            } else {
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("dns result empty,type:");
                sbLIZ2.append(this.LJII[this.LJI]);
                LJ(new e("kTTVideoErrorDomainHTTPDNS", -9997, 0, C2188811AlT.LIZIZ(sbLIZ2)));
            }
            int i2 = C2187451AjH.LIZ;
            TTVideoEngineLog.d("DNSParser", "ips empty");
            return;
        }
        if (this.LJI == this.LJFF - 1) {
            if (!this.LJIIJ || this.LJIIL) {
                LJ(eVar);
                return;
            }
            return;
        }
        if (!this.LJIIJ || this.LJIIL) {
            C786410Ut5.LJLJJL(this.LIZ, this.LIZ.obtainMessage(1, eVar));
        }
        this.LJI++;
        LJFF();
    }

    public final void LJII(JSONObject jSONObject, long j) {
        if (this.LJIIJJI != null) {
            C1468550oJp c1468550oJp = new C1468550oJp();
            c1468550oJp.LIZ = jSONObject;
            c1468550oJp.LIZIZ = SystemClock.elapsedRealtime() + (j * 1000);
            C1468540oJo c1468540oJo = this.LJIIJJI;
            String str = this.LIZJ;
            ConcurrentHashMap<String, C1468550oJp> concurrentHashMap = c1468540oJo.LIZ;
            if (concurrentHashMap != null) {
                concurrentHashMap.put(str, c1468550oJp);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0030  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C1468530oJn(android.content.Context r6, X.AbstractC1468760oKA r7, java.lang.String r8) {
        /*
            r5 = this;
            r5.<init>(r8, r7)
            r4 = 2
            int[] r1 = new int[r4]
            r1 = {x0072: FILL_ARRAY_DATA , data: [0, 2} // fill-array
            r5.LJII = r1
            r0 = 120(0x78, float:1.68E-43)
            r5.LJIILL = r0
            r5.LJIIIZ = r6
            int r0 = r1.length
            r5.LJFF = r0
            int[] r3 = com.ss.ttvideoengine.TTVideoEngine.LJ
            if (r3 == 0) goto L35
            int r0 = r3.length
            if (r0 <= 0) goto L35
            r2 = 0
        L1c:
            int r0 = r3.length
            if (r2 >= r0) goto L35
            r1 = r3[r2]
            if (r1 == 0) goto L30
            r0 = 1
            if (r1 == r0) goto L2b
            if (r1 == r4) goto L30
        L28:
            int r2 = r2 + 1
            goto L1c
        L2b:
            int[] r0 = r5.LJII
            r0[r2] = r4
            goto L28
        L30:
            int[] r0 = r5.LJII
            r0[r2] = r1
            goto L28
        L35:
            int r0 = X.C2187451AjH.LIZ
            java.lang.String r2 = "DNSParser"
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()
            java.lang.String r0 = "DNSType:"
            r1.append(r0)
            int[] r0 = r5.LJII
            java.lang.String r0 = java.util.Arrays.toString(r0)
            r1.append(r0)
            java.lang.String r0 = X.C2188811AlT.LIZIZ(r1)
            X.C1471660oOq.LIZJ(r2, r0)
            X.0oJo r0 = X.C1468540oJo.LIZLLL
            if (r0 != 0) goto L6c
            java.lang.Class<X.0oJo> r1 = X.C1468540oJo.class
            monitor-enter(r1)
            X.0oJo r0 = X.C1468540oJo.LIZLLL     // Catch: java.lang.Throwable -> L66
            if (r0 != 0) goto L64
            X.0oJo r0 = new X.0oJo     // Catch: java.lang.Throwable -> L66
            r0.<init>()     // Catch: java.lang.Throwable -> L66
            X.C1468540oJo.LIZLLL = r0     // Catch: java.lang.Throwable -> L66
        L64:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L66
            goto L6c
        L66:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)     // Catch: java.lang.Throwable -> L66
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L66
            throw r0
        L6c:
            X.0oJo r0 = X.C1468540oJo.LIZLLL
            r5.LJIIJJI = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1468530oJn.<init>(android.content.Context, X.0oKA, java.lang.String):void");
    }
}
