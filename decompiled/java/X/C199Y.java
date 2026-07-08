package X;

import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import android.os.Looper;
import android.os.SystemClock;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.ViewModelStore;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.common.jato.JatoXL;
import com.bytedance.common.jato.boost.CpusetManager;
import com.bytedance.common.jato.jit.JitBlock;
import com.bytedance.ies.foundation.activity.BaseActivity;
import com.bytedance.scene.Scene;
import com.bytedance.scene.navigation.NavigationScene;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.agilelogger.ALog;
import com.ss.android.common.lib.AppLogNewUtils;
import com.ss.android.ugc.aweme.SAFContextThemeConfig;
import com.ss.android.ugc.aweme.SAFFragmentRootScene;
import com.ss.android.ugc.aweme.service.IStrictModeService;
import com.zhiliaoapp.musically.R;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS576S0100000_32;
import kotlin.jvm.internal.AwS603S0100000_24;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.199Y, reason: invalid class name */
/* JADX INFO: loaded from: classes33.dex */
public abstract class C199Y extends BaseActivity implements InterfaceC214897198d {
    public static final C214927199h Companion = new Object() { // from class: X.199h
    };
    public final float autoRecycleInvisibleScenesThreshold;
    public final int configChangesAllowList;
    public final boolean customDispatch;
    public final boolean dispatchOnNewIntentByScene;
    public C214932199m dynamicParentScene;
    public final boolean enableNavigation;
    public final boolean enableNavigationSceneReuseActivityView;
    public final boolean enableUseNavigationSceneWindowFocusChangedDispatch;
    public final boolean enableViewModelStoreCheck;
    public boolean inRecreating;
    public AbstractC1563340qmi internalLifecycleRegistry;
    public NavigationScene navigationScene;
    public C198H rootSAFSceneWrapper;
    public Bundle safSavedInstanceState;
    public boolean sceneEnvironmentInited;
    public InterfaceC214923199d sceneLifecycleDispatcher;
    public final boolean shieldActivityController;
    public final boolean checkActivityLifecycle = true;
    public final Function0<InterfaceC214902198i> rootFragmentFactory = new C214922199c(this);
    public final InterfaceC20597515in ability = new InterfaceC20597515in() { // from class: X.199e
        @Override // X.InterfaceC20597515in
        public final FragmentManager LIZ() {
            return this.LIZ.getOriginSupportFragmentManager();
        }

        @Override // X.InterfaceC20597515in
        public final void LIZIZ(Function0<Unit> function0) {
            this.LIZ.onSceneEnvironmentReady(function0);
        }
    };
    public final AnonymousClass1950 callback = new AnonymousClass1950() { // from class: X.199g
        @Override // X.AnonymousClass1950
        public final void LIZ() {
            this.LIZ.onRootScenePreCreate();
        }
    };
    public CopyOnWriteArrayList<Function0<Unit>> sceneEnvironmentCbs = new CopyOnWriteArrayList<>();
    public final C01GW delegateFragmentManager$delegate = C452501pT.LIZIZ(new C20597415im(this));
    public final C01GW viewModelStore$delegate = C452501pT.LIZIZ(new C1602150rnJ(this));
    public final C01GW event$delegate = C452501pT.LIZIZ(new C214925199f(this));

    private final void onSceneReady() {
        this.sceneEnvironmentInited = true;
        Iterator<Function0<Unit>> it2 = this.sceneEnvironmentCbs.iterator();
        while (it2.hasNext()) {
            it2.next().invoke();
        }
    }

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.ActivityC21503719Dn, android.app.Activity
    public void finish() {
        if (!getEnableSAF()) {
            super.finish();
            return;
        }
        AbstractC1563340qmi abstractC1563340qmi = this.internalLifecycleRegistry;
        if (abstractC1563340qmi != null && abstractC1563340qmi.LJI(EnumC682280QpW.FINISH)) {
            throwSAFLifecycleCheckException$default(this, "activity.finish", false, false, null, 14, null);
        }
        C11KI.LIZ().LJIIJ();
        super.finish();
        IStrictModeService iStrictModeServiceLIZ = C11KI.LIZ();
        AbstractC1563340qmi abstractC1563340qmi2 = this.internalLifecycleRegistry;
        if (abstractC1563340qmi2 != null) {
            abstractC1563340qmi2.LJ();
        }
        iStrictModeServiceLIZ.LJ();
    }

    public boolean getEnableSAF() {
        return true;
    }

    public abstract Class<? extends InterfaceC214902198i> getRootFragmentClz();

    public SAFContextThemeConfig getRootPageContextConfig() {
        return null;
    }

    public boolean isDelegateFragmentManager() {
        return false;
    }

    @Override // android.app.Activity
    public boolean isDestroyed() {
        if (!getEnableSAF()) {
            return super.isDestroyed();
        }
        AbstractC1563340qmi abstractC1563340qmi = this.internalLifecycleRegistry;
        if (abstractC1563340qmi != null && abstractC1563340qmi.LJI(EnumC682280QpW.IS_DESTROY)) {
            throwSAFLifecycleCheckException$default(this, "activity.isDestroyed", false, false, null, 12, null);
        }
        C11KI.LIZ().LJIIIZ();
        boolean zIsDestroyed = super.isDestroyed();
        IStrictModeService iStrictModeServiceLIZ = C11KI.LIZ();
        AbstractC1563340qmi abstractC1563340qmi2 = this.internalLifecycleRegistry;
        if (abstractC1563340qmi2 != null) {
            abstractC1563340qmi2.LJ();
        }
        iStrictModeServiceLIZ.LIZLLL();
        return zIsDestroyed;
    }

    @Override // android.app.Activity
    public boolean isFinishing() {
        if (!getEnableSAF()) {
            return super.isFinishing();
        }
        AbstractC1563340qmi abstractC1563340qmi = this.internalLifecycleRegistry;
        if (abstractC1563340qmi != null && abstractC1563340qmi.LJI(EnumC682280QpW.IS_FINISHING)) {
            throwSAFLifecycleCheckException$default(this, "activity.isFinishing", false, false, null, 12, null);
        }
        C11KI.LIZ().LIZIZ();
        boolean zIsFinishing = super.isFinishing();
        IStrictModeService iStrictModeServiceLIZ = C11KI.LIZ();
        AbstractC1563340qmi abstractC1563340qmi2 = this.internalLifecycleRegistry;
        if (abstractC1563340qmi2 != null) {
            abstractC1563340qmi2.LJ();
        }
        iStrictModeServiceLIZ.LJI();
        return zIsFinishing;
    }

    public boolean migrateDarkModeImplToFragment() {
        return false;
    }

    public boolean migrateImmersiveBarImplToFragment() {
        return false;
    }

    public boolean onlyOnePageWhenNavigationOpen() {
        return false;
    }

    public final void throwSAFLifecycleCheckException(String str) {
        throwSAFLifecycleCheckException$default(this, str, false, false, null, 14, null);
    }

    public final void throwSAFLifecycleCheckException(String str, boolean z) {
        throwSAFLifecycleCheckException$default(this, str, z, false, null, 12, null);
    }

    public final void throwSAFLifecycleCheckException(String str, boolean z, boolean z2) {
        throwSAFLifecycleCheckException$default(this, str, z, z2, null, 8, null);
    }

    private final FragmentManager getDelegateFragmentManager() {
        return (FragmentManager) this.delegateFragmentManager$delegate.getValue();
    }

    public AbstractC1563340qmi createSafLifecycleRegistry() {
        return new AbstractC1563340qmi(this) { // from class: X.0ruU
            @Override // X.AbstractC1563340qmi
            public final String LJ() {
                return "SAFPrefixId";
            }

            {
                super(this);
            }
        };
    }

    public final void dispatchSceneCreateView() {
        InterfaceC214923199d interfaceC214923199d = this.sceneLifecycleDispatcher;
        if (interfaceC214923199d != null) {
            interfaceC214923199d.LIZIZ();
        }
    }

    @Override // X.InterfaceC214897198d
    public InterfaceC214902198i getDynamicParentRootFragment() {
        SAFFragmentRootScene sAFFragmentRootScene;
        C214932199m c214932199m = this.dynamicParentScene;
        if (c214932199m == null || (sAFFragmentRootScene = c214932199m.LLJI) == null) {
            return null;
        }
        return sAFFragmentRootScene.LLJJ;
    }

    public final C199Z getEvent() {
        return (C199Z) this.event$delegate.getValue();
    }

    @Override // androidx.activity.ComponentActivity, X.C19FO, androidx.lifecycle.LifecycleOwner
    public final Lifecycle getLifecycle() {
        if (this.internalLifecycleRegistry == null) {
            this.internalLifecycleRegistry = createSafLifecycleRegistry();
        }
        AbstractC1563340qmi abstractC1563340qmi = this.internalLifecycleRegistry;
        if (abstractC1563340qmi != null) {
            return abstractC1563340qmi;
        }
        "Required value was null.".toString();
        throw new IllegalArgumentException("Required value was null.");
    }

    public InterfaceC21498219Bk getStateSaveStrategy() {
        return new C1701300uNE(getClassLoader());
    }

    @Override // androidx.activity.ComponentActivity, androidx.lifecycle.ViewModelStoreOwner
    public ViewModelStore getViewModelStore() {
        return (ViewModelStore) this.viewModelStore$delegate.getValue();
    }

    private final InterfaceC214902198i getCurrentSafFragment() {
        return C20629915o1.LIZJ(this);
    }

    private final Class<? extends InterfaceC214902198i> getRequireRootFragmentClazz() {
        Class<? extends InterfaceC214902198i> rootFragmentClz = getRootFragmentClz();
        if (rootFragmentClz != null) {
            return rootFragmentClz;
        }
        "rootFragmentClz should be filled when saf enabled.".toString();
        throw new IllegalArgumentException("rootFragmentClz should be filled when saf enabled.");
    }

    public final void dispatchSceneActivityCreated() {
        C199Z event = getEvent();
        event.getClass();
        event.LJI = System.currentTimeMillis();
        InterfaceC214923199d interfaceC214923199d = this.sceneLifecycleDispatcher;
        if (interfaceC214923199d != null) {
            interfaceC214923199d.LIZ();
        }
        C199Z event2 = getEvent();
        if (event2.LJI != -1) {
            event2.LJII = System.currentTimeMillis() - event2.LJI;
        }
    }

    public String getActivityName() {
        return getClass().getSimpleName();
    }

    @Override // X.InterfaceC20622815ms
    public FragmentManager getContainerFragmentManager() {
        return C197U.LIZIZ(this);
    }

    public final FragmentManager getOriginSupportFragmentManager() {
        return super.getSupportFragmentManager();
    }

    @Override // X.C19EG
    public FragmentManager getSupportFragmentManager() {
        if (!getEnableSAF()) {
            return super.getSupportFragmentManager();
        }
        if (getEnableNavigation()) {
            return getDelegateFragmentManager();
        }
        if (isDelegateFragmentManager()) {
            return getDelegateFragmentManager();
        }
        C198H rootSAFSceneWrapper = getRootSAFSceneWrapper();
        C128Y scene = rootSAFSceneWrapper != null ? rootSAFSceneWrapper.getScene() : null;
        return scene instanceof InterfaceC20630715o9 ? ((InterfaceC20630715o9) scene).getFragmentManager() : super.getSupportFragmentManager();
    }

    @Override // X.InterfaceC214897198d
    public boolean getUseRootFragmentForPageCallbacks() {
        return getEnableSAF();
    }

    public final void initScene() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SAFActivity: ");
        sbLIZ.append(this);
        sbLIZ.append(",  ");
        sbLIZ.append("initScene start");
        System.out.println((Object) C2188811AlT.LIZIZ(sbLIZ));
        C199Z event = getEvent();
        event.getClass();
        event.LIZJ = System.currentTimeMillis();
        Bundle bundleINVOKEVIRTUAL_com_bytedance_ies_foundation_saf_SAFTikTokActivity_com_ss_android_ugc_aweme_lancet_IntentLancet_getExtras = INVOKEVIRTUAL_com_bytedance_ies_foundation_saf_SAFTikTokActivity_com_ss_android_ugc_aweme_lancet_IntentLancet_getExtras(getIntent());
        if (bundleINVOKEVIRTUAL_com_bytedance_ies_foundation_saf_SAFTikTokActivity_com_ss_android_ugc_aweme_lancet_IntentLancet_getExtras == null) {
            bundleINVOKEVIRTUAL_com_bytedance_ies_foundation_saf_SAFTikTokActivity_com_ss_android_ugc_aweme_lancet_IntentLancet_getExtras = new Bundle();
        }
        InterfaceC214923199d interfaceC214923199d = (InterfaceC214923199d) initSceneEnvironment$default(this, SAFFragmentRootScene.class, bundleINVOKEVIRTUAL_com_bytedance_ies_foundation_saf_SAFTikTokActivity_com_ss_android_ugc_aweme_lancet_IntentLancet_getExtras, 0, 4, null).getSecond();
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("initScene end: ");
        sbLIZ2.append(getRootSAFSceneWrapper());
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ2);
        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
        sbLIZ3.append("SAFActivity: ");
        sbLIZ3.append(this);
        sbLIZ3.append(",  ");
        sbLIZ3.append(strLIZIZ);
        System.out.println((Object) C2188811AlT.LIZIZ(sbLIZ3));
        C1563370qml.LIZ(this, EnumC682280QpW.MAIN, new C214921199b(this, interfaceC214923199d));
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0038  */
    @Override // X.ActivityC21503719Dn, androidx.activity.ComponentActivity, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onBackPressed() {
        /*
            r4 = this;
            boolean r0 = r4.getEnableSAF()
            if (r0 != 0) goto La
            super.onBackPressed()
            return
        La:
            X.198i r0 = r4.getDynamicParentRootFragment()
            r3 = 1
            if (r0 == 0) goto L18
            boolean r0 = r0.onBackPressed()
            if (r0 != r3) goto L18
            return
        L18:
            com.bytedance.scene.navigation.NavigationScene r2 = r4.getNavigationScene()
            if (r2 == 0) goto L38
            boolean r0 = r4.onlyOnePageWhenNavigationOpen()
            r0 = r0 ^ 1
            r1 = 0
            if (r0 == 0) goto L38
            X.198H r0 = X.C20629915o1.LIZLLL(r4)
            if (r0 == 0) goto L31
            X.19BM r1 = r0.buildPopOptions()
        L31:
            boolean r0 = r2.LLLLLJIL(r1)
            if (r0 == 0) goto L45
            return
        L38:
            X.198H r0 = r4.getRootSAFSceneWrapper()
            if (r0 == 0) goto L45
            boolean r0 = r0.onBackPressed()
            if (r0 != r3) goto L45
            return
        L45:
            X.0qmi r1 = r4.internalLifecycleRegistry
            if (r1 == 0) goto L4e
            X.0QpW r0 = X.EnumC682280QpW.FINISH
            r1.LIZJ(r0)
        L4e:
            super.onBackPressed()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C199Y.onBackPressed():void");
    }

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.C19GS, X.C19EG, android.app.Activity
    public void onDestroy() {
        if (!getEnableSAF()) {
            super.onDestroy();
            return;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SAFActivity: ");
        sbLIZ.append(this);
        sbLIZ.append(",  ");
        sbLIZ.append("onDestroy Start");
        System.out.println((Object) C2188811AlT.LIZIZ(sbLIZ));
        AbstractC1563340qmi abstractC1563340qmi = this.internalLifecycleRegistry;
        if (abstractC1563340qmi != null) {
            abstractC1563340qmi.LIZ(EnumC682280QpW.IS_FINISHING, new AwS576S0100000_32(this, 640));
        }
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("SAFActivity: ");
        sbLIZ2.append(this);
        sbLIZ2.append(",  ");
        sbLIZ2.append("onDestroy End");
        System.out.println((Object) C2188811AlT.LIZIZ(sbLIZ2));
    }

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.C19EG, X.C19FO, android.app.Activity
    public void onPause() {
        if (!getEnableSAF()) {
            super.onPause();
            return;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SAFActivity: ");
        sbLIZ.append(this);
        sbLIZ.append(",  ");
        sbLIZ.append("onPause Start");
        System.out.println((Object) C2188811AlT.LIZIZ(sbLIZ));
        super.onPause();
        InterfaceC214923199d interfaceC214923199d = this.sceneLifecycleDispatcher;
        if (interfaceC214923199d != null) {
            interfaceC214923199d.onPaused();
        }
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("SAFActivity: ");
        sbLIZ2.append(this);
        sbLIZ2.append(",  ");
        sbLIZ2.append("onPause End");
        System.out.println((Object) C2188811AlT.LIZIZ(sbLIZ2));
    }

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.C19EG, X.C19FO, android.app.Activity
    public void onResume() {
        if (!getEnableSAF()) {
            super.onResume();
            return;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SAFActivity: ");
        sbLIZ.append(this);
        sbLIZ.append(",  ");
        sbLIZ.append("onResume Start");
        System.out.println((Object) C2188811AlT.LIZIZ(sbLIZ));
        super.onResume();
        C199Z event = getEvent();
        event.getClass();
        event.LJIIJ = System.currentTimeMillis();
        InterfaceC214923199d interfaceC214923199d = this.sceneLifecycleDispatcher;
        if (interfaceC214923199d != null) {
            interfaceC214923199d.onResumed();
        }
        final C199Z event2 = getEvent();
        if (event2.LJIIJ != -1) {
            final boolean z = event2.LJIIL;
            event2.LJIIL = false;
            event2.LJIIJJI = System.currentTimeMillis() - event2.LJIIJ;
            C823050WQl.LIZIZ().execute(new Runnable() { // from class: X.199a
                public final void LIZ() throws JSONException {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("saf_activity_name", event2.LIZ);
                    jSONObject.put("saf_is_saved_instance", event2.LIZIZ);
                    long j = event2.LIZLLL;
                    if (j != -1) {
                        jSONObject.put("saf_scene_environment_duration", j);
                    }
                    long j2 = event2.LJFF;
                    if (j2 != -1) {
                        jSONObject.put("saf_onCreate_duration", j2);
                    }
                    long j3 = event2.LJII;
                    if (j3 != -1) {
                        jSONObject.put("saf_onActivityCreated_duration", j3);
                    }
                    long j4 = event2.LJIIIZ;
                    if (j4 != -1) {
                        jSONObject.put("saf_onStart_duration", j4);
                    }
                    long j5 = event2.LJIIJJI;
                    if (j5 != -1) {
                        jSONObject.put("saf_onResume_duration", j5);
                    }
                    jSONObject.put("saf_is_cold_start", z);
                    jSONObject.put("saf_is_navigation", event2.LJIILIIL);
                    AppLogNewUtils.onEventV3("saf_tiktok_activity", jSONObject);
                }

                @Override // java.lang.Runnable
                public final void run() {
                    boolean zLIZ;
                    C1C7U.LIZ("SAFTikTokMonitorEvent@64b5.onSceneDispatchOnResumeEnd$1");
                    try {
                        LIZ();
                    } finally {
                        if (!zLIZ) {
                        }
                    }
                    C1C7U.LIZIZ("SAFTikTokMonitorEvent@64b5.onSceneDispatchOnResumeEnd$1");
                }
            });
        }
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("SAFActivity: ");
        sbLIZ2.append(this);
        sbLIZ2.append(",  ");
        sbLIZ2.append("onResume End");
        System.out.println((Object) C2188811AlT.LIZIZ(sbLIZ2));
    }

    public final void onRootScenePreCreate() {
        InterfaceC20630715o9 interfaceC20630715o9;
        if (getNavigationScene() == null || onlyOnePageWhenNavigationOpen()) {
            onSceneReady();
            C198H rootSAFSceneWrapper = getRootSAFSceneWrapper();
            if (!(rootSAFSceneWrapper instanceof InterfaceC20630715o9) || (interfaceC20630715o9 = (InterfaceC20630715o9) rootSAFSceneWrapper) == null) {
                return;
            }
            InterfaceC214902198i interfaceC214902198iF0 = interfaceC20630715o9.F0();
            if (interfaceC214902198iF0 != null) {
                interfaceC214902198iF0.uG(C2214291BlT.LIZ);
            } else {
                "Required value was null.".toString();
                throw new IllegalArgumentException("Required value was null.");
            }
        }
    }

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.C19GS, X.C19EG, android.app.Activity
    public void onStart() {
        if (!getEnableSAF()) {
            super.onStart();
            return;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SAFActivity: ");
        sbLIZ.append(this);
        sbLIZ.append(",  ");
        sbLIZ.append("onStart Start");
        System.out.println((Object) C2188811AlT.LIZIZ(sbLIZ));
        super.onStart();
        C199Z event = getEvent();
        event.getClass();
        event.LJIIIIZZ = System.currentTimeMillis();
        InterfaceC214923199d interfaceC214923199d = this.sceneLifecycleDispatcher;
        if (interfaceC214923199d != null) {
            interfaceC214923199d.LJ();
        }
        C199Z event2 = getEvent();
        if (event2.LJIIIIZZ != -1) {
            event2.LJIIIZ = System.currentTimeMillis() - event2.LJIIIIZZ;
        }
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("SAFActivity: ");
        sbLIZ2.append(this);
        sbLIZ2.append(",  ");
        sbLIZ2.append("onStart End");
        System.out.println((Object) C2188811AlT.LIZIZ(sbLIZ2));
    }

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.C19GS, X.C19EG, android.app.Activity
    public void onStop() {
        if (!getEnableSAF()) {
            super.onStop();
            return;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SAFActivity: ");
        sbLIZ.append(this);
        sbLIZ.append(",  ");
        sbLIZ.append("onStop Start");
        System.out.println((Object) C2188811AlT.LIZIZ(sbLIZ));
        AbstractC1563340qmi abstractC1563340qmi = this.internalLifecycleRegistry;
        if (abstractC1563340qmi != null) {
            abstractC1563340qmi.LIZ(EnumC682280QpW.IS_FINISHING, new AwS576S0100000_32(this, 641));
        }
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("SAFActivity: ");
        sbLIZ2.append(this);
        sbLIZ2.append(",  ");
        sbLIZ2.append("onStop End");
        System.out.println((Object) C2188811AlT.LIZIZ(sbLIZ2));
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onUserLeaveHint() {
        InterfaceC214902198i interfaceC214902198iLIZJ = C20629915o1.LIZJ(this);
        if (interfaceC214902198iLIZJ != null) {
            interfaceC214902198iLIZJ.LJLLLL();
        }
        super.onUserLeaveHint();
    }

    @Override // X.C19GS, android.app.Activity
    public void recreate() {
        if (!getEnableSAF()) {
            super.recreate();
        } else {
            this.inRecreating = true;
            super.recreate();
        }
    }

    public void finishLastPage() {
        C197U.LIZ(this);
    }

    @Override // X.InterfaceC20622815ms
    public InterfaceC20597515in getAbility() {
        return this.ability;
    }

    public float getAutoRecycleInvisibleScenesThreshold() {
        return this.autoRecycleInvisibleScenesThreshold;
    }

    public boolean getCheckActivityLifecycle() {
        return this.checkActivityLifecycle;
    }

    public int getConfigChangesAllowList() {
        return this.configChangesAllowList;
    }

    public boolean getCustomDispatch() {
        return this.customDispatch;
    }

    public boolean getDispatchOnNewIntentByScene() {
        return this.dispatchOnNewIntentByScene;
    }

    @Override // X.InterfaceC214897198d
    public C214932199m getDynamicParentScene() {
        return this.dynamicParentScene;
    }

    public boolean getEnableNavigation() {
        return this.enableNavigation;
    }

    public boolean getEnableNavigationSceneReuseActivityView() {
        return this.enableNavigationSceneReuseActivityView;
    }

    public boolean getEnableUseNavigationSceneWindowFocusChangedDispatch() {
        return this.enableUseNavigationSceneWindowFocusChangedDispatch;
    }

    public boolean getEnableViewModelStoreCheck() {
        return this.enableViewModelStoreCheck;
    }

    @Override // X.InterfaceC20622815ms
    public NavigationScene getNavigationScene() {
        return this.navigationScene;
    }

    public Function0<InterfaceC214902198i> getRootFragmentFactory() {
        return this.rootFragmentFactory;
    }

    @Override // X.InterfaceC20622815ms
    public C198H getRootSAFSceneWrapper() {
        return this.rootSAFSceneWrapper;
    }

    public boolean getShieldActivityController() {
        return this.shieldActivityController;
    }

    @Override // X.InterfaceC214897198d
    public AnonymousClass1950 provideSAFActivityCallBack() {
        return this.callback;
    }

    public static Bundle INVOKEVIRTUAL_com_bytedance_ies_foundation_saf_SAFTikTokActivity_com_ss_android_ugc_aweme_lancet_IntentLancet_getExtras(Intent intent) {
        try {
            return intent.getExtras();
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return null;
        }
    }

    @Override // X.C19GS, X.C19FO, android.app.Activity, android.view.Window.Callback
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        InterfaceC214902198i interfaceC214902198iLIZJ = C20629915o1.LIZJ(this);
        if (interfaceC214902198iLIZJ == null) {
            return super.dispatchKeyEvent(keyEvent);
        }
        Boolean boolDispatchKeyEvent = interfaceC214902198iLIZJ.dispatchKeyEvent(keyEvent);
        if (boolDispatchKeyEvent != null) {
            return boolDispatchKeyEvent.booleanValue();
        }
        return super.dispatchKeyEvent(keyEvent);
    }

    public final void dispatchSceneCreated(Bundle bundle) {
        Bundle bundle2;
        C199Z event = getEvent();
        event.getClass();
        event.LJ = System.currentTimeMillis();
        int i = Build.VERSION.SDK_INT;
        if ((i == 28 || i == 29) && bundle != null && bundle.getBoolean("bd-scene-nav:scene_argument_has") && bundle.getBundle("bd-scene-nav:scene_argument") == null) {
            bundle.putBoolean("bd-scene-nav:scene_argument_has", false);
        }
        if (getEnableSAF() && bundle != null && bundle.getBoolean("saf:onSaveInstanceState_TAG", false)) {
            bundle2 = bundle;
        } else {
            bundle2 = null;
        }
        this.safSavedInstanceState = bundle2;
        if (bundle2 != null && bundle2.getBoolean("saf:onSaveInstanceState_navigation_TAG", false) != getEnableNavigation()) {
            this.safSavedInstanceState = null;
        }
        if (bundle != null && bundle.getBoolean("saf:onSaveInstanceState_use_delegateFM_TAG", false) != isDelegateFragmentManager()) {
            this.safSavedInstanceState = null;
        }
        InterfaceC214923199d interfaceC214923199d = this.sceneLifecycleDispatcher;
        if (interfaceC214923199d != null) {
            interfaceC214923199d.LIZLLL(this, this.safSavedInstanceState);
        }
        C199Z event2 = getEvent();
        if (event2.LJ != -1) {
            event2.LJFF = System.currentTimeMillis() - event2.LJ;
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        InterfaceC214902198i interfaceC214902198iLIZJ = C20629915o1.LIZJ(this);
        if (interfaceC214902198iLIZJ == null) {
            return super.dispatchTouchEvent(motionEvent);
        }
        Boolean boolDispatchTouchEvent = interfaceC214902198iLIZJ.dispatchTouchEvent(motionEvent);
        if (boolDispatchTouchEvent != null) {
            return boolDispatchTouchEvent.booleanValue();
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    public final void navigationSceneReuseActivityView(View view) {
        C214936199q c214936199qLLLLIL;
        NavigationScene navigationScene = getNavigationScene();
        if (navigationScene != null && (c214936199qLLLLIL = navigationScene.LLLLIL()) != null && c214936199qLLLLIL.LJIILIIL) {
            if (view instanceof FrameLayout) {
                NavigationScene navigationScene2 = getNavigationScene();
                if (navigationScene2 != null) {
                    FrameLayout frameLayout = (FrameLayout) view;
                    if (navigationScene2.mArguments != null) {
                        if (navigationScene2.LLLLIL().LJIILIIL) {
                            if (navigationScene2.mView == null) {
                                if (frameLayout != null) {
                                    navigationScene2.LLJJIII = frameLayout;
                                    navigationScene2.LLJJIJI = true;
                                    return;
                                }
                                throw new IllegalArgumentException("setOutsideView outsideView argument is null");
                            }
                            throw new IllegalStateException("NavigationScene have created its view, you should invoke before onCreateView");
                        }
                        throw new IllegalStateException("You should invoke NavigationSceneOptions.setReuseOutsideView(true) at first");
                    }
                    throw new IllegalStateException("NavigationScene don't have any arguments, you should invoke after setArguments");
                }
                return;
            }
            throw new IllegalArgumentException("NavigationScene reuse view should be FrameLayout");
        }
    }

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.C19GS, androidx.activity.ComponentActivity, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        Configuration configuration2;
        AnonymousClass1995 anonymousClass1995;
        if (!getEnableSAF()) {
            super.onConfigurationChanged(configuration);
            return;
        }
        if (((Number) C256950A5d.LIZ.getValue()).intValue() == C256950A5d.LIZIZ) {
            configuration2 = new Configuration(configuration);
        } else {
            configuration2 = configuration;
        }
        super.onConfigurationChanged(configuration);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SAFActivity: ");
        sbLIZ.append(this);
        sbLIZ.append(",  ");
        sbLIZ.append("onConfigurationChanged");
        System.out.println((Object) C2188811AlT.LIZIZ(sbLIZ));
        if (this.inRecreating) {
            return;
        }
        NavigationScene navigationScene = getNavigationScene();
        if (navigationScene == null) {
            C198H c198hLIZLLL = C20629915o1.LIZLLL(this);
            if ((c198hLIZLLL instanceof AnonymousClass1995) && (anonymousClass1995 = (AnonymousClass1995) c198hLIZLLL) != null) {
                anonymousClass1995.onConfigurationChanged(configuration);
                return;
            }
            return;
        }
        if (((Boolean) C137600fm.LIZ.getValue()).booleanValue() && C20629915o1.LIZLLL(this) == null) {
            return;
        }
        navigationScene.onConfigurationChanged(configuration2);
    }

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.ActivityC21503719Dn, X.C19EG, androidx.activity.ComponentActivity, X.C19FO, android.app.Activity
    public void onCreate(Bundle bundle) throws JSONException {
        if (!getEnableSAF()) {
            super.onCreate(bundle);
            return;
        }
        this.inRecreating = false;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onCreate Start ");
        sbLIZ.append(getCustomDispatch());
        sbLIZ.append(" , ");
        sbLIZ.append(getEnableSAF());
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("SAFActivity: ");
        sbLIZ2.append(this);
        sbLIZ2.append(",  ");
        sbLIZ2.append(strLIZIZ);
        System.out.println((Object) C2188811AlT.LIZIZ(sbLIZ2));
        if (bundle != null) {
            getEvent().LIZIZ = true;
            C214931199l c214931199l = C214931199l.LIZ;
            AwS603S0100000_24 awS603S0100000_24 = new AwS603S0100000_24(this, 529);
            c214931199l.getClass();
            if (((Boolean) C18009073n.LIZ.getValue()).booleanValue()) {
                Configuration configuration = getResources().getConfiguration();
                Configuration configuration2 = (Configuration) bundle.getParcelable("tt_saf_configuration");
                if (configuration != null && configuration2 != null) {
                    int iDiff = configuration2.diff(configuration);
                    String strLIZ = C466350IQn.LIZ(iDiff);
                    StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                    sbLIZ3.append("restart due to config changed (");
                    sbLIZ3.append(Integer.toHexString(iDiff));
                    sbLIZ3.append("): ");
                    sbLIZ3.append(strLIZ);
                    awS603S0100000_24.invoke(C2188811AlT.LIZIZ(sbLIZ3));
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("is_recreate", 5);
                    jSONObject.put("top_page", strLIZ);
                    AppLogNewUtils.onEventV3("main_activity_saf_recreate_monitor", jSONObject);
                }
            }
        }
        if (!getCustomDispatch()) {
            initScene();
            dispatchSceneCreated(bundle);
            super.onCreate(this.safSavedInstanceState);
            FrameLayout frameLayout = new FrameLayout(this);
            frameLayout.setId(R.id.tya);
            setContentView(frameLayout);
            navigationSceneReuseActivityView(frameLayout);
            dispatchSceneCreateView();
            dispatchSceneActivityCreated();
        } else {
            super.onCreate(this.safSavedInstanceState);
        }
        System.out.println((Object) ("SAFActivity: " + this + ",  onCreate End"));
    }

    @Override // X.ActivityC21503719Dn, androidx.activity.ComponentActivity, android.app.Activity
    public void onNewIntent(Intent intent) {
        AnonymousClass1995 anonymousClass1995;
        if (!getEnableSAF()) {
            super.onNewIntent(intent);
            return;
        }
        super.onNewIntent(intent);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SAFActivity: ");
        sbLIZ.append(this);
        sbLIZ.append(",  ");
        sbLIZ.append("onNewIntent");
        System.out.println((Object) C2188811AlT.LIZIZ(sbLIZ));
        if (!getDispatchOnNewIntentByScene()) {
            C198H c198hLIZLLL = C20629915o1.LIZLLL(this);
            if ((c198hLIZLLL instanceof AnonymousClass1995) && (anonymousClass1995 = (AnonymousClass1995) c198hLIZLLL) != null) {
                anonymousClass1995.LLLLIILLL(INVOKEVIRTUAL_com_bytedance_ies_foundation_saf_SAFTikTokActivity_com_ss_android_ugc_aweme_lancet_IntentLancet_getExtras(intent));
            }
        }
    }

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, androidx.activity.ComponentActivity, X.C19FO, android.app.Activity
    public void onSaveInstanceState(Bundle bundle) {
        if (!getEnableSAF()) {
            super.onSaveInstanceState(bundle);
            return;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SAFActivity: ");
        sbLIZ.append(this);
        sbLIZ.append(",  ");
        sbLIZ.append("onSaveInstanceState Start");
        System.out.println((Object) C2188811AlT.LIZIZ(sbLIZ));
        super.onSaveInstanceState(bundle);
        InterfaceC214923199d interfaceC214923199d = this.sceneLifecycleDispatcher;
        if (interfaceC214923199d != null) {
            interfaceC214923199d.onSaveInstanceState(bundle);
        }
        bundle.putBoolean("saf:onSaveInstanceState_TAG", getEnableSAF());
        bundle.putBoolean("saf:onSaveInstanceState_navigation_TAG", getEnableNavigation());
        bundle.putBoolean("saf:onSaveInstanceState_use_delegateFM_TAG", isDelegateFragmentManager());
        if (getEnableSAF() && bundle.getBoolean("bd-scene-nav:scene_argument_has") && bundle.getBundle("bd-scene-nav:scene_argument") == null) {
            throw new IllegalStateException("meet exception to store the Scene arguments when onSavedInstanceState");
        }
        C214931199l.LIZ.getClass();
        if (((Boolean) C18009073n.LIZ.getValue()).booleanValue()) {
            C786410Ut5.LJJIJL(bundle, "tt_saf_configuration", getResources().getConfiguration());
        }
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("SAFActivity: ");
        sbLIZ2.append(this);
        sbLIZ2.append(",  ");
        sbLIZ2.append("onSaveInstanceState End");
        System.out.println((Object) C2188811AlT.LIZIZ(sbLIZ2));
    }

    public final void onSceneEnvironmentReady(Function0<Unit> function0) {
        if (this.sceneEnvironmentInited) {
            function0.invoke();
        } else {
            this.sceneEnvironmentCbs.add(function0);
        }
    }

    @Override // android.app.Activity
    public void onTopResumedActivityChanged(boolean z) {
        C198Q c198q;
        if (!getEnableSAF()) {
            super.onTopResumedActivityChanged(z);
            return;
        }
        super.onTopResumedActivityChanged(z);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onTopResumedActivityChanged ");
        sbLIZ.append(z);
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("SAFActivity: ");
        sbLIZ2.append(this);
        sbLIZ2.append(",  ");
        sbLIZ2.append(strLIZIZ);
        System.out.println((Object) C2188811AlT.LIZIZ(sbLIZ2));
        C198H c198hLIZLLL = C20629915o1.LIZLLL(this);
        if ((c198hLIZLLL instanceof C198Q) && (c198q = (C198Q) c198hLIZLLL) != null) {
            c198q.vg(z);
        }
    }

    @Override // X.InterfaceC214897198d
    public void setDynamicParentScene(C214932199m c214932199m) {
        this.dynamicParentScene = c214932199m;
    }

    public void setNavigationScene(NavigationScene navigationScene) {
        this.navigationScene = navigationScene;
    }

    public void setRootSAFSceneWrapper(C198H c198h) {
        this.rootSAFSceneWrapper = c198h;
    }

    @Override // X.InterfaceC214897198d
    public void beforeNavigating(Scene scene, Scene scene2) {
        long jIntValue = ((Number) AnonymousClass0760.LIZ.getValue()).intValue();
        if (jIntValue > 0) {
            SystemClock.uptimeMillis();
            BPEAHandler bPEAHandler = new BPEAHandler(Looper.getMainLooper());
            if ((C18073075z.LIZ() & 1) == 1) {
                JatoXL.tryCpuBoost(jIntValue);
                CpusetManager.bindBigCore();
                C786410Ut5.LJLIIL(jIntValue, bPEAHandler, new Runnable() { // from class: X.08Rh
                    @Override // java.lang.Runnable
                    public final void run() {
                        boolean zLIZ;
                        C1C7U.LIZ("SAFOpenPageOptKt@482c.optOpenSAFPage$1");
                        try {
                            CpusetManager.resetCoreBind();
                        } finally {
                            if (!zLIZ) {
                            }
                        }
                        C1C7U.LIZIZ("SAFOpenPageOptKt@482c.optOpenSAFPage$1");
                    }
                });
            }
            if ((C18073075z.LIZ() & 4) == 4) {
                JatoXL.setPriority(-20);
            }
            if ((C18073075z.LIZ() & 2) == 2) {
                JatoXL.requestBlockGc(jIntValue);
            }
            if ((C18073075z.LIZ() & 8) == 8) {
                JitBlock.lightJitBlockStart();
                C786410Ut5.LJLIIL(jIntValue, bPEAHandler, new Runnable() { // from class: X.07xj
                    @Override // java.lang.Runnable
                    public final void run() {
                        boolean zLIZ;
                        C1C7U.LIZ("SAFOpenPageOptKt@482c.optOpenSAFPage$2");
                        try {
                            JatoXL.lightJitBlockStop();
                        } finally {
                            if (!zLIZ) {
                            }
                        }
                        C1C7U.LIZIZ("SAFOpenPageOptKt@482c.optOpenSAFPage$2");
                    }
                });
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x002b, code lost:
    
        if (r2 == null) goto L18;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0021  */
    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.ActivityC21503719Dn, X.C19GS, android.app.Activity, android.view.KeyEvent.Callback
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean onKeyDown(int r4, android.view.KeyEvent r5) {
        /*
            r3 = this;
            boolean r0 = r3.getEnableSAF()
            if (r0 != 0) goto Lb
            boolean r0 = super.onKeyDown(r4, r5)
            return r0
        Lb:
            X.199m r0 = r3.getDynamicParentScene()
            if (r0 == 0) goto L21
            com.ss.android.ugc.aweme.SAFFragmentRootScene r2 = r0.LLJI
            if (r2 == 0) goto L21
        L15:
            boolean r1 = X.C12WG.LIZIZ(r2)
            r0 = 1
            if (r1 != r0) goto L32
            boolean r0 = super.onKeyDown(r4, r5)
            return r0
        L21:
            com.bytedance.scene.navigation.NavigationScene r0 = r3.getNavigationScene()
            if (r0 == 0) goto L2d
            com.bytedance.scene.Scene r2 = r0.LLLLIIIILLL()
            if (r2 != 0) goto L15
        L2d:
            boolean r0 = super.onKeyDown(r4, r5)
            return r0
        L32:
            boolean r0 = r2 instanceof X.C198H
            if (r0 == 0) goto L48
            X.198H r2 = (X.C198H) r2
            java.lang.Boolean r0 = r2.onActivityKeyDown(r4, r5)
            if (r0 == 0) goto L43
            boolean r0 = r0.booleanValue()
            return r0
        L43:
            boolean r0 = super.onKeyDown(r4, r5)
            return r0
        L48:
            boolean r0 = super.onKeyDown(r4, r5)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C199Y.onKeyDown(int, android.view.KeyEvent):boolean");
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x002b, code lost:
    
        if (r2 == null) goto L18;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0021  */
    @Override // X.ActivityC21503719Dn, android.app.Activity, android.view.KeyEvent.Callback
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean onKeyLongPress(int r4, android.view.KeyEvent r5) {
        /*
            r3 = this;
            boolean r0 = r3.getEnableSAF()
            if (r0 != 0) goto Lb
            boolean r0 = super.onKeyLongPress(r4, r5)
            return r0
        Lb:
            X.199m r0 = r3.getDynamicParentScene()
            if (r0 == 0) goto L21
            com.ss.android.ugc.aweme.SAFFragmentRootScene r2 = r0.LLJI
            if (r2 == 0) goto L21
        L15:
            boolean r1 = X.C12WG.LIZIZ(r2)
            r0 = 1
            if (r1 != r0) goto L32
            boolean r0 = super.onKeyLongPress(r4, r5)
            return r0
        L21:
            com.bytedance.scene.navigation.NavigationScene r0 = r3.getNavigationScene()
            if (r0 == 0) goto L2d
            com.bytedance.scene.Scene r2 = r0.LLLLIIIILLL()
            if (r2 != 0) goto L15
        L2d:
            boolean r0 = super.onKeyLongPress(r4, r5)
            return r0
        L32:
            boolean r0 = r2 instanceof X.C198H
            if (r0 == 0) goto L48
            X.198H r2 = (X.C198H) r2
            java.lang.Boolean r0 = r2.onActivityKeyLongPress(r4, r5)
            if (r0 == 0) goto L43
            boolean r0 = r0.booleanValue()
            return r0
        L43:
            boolean r0 = super.onKeyLongPress(r4, r5)
            return r0
        L48:
            boolean r0 = super.onKeyLongPress(r4, r5)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C199Y.onKeyLongPress(int, android.view.KeyEvent):boolean");
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0040, code lost:
    
        if (r2 == null) goto L24;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0036  */
    @Override // X.ActivityC21503719Dn, android.app.Activity, android.view.KeyEvent.Callback
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean onKeyUp(int r4, android.view.KeyEvent r5) {
        /*
            r3 = this;
            boolean r0 = r3.getEnableSAF()
            if (r0 != 0) goto Lb
            boolean r0 = super.onKeyUp(r4, r5)
            return r0
        Lb:
            X.199m r0 = r3.getDynamicParentScene()
            if (r0 == 0) goto L36
            com.ss.android.ugc.aweme.SAFFragmentRootScene r2 = r0.LLJI
            if (r2 == 0) goto L36
        L15:
            boolean r0 = X.C12WG.LIZIZ(r2)
            if (r0 != 0) goto L51
            X.199x r1 = r2.mState
            X.199x r0 = X.EnumC214943199x.STARTED
            int r0 = r1.compareTo(r0)
            if (r0 < 0) goto L51
            boolean r0 = r2 instanceof X.C198H
            if (r0 == 0) goto L4c
            X.198H r2 = (X.C198H) r2
            java.lang.Boolean r0 = r2.onActivityKeyUp(r4, r5)
            if (r0 == 0) goto L47
            boolean r0 = r0.booleanValue()
            return r0
        L36:
            com.bytedance.scene.navigation.NavigationScene r0 = r3.getNavigationScene()
            if (r0 == 0) goto L42
            com.bytedance.scene.Scene r2 = r0.LLLLIIIILLL()
            if (r2 != 0) goto L15
        L42:
            boolean r0 = super.onKeyUp(r4, r5)
            return r0
        L47:
            boolean r0 = super.onKeyUp(r4, r5)
            return r0
        L4c:
            boolean r0 = super.onKeyUp(r4, r5)
            return r0
        L51:
            boolean r0 = super.onKeyUp(r4, r5)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C199Y.onKeyUp(int, android.view.KeyEvent):boolean");
    }

    private final Pair<NavigationScene, InterfaceC214923199d> initSceneEnvironment(Class<? extends SAFFragmentRootScene> cls, Bundle bundle, int i) {
        NavigationScene navigationScene;
        InterfaceC19394510uF interfaceC19394510uF;
        Scene scene;
        boolean z;
        boolean z2;
        final C013C c013c = new C013C();
        c013c.element = true;
        final C20688815xW c20688815xW = new C20688815xW(this);
        final SAFFragmentRootScene sAFFragmentRootScene = (SAFFragmentRootScene) c20688815xW.invoke();
        C199Y c199y = null;
        if (getEnableNavigation()) {
            C214936199q c214936199q = new C214936199q(bundle, cls);
            c214936199q.LIZJ = false;
            c214936199q.LIZLLL = false;
            c214936199q.LJFF = true;
            c214936199q.LJI = getAutoRecycleInvisibleScenesThreshold();
            c214936199q.LJ = 0;
            if (((Number) C256970A5f.LIZ.getValue()).intValue() == C256970A5f.LIZIZ) {
                c214936199q.LJIILLIIL = true;
            }
            c214936199q.LJII = true;
            c214936199q.LJIIIIZZ = true;
            c214936199q.LJIIJJI = true;
            c214936199q.LJIIL = true;
            if (getEnableNavigationSceneReuseActivityView()) {
                c214936199q.LJIILIIL = true;
            }
            C214928199i.LIZIZ = ((Boolean) C074N.LIZJ.getValue()).booleanValue();
            C214928199i.LIZJ = ((Boolean) C07AH.LIZIZ.getValue()).booleanValue();
            C214928199i.LIZLLL = ((Boolean) C07AK.LIZIZ.getValue()).booleanValue();
            if (((Number) C07FX.LIZ.getValue()).intValue() == C07FX.LIZIZ) {
                z = true;
            } else {
                z = false;
            }
            c214936199q.LJIILJJIL = z;
            if (((Number) C07FR.LIZ.getValue()).intValue() == C07FR.LIZIZ) {
                z2 = true;
            } else {
                z2 = false;
            }
            c214936199q.LJIILL = z2;
            if (getEnableUseNavigationSceneWindowFocusChangedDispatch()) {
                c214936199q.LJIIJ = true;
            }
            Bundle bundleLIZ = c214936199q.LIZ();
            bundleLIZ.setClassLoader(getClassLoader());
            navigationScene = new NavigationScene();
            if (((Boolean) C18049075b.LIZ.getValue()).booleanValue()) {
                getApplication();
                if (!C214933199n.LIZIZ) {
                    C214933199n.LIZIZ = true;
                    C214933199n.LIZ = new C20025513Wz(new C1561490qjj());
                }
                C20025513Wz c20025513Wz = C214933199n.LIZ;
                if (c20025513Wz != null) {
                    if (navigationScene.LLJJJJLIIL == null) {
                        navigationScene.LLJJJJLIIL = c20025513Wz;
                    } else {
                        throw new IllegalArgumentException("ReusePool has been setup");
                    }
                }
            }
            C21494919Ad.LIZIZ.LIZ = new C19C0() { // from class: X.13kl
                @Override // X.C19C0
                public final void LIZIZ(String str) {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("V");
                    sbLIZ.append(' ');
                    sbLIZ.append("Scene Framework");
                    sbLIZ.append(": ");
                    sbLIZ.append(str);
                    String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("SAFActivity ");
                    sbLIZ2.append(strLIZIZ);
                    System.out.println((Object) C2188811AlT.LIZIZ(sbLIZ2));
                    ALog.com_ss_android_agilelogger_ALog_com_ss_android_ugc_aweme_lancet_AlogLancet_alogE("SAFActivity", strLIZIZ);
                }
            };
            if (((Number) C256950A5d.LIZ.getValue()).intValue() == C256950A5d.LIZIZ && getConfigChangesAllowList() != 0) {
                navigationScene.LLL = getConfigChangesAllowList();
            }
            navigationScene.mArguments = bundleLIZ;
            String string = bundleLIZ.getString("extra_rootScene");
            if (string != null && string.length() != 0) {
                navigationScene.LLJIJIL = new InterfaceC214877197j() { // from class: X.15xX
                    @Override // X.InterfaceC214877197j
                    public final Scene LIZ(ClassLoader classLoader, String str, Bundle bundle2) {
                        C013C c013c2 = c013c;
                        if (c013c2.element) {
                            c013c2.element = false;
                            return sAFFragmentRootScene;
                        }
                        return c20688815xW.invoke();
                    }
                };
                if (getEnableNavigationSceneReuseActivityView()) {
                    navigationScene.LLJZ = false;
                }
                if (getAutoRecycleInvisibleScenesThreshold() > 0.0f || ((Boolean) C275350Aqj.LIZIZ.getValue()).booleanValue()) {
                    if (!navigationScene.LLJZIJLIL) {
                        navigationScene.LLJZIJLIL = true;
                    } else {
                        throw new IllegalStateException("setRestoreStateInLifecycle has already setup");
                    }
                }
                this.navigationScene = navigationScene;
                if (!onlyOnePageWhenNavigationOpen()) {
                    onSceneReady();
                    navigationScene.registerChildSceneLifecycleCallbacks(C2214291BlT.LIZ, false);
                }
            } else {
                throw new IllegalArgumentException("Create NavigationScene but there is no RootSceneClass in argument");
            }
        } else {
            navigationScene = null;
        }
        if (getEnableNavigation()) {
            interfaceC19394510uF = null;
        } else {
            interfaceC19394510uF = new InterfaceC19394510uF() { // from class: X.10uJ
                @Override // X.InterfaceC19394510uF
                public final <T extends View> T LIZ(int i2) {
                    T t = (T) this.LIZ.findViewById(i2);
                    if (t != null) {
                        return t;
                    }
                    try {
                        String resourceName = this.LIZ.getResources().getResourceName(i2);
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append(' ');
                        sbLIZ.append(resourceName);
                        sbLIZ.append(" view not found");
                        throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ));
                    } catch (Resources.NotFoundException e) {
                        TryCatchGuardChecker.doCheck(e);
                        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                        sbLIZ2.append(' ');
                        sbLIZ2.append(i2);
                        sbLIZ2.append(" view not found");
                        throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ2));
                    }
                }
            };
        }
        if (getEnableNavigation()) {
            c199y = this;
        }
        if (getEnableNavigation() && navigationScene != null) {
            scene = navigationScene;
        } else {
            C198H rootSAFSceneWrapper = getRootSAFSceneWrapper();
            if (rootSAFSceneWrapper == null || (scene = rootSAFSceneWrapper.getScene()) == null) {
                "Required value was null.".toString();
                throw new IllegalArgumentException("Required value was null.");
            }
        }
        return new Pair<>(navigationScene, new C19C2(i, interfaceC19394510uF, c199y, scene, new InterfaceC21498919Br() { // from class: X.199X
            @Override // X.InterfaceC21498919Br
            public final C214937199r IQ() {
                return new C214937199r(null, null, "saf_root_scene");
            }
        }, getStateSaveStrategy(), getCheckActivityLifecycle()));
    }

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.ActivityC21503719Dn, X.C19EG, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i, int i2, Intent intent) {
        Boolean boolValueOf;
        Scene sceneLLLLIIIILLL;
        EnumC214943199x enumC214943199x;
        if (!getEnableSAF()) {
            super.onActivityResult(i, i2, intent);
            return;
        }
        NavigationScene navigationScene = getNavigationScene();
        if (navigationScene != null && navigationScene.LLJZIJLIL && (sceneLLLLIIIILLL = navigationScene.LLLLIIIILLL()) != null) {
            EnumC214943199x enumC214943199x2 = sceneLLLLIIIILLL.mState;
            EnumC214943199x enumC214943199x3 = EnumC214943199x.NONE;
            if (enumC214943199x2 == enumC214943199x3 && (enumC214943199x = navigationScene.mState) != enumC214943199x3) {
                navigationScene.LLLJ(enumC214943199x);
            }
        }
        C198H c198hLIZLLL = C20629915o1.LIZLLL(this);
        if (c198hLIZLLL == null || (boolValueOf = Boolean.valueOf(c198hLIZLLL.onResult(i, i2, intent))) == null || !boolValueOf.booleanValue()) {
            super.onActivityResult(i, i2, intent);
        }
    }

    @Override // X.C19EG, androidx.activity.ComponentActivity, android.app.Activity
    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) throws Throwable {
        int iIntValue = i;
        int[] iArr2 = iArr;
        String[] strArr2 = strArr;
        C0WSU c0wsuLIZIZ = new C0WST().LIZIZ(11051, "com/bytedance/ies/foundation/saf/SAFTikTokActivity", "onRequestPermissionsResult", this, new Object[]{Integer.valueOf(iIntValue), strArr2, iArr2}, "void", new C0WZW(false, "(I[Ljava/lang/String;[I)V", new C0WZX("dzBzEgAjS8/YVFkiQFyNY/5Yo2Rd7j/xaP3wGqYFF+Blw/+NlbA6m+sjr1FR62AnW4g=", null)));
        if (c0wsuLIZIZ.LIZ) {
            return;
        }
        Object[] objArr = c0wsuLIZIZ.LIZJ;
        if (objArr != null) {
            Object obj = objArr[0];
            if (obj != null) {
                iIntValue = ((Integer) obj).intValue();
            }
            Object[] objArr2 = c0wsuLIZIZ.LIZJ;
            Object obj2 = objArr2[1];
            if (obj2 != null) {
                strArr2 = (String[]) obj2;
            }
            Object obj3 = objArr2[2];
            if (obj3 != null) {
                iArr2 = (int[]) obj3;
            }
        }
        InterfaceC214902198i interfaceC214902198iLIZJ = C20629915o1.LIZJ(this);
        if (interfaceC214902198iLIZJ != null) {
            interfaceC214902198iLIZJ.gv(iIntValue, strArr2, iArr2);
        }
        super.onRequestPermissionsResult(iIntValue, strArr2, iArr2);
    }

    public final void throwSAFLifecycleCheckException(String str, boolean z, boolean z2, String str2) {
        RuntimeException runtimeException = new RuntimeException("Don't call " + str + " directly in SingleActivity: " + getClass().getName() + ", use fragment's method" + str2 + ' ' + ((String) null));
        AbstractC1563340qmi abstractC1563340qmi = this.internalLifecycleRegistry;
        if (abstractC1563340qmi != null && abstractC1563340qmi.LJII()) {
            if (!z) {
                C1AF0.LJ(runtimeException);
                return;
            } else {
                if (z2) {
                    C1AF0.LJ(runtimeException);
                    return;
                }
                throw runtimeException;
            }
        }
        C1AF0.LJ(runtimeException);
    }

    public static /* synthetic */ Pair initSceneEnvironment$default(C199Y c199y, Class cls, Bundle bundle, int i, int i2, Object obj) {
        if (obj == null) {
            if ((i2 & 4) != 0) {
                i = R.id.tya;
            }
            return c199y.initSceneEnvironment(cls, bundle, i);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: initSceneEnvironment");
    }

    public static /* synthetic */ void throwSAFLifecycleCheckException$default(C199Y c199y, String str, boolean z, boolean z2, String str2, int i, Object obj) {
        if (obj == null) {
            if ((i & 2) != 0) {
                z = true;
            }
            if ((i & 4) != 0) {
                z2 = true;
            }
            if ((i & 8) != 0) {
                str2 = "";
            }
            c199y.throwSAFLifecycleCheckException(str, z, z2, str2);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: throwSAFLifecycleCheckException");
    }
}
