package Y;

import X.AbstractC1536860q60;
import X.C098200Yq;
import X.C0R1F;
import X.C1487590ooX;
import X.C1491570oux;
import X.C1509460pNo;
import X.C1509560pNy;
import X.C1509680pOA;
import X.C1509690pOB;
import X.C1516430pZ3;
import X.C1533710q0v;
import X.C189200o6;
import X.C1C7U;
import X.C2104708Mj;
import X.C2188811AlT;
import X.C683880Qs6;
import X.EnumC1533980q1M;
import android.text.TextUtils;
import com.bytedance.forest.model.RequestParams;
import com.bytedance.hybrid.spark.SparkContext;
import com.bytedance.keva.Keva;
import com.bytedance.lynx.hybrid.service.IResourceServiceX;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.Gson;
import com.lynx.tasm.TemplateBundle;
import com.ss.android.ugc.aweme.ml.common.HistorySaveContent;
import com.ss.android.ugc.aweme.ml.common.HistorySaveListItem;
import java.util.List;
import kotlin.jvm.internal.AFwS263S0000000_23;
import org.json.JSONArray;

/* JADX INFO: loaded from: classes24.dex */
public class ARunnableS14S1000000_23 implements Runnable {
    public final int $t;
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
        }
    }

    public String toString() {
        return this.$t + "_" + super.toString();
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    public final void LIZ$0() {
        List<HistorySaveListItem> list;
        C1487590ooX<C1509690pOB> c1487590ooX = C1509560pNy.LJFF;
        Gson gson = C2104708Mj.LIZ;
        c1487590ooX.getClass();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(c1487590ooX.LIZ);
        sbLIZ.append("_history");
        String strLIZIZ = C0R1F.LIZIZ(C2188811AlT.LIZIZ(sbLIZ));
        if (!TextUtils.isEmpty(strLIZIZ)) {
            try {
                HistorySaveContent historySaveContent = (HistorySaveContent) gson.LJII(strLIZIZ, HistorySaveContent.class);
                if (historySaveContent != null && (list = historySaveContent.list) != null) {
                    c1487590ooX.LJ.writeLock().lock();
                    try {
                        for (HistorySaveListItem historySaveListItem : list) {
                            String str = historySaveListItem.key;
                            String str2 = historySaveListItem.value;
                            if (str != null && str2 != null) {
                                if (!c1487590ooX.LIZLLL.contains(str)) {
                                    c1487590ooX.LIZLLL.add(0, str);
                                }
                                if (!c1487590ooX.LIZJ.containsKey(str)) {
                                    c1487590ooX.LIZJ.put(str, (T) gson.LJII(str2, C1509690pOB.class));
                                }
                            }
                        }
                        c1487590ooX.LJ.writeLock().unlock();
                    } catch (Throwable th) {
                        TryCatchGuardChecker.doCheck(th);
                        c1487590ooX.LJ.writeLock().unlock();
                        throw th;
                    }
                }
            } catch (Throwable th2) {
                TryCatchGuardChecker.doCheck(th2);
            }
        }
        try {
            C1509680pOA c1509680pOA = (C1509680pOA) C2104708Mj.LIZ.LJII(C0R1F.LIZIZ("f_session_compose"), C1509680pOA.class);
            if (c1509680pOA == null || this.s0 == null || !TextUtils.equals(C1509460pNo.LJ(c1509680pOA, "date"), this.s0)) {
                return;
            }
            C1509560pNy.LJI.addFeature("sessionRank", Integer.valueOf(C1509460pNo.LIZIZ(c1509680pOA, "sessionRank")), false);
        } catch (Throwable th3) {
            TryCatchGuardChecker.doCheck(th3);
        }
    }

    public final void LIZ$1() {
        String str = this.s0;
        try {
            SparkContext sparkContext = new SparkContext();
            sparkContext.LJJLIIJ(str);
            sparkContext.usePreload = true;
            RequestParams requestParams = new RequestParams(EnumC1533980q1M.LYNX_TEMPLATE);
            requestParams.enableMemoryCache = Boolean.TRUE;
            requestParams.customParams.put("rl_container_uuid", sparkContext.containerId);
            JSONArray jSONArray = C1533710q0v.LIZ;
            String strLIZLLL = C1533710q0v.LIZLLL(null, requestParams, sparkContext.LJIJI());
            IResourceServiceX iResourceServiceXLIZIZ = C1533710q0v.LIZIZ(sparkContext, false);
            C189200o6.m2constructorimpl(iResourceServiceXLIZIZ != null ? iResourceServiceXLIZIZ.preload(strLIZLLL, requestParams, null) : null);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
        }
    }

    public ARunnableS14S1000000_23(int i) {
        this.$t = i;
        this.s0 = "aweme://roma_redirect/?spark_page=pgc_iap_components_container&roma_group_key=spark_page_pgc_iap_components_container&roma_page_key=p&&scene=purchase_panel&business_line=2";
    }

    public static final void run$0(ARunnableS14S1000000_23 aRunnableS14S1000000_23) {
        boolean zLIZ;
        C1C7U.LIZ("FriendsFeedListKeva@e52e.updatePageToken$1");
        try {
            Keva keva = C1516430pZ3.LLILLL;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("page_token_");
            sbLIZ.append(C1516430pZ3.LLILZ);
            String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
            String str = aRunnableS14S1000000_23.s0;
            if (str == null) {
                str = "";
            }
            keva.storeString(strLIZIZ, str);
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("FriendsFeedListKeva@e52e.updatePageToken$1");
    }

    public static final void run$1(ARunnableS14S1000000_23 aRunnableS14S1000000_23) {
        boolean zLIZ;
        C1C7U.LIZ("PopUpNativePrefetchManager@8ad.startPopUpNativePrefetch$1$1$invoke$lambda$7$lambda$6$$inlined$runOnWorkerThread$2");
        try {
            C683880Qs6.LIZ(aRunnableS14S1000000_23.s0, null, new AbstractC1536860q60() { // from class: X.0qP8
                @Override // X.AbstractC1536860q60
                public final void LIZJ(String str) {
                    C2341109Fh c2341109Fh = C2341109Fh.LIZ;
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("onPreDecodeFailed， errormsg = ");
                    sbLIZ.append(str);
                    String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                    c2341109Fh.getClass();
                    C2341109Fh.LJ(strLIZIZ);
                }

                @Override // X.AbstractC1536860q60
                public final void LIZLLL(TemplateBundle templateBundle) {
                    C2341109Fh.LIZ.getClass();
                    C2341109Fh.LJ("onPreDecodeSuccess");
                }
            }, false, AFwS263S0000000_23.get$arr$(39), 26);
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("PopUpNativePrefetchManager@8ad.startPopUpNativePrefetch$1$1$invoke$lambda$7$lambda$6$$inlined$runOnWorkerThread$2");
    }

    public static final void run$2(ARunnableS14S1000000_23 aRunnableS14S1000000_23) {
        boolean zLIZ;
        C1C7U.LIZ("TypeSessionFeatureProducer@30e8.loadSaveContent$1");
        try {
            aRunnableS14S1000000_23.LIZ$0();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("TypeSessionFeatureProducer@30e8.loadSaveContent$1");
    }

    public static final void run$3(ARunnableS14S1000000_23 aRunnableS14S1000000_23) {
        boolean zLIZ;
        C1C7U.LIZ("PgcPaymentLynxUtil@bdef.preloadForest$1");
        try {
            aRunnableS14S1000000_23.LIZ$1();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("PgcPaymentLynxUtil@bdef.preloadForest$1");
    }

    public static final void run$4(ARunnableS14S1000000_23 aRunnableS14S1000000_23) {
        boolean zLIZ;
        C1C7U.LIZ("LynxPageSession@1138.onPageExited$1$1");
        try {
            C1491570oux c1491570oux = C1491570oux.LIZ;
            String str = aRunnableS14S1000000_23.s0;
            c1491570oux.getClass();
            C1491570oux.LJIIZILJ(str);
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("LynxPageSession@1138.onPageExited$1$1");
    }

    public ARunnableS14S1000000_23(String str, int i) {
        this.$t = i;
        this.s0 = str;
    }
}
