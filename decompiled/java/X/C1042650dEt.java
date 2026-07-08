package X;

import Y.ARunnableS0S1130000_16;
import Y.ARunnableS116S0100000_16;
import Y.ARunnableS3S1110000_16;
import android.webkit.WebView;
import com.bytedance.lynx.hybrid.ssp.base.SSPResponse;
import com.bytedance.lynx.hybrid.webkit.WebKitView;
import com.bytedance.lynx.hybrid.webkit.ttwebview.TTWebViewHelper;
import com.google.gson.n;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.ss.android.ugc.aweme.feed.model.ad.FeatureCenterModel;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0dEt, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1042650dEt implements InterfaceC1042230dED {
    public final String LIZ;
    public final String LIZIZ;
    public final String LIZJ;
    public final String LIZLLL;
    public final SSPResponse.Data LJ;
    public final String LJFF;
    public final boolean LJI;
    public final AwemeRawAd LJII;
    public Boolean LJIIIIZZ;
    public final C1035880d3y LJIIIZ;
    public int LJIIJ;
    public int LJIIJJI;
    public int LJIIL;
    public final Set<String> LJIILIIL;
    public final Set<String> LJIILJJIL;
    public final Set<String> LJIILL;
    public final Set<String> LJIILLIIL;
    public final Set<String> LJIIZILJ;
    public final Set<String> LJIJ;
    public final Set<String> LJIJI;
    public final Set<String> LJIJJ;
    public final Set<String> LJIJJLI;
    public final Set<String> LJIL;
    public final Set<String> LJJ;
    public final Set<String> LJJI;
    public final Set<String> LJJIFFI;
    public final AtomicBoolean LJJII;
    public final AtomicBoolean LJJIII;

    @Override // X.InterfaceC1042230dED
    public final void LIZJ(WebKitView webKitView, C1035880d3y c1035880d3y, boolean z) {
    }

    @Override // X.InterfaceC1042230dED
    public final void LIZLLL(SSPResponse.Data data, String str, String str2, boolean z, AwemeRawAd awemeRawAd, C1035880d3y c1035880d3y) {
    }

    @Override // X.InterfaceC1042230dED
    public final void LJ(C1035880d3y c1035880d3y) {
    }

    @Override // X.InterfaceC1042230dED
    public final String LJIIIIZZ() {
        return "";
    }

    @Override // X.InterfaceC1042230dED
    public final void LJIIJ(String str, String str2, String str3, WebView webView, C1035880d3y c1035880d3y, boolean z) {
    }

    @Override // X.InterfaceC1042230dED
    public final void LJIIL(C1042770dF5 c1042770dF5) {
    }

    @Override // X.InterfaceC1042230dED
    public final void LJIILIIL(InterfaceC1041500dD2 interfaceC1041500dD2, String str) {
    }

    public final void LJIILL() {
        C1490740otc c1490740otc = C1490740otc.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("consumeSSPResponse. URL: ");
        sbLIZ.append(this.LIZLLL);
        C1490740otc.LIZIZ(c1490740otc, C2188811AlT.LIZIZ(sbLIZ), null, "CommerceLandPageSSPContext_", 2);
        C1043040dFW.LIZ(new ARunnableS116S0100000_16(this, 19));
    }

    @Override // X.InterfaceC1042230dED
    public final boolean LIZ(String str) {
        SSPResponse.Prefetch[] prefetchArr = this.LJ.prefetchList;
        if (prefetchArr != null) {
            for (SSPResponse.Prefetch prefetch : prefetchArr) {
                if (Intrinsics.LJFF(str, prefetch.url)) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // X.InterfaceC1042230dED
    public final void LJFF(JSONObject jSONObject) {
        jSONObject.put("ttweb_preconnect_from", this.LJIIJ);
        jSONObject.put("ttweb_preconnect_ready", this.LJIIJJI);
        jSONObject.put("ttweb_prefetch_ready", this.LJIIL);
    }

    @Override // X.InterfaceC1042230dED
    public final void LJIIJJI(WebView webView) {
        if (this.LJJII.get()) {
            C1490740otc.LIZIZ(C1490740otc.LIZ, "onLoaded after release", null, "CommerceLandPageSSPContext_", 2);
            return;
        }
        if (!this.LJJIII.compareAndSet(false, true)) {
            C1490740otc.LIZIZ(C1490740otc.LIZ, "duplicate onLoaded", null, "CommerceLandPageSSPContext_", 2);
            return;
        }
        if (C2206681BYc.LIZIZ()) {
            C1490740otc c1490740otc = C1490740otc.LIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("start to preconnect for subpage. URL: ");
            sbLIZ.append(this.LIZLLL);
            C1490740otc.LIZIZ(c1490740otc, C2188811AlT.LIZIZ(sbLIZ), null, "CommerceLandPageSSPContext_", 2);
            LJIIZILJ(this.LJ.subpagePreConnectList, true);
        }
    }

    public static void LJIILJJIL(C1023640ckE c1023640ckE, InterfaceC1041500dD2 interfaceC1041500dD2) {
        C1035880d3y c1035880d3y;
        String string;
        String string2;
        double d;
        FeatureCenterModel feature;
        Integer num;
        FeatureCenterModel feature2;
        Integer num2;
        if ((interfaceC1041500dD2 instanceof C1035880d3y) && (c1035880d3y = (C1035880d3y) interfaceC1041500dD2) != null) {
            C1042690dEx.LIZ.getClass();
            C1002190cBd c1002190cBd = C1042690dEx.LJJJJLL;
            C1035880d3y c1035880d3y2 = (C1035880d3y) interfaceC1041500dD2;
            String lpRefer = c1035880d3y2.getLpRefer();
            String str = "";
            if (lpRefer == null) {
                lpRefer = "";
            }
            c1023640ckE.withParam(c1002190cBd, lpRefer);
            C1002190cBd c1002190cBd2 = C1042690dEx.LJJJJZI;
            AwemeRawAd rawAd = c1035880d3y2.getRawAd();
            if (rawAd == null || (feature2 = rawAd.getFeature()) == null || (num2 = feature2.landingPageSSPOptType) == null || (string = num2.toString()) == null) {
                string = "";
            }
            c1023640ckE.withParam(c1002190cBd2, string);
            C1002190cBd c1002190cBd3 = C1042690dEx.LJJJJZ;
            AwemeRawAd rawAd2 = c1035880d3y.getRawAd();
            if (rawAd2 == null || (feature = rawAd2.getFeature()) == null || (num = feature.landingPageRedirectType) == null || (string2 = num.toString()) == null) {
                string2 = "";
            }
            c1023640ckE.withParam(c1002190cBd3, string2);
            c1023640ckE.withParam(C1042690dEx.LJJJLIIL, String.valueOf(c1035880d3y.getRedirectTypeAtPageStart()));
            c1023640ckE.withParam(C1042690dEx.LJJJLL, c1035880d3y2.getRealCreativeIdStr());
            C1002190cBd c1002190cBd4 = C1042690dEx.LJJJLZIJ;
            String requestId = c1035880d3y.getRequestId();
            if (requestId != null) {
                str = requestId;
            }
            c1023640ckE.withParam(c1002190cBd4, str);
            c1023640ckE.withParam(C1042690dEx.LJJLI, Long.valueOf(c1035880d3y.isNineScreen()));
            c1023640ckE.withParam(C1042690dEx.LJJLIIIJ, Integer.valueOf(c1035880d3y.getResourceModel().cancelByTypeCount.get()));
            c1023640ckE.withParam(C1042690dEx.LJJLIIIJJI, Integer.valueOf(c1035880d3y.getResourceModel().cancelByDurationCount.get()));
            c1023640ckE.withParam(C1042690dEx.LJJLIIIJILLIZJL, Integer.valueOf(c1035880d3y.getResourceModel().cancelByMaxReuseCount.get()));
            c1023640ckE.withParam(C1042690dEx.LJJLIIIIJ, Integer.valueOf(c1035880d3y.getResourceModel().cancelByStatusCount.get()));
            if (c1035880d3y.getResourceModel().cancelByDurationCount.get() > 0) {
                d = c1035880d3y.getResourceModel().totalDuration.get() / ((double) c1035880d3y.getResourceModel().cancelByDurationCount.get());
            } else {
                d = 0.0d;
            }
            c1023640ckE.withParam(C1042690dEx.LJJLIIIJJIZ, Double.valueOf(d));
        }
    }

    @Override // X.InterfaceC1042230dED
    public final void LJII(WebView webView, InterfaceC1041500dD2 interfaceC1041500dD2) {
        if (TTWebViewHelper.INSTANCE.isTTWebView(webView) && C2206681BYc.LIZIZ() && this.LJIIJJI == 0) {
            LJIIZILJ(this.LJ.preConnectList, false);
            if (this.LJIIJJI == 1) {
                this.LJIIJ = 2;
            }
            C1490740otc.LIZIZ(C1490740otc.LIZ, "onLoaded retry ttweb preconnect.", null, "CommerceLandPageSSPContext_", 2);
        }
    }

    public final void LJIIZILJ(SSPResponse.PreConnect[] preConnectArr, boolean z) {
        if (this.LJII == null) {
            return;
        }
        C1043460dGC.LIZ.getClass();
        List listLIZIZ = C1043460dGC.LIZIZ(preConnectArr);
        ArrayList<String> arrayList = new ArrayList(C15438062q.LJIJJ(listLIZIZ, 10));
        Iterator it2 = listLIZIZ.iterator();
        while (it2.hasNext()) {
            arrayList.add(((SSPResponse.PreConnect) it2.next()).domain);
        }
        for (String str : arrayList) {
            if (str != null) {
                if (TTWebViewHelper.INSTANCE.tryPreConnect(str)) {
                    this.LJIIJJI = 1;
                    if (z) {
                        this.LJIILJJIL.add(str);
                    } else {
                        this.LJIILIIL.add(str);
                    }
                    C1490740otc c1490740otc = C1490740otc.LIZ;
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("submit ttweb preconnect url ");
                    sbLIZ.append(str);
                    sbLIZ.append(", success");
                    c1490740otc.LIZ(C2188811AlT.LIZIZ(sbLIZ), EnumC1490770otf.D, "CommerceLandPageSSPContext_");
                } else {
                    this.LJIIJJI = 0;
                    C1490740otc c1490740otc2 = C1490740otc.LIZ;
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("submit ttweb preconnect url ");
                    sbLIZ2.append(str);
                    sbLIZ2.append(", failed!?");
                    c1490740otc2.LIZ(C2188811AlT.LIZIZ(sbLIZ2), EnumC1490770otf.D, "CommerceLandPageSSPContext_");
                    return;
                }
            }
        }
    }

    @Override // X.InterfaceC1041350dCn
    public final void LJI(WebView webView, String str, boolean z) {
        C1043040dFW.LIZ(new ARunnableS3S1110000_16(this, str, z, 0));
    }

    @Override // X.InterfaceC1041350dCn
    public final void LIZIZ(WebView webView, String str, boolean z, boolean z2, boolean z3) {
        C1043040dFW.LIZ(new ARunnableS0S1130000_16(str, z, z2, z3, this, 0));
    }

    @Override // X.InterfaceC1041350dCn
    public final void LJIIIZ(WebView webView, String str, boolean z, boolean z2, boolean z3) {
        C1043040dFW.LIZ(new ARunnableS0S1130000_16(str, z, z2, z3, this, 1));
    }

    public final void LJIILLIIL(final String str, final EnumC1042620dEq enumC1042620dEq, final ArrayList<C1042770dF5> arrayList, final InterfaceC1041500dD2 interfaceC1041500dD2, final boolean z, final EnumC1042630dEr enumC1042630dEr) {
        C1043040dFW.LIZ(new Runnable() { // from class: X.0dEu
            public final void LIZ() {
                double d;
                double d2;
                double d3;
                double d4;
                if (!this.LL.LJJII.compareAndSet(false, true)) {
                    C1490740otc c1490740otc = C1490740otc.LIZ;
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("duplicate release commerce ssp context. url:");
                    sbLIZ.append(this.LL.LIZLLL);
                    C1490740otc.LIZIZ(c1490740otc, C2188811AlT.LIZIZ(sbLIZ), null, "CommerceLandPageSSPContext_", 2);
                    return;
                }
                C1042840dFC c1042840dFC = new C1042840dFC(this.LL.LJIILIIL.size(), this.LL.LJIILLIIL.size(), this.LL.LJIIZILJ.size());
                C1042760dF4 c1042760dF4 = new C1042760dF4(this.LL.LJIJ.size(), this.LL.LJIJJ.size());
                C1042650dEt c1042650dEt = this.LL;
                String str2 = c1042650dEt.LIZLLL;
                String str3 = c1042650dEt.LIZIZ;
                String str4 = c1042650dEt.LIZJ;
                n nVar = new n();
                EnumC1042620dEq enumC1042620dEq2 = enumC1042620dEq;
                C1042650dEt c1042650dEt2 = this.LL;
                C1042690dEx.LIZ.getClass();
                nVar.LJJIIJ(C1042690dEx.LJIIIZ.LIZ, enumC1042620dEq2.getType());
                nVar.LJJIII(Integer.valueOf(c1042650dEt2.LJ.matchType), C1042690dEx.LJI.LIZ);
                nVar.LJJIIJ(C1042690dEx.LJJJI.LIZ, c1042650dEt2.LJ.logID);
                arrayList.add(new C1042770dF5(str2, str3, str4, nVar, 1, c1042840dFC, c1042760dF4));
                C1042650dEt c1042650dEt3 = this.LL;
                String str5 = c1042650dEt3.LIZIZ;
                String str6 = c1042650dEt3.LIZLLL;
                SSPResponse.Data data = c1042650dEt3.LJ;
                String value = C1042580dEm.LJIILIIL.getValue();
                String str7 = str;
                EnumC1042620dEq enumC1042620dEq3 = enumC1042620dEq;
                InterfaceC1041500dD2 interfaceC1041500dD22 = interfaceC1041500dD2;
                boolean z2 = z;
                EnumC1042630dEr enumC1042630dEr2 = enumC1042630dEr;
                SSPResponse.Data data2 = c1042650dEt3.LJ;
                C1042600dEo.LIZIZ(data2.matchType, enumC1042620dEq3, interfaceC1041500dD22, str5, str6, str7, data2.logID, true);
                String str8 = data.logID;
                int i = c1042650dEt3.LJ.matchType;
                int size = c1042650dEt3.LJIILIIL.size();
                int size2 = c1042650dEt3.LJIILLIIL.size();
                int size3 = c1042650dEt3.LJIILL.size();
                int size4 = c1042650dEt3.LJIIZILJ.size();
                int size5 = c1042650dEt3.LJIILJJIL.size();
                int i2 = C992820bwW.LIZ().preconnectImportance;
                double d5 = 0.0d;
                double d6 = size == 0 ? 0.0d : ((double) size2) / ((double) size);
                C1490740otc c1490740otc2 = C1490740otc.LIZ;
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("total cnt ");
                sbLIZ2.append(size);
                sbLIZ2.append(", hit cnt ");
                sbLIZ2.append(size2);
                sbLIZ2.append(", miss cnt ");
                sbLIZ2.append(size4);
                C1490740otc.LIZIZ(c1490740otc2, C2188811AlT.LIZIZ(sbLIZ2), null, "CommerceLandPageSSPContext_", 2);
                C1001830cB3 c1001830cB3 = new C1001830cB3(new Object[0]);
                C1042680dEw.LIZ.getClass();
                c1001830cB3.log(C1042680dEw.LIZLLL, new C1042710dEz(value, str5, str6, d6, size, size5, size2, size3, size4, i2, str7, str8, enumC1042620dEq3, i, c1042650dEt3, enumC1042630dEr2, interfaceC1041500dD22, z2));
                String str9 = data.logID;
                SSPResponse.Data data3 = c1042650dEt3.LJ;
                int i3 = data3.matchType;
                SSPResponse.Prefetch[] prefetchArr = data3.prefetchList;
                int length = prefetchArr != null ? prefetchArr.length : 0;
                int size6 = c1042650dEt3.LJIJ.size();
                int size7 = c1042650dEt3.LJIJJ.size();
                int size8 = c1042650dEt3.LJIJJLI.size();
                int size9 = c1042650dEt3.LJIJI.size();
                int size10 = c1042650dEt3.LJIL.size();
                int size11 = c1042650dEt3.LJJ.size();
                int size12 = c1042650dEt3.LJJI.size();
                int size13 = c1042650dEt3.LJJIFFI.size();
                if (size6 == 0) {
                    d = 0.0d;
                    d2 = 0.0d;
                    d3 = 0.0d;
                } else {
                    d = ((double) size7) / ((double) size6);
                    d2 = ((double) size8) / ((double) size6);
                    d3 = ((double) size10) / ((double) size6);
                }
                if (size11 == 0) {
                    d4 = 0.0d;
                } else {
                    d4 = ((double) size12) / ((double) size11);
                    d5 = ((double) size13) / ((double) size11);
                }
                StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                sbLIZ3.append("total cnt ");
                sbLIZ3.append(size6);
                sbLIZ3.append(", hit cnt ");
                sbLIZ3.append(size7);
                C1490740otc.LIZIZ(c1490740otc2, C2188811AlT.LIZIZ(sbLIZ3), null, "CommerceLandPageSSPContext_", 2);
                new C1001830cB3(new Object[0]).log(C1042680dEw.LIZJ, new C1042700dEy(value, str5, str6, d, size6, size7, size9, size10, d3, size8, d2, length, size11, size12, size13, d4, d5, str7, str9, enumC1042620dEq3, i3, c1042650dEt3, interfaceC1041500dD22, z2));
                StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                sbLIZ4.append("release commerce ssp context. url:");
                sbLIZ4.append(this.LL.LIZLLL);
                C1490740otc.LIZIZ(c1490740otc2, C2188811AlT.LIZIZ(sbLIZ4), null, "CommerceLandPageSSPContext_", 2);
            }

            @Override // java.lang.Runnable
            public final void run() {
                boolean zLIZ;
                C1C7U.LIZ("CommerceLandPageSSPContext@54b7.release$1");
                try {
                    LIZ();
                } finally {
                    if (!zLIZ) {
                    }
                }
                C1C7U.LIZIZ("CommerceLandPageSSPContext@54b7.release$1");
            }
        });
    }

    public C1042650dEt(String str, String str2, String str3, String str4, SSPResponse.Data data, String str5, boolean z, AwemeRawAd awemeRawAd, Boolean bool, C1035880d3y c1035880d3y) {
        this.LIZ = str;
        this.LIZIZ = str2;
        this.LIZJ = str3;
        this.LIZLLL = str4;
        this.LJ = data;
        this.LJFF = str5;
        this.LJI = z;
        this.LJII = awemeRawAd;
        this.LJIIIIZZ = bool;
        this.LJIIIZ = c1035880d3y;
        String.valueOf(hashCode());
        this.LJIIJ = -1;
        this.LJIILIIL = new LinkedHashSet();
        this.LJIILJJIL = new LinkedHashSet();
        this.LJIILL = new LinkedHashSet();
        this.LJIILLIIL = new LinkedHashSet();
        this.LJIIZILJ = new LinkedHashSet();
        this.LJIJ = new LinkedHashSet();
        this.LJIJI = new LinkedHashSet();
        this.LJIJJ = new LinkedHashSet();
        this.LJIJJLI = new LinkedHashSet();
        this.LJIL = new LinkedHashSet();
        this.LJJ = new LinkedHashSet();
        this.LJJI = new LinkedHashSet();
        this.LJJIFFI = new LinkedHashSet();
        this.LJJII = new AtomicBoolean(false);
        this.LJJIII = new AtomicBoolean(false);
    }
}
