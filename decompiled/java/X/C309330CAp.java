package X;

import com.bytedance.keva.Keva;
import com.bytedance.keva.KevaImpl;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.reflect.TypeToken;
import com.ss.android.ugc.aweme.keva.KevaInfo;
import java.util.List;

/* JADX INFO: renamed from: X.0CAp, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public class C309330CAp extends AbstractC309290CAl {
    public static final /* synthetic */ int LJIIIIZZ = 0;
    public List<KevaInfo> LJII;

    @Override // X.AbstractC309290CAl
    public final void LIZ() {
        this.LIZIZ = false;
    }

    @Override // X.AbstractC309290CAl
    public final void LIZIZ() {
        this.LIZIZ = true;
    }

    @Override // X.AbstractC309290CAl
    public String LIZJ() {
        return "cold_boot_keva_v2";
    }

    @Override // X.AbstractC309290CAl
    public boolean LIZLLL() {
        return false;
    }

    @Override // X.AbstractC309290CAl
    public final void LJ() {
        try {
            String string = Keva.getRepo((String) this.LJI.getValue()).getString("keva_info_list", null);
            if (string == null) {
                Keva repo = Keva.getRepo((String) this.LJI.getValue());
                if (repo != null) {
                    repo.storeLong("last_clear_time", System.currentTimeMillis());
                    C844470XAv.LIZ.getClass();
                    repo.storeLong("last_clear_version", C844470XAv.LIZLLL());
                    return;
                }
                return;
            }
            List<KevaInfo> list = (List) C08JS.LIZIZ().LJIIIIZZ(string, new TypeToken<List<KevaInfo>>() { // from class: X.0CAq
            }.getType());
            this.LJII = list;
            if (list == null || list.isEmpty()) {
                return;
            }
            for (KevaInfo kevaInfo : this.LJII) {
                LJFF();
                KevaImpl.getRepoSync(kevaInfo.repoName, kevaInfo.mode);
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C1AF0.LJ(th);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0057 A[Catch: all -> 0x006c, TryCatch #0 {all -> 0x006c, blocks: (B:2:0x0000, B:4:0x000e, B:7:0x0016, B:13:0x003d, B:14:0x0044, B:16:0x0048, B:18:0x004e, B:11:0x002c, B:20:0x0057, B:19:0x0053), top: B:25:0x0000 }] */
    @Override // X.AbstractC309290CAl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJII() {
        /*
            r10 = this;
            X.01GW r0 = r10.LJI     // Catch: java.lang.Throwable -> L6c
            java.lang.Object r0 = r0.getValue()     // Catch: java.lang.Throwable -> L6c
            java.lang.String r0 = (java.lang.String) r0     // Catch: java.lang.Throwable -> L6c
            com.bytedance.keva.Keva r6 = com.bytedance.keva.Keva.getRepo(r0)     // Catch: java.lang.Throwable -> L6c
            if (r6 == 0) goto L53
            java.util.List<com.ss.android.ugc.aweme.keva.KevaInfo> r0 = r10.LJII     // Catch: java.lang.Throwable -> L6c
            java.lang.String r5 = "last_clear_version"
            java.lang.String r7 = "last_clear_time"
            if (r0 == 0) goto L57
            long r8 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Throwable -> L6c
            r1 = 0
            long r3 = r6.getLong(r7, r1)     // Catch: java.lang.Throwable -> L6c
            long r8 = r8 - r3
            r3 = 864000000(0x337f9800, double:4.26872718E-315)
            int r0 = (r8 > r3 ? 1 : (r8 == r3 ? 0 : -1))
            if (r0 > 0) goto L2c
            int r0 = (r8 > r1 ? 1 : (r8 == r1 ? 0 : -1))
            if (r0 >= 0) goto L3d
        L2c:
            long r3 = r6.getLong(r5, r1)     // Catch: java.lang.Throwable -> L6c
            X.0XAv r0 = X.C844470XAv.LIZ     // Catch: java.lang.Throwable -> L6c
            r0.getClass()     // Catch: java.lang.Throwable -> L6c
            long r1 = X.C844470XAv.LIZLLL()     // Catch: java.lang.Throwable -> L6c
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 != 0) goto L57
        L3d:
            java.util.Set<com.ss.android.ugc.aweme.keva.KevaInfo> r1 = r10.LIZLLL     // Catch: java.lang.Throwable -> L6c
            java.util.List<com.ss.android.ugc.aweme.keva.KevaInfo> r0 = r10.LJII     // Catch: java.lang.Throwable -> L6c
            r1.addAll(r0)     // Catch: java.lang.Throwable -> L6c
        L44:
            java.util.List<com.ss.android.ugc.aweme.keva.KevaInfo> r0 = r10.LJII     // Catch: java.lang.Throwable -> L6c
            if (r0 == 0) goto L53
            boolean r0 = r0.isEmpty()     // Catch: java.lang.Throwable -> L6c
            if (r0 != 0) goto L53
            java.util.List<com.ss.android.ugc.aweme.keva.KevaInfo> r0 = r10.LJII     // Catch: java.lang.Throwable -> L6c
            r0.clear()     // Catch: java.lang.Throwable -> L6c
        L53:
            super.LJII()     // Catch: java.lang.Throwable -> L6c
            goto L6b
        L57:
            long r0 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Throwable -> L6c
            r6.storeLong(r7, r0)     // Catch: java.lang.Throwable -> L6c
            X.0XAv r0 = X.C844470XAv.LIZ     // Catch: java.lang.Throwable -> L6c
            r0.getClass()     // Catch: java.lang.Throwable -> L6c
            long r0 = X.C844470XAv.LIZLLL()     // Catch: java.lang.Throwable -> L6c
            r6.storeLong(r5, r0)     // Catch: java.lang.Throwable -> L6c
            goto L44
        L6b:
            return
        L6c:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
            X.C1AF0.LJ(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C309330CAp.LJII():void");
    }
}
