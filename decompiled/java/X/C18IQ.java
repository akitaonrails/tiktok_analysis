package X;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import com.bytedance.android.bcm.api.model.BcmParams;
import com.bytedance.android.btm.api.BtmPageLifecycle;
import com.bytedance.android.btm.api.config.BtmEventConfigModel;
import com.bytedance.android.btm.api.model.PageFinder;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.18IQ, reason: invalid class name */
/* JADX INFO: loaded from: classes33.dex */
public interface C18IQ extends C18HZ {
    boolean addBtmBySourceBtmToken(String str, BcmParams bcmParams);

    C786530UtH addBtmEventParam(C786530UtH c786530UtH);

    C1523880pl4 addBtmEventParam(C1523880pl4 c1523880pl4);

    void checkEventParam(C786530UtH c786530UtH);

    JSONObject createBtmChain(C18EK c18ek);

    String createBtmId(C18EK c18ek);

    String createExternalEvokeBtmToken(String str, String str2, BcmParams bcmParams);

    String createJumpSourceBtmToken(C21244318Bt c21244318Bt, boolean z);

    Map<String, Object> createReportParams(String str, PageFinder pageFinder, Set<? extends EnumC20164613vA> set);

    boolean enableDeepLinkProcess(String str);

    boolean enableRouterMonitor();

    Map<String, Object> generateBtmEventParams(String str, int i, String str2);

    String getBcmChainStandardStringByFinder(String str, PageFinder pageFinder, BcmParams bcmParams);

    C21246818Cs getBtmPageInfo(PageFinder pageFinder);

    C21246818Cs getBtmPageInfoV2(PageFinder pageFinder);

    Object getCurrentResumedPage();

    InterfaceC1549050qPf getHybridContainerLoadSchemaCallback();

    Object getLastCreatePage();

    C18IJ getLaunchApi();

    InterfaceC20337014hs getMonitor();

    void getPageBtmWithSchemaAsync(String str, C18IG c18ig);

    String getPageId(PageFinder pageFinder);

    BtmPageLifecycle getPageLifecycle();

    C18A6 getThreadExecutor();

    void init();

    void onLowMemory();

    void onRegisterHybridContainer(C1206720hVW c1206720hVW);

    void onRegisterPage(C18EW c18ew);

    void onRegisterPage(C18GZ c18gz);

    void onUnregisterPage(C18EW c18ew);

    void preloadWhenInit();

    void processEventModel(C786530UtH c786530UtH);

    void registerAndRunActivityCallbackIfNotInitOnLaunch(List<C18EW> list, boolean z);

    void registerAndRunFirstActivityCallbackAfterInit(Activity activity, Bundle bundle);

    Pair<Boolean, String> registerBtmPage(View view, String str, String str2);

    void registerBtmPageCallback(C18HS c18hs);

    void registerEventChecker(InterfaceC21258218Hc interfaceC21258218Hc);

    void registerPageBtmWithSchemaAsync(String str, Object obj, String str2, String str3);

    boolean removeBcmChainPageId();

    boolean removeSourceBtmTokenInQueue(String str);

    void setInitTag(String str);

    void setStartNode(C21259218Hm c21259218Hm);

    void unregisterBtmPageCallback(C18HS c18hs);

    void updateBtmPage(Object obj, String str);

    void updateHybridPatternSetting(String str);

    void updateLibraConfig(BtmEventConfigModel btmEventConfigModel);

    void updateSDKSetting(String str);

    boolean useV2ApiMall();
}
