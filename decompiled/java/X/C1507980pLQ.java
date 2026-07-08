package X;

import android.os.SystemClock;
import com.bytedance.android.btm.impl.page.model.PageInfo;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.ecommerce.preloader.experiment.ECPreloadDispatchGlobalConfig;
import com.ss.android.ugc.aweme.ecommerce.saas.core.IECommerceHostService;
import com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.application.IApplicationDependencyService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0pLQ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1507980pLQ {
    public final C1507990pLR LIZ;
    public final String LIZIZ;
    public InterfaceC1508150pLh LIZLLL;
    public int LIZJ = 1;
    public final ArrayList<InterfaceC1508140pLg> LJ = new ArrayList<>();
    public long LJFF = -1;
    public long LJI = -1;
    public int LJII = -1;

    public final boolean LIZLLL() {
        if (this.LJFF <= 0) {
            return false;
        }
        long jCurrentTimeMillis = System.currentTimeMillis() - this.LJFF;
        ECPreloadDispatchGlobalConfig eCPreloadDispatchGlobalConfig = C1508080pLa.LIZ().preloadConfig;
        return jCurrentTimeMillis > ((long) (eCPreloadDispatchGlobalConfig != null ? eCPreloadDispatchGlobalConfig.taskTimeout : 30000));
    }

    /* JADX WARN: Removed duplicated region for block: B:47:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x008b A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0015 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean LJ() {
        /*
            r6 = this;
            int r0 = r6.LJII
            r2 = 1
            if (r0 < 0) goto L9
            if (r0 == r2) goto L8
            r2 = 0
        L8:
            return r2
        L9:
            com.ss.android.ugc.aweme.ecommerce.preloader.experiment.ECPreloadDispatcherConfig r0 = X.C1508080pLa.LIZ()
            java.util.List<com.ss.android.ugc.aweme.ecommerce.preloader.experiment.ExemptCondition> r0 = r0.exemptTask
            if (r0 == 0) goto L87
            java.util.Iterator r5 = r0.iterator()
        L15:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L87
            java.lang.Object r4 = r5.next()
            r3 = r4
            com.ss.android.ugc.aweme.ecommerce.preloader.experiment.ExemptCondition r3 = (com.ss.android.ugc.aweme.ecommerce.preloader.experiment.ExemptCondition) r3
            java.util.List<java.lang.String> r0 = r3.preloadTypeList
            if (r0 == 0) goto L2c
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L41
        L2c:
            java.util.List<java.lang.String> r0 = r3.preloadNameList
            if (r0 == 0) goto L36
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L41
        L36:
            java.util.List<java.lang.String> r0 = r3.sceneList
            if (r0 == 0) goto L15
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L41
            goto L15
        L41:
            java.util.List<java.lang.String> r0 = r3.preloadTypeList
            if (r0 == 0) goto L58
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L58
            java.util.List<java.lang.String> r1 = r3.preloadTypeList
            X.0pLR r0 = r6.LIZ
            java.lang.String r0 = r0.LIZJ
            boolean r1 = r1.contains(r0)
            if (r1 != 0) goto L59
            goto L15
        L58:
            r1 = 0
        L59:
            java.util.List<java.lang.String> r0 = r3.preloadNameList
            if (r0 == 0) goto L70
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L70
            java.util.List<java.lang.String> r1 = r3.preloadNameList
            X.0pLR r0 = r6.LIZ
            java.lang.String r0 = r0.LIZ
            boolean r1 = r1.contains(r0)
            if (r1 != 0) goto L70
            goto L15
        L70:
            java.util.List<java.lang.String> r0 = r3.sceneList
            if (r0 == 0) goto L89
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L89
            java.util.List<java.lang.String> r1 = r3.sceneList
            X.0pLR r0 = r6.LIZ
            java.lang.String r0 = r0.LIZIZ
            boolean r0 = r1.contains(r0)
            if (r0 != 0) goto L8b
            goto L15
        L87:
            r0 = 0
            goto L8e
        L89:
            if (r1 == 0) goto L15
        L8b:
            if (r4 == 0) goto L87
            r0 = 1
        L8e:
            r6.LJII = r0
            if (r0 == r2) goto L93
            r2 = 0
        L93:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1507980pLQ.LJ():boolean");
    }

    public final void LIZJ() {
        IECommerceHostService iECommerceHostService;
        IECommerceHostService iECommerceHostService2;
        this.LJI = System.currentTimeMillis();
        LIZIZ(3, null);
        try {
            this.LIZLLL = this.LIZ.LJFF.LIZ(new C1508120pLe(this));
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            if (C034S.LIZ()) {
                C1120604Zw.LIZ.LIZ();
                long jElapsedRealtime = SystemClock.elapsedRealtime();
                iECommerceHostService = (IECommerceHostService) ServiceManager.get().getService(IApplicationDependencyService.class);
                C1AQS.LIZJ(jElapsedRealtime, 1, IApplicationDependencyService.class.getName(), iECommerceHostService != null ? iECommerceHostService.getClass().getName() : null, iECommerceHostService != null);
            } else {
                C1120604Zw.LIZ.LIZ();
                iECommerceHostService = (IECommerceHostService) C1120604Zw.LIZJ.LIZLLL(IApplicationDependencyService.class);
            }
            if (!((IApplicationDependencyService) iECommerceHostService).isDebug()) {
                if (C034S.LIZ()) {
                    C1120604Zw.LIZ.LIZ();
                    long jElapsedRealtime2 = SystemClock.elapsedRealtime();
                    iECommerceHostService2 = (IECommerceHostService) ServiceManager.get().getService(IApplicationDependencyService.class);
                    C1AQS.LIZJ(jElapsedRealtime2, 1, IApplicationDependencyService.class.getName(), iECommerceHostService2 != null ? iECommerceHostService2.getClass().getName() : null, iECommerceHostService2 != null);
                } else {
                    C1120604Zw.LIZ.LIZ();
                    iECommerceHostService2 = (IECommerceHostService) C1120604Zw.LIZJ.LIZLLL(IApplicationDependencyService.class);
                }
                if (!Intrinsics.LJFF(((IApplicationDependencyService) iECommerceHostService2).getChannel(), "local_test")) {
                    C1019103yf.LIZ(EnumC1014603xw.ERR86, th, null);
                    return;
                }
            }
            throw th;
        }
    }

    public C1507980pLQ(C1507990pLR c1507990pLR) {
        this.LIZ = c1507990pLR;
        this.LIZIZ = c1507990pLR.LJIIL;
    }

    public static void LIZ(C1507980pLQ c1507980pLQ) {
        c1507980pLQ.LIZIZ(6, null);
        InterfaceC1508150pLh interfaceC1508150pLh = c1507980pLQ.LIZLLL;
        if (interfaceC1508150pLh != null) {
            interfaceC1508150pLh.LIZ();
        }
    }

    public final synchronized void LIZIZ(int i, String str) {
        String str2;
        String pageBtm;
        if (C1507960pLO.LIZ(this.LIZJ)) {
            return;
        }
        InterfaceC1508140pLg interfaceC1508140pLg = this.LIZ.LJIIIIZZ;
        if (interfaceC1508140pLg != null) {
            interfaceC1508140pLg.onStateChange(i);
        }
        this.LIZJ = i;
        Iterator<InterfaceC1508140pLg> it2 = this.LJ.iterator();
        while (it2.hasNext()) {
            it2.next().onStateChange(this.LIZJ);
        }
        int i2 = this.LIZJ;
        if (i2 == 2) {
            int i3 = C1505950pI9.LIZ;
            C1507990pLR c1507990pLR = this.LIZ;
            String str3 = c1507990pLR.LJIILIIL;
            boolean zLJ = LJ();
            if (C1505950pI9.LJFF()) {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("stage", "create");
                if (c1507990pLR.LJIILJJIL > 0) {
                    jSONObject.put("provider_to_create_dur", System.currentTimeMillis() - c1507990pLR.LJIILJJIL);
                }
                C1505950pI9.LIZIZ(jSONObject, str3, zLJ, c1507990pLR);
            }
        } else if (i2 == 3) {
            long j = this.LJI - this.LJFF;
            int i4 = C1505950pI9.LIZ;
            C1507990pLR c1507990pLR2 = this.LIZ;
            String str4 = c1507990pLR2.LJIILIIL;
            boolean zLJ2 = LJ();
            if (C1505950pI9.LJFF()) {
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("stage", "execute");
                jSONObject2.put("create_to_execute_dur", j);
                C1505950pI9.LIZIZ(jSONObject2, str4, zLJ2, c1507990pLR2);
            }
        } else if (C1507960pLO.LIZ(i2)) {
            long jCurrentTimeMillis = System.currentTimeMillis() - this.LJI;
            long jCurrentTimeMillis2 = System.currentTimeMillis();
            long j2 = this.LJFF;
            long j3 = jCurrentTimeMillis2 - j2;
            long j4 = this.LJI - j2;
            switch (this.LIZJ) {
                case 4:
                    str2 = "finish";
                    break;
                case 5:
                    str2 = "fail";
                    break;
                case 6:
                    str2 = "cancel";
                    break;
                case 7:
                    str2 = "wait_timeout";
                    break;
                case 8:
                    str2 = "execute_timeout";
                    break;
                default:
                    str2 = "";
                    break;
            }
            C21248618Dk c21248618Dk = C21248618Dk.LIZ;
            Object objLIZ = C18CJ.LIZ();
            c21248618Dk.getClass();
            PageInfo pageInfoLJIIIIZZ = C21248618Dk.LJIIIIZZ(objLIZ);
            if (pageInfoLJIIIIZZ != null) {
                pageBtm = pageInfoLJIIIIZZ.getPageBtm();
            } else {
                pageBtm = null;
            }
            String strLIZ = C1326620kcu.LIZ(pageBtm);
            int i5 = C1505950pI9.LIZ;
            C1507990pLR c1507990pLR3 = this.LIZ;
            C1505950pI9.LIZLLL(c1507990pLR3.LJIILIIL, c1507990pLR3, str2, str, j4, jCurrentTimeMillis, j3, LJ(), strLIZ);
        }
    }
}
