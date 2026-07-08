package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.08RA, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
public final class C08RA extends C0XNK {
    public final C01GW LJII = C452501pT.LIZIZ(new C08RC(this));
    public final C01GW LJIIIIZZ = C452501pT.LIZIZ(new C08RB(this));

    @Override // X.C0XNK
    public final void LJ() {
    }

    @Override // X.C0XNK
    public final String LIZ() {
        String str = ((C08R9) this.LJIIIIZZ.getValue()).LJ;
        return str == null ? "" : str;
    }

    @Override // com.bytedance.android.sdk.ticketguard.TicketGuardService
    public final String getBase64ReePub() {
        C08R6 c08r6 = ((C08R9) this.LJIIIIZZ.getValue()).LIZIZ;
        if (c08r6 != null) {
            return c08r6.LIZJ;
        }
        return null;
    }

    @Override // X.C0XNK
    public final void LIZJ(String str, C08RG c08rg) {
        C08RD c08rd = this.LJI.get("ree");
        Boolean bool = c08rd.LIZ;
        Boolean bool2 = Boolean.TRUE;
        if (!Intrinsics.LJFF(bool, bool2)) {
            synchronized (c08rd.LIZIZ) {
                try {
                    if (!Intrinsics.LJFF(c08rd.LIZ, bool2)) {
                        c08rd.LIZ = Boolean.valueOf(((C08R8) this.LJIIIIZZ.getValue()).LJFF(str));
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        }
        c08rg.LIZ(c08rd.LIZ);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001e A[RETURN] */
    @Override // com.bytedance.android.sdk.ticketguard.TicketGuardService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String reeSign(java.lang.String r11, java.lang.String r12) throws org.json.JSONException {
        /*
            r10 = this;
            X.01GW r0 = r10.LJIIIIZZ
            java.lang.Object r1 = r0.getValue()
            X.08R9 r1 = (X.C08R9) r1
            java.nio.charset.Charset r0 = kotlin.text.Charsets.UTF_8
            byte[] r3 = r11.getBytes(r0)
            X.08R6 r0 = r1.LIZIZ
            r1 = 0
            r9 = 0
            r8 = 0
            if (r0 != 0) goto L1f
            java.lang.String r0 = "Failed to obtain private key"
            X.C0XNL.LJFF(r1, r0, r12, r9)
        L1b:
            r7 = r8
        L1c:
            if (r7 != 0) goto L3f
            return r8
        L1f:
            long r5 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Throwable -> L33
            net.bytedance.zdplib.DeltaSignerVerifier r0 = r0.LIZIZ     // Catch: java.lang.Throwable -> L33
            byte[] r7 = r0.LIZIZ(r3)     // Catch: java.lang.Throwable -> L33
            long r3 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Throwable -> L33
            long r3 = r3 - r5
            r0 = 1
            X.C0XNL.LJFF(r3, r8, r12, r0)     // Catch: java.lang.Throwable -> L33
            goto L1c
        L33:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
            java.lang.String r0 = android.util.Log.getStackTraceString(r0)
            X.C0XNL.LJFF(r1, r0, r12, r9)
            goto L1b
        L3f:
            r0 = 2
            java.lang.String r0 = android.util.Base64.encodeToString(r7, r0)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C08RA.reeSign(java.lang.String, java.lang.String):java.lang.String");
    }
}
