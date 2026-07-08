package X;

import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.1BLC, reason: invalid class name */
/* JADX INFO: loaded from: classes35.dex */
public abstract class C1BLC {
    public static final /* synthetic */ int LJIILL = 0;
    public final String LIZ;
    public final String LIZIZ;
    public final boolean LIZJ;
    public C1BLE LIZLLL;
    public final boolean LJ;
    public boolean LJFF;
    public AnonymousClass1405 LJI;
    public int LJII;
    public int LJIIIIZZ;
    public C1BLH LJIIIZ = C1BLH.NOT_START;
    public long LJIIJ;
    public long LJIIJJI;
    public long LJIIL;
    public long LJIILIIL;
    public final long LJIILJJIL;

    public abstract boolean LIZLLL();

    public abstract boolean LJ();

    public abstract void LJI(Map<String, String> map);

    public final Map<String, String> LJFF() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        LJI(linkedHashMap);
        return linkedHashMap;
    }

    public final int hashCode() {
        return ((527 + this.LIZIZ.hashCode()) * 31) + this.LIZ.hashCode();
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0085  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZJ(int r6) {
        /*
            r5 = this;
            long r1 = java.lang.System.currentTimeMillis()
            long r3 = r5.LJIILJJIL
            long r1 = r1 - r3
            org.json.JSONObject r4 = new org.json.JSONObject     // Catch: java.lang.Exception -> L41
            java.util.Map r0 = r5.LJFF()     // Catch: java.lang.Exception -> L41
            r4.<init>(r0)     // Catch: java.lang.Exception -> L41
            org.json.JSONObject r3 = new org.json.JSONObject     // Catch: java.lang.Exception -> L41
            r3.<init>()     // Catch: java.lang.Exception -> L41
            java.lang.String r0 = "reason"
            r4.put(r0, r6)     // Catch: java.lang.Exception -> L41
            java.lang.String r0 = "duration"
            r3.put(r0, r1)     // Catch: java.lang.Exception -> L41
            java.lang.String r1 = "df_install_success"
            r0 = 0
            X.C793770VBv.LJII(r1, r4, r3, r0)     // Catch: java.lang.Exception -> L41
            boolean r0 = r5 instanceof X.C1BLX     // Catch: java.lang.Exception -> L41
            if (r0 == 0) goto L45
            int r0 = X.C2187451AjH.LIZ     // Catch: java.lang.Exception -> L41
            java.lang.String r2 = "DynamicLanguageTask"
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()     // Catch: java.lang.Exception -> L41
            java.lang.String r0 = "InstallSuccess:"
            r1.append(r0)     // Catch: java.lang.Exception -> L41
            r1.append(r4)     // Catch: java.lang.Exception -> L41
            java.lang.String r0 = X.C2188811AlT.LIZIZ(r1)     // Catch: java.lang.Exception -> L41
            X.C1720106oR.LJI(r2, r0)     // Catch: java.lang.Exception -> L41
            goto L45
        L41:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
        L45:
            int r1 = r5.LJIIIIZZ
            if (r1 == 0) goto L7f
            r0 = 1
            if (r1 == r0) goto L7a
            r0 = 2
            if (r1 == r0) goto L85
        L4f:
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            java.util.List<X.1BLD> r0 = com.ss.android.ugc.aweme.plugin.aab.AabPluginServiceImpl.LJII
            java.util.concurrent.CopyOnWriteArrayList r0 = (java.util.concurrent.CopyOnWriteArrayList) r0
            java.util.Iterator r3 = r0.iterator()
        L5c:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L8f
            java.lang.Object r2 = r3.next()
            X.1BLD r2 = (X.C1BLD) r2
            java.lang.String r1 = r5.LIZIZ     // Catch: java.lang.Throwable -> L75
            boolean r0 = r5.LJFF     // Catch: java.lang.Throwable -> L75
            r2.LJ(r1, r0)     // Catch: java.lang.Throwable -> L75
            kotlin.Unit r0 = kotlin.Unit.LIZ     // Catch: java.lang.Throwable -> L75
            r4.add(r0)     // Catch: java.lang.Throwable -> L75
            goto L5c
        L75:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
            goto L5c
        L7a:
            X.1405 r0 = r5.LJI
            boolean r0 = r0.LJIIL
            goto L83
        L7f:
            X.1405 r0 = r5.LJI
            boolean r0 = r0.LJIILIIL
        L83:
            if (r0 == 0) goto L4f
        L85:
            X.1BLE r1 = r5.LIZLLL
            if (r1 == 0) goto L4f
            java.lang.String r0 = r5.LIZIZ
            r1.LIZ(r0)
            goto L4f
        L8f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1BLC.LIZJ(int):void");
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C1BLC) {
            C1BLC c1blc = (C1BLC) obj;
            if (Intrinsics.LJFF(this.LIZIZ, c1blc.LIZIZ) && Intrinsics.LJFF(this.LIZ, c1blc.LIZ)) {
                return true;
            }
            return false;
        }
        return super.equals(obj);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0093  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZ(int r8, int r9, java.lang.String r10) {
        /*
            r7 = this;
            long r0 = java.lang.System.currentTimeMillis()
            long r2 = r7.LJIILJJIL
            long r0 = r0 - r2
            org.json.JSONObject r4 = new org.json.JSONObject     // Catch: java.lang.Exception -> L4a
            java.util.Map r2 = r7.LJFF()     // Catch: java.lang.Exception -> L4a
            r4.<init>(r2)     // Catch: java.lang.Exception -> L4a
            org.json.JSONObject r3 = new org.json.JSONObject     // Catch: java.lang.Exception -> L4a
            r3.<init>()     // Catch: java.lang.Exception -> L4a
            java.lang.String r2 = "reason"
            r4.put(r2, r8)     // Catch: java.lang.Exception -> L4a
            java.lang.String r2 = "duration"
            r3.put(r2, r0)     // Catch: java.lang.Exception -> L4a
            boolean r0 = r7 instanceof X.C1BLX     // Catch: java.lang.Exception -> L4a
            if (r0 == 0) goto L43
            java.lang.String r1 = "exceptionMessage"
            java.lang.String r0 = java.lang.String.valueOf(r10)     // Catch: java.lang.Exception -> L4a
            r4.put(r1, r0)     // Catch: java.lang.Exception -> L4a
            int r0 = X.C2187451AjH.LIZ     // Catch: java.lang.Exception -> L4a
            java.lang.String r2 = "DynamicLanguageTask"
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()     // Catch: java.lang.Exception -> L4a
            java.lang.String r0 = "InstallFailed:"
            r1.append(r0)     // Catch: java.lang.Exception -> L4a
            r1.append(r4)     // Catch: java.lang.Exception -> L4a
            java.lang.String r0 = X.C2188811AlT.LIZIZ(r1)     // Catch: java.lang.Exception -> L4a
            X.C1720106oR.LIZ(r2, r0)     // Catch: java.lang.Exception -> L4a
        L43:
            java.lang.String r1 = "df_install_failed"
            r0 = 0
            X.C793770VBv.LJII(r1, r4, r3, r0)     // Catch: java.lang.Exception -> L4a
            goto L4e
        L4a:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
        L4e:
            if (r9 == 0) goto L8d
            r0 = 1
            if (r9 == r0) goto L88
            r0 = 2
            if (r9 == r0) goto L93
        L56:
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            java.util.List<X.1BLD> r0 = com.ss.android.ugc.aweme.plugin.aab.AabPluginServiceImpl.LJII
            java.util.concurrent.CopyOnWriteArrayList r0 = (java.util.concurrent.CopyOnWriteArrayList) r0
            java.util.Iterator r5 = r0.iterator()
        L63:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L9d
            java.lang.Object r4 = r5.next()
            X.1BLD r4 = (X.C1BLD) r4
            java.lang.String r3 = r7.LIZIZ     // Catch: java.lang.Throwable -> L83
            boolean r2 = r7.LJFF     // Catch: java.lang.Throwable -> L83
            kotlin.jvm.internal.AwS578S0100000_34 r1 = new kotlin.jvm.internal.AwS578S0100000_34     // Catch: java.lang.Throwable -> L83
            r0 = 131(0x83, float:1.84E-43)
            r1.<init>(r7, r0)     // Catch: java.lang.Throwable -> L83
            r4.LIZJ(r3, r2, r8, r1)     // Catch: java.lang.Throwable -> L83
            kotlin.Unit r0 = kotlin.Unit.LIZ     // Catch: java.lang.Throwable -> L83
            r6.add(r0)     // Catch: java.lang.Throwable -> L83
            goto L63
        L83:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
            goto L63
        L88:
            X.1405 r0 = r7.LJI
            boolean r0 = r0.LJIIL
            goto L91
        L8d:
            X.1405 r0 = r7.LJI
            boolean r0 = r0.LJIILIIL
        L91:
            if (r0 == 0) goto L56
        L93:
            X.1BLE r1 = r7.LIZLLL
            if (r1 == 0) goto L56
            java.lang.String r0 = r7.LIZIZ
            r1.LIZIZ(r8, r0)
            goto L56
        L9d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1BLC.LIZ(int, int, java.lang.String):void");
    }

    public C1BLC(String str, String str2, boolean z, boolean z2, C1BLE c1ble, AnonymousClass1405 anonymousClass1405, boolean z3) {
        int i;
        this.LIZ = str;
        this.LIZIZ = str2;
        this.LIZJ = z2;
        this.LIZLLL = c1ble;
        this.LJ = z3;
        this.LJFF = z;
        this.LJI = anonymousClass1405;
        if (z2) {
            i = 0;
        } else if (z) {
            i = 1;
        } else {
            i = 2;
        }
        this.LJIIIIZZ = i;
        this.LJIILJJIL = System.currentTimeMillis();
    }
}
