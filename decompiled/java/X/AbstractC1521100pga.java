package X;

import Y.ARunnableS123S0100000_23;
import android.os.Debug;
import android.os.Looper;
import android.os.Process;
import android.view.View;
import android.webkit.WebView;
import java.util.List;
import java.util.Set;
import kotlin.Pair;
import kotlin.jvm.internal.AFwS212S0000000_23;
import kotlin.jvm.internal.AwS567S0100000_23;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import kotlin.text.u;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0pga, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public abstract class AbstractC1521100pga {
    public final AbstractC1514820pWS<?> LL;
    public C1522170piJ<C1520560pfi> LLJILJIL;
    public Long LLJILLL;
    public C798360VTm LLJJ;
    public final C01GW LLILLJJLI = C452501pT.LIZIZ(AFwS212S0000000_23.get$arr$(3));
    public final C01GW LLILLL = C452501pT.LIZIZ(new AwS567S0100000_23(this, 38));
    public String LLILZ = "";
    public String LLILZIL = "";
    public String LLILZLL = "";
    public String LLIZ = "";
    public String LLIZLLLIL = "";
    public String LLJ = "";
    public String LLJI = "";
    public String LLJIJIL = "";
    public final C1520140pf2 LLJILJILJ = new C1520140pf2();

    public abstract InterfaceC1522240piQ<C1520560pfi> LIZ();

    public void LJFF(String str) {
    }

    public abstract void LJIILIIL(int i, String str, JSONObject jSONObject);

    /* JADX WARN: Type inference failed for: r1v0, types: [X.0ph9] */
    public final C1522170piJ<C1520560pfi> LIZJ() {
        if (this.LLJILJIL == null) {
            this.LLJILJIL = new C1522170piJ<>(LIZ(), new InterfaceC1522250piR<C1520560pfi>() { // from class: X.0ph9
                @Override // X.InterfaceC1522250piR
                public final void LIZ(C1520560pfi c1520560pfi) {
                    C1520560pfi c1520560pfi2 = c1520560pfi;
                    if ((c1520560pfi2 instanceof C1520220pfA) && (!a0.LJJJIL(this.LIZ.LL.LLILZIL))) {
                        C1522000pi2.LIZ(c1520560pfi2.LIZ, this.LIZ.LL.LLILZIL, ((C1520220pfA) c1520560pfi2).LJIILIIL);
                    }
                }
            }, 2);
        }
        C1522170piJ<C1520560pfi> c1522170piJ = this.LLJILJIL;
        return c1522170piJ == null ? C1522170piJ.LIZLLL.getValue() : c1522170piJ;
    }

    public final C1491690ov9 LIZLLL() {
        return (C1491690ov9) this.LLILLL.getValue();
    }

    public final String LJ() {
        return C1520370pfP.LIZ(this.LLJI) ? this.LLJI : C1520370pfP.LIZ(this.LLJ) ? this.LLJ : C1520370pfP.LIZ(this.LLIZLLLIL) ? this.LLIZLLLIL : "__hybrid_default";
    }

    public void LJI() {
        C824310WVh.LIZJ(new ARunnableS123S0100000_23(this, 0));
        LIZLLL().LIZIZ(EnumC1521120pgc.PAGE_EXIT, null);
        C1491690ov9 c1491690ov9LIZLLL = LIZLLL();
        c1491690ov9LIZLLL.getClass();
        C1491570oux c1491570oux = C1491570oux.LIZ;
        String str = c1491690ov9LIZLLL.LIZ;
        c1491570oux.getClass();
        C1491570oux.LJIIZILJ(str);
    }

    public final void LJII() {
        WebView webView;
        Integer num;
        Set<C1514840pWU> set = C1514850pWV.LIZ;
        final String str = this.LL.LIZIZ().LIZ;
        final String str2 = LIZLLL().LIZ;
        C1491570oux c1491570oux = C1491570oux.LIZ;
        String str3 = C1514850pWV.LIZJ;
        InterfaceC1491630ov3 interfaceC1491630ov3 = new InterfaceC1491630ov3() { // from class: X.0ov8
            @Override // X.InterfaceC1491630ov3
            public final void onReceiveValue(Object obj) {
                List list = (List) obj;
                if (list != null) {
                    C1491570oux c1491570oux2 = C1491570oux.LIZ;
                    String str4 = C1514850pWV.LIZLLL;
                    final String str5 = str2;
                    final String str6 = str;
                    InterfaceC1491630ov3 interfaceC1491630ov32 = new InterfaceC1491630ov3() { // from class: X.0ov7
                        @Override // X.InterfaceC1491630ov3
                        public final void onReceiveValue(Object obj2) {
                            String str7 = (String) obj2;
                            if (str7 != null && !u.LJJIIJZLJL(str7, "PAGE_", false)) {
                                C1491570oux c1491570oux3 = C1491570oux.LIZ;
                                String str8 = str5;
                                EnumC1491500ouq enumC1491500ouq = EnumC1491500ouq.EXTEND;
                                c1491570oux3.getClass();
                                C1491570oux.LJIJJ(str8, str7, enumC1491500ouq);
                                C1491570oux.LJIJJ(str5, str6, EnumC1491500ouq.EXTEND_REMOVE);
                            }
                        }
                    };
                    c1491570oux2.getClass();
                    C1491570oux.LJII(list, str4, interfaceC1491630ov32);
                }
            }
        };
        c1491570oux.getClass();
        C1491570oux.LJFF(str2, str, str3, interfaceC1491630ov3);
        C824310WVh.LIZJ(new ARunnableS123S0100000_23(this, 0));
        EnumC1520910pgH enumC1520910pgHLIZJ = this.LL.LIZJ();
        if (EnumC1520990pgP.NATIVE_PERF_MONITOR.isEnabled()) {
            this.LLJJ = new C798360VTm(true, false, false, null, true);
            if (enumC1520910pgHLIZJ == EnumC1520910pgH.LYNX && (num = C1521130pgd.LIZ) != null) {
                int iIntValue = num.intValue();
                C798360VTm c798360VTm = this.LLJJ;
                if (c798360VTm != null) {
                    c798360VTm.LIZLLL = new int[]{iIntValue, Process.myPid(), Process.myTid()};
                }
            }
            C798360VTm c798360VTm2 = this.LLJJ;
            if (c798360VTm2 != null) {
                c798360VTm2.LIZ();
            }
            LIZLLL().LJ(C2097608Jq.LJIIJ(new Pair(EnumC1521120pgc.PAGE_START_MEMORY.getKey(), Long.valueOf(Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory())), new Pair(EnumC1521120pgc.PAGE_START_MEMORY_NATIVE.getKey(), Long.valueOf(Debug.getNativeHeapAllocatedSize()))));
        }
        View view = this.LL.LL.get();
        String url = null;
        if (view == null) {
            int i = C2187451AjH.LIZ;
            C1521730phb.LIZIZ("MonitorViewSession", "view is null or not lynxview");
            view = null;
        }
        if (!Intrinsics.LJFF(Looper.getMainLooper(), Looper.myLooper())) {
            url = "";
        } else if ((view instanceof WebView) && (webView = (WebView) view) != null) {
            url = webView.getUrl();
        }
        C1521500phE.LIZ.LIZLLL(view, url, (String) this.LLILLJJLI.getValue(), System.currentTimeMillis());
    }

    public AbstractC1521100pga(AbstractC1514820pWS<?> abstractC1514820pWS) {
        this.LL = abstractC1514820pWS;
    }

    public final void LJIIIIZZ(String str) {
        if (str.length() > 0 && !Intrinsics.LJFF(str, "__hybrid_default")) {
            this.LLJI = str;
            LIZLLL().LIZLLL(EnumC1521110pgb.PAGE_BID_FROM_APP.getKey(), str);
        }
    }

    public final void LJIIIZ(String str) {
        if (str.length() > 0 && !Intrinsics.LJFF(str, "__hybrid_default")) {
            this.LLIZLLLIL = str;
            LIZLLL().LIZLLL(EnumC1521110pgb.PAGE_BID_FROM_NATIVE.getKey(), str);
        }
    }

    public final void LJIIJ(String str) {
        if (str.length() > 0) {
            this.LLIZ = str;
            LIZLLL().LIZLLL(EnumC1521110pgb.PAGE_PID_FROM_APP.getKey(), str);
        }
    }

    public final void LJIIJJI(boolean z) {
        LIZLLL().LIZLLL(EnumC1521120pgc.VIEW_IS_REUSED.getKey(), Boolean.valueOf(z));
    }

    public final void LJIIL(String str) {
        if (str.length() > 0) {
            this.LLILZ = str;
            LIZLLL().LIZLLL(EnumC1521110pgb.PAGE_URL.getKey(), str);
        }
    }

    public final void LIZIZ(String str, JSONObject jSONObject) {
        C1514690pWF.LIZIZ(this.LL.LLILZIL, str, jSONObject);
    }
}
