package X;

import android.webkit.WebView;
import com.bytedance.hybrid.spark.SparkContext;
import com.ss.android.ugc.aweme.poi.thirdparty.provider.viewmodel.PoiThirdPartyViewModel;
import com.zhiliaoapp.musically.R;
import java.util.Map;
import kotlin.jvm.internal.AwS572S0100000_28;
import kotlin.jvm.internal.AwS607S0100000_28;

/* JADX INFO: renamed from: X.0zMi, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C1893180zMi implements InterfaceC1522920pjW {
    public final C1523990plF LIZ;
    public C1749280vcc LIZIZ;
    public InterfaceC1893040zMU LIZJ;
    public PoiThirdPartyViewModel LIZLLL;

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

    public C1893180zMi(C1523990plF c1523990plF) {
        this.LIZ = c1523990plF;
    }

    @Override // X.InterfaceC1522920pjW
    public final void LIZIZ(Map map) {
        map.put("bid", "poi_third_party");
        C20684815ws.LJIILLIIL("scc_cloudservice_result", map);
    }

    @Override // X.InterfaceC1522920pjW
    public final void LIZ(WebView webView, String str) {
        PoiThirdPartyViewModel poiThirdPartyViewModel = this.LIZLLL;
        if (poiThirdPartyViewModel != null) {
            poiThirdPartyViewModel.vQ2(EnumC1892960zMM.WARNING);
        }
        C1523990plF c1523990plF = this.LIZ;
        if (c1523990plF.LLJ != null) {
            c1523990plF.LLJ.LIZJ(str);
        }
        if (webView != null) {
            webView.reload();
        }
    }

    @Override // X.InterfaceC1522920pjW
    public final void LIZJ(WebView webView, String str) {
        SparkContext sparkContextLLIILZL;
        SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEBLIZIZ;
        if (webView == null) {
            return;
        }
        PoiThirdPartyViewModel poiThirdPartyViewModel = this.LIZLLL;
        if (poiThirdPartyViewModel != null) {
            poiThirdPartyViewModel.vQ2(EnumC1892960zMM.DENY);
        }
        if (this.LIZIZ == null) {
            C1749280vcc c1749280vcc = new C1749280vcc(webView.getContext(), null, 6);
            c1749280vcc.setLayoutVariant(0);
            this.LIZIZ = c1749280vcc;
        }
        C1749280vcc c1749280vcc2 = this.LIZIZ;
        if (c1749280vcc2 != null) {
            C1722300uv6 c1722300uv6 = new C1722300uv6();
            AwS572S0100000_28 awS572S0100000_28 = new AwS572S0100000_28(this, 9);
            c1722300uv6.LJI = C20642515q3.LJI(2131821906);
            c1722300uv6.LJIIIIZZ = C20642515q3.LJI(2131821905);
            C419910GdJ c419910GdJ = new C419910GdJ();
            c419910GdJ.LIZ = R.raw.icon_large_protection;
            c419910GdJ.LJ = Integer.valueOf(R.attr.a1p);
            c1722300uv6.LIZJ = 0;
            c1722300uv6.LIZIZ = c419910GdJ;
            c1722300uv6.LJIIIZ = new AwS607S0100000_28(awS572S0100000_28, 14);
            c1749280vcc2.setStatus(c1722300uv6);
        }
        InterfaceC1893040zMU interfaceC1893040zMU = this.LIZJ;
        if (interfaceC1893040zMU != null && (sparkContextLLIILZL = interfaceC1893040zMU.LLIILZL()) != null && (sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEBLIZIZ = C1893200zMk.LIZIZ(sparkContextLLIILZL)) != null) {
            sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEBLIZIZ.addView(this.LIZIZ);
        }
    }
}
