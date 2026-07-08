package X;

import Y.ARunnableS0S4201000_16;
import com.bytedance.ies.xbridge.base.runtime.depend.IHostLogDepend;
import com.bytedance.ies.xbridge.base.runtime.depend.IHostNetworkDepend;
import com.bytedance.ies.xbridge.base.runtime.depend.IHostThreadPoolExecutorDepend;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Semaphore;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0yod, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C1872050yod extends AbstractC1872080yog {
    public static Semaphore LIZLLL;

    private final ExecutorService LJIIIIZZ() {
        C1871520ynm c1871520ynm;
        IHostThreadPoolExecutorDepend iHostThreadPoolExecutorDepend;
        ExecutorService normalThreadExecutor;
        C1871520ynm c1871520ynm2 = (C1871520ynm) LJFF(C1871520ynm.class);
        return (((c1871520ynm2 == null || (iHostThreadPoolExecutorDepend = c1871520ynm2.LJIIJ) == null) && ((c1871520ynm = C1871520ynm.LJIIL) == null || (iHostThreadPoolExecutorDepend = c1871520ynm.LJIIJ) == null)) || (normalThreadExecutor = iHostThreadPoolExecutorDepend.getNormalThreadExecutor()) == null) ? C2126108Up.LIZ : normalThreadExecutor;
    }

    public final int LJIIIZ() {
        IHostThreadPoolExecutorDepend iHostThreadPoolExecutorDepend;
        IHostThreadPoolExecutorDepend iHostThreadPoolExecutorDepend2;
        C1871520ynm c1871520ynm = (C1871520ynm) LJFF(C1871520ynm.class);
        if (c1871520ynm != null && (iHostThreadPoolExecutorDepend2 = c1871520ynm.LJIIJ) != null) {
            return iHostThreadPoolExecutorDepend2.requestConcurrentNumber();
        }
        C1871520ynm c1871520ynm2 = C1871520ynm.LJIIL;
        if (c1871520ynm2 == null || (iHostThreadPoolExecutorDepend = c1871520ynm2.LJIIJ) == null) {
            return 0;
        }
        return iHostThreadPoolExecutorDepend.requestConcurrentNumber();
    }

    public final IHostLogDepend LJIIJ() {
        IHostLogDepend iHostLogDepend;
        C1871520ynm c1871520ynm = (C1871520ynm) LJFF(C1871520ynm.class);
        if (c1871520ynm != null && (iHostLogDepend = c1871520ynm.LIZIZ) != null) {
            return iHostLogDepend;
        }
        C1871520ynm c1871520ynm2 = C1871520ynm.LJIIL;
        if (c1871520ynm2 != null) {
            return c1871520ynm2.LIZIZ;
        }
        return null;
    }

    public final IHostNetworkDepend LJIIJJI() {
        IHostNetworkDepend iHostNetworkDepend;
        IHostNetworkDepend iHostNetworkDepend2;
        C1871520ynm c1871520ynm = (C1871520ynm) LJFF(C1871520ynm.class);
        if (c1871520ynm != null && (iHostNetworkDepend2 = c1871520ynm.LJIIIIZZ) != null) {
            return iHostNetworkDepend2;
        }
        C1871520ynm c1871520ynm2 = C1871520ynm.LJIIL;
        return (c1871520ynm2 == null || (iHostNetworkDepend = c1871520ynm2.LJIIIIZZ) == null) ? new C1515160pX0() : iHostNetworkDepend;
    }

    public final InterfaceC1872030yob LJIIL() {
        InterfaceC1872030yob interfaceC1872030yob;
        InterfaceC1872030yob interfaceC1872030yob2;
        C1871520ynm c1871520ynm = (C1871520ynm) LJFF(C1871520ynm.class);
        if (c1871520ynm != null && (interfaceC1872030yob2 = c1871520ynm.LJIIJJI) != null) {
            return interfaceC1872030yob2;
        }
        C1871520ynm c1871520ynm2 = C1871520ynm.LJIIL;
        return (c1871520ynm2 == null || (interfaceC1872030yob = c1871520ynm2.LJIIJJI) == null) ? new InterfaceC1872030yob() { // from class: X.0yoS
            @Override // X.InterfaceC1872030yob
            public final boolean LIZ(String str) {
                return false;
            }

            @Override // X.InterfaceC1872030yob
            public final void LIZJ(Map map) {
            }

            @Override // X.InterfaceC1872030yob
            public final JSONObject LIZIZ(String str, String str2, byte[] bArr) {
                return new JSONObject();
            }
        } : interfaceC1872030yob;
    }

    public C1872050yod() {
        if (LIZLLL != null || LJIIIZ() <= 0) {
            return;
        }
        LIZLLL = new Semaphore(LJIIIZ());
    }

    public final void LJIILL(long j) throws JSONException {
        String strLIZ;
        InterfaceC1052500dUm interfaceC1052500dUm;
        IHostLogDepend iHostLogDependLJIIJ = LJIIJ();
        if (iHostLogDependLJIIJ != null) {
            C1064350dnt c1064350dnt = new C1064350dnt();
            C1059860dge c1059860dge = this.LIZ;
            if (c1059860dge != null && (interfaceC1052500dUm = (InterfaceC1052500dUm) c1059860dge.LIZ(InterfaceC1052500dUm.class)) != null) {
                strLIZ = interfaceC1052500dUm.LIZ();
            } else {
                strLIZ = null;
            }
            c1064350dnt.LIZ = strLIZ;
            c1064350dnt.LIZIZ = "XRequestSemaphoreAcquireTimeEvent";
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("semaphoreAcquireDuration", j);
            c1064350dnt.LIZJ = jSONObject;
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("semaphoreAcquireDuration", j);
            c1064350dnt.LIZLLL = jSONObject2;
            iHostLogDependLJIIJ.customReportJSBInfo(c1064350dnt);
        }
    }

    public final void LJIILLIIL(C1872180yoq c1872180yoq) throws JSONException {
        IHostLogDepend iHostLogDependLJIIJ;
        String strLIZ;
        InterfaceC1052500dUm interfaceC1052500dUm;
        if (c1872180yoq != null && (iHostLogDependLJIIJ = LJIIJ()) != null) {
            C1064350dnt c1064350dnt = new C1064350dnt();
            C1059860dge c1059860dge = this.LIZ;
            if (c1059860dge != null && (interfaceC1052500dUm = (InterfaceC1052500dUm) c1059860dge.LIZ(InterfaceC1052500dUm.class)) != null) {
                strLIZ = interfaceC1052500dUm.LIZ();
            } else {
                strLIZ = null;
            }
            c1064350dnt.LIZ = strLIZ;
            c1064350dnt.LIZIZ = "XRequestPerfTimeLineEvent";
            JSONObject jSONObject = new JSONObject();
            for (Map.Entry<String, Object> entry : c1872180yoq.LIZ().entrySet()) {
                jSONObject.put(entry.getKey(), entry.getValue());
            }
            c1064350dnt.LIZJ = jSONObject;
            JSONObject jSONObject2 = new JSONObject();
            for (Map.Entry<String, Object> entry2 : c1872180yoq.LIZ().entrySet()) {
                jSONObject2.put(entry2.getKey(), entry2.getValue());
            }
            c1064350dnt.LIZLLL = jSONObject2;
            iHostLogDependLJIIJ.customReportJSBInfo(c1064350dnt);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x00ef  */
    @Override // X.AbstractC1872080yog
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJI(final X.C1872070yof r24, final X.C1872090yoh r25, final X.EnumC1059790dgX r26) {
        /*
            Method dump skipped, instruction units count: 265
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1872050yod.LJI(X.0yof, X.0yoh, X.0dgX):void");
    }

    public final void LJIILJJIL(int i, String str, String str2, String str3, Integer num, String str4) {
        LJIIIIZZ().execute(new ARunnableS0S4201000_16(str, num, str2, i, str3, str4, this, 2));
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:100:0x0280  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0273  */
    /* JADX WARN: Type inference failed for: r3v2, types: [X.0C9A, X.0yol] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJIILIIL(X.InterfaceC1107590evd r32, final X.C1872070yof r33, X.InterfaceC1107590evd r34, final X.EnumC1059790dgX r35, final X.InterfaceC1870490ym7 r36, final java.util.Map<java.lang.String, java.lang.Long> r37, X.C1872110yoj r38, X.InterfaceC1548390qOb r39, java.lang.String r40, X.EnumC1874000yrm r41, java.lang.Object r42, int r43, boolean r44, boolean r45) {
        /*
            Method dump skipped, instruction units count: 792
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1872050yod.LJIILIIL(X.0evd, X.0yof, X.0evd, X.0dgX, X.0ym7, java.util.Map, X.0yoj, X.0qOb, java.lang.String, X.0yrm, java.lang.Object, int, boolean, boolean):void");
    }
}
