package X;

import android.webkit.WebView;
import androidx.lifecycle.ViewModelProviders;
import com.bytedance.hybrid.spark.SparkContext;
import com.bytedance.hybrid.spark.page.SparkActivity;
import com.ss.android.ugc.aweme.poi.thirdparty.provider.viewmodel.PoiThirdPartyViewModel;
import com.zhiliaoapp.musically.R;
import java.util.Map;
import kotlin.jvm.internal.AwS572S0100000_28;
import kotlin.jvm.internal.AwS607S0100000_28;

/* JADX INFO: renamed from: X.0zMj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C1893190zMj implements InterfaceC1522920pjW {
    public final InterfaceC1893040zMU LIZ;
    public final C1523990plF LIZIZ;
    public C1749280vcc LIZJ;
    public final PoiThirdPartyViewModel LIZLLL;

    @Override // X.InterfaceC1522920pjW
    public final void LIZLLL() {
    }

    @Override // X.InterfaceC1522920pjW
    public final void LJ() {
        PoiThirdPartyViewModel poiThirdPartyViewModel = this.LIZLLL;
        if (poiThirdPartyViewModel != null) {
            poiThirdPartyViewModel.vQ2(EnumC1892960zMM.SAFE);
        }
    }

    @Override // X.InterfaceC1522920pjW
    public final void LIZIZ(Map map) {
        map.put("bid", "poi_third_party");
        C20684815ws.LJIILLIIL("scc_cloudservice_result", map);
    }

    public C1893190zMj(InterfaceC1893040zMU interfaceC1893040zMU, C1523990plF c1523990plF) {
        SparkActivity sparkActivityLIZ;
        this.LIZ = interfaceC1893040zMU;
        this.LIZIZ = c1523990plF;
        SparkContext sparkContextLLIILZL = interfaceC1893040zMU.LLIILZL();
        PoiThirdPartyViewModel poiThirdPartyViewModel = null;
        if (sparkContextLLIILZL != null) {
            sparkActivityLIZ = C1893200zMk.LIZ(sparkContextLLIILZL);
        } else {
            sparkActivityLIZ = null;
        }
        if ((sparkActivityLIZ instanceof C19EG) && sparkActivityLIZ != null) {
            poiThirdPartyViewModel = (PoiThirdPartyViewModel) ViewModelProviders.of(sparkActivityLIZ).get(PoiThirdPartyViewModel.class);
        }
        this.LIZLLL = poiThirdPartyViewModel;
    }

    @Override // X.InterfaceC1522920pjW
    public final void LIZ(WebView webView, String str) {
        PoiThirdPartyViewModel poiThirdPartyViewModel = this.LIZLLL;
        if (poiThirdPartyViewModel != null) {
            poiThirdPartyViewModel.vQ2(EnumC1892960zMM.WARNING);
        }
        C1523990plF c1523990plF = this.LIZIZ;
        if (c1523990plF.LLJ != null) {
            c1523990plF.LLJ.LIZJ(str);
        }
        if (webView != null) {
            webView.reload();
        }
    }

    @Override // X.InterfaceC1522920pjW
    public final void LIZJ(WebView webView, String str) {
        SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEBLIZIZ;
        if (webView == null) {
            return;
        }
        PoiThirdPartyViewModel poiThirdPartyViewModel = this.LIZLLL;
        if (poiThirdPartyViewModel != null) {
            poiThirdPartyViewModel.vQ2(EnumC1892960zMM.DENY);
        }
        if (this.LIZJ == null) {
            C1749280vcc c1749280vcc = new C1749280vcc(webView.getContext(), null, 6);
            c1749280vcc.setLayoutVariant(0);
            this.LIZJ = c1749280vcc;
        }
        C1749280vcc c1749280vcc2 = this.LIZJ;
        if (c1749280vcc2 != null) {
            C1722300uv6 c1722300uv6 = new C1722300uv6();
            AwS572S0100000_28 awS572S0100000_28 = new AwS572S0100000_28(this, 14);
            c1722300uv6.LJI = C20642515q3.LJI(2131821906);
            c1722300uv6.LJIIIIZZ = C20642515q3.LJI(2131821905);
            C419910GdJ c419910GdJ = new C419910GdJ();
            c419910GdJ.LIZ = R.raw.icon_large_protection;
            c419910GdJ.LJ = Integer.valueOf(R.attr.a1p);
            c1722300uv6.LIZJ = 0;
            c1722300uv6.LIZIZ = c419910GdJ;
            c1722300uv6.LJIIIZ = new AwS607S0100000_28(awS572S0100000_28, 13);
            c1749280vcc2.setStatus(c1722300uv6);
        }
        SparkContext sparkContextLLIILZL = this.LIZ.LLIILZL();
        if (sparkContextLLIILZL != null && (sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEBLIZIZ = C1893200zMk.LIZIZ(sparkContextLLIILZL)) != null) {
            sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEBLIZIZ.addView(this.LIZJ);
        }
    }
}
