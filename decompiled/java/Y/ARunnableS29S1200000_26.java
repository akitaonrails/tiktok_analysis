package Y;

import X.C098200Yq;
import X.C0HTI;
import X.C0X9R;
import X.C13LP;
import X.C1544770qIl;
import X.C1699260uJw;
import X.C1716310ulR;
import X.C1722300uv6;
import X.C1742510vRh;
import X.C1749280vcc;
import X.C189200o6;
import X.C19EG;
import X.C1C7U;
import X.C20441214yg;
import X.C2188811AlT;
import X.C786410Ut5;
import X.InterfaceC1699420uKC;
import android.graphics.drawable.Drawable;
import android.webkit.WebView;
import com.bytedance.android.live.core.monitor.PersistenceReporter;
import com.bytedance.hybrid.spark.SparkContext;
import com.bytedance.hybrid.spark.security.web_js.api.IJSInjectCallback$ErrorCode;
import com.bytedance.pipo.stellar.base.fragment.StellarViewAssem;
import com.bytedance.pipo.stellar.base.model.StellarTooltipDO;
import com.bytedance.pipo.ttpay.recharge.qrcode.QrCodeFragment;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.navigation.TuxNavBar;
import com.ss.android.ugc.aweme.ecommerce.core.services.FullyRenderedLogger;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.zhiliaoapp.musically.R;
import defpackage.c5;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS77S0210000_26;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes27.dex */
public class ARunnableS29S1200000_26 implements Runnable {
    public final int $t;
    public Object l1;
    public Object l2;
    public String s0;

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
            case 3:
                run$3(this);
                break;
            case 4:
                run$4(this);
                break;
            case 5:
                run$5(this);
                break;
            case 6:
                run$6(this);
                break;
        }
    }

    public String toString() {
        return this.$t + "_" + super.toString();
    }

    public final void LIZ$0() {
        Object c098200Yq;
        PersistenceReporter.Companion.InnerRecord innerRecordLJII = ((PersistenceReporter) this.l1).LJII(this.s0, ((PersistenceReporter) this.l1).LJFF.getString(this.s0, "{}"));
        if (innerRecordLJII == null) {
            innerRecordLJII = new PersistenceReporter.Companion.InnerRecord();
        }
        try {
            ((Function2) this.l2).invoke(innerRecordLJII.getValue(), Long.valueOf(innerRecordLJII.getCreateTimeStamp()));
            c098200Yq = Unit.LIZ;
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        Throwable thM5exceptionOrNullimpl = C189200o6.m5exceptionOrNullimpl(c098200Yq);
        if (thM5exceptionOrNullimpl != null) {
            C20441214yg.LJ("PersistenceReporter", thM5exceptionOrNullimpl.getMessage());
        }
    }

    public final void LIZ$1() {
        TuxNavBar tuxNavBar = (TuxNavBar) ((QrCodeFragment) this.l1).LLJLL.getValue();
        if (tuxNavBar != null) {
            C786410Ut5.LLLLZLLLI(tuxNavBar, 0);
        }
        C1749280vcc c1749280vcc = (C1749280vcc) ((QrCodeFragment) this.l1).LLJLILLLLZIIL.getValue();
        if (c1749280vcc != null) {
            C786410Ut5.LLLZLZ(c1749280vcc, 0);
        }
        C1749280vcc c1749280vcc2 = (C1749280vcc) ((QrCodeFragment) this.l1).LLJLILLLLZIIL.getValue();
        if (c1749280vcc2 != null) {
            QrCodeFragment qrCodeFragment = (QrCodeFragment) this.l1;
            C19EG c19eg = (C19EG) this.l2;
            String str = this.s0;
            qrCodeFragment.getClass();
            List<String> list = c5.LIZ().contactCsErrorCode;
            boolean z = list != null && C13LP.LJJJJ(str, list);
            C1722300uv6 c1722300uv6 = new C1722300uv6();
            C0HTI c0hti = new C0HTI();
            c0hti.LIZ = z ? R.drawable.nj : R.drawable.nl;
            Drawable drawableLIZ = c0hti.LIZ(c19eg);
            c1722300uv6.LIZJ = 2;
            c1722300uv6.LIZ = drawableLIZ;
            c1722300uv6.LJI = c19eg.getString(z ? 2131840193 : 2131832569);
            c1722300uv6.LJIIIIZZ = c19eg.getString(z ? 2131840192 : 2131832568);
            c1722300uv6.LJIIIZ = new AwS77S0210000_26(z, c19eg, qrCodeFragment, 3);
            c1749280vcc2.setStatus(c1722300uv6);
        }
        QrCodeFragment qrCodeFragment2 = (QrCodeFragment) this.l1;
        qrCodeFragment2.LLL = true;
        qrCodeFragment2.bS();
        C1716310ulR c1716310ulR = C1716310ulR.LIZ;
        Map<String, String> mapZR = ((QrCodeFragment) this.l1).ZR();
        QrCodeFragment qrCodeFragment3 = (QrCodeFragment) this.l1;
        mapZR.put("first_render", qrCodeFragment3.LLJZIJLIL ? "1" : CardStruct.IStatusCode.DEFAULT);
        mapZR.put("api_status", CardStruct.IStatusCode.DEFAULT);
        mapZR.put("time_cost", String.valueOf(System.currentTimeMillis() - qrCodeFragment3.LLJJJIL));
        c1716310ulR.getClass();
        C1716310ulR.LIZLLL("rd_pipo_page_show", mapZR);
        ((QrCodeFragment) this.l1).LLJZIJLIL = false;
    }

    public final void LIZ$2() {
        C1742510vRh c1742510vRh = ((FullyRenderedLogger) this.l2).LIZJ;
        if (c1742510vRh != null) {
            String str = this.s0;
            Map map = (Map) this.l1;
            if (Intrinsics.LJFF(c1742510vRh.LIZ.getValue(), str)) {
                Map<String, Object> map2 = c1742510vRh.LIZJ;
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                for (Map.Entry entry : map.entrySet()) {
                    if (c1742510vRh.LJIIIIZZ.contains(entry.getKey())) {
                        linkedHashMap.put(entry.getKey(), entry.getValue());
                    }
                }
                map2.putAll(linkedHashMap);
            }
        }
    }

    public static final void run$0(ARunnableS29S1200000_26 aRunnableS29S1200000_26) {
        C1699260uJw c1699260uJw = (C1699260uJw) aRunnableS29S1200000_26.l1;
        String str = aRunnableS29S1200000_26.s0;
        InterfaceC1699420uKC interfaceC1699420uKC = (InterfaceC1699420uKC) aRunnableS29S1200000_26.l2;
        c1699260uJw.getClass();
        C1C7U.LIZ("TTLivePlayer2@b012.switchResolution$1L");
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("switchResolution: ");
        sbLIZ.append(str);
        c1699260uJw.LJJJJLI("TTLivePlayer2", C2188811AlT.LIZIZ(sbLIZ));
        interfaceC1699420uKC.LIZ(c1699260uJw.LLJILJILJ.LLLI(str));
        C1C7U.LIZIZ("TTLivePlayer2@b012.switchResolution$1L");
    }

    public static final void run$1(ARunnableS29S1200000_26 aRunnableS29S1200000_26) {
        boolean zLIZ;
        C1C7U.LIZ("PersistenceReporter@c927.getValueAndCreateTimestampAsync$3");
        try {
            aRunnableS29S1200000_26.LIZ$0();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("PersistenceReporter@c927.getValueAndCreateTimestampAsync$3");
    }

    public static final void run$2(ARunnableS29S1200000_26 aRunnableS29S1200000_26) {
        boolean zLIZ;
        C1C7U.LIZ("QrCodeFragment@85b5.onViewCreated$1$2$1$onDataFetchFail$1");
        try {
            aRunnableS29S1200000_26.LIZ$1();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("QrCodeFragment@85b5.onViewCreated$1$2$1$onDataFetchFail$1");
    }

    public static final void run$3(ARunnableS29S1200000_26 aRunnableS29S1200000_26) {
        boolean zLIZ;
        C1C7U.LIZ("FullyRenderedLogger@7d0c.onPageMeaningfulRendered$1");
        try {
            aRunnableS29S1200000_26.LIZ$2();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("FullyRenderedLogger@7d0c.onPageMeaningfulRendered$1");
    }

    public static final void run$4(ARunnableS29S1200000_26 aRunnableS29S1200000_26) {
        boolean zLIZ;
        C1C7U.LIZ("StellarViewAssem@2ca3.showToolTip$1$1");
        try {
            ((StellarViewAssem) aRunnableS29S1200000_26.l1).Go(aRunnableS29S1200000_26.s0, (StellarTooltipDO) aRunnableS29S1200000_26.l2);
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("StellarViewAssem@2ca3.showToolTip$1$1");
    }

    public static final void run$5(ARunnableS29S1200000_26 aRunnableS29S1200000_26) {
        boolean zLIZ;
        C1C7U.LIZ("StellarViewAssem@2ca3.showToolTip$1$2$1");
        try {
            ((StellarViewAssem) aRunnableS29S1200000_26.l1).Go(aRunnableS29S1200000_26.s0, (StellarTooltipDO) aRunnableS29S1200000_26.l2);
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("StellarViewAssem@2ca3.showToolTip$1$2$1");
    }

    public static final void run$6(ARunnableS29S1200000_26 aRunnableS29S1200000_26) {
        boolean zLIZ;
        C1C7U.LIZ("LLMUtilsKt@da2.pipoCollectHtml$$inlined$postDelayed$1");
        try {
            WebView webView = (WebView) aRunnableS29S1200000_26.l1;
            final String str = aRunnableS29S1200000_26.s0;
            final SparkContext sparkContext = (SparkContext) aRunnableS29S1200000_26.l2;
            C1544770qIl.LIZ(webView, new C0X9R() { // from class: X.0uwr
                @Override // X.AbstractC1544900qIy
                public final void LJIIIIZZ(IJSInjectCallback$ErrorCode iJSInjectCallback$ErrorCode) {
                    C1725270uzt c1725270uzt = C1725270uzt.LIZ;
                    String str2 = str;
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("inject failed, code: ");
                    sbLIZ.append(iJSInjectCallback$ErrorCode);
                    c1725270uzt.LJIIIIZZ(str2, "js_error", C2188811AlT.LIZIZ(sbLIZ));
                }

                @Override // X.AbstractC1544900qIy
                public final void LJIIJJI(Object obj) {
                    C23250099c.LIZLLL(C759510Tqn.LIZIZ(sparkContext), C0PEM.LIZJ, null, new C1723380uwq(str, obj, sparkContext, null), 2);
                }

                @Override // X.AbstractC1544900qIy
                public final void LJIIJ(int i, Object obj, String str2) {
                    C1725270uzt c1725270uzt = C1725270uzt.LIZ;
                    String str3 = str;
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("collectHtml failed, code: ");
                    sbLIZ.append(i);
                    sbLIZ.append(", msg: ");
                    sbLIZ.append(str2);
                    c1725270uzt.LJIIIIZZ(str3, "js_error", C2188811AlT.LIZIZ(sbLIZ));
                }
            });
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("LLMUtilsKt@da2.pipoCollectHtml$$inlined$postDelayed$1");
    }

    public ARunnableS29S1200000_26(Object obj, Object obj2, String str, int i) {
        this.$t = i;
        this.l1 = obj;
        this.s0 = str;
        this.l2 = obj2;
    }
}
