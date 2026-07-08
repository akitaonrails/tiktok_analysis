package X;

import android.app.Activity;
import android.content.ComponentCallbacks2;
import android.content.Context;
import android.view.View;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.scene.Scene;
import com.bytedance.scene.navigation.NavigationScene;
import com.ss.android.ugc.aweme.adaptation.saa.CreativeToolContainerScene;
import com.ss.android.ugc.aweme.adaptation.saa.SAAActivity;
import com.ss.android.ugc.aweme.adaptation.saa.SAASceneWrapperActivity;

/* JADX INFO: renamed from: X.15mp, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public final class C20622515mp {
    public static final boolean LJII() {
        if (C294080Bfq.LIZ() && !C0CHQ.LIZ().getAccountService().LIZ()) {
            return C294090Bfr.LIZ();
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final InterfaceC20597015ii LIZJ(Activity activity) {
        C128Y c128yLLLLIIIILLL;
        InterfaceC20622815ms interfaceC20622815ms;
        NavigationScene navigationScene;
        if (C294080Bfq.LIZ()) {
            if (activity instanceof SAASceneWrapperActivity) {
                c128yLLLLIIIILLL = ((SAASceneWrapperActivity) activity).LLLLZI();
            } else if ((activity instanceof InterfaceC214897198d) && (interfaceC20622815ms = (InterfaceC20622815ms) activity) != null && (navigationScene = interfaceC20622815ms.getNavigationScene()) != null) {
                c128yLLLLIIIILLL = navigationScene.LLLLIIIILLL();
            } else {
                c128yLLLLIIIILLL = null;
            }
            if (c128yLLLLIIIILLL instanceof CreativeToolContainerScene) {
                return (InterfaceC20597015ii) c128yLLLLIIIILLL;
            }
        }
        if (!(activity instanceof SAAActivity)) {
            return null;
        }
        return (InterfaceC20597015ii) activity;
    }

    public static final InterfaceC20597015ii LIZLLL(View view) {
        ComponentCallbacks2 componentCallbacks2LIZ;
        Scene sceneLIZ;
        InterfaceC20597015ii interfaceC20597015iiLJIIIIZZ;
        if (C294080Bfq.LIZ() && (sceneLIZ = C0EBE.LIZ(view)) != null && (interfaceC20597015iiLJIIIIZZ = LJIIIIZZ(sceneLIZ)) != null) {
            return interfaceC20597015iiLJIIIIZZ;
        }
        Context context = view.getContext();
        if (context != null) {
            componentCallbacks2LIZ = C1388190mED.LIZ(context);
        } else {
            componentCallbacks2LIZ = null;
        }
        if (!(componentCallbacks2LIZ instanceof SAAActivity)) {
            return null;
        }
        return (InterfaceC20597015ii) componentCallbacks2LIZ;
    }

    public static final InterfaceC20597015ii LJ(Scene scene) {
        InterfaceC20597015ii interfaceC20597015iiLJIIIIZZ;
        if (C294080Bfq.LIZ() && (interfaceC20597015iiLJIIIIZZ = LJIIIIZZ(scene)) != null) {
            return interfaceC20597015iiLJIIIIZZ;
        }
        ComponentCallbacks2 componentCallbacks2 = scene.mActivity;
        if (componentCallbacks2 instanceof SAAActivity) {
            return (InterfaceC20597015ii) componentCallbacks2;
        }
        return null;
    }

    public static final boolean LJFF(Activity activity) {
        if (LJIILJJIL(activity) && C15Q1.LIZ().enableExitAnim) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final InterfaceC20597015ii LJIIIIZZ(Scene scene) {
        for (Scene scene2 = scene; scene2 != 0; scene2 = scene2.mParentScene) {
            if (scene2 instanceof InterfaceC20597015ii) {
                return (InterfaceC20597015ii) scene2;
            }
        }
        return null;
    }

    public static final void LJIIIZ(Activity activity) {
        if (C294080Bfq.LIZ()) {
            InterfaceC20597015ii interfaceC20597015iiLIZJ = LIZJ(activity);
            if (interfaceC20597015iiLIZJ != null) {
                interfaceC20597015iiLIZJ.finish();
                return;
            } else {
                activity.finish();
                return;
            }
        }
        activity.finish();
    }

    public static final FragmentManager LJIIJ(View view) {
        Activity activityLIZ;
        C19EG c19egLIZIZ;
        Activity activityLIZ2;
        C19EG c19egLIZIZ2;
        InterfaceC20597015ii interfaceC20597015iiLJIIIIZZ;
        FragmentManager supportFragmentManager;
        if (C294080Bfq.LIZ()) {
            Scene sceneLIZ = C0EBE.LIZ(view);
            if (sceneLIZ != null && (interfaceC20597015iiLJIIIIZZ = LJIIIIZZ(sceneLIZ)) != null && (supportFragmentManager = interfaceC20597015iiLJIIIIZZ.getSupportFragmentManager()) != null) {
                return supportFragmentManager;
            }
            Context context = view.getContext();
            if (context != null && (activityLIZ2 = C1388190mED.LIZ(context)) != null && (c19egLIZIZ2 = C1388190mED.LIZIZ(activityLIZ2)) != null) {
                return c19egLIZIZ2.getSupportFragmentManager();
            }
        } else {
            Context context2 = view.getContext();
            if (context2 != null && (activityLIZ = C1388190mED.LIZ(context2)) != null && (c19egLIZIZ = C1388190mED.LIZIZ(activityLIZ)) != null) {
                return c19egLIZIZ.getSupportFragmentManager();
            }
        }
        return null;
    }

    public static final FragmentManager LJIIL(Scene scene) {
        C19EG c19egLIZIZ;
        C19EG c19egLIZIZ2;
        FragmentManager supportFragmentManager;
        if (C294080Bfq.LIZ()) {
            InterfaceC20597015ii interfaceC20597015iiLJIIIIZZ = LJIIIIZZ(scene);
            if (interfaceC20597015iiLJIIIIZZ != null && (supportFragmentManager = interfaceC20597015iiLJIIIIZZ.getSupportFragmentManager()) != null) {
                return supportFragmentManager;
            }
            Activity activity = scene.mActivity;
            if (activity != null && (c19egLIZIZ2 = C1388190mED.LIZIZ(activity)) != null) {
                return c19egLIZIZ2.getSupportFragmentManager();
            }
        } else {
            Activity activity2 = scene.mActivity;
            if (activity2 != null && (c19egLIZIZ = C1388190mED.LIZIZ(activity2)) != null) {
                return c19egLIZIZ.getSupportFragmentManager();
            }
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final boolean LJIILIIL(Activity activity) {
        Scene sceneLLLLIIIILLL;
        InterfaceC20622815ms interfaceC20622815ms;
        NavigationScene navigationScene;
        if (C294080Bfq.LIZ()) {
            if (activity instanceof SAASceneWrapperActivity) {
                sceneLLLLIIIILLL = ((SAASceneWrapperActivity) activity).LLLLZI();
            } else {
                sceneLLLLIIIILLL = null;
                if ((activity instanceof InterfaceC214897198d) && (interfaceC20622815ms = (InterfaceC20622815ms) activity) != null && (navigationScene = interfaceC20622815ms.getNavigationScene()) != null) {
                    sceneLLLLIIIILLL = navigationScene.LLLLIIIILLL();
                }
            }
            if (sceneLLLLIIIILLL instanceof CreativeToolContainerScene) {
                CreativeToolContainerScene creativeToolContainerScene = (CreativeToolContainerScene) sceneLLLLIIIILLL;
                if (creativeToolContainerScene.mViewDestroyed || creativeToolContainerScene.LLLFZ) {
                    return true;
                }
                return false;
            }
        }
        if (activity == 0) {
            return true;
        }
        return activity.isFinishing();
    }

    public static final boolean LJIILJJIL(Activity activity) {
        if (!LJII() || (activity instanceof SAASceneWrapperActivity) || (activity instanceof SAAActivity) || LIZJ(activity) == null) {
            return false;
        }
        return true;
    }

    public static final FragmentManager LJIILLIIL(Scene scene) {
        FragmentManager supportFragmentManager;
        if (C294080Bfq.LIZ()) {
            InterfaceC20597015ii interfaceC20597015iiLJIIIIZZ = LJIIIIZZ(scene);
            if (interfaceC20597015iiLJIIIIZZ == null || (supportFragmentManager = interfaceC20597015iiLJIIIIZZ.getSupportFragmentManager()) == null) {
                return ((C19EG) scene.requireActivity()).getSupportFragmentManager();
            }
            return supportFragmentManager;
        }
        return ((C19EG) scene.requireActivity()).getSupportFragmentManager();
    }

    public static final LifecycleOwner LJIJ(C19EG c19eg) {
        InterfaceC20597015ii interfaceC20597015iiLIZJ;
        C198H c198hLC;
        Scene scene;
        if (C294080Bfq.LIZ() && (interfaceC20597015iiLIZJ = LIZJ(c19eg)) != null && (c198hLC = interfaceC20597015iiLIZJ.LC()) != null && (scene = c198hLC.getScene()) != null) {
            return scene;
        }
        return c19eg;
    }

    public static final void LIZ(Activity activity, int i) {
        if (!LJFF(activity)) {
            C786410Ut5.ae(0, activity, i);
            return;
        }
        Object objLIZJ = LIZJ(activity);
        if (objLIZJ instanceof CreativeToolContainerScene) {
            AnonymousClass1954 anonymousClass1954 = new AnonymousClass1954(activity, 0, 0, i, 0);
            Scene scene = (Scene) objLIZJ;
            NavigationScene navigationSceneLIZ = C1447800nmM.LIZ(scene);
            if (navigationSceneLIZ != null) {
                navigationSceneLIZ.LLLLLJLJLL(scene, anonymousClass1954);
                return;
            }
            return;
        }
        C786410Ut5.ae(0, activity, i);
    }

    public static final FragmentManager LJIIJJI(C19EG c19eg, Scene scene) {
        FragmentManager fragmentManagerLJIIL;
        if (C294080Bfq.LIZ()) {
            if (scene != null && (fragmentManagerLJIIL = LJIIL(scene)) != null) {
                return fragmentManagerLJIIL;
            }
            if (c19eg != null) {
                return c19eg.getSupportFragmentManager();
            }
        } else if (c19eg != null) {
            return c19eg.getSupportFragmentManager();
        }
        return null;
    }

    public static final FragmentManager LJIILL(C19EG c19eg, Scene scene) {
        FragmentManager fragmentManagerLJIIJJI = LJIIJJI(c19eg, scene);
        if (fragmentManagerLJIIJJI != null) {
            return fragmentManagerLJIIJJI;
        }
        "Required value was null.".toString();
        throw new IllegalArgumentException("Required value was null.");
    }

    public static final Context LJIIZILJ(InterfaceC20597015ii interfaceC20597015ii, Activity activity) {
        C198H c198hLC;
        Scene scene;
        Context sceneContext;
        if (C294080Bfq.LIZ() && (c198hLC = interfaceC20597015ii.LC()) != null && (scene = c198hLC.getScene()) != null && (sceneContext = scene.getSceneContext()) != null) {
            return sceneContext;
        }
        return activity;
    }

    public static final void LIZIZ(int i, Activity activity, int i2) {
        if (!LJIILJJIL(activity)) {
            C786410Ut5.ae(i, activity, i2);
        } else {
            if (LIZJ(activity) instanceof CreativeToolContainerScene) {
                return;
            }
            C786410Ut5.ae(i, activity, i2);
        }
    }
}
