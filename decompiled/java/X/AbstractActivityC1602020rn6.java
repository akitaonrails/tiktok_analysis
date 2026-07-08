package X;

import android.content.Context;
import android.content.Intent;
import android.content.res.AssetManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.MotionEvent;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.pumbaa.utility.method_id.MethodIDManager;
import com.bytedance.scene.navigation.NavigationScene;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.SAFFragmentRootScene;
import com.ss.android.ugc.aweme.base.IContentSecurityAbility;
import com.ss.android.ugc.aweme.main.MainRootFragment;
import com.ss.android.ugc.aweme.nxet.ITracingService;
import com.ss.android.ugc.aweme.search.common.utils.SAFHelper;
import com.ss.android.ugc.aweme.spi.IHomeTabSavedStateService;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS213S0000000_24;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;

/* JADX INFO: renamed from: X.0rn6, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public abstract class AbstractActivityC1602020rn6 extends C199Y implements InterfaceC1603190roz, InterfaceC1017450caF, InterfaceC530790Krl, InterfaceC655270Pn3, InterfaceC1602140rnI, InterfaceC1711206n0, C08B7, InterfaceC1602130rnH {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] $$delegatedProperties;
    public static final int $stable;
    public final C01GW activityOnKeyDownListeners$delegate;
    public C0QTN asyncInflater;
    public final float autoRecycleInvisibleScenesThreshold;
    public volatile List backend_getMainSAFConfigurationsLjava_util_List;
    public final int configChangesAllowList;
    public IContentSecurityAbility contentSecurityAbility;
    public final boolean enableMergeSearch;
    public final boolean enableNavigation;
    public final boolean enableNavigationSceneReuseActivityView;
    public final boolean enableUseNavigationSceneWindowFocusChangedDispatch;
    public final C01GW events$delegate;
    public final boolean isEnableFragmentManagerRefactor;
    public final InterfaceC1591910rWn mainActivityProxy;
    public boolean mainDarkChanged;
    public final C01GW mainLegacyTrackers$delegate;
    public AbstractC1563340qmi mainLifecycleRegistryWrapper;
    public final C21167617sY mainSAFConfigurations$delegate;
    public boolean prevIsInDark;
    public final InterfaceC1602040rn8 resourceOptComponent;
    public Class<? extends InterfaceC214902198i> rootFragmentClz;
    public Function0<? extends InterfaceC214902198i> rootFragmentFactory;
    public final boolean dispatchOnNewIntentByScene = true;
    public final boolean customDispatch = true;
    public final boolean enableSAF = true;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(AbstractActivityC1602020rn6.class, "mainSAFConfigurations", "getMainSAFConfigurations()Ljava/util/List;", 0);
        C13LE.LIZ.getClass();
        $$delegatedProperties = new InterfaceC2217461Bqa[]{c2217381BqS};
        $stable = 8;
    }

    public static /* synthetic */ void getResourceOptComponent$annotations() {
    }

    @Override // X.InterfaceC1603190roz
    public boolean isDuoDualMode() {
        return false;
    }

    @Override // X.C199Y, X.InterfaceC214897198d
    public boolean migrateDarkModeImplToFragment() {
        return true;
    }

    @Override // X.C199Y, X.InterfaceC214897198d
    public boolean migrateImmersiveBarImplToFragment() {
        return true;
    }

    @Override // X.C199Y, com.bytedance.ies.foundation.activity.BaseActivity, X.ActivityC21503719Dn, X.C19EG, androidx.activity.ComponentActivity, X.C19FO, android.app.Activity
    public void onCreate(Bundle bundle) {
        com_ss_android_ugc_aweme_main_MainActivityBase_com_bytedance_ies_ugc_statisticlogger_nxet_NxETAccessLancet_mainOnCreate(this, bundle);
    }

    private final ArrayList<InterfaceC1399350mWD> getActivityOnKeyDownListeners() {
        return (ArrayList) this.activityOnKeyDownListeners$delegate.getValue();
    }

    @Override // X.C199Y
    public AbstractC1563340qmi createSafLifecycleRegistry() {
        AbstractC1563340qmi abstractC1563340qmi = this.mainLifecycleRegistryWrapper;
        if (abstractC1563340qmi != null) {
            return abstractC1563340qmi;
        }
        AbstractC1563340qmi abstractC1563340qmiLIZIZ = C1591880rWk.LIZIZ.LIZIZ(this);
        this.mainLifecycleRegistryWrapper = abstractC1563340qmiLIZIZ;
        return abstractC1563340qmiLIZIZ;
    }

    @Override // android.view.ContextThemeWrapper, android.content.ContextWrapper, android.content.Context
    public AssetManager getAssets() {
        AssetManager assetManagerLJIIJ = this.resourceOptComponent.LJIIJ();
        return assetManagerLJIIJ == null ? super.getAssets() : assetManagerLJIIJ;
    }

    @Override // X.InterfaceC1603190roz
    public Fragment getCurFragment() {
        MainRootFragment mainRootFragmentMrfOrCrash = mrfOrCrash("getCurFragment");
        if (mainRootFragmentMrfOrCrash != null) {
            return mainRootFragmentMrfOrCrash.getCurFragment();
        }
        return null;
    }

    @Override // X.InterfaceC1603190roz
    public String getEnterFrom() {
        String enterFrom;
        MainRootFragment mainRootFragmentMrfOrCrash = mrfOrCrash("getEnterFrom");
        return (mainRootFragmentMrfOrCrash == null || (enterFrom = mainRootFragmentMrfOrCrash.getEnterFrom()) == null) ? "" : enterFrom;
    }

    public final C1602030rn7 getEvents() {
        return (C1602030rn7) this.events$delegate.getValue();
    }

    @Override // X.InterfaceC530790Krl
    public C0QTN getInflater() {
        C0QTN c0qtn = this.asyncInflater;
        if (c0qtn != null) {
            return c0qtn;
        }
        C0QTN asyncInflater = C2277881EDy.LIZIZ.getAsyncInflater(this, Integer.MAX_VALUE);
        this.asyncInflater = asyncInflater;
        return asyncInflater;
    }

    @Override // X.InterfaceC1603190roz
    public InterfaceC1570710qyb getMainHelper() {
        MainRootFragment mainRootFragmentMrfOrCrash = mrfOrCrash("getCurFragment");
        if (mainRootFragmentMrfOrCrash != null) {
            return mainRootFragmentMrfOrCrash.getMainHelper();
        }
        return null;
    }

    public final List<InterfaceC1602060rnA> getMainSAFConfigurations() {
        List<InterfaceC1602060rnA> list = this.backend_getMainSAFConfigurationsLjava_util_List;
        if (list == null) {
            synchronized (this) {
                list = this.backend_getMainSAFConfigurationsLjava_util_List;
                if (list == null) {
                    List<InterfaceC1602060rnA> listLJJLL = C13LQ.LJJLL(new Object[]{new InterfaceC1602060rnA() { // from class: X.0rn9
                        public final Class<? extends InterfaceC214902198i> LIZ = MainRootFragment.class;
                        public final String LIZIZ = "saf_home_target";

                        @Override // X.InterfaceC1602060rnA
                        public final AFwS213S0000000_24 LIZIZ() {
                            return AFwS213S0000000_24.get$arr$(229);
                        }

                        @Override // X.InterfaceC1602060rnA
                        public final Class<? extends InterfaceC214902198i> LIZ() {
                            return this.LIZ;
                        }

                        @Override // X.InterfaceC1602060rnA
                        public final String getKey() {
                            return this.LIZIZ;
                        }
                    }});
                    this.backend_getMainSAFConfigurationsLjava_util_List = listLJJLL;
                    return listLJJLL;
                }
            }
        }
        return list;
    }

    @Override // X.C19GS, android.view.ContextThemeWrapper, android.content.ContextWrapper, android.content.Context
    public Resources getResources() {
        Resources resources = this.resourceOptComponent.getResources();
        return resources == null ? super.getResources() : resources;
    }

    @Override // android.view.ContextThemeWrapper, android.content.ContextWrapper, android.content.Context
    public Resources.Theme getTheme() {
        Resources.Theme theme = this.resourceOptComponent.getTheme();
        return theme == null ? super.getTheme() : theme;
    }

    @Override // X.InterfaceC1017450caF
    public boolean isADShowing() {
        MainRootFragment mainRootFragmentMrfOrCrash = mrfOrCrash("isADShowing");
        if (mainRootFragmentMrfOrCrash != null) {
            return mainRootFragmentMrfOrCrash.isADShowing();
        }
        return false;
    }

    @Override // X.InterfaceC1602140rnI
    public boolean isPaused() {
        MainRootFragment mainRootFragmentMrfOrCrash = mrfOrCrash("isPaused");
        return mainRootFragmentMrfOrCrash == null || mainRootFragmentMrfOrCrash.isPaused();
    }

    public final C1602170rnL legacyTrackers() {
        return (C1602170rnL) this.mainLegacyTrackers$delegate.getValue();
    }

    @Override // X.InterfaceC1017450caF
    public boolean mainPageOnFeed() {
        MainRootFragment mainRootFragmentMrfOrCrash = mrfOrCrash("mainPageOnFeed");
        if (mainRootFragmentMrfOrCrash != null) {
            return mainRootFragmentMrfOrCrash.mainPageOnFeed();
        }
        return false;
    }

    @Override // X.C199Y
    public boolean onlyOnePageWhenNavigationOpen() {
        return ((Number) C07FT.LIZ.getValue()).intValue() == C07FT.LIZIZ;
    }

    @Override // X.C199Y, X.C19GS, android.app.Activity
    public void recreate() {
        C2344809Gs.LJ("saf: MainActivity reCreate start");
        this.mainDarkChanged = false;
        super.recreate();
        List<InterfaceC1593530rZP> listLIZ = C1583610rJP.LIZ(this);
        if (listLIZ != null) {
            Iterator<InterfaceC1593530rZP> it2 = listLIZ.iterator();
            while (it2.hasNext()) {
                it2.next().onRecreate();
            }
        }
        C2344809Gs.LJ("saf: MainActivity reCreate end");
    }

    @Override // X.InterfaceC1017450caF
    public void splashOverShowMandatoryLoginPage() {
        MainRootFragment mainRootFragmentMrfOrCrash = mrfOrCrash("splashOverShowMandatoryLoginPage");
        if (mainRootFragmentMrfOrCrash != null) {
            mainRootFragmentMrfOrCrash.splashOverShowMandatoryLoginPage();
        }
    }

    public AbstractActivityC1602020rn6() {
        SAFHelper.LIZ.getClass();
        this.enableMergeSearch = SAFHelper.LJIIJ();
        this.rootFragmentClz = MainRootFragment.class;
        this.rootFragmentFactory = super.getRootFragmentFactory();
        this.mainActivityProxy = C1591880rWk.LIZIZ.LJIILJJIL();
        this.mainLegacyTrackers$delegate = C452501pT.LIZIZ(new C1594130raN(this));
        this.mainSAFConfigurations$delegate = C21167617sY.LIZ;
        this.isEnableFragmentManagerRefactor = C1590680rUo.LIZ();
        this.autoRecycleInvisibleScenesThreshold = C1617800sCY.LIZ();
        this.enableNavigation = true;
        this.enableNavigationSceneReuseActivityView = ((Number) C07FZ.LIZ.getValue()).intValue() == C07FZ.LIZIZ;
        this.configChangesAllowList = 4080;
        this.enableUseNavigationSceneWindowFocusChangedDispatch = true;
        this.events$delegate = C452501pT.LIZIZ(new C1602080rnC(this));
        this.resourceOptComponent = C1602070rnB.LIZIZ.LIZ(this);
        this.activityOnKeyDownListeners$delegate = C452501pT.LIZIZ(new C1594230raX());
    }

    @Override // X.C199Y, com.bytedance.ies.foundation.activity.BaseActivity, X.ActivityC21503719Dn, android.app.Activity
    public void finish() {
        NavigationScene navigationScene;
        int i;
        AbstractC1387200mCc abstractC1387200mCc = (AbstractC1387200mCc) C13LQ.LJJJJIZL(C1906580ziK.LJII());
        if (C294740Bgu.LIZ() && (abstractC1387200mCc instanceof C198S)) {
            abstractC1387200mCc.LIZ();
            return;
        }
        C01GW c01gw = AnonymousClass0768.LIZ;
        if ((((Number) c01gw.getValue()).intValue() > 0) && (abstractC1387200mCc instanceof C1844400y62) && (navigationScene = getNavigationScene()) != null && ((ArrayList) navigationScene.getSceneList()).size() > 1) {
            if (((Number) C07DB.LIZIZ.getValue()).floatValue() > 0.0f && ((Random) C07DB.LIZ.getValue()).nextDouble() <= ((Number) r5.getValue()).floatValue()) {
                C1AF0.LJ(new IllegalStateException("try finish main activity with multiple pages"));
            }
            if (((Number) c01gw.getValue()).intValue() < 3) {
                i = (((Number) c01gw.getValue()).intValue() >= 2 && (((C1844400y62) abstractC1387200mCc).LIZLLL instanceof InterfaceC1058480deQ)) ? 131 : 130;
            }
            getEvents().LIZIZ(i, null, null);
            abstractC1387200mCc.LIZ();
            return;
        }
        getEvents().LIZIZ(120, null, null);
        super.finish();
        List<InterfaceC1593530rZP> listLIZ = C1583610rJP.LIZ(this);
        if (listLIZ != null) {
            Iterator<InterfaceC1593530rZP> it2 = listLIZ.iterator();
            while (it2.hasNext()) {
                it2.next().onActivityFinish();
            }
        }
    }

    @Override // X.C199Y, X.InterfaceC214897198d
    public void finishLastPage() {
        if (C19270610aG.LIZIZ(this)) {
            return;
        }
        super.finishLastPage();
    }

    @InterfaceC1294060jmO
    public final MainRootFragment getMainSAFFragment() {
        return (MainRootFragment) C20629915o1.LIZ(this);
    }

    public final MainRootFragment getMainSAFFragmentOrNull() {
        InterfaceC214902198i interfaceC214902198iLIZ = C20629915o1.LIZ(this);
        if (interfaceC214902198iLIZ instanceof MainRootFragment) {
            return (MainRootFragment) interfaceC214902198iLIZ;
        }
        return null;
    }

    public final FragmentManager getMainSceneFragmentManager() {
        return getMainSAFFragment().getChildFragmentManager();
    }

    @Override // X.C199Y, X.C19EG
    public FragmentManager getSupportFragmentManager() {
        if (isDestroyed()) {
            C2344009Gk c2344009Gk = new C2344009Gk();
            c2344009Gk.LJ(Boolean.TRUE, "isSupportFragmentManagerCalledWhenDestroyed");
            C20684815ws.LJIILLIIL("stability_event", c2344009Gk.LIZ);
        }
        return isDelegateFragmentManager() ? super.getSupportFragmentManager() : getOriginSupportFragmentManager();
    }

    @Override // X.C199Y, com.bytedance.ies.foundation.activity.BaseActivity, X.C19GS, X.C19EG, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        getEvents().LIZIZ(103, null, null);
    }

    @Override // X.InterfaceC1603190roz
    public void onKeyBack() {
        getMainSAFFragment().onKeyBack();
    }

    @Override // X.C199Y, com.bytedance.ies.foundation.activity.BaseActivity, X.C19EG, X.C19FO, android.app.Activity
    public void onResume() {
        boolean zLJI = MethodIDManager.LJI(71646);
        if (legacyTrackers() != null) {
            C1602170rnL.LJFF();
        }
        super.onResume();
        if (zLJI) {
            MethodIDManager.LJ();
        }
    }

    @Override // android.app.Activity
    public boolean releaseInstance() {
        boolean zReleaseInstance = super.releaseInstance();
        List<InterfaceC1593530rZP> listLIZ = C1583610rJP.LIZ(this);
        if (listLIZ != null) {
            Iterator<InterfaceC1593530rZP> it2 = listLIZ.iterator();
            while (it2.hasNext()) {
                it2.next().onReleaseInstance(zReleaseInstance);
            }
        }
        return zReleaseInstance;
    }

    @Override // X.C199Y
    public float getAutoRecycleInvisibleScenesThreshold() {
        return this.autoRecycleInvisibleScenesThreshold;
    }

    @Override // X.C199Y
    public int getConfigChangesAllowList() {
        return this.configChangesAllowList;
    }

    @Override // X.C199Y
    public boolean getCustomDispatch() {
        return this.customDispatch;
    }

    @Override // X.C199Y
    public boolean getDispatchOnNewIntentByScene() {
        return this.dispatchOnNewIntentByScene;
    }

    @Override // X.C199Y
    public boolean getEnableNavigation() {
        return this.enableNavigation;
    }

    @Override // X.C199Y
    public boolean getEnableNavigationSceneReuseActivityView() {
        return this.enableNavigationSceneReuseActivityView;
    }

    @Override // X.C199Y, X.InterfaceC214897198d
    public boolean getEnableSAF() {
        return this.enableSAF;
    }

    @Override // X.C199Y
    public boolean getEnableUseNavigationSceneWindowFocusChangedDispatch() {
        return this.enableUseNavigationSceneWindowFocusChangedDispatch;
    }

    public final boolean getMainDarkChanged$main_release() {
        return this.mainDarkChanged;
    }

    public final boolean getPrevIsInDark$main_release() {
        return this.prevIsInDark;
    }

    public final InterfaceC1602040rn8 getResourceOptComponent() {
        return this.resourceOptComponent;
    }

    @Override // X.C199Y
    public Class<? extends InterfaceC214902198i> getRootFragmentClz() {
        return this.rootFragmentClz;
    }

    @Override // X.C199Y
    public Function0<InterfaceC214902198i> getRootFragmentFactory() {
        return this.rootFragmentFactory;
    }

    @Override // X.C199Y, X.InterfaceC214897198d
    public boolean isDelegateFragmentManager() {
        return this.isEnableFragmentManagerRefactor;
    }

    public static Bundle INVOKEVIRTUAL_com_ss_android_ugc_aweme_main_MainActivityBase_com_ss_android_ugc_aweme_lancet_IntentLancet_getExtras(Intent intent) {
        try {
            return intent.getExtras();
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return null;
        }
    }

    private final void createMainContainerView(Bundle bundle) {
        navigationSceneReuseActivityView(this.mainActivityProxy.LIZ(this));
        dispatchSceneCreateView();
        dispatchSceneActivityCreated();
    }

    private final void safMainCrash(String str) {
        C1AF0.LIZJ("[SAF-Merge] " + str);
    }

    @Override // X.InterfaceC1017450caF
    public void allowSwipeLeft(boolean z) {
        MainRootFragment mainRootFragmentMrfOrCrash = mrfOrCrash("allowSwipeLeft");
        if (mainRootFragmentMrfOrCrash != null) {
            mainRootFragmentMrfOrCrash.allowSwipeLeft(z);
        }
    }

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.C19GS, X.C19FO, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public void attachBaseContext(Context context) {
        if (legacyTrackers() != null) {
            C1602170rnL.LIZIZ();
        }
        super.attachBaseContext(context);
        ((AbstractC1563340qmi) getLifecycle()).LIZLLL(EnumC682280QpW.MAIN.getValue() | EnumC682280QpW.GET_CURRENT_STATE.getValue() | EnumC682280QpW.ADD_OBSERVER.getValue() | EnumC682280QpW.LIVEDATA_OBSERVE.getValue() | EnumC682280QpW.VIEWMODEL_STORE.getValue());
        if (legacyTrackers() != null) {
            C0X35.LJIIJJI("main_act_attach", true);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:47:0x00fc  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void com_ss_android_ugc_aweme_main_MainActivityBase__onCreate$___twin___(android.os.Bundle r12) throws org.json.JSONException {
        /*
            Method dump skipped, instruction units count: 376
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractActivityC1602020rn6.com_ss_android_ugc_aweme_main_MainActivityBase__onCreate$___twin___(android.os.Bundle):void");
    }

    @Override // X.C199Y, android.app.Activity, android.view.Window.Callback
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (legacyTrackers() != null) {
            IContentSecurityAbility iContentSecurityAbility = this.contentSecurityAbility;
            if (iContentSecurityAbility != null) {
                iContentSecurityAbility.dispatchTouchEvent(motionEvent);
            }
            C715170S3n.LIZ(motionEvent);
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override // android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper, android.content.Context
    public Object getSystemService(String str) {
        Object objLJJ = this.resourceOptComponent.LJJ(str);
        if (objLJJ == null) {
            return super.getSystemService(str);
        }
        return objLJJ;
    }

    public final void legacyBeforeDispatchTouch(MotionEvent motionEvent) {
        IContentSecurityAbility iContentSecurityAbility = this.contentSecurityAbility;
        if (iContentSecurityAbility != null) {
            iContentSecurityAbility.dispatchTouchEvent(motionEvent);
        }
        C715170S3n.LIZ(motionEvent);
    }

    public final MainRootFragment mrfOrCrash(String str) {
        InterfaceC214902198i interfaceC214902198iLIZ = C20629915o1.LIZ(this);
        if (interfaceC214902198iLIZ instanceof MainRootFragment) {
            return (MainRootFragment) interfaceC214902198iLIZ;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("no main root found: ");
        sbLIZ.append(str);
        safMainCrash(C2188811AlT.LIZIZ(sbLIZ));
        return null;
    }

    public final void navigateAccordingConfiguration(String str) {
        String stringExtra;
        for (InterfaceC1602060rnA interfaceC1602060rnA : getMainSAFConfigurations()) {
            if (Intrinsics.LJFF(interfaceC1602060rnA.getKey(), str)) {
                Bundle bundleINVOKEVIRTUAL_com_ss_android_ugc_aweme_main_MainActivityBase_com_ss_android_ugc_aweme_lancet_IntentLancet_getExtras = INVOKEVIRTUAL_com_ss_android_ugc_aweme_main_MainActivityBase_com_ss_android_ugc_aweme_lancet_IntentLancet_getExtras(getIntent());
                if (bundleINVOKEVIRTUAL_com_ss_android_ugc_aweme_main_MainActivityBase_com_ss_android_ugc_aweme_lancet_IntentLancet_getExtras == null) {
                    bundleINVOKEVIRTUAL_com_ss_android_ugc_aweme_main_MainActivityBase_com_ss_android_ugc_aweme_lancet_IntentLancet_getExtras = new Bundle();
                }
                C1602030rn7 events = getEvents();
                Intent intent = getIntent();
                if (intent != null) {
                    events.getClass();
                    try {
                        stringExtra = intent.getStringExtra("extra_param_from_deeplink_return");
                    } catch (Exception e) {
                        TryCatchGuardChecker.doCheck(e);
                        stringExtra = null;
                    }
                } else {
                    stringExtra = null;
                }
                events.LIZIZ(42, events.LIZIZ, stringExtra);
                AFwS213S0000000_24 aFwS213S0000000_24LIZIZ = interfaceC1602060rnA.LIZIZ();
                NavigationScene navigationScene = getNavigationScene();
                if (navigationScene != null) {
                    AnonymousClass1999.LIZJ(navigationScene, null, interfaceC1602060rnA.LIZ(), aFwS213S0000000_24LIZIZ, -1, bundleINVOKEVIRTUAL_com_ss_android_ugc_aweme_main_MainActivityBase_com_ss_android_ugc_aweme_lancet_IntentLancet_getExtras, null, null, null, null, 480);
                    return;
                }
                return;
            }
        }
    }

    @Override // X.C199Y, com.bytedance.ies.foundation.activity.BaseActivity, X.C19GS, androidx.activity.ComponentActivity, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        if (((Number) AnonymousClass0767.LIZ.getValue()).intValue() >= 2 && C20629915o1.LIZ(this) != null && C960203pA.LIZIZ(this) != this.prevIsInDark) {
            this.mainDarkChanged = true;
        }
    }

    @Override // X.C199Y, X.ActivityC21503719Dn, androidx.activity.ComponentActivity, android.app.Activity
    public void onNewIntent(Intent intent) {
        C1602170rnL c1602170rnLLegacyTrackers = legacyTrackers();
        if (c1602170rnLLegacyTrackers != null) {
            c1602170rnLLegacyTrackers.LJI();
        }
        super.onNewIntent(intent);
    }

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.ActivityC21503719Dn, android.app.Activity
    public void onRestoreInstanceState(Bundle bundle) {
        super.onRestoreInstanceState(bundle);
        getEvents().LIZIZ(102, null, null);
    }

    @Override // X.C199Y, com.bytedance.ies.foundation.activity.BaseActivity, androidx.activity.ComponentActivity, X.C19FO, android.app.Activity
    public void onSaveInstanceState(Bundle bundle) {
        NavigationScene navigationScene;
        C2344809Gs.LJ("saf: MainActivity onSaveInstanceState start");
        if (((Number) AnonymousClass0767.LIZ.getValue()).intValue() >= 1 && (navigationScene = getNavigationScene()) != null) {
            navigationScene.LLLJL();
        }
        super.onSaveInstanceState(bundle);
        getEvents().LIZIZ(101, null, null);
        bundle.putBoolean("saf:onSaveInstanceState_merge_search_TAG", this.enableMergeSearch);
        IHomeTabSavedStateService.LIZ.getClass();
        IHomeTabSavedStateService iHomeTabSavedStateServiceLIZ = C1586430rNx.LIZ();
        if (iHomeTabSavedStateServiceLIZ != null) {
            iHomeTabSavedStateServiceLIZ.LIZJ(this, bundle);
        }
        Bundle bundle2 = bundle.getBundle("androidx.lifecycle.BundlableSavedStateRegistry.key");
        if (bundle2 != null) {
            C786410Ut5.LJJIJL(bundle2, "android:support:fragments", new Bundle());
        }
        if (C2537409wy.LIZ) {
            int iIdentityHashCode = System.identityHashCode(this);
            setIntent(getIntent().putExtra("tt_saf_act_id", iIdentityHashCode));
            C741190T5p.LIZ.put(Integer.valueOf(iIdentityHashCode), bundle);
        }
    }

    @Override // X.InterfaceC655270Pn3
    public void registerActivityOnKeyDownListener(InterfaceC1399350mWD interfaceC1399350mWD) {
        safMainCrash("shouldn't call registerActivityOnKeyDownListener on MainActivity.");
        if (getActivityOnKeyDownListeners().contains(interfaceC1399350mWD)) {
            return;
        }
        for (InterfaceC1399350mWD interfaceC1399350mWD2 : getActivityOnKeyDownListeners()) {
            if (Intrinsics.LJFF(interfaceC1399350mWD2.getClass(), interfaceC1399350mWD.getClass())) {
                int iIndexOf = getActivityOnKeyDownListeners().indexOf(interfaceC1399350mWD2);
                if (iIndexOf == -1) {
                    getActivityOnKeyDownListeners().add(interfaceC1399350mWD);
                    return;
                } else {
                    ListProtector.add(getActivityOnKeyDownListeners(), iIndexOf, interfaceC1399350mWD);
                    return;
                }
            }
        }
        getActivityOnKeyDownListeners().add(interfaceC1399350mWD);
    }

    public final void setMainDarkChanged$main_release(boolean z) {
        this.mainDarkChanged = z;
    }

    public final void setPrevIsInDark$main_release(boolean z) {
        this.prevIsInDark = z;
    }

    public void setRootFragmentClz(Class<? extends InterfaceC214902198i> cls) {
        this.rootFragmentClz = cls;
    }

    public void setRootFragmentFactory(Function0<? extends InterfaceC214902198i> function0) {
        this.rootFragmentFactory = function0;
    }

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.C19GS, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper, android.content.Context
    public void setTheme(int i) {
        super.setTheme(i);
        this.resourceOptComponent.LJJIL(i);
    }

    @Override // X.InterfaceC1017450caF
    public void setVpEnableDispatchTouchEventCheck(boolean z) {
        MainRootFragment mainRootFragmentMrfOrCrash = mrfOrCrash("setVpEnableDispatchTouchEventCheck");
        if (mainRootFragmentMrfOrCrash != null) {
            mainRootFragmentMrfOrCrash.setVpEnableDispatchTouchEventCheck(z);
        }
    }

    @Override // X.InterfaceC655270Pn3
    public void unRegisterActivityOnKeyDownListener(InterfaceC1399350mWD interfaceC1399350mWD) {
        safMainCrash("shouldn't call unRegisterActivityOnKeyDownListener on MainActivity.");
        getActivityOnKeyDownListeners().remove(interfaceC1399350mWD);
    }

    public static void com_ss_android_ugc_aweme_main_MainActivityBase_com_bytedance_ies_ugc_statisticlogger_nxet_NxETAccessLancet_mainOnCreate(AbstractActivityC1602020rn6 abstractActivityC1602020rn6, Bundle bundle) throws JSONException {
        abstractActivityC1602020rn6.com_ss_android_ugc_aweme_main_MainActivityBase__onCreate$___twin___(bundle);
        C1848530yCh.LIZ.getClass();
        ITracingService iTracingServiceLIZ = C1845210y7L.LIZ();
        if (iTracingServiceLIZ != null) {
            iTracingServiceLIZ.LJIIZILJ(abstractActivityC1602020rn6);
        }
    }

    public final <F extends InterfaceC214902198i> void replaceRoot(Function0<? extends F> function0, SAFFragmentRootScene sAFFragmentRootScene) {
        Intrinsics.LJIILIIL();
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final <F extends InterfaceC214902198i> void replaceRoot(Class<F> cls, Function0<? extends F> function0, SAFFragmentRootScene sAFFragmentRootScene) {
        if (legacyTrackers() != null) {
            return;
        }
        if (sAFFragmentRootScene != null) {
            this.rootSAFSceneWrapper = sAFFragmentRootScene;
        }
        this.rootFragmentClz = cls;
        setRootFragmentFactory(function0);
    }

    public static void replaceRoot$default(AbstractActivityC1602020rn6 abstractActivityC1602020rn6, Function0 function0, SAFFragmentRootScene sAFFragmentRootScene, int i, Object obj) {
        if (obj == null) {
            Intrinsics.LJIILIIL();
            throw null;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: replaceRoot");
    }
}
