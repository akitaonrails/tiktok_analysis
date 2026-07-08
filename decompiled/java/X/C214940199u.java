package X;

import android.content.res.Configuration;
import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;
import com.bytedance.scene.Scene;
import com.bytedance.scene.navigation.NavigationScene;
import com.bytedance.scene.navigation.Record;
import java.util.WeakHashMap;

/* JADX INFO: renamed from: X.199u, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public final class C214940199u {
    /* JADX WARN: Multi-variable type inference failed */
    public static void LIZ(NavigationScene navigationScene, Scene scene, EnumC214943199x enumC214943199x, Bundle bundle, boolean z, C21497919Bh c21497919Bh, Runnable runnable) {
        InterfaceC214941199v<Scene, Void> interfaceC214941199v;
        EnumC214943199x enumC214943199x2 = scene.mState;
        if (enumC214943199x2 == enumC214943199x) {
            if (runnable != null) {
                runnable.run();
                return;
            }
            return;
        }
        boolean z2 = false;
        if (enumC214943199x2.value < enumC214943199x.value) {
            int i = C214939199t.LIZ[enumC214943199x2.ordinal()];
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        if (i != 4) {
                            if (i == 5) {
                                scene.dispatchResume();
                                C19A6 c19a6 = navigationScene.LLJILJILJ;
                                if (c19a6.LIZ.LLJILJIL.LJIIJ && (scene instanceof AnonymousClass1995) && scene.mState == EnumC214943199x.RESUMED) {
                                    if (!scene.requireActivity().hasWindowFocus()) {
                                        c19a6.LIZ.LLLLJ();
                                    } else {
                                        c19a6.LJJIJ(scene, true);
                                        c19a6.LIZ.LLLLJ();
                                    }
                                }
                                LIZ(navigationScene, scene, enumC214943199x, bundle, z, null, runnable);
                                return;
                            }
                            StringBuilder sbLIZ = C2188811AlT.LIZ();
                            sbLIZ.append("unreachable state case ");
                            sbLIZ.append(enumC214943199x2.getName());
                            throw new C214826195k(C2188811AlT.LIZIZ(sbLIZ));
                        }
                        C786410Ut5.LJLLLLLL(0, scene.mView);
                        if (navigationScene.LLLLL(scene)) {
                            View view = scene.mView;
                            boolean zIsAttachedToWindow = view.isAttachedToWindow();
                            if (view.getParent() != null) {
                                z2 = true;
                            }
                            FrameLayout frameLayout = navigationScene.LLJILLL;
                            if (!zIsAttachedToWindow && !z2 && frameLayout != null) {
                                if (bundle != null) {
                                    frameLayout.addView(view, C214825195j.LIZ(navigationScene, navigationScene.LLJILJIL, scene));
                                } else {
                                    frameLayout.addView(view);
                                }
                                if (scene instanceof InterfaceC214942199w) {
                                    ((InterfaceC214942199w) scene).U1(bundle);
                                } else {
                                    throw new C214826195k("This Scene should implement IReuseScene");
                                }
                            }
                        }
                        scene.dispatchStart();
                        LIZ(navigationScene, scene, enumC214943199x, bundle, z, null, runnable);
                        return;
                    }
                    scene.dispatchActivityCreated(bundle);
                    if (c21497919Bh != null && (interfaceC214941199v = c21497919Bh.LIZ) != null) {
                        interfaceC214941199v.apply(scene);
                    }
                    LIZ(navigationScene, scene, enumC214943199x, bundle, z, null, runnable);
                    return;
                }
                FrameLayout frameLayout2 = navigationScene.LLJILLL;
                scene.dispatchCreateView(bundle, frameLayout2);
                if (scene instanceof AnonymousClass1995) {
                    Record recordLIZLLL = navigationScene.LLJILJILJ.LIZIZ.LIZLLL(scene);
                    Configuration configuration = navigationScene.LLJILJILJ.LJIILIIL;
                    if (configuration != null) {
                        if (C214909198p.LIZ(recordLIZLLL.mScene)) {
                            recordLIZLLL.LLILLL = new Configuration(configuration);
                        }
                    } else if (C214909198p.LIZ(recordLIZLLL.mScene)) {
                        recordLIZLLL.LLILLL = new Configuration(recordLIZLLL.mScene.requireActivity().getResources().getConfiguration());
                    }
                }
                if (!z) {
                    if (scene.mView.getBackground() == null) {
                        Record recordLIZLLL2 = navigationScene.LLJILJILJ.LIZIZ.LIZLLL(scene);
                        if (!recordLIZLLL2.mIsTranslucent) {
                            C214936199q c214936199q = navigationScene.LLJILJIL;
                            if (c214936199q.LIZLLL) {
                                int i2 = c214936199q.LJ;
                                if (i2 > 0) {
                                    scene.mView.setBackgroundDrawable(scene.requireSceneContext().getResources().getDrawable(i2));
                                } else {
                                    scene.mView.setBackgroundDrawable(C19BL.LIZLLL(scene.requireSceneContext()));
                                }
                                recordLIZLLL2.LL = true;
                            }
                        }
                    }
                    if (bundle != null) {
                        frameLayout2.addView(scene.mView, C214825195j.LIZ(navigationScene, navigationScene.LLJILJIL, scene));
                    } else {
                        frameLayout2.addView(scene.mView);
                    }
                }
                C786410Ut5.LJLLLLLL(8, scene.mView);
                LIZ(navigationScene, scene, enumC214943199x, bundle, z, c21497919Bh, runnable);
                return;
            }
            scene.dispatchAttachActivity(navigationScene.requireActivity());
            scene.dispatchAttachScene(navigationScene);
            scene.dispatchCreate(bundle);
            LIZ(navigationScene, scene, enumC214943199x, bundle, z, c21497919Bh, runnable);
            return;
        }
        int i3 = C214939199t.LIZ[enumC214943199x2.ordinal()];
        if (i3 != 2) {
            if (i3 != 3) {
                if (i3 != 4) {
                    if (i3 != 5) {
                        if (i3 == 6) {
                            scene.dispatchPause();
                            C19A6 c19a62 = navigationScene.LLJILJILJ;
                            if (c19a62.LIZ.LLJILJIL.LJIIJ && (scene instanceof AnonymousClass1995) && scene.mState == EnumC214943199x.STARTED) {
                                c19a62.LJJIJ(scene, false);
                            }
                            LIZ(navigationScene, scene, enumC214943199x, bundle, z, null, runnable);
                            return;
                        }
                        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                        sbLIZ2.append("unreachable state case ");
                        sbLIZ2.append(enumC214943199x2.getName());
                        throw new C214826195k(C2188811AlT.LIZIZ(sbLIZ2));
                    }
                    scene.dispatchStop();
                    if (!z) {
                        C786410Ut5.LJLLLLLL(8, scene.mView);
                    }
                    LIZ(navigationScene, scene, enumC214943199x, bundle, z, null, runnable);
                    return;
                }
                if (enumC214943199x == EnumC214943199x.VIEW_CREATED) {
                    throw new IllegalArgumentException("cant switch state ACTIVITY_CREATED to VIEW_CREATED");
                }
            }
            if (scene instanceof AnonymousClass1995) {
                C12WP.LIZ();
                WeakHashMap<Scene, C214913198t> weakHashMap = C214909198p.LIZ;
                if (weakHashMap.size() > 0) {
                    weakHashMap.remove(scene);
                }
            }
            View view2 = scene.mView;
            scene.dispatchDestroyView();
            if (!z) {
                C19BL.LJFF(view2);
            }
            LIZ(navigationScene, scene, enumC214943199x, bundle, z, null, runnable);
            return;
        }
        scene.dispatchDestroy();
        scene.dispatchDetachScene();
        scene.dispatchDetachActivity();
        LIZ(navigationScene, scene, enumC214943199x, bundle, z, null, runnable);
    }
}
