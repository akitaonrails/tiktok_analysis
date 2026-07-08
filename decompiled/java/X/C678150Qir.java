package X;

import Y.AsS37S0100000_10;
import android.content.ComponentCallbacks2;
import android.content.res.Configuration;
import android.widget.LinearLayout;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.n;
import com.ss.android.ugc.aweme.arch.widgets.base.NextLiveData;
import com.ss.android.ugc.aweme.ecommerce.arch.EComSearchBffResp;
import com.ss.android.ugc.aweme.ecommerce.arch.LogPbBean;
import com.ss.android.ugc.aweme.ecommerce.search.page.mix.MixShopSearchBizVM;
import com.ss.android.ugc.aweme.experiment.Mp4ScreenVideoLoadTimeout;
import com.ss.android.ugc.aweme.search.model.SearchResultParam;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.AwS554S0100000_10;
import kotlin.jvm.internal.AwS624S0100000_10;

/* JADX INFO: renamed from: X.0Qir, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C678150Qir implements InterfaceC676500QgC {
    public InterfaceC676520QgE LL;
    public LinearLayout LLILLJJLI;
    public C678130Qip LLILLL;
    public boolean LLILZIL;
    public AsS37S0100000_10 LLILZLL;
    public C678500QjQ LLIZLLLIL;
    public int LLILZ = -1;
    public final C678400QjG LLIZ = new InterfaceC678640Qje() { // from class: X.0QjG
        @Override // X.InterfaceC678640Qje
        public final C678500QjQ LIZ() {
            return this.LIZ.LLIZLLLIL;
        }

        @Override // X.InterfaceC678640Qje
        public final int LIZIZ() {
            return this.LIZ.LLILZ;
        }
    };
    public final AwS624S0100000_10 LLJ = new AwS624S0100000_10(this, 8);
    public final ComponentCallbacks2C678370QjD LLJI = new ComponentCallbacks2() { // from class: X.0QjD
        @Override // android.content.ComponentCallbacks
        public final void onConfigurationChanged(Configuration configuration) {
        }

        @Override // android.content.ComponentCallbacks2
        public final void onTrimMemory(int i) {
        }

        @Override // android.content.ComponentCallbacks
        public final void onLowMemory() {
            InterfaceC676520QgE interfaceC676520QgE = this.LL.LL;
            if (interfaceC676520QgE != null) {
                interfaceC676520QgE.LJIIIIZZ();
            }
        }
    };

    @Override // X.InterfaceC676500QgC
    public final void onCreate() {
    }

    @Override // X.InterfaceC676500QgC
    public final void onDestroy() {
        this.LLILZ = -1;
        this.LLILZIL = false;
        InterfaceC676520QgE interfaceC676520QgE = this.LL;
        if (interfaceC676520QgE != null) {
            interfaceC676520QgE.reset();
        }
    }

    @Override // X.InterfaceC676500QgC
    public final void onPause() {
    }

    @Override // X.InterfaceC676500QgC
    public final void onResume() {
    }

    public final void LIZIZ() {
        C0HA4 c0ha4;
        C678130Qip c678130Qip = this.LLILLL;
        if (c678130Qip == null || (c0ha4 = c678130Qip.LJI) == null) {
            return;
        }
        AsS37S0100000_10 asS37S0100000_10 = this.LLILZLL;
        if (asS37S0100000_10 != null) {
            c0ha4.removeOnScrollListener(asS37S0100000_10);
        }
        AsS37S0100000_10 asS37S0100000_102 = new AsS37S0100000_10(this, 15);
        this.LLILZLL = asS37S0100000_102;
        c0ha4.addOnScrollListener(asS37S0100000_102);
    }

    public final void LIZJ() {
        InterfaceC676520QgE interfaceC676520QgE;
        if (C07GF.LIZ()) {
            InterfaceC676520QgE interfaceC676520QgE2 = this.LL;
            if (interfaceC676520QgE2 != null) {
                interfaceC676520QgE2.LJ();
            }
            if (((Number) C1820407Ba.LIZ.getValue()).intValue() != 1 || (interfaceC676520QgE = this.LL) == null) {
                return;
            }
            interfaceC676520QgE.LJI();
        }
    }

    public final void LIZ(C1422405hW c1422405hW) {
        n nVarLIZ;
        long jLongValue;
        Object c098200Yq;
        int iIntValue;
        long j;
        Object c098200Yq2;
        boolean zBooleanValue;
        long jLongValue2;
        long jIntValue;
        boolean zBooleanValue2;
        boolean zBooleanValue3;
        n nVarLIZ2;
        long jLongValue3;
        Long lLIZIZ;
        MixShopSearchBizVM mixShopSearchBizVM;
        NextLiveData<LogPbBean> nextLiveData;
        LogPbBean value;
        String imprId;
        MixShopSearchBizVM mixShopSearchBizVM2;
        NextLiveData<n> nextLiveData2;
        n value2;
        String strLIZJ;
        C677400Qhe c677400Qhe;
        SearchResultParam searchResultParam;
        String enterSearchFrom;
        Long lLIZIZ2;
        n nVar;
        EComSearchBffResp eComSearchBffResp = c1422405hW.LIZ;
        Object obj = null;
        if (eComSearchBffResp != null && (nVar = eComSearchBffResp.globalDoodleConfig) != null) {
            nVarLIZ = C678560QjW.LIZ(nVar, "content_card_auto_play_config");
        } else {
            nVarLIZ = null;
        }
        if (nVarLIZ != null && (lLIZIZ2 = C678560QjW.LIZIZ(nVarLIZ, "auto_play_duration")) != null) {
            jLongValue = lLIZIZ2.longValue();
        } else {
            jLongValue = Mp4ScreenVideoLoadTimeout.CONTROL;
        }
        boolean zLIZ = C138500fv.LIZ();
        if (zLIZ) {
            try {
                c098200Yq = Integer.valueOf(C0C64.LJIILLIIL().LJIJ(31744, 0, "single_auto_play_duration", true));
                C189200o6.m2constructorimpl(c098200Yq);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                c098200Yq = new C098200Yq(th);
                C189200o6.m2constructorimpl(c098200Yq);
            }
            if (C189200o6.m7isFailureimpl(c098200Yq)) {
                c098200Yq = null;
            }
            Integer num = (Integer) c098200Yq;
            if (num == null || (iIntValue = num.intValue()) < 0) {
                iIntValue = 0;
            }
            j = ((long) iIntValue) * 1000;
        } else {
            j = jLongValue;
        }
        if (zLIZ) {
            try {
                c098200Yq2 = Boolean.valueOf(C0C64.LJIILLIIL().LJIIIZ(31744, "enable_replay_after_all_done", true, false));
                C189200o6.m2constructorimpl(c098200Yq2);
            } catch (Throwable th2) {
                TryCatchGuardChecker.doCheck(th2);
                c098200Yq2 = new C098200Yq(th2);
                C189200o6.m2constructorimpl(c098200Yq2);
            }
            if (!C189200o6.m7isFailureimpl(c098200Yq2)) {
                obj = c098200Yq2;
            }
            Boolean bool = (Boolean) obj;
            if (bool != null) {
                zBooleanValue = bool.booleanValue();
            } else {
                zBooleanValue = false;
            }
        } else {
            zBooleanValue = false;
        }
        Map<String, Object> mapLJIIJ = C2097608Jq.LJIIJ(new Pair("auto_play_duration", String.valueOf(jLongValue)));
        if (zLIZ) {
            mapLJIIJ.put("single_auto_play_duration", String.valueOf(j));
            mapLJIIJ.put("enable_replay_after_all_done", String.valueOf(zBooleanValue));
        }
        C678130Qip c678130Qip = this.LLILLL;
        if (c678130Qip != null && (c677400Qhe = c678130Qip.LJIIJ) != null && (searchResultParam = c677400Qhe.LIZIZ) != null) {
            C0QER searchEnterParam = searchResultParam.getSearchEnterParam();
            if (searchEnterParam != null && (enterSearchFrom = searchEnterParam.getEnterSearchFrom()) != null) {
                mapLJIIJ.put("enter_from", enterSearchFrom);
            }
            String keyword = searchResultParam.getKeyword();
            if (keyword != null) {
                mapLJIIJ.put("search_keyword", keyword);
            }
        }
        C678130Qip c678130Qip2 = this.LLILLL;
        if (c678130Qip2 != null && (mixShopSearchBizVM2 = c678130Qip2.LJ) != null && (nextLiveData2 = mixShopSearchBizVM2.LLJI) != null && (value2 = nextLiveData2.getValue()) != null && (strLIZJ = C2399609ak.LIZJ(value2, "search_id")) != null) {
            mapLJIIJ.put("search_id", strLIZJ);
        }
        C678130Qip c678130Qip3 = this.LLILLL;
        if (c678130Qip3 != null && (mixShopSearchBizVM = c678130Qip3.LJ) != null && (nextLiveData = mixShopSearchBizVM.LLJ) != null && (value = nextLiveData.getValue()) != null && (imprId = value.getImprId()) != null) {
            mapLJIIJ.put("impr_id", imprId);
        }
        if (nVarLIZ != null && (lLIZIZ = C678560QjW.LIZIZ(nVarLIZ, "expose_ratio")) != null) {
            jLongValue2 = lLIZIZ.longValue();
        } else {
            jLongValue2 = 50;
        }
        float f = jLongValue2 / 100.0f;
        if (nVarLIZ != null && (nVarLIZ2 = C678560QjW.LIZ(nVarLIZ, "expose_ratio_obj")) != null) {
            Long lLIZIZ3 = C678560QjW.LIZIZ(nVarLIZ, "expose_ratio");
            if (lLIZIZ3 != null) {
                lLIZIZ3.longValue();
            }
            Long lLIZIZ4 = C678560QjW.LIZIZ(nVarLIZ2, "top");
            long jLongValue4 = 0;
            if (lLIZIZ4 != null) {
                jLongValue3 = lLIZIZ4.longValue();
            } else {
                jLongValue3 = 0;
            }
            Long lLIZIZ5 = C678560QjW.LIZIZ(nVarLIZ2, "bottom");
            if (lLIZIZ5 != null) {
                jLongValue4 = lLIZIZ5.longValue();
            }
            this.LLIZLLLIL = new C678500QjQ(jLongValue3, jLongValue4);
        }
        InterfaceC676520QgE interfaceC676520QgE = this.LL;
        if (interfaceC676520QgE != null) {
            Integer num2 = C07KB.LIZ().autoPlayCheckInterval;
            if (num2 != null) {
                jIntValue = num2.intValue();
            } else {
                jIntValue = 1000;
            }
            Boolean bool2 = C07KB.LIZ().enableAntiExposure;
            if (bool2 != null) {
                zBooleanValue2 = bool2.booleanValue();
            } else {
                zBooleanValue2 = false;
            }
            Boolean bool3 = C07KB.LIZ().enablePreemptPlay;
            if (bool3 != null) {
                zBooleanValue3 = bool3.booleanValue();
            } else {
                zBooleanValue3 = false;
            }
            interfaceC676520QgE.LIZ(jLongValue, f, jIntValue, zBooleanValue2, zBooleanValue3, this.LLIZ, j, zBooleanValue, new AwS554S0100000_10(this, 102));
        }
        InterfaceC676520QgE interfaceC676520QgE2 = this.LL;
        if (interfaceC676520QgE2 != null) {
            interfaceC676520QgE2.LIZLLL(mapLJIIJ);
        }
    }
}
