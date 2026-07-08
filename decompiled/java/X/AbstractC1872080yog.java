package X;

import Y.ARunnableS0S4201000_16;
import com.bytedance.ies.xbridge.base.runtime.depend.IHostThreadPoolExecutorDepend;
import java.util.concurrent.ExecutorService;

/* JADX INFO: renamed from: X.0yog, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public abstract class AbstractC1872080yog extends AbstractC1064500do8 {
    public final String LIZIZ = "x.request";
    public final EnumC1063570dmd LIZJ = EnumC1063570dmd.PROTECT;

    public abstract void LJI(C1872070yof c1872070yof, C1872090yoh c1872090yoh, EnumC1059790dgX enumC1059790dgX);

    @Override // X.AbstractC1064500do8, X.InterfaceC1063690dmp
    public final EnumC1063570dmd getAccess() {
        return this.LIZJ;
    }

    @Override // X.InterfaceC1063690dmp
    public final String getName() {
        return this.LIZIZ;
    }

    @Override // X.AbstractC1064500do8, X.InterfaceC1063690dmp
    public final Class<C1872070yof> provideParamModel() {
        return C1872070yof.class;
    }

    @Override // X.AbstractC1064500do8, X.InterfaceC1063690dmp
    public final Class<C1872160yoo> provideResultModel() {
        return C1872160yoo.class;
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x013b  */
    @Override // X.InterfaceC1063690dmp
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZIZ(X.InterfaceC1107590evd r23, X.InterfaceC1063920dnC r24, X.EnumC1059790dgX r25) {
        /*
            Method dump skipped, instruction units count: 353
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC1872080yog.LIZIZ(X.0evd, X.0dnC, X.0dgX):void");
    }

    public final void LJII(int i, String str, String str2, String str3, Integer num, String str4) {
        C1871520ynm c1871520ynm;
        IHostThreadPoolExecutorDepend iHostThreadPoolExecutorDepend;
        ExecutorService normalThreadExecutor;
        C1871520ynm c1871520ynm2 = (C1871520ynm) LJFF(C1871520ynm.class);
        if (((c1871520ynm2 == null || (iHostThreadPoolExecutorDepend = c1871520ynm2.LJIIJ) == null) && ((c1871520ynm = C1871520ynm.LJIIL) == null || (iHostThreadPoolExecutorDepend = c1871520ynm.LJIIJ) == null)) || (normalThreadExecutor = iHostThreadPoolExecutorDepend.getNormalThreadExecutor()) == null) {
            normalThreadExecutor = C2126108Up.LIZ;
        }
        normalThreadExecutor.execute(new ARunnableS0S4201000_16(str, num, str2, i, str3, str4, this, 1));
    }
}
