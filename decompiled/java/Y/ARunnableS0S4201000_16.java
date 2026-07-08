package Y;

import X.AbstractC1872080yog;
import X.C098200Yq;
import X.C1064300dno;
import X.C1064310dnp;
import X.C1871520ynm;
import X.C1872050yod;
import X.C1872260yoy;
import X.C189200o6;
import X.C1C7U;
import X.C2097608Jq;
import X.InterfaceC1041930dDj;
import X.InterfaceC634840OvC;
import android.view.View;
import android.webkit.WebView;
import com.bytedance.android.monitorV2.lynx.LynxViewMonitor;
import com.bytedance.android.monitorV2.webview.WebViewMonitorHelper;
import com.bytedance.ies.xbridge.base.runtime.depend.IHostLogDepend;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.lynx.tasm.LynxView;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes17.dex */
public class ARunnableS0S4201000_16 implements Runnable {
    public final int $t;
    public int i6;
    public Object l4;
    public Object l5;
    public String s0;
    public String s1;
    public String s2;
    public String s3;

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.$t) {
            case 0:
                run$0(this);
                break;
            case 1:
                run$1(this);
                break;
            case 2:
                run$2(this);
                break;
        }
    }

    public String toString() {
        return this.$t + "_" + super.toString();
    }

    public final void LIZ$0() {
        WebView webView;
        Object c098200Yq;
        LynxView lynxView;
        Object c098200Yq2;
        String str = this.s0;
        C1872260yoy c1872260yoy = (C1872260yoy) this.l4;
        String str2 = this.s1;
        int i = this.i6;
        String str3 = this.s2;
        String str4 = this.s3;
        Integer num = (Integer) this.l5;
        try {
            boolean zLJFF = Intrinsics.LJFF(str, "LYNX");
            C189200o6 c189200o6M1boximpl = null;
            if (zLJFF) {
                InterfaceC634840OvC interfaceC634840OvC = c1872260yoy.IBridgeSdkContext;
                View view = interfaceC634840OvC != null ? interfaceC634840OvC.getView() : null;
                if ((view instanceof LynxView) && (lynxView = (LynxView) view) != null) {
                    try {
                        LynxViewMonitor.Companion.getClass();
                        LynxViewMonitor lynxViewMonitor = LynxViewMonitor.INSTANCE;
                        C1064310dnp c1064310dnp = new C1064310dnp();
                        c1064310dnp.LJII = str2;
                        c1064310dnp.LJIIIZ = i;
                        c1064310dnp.LJIIJ = str3;
                        c1064310dnp.LJI = str4;
                        c1064310dnp.LJIIIIZZ = num != null ? num.intValue() : 0;
                        lynxViewMonitor.reportJsbFetchError(lynxView, c1064310dnp);
                        c098200Yq2 = Unit.LIZ;
                        C189200o6.m2constructorimpl(c098200Yq2);
                    } catch (Throwable th) {
                        TryCatchGuardChecker.doCheck(th);
                        c098200Yq2 = new C098200Yq(th);
                        C189200o6.m2constructorimpl(c098200Yq2);
                    }
                    c189200o6M1boximpl = C189200o6.m1boximpl(c098200Yq2);
                }
            } else {
                InterfaceC634840OvC interfaceC634840OvC2 = c1872260yoy.IBridgeSdkContext;
                View view2 = interfaceC634840OvC2 != null ? interfaceC634840OvC2.getView() : null;
                if ((view2 instanceof WebView) && (webView = (WebView) view2) != null) {
                    try {
                        InterfaceC1041930dDj webViewMonitorHelper = WebViewMonitorHelper.getInstance();
                        C1064300dno c1064300dno = new C1064300dno();
                        c1064300dno.LIZIZ = str2;
                        c1064300dno.LIZLLL = i;
                        c1064300dno.LJ = str3;
                        c1064300dno.LIZ = str4;
                        c1064300dno.LIZJ = num != null ? num.intValue() : 0;
                        webViewMonitorHelper.handleFetchError(webView, c1064300dno);
                        c098200Yq = Unit.LIZ;
                        C189200o6.m2constructorimpl(c098200Yq);
                    } catch (Throwable th2) {
                        TryCatchGuardChecker.doCheck(th2);
                        c098200Yq = new C098200Yq(th2);
                        C189200o6.m2constructorimpl(c098200Yq);
                    }
                    c189200o6M1boximpl = C189200o6.m1boximpl(c098200Yq);
                }
            }
            C189200o6.m2constructorimpl(c189200o6M1boximpl);
        } catch (Throwable th3) {
            TryCatchGuardChecker.doCheck(th3);
            C189200o6.m2constructorimpl(new C098200Yq(th3));
        }
    }

    public final void LIZ$1() {
        C1871520ynm c1871520ynm;
        IHostLogDepend iHostLogDepend;
        String str = this.s0;
        String str2 = this.s1;
        Integer num = (Integer) this.l4;
        int i = this.i6;
        String str3 = this.s2;
        String str4 = this.s3;
        AbstractC1872080yog abstractC1872080yog = (AbstractC1872080yog) this.l5;
        try {
            Pair[] pairArr = new Pair[6];
            pairArr[0] = new Pair("method", str);
            pairArr[1] = new Pair("url", str2);
            pairArr[2] = new Pair("statusCode", Integer.valueOf(num != null ? num.intValue() : -1));
            pairArr[3] = new Pair("requestErrorCode", Integer.valueOf(i));
            pairArr[4] = new Pair("requestErrorMsg", str3);
            pairArr[5] = new Pair("platform", str4);
            Map<String, ? extends Object> mapLJIIJ = C2097608Jq.LJIIJ(pairArr);
            abstractC1872080yog.getClass();
            C1871520ynm c1871520ynm2 = (C1871520ynm) abstractC1872080yog.LJFF(C1871520ynm.class);
            Unit unitReportJSBFetchError = null;
            if ((c1871520ynm2 != null && (iHostLogDepend = c1871520ynm2.LIZIZ) != null) || ((c1871520ynm = C1871520ynm.LJIIL) != null && (iHostLogDepend = c1871520ynm.LIZIZ) != null)) {
                unitReportJSBFetchError = iHostLogDepend.reportJSBFetchError(abstractC1872080yog.LIZ, mapLJIIJ);
            }
            C189200o6.m2constructorimpl(unitReportJSBFetchError);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
        }
    }

    public final void LIZ$2() {
        String str = this.s0;
        String str2 = this.s1;
        Integer num = (Integer) this.l4;
        int i = this.i6;
        String str3 = this.s2;
        String str4 = this.s3;
        C1872050yod c1872050yod = (C1872050yod) this.l5;
        try {
            Pair[] pairArr = new Pair[6];
            pairArr[0] = new Pair("method", str);
            pairArr[1] = new Pair("url", str2);
            pairArr[2] = new Pair("statusCode", Integer.valueOf(num != null ? num.intValue() : -1));
            pairArr[3] = new Pair("requestErrorCode", Integer.valueOf(i));
            pairArr[4] = new Pair("requestErrorMsg", str3);
            pairArr[5] = new Pair("platform", str4);
            Map<String, ? extends Object> mapLJIIJ = C2097608Jq.LJIIJ(pairArr);
            IHostLogDepend iHostLogDependLJIIJ = c1872050yod.LJIIJ();
            C189200o6.m2constructorimpl(iHostLogDependLJIIJ != null ? iHostLogDependLJIIJ.reportJSBFetchError(c1872050yod.LIZ, mapLJIIJ) : null);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
        }
    }

    public static final void run$0(ARunnableS0S4201000_16 aRunnableS0S4201000_16) {
        boolean zLIZ;
        C1C7U.LIZ("XRequestForThirdMethodIDL@e66c.reportJSBFetchError$1");
        try {
            aRunnableS0S4201000_16.LIZ$0();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("XRequestForThirdMethodIDL@e66c.reportJSBFetchError$1");
    }

    public static final void run$1(ARunnableS0S4201000_16 aRunnableS0S4201000_16) {
        boolean zLIZ;
        C1C7U.LIZ("AbsXRequestMethod@5595.reportAbsJSBFetchError$1");
        try {
            aRunnableS0S4201000_16.LIZ$1();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("AbsXRequestMethod@5595.reportAbsJSBFetchError$1");
    }

    public static final void run$2(ARunnableS0S4201000_16 aRunnableS0S4201000_16) {
        boolean zLIZ;
        C1C7U.LIZ("XRequestMethod@868e.reportJSBFetchError$1");
        try {
            aRunnableS0S4201000_16.LIZ$2();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("XRequestMethod@868e.reportJSBFetchError$1");
    }

    public ARunnableS0S4201000_16(String str, Object obj, String str2, int i, String str3, String str4, Object obj2, int i2) {
        this.$t = i2;
        this.s0 = str;
        this.l4 = obj;
        this.s1 = str2;
        this.i6 = i;
        this.s2 = str3;
        this.s3 = str4;
        this.l5 = obj2;
    }
}
