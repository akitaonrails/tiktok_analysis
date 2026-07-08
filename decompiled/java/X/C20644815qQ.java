package X;

import Y.ARunnableS100S0200000_31;
import Y.ARunnableS35S1100000_31;
import android.content.Context;
import com.bytedance.hybrid.spark.SparkContext;
import com.lynx.tasm.LynxError;
import com.lynx.tasm.LynxViewClient;
import com.lynx.tasm.TemplateData;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.spi.HomePageCommonService;
import com.ss.android.ugc.feed.platform.popup.dynamic.DynamicPopupInfo;
import com.ss.android.ugc.feed.platform.popup.exp.FeedDynamicBugfixConfig;
import java.util.List;
import java.util.Map;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.Pair;
import org.json.JSONException;

/* JADX INFO: renamed from: X.15qQ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public final class C20644815qQ {
    public static final C1303560k1i LJIIIIZZ = new C1303560k1i(10, "current_lru_cache");
    public final DynamicPopupInfo LIZ;
    public final C20645815qa LIZIZ;
    public volatile SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB LIZJ;
    public C20645115qT LJI;
    public volatile EnumC20574215f2 LIZLLL = EnumC20574215f2.LLILLL;
    public final C20748416Ha LJ = new C20748416Ha(this, 2);
    public long LJFF = -1;
    public final ReentrantLock LJII = new ReentrantLock();

    public final void LIZJ(String str) {
        C05QD.LIZ(new ARunnableS35S1100000_31(this, str, 6));
    }

    public final void LIZLLL(InterfaceC20646115qd interfaceC20646115qd) {
        if (this.LJFF < 0) {
            this.LJFF = System.currentTimeMillis();
            C23250099c.LIZLLL(C05QD.LIZ, null, null, new C20644915qR(this, interfaceC20646115qd, null), 3);
        } else {
            LIZ(this, interfaceC20646115qd, "already_load", false, 24);
        }
    }

    public C20644815qQ(DynamicPopupInfo dynamicPopupInfo, C20645815qa c20645815qa) {
        this.LIZ = dynamicPopupInfo;
        this.LIZIZ = c20645815qa;
    }

    public final SparkContext LIZIZ(Context context, final DynamicPopupInfo dynamicPopupInfo, final InterfaceC20646115qd interfaceC20646115qd) throws JSONException {
        boolean z;
        String str = dynamicPopupInfo.geckoSchema;
        if (str != null && str.length() != 0) {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            C20589415hU.LIZIZ("geckoSchema is empty");
            return null;
        }
        HomePageCommonService homePageCommonService = (HomePageCommonService) PluggableExtentionKt.pluggableSpi$default(HomePageCommonService.class, false, false, false, 14, null);
        if (homePageCommonService == null) {
            return null;
        }
        SparkContext sparkContext = new SparkContext();
        sparkContext.LJJLIIJ(dynamicPopupInfo.geckoSchema);
        int iLIZJ = C497820Jfg.LIZJ(context);
        int iLJFF = homePageCommonService.LJFF();
        int iLJFF2 = C418440Gaw.LJFF((homePageCommonService.LIZ() + iLIZJ) - C14LC.LJIILL, context);
        Pair[] pairArr = new Pair[7];
        String str2 = dynamicPopupInfo.popupKey;
        String str3 = "";
        if (str2 == null) {
            str2 = "";
        }
        pairArr[0] = new Pair("popup_key", str2);
        String str4 = dynamicPopupInfo.triggerId;
        if (str4 == null) {
            str4 = "";
        }
        pairArr[1] = new Pair("trigger_id", str4);
        String str5 = dynamicPopupInfo.triggerTiming;
        if (str5 != null) {
            str3 = str5;
        }
        pairArr[2] = new Pair("trigger_timing", str3);
        pairArr[3] = new Pair("top_bar_height", Integer.valueOf(iLJFF2));
        pairArr[4] = new Pair("bottom_bar_height", Integer.valueOf(iLJFF));
        pairArr[5] = new Pair("lynx_init_time", Long.valueOf(System.currentTimeMillis()));
        pairArr[6] = new Pair("enable_height_adaptation", Boolean.valueOf(((FeedDynamicBugfixConfig) C20589115hR.LIZIZ.getValue()).enableImmersiveMode));
        sparkContext.LJJLIIIJILLIZJL(C2097608Jq.LJIIIIZZ(pairArr));
        sparkContext.LJJJJZ(new AbstractC1539010q9T() { // from class: X.15qW
            @Override // X.AbstractC1539010q9T, X.InterfaceC1057870ddR
            public final void LJJJLL(InterfaceC1531560pxS interfaceC1531560pxS) {
                C1537910q7h c1537910q7h;
                if ((interfaceC1531560pxS instanceof C1537910q7h) && (c1537910q7h = (C1537910q7h) interfaceC1531560pxS) != null) {
                    Pair[] pairArr2 = new Pair[2];
                    String str6 = dynamicPopupInfo.bizData;
                    if (str6 == null) {
                        str6 = "";
                    }
                    pairArr2[0] = new Pair("biz_data", str6);
                    Map<String, String> mapLJ = dynamicPopupInfo.traceInfo;
                    if (mapLJ == null) {
                        mapLJ = C2097608Jq.LJ();
                    }
                    pairArr2[1] = new Pair("trace_info", mapLJ);
                    c1537910q7h.LJIJJ = TemplateData.LJII(C2097608Jq.LJIIIIZZ(pairArr2));
                    final C20644815qQ c20644815qQ = this;
                    final InterfaceC20646115qd interfaceC20646115qd2 = interfaceC20646115qd;
                    c1537910q7h.LJIIIIZZ(new LynxViewClient() { // from class: X.15qX
                        @Override // com.lynx.tasm.LynxViewClient
                        public final void LJIIJ() {
                            StringBuilder sbLIZ = C2188811AlT.LIZ();
                            sbLIZ.append("onFirstScreen, info=");
                            sbLIZ.append(c20644815qQ.LIZ.LIZ());
                            C20589415hU.LIZIZ(C2188811AlT.LIZIZ(sbLIZ));
                            if (c20644815qQ.LIZLLL == EnumC20574215f2.LLILLJJLI) {
                                C20589415hU.LIZIZ("onFirstScreen, load failed");
                                return;
                            }
                            C20644815qQ c20644815qQ2 = c20644815qQ;
                            InterfaceC20646115qd interfaceC20646115qd3 = interfaceC20646115qd2;
                            c20644815qQ2.getClass();
                            C05QD.LIZ(new ARunnableS100S0200000_31(c20644815qQ2, interfaceC20646115qd3, 64));
                        }

                        @Override // com.lynx.tasm.LynxViewClient, X.AbstractC1298860ju8
                        public final void LJFF(LynxError lynxError) {
                            StringBuilder sbLIZ = C2188811AlT.LIZ();
                            sbLIZ.append("onReceivedError: ");
                            sbLIZ.append(lynxError);
                            C20589415hU.LIZIZ(C2188811AlT.LIZIZ(sbLIZ));
                            C20644815qQ.LIZ(c20644815qQ, interfaceC20646115qd2, "spark_receive_error", true, 24);
                        }
                    });
                }
            }
        });
        sparkContext.LJJ(C1543000qFu.class, new C1543000qFu() { // from class: X.15qb
            @Override // X.C1543000qFu
            public final List<Class<? extends InterfaceC1063710dmr>> LJI() {
                return C1697810uHb.LJIIJJI(C0TXJ.class, C0TXM.class);
            }
        });
        C1548820qPI.LJ("on_pop_appear_receive", this.LJ, System.currentTimeMillis(), sparkContext.containerId);
        return sparkContext;
    }

    public static void LIZ(C20644815qQ c20644815qQ, InterfaceC20646115qd interfaceC20646115qd, String str, boolean z, int i) {
        boolean z2;
        if ((i & 8) != 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        c20644815qQ.getClass();
        C05QD.LIZ(new RunnableC20645215qU(c20644815qQ, str, z2, null, z, interfaceC20646115qd));
    }
}
