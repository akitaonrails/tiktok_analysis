package X;

import android.app.Activity;
import android.os.Bundle;
import android.os.Looper;
import android.view.View;
import com.bytedance.android.bcm.api.model.BcmParams;
import com.bytedance.android.btm.api.BtmPageLifecycle;
import com.bytedance.android.btm.api.config.BtmEventConfigModel;
import com.bytedance.android.btm.api.model.PageFinder;
import com.bytedance.ies.ugc.statisticlogger.btm.EcElement;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.18EV, reason: invalid class name */
/* JADX INFO: loaded from: classes33.dex */
public final class C18EV implements C18IQ {
    public static final C18EV LIZ = new C18EV();
    public static final C20337214hu LIZIZ = new InterfaceC20337014hs() { // from class: X.14hu
        @Override // X.InterfaceC20337014hs
        public final void LIZ(Function0 function0, boolean z) {
        }

        @Override // X.InterfaceC20337014hs
        public final void LIZIZ(int i, String str, Object obj, Throwable th, boolean z, Function1<? super JSONObject, Unit> function1) {
        }
    };
    public static final C21255618Gc LIZJ = new BtmPageLifecycle() { // from class: X.18Gc
        @Override // com.bytedance.android.btm.api.BtmPageLifecycle
        public final void LIZ(Object obj, boolean z) {
        }

        @Override // com.bytedance.android.btm.api.BtmPageLifecycle
        public final void LIZIZ(Object obj, BtmPageLifecycle.State state) {
        }

        @Override // com.bytedance.android.btm.api.BtmPageLifecycle
        public final void LIZJ(Object obj) {
        }

        @Override // com.bytedance.android.btm.api.BtmPageLifecycle
        public final void LIZLLL(Object obj, Boolean bool, C0PSL c0psl) {
        }

        @Override // com.bytedance.android.btm.api.BtmPageLifecycle
        public final boolean LJ(Object obj, boolean z, C0PSL c0psl) {
            return false;
        }

        @Override // com.bytedance.android.btm.api.BtmPageLifecycle
        public final void LJFF(Object obj, Boolean bool, C669610QOh c669610QOh) {
        }

        @Override // com.bytedance.android.btm.api.BtmPageLifecycle
        public final BtmPageLifecycle.State LJI(Object obj) {
            return null;
        }
    };
    public static final C18HT LIZLLL = new C18A6() { // from class: X.18HT
        @Override // X.C18A6
        public final void LIZ(Runnable runnable, boolean z) {
        }

        @Override // X.C18A6
        public final void LIZIZ(Runnable runnable, boolean z) {
        }
    };
    public static final C21258518Hf LJ = new C18IJ() { // from class: X.18Hf
    };
    public static int LJFF;
    public static int LJI;

    @Override // X.C18IQ
    public final boolean addBtmBySourceBtmToken(String str, BcmParams bcmParams) {
        return false;
    }

    @Override // X.C18IQ
    public final void checkEventParam(C786530UtH c786530UtH) {
    }

    @Override // X.C18IQ
    public final String createBtmId(C18EK c18ek) {
        return "";
    }

    @Override // X.C18IQ
    public final String createExternalEvokeBtmToken(String str, String str2, BcmParams bcmParams) {
        return null;
    }

    @Override // X.C18IQ
    public final String createJumpSourceBtmToken(C21244318Bt c21244318Bt, boolean z) {
        return null;
    }

    @Override // X.C18IQ
    public final boolean enableDeepLinkProcess(String str) {
        return false;
    }

    @Override // X.C18IQ
    public final boolean enableRouterMonitor() {
        return false;
    }

    @Override // X.C18IQ
    public final C21246818Cs getBtmPageInfo(PageFinder pageFinder) {
        return null;
    }

    @Override // X.C18IQ
    public final C21246818Cs getBtmPageInfoV2(PageFinder pageFinder) {
        return null;
    }

    @Override // X.C18IQ
    public final Object getCurrentResumedPage() {
        return null;
    }

    @Override // X.C18IQ
    public final Object getLastCreatePage() {
        return null;
    }

    @Override // X.C18IQ
    public final String getPageId(PageFinder pageFinder) {
        return null;
    }

    @Override // X.C18IQ
    public final void init() {
    }

    @Override // X.C18IQ
    public final void onLowMemory() {
    }

    @Override // X.C18IQ
    public final void onRegisterHybridContainer(C1206720hVW c1206720hVW) {
    }

    @Override // X.C18IQ
    public final void onRegisterPage(C18GZ c18gz) {
    }

    @Override // X.C18IQ
    public final void onUnregisterPage(C18EW c18ew) {
    }

    @Override // X.C18IQ
    public final void preloadWhenInit() {
    }

    @Override // X.C18IQ
    public final void processEventModel(C786530UtH c786530UtH) {
    }

    @Override // X.C18IQ
    public final void registerAndRunActivityCallbackIfNotInitOnLaunch(List<C18EW> list, boolean z) {
    }

    @Override // X.C18IQ
    public final void registerAndRunFirstActivityCallbackAfterInit(Activity activity, Bundle bundle) {
    }

    @Override // X.C18IQ
    public final void registerBtmPageCallback(C18HS c18hs) {
    }

    @Override // X.C18IQ
    public final void registerEventChecker(InterfaceC21258218Hc interfaceC21258218Hc) {
    }

    @Override // X.C18IQ
    public final void registerPageBtmWithSchemaAsync(String str, Object obj, String str2, String str3) {
    }

    @Override // X.C18IQ
    public final boolean removeBcmChainPageId() {
        return false;
    }

    @Override // X.C18IQ
    public final boolean removeSourceBtmTokenInQueue(String str) {
        return false;
    }

    @Override // X.C18IQ
    public final void setInitTag(String str) {
    }

    @Override // X.C18IQ
    public final void setStartNode(C21259218Hm c21259218Hm) {
    }

    @Override // X.C18IQ
    public final void unregisterBtmPageCallback(C18HS c18hs) {
    }

    @Override // X.C18IQ
    public final void updateBtmPage(Object obj, String str) {
    }

    @Override // X.C18IQ
    public final void updateHybridPatternSetting(String str) {
    }

    @Override // X.C18IQ
    public final void updateLibraConfig(BtmEventConfigModel btmEventConfigModel) {
    }

    @Override // X.C18IQ
    public final void updateSDKSetting(String str) {
    }

    @Override // X.C18IQ
    public final boolean useV2ApiMall() {
        return false;
    }

    @Override // X.C18IQ
    public final InterfaceC1549050qPf getHybridContainerLoadSchemaCallback() {
        return new InterfaceC1549050qPf() { // from class: X.18H1
            @Override // X.InterfaceC1549050qPf
            public final void LIZ(String str, View view, String str2, String str3, EnumC1549040qPe enumC1549040qPe) {
            }
        };
    }

    @Override // X.C18HZ
    public final int getInitPrerequisites() {
        return LJFF;
    }

    @Override // X.C18HZ
    public final int getInitStatus() {
        return LJI;
    }

    @Override // X.C18IQ
    public final C18IJ getLaunchApi() {
        return LJ;
    }

    @Override // X.C18IQ
    public final InterfaceC20337014hs getMonitor() {
        return LIZIZ;
    }

    @Override // X.C18IQ
    public final BtmPageLifecycle getPageLifecycle() {
        return LIZJ;
    }

    @Override // X.C18IQ
    public final C18A6 getThreadExecutor() {
        return LIZLLL;
    }

    @Override // X.C18IQ
    public final C786530UtH addBtmEventParam(C786530UtH c786530UtH) {
        JSONObject jSONObject = c786530UtH.LIZLLL;
        if (jSONObject != null) {
            jSONObject.remove("btm_id");
        }
        return c786530UtH;
    }

    @Override // X.C18IQ
    public final JSONObject createBtmChain(C18EK c18ek) {
        return new JSONObject();
    }

    @Override // X.C18IQ
    public final void onRegisterPage(C18EW c18ew) {
        ((ArrayList) C21258018Ha.LIZ).add(c18ew);
        if (((EcElement) C18JB.LIZIZ.getValue()).ecPageCodes.contains(c18ew.LIZIZ)) {
            boolean z = false;
            if (C786410Ut5.u3() == Looper.getMainLooper().getThread()) {
                C21258018Ha.LIZ(false);
            } else {
                C707090RoR.LIZIZ(new RunnableC21255718Gd(z));
            }
        }
    }

    @Override // X.C18HZ
    public final void setInitPrerequisites(int i) {
        LJFF = 1;
    }

    @Override // X.C18HZ
    public final void setInitStatus(int i) {
        LJI = i;
    }

    @Override // X.C18IQ
    public final C1523880pl4 addBtmEventParam(C1523880pl4 c1523880pl4) {
        JSONObject jSONObject = c1523880pl4.LIZIZ;
        if (jSONObject != null) {
            jSONObject.remove("btm_id");
        }
        return c1523880pl4;
    }

    @Override // X.C18IQ
    public final void getPageBtmWithSchemaAsync(String str, C18IG c18ig) {
        c18ig.LIZ("");
    }

    @Override // X.C18IQ
    public final Map createReportParams(String str, PageFinder pageFinder, Set set) {
        Iterator<String> it2 = ((EcElement) C18JB.LIZIZ.getValue()).ecEventCodes.iterator();
        while (true) {
            boolean z = true;
            if (!it2.hasNext()) {
                break;
            }
            if (str.contains(it2.next())) {
                if (C786410Ut5.u3() == Looper.getMainLooper().getThread()) {
                    C21258018Ha.LIZ(true);
                } else {
                    C707090RoR.LIZIZ(new RunnableC21255718Gd(z));
                }
            }
        }
        Pair[] pairArr = new Pair[2];
        pairArr[0] = new Pair("btm", str);
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("sdk_init_prerequisites", C18G7.LIZ());
            jSONObject.put("sdk_init_result", C18G7.LIZIZ());
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
        pairArr[1] = new Pair("btm_debug_params", jSONObject);
        return C2097608Jq.LJIIJ(pairArr);
    }

    @Override // X.C18IQ
    public final Map<String, Object> generateBtmEventParams(String str, int i, String str2) {
        return new LinkedHashMap();
    }

    @Override // X.C18IQ
    public final String getBcmChainStandardStringByFinder(String str, PageFinder pageFinder, BcmParams bcmParams) {
        return C786410Ut5.J3(new C18C6().LIZ());
    }

    @Override // X.C18IQ
    public final Pair<Boolean, String> registerBtmPage(View view, String str, String str2) {
        return new Pair<>(Boolean.FALSE, "emptyImpl");
    }
}
