package X;

import Y.ARunnableS128S0100000_28;
import com.bytedance.touchpoint.api.model.LynxFeedBannerPicture;
import com.bytedance.touchpoint.core.experiment.IncentiveLynxCardConfig;
import com.ss.android.ugc.incentive.crossplatform.headless.PrefetchUtils;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.AwS568S0100000_24;
import kotlin.jvm.internal.AwS572S0100000_28;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0zOM, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C1894200zOM implements InterfaceC1141530foN {
    public final String LL;
    public LynxFeedBannerPicture LLILLJJLI;
    public Map<String, ? extends Object> LLILLL;
    public SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB LLJILJIL;
    public long LLJILJILJ;
    public boolean LLJILLL;
    public boolean LLJJ;
    public final C01GW LLILZ = C452501pT.LIZIZ(new AwS572S0100000_28(this, 994));
    public final C01GW LLILZIL = C452501pT.LIZIZ(new AwS572S0100000_28(this, 993));
    public final C01GW LLILZLL = C452501pT.LIZIZ(new AwS572S0100000_28(this, 991));
    public final C01GW LLIZ = C452501pT.LIZIZ(new AwS572S0100000_28(this, 992));
    public final C01GW LLIZLLLIL = C452501pT.LIZIZ(new AwS572S0100000_28(this, 990));
    public final String LLJ = "incentive_lynx_feed_appear";
    public final String LLJI = "incentive_lynx_feed_disappear";
    public AbstractC1894230zOP LLJIJIL = C1894250zOR.LIZIZ;
    public final C01GW LLJJI = C452501pT.LIZIZ(new AwS572S0100000_28(this, 995));

    public final void LIZIZ() {
        if (this.LLJJ) {
            IncentiveLynxCardConfig incentiveLynxCardConfig = C749302wF.LIZ;
            if (!C749302wF.LIZJ) {
                int i = this.LLJIJIL.LIZ;
                C1894280zOU c1894280zOU = C1894280zOU.LIZIZ;
                if (i < 2) {
                    this.LLJIJIL = c1894280zOU;
                    return;
                }
                return;
            }
            if (this.LLJILLL) {
                int i2 = this.LLJIJIL.LIZ;
                C1894280zOU c1894280zOU2 = C1894280zOU.LIZIZ;
                if (i2 < 2) {
                    this.LLJIJIL = c1894280zOU2;
                }
            }
        }
    }

    public final String LIZ() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(this.LL);
        sbLIZ.append("&spark_perf_biz=incentive_feed_lynx_card");
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.InterfaceC1141530foN
    public final void mh2(C262100zr c262100zr) {
        int i;
        String string;
        InterfaceC1871920yoQ interfaceC1871920yoQLIZ;
        List<Object> list;
        String str = c262100zr.LIZ;
        if (Intrinsics.LJFF(str, this.LLILZ.getValue())) {
            this.LLJJ = true;
            LIZIZ();
            C1894220zOO.LIZIZ(0, this.LL, System.currentTimeMillis() - this.LLJILJILJ, null);
            InterfaceC1107590evd interfaceC1107590evd = c262100zr.LIZIZ;
            if (interfaceC1107590evd != null && (interfaceC1871920yoQLIZ = C1871910yoP.LIZ(interfaceC1107590evd, "jumpUrls", null)) != null && (list = interfaceC1871920yoQLIZ.toList()) != null) {
                ArrayList arrayList = new ArrayList();
                for (Object obj : list) {
                    if (obj instanceof String) {
                        arrayList.add(obj);
                    }
                }
                PrefetchUtils.LIZ(arrayList);
                return;
            }
            return;
        }
        if (Intrinsics.LJFF(str, this.LLILZIL.getValue())) {
            InterfaceC1107590evd interfaceC1107590evd2 = c262100zr.LIZIZ;
            if (interfaceC1107590evd2 != null) {
                i = interfaceC1107590evd2.getInt("code");
            } else {
                i = -1;
            }
            InterfaceC1107590evd interfaceC1107590evd3 = c262100zr.LIZIZ;
            if (interfaceC1107590evd3 == null || (string = interfaceC1107590evd3.getString("errMsg")) == null) {
                string = "";
            }
            C01GW<C759500Tqm> c01gw = C759500Tqm.LJ;
            C739380SzQ.LIZ().LIZLLL(new ARunnableS128S0100000_28(this, 120));
            C1894320zOY c1894320zOY = C1894320zOY.LIZ;
            Map mapLJIIJ = C2097608Jq.LJIIJ(new Pair("block_reason", "resource_load_fail"));
            c1894320zOY.getClass();
            C1894320zOY.LJIILIIL(8, mapLJIIJ);
            String str2 = this.LL;
            long jCurrentTimeMillis = System.currentTimeMillis() - this.LLJILJILJ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("js fail: ");
            sbLIZ.append(string);
            C1894220zOO.LIZIZ(i, str2, jCurrentTimeMillis, C2188811AlT.LIZIZ(sbLIZ));
            return;
        }
        if (Intrinsics.LJFF(str, this.LLILZLL.getValue())) {
            C01U6.LIZIZ(new AwS572S0100000_28(this, 997));
        } else if (Intrinsics.LJFF(str, this.LLIZ.getValue())) {
            C01U6.LIZIZ(new AwS568S0100000_24(c262100zr, 1843));
        }
    }

    public C1894200zOM(String str, LynxFeedBannerPicture lynxFeedBannerPicture, Map<String, ? extends Object> map) {
        this.LL = str;
        this.LLILLJJLI = lynxFeedBannerPicture;
        this.LLILLL = map;
    }
}
