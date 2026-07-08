package X;

import android.content.Context;
import android.content.DialogInterface;
import android.util.AttributeSet;
import android.webkit.WebView;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.fragment.app.FragmentManager;
import com.bytedance.hybrid.spark.SparkContext;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.lynx.hybrid.webkit.ttwebview.TTWebViewHelper;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.input.TuxTextView;
import com.bytedance.tux.sheet.sheet.TuxSheet;
import com.ss.android.ugc.aweme.ad.reuse.experiment.CommerceLandPageReuseModel;
import com.ss.android.ugc.aweme.commercialize.hybrid.api.web.metric.LogItem;
import com.ss.android.ugc.aweme.commercialize.hybrid.api.web.metric.State;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.ss.android.ugc.aweme.feed.model.ad.FeatureCenterModel;
import com.ss.android.ugc.aweme.feed.model.commercialize.adshopifycheckout.ShopifyCheckoutEntity;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.log.AdWebEventLogger;
import com.ss.android.ugc.aweme.structure.api.ICommerceService;
import com.ss.android.ugc.aweme.web.service.IAdWebUtils;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS252S0000000_16;
import kotlin.jvm.internal.AwS0S1121000_16;
import kotlin.jvm.internal.AwS0S4000000_16;
import kotlin.jvm.internal.AwS100S1200000_16;
import kotlin.jvm.internal.AwS101S0201000_16;
import kotlin.jvm.internal.AwS130S1100000_16;
import kotlin.jvm.internal.AwS14S0002000_16;
import kotlin.jvm.internal.AwS16S2000000_16;
import kotlin.jvm.internal.AwS23S2200000_16;
import kotlin.jvm.internal.AwS24S1101000_16;
import kotlin.jvm.internal.AwS30S0001000_16;
import kotlin.jvm.internal.AwS35S1110000_16;
import kotlin.jvm.internal.AwS40S2100000_16;
import kotlin.jvm.internal.AwS43S0301000_16;
import kotlin.jvm.internal.AwS50S0100100_16;
import kotlin.jvm.internal.AwS56S1300000_16;
import kotlin.jvm.internal.AwS595S0100000_16;
import kotlin.jvm.internal.AwS5S2400000_16;
import kotlin.jvm.internal.AwS67S1000000_16;
import kotlin.jvm.internal.AwS7S1001000_16;
import kotlin.jvm.internal.AwS8S2300000_16;
import kotlin.jvm.internal.AwS9S0101100_16;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.u;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0dBo, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1040740dBo implements InterfaceC1036110d4L, InterfaceC1039570d9v {
    public static final /* synthetic */ int LLJJLIIIJLLLLLLLZ = 0;
    public final C1035880d3y LL;
    public boolean LLILZ;
    public long LLILZLL;
    public long LLIZ;
    public long LLIZLLLIL;
    public long LLJILLL;
    public boolean LLJJ;
    public int LLJJIII;
    public C1040210dAx LLJJIJI;
    public boolean LLJJIJIIJIL;
    public int LLJJJ;
    public boolean LLJJJIL;
    public boolean LLJJJJ;
    public int LLJJJJLIIL;
    public C1039460d9k LLJJL;
    public int LLILLJJLI = 1;
    public int LLILLL = 1;
    public int LLILZIL = 1;
    public final AtomicBoolean LLJ = new AtomicBoolean(false);
    public String LLJI = "";
    public long LLJIJIL = System.currentTimeMillis();
    public long LLJILJIL = System.currentTimeMillis();
    public long LLJILJILJ = System.currentTimeMillis();
    public final ArrayList<Integer> LLJJI = new ArrayList<>();
    public int LLJJIJIL = -1;
    public boolean LLJJJJJIL = true;

    @Override // X.InterfaceC1039570d9v
    public final void I1(String str, boolean z) {
    }

    @Override // X.InterfaceC1036110d4L
    public final void LJIIIZ() {
        if (LJJLIIIIJ(this.LL)) {
            AdWebEventLogger adWebEventLogger = new AdWebEventLogger(this.LL);
            C1043510dGH.LIZ.getClass();
            adWebEventLogger.logAd(C1043510dGH.LJJJJJ, this.LL.getRealCreativeIdStr(), this.LL.getRealLogExtra(), null);
        }
    }

    @Override // X.InterfaceC1036110d4L
    public final void LJIIJJI() {
        if (LJJLIIIIJ(this.LL)) {
            AdWebEventLogger adWebEventLogger = new AdWebEventLogger(this.LL);
            C1043510dGH.LIZ.getClass();
            adWebEventLogger.logAd(C1043510dGH.LJJJJ, this.LL.getRealCreativeIdStr(), this.LL.getRealLogExtra(), null);
        }
    }

    @Override // X.InterfaceC1036110d4L
    public final void LJIIZILJ() {
        new AdWebEventLogger(this.LL).logAd(C1040830dBx.LIZ, this.LL.getRealCreativeIdStr(), this.LL.getRealLogExtra(), null, AFwS252S0000000_16.get$arr$(252));
    }

    @Override // X.InterfaceC1036110d4L
    public final void LJIJ() {
        if (LJJLIIIIJ(this.LL)) {
            AdWebEventLogger adWebEventLogger = new AdWebEventLogger(this.LL);
            C1043510dGH.LIZ.getClass();
            adWebEventLogger.logAd(C1043510dGH.LJJJIL, this.LL.getRealCreativeIdStr(), this.LL.getRealLogExtra(), null);
        }
    }

    @Override // X.InterfaceC1036110d4L
    public final void LJIJI() {
        if (LJJLIIIIJ(this.LL)) {
            new AdWebEventLogger(this.LL).logAd(C2265701DmC.LIZ, this.LL.getRealCreativeIdStr(), this.LL.getRealLogExtra(), null, new AwS595S0100000_16(this, 108));
        }
        if (LJJLIIIJILLIZJL(this.LL)) {
            C1040580dBY c1040580dBY = new C1040580dBY(this.LL);
            C1040750dBp.LIZ.getClass();
            c1040580dBY.log(C1040750dBp.LJIILIIL, new AwS595S0100000_16(this, 109));
        }
    }

    @Override // X.InterfaceC1036110d4L
    public final void LJJI() {
        new AdWebEventLogger(this.LL).logAd(C1040840dBy.LIZ, this.LL.getRealCreativeIdStr(), this.LL.getRealLogExtra(), null, AFwS252S0000000_16.get$arr$(253));
    }

    @Override // X.InterfaceC1036110d4L
    public final void LJJIFFI() {
        if (LJJLIIIIJ(this.LL)) {
            C844470XAv.LIZ.getClass();
            String string = C786410Ut5.e3(C844470XAv.LIZ()).toString();
            AdWebEventLogger adWebEventLogger = new AdWebEventLogger(this.LL);
            C1043510dGH.LIZ.getClass();
            adWebEventLogger.logAd(C1043510dGH.LJJJJJL, this.LL.getRealCreativeIdStr(), this.LL.getRealLogExtra(), null, new AwS67S1000000_16(string, 13));
        }
    }

    @Override // X.InterfaceC1036110d4L
    public final void LJJIJL() {
        if (LJJLIIIIJ(this.LL)) {
            AdWebEventLogger adWebEventLogger = new AdWebEventLogger(this.LL);
            C1043510dGH.LIZ.getClass();
            adWebEventLogger.logAd(C1043510dGH.LJJLIIIJJI, this.LL.getAwemeRawAd());
        }
    }

    @Override // X.InterfaceC1036110d4L
    public final void LJJIL() {
        if (LJJLIIIIJ(this.LL)) {
            AdWebEventLogger adWebEventLogger = new AdWebEventLogger(this.LL);
            C1043510dGH.LIZ.getClass();
            adWebEventLogger.logAd(C1043510dGH.LJJLIIIIJ, this.LL.getAwemeRawAd());
        }
    }

    @Override // X.InterfaceC1036110d4L
    public final void LJJJI() {
        if (LJJLIIIIJ(this.LL)) {
            AdWebEventLogger adWebEventLogger = new AdWebEventLogger(this.LL);
            C1043510dGH.LIZ.getClass();
            adWebEventLogger.logAd(C1043510dGH.LJIIIIZZ, this.LL.getRealCreativeIdStr(), this.LL.getRealLogExtra(), null, AFwS252S0000000_16.get$arr$(250));
        }
    }

    @Override // X.InterfaceC1036110d4L
    public final void LJJJJJ() {
        if (LJJLIIIIJ(this.LL)) {
            AdWebEventLogger adWebEventLogger = new AdWebEventLogger(this.LL);
            C1043510dGH.LIZ.getClass();
            adWebEventLogger.logAd(C1043510dGH.LJJJLZIJ, this.LL.getAwemeRawAd());
        }
    }

    @Override // X.InterfaceC1036110d4L
    public final void LJJJLL() {
        if (LJJLIIIIJ(this.LL)) {
            AdWebEventLogger adWebEventLogger = new AdWebEventLogger(this.LL);
            C1043510dGH.LIZ.getClass();
            adWebEventLogger.logAd(C1043510dGH.LJII, this.LL.getRealCreativeIdStr(), this.LL.getRealLogExtra(), null, AFwS252S0000000_16.get$arr$(251));
        }
    }

    public final void LJJL() {
        C1035890d3z adCommonData;
        List<LogItem> list;
        C1039460d9k c1039460d9k = this.LLJJL;
        if (c1039460d9k != null) {
            C1035880d3y c1035880d3y = c1039460d9k.LJIIIIZZ;
            if (c1035880d3y != null && (adCommonData = c1035880d3y.getAdCommonData()) != null && (list = adCommonData.logList) != null) {
                list.clear();
            }
            if (((Boolean) C263320ATq.LIZ.getValue()).booleanValue()) {
                C1039470d9l c1039470d9l = c1039460d9k.LIZ;
                c1039470d9l.getClass();
                c1039470d9l.LIZ = new State(false, false, false);
            }
        }
    }

    public final void LJJLJ() {
        if (((CommerceLandPageReuseModel) C1036730d5L.LIZIZ.getValue()).enableReuseLandPage) {
            AdWebEventLogger adWebEventLogger = new AdWebEventLogger(this.LL);
            C1043510dGH.LIZ.getClass();
            adWebEventLogger.logAd(C1043510dGH.LJIIJJI, this.LL.getRealCreativeIdStr(), this.LL.getRealLogExtra(), null, new AwS595S0100000_16(this, 110));
        }
    }

    public final void LJJLJLI() {
        this.LLJIJIL = System.currentTimeMillis();
        this.LLIZLLLIL = 0L;
        if (this.LLJJ) {
            this.LLJILLL = System.currentTimeMillis();
        }
    }

    public C1040740dBo(C1035880d3y c1035880d3y) {
        this.LL = c1035880d3y;
    }

    public static String LJJLI(WebView webView) {
        JSONObject webViewLoadingTelemetryMetrics;
        String strJ3;
        if (webView == null || !TTWebViewHelper.INSTANCE.isTTWebView(webView) || (webViewLoadingTelemetryMetrics = TTWebViewHelper.getWebViewLoadingTelemetryMetrics(webView)) == null || (strJ3 = C786410Ut5.J3(webViewLoadingTelemetryMetrics)) == null) {
            return "";
        }
        return strJ3;
    }

    public static final boolean LJJLIIIIJ(C1035880d3y c1035880d3y) {
        return C1035990d49.LJ(c1035880d3y);
    }

    public static boolean LJJLIIIJ(String str) {
        if (str == null) {
            return false;
        }
        if (!u.LJJIIJZLJL(str, "http://", false) && !u.LJJIIJZLJL(str, "https://", false)) {
            return false;
        }
        return true;
    }

    public static boolean LJJLIIIJILLIZJL(C1035880d3y c1035880d3y) {
        if (!C1035990d49.LJ(c1035880d3y) && c1035880d3y != null && c1035880d3y.getNonAdWebModel() != null) {
            return true;
        }
        return false;
    }

    @Override // X.InterfaceC1036110d4L
    public final void LIZJ(Integer num) {
        if (!LJJLIIIIJ(this.LL)) {
            return;
        }
        AdWebEventLogger adWebEventLogger = new AdWebEventLogger(this.LL);
        C1043510dGH.LIZ.getClass();
        adWebEventLogger.logAd(C1043510dGH.LJJJJL, this.LL.getRealCreativeIdStr(), this.LL.getRealLogExtra(), null, new AwS595S0100000_16(num, 107));
    }

    @Override // X.InterfaceC1036110d4L
    public final void LJ(String str) {
        if (!LJJLIIIIJ(this.LL)) {
            return;
        }
        AdWebEventLogger adWebEventLogger = new AdWebEventLogger(this.LL);
        C1043510dGH.LIZ.getClass();
        adWebEventLogger.logAd(C1043510dGH.LJJJJZ, this.LL.getRealCreativeIdStr(), this.LL.getRealLogExtra(), null, new AwS67S1000000_16(str, 16));
    }

    @Override // X.InterfaceC1036110d4L
    public final void LJFF(String str) {
        ShopifyCheckoutEntity shopifyData;
        if (!LJJLIIIIJ(this.LL)) {
            return;
        }
        AwemeRawAd awemeRawAd = this.LL.getAwemeRawAd();
        if (awemeRawAd != null) {
            shopifyData = awemeRawAd.getShopifyData();
        } else {
            shopifyData = null;
        }
        AdWebEventLogger adWebEventLogger = new AdWebEventLogger(this.LL);
        C1043510dGH.LIZ.getClass();
        adWebEventLogger.logAd(C1043510dGH.LJJJJI, this.LL.getRealCreativeIdStr(), this.LL.getRealLogExtra(), null, new AwS130S1100000_16(str, shopifyData, 7));
    }

    @Override // X.InterfaceC1036110d4L
    public final void LJIIL(String str) {
        C1023960ckk c1023960ckk = C2265741DmG.LIZ;
        C1040750dBp.LIZ.getClass();
        LJJLIIIJLLLLLLLZ(c1023960ckk, C1040750dBp.LJIILJJIL, Boolean.FALSE, null, str, null);
    }

    @Override // X.InterfaceC1036110d4L
    public final void LJIILL(boolean z) {
        C1007810cKh c1007810cKh;
        C1023960ckk c1023960ckk;
        this.LL.setBackground(z ? 1 : 0);
        if (!this.LL.isOnShow()) {
            return;
        }
        long jCurrentTimeMillis = System.currentTimeMillis() - this.LL.getLastTime();
        if (!z) {
            if (this.LLILZ) {
                C1035880d3y c1035880d3y = this.LL;
                c1035880d3y.setBackgroundDurationFromFinish(c1035880d3y.getBackgroundDurationFromFinish() + jCurrentTimeMillis);
            }
            if (this.LLJJIJIIJIL) {
                C1035880d3y c1035880d3y2 = this.LL;
                c1035880d3y2.setBackgroundDurationFromLoad(c1035880d3y2.getBackgroundDurationFromLoad() + jCurrentTimeMillis);
            }
        }
        if (LJJLIIIIJ(this.LL)) {
            AdWebEventLogger adWebEventLogger = new AdWebEventLogger(this.LL);
            if (z) {
                c1023960ckk = C2266121Dms.LIZ;
            } else {
                c1023960ckk = C2266101Dmq.LIZ;
            }
            adWebEventLogger.logAd(c1023960ckk, this.LL.getRealCreativeIdStr(), this.LL.getRealLogExtra(), null, new AwS50S0100100_16(jCurrentTimeMillis, this, 5));
        }
        if (LJJLIIIJILLIZJL(this.LL)) {
            C1040580dBY c1040580dBY = new C1040580dBY(this.LL);
            if (z) {
                C1040750dBp.LIZ.getClass();
                c1007810cKh = C1040750dBp.LJIIJ;
            } else {
                C1040750dBp.LIZ.getClass();
                c1007810cKh = C1040750dBp.LJIIJJI;
            }
            c1040580dBY.log(c1007810cKh, new AwS50S0100100_16(jCurrentTimeMillis, this, 6));
        }
        this.LL.setLastTime(System.currentTimeMillis());
    }

    @Override // X.InterfaceC1029330ctP
    public final void LJIILLIIL(C1023960ckk c1023960ckk) {
        if (!LJJLIIIIJ(this.LL)) {
            return;
        }
        new AdWebEventLogger(this.LL).logAd(c1023960ckk, this.LL.getRealCreativeIdStr(), this.LL.getRealLogExtra(), null, new AwS595S0100000_16(this, 112));
    }

    @Override // X.InterfaceC1036110d4L
    public final void LJIJJ(int i) {
        if (!LJJLIIIIJ(this.LL)) {
            return;
        }
        AdWebEventLogger adWebEventLogger = new AdWebEventLogger(this.LL);
        C1043510dGH.LIZ.getClass();
        adWebEventLogger.logAd(C1043510dGH.LJJL, this.LL.getAwemeRawAd(), new AwS30S0001000_16(i, 6));
    }

    /* JADX WARN: Removed duplicated region for block: B:47:0x012b  */
    @Override // X.InterfaceC1036110d4L
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJIL(com.bytedance.hybrid.spark.SparkContext r7) {
        /*
            Method dump skipped, instruction units count: 315
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1040740dBo.LJIL(com.bytedance.hybrid.spark.SparkContext):void");
    }

    @Override // X.InterfaceC1029330ctP
    public final void LJJII(String str) {
        if (LJJLIIIIJ(this.LL)) {
            new AdWebEventLogger(this.LL).logAd(C2266041Dmk.LIZ, this.LL.getAwemeRawAd(), new AwS67S1000000_16(str, 14));
        }
    }

    @Override // X.InterfaceC1036110d4L
    public final void LJJIII(String str) {
        if (!LJJLIIIIJ(this.LL)) {
            return;
        }
        new AdWebEventLogger(this.LL).logAd(C1040810dBv.LIZ, this.LL.getAwemeRawAd(), new AwS130S1100000_16(this, str, 6));
    }

    @Override // X.InterfaceC1036110d4L
    public final void LJJIIZ(int i) {
        if (!LJJLIIIIJ(this.LL)) {
            return;
        }
        AdWebEventLogger adWebEventLogger = new AdWebEventLogger(this.LL);
        C1043510dGH.LIZ.getClass();
        adWebEventLogger.logAd(C1043510dGH.LJJJLL, this.LL.getAwemeRawAd(), new AwS30S0001000_16(i, 4));
    }

    @Override // X.InterfaceC1036110d4L
    public final void LJJIIZI(String str) {
        C1023960ckk c1023960ckk = C2265661Dm8.LIZ;
        C1040750dBp.LIZ.getClass();
        LJJLIIIJLLLLLLLZ(c1023960ckk, C1040750dBp.LJIILLIIL, Boolean.FALSE, null, str, null);
    }

    @Override // X.InterfaceC1029330ctP
    public final void LJJIJIIJI(String str) {
        if (LJJLIIIIJ(this.LL)) {
            new AdWebEventLogger(this.LL).logAd(C2265621Dm4.LIZ, this.LL.getRealCreativeIdStr(), this.LL.getRealLogExtra(), null, new AwS67S1000000_16(str, 17));
        }
        if (LJJLIIIJILLIZJL(this.LL)) {
            C1040580dBY c1040580dBY = new C1040580dBY(this.LL);
            C1040750dBp.LIZ.getClass();
            c1040580dBY.log(C1040750dBp.LJJIIZ, new AwS67S1000000_16(str, 18));
        }
    }

    @Override // X.InterfaceC1036110d4L
    public final void LJJIJIIJIL(String str) {
        C1023960ckk c1023960ckk = C2265681DmA.LIZ;
        C1040750dBp.LIZ.getClass();
        LJJLIIIJLLLLLLLZ(c1023960ckk, C1040750dBp.LJIIZILJ, Boolean.FALSE, null, str, null);
    }

    @Override // X.InterfaceC1036110d4L
    public final void LJJIJIL(String str) {
        C1023960ckk c1023960ckk = C2265641Dm6.LIZ;
        C1040750dBp.LIZ.getClass();
        LJJLIIIJLLLLLLLZ(c1023960ckk, C1040750dBp.LJIJI, Boolean.FALSE, null, str, null);
    }

    @Override // X.InterfaceC1036110d4L
    public final void LJJIJLIJ(String str) {
        int i;
        C118300cf c118300cf = new C118300cf();
        if (!this.LLJJJJJIL) {
            if (this.LL.getMultiTapModel().getCurrentTabIndex() > this.LLJJJJLIIL) {
                i = 2;
            } else {
                i = 1;
            }
            c118300cf.element = i;
        }
        this.LLJJJJJIL = false;
        this.LLJJJJLIIL = this.LL.getMultiTapModel().getCurrentTabIndex();
        new AdWebEventLogger(this.LL).logAd(C2265881DmU.LIZ, this.LL.getAwemeRawAd(), new AwS130S1100000_16(str, c118300cf, 9));
    }

    @Override // X.InterfaceC1036110d4L
    public final void LJJJIL(String str) {
        ShopifyCheckoutEntity shopifyData;
        if (!LJJLIIIIJ(this.LL)) {
            return;
        }
        AwemeRawAd awemeRawAd = this.LL.getAwemeRawAd();
        if (awemeRawAd != null) {
            shopifyData = awemeRawAd.getShopifyData();
        } else {
            shopifyData = null;
        }
        AdWebEventLogger adWebEventLogger = new AdWebEventLogger(this.LL);
        C1043510dGH.LIZ.getClass();
        adWebEventLogger.logAd(C1043510dGH.LJJJJIZL, this.LL.getRealCreativeIdStr(), this.LL.getRealLogExtra(), null, new AwS130S1100000_16(str, shopifyData, 8));
    }

    @Override // X.InterfaceC1036110d4L
    public final void LJJJJ(int i) {
        if (!LJJLIIIIJ(this.LL)) {
            return;
        }
        AdWebEventLogger adWebEventLogger = new AdWebEventLogger(this.LL);
        C1043510dGH.LIZ.getClass();
        adWebEventLogger.logAd(C1043510dGH.LJJJZ, this.LL.getAwemeRawAd(), new AwS30S0001000_16(i, 8));
    }

    @Override // X.InterfaceC1036110d4L
    public final void LJJJJJL(int i) {
        if (!LJJLIIIIJ(this.LL)) {
            return;
        }
        AdWebEventLogger adWebEventLogger = new AdWebEventLogger(this.LL);
        C1043510dGH.LIZ.getClass();
        adWebEventLogger.logAd(C1043510dGH.LJJLI, this.LL.getAwemeRawAd(), new AwS30S0001000_16(i, 7));
    }

    @Override // X.InterfaceC1036110d4L
    public final void LJJJJLI(int i) {
        if (!LJJLIIIIJ(this.LL)) {
            return;
        }
        AdWebEventLogger adWebEventLogger = new AdWebEventLogger(this.LL);
        C1043510dGH.LIZ.getClass();
        adWebEventLogger.logAd(C1043510dGH.LJJJLIIL, this.LL.getAwemeRawAd(), new AwS30S0001000_16(i, 5));
    }

    public final void LJJLIIIJLJLI(String str) {
        new AdWebEventLogger(this.LL).logAd(C1040850dBz.LIZ, this.LL.getAwemeRawAd(), new AwS67S1000000_16(str, 15));
    }

    public final void LJJLL(C1040940dC8 c1040940dC8) {
        C1039460d9k c1039460d9k = this.LLJJL;
        if (c1039460d9k != null) {
            c1039460d9k.LIZIZ.add(c1040940dC8);
        }
    }

    public final void LJJZ(String str) {
        if (C1035990d49.LIZIZ(str)) {
            return;
        }
        this.LLJI = str;
        this.LL.setCurrentUrl(str);
    }

    @Override // X.InterfaceC1039570d9v
    public final void ze(long j) {
        if (!LJJLIIIIJ(this.LL)) {
            return;
        }
        new AdWebEventLogger(this.LL).logAd(C2268031Dpx.LIZ, this.LL.getRealCreativeIdStr(), this.LL.getRealLogExtra(), null, new AwS50S0100100_16(j, this, 10));
    }

    @Override // X.InterfaceC1036110d4L
    public final void LIZ(int i, String str) {
        if (!LJJLIIIIJ(this.LL)) {
            return;
        }
        AdWebEventLogger adWebEventLogger = new AdWebEventLogger(this.LL);
        C1043510dGH.LIZ.getClass();
        adWebEventLogger.logAd(C1043510dGH.LJJLIIIJ, this.LL.getAwemeRawAd(), new AwS7S1001000_16(str, i, 2));
    }

    @Override // X.InterfaceC1036110d4L
    public final void LJII(String str, String str2) {
        if (!LJJLIIIIJ(this.LL)) {
            return;
        }
        new AdWebEventLogger(this.LL).logAd(C1040960dCA.LIZ, this.LL.getAwemeRawAd(), new AwS40S2100000_16(str, str2, this, 3));
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00c7  */
    @Override // X.InterfaceC1036110d4L
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJIIIIZZ(long r7, java.lang.Boolean r9) {
        /*
            Method dump skipped, instruction units count: 208
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1040740dBo.LJIIIIZZ(long, java.lang.Boolean):void");
    }

    @Override // X.InterfaceC1036110d4L
    public final void LJIIJ(int i, String str) {
        if (!LJJLIIIIJ(this.LL)) {
            return;
        }
        AdWebEventLogger adWebEventLogger = new AdWebEventLogger(this.LL);
        C1043510dGH.LIZ.getClass();
        adWebEventLogger.logAd(C1043510dGH.LJJLIIIJILLIZJL, this.LL.getAwemeRawAd(), new AwS7S1001000_16(str, i, 1));
    }

    @Override // X.InterfaceC1036110d4L
    public final void LJIILIIL(Integer num, String str) {
        C1023960ckk c1023960ckk = C2265721DmE.LIZ;
        C1040750dBp.LIZ.getClass();
        LJJLIIIJLLLLLLLZ(c1023960ckk, C1040750dBp.LJIILL, Boolean.FALSE, null, str, num);
    }

    @Override // X.InterfaceC1036110d4L
    public final void LJIJJLI(Integer num, Long l) {
        if (!LJJLIIIIJ(this.LL)) {
            return;
        }
        C844470XAv.LIZ.getClass();
        String string = C786410Ut5.e3(C844470XAv.LIZ()).toString();
        AdWebEventLogger adWebEventLogger = new AdWebEventLogger(this.LL);
        C1043510dGH.LIZ.getClass();
        adWebEventLogger.logAd(C1043510dGH.LJJJJLI, this.LL.getRealCreativeIdStr(), this.LL.getRealLogExtra(), null, new AwS100S1200000_16(string, num, l, 1));
    }

    @Override // X.InterfaceC1036110d4L
    public final void LJJ(int i, String str) {
        if (!LJJLIIIIJ(this.LL)) {
            return;
        }
        new AdWebEventLogger(this.LL).logAd(C1040990dCD.LIZ, this.LL.getAwemeRawAd(), new AwS24S1101000_16(i, this, str, 0));
    }

    @Override // X.InterfaceC1036110d4L
    public final void LJJIIJ(String str, String str2) {
        new AdWebEventLogger(this.LL).logAd(C2266021Dmi.LIZ, this.LL.getAwemeRawAd(), new AwS16S2000000_16(str, str2, 1));
    }

    @Override // X.InterfaceC1036110d4L
    public final void LJJIJ(String str, String str2) {
        new AdWebEventLogger(this.LL).logAd(C2266001Dmg.LIZ, this.LL.getAwemeRawAd(), new AwS16S2000000_16(str, str2, 0));
    }

    @Override // X.InterfaceC1036110d4L
    public final void LJJIZ(String str, String str2) {
        C1023960ckk c1023960ckk = C2265761DmI.LIZ;
        C1040750dBp.LIZ.getClass();
        LJJLIIIJLLLLLLLZ(c1023960ckk, C1040750dBp.LJIJ, Boolean.TRUE, str, str2, null);
    }

    @Override // X.InterfaceC1036110d4L
    public final void LJJJ(Integer num, String str) {
        new AdWebEventLogger(this.LL).logAd(C2265861DmS.LIZ, this.LL.getAwemeRawAd(), new AwS130S1100000_16(str, num, 10));
    }

    @Override // X.InterfaceC1036110d4L
    public final void LJJJJI(int i, int i2) {
        if (LJJLIIIIJ(this.LL)) {
            new AdWebEventLogger(this.LL).logAd(C2265921DmY.LIZ, this.LL.getAwemeRawAd(), new AwS14S0002000_16(i, i2, 0));
        }
        if (LJJLIIIJILLIZJL(this.LL)) {
            C1040580dBY c1040580dBY = new C1040580dBY(this.LL);
            C1040750dBp.LIZ.getClass();
            c1040580dBY.log(C1040750dBp.LJJJJIZL, new AwS14S0002000_16(i, i2, 1));
        }
    }

    @Override // X.InterfaceC1036110d4L
    public final void LJJJJL(int i, String str) {
        String creativeIdStr;
        String logExtra;
        AdWebEventLogger adWebEventLogger = new AdWebEventLogger(this.LL);
        C1043510dGH.LIZ.getClass();
        C1023960ckk c1023960ckk = C1043510dGH.LJJJJZI;
        AwemeRawAd awemeRawAd = this.LL.getAwemeRawAd();
        if (awemeRawAd == null || (creativeIdStr = awemeRawAd.getCreativeIdStr()) == null) {
            creativeIdStr = "";
        }
        AwemeRawAd awemeRawAd2 = this.LL.getAwemeRawAd();
        if (awemeRawAd2 != null) {
            logExtra = awemeRawAd2.getLogExtra();
        } else {
            logExtra = null;
        }
        adWebEventLogger.logAd(c1023960ckk, creativeIdStr, logExtra, null, new AwS24S1101000_16(i, this, str, 1));
    }

    @Override // X.InterfaceC1036110d4L
    public final void LJJJJLL(int i, Integer num) {
        if (LJJLIIIIJ(this.LL)) {
            new AdWebEventLogger(this.LL).logAd(C2268011Dpv.LIZ, this.LL.getRealCreativeIdStr(), this.LL.getRealLogExtra(), null, new AwS101S0201000_16(i, num, this, 2));
        }
        if (LJJLIIIJILLIZJL(this.LL)) {
            C1040580dBY c1040580dBY = new C1040580dBY(this.LL);
            C1040750dBp.LIZ.getClass();
            c1040580dBY.log(C1040750dBp.LJJIIJ, new AwS101S0201000_16(i, num, this, 3));
        }
    }

    public final void LJJJZ(EnumC1039490d9n enumC1039490d9n, WebView webView) {
        if ((LJJLIIIIJ(this.LL) || LJJLIIIJILLIZJL(this.LL)) && webView != null) {
            webView.setId(R.id.ac3);
            C1039460d9k c1039460d9k = this.LLJJL;
            if (c1039460d9k != null) {
                C1039470d9l c1039470d9l = c1039460d9k.LIZ;
                c1039470d9l.getClass();
                State state = c1039470d9l.LIZ;
                c1039470d9l.LIZ(enumC1039490d9n, new State(state.viewable, true, state.sessionStarted));
            }
            C2211751BhN.LJ(C2211751BhN.LJIIIZ(), false);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v2, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r3v4 */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final void LJJLIIIJJIZ(WebView webView, int i) {
        Long l;
        ?? r3;
        FeatureCenterModel feature;
        if (this.LLJJ) {
            return;
        }
        long jCurrentTimeMillis = System.currentTimeMillis() - this.LL.getWebInitTime();
        long jCurrentTimeMillis2 = System.currentTimeMillis() - this.LLJILJILJ;
        if (this.LLILLL == 1) {
            System.currentTimeMillis();
            this.LL.setBackgroundDurationFromFinish(0L);
            if (i == 0) {
                this.LLJILLL = System.currentTimeMillis();
            }
        }
        AwemeRawAd awemeRawAd = this.LL.getAwemeRawAd();
        if (awemeRawAd != null && (feature = awemeRawAd.getFeature()) != null) {
            l = feature.pricingType;
        } else {
            l = null;
        }
        if (LJJLIIIIJ(this.LL)) {
            this.LLILZIL = !this.LLILZ ? 1 : 0;
            new AdWebEventLogger(this.LL).logAd(C1E1N.LIZ, this.LL.getRealCreativeIdStr(), this.LL.getRealLogExtra(), null, new C1052440dUg(this, webView, jCurrentTimeMillis, jCurrentTimeMillis2, i, l));
            this.LLILZ = true;
        }
        if (LJJLIIIJILLIZJL(this.LL)) {
            C1040580dBY c1040580dBY = new C1040580dBY(this.LL);
            C1040750dBp.LIZ.getClass();
            r3 = 0;
            c1040580dBY.log(C1040750dBp.LJI, new C1040560dBW(this, jCurrentTimeMillis, jCurrentTimeMillis2, i, webView));
            this.LLILZ = true;
        } else {
            r3 = 0;
        }
        if (this.LLILLL == 1 && i != 1) {
            this.LLJJJIL = r3;
            LJJJZ(EnumC1039490d9n.CLICK_ON_LOAD, webView);
        }
        C1039550d9t.LIZIZ = this.LL;
        C1039550d9t.LIZJ = this.LLILLL;
        C1039550d9t.LIZLLL = r3;
        C1039550d9t.LJ = this.LLJI;
        C1039550d9t.LJFF = Integer.valueOf(this.LLJJIJIL);
        if (i != 1 || (!this.LL.isPreRender() && !this.LL.getEnableReuseWeb())) {
            this.LLJJ = true;
        }
        if (((IAdWebUtils) ServiceManager.get().getService(IAdWebUtils.class)).nr(this.LL)) {
            this.LL.setHasPageStart(r3);
        }
        try {
            SettingsManager.LIZLLL().getClass();
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C1AF0.LJ(th);
        }
        if (SettingsManager.LIZ("ad_web_expose_all_piv_enable", true)) {
            this.LLILLL = r3;
        }
    }

    public final void LJJLIIIJL(SparkContext sparkContext, int i) {
        Object c098200Yq;
        long jCurrentTimeMillis;
        try {
            JSONObject jSONObject = new JSONObject();
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("progressChange");
            sbLIZ.append(i);
            jSONObject.put("progressType", C2188811AlT.LIZIZ(sbLIZ));
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("iab_load_progress_update", jSONObject);
            ((ICommerceService) ServiceManager.get().getService(ICommerceService.class)).LIZ().gz1(new C0SCL(jSONObject2), sparkContext);
            c098200Yq = Unit.LIZ;
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        C189200o6.m5exceptionOrNullimpl(c098200Yq);
        if (this.LLJILJIL > this.LLJILJILJ) {
            jCurrentTimeMillis = 0;
        } else {
            jCurrentTimeMillis = System.currentTimeMillis() - this.LLJILJILJ;
        }
        if (LJJLIIIIJ(this.LL)) {
            new AdWebEventLogger(this.LL).logAd(C2273181DyG.LIZ, this.LL.getRealCreativeIdStr(), this.LL.getRealLogExtra(), null, new C2273191DyH(this, i, jCurrentTimeMillis));
        }
        if (LJJLIIIJILLIZJL(this.LL)) {
            C1040580dBY c1040580dBY = new C1040580dBY(this.LL);
            C1040750dBp.LIZ.getClass();
            c1040580dBY.log(C1040750dBp.LJII, new AwS9S0101100_16(this, i, jCurrentTimeMillis, 5));
        }
    }

    public final void LJJZZI(Function0<Unit> function0, WebView webView) {
        String str;
        EnumC1037150d61 enumC1037150d61;
        C1039560d9u.LIZ(this.LLJI, this);
        this.LL.setHadLog(Boolean.TRUE);
        if (this.LLJJ) {
            return;
        }
        String str2 = this.LLJI;
        C1040210dAx c1040210dAx = this.LLJJIJI;
        if (c1040210dAx != null) {
            str = c1040210dAx.LIZ;
        } else {
            str = null;
        }
        if (Intrinsics.LJFF(str2, str) && this.LLJJIJI != null) {
            this.LLJJIJI = null;
            this.LLJJ = true;
            return;
        }
        C1035910d41 webLoadStatusModel = this.LL.getWebLoadStatusModel();
        webLoadStatusModel.setTotalDuration(System.currentTimeMillis() - this.LL.getWebInitTime());
        webLoadStatusModel.setLoadDuration(System.currentTimeMillis() - this.LLJILJILJ);
        if (this.LLILLL == 1) {
            System.currentTimeMillis();
            this.LLJILLL = System.currentTimeMillis();
        }
        long j = this.LL.getWebLoadStatusModel().totalDuration;
        long j2 = this.LL.getWebLoadStatusModel().loadDuration;
        InterfaceC1030370cv5 interfaceC1030370cv5 = (InterfaceC1030370cv5) ((ICommerceService) ServiceManager.get().getService(ICommerceService.class)).LIZ().VW0(InterfaceC1030370cv5.class);
        if (interfaceC1030370cv5 != null && interfaceC1030370cv5.r42(this.LL.getAwemeRawAd()) && (enumC1037150d61 = this.LL.getAdCommonData().webViewVisible) != EnumC1037150d61.VISIBLE && enumC1037150d61 != EnumC1037150d61.SLIDING) {
            LJJIIJZLJL(j, j2, false, true, webView);
        } else {
            LJJIIJZLJL(j, j2, false, false, webView);
        }
        if (this.LLILLL == 1) {
            this.LLJJJIL = true;
            this.LL.setBackgroundDurationFromFinish(0L);
        }
        function0.invoke();
        C1039550d9t.LIZIZ = this.LL;
        C1039550d9t.LIZJ = this.LLILLL;
        C1039550d9t.LIZLLL = 1;
        C1039550d9t.LJ = this.LLJI;
        C1039550d9t.LJFF = Integer.valueOf(this.LLJJIJIL);
        this.LLJJ = true;
        this.LL.setHasPageStart(0);
        try {
            SettingsManager.LIZLLL().getClass();
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C1AF0.LJ(th);
        }
        if (SettingsManager.LIZ("ad_web_expose_all_piv_enable", true)) {
            this.LLILLL = 0;
        }
    }

    @Override // X.InterfaceC1039570d9v
    public final void C1(Long l, int i, List list) {
        if (LJJLIIIIJ(this.LL)) {
            new AdWebEventLogger(this.LL).logAd(C2268461Dqe.LIZ, this.LL.getRealCreativeIdStr(), this.LL.getRealLogExtra(), null, new AwS43S0301000_16(this, (C1040740dBo) list, (List<LogItem>) l, (Long) i, 1));
        }
        if (LJJLIIIJILLIZJL(this.LL)) {
            C1040580dBY c1040580dBY = new C1040580dBY(this.LL);
            C1040750dBp.LIZ.getClass();
            c1040580dBY.log(C1040750dBp.LJJIIJZLJL, new AwS43S0301000_16(this, (C1040740dBo) list, (List<LogItem>) l, (Long) i, 2));
        }
    }

    @Override // X.InterfaceC1029330ctP
    public final void LJJJJIZL(String str, boolean z, Boolean bool) {
        IAdWebUtils iAdWebUtils = (IAdWebUtils) PluggableExtentionKt.pluggableSpi$default(IAdWebUtils.class, false, false, false, 14, null);
        if (iAdWebUtils != null && !iAdWebUtils.nr(this.LL)) {
            try {
                SettingsManager.LIZLLL().getClass();
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                C1AF0.LJ(th);
            }
            if (!SettingsManager.LIZ("iab_reuse_w2a_forbidden", false)) {
                LJJLIIIJLJLI("track");
            } else {
                this.LL.getReuseDataModel().setWebReuseMode(EnumC1036690d5H.NORMAL);
                LJJLIIIJLJLI("w2a_jump");
            }
        }
        if (LJJLIIIIJ(this.LL)) {
            AdWebEventLogger adWebEventLogger = new AdWebEventLogger(this.LL);
            C1043510dGH.LIZ.getClass();
            adWebEventLogger.logAd(C1043510dGH.LJJIIJZLJL, this.LL.getRealCreativeIdStr(), this.LL.getRealLogExtra(), null, new C1040760dBq(z, str, this, bool));
        } else if (LJJLIIIJILLIZJL(this.LL)) {
            C1040580dBY c1040580dBY = new C1040580dBY(this.LL);
            C1040750dBp.LIZ.getClass();
            c1040580dBY.log(C1040750dBp.LJJ, new AwS35S1110000_16(z, str, this, 0));
        }
    }

    @Override // X.InterfaceC1036110d4L
    public final void LJJJJZ(Integer num, Integer num2, Long l) {
        if (!LJJLIIIIJ(this.LL)) {
            return;
        }
        C844470XAv.LIZ.getClass();
        String string = C786410Ut5.e3(C844470XAv.LIZ()).toString();
        AdWebEventLogger adWebEventLogger = new AdWebEventLogger(this.LL);
        C1043510dGH.LIZ.getClass();
        adWebEventLogger.logAd(C1043510dGH.LJJJJLL, this.LL.getRealCreativeIdStr(), this.LL.getRealLogExtra(), null, new AwS56S1300000_16(string, num, num2, l, 0));
    }

    public final void LJJJLZIJ(int i, Integer num, String str) {
        if (LJJLIIIIJ(this.LL)) {
            AdWebEventLogger adWebEventLogger = new AdWebEventLogger(this.LL);
            C1043510dGH.LIZ.getClass();
            adWebEventLogger.logAd(C1043510dGH.LJI, this.LL.getRealCreativeIdStr(), this.LL.getRealLogExtra(), null, new C1040790dBt(this, str, i, num));
        }
    }

    public final void LJJLIL(Integer num, Integer num2, String str) {
        ShopifyCheckoutEntity shopifyData;
        if (!LJJLIIIIJ(this.LL)) {
            return;
        }
        AwemeRawAd awemeRawAd = this.LL.getAwemeRawAd();
        if (awemeRawAd != null) {
            shopifyData = awemeRawAd.getShopifyData();
        } else {
            shopifyData = null;
        }
        C844470XAv.LIZ.getClass();
        String string = C786410Ut5.e3(C844470XAv.LIZ()).toString();
        AdWebEventLogger adWebEventLogger = new AdWebEventLogger(this.LL);
        C1043510dGH.LIZ.getClass();
        adWebEventLogger.logAd(C1043510dGH.LJJIJIIJI, this.LL.getRealCreativeIdStr(), this.LL.getRealLogExtra(), null, new AwS5S2400000_16(shopifyData, this, num, num2, str, string, 1));
    }

    @Override // X.InterfaceC1036110d4L
    public final void LIZLLL(int i, String str, boolean z, boolean z2) {
        if (LJJLIIIIJ(this.LL)) {
            new AdWebEventLogger(this.LL).logAd(C2265961Dmc.LIZ, this.LL.getRealCreativeIdStr(), this.LL.getRealLogExtra(), null, new AwS0S1121000_16(i, this, str, z, z2, 5));
        }
        if (LJJLIIIJILLIZJL(this.LL)) {
            C1040580dBY c1040580dBY = new C1040580dBY(this.LL);
            C1040750dBp.LIZ.getClass();
            c1040580dBY.log(C1040750dBp.LJIJJ, new AwS0S1121000_16(i, this, str, z, z2, 3));
        }
    }

    @Override // X.InterfaceC1029330ctP
    public final void LJI(int i, String str, boolean z, boolean z2) {
        C1007810cKh c1007810cKh;
        C1023960ckk c1023960ckk;
        if (LJJLIIIIJ(this.LL)) {
            AdWebEventLogger adWebEventLogger = new AdWebEventLogger(this.LL);
            C1043510dGH.LIZ.getClass();
            if (z) {
                c1023960ckk = C1043510dGH.LJJIIZ;
            } else {
                c1023960ckk = C1043510dGH.LJJIIZI;
            }
            adWebEventLogger.logAd(c1023960ckk, this.LL.getRealCreativeIdStr(), this.LL.getRealLogExtra(), null, new AwS0S1121000_16(i, this, str, z2, z, 0));
        }
        if (LJJLIIIJILLIZJL(this.LL)) {
            C1040580dBY c1040580dBY = new C1040580dBY(this.LL);
            C1040750dBp.LIZ.getClass();
            if (z) {
                c1007810cKh = C1040750dBp.LJJI;
            } else {
                c1007810cKh = C1040750dBp.LJJIFFI;
            }
            c1040580dBY.log(c1007810cKh, new AwS0S1121000_16(i, this, str, z2, z, 1));
        }
    }

    @Override // X.InterfaceC1036110d4L
    public final void LJJJJZI(int i, String str, boolean z, boolean z2) {
        if (LJJLIIIIJ(this.LL)) {
            new AdWebEventLogger(this.LL).logAd(C2265941Dma.LIZ, this.LL.getRealCreativeIdStr(), this.LL.getRealLogExtra(), null, new AwS0S1121000_16(i, this, str, z, z2, 4));
        }
        if (LJJLIIIJILLIZJL(this.LL)) {
            C1040580dBY c1040580dBY = new C1040580dBY(this.LL);
            C1040750dBp.LIZ.getClass();
            c1040580dBY.log(C1040750dBp.LJIJJLI, new AwS0S1121000_16(i, this, str, z, z2, 2));
        }
    }

    public final void LJJLIIIJJI(String str, String str2, String str3, String str4) {
        if (LJJLIIIIJ(this.LL)) {
            new AdWebEventLogger(this.LL).logAd(C2265781DmK.LIZ, this.LL.getRealCreativeIdStr(), this.LL.getRealLogExtra(), null, new AwS0S4000000_16(str, str2, str3, str4, 2));
        }
        if (LJJLIIIJILLIZJL(this.LL)) {
            C1040580dBY c1040580dBY = new C1040580dBY(this.LL);
            C1040750dBp.LIZ.getClass();
            c1040580dBY.log(C1040750dBp.LJJIII, new AwS0S4000000_16(str, str2, str3, str4, 3));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0126  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0171  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x01b9  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x01bd  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x01c1  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x01c4  */
    /* JADX WARN: Type inference failed for: r0v29 */
    /* JADX WARN: Type inference failed for: r0v35 */
    /* JADX WARN: Type inference failed for: r0v37 */
    @Override // X.InterfaceC1036110d4L
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJJIIJZLJL(long r25, long r27, boolean r29, boolean r30, android.webkit.WebView r31) {
        /*
            Method dump skipped, instruction units count: 565
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1040740dBo.LJJIIJZLJL(long, long, boolean, boolean, android.webkit.WebView):void");
    }

    public final void LJJZZIII(WebView webView, boolean z, Integer num, String str, Integer num2) {
        String str2;
        FragmentManager supportFragmentManager;
        if (!this.LLJJJJ && Intrinsics.LJFF(this.LL.getNeedShowEventPopup(), Boolean.TRUE)) {
            this.LLJJJJ = true;
            C844470XAv.LIZ.getClass();
            if (Intrinsics.LJFF(C844470XAv.LJIILL, "local_test") && webView != null) {
                Context context = webView.getContext();
                LinearLayout linearLayout = new LinearLayout(context);
                linearLayout.setOrientation(1);
                C786410Ut5.d6(linearLayout, new FrameLayout.LayoutParams(-1, -1));
                AttributeSet attributeSet = null;
                int i = 6;
                int i2 = 0;
                TuxTextView tuxTextView = new TuxTextView(context, attributeSet, i, i2);
                tuxTextView.setTextSize(22.0f);
                tuxTextView.setGravity(1);
                if (z) {
                    str2 = "Load finish";
                } else {
                    str2 = "Load fail";
                }
                tuxTextView.setText(str2);
                tuxTextView.setId(R.id.tv_web_log_sheet_title);
                linearLayout.addView(tuxTextView);
                if (!z) {
                    TuxTextView tuxTextView2 = new TuxTextView(context, attributeSet, i, i2);
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("error code: ");
                    sbLIZ.append(num);
                    tuxTextView2.setText(C2188811AlT.LIZIZ(sbLIZ));
                    LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
                    float f = 10;
                    layoutParams.setMargins((int) (context.getResources().getDisplayMetrics().density * f), 0, 0, 0);
                    tuxTextView2.setId(R.id.tv_web_log_sheet_error_code);
                    C786410Ut5.R6(tuxTextView2, layoutParams);
                    linearLayout.addView(tuxTextView2);
                    TuxTextView tuxTextView3 = new TuxTextView(context, attributeSet, i, i2);
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("error message: ");
                    sbLIZ2.append(str);
                    tuxTextView3.setText(C2188811AlT.LIZIZ(sbLIZ2));
                    tuxTextView3.setId(R.id.tv_web_log_sheet_error_msg);
                    layoutParams.setMargins((int) (f * context.getResources().getDisplayMetrics().density), 0, 0, 0);
                    C786410Ut5.R6(tuxTextView3, layoutParams);
                    linearLayout.addView(tuxTextView3);
                }
                if (num2 != null) {
                    int iIntValue = num2.intValue();
                    TuxTextView tuxTextView4 = new TuxTextView(context, attributeSet, i, i2);
                    StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                    sbLIZ3.append("preloadStatus: ");
                    sbLIZ3.append(iIntValue);
                    tuxTextView4.setText(C2188811AlT.LIZIZ(sbLIZ3));
                    C786410Ut5.R6(tuxTextView4, new LinearLayout.LayoutParams(-1, -2));
                    tuxTextView4.setId(R.id.tv_web_log_sheet_preload_status);
                    linearLayout.addView(tuxTextView4);
                }
                C19EG c19egLIZIZ = C1388190mED.LIZIZ(webView.getContext());
                if (c19egLIZIZ != null && (supportFragmentManager = c19egLIZIZ.getSupportFragmentManager()) != null) {
                    C1390920mIc c1390920mIc = new C1390920mIc(false, 0);
                    TuxSheet tuxSheet = c1390920mIc.LIZ;
                    tuxSheet.LLJJIII = linearLayout;
                    tuxSheet.LLJLILLLLZIIL = false;
                    tuxSheet.LLILLJJLI = new DialogInterface.OnDismissListener() { // from class: X.0dC1
                        @Override // android.content.DialogInterface.OnDismissListener
                        public final void onDismiss(DialogInterface dialogInterface) {
                        }
                    };
                    c1390920mIc.LJIIIIZZ(0);
                    c1390920mIc.LIZ.show(supportFragmentManager, "adlp_debug");
                }
            }
        }
    }

    public final void LJJLIIIJLLLLLLLZ(C1023960ckk c1023960ckk, C1007810cKh c1007810cKh, Boolean bool, String str, String str2, Integer num) {
        if (LJJLIIIIJ(this.LL)) {
            new AdWebEventLogger(this.LL).logAd(c1023960ckk, this.LL.getAwemeRawAd(), new AwS8S2300000_16(str2, this, num, bool, str, 0));
        }
        if (LJJLIIIJILLIZJL(this.LL)) {
            new C1040580dBY(this.LL).log(c1007810cKh, new AwS23S2200000_16(str2, this, bool, str, 0));
        }
    }
}
