package X;

import Y.ARunnableS132S0100000_32;
import android.app.Activity;
import android.content.ComponentCallbacks2;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Build;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.Window;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LiveData;
import com.bytedance.scene.Scene;
import com.bytedance.scene.navigation.NavigationScene;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.adaptation.saa.SAAActivity;
import com.ss.android.ugc.aweme.base.HomePageViewPagerAbility;
import com.ss.android.ugc.aweme.image.ui.ImageEditRootScene;
import com.ss.android.ugc.aweme.scope.MainActivityScope;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS432S0200000_31;
import kotlin.jvm.internal.AwS573S0100000_29;
import kotlin.jvm.internal.AwS575S0100000_31;
import kotlin.jvm.internal.AwS576S0100000_32;
import kotlin.jvm.internal.Intrinsics;
import org.greenrobot.eventbus.EventBus;

/* JADX INFO: renamed from: X.194y, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public abstract class AbstractC214814194y extends AbstractC1447660nm8 implements C198H {
    public static final C214815194z Companion = new Object() { // from class: X.194z
    };
    public boolean LLJJIJI;
    public boolean isRecreate;
    public C0MWU config = new C0MWU();
    public String embeddedSceneId = "";
    public final C01GW LLJILLL = C452501pT.LIZIZ(new AwS575S0100000_31(this, 1475));
    public final C01GW LLJJ = C452501pT.LIZIZ(new AwS576S0100000_32(this, 669));
    public final C01GW LLJJI = C452501pT.LIZIZ(new AwS573S0100000_29(this, 961));
    public final C01GW LLJJIII = C452501pT.LIZIZ(new AwS573S0100000_29(this, 960));
    public final List<Fragment> fragmentList = new ArrayList();
    public final C19773012Xw LLJJIJIIJIL = new C19773012Xw(this, 1);

    public boolean LLLLIILL() {
        return this instanceof ImageEditRootScene;
    }

    public boolean LLLLILI() {
        return false;
    }

    public void dispatchTouchEvent(MotionEvent motionEvent) {
    }

    public int getFinishAnimationType() {
        return 1;
    }

    public int getRootViewPaddingTop(C20244914Jj c20244914Jj) {
        return 0;
    }

    @Override // X.C198H
    public Scene getScene() {
        return this;
    }

    public int getStartAnimationType() {
        return 1;
    }

    @InterfaceC1294060jmO
    public void onActivityResult(int i, int i2, Intent intent) {
    }

    public void onAttachedToWindow() {
    }

    @Override // X.C198H
    public boolean onBackPressed() {
        return false;
    }

    public void onConfigurationChanged(Configuration configuration) {
    }

    public void onEnterAnimationComplete() {
    }

    public boolean onInterceptActivityResult(int i, int i2, Intent intent) {
        return false;
    }

    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        return false;
    }

    public boolean onKeyLongPress(int i, KeyEvent keyEvent) {
        return false;
    }

    public boolean onKeyUp(int i, KeyEvent keyEvent) {
        return false;
    }

    @InterfaceC1294060jmO
    public void onNewIntent(Intent intent) {
    }

    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
    }

    public boolean processNewArguments(Bundle bundle) {
        return true;
    }

    public final void setResult() {
        setResult(0);
    }

    @Override // X.C198H
    public C19BM buildPopOptions() {
        return new C560320LyI().LIZ();
    }

    public final void finishLastScene() {
        C19EG c19eg;
        HomePageViewPagerAbility homePageViewPagerAbilityLIZIZ;
        Activity activity = this.mActivity;
        InterfaceC20597015ii interfaceC20597015iiLJ = C20622515mp.LJ(this);
        if (interfaceC20597015iiLJ != null) {
            interfaceC20597015iiLJ.ZN(new AwS432S0200000_31(this, interfaceC20597015iiLJ, 111));
            return;
        }
        if (!(activity instanceof C08B7)) {
            if (LLLLILI()) {
                if (activity != null) {
                    activity.finishAfterTransition();
                    return;
                }
                return;
            } else {
                if (activity != null) {
                    activity.finish();
                    return;
                }
                return;
            }
        }
        if (!(activity instanceof C19EG) || (c19eg = (C19EG) activity) == null) {
            return;
        }
        if (C296200BjG.LIZ()) {
            C0QSJ c0qsjLIZJ = C687700QyG.LIZJ(C1558360qeg.LJI(c19eg, null), MainActivityScope.class);
            Object ability = c0qsjLIZJ != null ? c0qsjLIZJ.getAbility(HomePageViewPagerAbility.class) : null;
            homePageViewPagerAbilityLIZIZ = (HomePageViewPagerAbility) (ability instanceof HomePageViewPagerAbility ? ability : null);
        } else {
            homePageViewPagerAbilityLIZIZ = C1256610inz.LIZIZ(c19eg);
        }
        if (homePageViewPagerAbilityLIZIZ != null) {
            homePageViewPagerAbilityLIZIZ.Ta0(false, Boolean.TRUE);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void finishSceneInternal() {
        AbstractC214793194d anonymousClass1951;
        Scene scene;
        C0MWS c0mws;
        Integer second;
        if (this.mActivity != null) {
            Pair<Integer, Integer> pairLIZIZ = C569770MWh.LIZIZ(getFinishAnimationType());
            C560320LyI c560320LyI = new C560320LyI();
            Integer first = pairLIZIZ.getFirst();
            if (first == null || first.intValue() != 0 || (second = pairLIZIZ.getSecond()) == null || second.intValue() != 0) {
                Integer first2 = pairLIZIZ.getFirst();
                Integer first3 = (first2 == null || first2.intValue() != 0) ? pairLIZIZ.getFirst() : Integer.valueOf(R.anim.bj);
                Integer second2 = pairLIZIZ.getSecond();
                anonymousClass1951 = new AnonymousClass1951(first3.intValue(), this.mActivity, ((second2 == null || second2.intValue() != 0) ? pairLIZIZ.getSecond() : Integer.valueOf(R.anim.bj)).intValue());
            } else {
                anonymousClass1951 = new C214798194i();
            }
            if (C293940Bfc.LIZ() || C289940BYa.LIZ() > 0.0f) {
                NavigationScene navigationSceneLIZ = C1447800nmM.LIZ(this);
                if (navigationSceneLIZ != null) {
                    scene = (Scene) C13LP.LJJJLZIJ((((ArrayList) r1).size() - 1) - 1, navigationSceneLIZ.getSceneList());
                } else {
                    scene = null;
                }
                anonymousClass1951.LJIIIIZZ(new ARunnableS132S0100000_32(scene, 73));
            }
            c560320LyI.LIZ = anonymousClass1951;
            NavigationScene navigationSceneLIZ2 = C1447800nmM.LIZ(this);
            if (navigationSceneLIZ2 != null) {
                navigationSceneLIZ2.LLLJL();
            }
            if (C20622515mp.LJ(this) != null && !this.LLJJIJI) {
                this.LLJJIJI = true;
                NavigationScene navigationSceneLIZ3 = C1447800nmM.LIZ(this);
                if (navigationSceneLIZ3 != null) {
                    navigationSceneLIZ3.LLLLLLZZ(this, new C0MFN(0, null));
                }
            }
            NavigationScene navigationSceneLIZ4 = C1447800nmM.LIZ(this);
            if (!Intrinsics.LJFF(navigationSceneLIZ4 != null ? navigationSceneLIZ4.LLLLIIIILLL() : null, this)) {
                NavigationScene navigationSceneLIZ5 = C1447800nmM.LIZ(this);
                if (navigationSceneLIZ5 != null) {
                    navigationSceneLIZ5.remove(this);
                    return;
                }
                return;
            }
            C0MWI c0mwiLJIJJ = C0CHQ.LIZ().LJIJJ();
            getScene();
            if (c0mwiLJIJJ.LIZLLL(this)) {
                c560320LyI.LIZIZ = true;
                if ((this instanceof C0MWS) && (c0mws = (C0MWS) this) != null) {
                    c0mws.LJLL(false);
                }
            }
            C0MWI c0mwiLJIJJ2 = C0CHQ.LIZ().LJIJJ();
            getScene();
            if (c0mwiLJIJJ2.LIZJ(this)) {
                c560320LyI.LIZIZ = true;
            }
            NavigationScene navigationSceneLIZ6 = C1447800nmM.LIZ(this);
            if (navigationSceneLIZ6 != null) {
                navigationSceneLIZ6.LLLLLLIL(c560320LyI.LIZ());
            }
        }
    }

    public final C19GS getAppCompatActivity() {
        return (C19GS) this.mActivity;
    }

    public final boolean getChangeTranslucentOnAnimEnd() {
        return this.config.LIZLLL;
    }

    public final C19EG getFragmentActivity() {
        Activity activity = this.mActivity;
        if (activity instanceof C19EG) {
            return (C19EG) activity;
        }
        return null;
    }

    public final boolean getHardwareAccelerated() {
        return this.config.LIZIZ;
    }

    public final C0MWK getLaunchMode() {
        return this.config.LIZ;
    }

    public final int getSoftInputMode() {
        return this.config.LJ;
    }

    public final Window getWindow() {
        Activity activity = this.mActivity;
        if (activity != null) {
            return activity.getWindow();
        }
        return null;
    }

    public final boolean isFinishing() {
        Activity activity = this.mActivity;
        if (activity == null) {
            return true;
        }
        return activity.isFinishing();
    }

    public final C19GS requireAppCompatActivity() {
        return (C19GS) this.LLJJIII.getValue();
    }

    public final Context requireContext() {
        return (Context) this.LLJJ.getValue();
    }

    public final C19EG requireFragmentActivity() {
        return (C19EG) this.LLJJI.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean LLLLIIIILLL() {
        ComponentCallbacks2 componentCallbacks2;
        InterfaceC569700MWa interfaceC569700MWa;
        if (!C294080Bfq.LIZ()) {
            componentCallbacks2 = this.mActivity;
            return componentCallbacks2 instanceof InterfaceC569700MWa ? false : false;
        }
        Scene scene = this;
        while (true) {
            if (scene == 0) {
                break;
            }
            if (scene instanceof InterfaceC569700MWa) {
                interfaceC569700MWa = (InterfaceC569700MWa) scene;
                if (interfaceC569700MWa == null) {
                    break;
                }
            } else {
                scene = scene.mParentScene;
            }
        }
        componentCallbacks2 = this.mActivity;
        if ((componentCallbacks2 instanceof InterfaceC569700MWa) || (interfaceC569700MWa = (InterfaceC569700MWa) componentCallbacks2) == null) {
        }
        interfaceC569700MWa.LJLJLLL();
        return true;
    }

    @Override // X.C198H
    public void finish() {
        NavigationScene navigationSceneLIZ = C1447800nmM.LIZ(this);
        if (navigationSceneLIZ != null) {
            C12WG.LIZJ(navigationSceneLIZ, new ARunnableS132S0100000_32(this, 72));
        }
    }

    public final Context getContext() {
        return getFragmentActivity();
    }

    public final boolean isLastScene() {
        List<Scene> sceneList;
        NavigationScene navigationSceneLIZ = C1447800nmM.LIZ(this);
        return (navigationSceneLIZ == null || (sceneList = navigationSceneLIZ.getSceneList()) == null || sceneList.size() != 1) ? false : true;
    }

    @Override // X.AbstractC1447660nm8, com.bytedance.scene.Scene
    public void onDestroyView() {
        super.onDestroyView();
        C201954140i c201954140i = C201954140i.LIZIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("TikTokSAARootGroupScene LifecycleLog: ");
        sbLIZ.append(this);
        sbLIZ.append(" onDestroyView");
        C201955140j.LJIILJJIL(c201954140i, C2188811AlT.LIZIZ(sbLIZ));
        EventBus eventBusLIZLLL = EventBus.LIZLLL();
        if (LLLLIILL() && eventBusLIZLLL.LJIIJ(this)) {
            eventBusLIZLLL.LJJI(this);
        }
        if (LLLLIIIILLL() && !this.fragmentList.isEmpty()) {
            FragmentManager fragmentManagerLJIILLIIL = C20622515mp.LJIILLIIL(this);
            if (!fragmentManagerLJIILLIIL.LJL()) {
                C19EH c19ehLJIIJ = fragmentManagerLJIILLIIL.LJIIJ();
                Iterator<Fragment> it2 = this.fragmentList.iterator();
                while (it2.hasNext()) {
                    c19ehLJIIJ.LJIIZILJ(it2.next());
                }
                c19ehLJIIJ.LJIIJ();
            }
        }
        C20622515mp.LJIILLIIL(this).LLIILZL(this.LLJJIJIIJIL);
    }

    @Override // com.bytedance.scene.Scene
    public void onPause() {
        super.onPause();
        C201954140i c201954140i = C201954140i.LIZIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("TikTokSAARootGroupScene LifecycleLog: ");
        sbLIZ.append(this);
        sbLIZ.append(" onPause");
        C201955140j.LJIILJJIL(c201954140i, C2188811AlT.LIZIZ(sbLIZ));
        LLLLIL(Lifecycle.State.STARTED);
    }

    @Override // com.bytedance.scene.Scene
    public void onResume() {
        super.onResume();
        C201954140i c201954140i = C201954140i.LIZIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("TikTokSAARootGroupScene LifecycleLog: ");
        sbLIZ.append(this);
        sbLIZ.append(" onResume");
        C201955140j.LJIILJJIL(c201954140i, C2188811AlT.LIZIZ(sbLIZ));
        LLLLIL(Lifecycle.State.RESUMED);
    }

    @Override // com.bytedance.scene.Scene
    public void onStart() {
        super.onStart();
        C201954140i c201954140i = C201954140i.LIZIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("TikTokSAARootGroupScene LifecycleLog: ");
        sbLIZ.append(this);
        sbLIZ.append(" onStart");
        C201955140j.LJIILJJIL(c201954140i, C2188811AlT.LIZIZ(sbLIZ));
        LLLLIL(Lifecycle.State.STARTED);
    }

    @Override // com.bytedance.scene.Scene
    public void onStop() {
        super.onStop();
        C201954140i c201954140i = C201954140i.LIZIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("TikTokSAARootGroupScene LifecycleLog: ");
        sbLIZ.append(this);
        sbLIZ.append(" onStop");
        C201955140j.LJIILJJIL(c201954140i, C2188811AlT.LIZIZ(sbLIZ));
    }

    public final String getEmbeddedId$tools_camera_base_release() {
        return this.embeddedSceneId;
    }

    public final boolean isRecreate() {
        return this.isRecreate;
    }

    public final void LLLLIL(Lifecycle.State state) {
        if (!LLLLIIIILLL() || this.fragmentList.isEmpty()) {
            return;
        }
        C19EH c19ehLJIIJ = C20622515mp.LJIILLIIL(this).LJIIJ();
        Iterator<Fragment> it2 = this.fragmentList.iterator();
        while (it2.hasNext()) {
            c19ehLJIIJ.LJIL(it2.next(), state);
        }
        try {
            c19ehLJIIJ.LJIIL();
        } catch (IllegalArgumentException e) {
            TryCatchGuardChecker.doCheck(e);
            C201955140j.LJIIJ(C201954140i.LIZIZ, "moveFragmentsLifecycleState", e);
        }
    }

    public final void LLLLJ(Function1<? super C0MWU, Unit> function1) {
        if (this.mView == null) {
            function1.invoke(this.config);
            setTheme(this.config.LIZJ);
            return;
        }
        throw new IllegalStateException("please invoke saaConfig before view created");
    }

    public int getRootViewPaddingBottom(C20244914Jj c20244914Jj) {
        return c20244914Jj.LIZLLL;
    }

    public boolean needAutoAdaptEdgeToEdge(View view) {
        if ((this instanceof C0MGE) && !view.getFitsSystemWindows()) {
            return true;
        }
        return false;
    }

    @Override // com.bytedance.scene.Scene
    public void onActivityCreated(Bundle bundle) {
        NavigationScene navigationSceneLIZ;
        View view;
        super.onActivityCreated(bundle);
        C201954140i c201954140i = C201954140i.LIZIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("TikTokSAARootGroupScene LifecycleLog: ");
        sbLIZ.append(this);
        sbLIZ.append(" onActivityCreated");
        C201955140j.LJIILJJIL(c201954140i, C2188811AlT.LIZIZ(sbLIZ));
        if (!getHardwareAccelerated() && (view = this.mView) != null) {
            view.setLayerType(1, null);
        }
        if (this.mActivity instanceof SAAActivity) {
            C569770MWh.LIZLLL(getStartAnimationType(), requireAppCompatActivity());
        }
        EventBus eventBusLIZLLL = EventBus.LIZLLL();
        if (LLLLIILL() && !eventBusLIZLLL.LJIIJ(this)) {
            eventBusLIZLLL.LJIJJ(this);
        }
        C20622515mp.LJIILLIIL(this).LJZL(this.LLJJIJIIJIL, false);
        if (LLLLIIIILLL() && (navigationSceneLIZ = C1447800nmM.LIZ(this)) != null) {
            navigationSceneLIZ.LLLIILIL(this, new C21524919Lr(this, 2));
        }
        C21378718lV.LIZ.getValue();
        Window window = getWindow();
        if (window != null) {
            window.clearFlags(1024);
        }
    }

    @Override // X.C19A3, com.bytedance.scene.Scene
    public void onCreate(Bundle bundle) {
        boolean z;
        String string;
        InterfaceC214897198d interfaceC214897198d;
        AnonymousClass1950 anonymousClass1950ProvideSAFActivityCallBack;
        super.onCreate(bundle);
        if (bundle != null) {
            z = true;
        } else {
            z = false;
        }
        this.isRecreate = z;
        if (bundle == null || (string = bundle.getString("TikTokSAARootGroupScene.embedded_scene_id")) == null) {
            string = UUID.randomUUID().toString();
        }
        this.embeddedSceneId = string;
        ComponentCallbacks2 componentCallbacks2 = this.mActivity;
        if ((componentCallbacks2 instanceof InterfaceC214897198d) && (interfaceC214897198d = (InterfaceC214897198d) componentCallbacks2) != null && (anonymousClass1950ProvideSAFActivityCallBack = interfaceC214897198d.provideSAFActivityCallBack()) != null) {
            anonymousClass1950ProvideSAFActivityCallBack.LIZ();
        }
        registerChildSceneLifecycleCallbacks(new C0Y8U() { // from class: X.0oDI
            @Override // X.C0Y8U, X.C19AH
            public final void LJJJJZ(Scene scene, Bundle bundle2) {
                if (scene.mThemeResource == 0) {
                    scene.setTheme(this.LIZ.mThemeResource);
                }
            }
        }, true);
    }

    @Override // X.C19A3, com.bytedance.scene.Scene
    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        C786410Ut5.LJJJI("TikTokSAARootGroupScene.embedded_scene_id", this.embeddedSceneId, bundle);
    }

    public final void processConfigurationChanged$tools_camera_base_release(Configuration configuration) {
        ((LiveData) this.LLJILLL.getValue()).setValue(configuration);
    }

    public final void setResult(int i) {
        setResult(i, null);
    }

    @Override // X.C198H
    public final Boolean onActivityKeyDown(int i, KeyEvent keyEvent) {
        if (!onKeyDown(i, keyEvent)) {
            return null;
        }
        return Boolean.TRUE;
    }

    @Override // X.C198H
    public final Boolean onActivityKeyLongPress(int i, KeyEvent keyEvent) {
        if (keyEvent == null || !onKeyLongPress(i, keyEvent)) {
            return null;
        }
        return Boolean.TRUE;
    }

    @Override // X.C198H
    public final Boolean onActivityKeyUp(int i, KeyEvent keyEvent) {
        if (keyEvent == null || !onKeyUp(i, keyEvent)) {
            return null;
        }
        return Boolean.TRUE;
    }

    @Override // com.bytedance.scene.Scene
    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        if (needAutoAdaptEdgeToEdge(view) && Build.VERSION.SDK_INT >= 35) {
            C14K9.LJIJJ(view, new C1864920yd8(this, 1));
        }
    }

    @Override // X.C198H
    public void setResult(int i, Intent intent) {
        this.LLJJIJI = true;
        if (isLastScene()) {
            Activity activity = this.mActivity;
            if (activity != null) {
                C2204961BRm.LJIIL(i, activity, intent, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KOusYo/a3Sb5FC8TwV9U+4let+QZYnItDXQrzosJ2w5NBK4=", null));
                return;
            }
            return;
        }
        NavigationScene navigationSceneLIZ = C1447800nmM.LIZ(this);
        if (navigationSceneLIZ == null) {
            return;
        }
        navigationSceneLIZ.LLLLLLZZ(this, new C0MFN(i, intent));
    }

    @Override // X.C198H
    public boolean onResult(int i, int i2, Intent intent) {
        boolean zOnInterceptActivityResult = onInterceptActivityResult(i, i2, intent);
        if (!zOnInterceptActivityResult) {
            onActivityResult(i, i2, intent);
        }
        return zOnInterceptActivityResult;
    }
}
