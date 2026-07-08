package X;

import android.content.ComponentCallbacks2;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.bytedance.scene.Scene;
import com.ss.android.ugc.aweme.SAFFragmentRootScene;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.199m, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public class C214932199m extends Scene implements C19BK {
    public static final /* synthetic */ int LLJILLL = 0;
    public SAFFragmentRootScene LLJI;
    public Bundle LLJIJIL;
    public final List<Function1<SAFFragmentRootScene, Unit>> LLJILJIL = new CopyOnWriteArrayList();
    public final List<Function1<SAFFragmentRootScene, Unit>> LLJILJILJ = new CopyOnWriteArrayList();

    static {
        new AnonymousClass1998();
    }

    @Override // X.C19BK
    public final void disableSupportRestore() {
    }

    @Override // X.C19BK
    public final String getSceneDebugInfo(Scene scene) {
        return "";
    }

    @Override // X.C19BK
    public final boolean isSupportChildReplaceParentScene() {
        return true;
    }

    @Override // X.C19BK
    public final boolean isSupportRestore() {
        return true;
    }

    public final boolean LLLIIIIL() {
        Bundle bundle = this.mArguments;
        if (bundle != null) {
            return bundle.getBoolean("enable_scene_restore", false);
        }
        return false;
    }

    @Override // com.bytedance.scene.Scene
    public final void dispatchDestroy() {
        SAFFragmentRootScene sAFFragmentRootScene = this.LLJI;
        if (sAFFragmentRootScene != null) {
            LLLIILIL(this, this, sAFFragmentRootScene, EnumC214943199x.NONE);
        }
        super.dispatchDestroy();
        this.LLJI = null;
    }

    @Override // com.bytedance.scene.Scene
    public final void dispatchDestroyView() {
        SAFFragmentRootScene sAFFragmentRootScene = this.LLJI;
        if (sAFFragmentRootScene != null) {
            LLLIILIL(this, this, sAFFragmentRootScene, EnumC214943199x.CREATED);
        }
        super.dispatchDestroyView();
    }

    @Override // com.bytedance.scene.Scene
    public final void dispatchPause() {
        SAFFragmentRootScene sAFFragmentRootScene = this.LLJI;
        if (sAFFragmentRootScene != null) {
            LLLIILIL(this, this, sAFFragmentRootScene, EnumC214943199x.STARTED);
        }
        super.dispatchPause();
    }

    @Override // com.bytedance.scene.Scene
    public final void dispatchStop() {
        SAFFragmentRootScene sAFFragmentRootScene = this.LLJI;
        if (sAFFragmentRootScene != null) {
            LLLIILIL(this, this, sAFFragmentRootScene, EnumC214943199x.ACTIVITY_CREATED);
        }
        super.dispatchStop();
    }

    @Override // X.C19BK
    public final List<Scene> getSceneList() {
        SAFFragmentRootScene sAFFragmentRootScene = this.LLJI;
        return sAFFragmentRootScene == null ? new ArrayList(C13BV.INSTANCE) : C1697810uHb.LJ(sAFFragmentRootScene);
    }

    @Override // com.bytedance.scene.Scene
    public final void dispatchResume() {
        super.dispatchResume();
        SAFFragmentRootScene sAFFragmentRootScene = this.LLJI;
        if (sAFFragmentRootScene != null) {
            LLLIILIL(this, this, sAFFragmentRootScene, EnumC214943199x.RESUMED);
        }
    }

    @Override // com.bytedance.scene.Scene
    public final void dispatchStart() {
        super.dispatchStart();
        SAFFragmentRootScene sAFFragmentRootScene = this.LLJI;
        if (sAFFragmentRootScene != null) {
            LLLIILIL(this, this, sAFFragmentRootScene, EnumC214943199x.STARTED);
        }
    }

    public void LLLII(SAFFragmentRootScene sAFFragmentRootScene) {
        if (this.LLJI == null) {
            this.LLJI = sAFFragmentRootScene;
            sAFFragmentRootScene.replaceParentScene(this);
            C19BL.LJFF(sAFFragmentRootScene.mView);
            LLLIL(this, sAFFragmentRootScene, this.mState, null);
            if (sAFFragmentRootScene.mView.getParent() == null) {
                ((ViewGroup) requireView()).addView(sAFFragmentRootScene.mView);
                return;
            }
            return;
        }
        throw new IllegalStateException("Please invoke detachChildScene firstly");
    }

    @Override // com.bytedance.scene.Scene
    public final void dispatchActivityCreated(Bundle bundle) {
        super.dispatchActivityCreated(bundle);
        SAFFragmentRootScene sAFFragmentRootScene = this.LLJI;
        if (sAFFragmentRootScene != null) {
            LLLIL(this, sAFFragmentRootScene, EnumC214943199x.ACTIVITY_CREATED, null);
        }
    }

    @Override // com.bytedance.scene.Scene
    public final void dispatchCreate(Bundle bundle) {
        InterfaceC214897198d interfaceC214897198d;
        super.dispatchCreate(bundle);
        if (bundle != null && LLLIIIIL()) {
            this.LLJIJIL = bundle.getBundle("child_scene_saved_state");
        }
        Bundle bundle2 = this.mArguments;
        if (bundle2 != null) {
            String string = bundle2.getString("child_scene_class_name");
            Bundle bundle3 = bundle2.getBundle("child_scene_class_arguments");
            if (string != null && string.length() != 0) {
                if (bundle != null || bundle2.getBoolean("child_scene_class_should_create", false)) {
                    this.LLJI = (SAFFragmentRootScene) C2350509Ix.LIZ(bundle3, Class.forName(string));
                    for (Function1 function1 : (CopyOnWriteArrayList) this.LLJILJIL) {
                        SAFFragmentRootScene sAFFragmentRootScene = this.LLJI;
                        if (sAFFragmentRootScene != null) {
                            function1.invoke(sAFFragmentRootScene);
                        } else {
                            "Required value was null.".toString();
                            throw new IllegalArgumentException("Required value was null.");
                        }
                    }
                    if (((Boolean) C1107604Uw.LIZ.getValue()).booleanValue() && !(this instanceof C214901198h) && bundle != null) {
                        ComponentCallbacks2 componentCallbacks2 = this.mActivity;
                        if ((componentCallbacks2 instanceof InterfaceC214897198d) && (interfaceC214897198d = (InterfaceC214897198d) componentCallbacks2) != null) {
                            interfaceC214897198d.setDynamicParentScene(this);
                        }
                    }
                }
                SAFFragmentRootScene sAFFragmentRootScene2 = this.LLJI;
                if (sAFFragmentRootScene2 != null) {
                    LLLIILIL(this, this, sAFFragmentRootScene2, EnumC214943199x.CREATED);
                }
                if (((Boolean) C276640Aso.LIZ.getValue()).booleanValue() && C07RK.LIZ()) {
                    for (Function1 function12 : (CopyOnWriteArrayList) this.LLJILJILJ) {
                        SAFFragmentRootScene sAFFragmentRootScene3 = this.LLJI;
                        if (sAFFragmentRootScene3 != null) {
                            function12.invoke(sAFFragmentRootScene3);
                        } else {
                            "Required value was null.".toString();
                            throw new IllegalArgumentException("Required value was null.");
                        }
                    }
                    return;
                }
                return;
            }
            throw new IllegalStateException("crash");
        }
        throw new IllegalStateException("crash");
    }

    @Override // com.bytedance.scene.Scene
    public final void onSaveInstanceState(Bundle bundle) {
        Integer numValueOf;
        SAFFragmentRootScene sAFFragmentRootScene;
        EnumC214943199x enumC214943199x;
        super.onSaveInstanceState(bundle);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("[DynamicScene] onSaveInstanceState. state:");
        SAFFragmentRootScene sAFFragmentRootScene2 = this.LLJI;
        if (sAFFragmentRootScene2 != null && (enumC214943199x = sAFFragmentRootScene2.mState) != null) {
            numValueOf = Integer.valueOf(enumC214943199x.value);
        } else {
            numValueOf = null;
        }
        sbLIZ.append(numValueOf);
        C2188811AlT.LIZIZ(sbLIZ);
        if (LLLIIIIL() && (sAFFragmentRootScene = this.LLJI) != null && sAFFragmentRootScene.mState.value >= EnumC214943199x.ACTIVITY_CREATED.value && sAFFragmentRootScene.mSceneRestoreEnabled) {
            Bundle bundle2 = new Bundle();
            sAFFragmentRootScene.dispatchSaveInstanceState(bundle2);
            C786410Ut5.LJJIIZI(bundle, bundle2, "child_scene_saved_state");
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("[DynamicScene] childBundle:");
            sbLIZ2.append(bundle2);
            C2188811AlT.LIZIZ(sbLIZ2);
        }
    }

    @Override // com.bytedance.scene.Scene
    public void dispatchCreateView(Bundle bundle, ViewGroup viewGroup) {
        super.dispatchCreateView(bundle, viewGroup);
        SAFFragmentRootScene sAFFragmentRootScene = this.LLJI;
        if (sAFFragmentRootScene != null) {
            LLLIILIL(this, this, sAFFragmentRootScene, EnumC214943199x.VIEW_CREATED);
        }
    }

    @Override // com.bytedance.scene.Scene
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        if (!LLLIIIIL()) {
            disableSceneRestore();
        }
        FrameLayout frameLayout = new FrameLayout(requireSceneContext());
        frameLayout.setBackgroundColor(0);
        return frameLayout;
    }

    public static void LLLIILIL(C214932199m c214932199m, C214932199m c214932199m2, Scene scene, EnumC214943199x enumC214943199x) {
        c214932199m.LLLIL(c214932199m2, scene, enumC214943199x, null);
    }

    public final void LLLIL(C214932199m c214932199m, Scene scene, EnumC214943199x enumC214943199x, Runnable runnable) {
        EnumC214943199x enumC214943199x2 = scene.mState;
        if (enumC214943199x2 == enumC214943199x) {
            if (runnable != null) {
                runnable.run();
                return;
            }
            return;
        }
        if (enumC214943199x2.value < enumC214943199x.value) {
            int i = C214935199p.LIZ[enumC214943199x2.ordinal()];
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        if (i != 4) {
                            if (i == 5) {
                                scene.dispatchResume();
                                LLLIL(c214932199m, scene, enumC214943199x, runnable);
                                return;
                            } else {
                                StringBuilder sbLIZ = C2188811AlT.LIZ();
                                sbLIZ.append("unreachable state case ");
                                sbLIZ.append(enumC214943199x2.getName());
                                throw new C214826195k(C2188811AlT.LIZIZ(sbLIZ));
                            }
                        }
                        scene.dispatchStart();
                        LLLIL(c214932199m, scene, enumC214943199x, runnable);
                        return;
                    }
                    scene.dispatchActivityCreated(this.LLJIJIL);
                    this.LLJIJIL = null;
                    LLLIL(c214932199m, scene, enumC214943199x, runnable);
                    return;
                }
                ViewGroup viewGroup = (ViewGroup) c214932199m.requireView();
                scene.dispatchCreateView(this.LLJIJIL, viewGroup);
                viewGroup.addView(scene.mView);
                LLLIL(c214932199m, scene, enumC214943199x, runnable);
                return;
            }
            scene.dispatchAttachActivity(c214932199m.requireActivity());
            scene.dispatchAttachScene(c214932199m);
            scene.dispatchCreate(this.LLJIJIL);
            LLLIL(c214932199m, scene, enumC214943199x, runnable);
            return;
        }
        int i2 = C214935199p.LIZ[enumC214943199x2.ordinal()];
        if (i2 != 2) {
            if (i2 != 3) {
                if (i2 != 4) {
                    if (i2 != 5) {
                        if (i2 == 6) {
                            scene.dispatchPause();
                            LLLIL(c214932199m, scene, enumC214943199x, runnable);
                            return;
                        } else {
                            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                            sbLIZ2.append("unreachable state case ");
                            sbLIZ2.append(enumC214943199x2.getName());
                            throw new C214826195k(C2188811AlT.LIZIZ(sbLIZ2));
                        }
                    }
                    scene.dispatchStop();
                    LLLIL(c214932199m, scene, enumC214943199x, runnable);
                    return;
                }
                if (enumC214943199x != EnumC214943199x.VIEW_CREATED) {
                    scene.dispatchDestroyView();
                    LLLIL(c214932199m, scene, enumC214943199x, runnable);
                    return;
                } else {
                    "cant switch state ACTIVITY_CREATED to VIEW_CREATED".toString();
                    throw new IllegalArgumentException("cant switch state ACTIVITY_CREATED to VIEW_CREATED");
                }
            }
            scene.dispatchDestroyView();
            LLLIL(c214932199m, scene, enumC214943199x, runnable);
            return;
        }
        scene.dispatchDestroy();
        scene.dispatchDetachScene();
        scene.dispatchDetachActivity();
        LLLIL(c214932199m, scene, enumC214943199x, runnable);
    }
}
