package X;

import android.os.Process;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.io.File;
import java.io.FileFilter;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0VC4, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0VC4 {
    public static volatile C0VC4 LIZJ;
    public final ConcurrentHashMap<Long, ConcurrentHashMap<Long, JSONObject>> LIZ = new ConcurrentHashMap<>();
    public volatile boolean LIZIZ = false;

    public static C0VC4 LIZJ() {
        if (LIZJ == null) {
            synchronized (C0VC4.class) {
                try {
                    if (LIZJ == null) {
                        LIZJ = new C0VC4();
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        }
        return LIZJ;
    }

    public static String LIZ(long j, long j2) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(j);
        sbLIZ.append("_");
        sbLIZ.append(j2);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0057  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final org.json.JSONObject LIZIZ(long r6, long r8) {
        /*
            r5 = this;
            java.util.concurrent.ConcurrentHashMap<java.lang.Long, java.util.concurrent.ConcurrentHashMap<java.lang.Long, org.json.JSONObject>> r1 = r5.LIZ
            java.lang.Long r0 = java.lang.Long.valueOf(r6)
            java.lang.Object r1 = r1.get(r0)
            java.util.concurrent.ConcurrentHashMap r1 = (java.util.concurrent.ConcurrentHashMap) r1
            if (r1 == 0) goto L23
            java.lang.Long r0 = java.lang.Long.valueOf(r8)
            boolean r0 = r1.containsKey(r0)
            if (r0 == 0) goto L23
            java.lang.Long r0 = java.lang.Long.valueOf(r8)
            java.lang.Object r0 = r1.get(r0)
            org.json.JSONObject r0 = (org.json.JSONObject) r0
            return r0
        L23:
            java.lang.String r0 = LIZ(r6, r8)
            java.io.File r3 = X.C0VC2.LIZJ()
            if (r3 == 0) goto L57
            X.0VSJ r2 = new X.0VSJ
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()
            r1.append(r0)
            java.lang.String r0 = ".bin"
            r1.append(r0)
            java.lang.String r0 = X.C2188811AlT.LIZIZ(r1)
            r2.<init>(r3, r0)
            byte[] r1 = X.C2404609bY.LIZIZ(r2)
            if (r1 == 0) goto L57
            org.json.JSONObject r2 = new org.json.JSONObject     // Catch: java.lang.Exception -> L53
            java.lang.String r0 = new java.lang.String     // Catch: java.lang.Exception -> L53
            r0.<init>(r1)     // Catch: java.lang.Exception -> L53
            r2.<init>(r0)     // Catch: java.lang.Exception -> L53
            goto L58
        L53:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
        L57:
            r2 = 0
        L58:
            java.lang.String r4 = "APM-SDK"
            java.util.concurrent.ConcurrentHashMap<java.lang.Long, java.util.concurrent.ConcurrentHashMap<java.lang.Long, org.json.JSONObject>> r1 = r5.LIZ
            java.lang.Long r0 = java.lang.Long.valueOf(r6)
            boolean r0 = r1.containsKey(r0)
            if (r0 != 0) goto L74
            java.util.concurrent.ConcurrentHashMap<java.lang.Long, java.util.concurrent.ConcurrentHashMap<java.lang.Long, org.json.JSONObject>> r3 = r5.LIZ
            java.lang.Long r1 = java.lang.Long.valueOf(r6)
            java.util.concurrent.ConcurrentHashMap r0 = new java.util.concurrent.ConcurrentHashMap
            r0.<init>()
            r3.put(r1, r0)
        L74:
            if (r2 == 0) goto L9f
            java.util.concurrent.ConcurrentHashMap<java.lang.Long, java.util.concurrent.ConcurrentHashMap<java.lang.Long, org.json.JSONObject>> r1 = r5.LIZ
            java.lang.Long r0 = java.lang.Long.valueOf(r6)
            java.lang.Object r1 = r1.get(r0)
            java.util.concurrent.ConcurrentHashMap r1 = (java.util.concurrent.ConcurrentHashMap) r1
            java.lang.Long r0 = java.lang.Long.valueOf(r8)
            r1.put(r0, r2)
        L89:
            if (r2 != 0) goto L9e
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()
            java.lang.String r0 = "header==null "
            r1.append(r0)
            r1.append(r6)
            java.lang.String r0 = X.C2188811AlT.LIZIZ(r1)
            X.C0VCY.LIZ(r4, r0)
        L9e:
            return r2
        L9f:
            java.lang.Class<X.0VC5> r3 = X.C0VC5.class
            monitor-enter(r3)
            java.util.concurrent.ConcurrentHashMap<java.lang.Long, org.json.JSONObject> r1 = X.C0VC5.LIZIZ     // Catch: java.lang.Throwable -> Lb0
            java.lang.Long r0 = java.lang.Long.valueOf(r6)     // Catch: java.lang.Throwable -> Lb0
            java.lang.Object r2 = r1.get(r0)     // Catch: java.lang.Throwable -> Lb0
            org.json.JSONObject r2 = (org.json.JSONObject) r2     // Catch: java.lang.Throwable -> Lb0
            monitor-exit(r3)
            goto L89
        Lb0:
            r0 = move-exception
            monitor-exit(r3)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0VC4.LIZIZ(long, long):org.json.JSONObject");
    }

    public final long LIZLLL(JSONObject jSONObject, long j) {
        long jCurrentTimeMillis = (System.currentTimeMillis() << 16) | ((long) Process.myPid());
        if (!this.LIZ.containsKey(Long.valueOf(j))) {
            this.LIZ.put(Long.valueOf(j), new ConcurrentHashMap<>());
        }
        this.LIZ.get(Long.valueOf(j)).put(Long.valueOf(jCurrentTimeMillis), jSONObject);
        String strLIZ = LIZ(j, jCurrentTimeMillis);
        JSONObject jSONObjectLIZ = C1956807lW.LIZ(jSONObject);
        File fileLIZJ = C0VC2.LIZJ();
        if (fileLIZJ != null && jSONObjectLIZ != null) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(strLIZ);
            sbLIZ.append(".bin");
            FileChannel channel = null;
            try {
                channel = new C0VSV(new C0VSJ(fileLIZJ, C2188811AlT.LIZIZ(sbLIZ))).getChannel();
                channel.write(ByteBuffer.wrap(C786410Ut5.J3(jSONObjectLIZ).getBytes()));
            } finally {
                try {
                } catch (Throwable th) {
                }
            }
            C2105408Mq.LIZ(channel);
        }
        synchronized (this) {
            if (this.LIZIZ) {
                return jCurrentTimeMillis;
            }
            this.LIZIZ = true;
            File fileLIZJ2 = C0VC2.LIZJ();
            if (fileLIZJ2 != null) {
                fileLIZJ2.listFiles(new FileFilter() { // from class: X.0VCM
                    public final /* synthetic */ C793970VCp LIZ = C793960VCo.LIZ;

                    /* JADX WARN: Removed duplicated region for block: B:15:0x0043  */
                    @Override // java.io.FileFilter
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                        To view partially-correct add '--show-bad-code' argument
                    */
                    public final boolean accept(java.io.File r9) {
                        /*
                            r8 = this;
                            X.0VCp r0 = r8.LIZ
                            r0.getClass()
                            r7 = 0
                            r3 = 1
                            java.lang.String r2 = r9.getName()     // Catch: java.lang.Throwable -> L3f
                            java.lang.String r0 = ".bin"
                            int r1 = r2.lastIndexOf(r0)     // Catch: java.lang.Throwable -> L3f
                            r0 = -1
                            if (r1 == r0) goto L43
                            java.lang.String r1 = r2.substring(r7, r1)     // Catch: java.lang.Throwable -> L3f
                            java.lang.String r0 = "_"
                            java.lang.String[] r2 = r1.split(r0)     // Catch: java.lang.Throwable -> L3f
                            int r1 = r2.length     // Catch: java.lang.Throwable -> L3f
                            r0 = 2
                            if (r1 < r0) goto L43
                            r0 = r2[r3]     // Catch: java.lang.Throwable -> L3f
                            long r5 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Throwable -> L3f
                            long r3 = com.bytedance.mt.protector.impl.string2number.CastLongProtector.parseLong(r0)     // Catch: java.lang.Throwable -> L3f
                            r1 = 0
                            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
                            if (r0 < 0) goto L36
                            r0 = 16
                            long r1 = r3 >> r0
                        L36:
                            long r5 = r5 - r1
                            r1 = 604800000(0x240c8400, double:2.988109026E-315)
                            int r0 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
                            if (r0 < 0) goto L46
                            goto L43
                        L3f:
                            r0 = move-exception
                            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
                        L43:
                            X.C2404609bY.LIZ(r9)
                        L46:
                            return r7
                        */
                        throw new UnsupportedOperationException("Method not decompiled: X.C0VCM.accept(java.io.File):boolean");
                    }
                });
            }
            return jCurrentTimeMillis;
        }
    }
}
