package X;

import com.bytedance.keva.Keva;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.s;
import com.ss.android.ugc.aweme.template.TemplateOperationData;
import java.util.HashMap;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0L62, reason: invalid class name */
/* JADX INFO: loaded from: classes9.dex */
public final class C0L62 {
    public static AnonymousClass0956 LIZIZ;
    public static final HashMap<String, ReentrantLock> LJ;
    public static final HashMap<String, ReentrantLock> LJFF;
    public static TemplateOperationData LJI;
    public static final C0L62 LIZ = new C0L62();
    public static final ReentrantLock LIZJ = new ReentrantLock();
    public static final ReentrantLock LIZLLL = new ReentrantLock();

    static {
        new ReentrantLock();
        LJ = new HashMap<>();
        LJFF = new HashMap<>();
    }

    public static TemplateOperationData LIZJ() {
        if (LJI == null) {
            LJI = LJ();
        }
        return LJI;
    }

    public static TemplateOperationData LJ() {
        String string = Keva.getRepo("template_operation").getString("template_operation_data", "");
        if (string.length() == 0) {
            return null;
        }
        try {
            C1227904rF.LIZ.getClass();
            return (TemplateOperationData) C1227904rF.LIZIZ(string, TemplateOperationData.class);
        } catch (s e) {
            TryCatchGuardChecker.doCheck(e);
            C201955140j.LJIIJ(C1398350mUb.LIZIZ, "msg-log", e);
            return null;
        }
    }

    public static ReentrantLock LIZIZ(String str) {
        ReentrantLock reentrantLock;
        if (((Boolean) C264320AXm.LIZ.getValue()).booleanValue()) {
            HashMap<String, ReentrantLock> map = LJ;
            synchronized (map) {
                try {
                    ReentrantLock reentrantLock2 = map.get(str);
                    if (reentrantLock2 == null) {
                        reentrantLock2 = new ReentrantLock();
                        map.put(str, reentrantLock2);
                    }
                    reentrantLock = reentrantLock2;
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
            return reentrantLock;
        }
        HashMap<String, ReentrantLock> map2 = LJ;
        ReentrantLock reentrantLock3 = map2.get(str);
        if (reentrantLock3 == null) {
            reentrantLock3 = new ReentrantLock();
            map2.put(str, reentrantLock3);
        }
        return reentrantLock3;
    }

    public static String LIZLLL(String str) {
        String absolutePath = C0CHQ.LIZ().LJJIIJZLJL().getPathService().LJIIJ(EnumC20227914Cv.UGC_TEMPLATE, "template_operation", true).getAbsolutePath();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(absolutePath);
        sbLIZ.append('/');
        sbLIZ.append(str);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static String LJFF(C0L65 c0l65, String str) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(c0l65.LIZ());
        sbLIZ.append('_');
        sbLIZ.append(str);
        sbLIZ.append("_activity_id");
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static ReentrantLock LJI(C0L65 c0l65, String str) {
        ReentrantLock reentrantLock;
        if (Intrinsics.LJFF(c0l65, C0L66.LIZ)) {
            return LIZIZ(str);
        }
        if (((Boolean) C264320AXm.LIZ.getValue()).booleanValue()) {
            HashMap<String, ReentrantLock> map = LJFF;
            synchronized (map) {
                try {
                    ReentrantLock reentrantLock2 = map.get(str);
                    if (reentrantLock2 == null) {
                        reentrantLock2 = new ReentrantLock();
                        map.put(str, reentrantLock2);
                    }
                    reentrantLock = reentrantLock2;
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
            return reentrantLock;
        }
        HashMap<String, ReentrantLock> map2 = LJFF;
        ReentrantLock reentrantLock3 = map2.get(str);
        if (reentrantLock3 == null) {
            reentrantLock3 = new ReentrantLock();
            map2.put(str, reentrantLock3);
        }
        return reentrantLock3;
    }

    public static String LJII(C0L65 c0l65, String str) {
        String absolutePath = C0CHQ.LIZ().LJJIIJZLJL().getPathService().LJIIJ(EnumC20227914Cv.UGC_TEMPLATE, "template_operation", true).getAbsolutePath();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(absolutePath);
        sbLIZ.append('/');
        sbLIZ.append(c0l65.LIZ());
        sbLIZ.append('_');
        sbLIZ.append(str);
        sbLIZ.append("_tab_lottie.json");
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static String LJIIIIZZ(C0L65 c0l65, String str) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(c0l65.LIZ());
        sbLIZ.append('_');
        sbLIZ.append(str);
        sbLIZ.append("_tab");
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0098  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZ(java.util.List r9, java.lang.String r10, java.lang.String r11, X.InterfaceC1364105Vn r12) {
        /*
            r8 = this;
            boolean r0 = r12 instanceof X.C0L61
            if (r0 == 0) goto L98
            r4 = r12
            X.0L61 r4 = (X.C0L61) r4
            int r2 = r4.LLILZLL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L98
            int r2 = r2 - r1
            r4.LLILZLL = r2
        L12:
            java.lang.Object r2 = r4.LLILZ
            java.lang.Object r5 = X.C099R.LJFF()
            int r0 = r4.LLILZLL
            r1 = 1
            if (r0 == 0) goto L29
            if (r0 != r1) goto L9f
            X.C155000ia.LIZIZ(r2)
        L22:
            X.00o6 r2 = (X.C189200o6) r2
            java.lang.Object r0 = r2.m10unboximpl()
            return r0
        L29:
            X.C155000ia.LIZIZ(r2)
            r4.LL = r10
            r4.LLILLJJLI = r11
            r4.LLILLL = r9
            r4.LLILZLL = r1
            X.1DEt r6 = new X.1DEt
            X.05Vn r0 = X.C099M.LIZLLL(r4)
            r6.<init>(r1, r0)
            r6.LJIJJ()
            X.1Ds4 r0 = X.C0CHQ.LIZ()
            X.0Moe r0 = r0.LJJIIJZLJL()
            X.0MYj r3 = r0.getPathService()
            X.14Cv r2 = X.EnumC20227914Cv.UGC_TEMPLATE
            java.lang.String r1 = "template_operation"
            r0 = 1
            X.0VSJ r0 = r3.LJIIJ(r2, r1, r0)
            java.lang.String r7 = r0.getAbsolutePath()
            X.0L63 r1 = new java.lang.Object() { // from class: X.0L63
                static {
                    /*
                        X.0L63 r0 = new X.0L63
                        r0.<init>()
                        
                        // error: 0x0005: SPUT (r0 I:X.0L63) X.0L63.LIZ X.0L63
                        return
                    */
                    throw new UnsupportedOperationException("Method not decompiled: X.C0L63.<clinit>():void");
                }

                {
                    /*
                        r0 = this;
                        r0.<init>()
                        return
                    */
                    throw new UnsupportedOperationException("Method not decompiled: X.C0L63.<init>():void");
                }
            }
            X.09qu r3 = new X.09qu
            r0 = 4
            r3.<init>(r6, r0)
            r1.getClass()
            com.ss.android.ugc.aweme.framework.services.ServiceManager r1 = com.ss.android.ugc.aweme.framework.services.ServiceManager.get()
            java.lang.Class<com.ss.android.ugc.aweme.download.component_api.service.IDownloadService> r0 = com.ss.android.ugc.aweme.download.component_api.service.IDownloadService.class
            java.lang.Object r0 = r1.getService(r0)
            com.ss.android.ugc.aweme.download.component_api.service.IBaseDownloadService r0 = (com.ss.android.ugc.aweme.download.component_api.service.IBaseDownloadService) r0
            X.1B7q r2 = r0.with(r10)
            r2.LJIIIIZZ = r9
            r0 = 3
            r2.LJII = r0
            r2.LIZJ = r11
            r2.LJ = r7
            X.09qu r1 = new X.09qu
            r0 = 3
            r1.<init>(r3, r0)
            r2.LJIIL = r1
            r2.LIZJ()
            java.lang.Object r2 = r6.LJIJ()
            java.lang.Object r0 = X.C099R.LJFF()
            if (r2 != r0) goto L95
            X.C099Q.LIZJ(r4)
        L95:
            if (r2 != r5) goto L22
            return r5
        L98:
            X.0L61 r4 = new X.0L61
            r4.<init>(r8, r12)
            goto L12
        L9f:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0L62.LIZ(java.util.List, java.lang.String, java.lang.String, X.05Vn):java.lang.Object");
    }
}
