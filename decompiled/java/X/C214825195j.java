package X;

import android.view.View;
import android.widget.FrameLayout;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.scene.Scene;
import com.bytedance.scene.navigation.NavigationScene;
import java.util.List;

/* JADX INFO: renamed from: X.195j, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public final class C214825195j {
    public static int LIZ(NavigationScene navigationScene, C214936199q c214936199q, Scene scene) {
        if (!c214936199q.LJFF) {
            C21494919Ad.LIZIZ.LIZIZ("NavigationSceneViewUtility#targetViewIndexOfScene", "onlyRestoreVisibleScene false, targetViewIndex: -1");
            return -1;
        }
        if (navigationScene.LLLLIIIILLL() == scene) {
            C21494919Ad.LIZIZ.LIZIZ("NavigationSceneViewUtility#targetViewIndexOfScene", "this scene is top scene, targetViewIndex: -1");
            return -1;
        }
        List<Scene> sceneList = navigationScene.getSceneList();
        int iIndexOf = sceneList.indexOf(scene);
        if (iIndexOf != -1) {
            if (iIndexOf != sceneList.size() - 1) {
                FrameLayout frameLayout = navigationScene.LLJILLL;
                if (frameLayout != null) {
                    View view = ((Scene) ListProtector.get(sceneList, iIndexOf + 1)).mView;
                    if (view != null) {
                        if (view.getParent() == frameLayout) {
                            int iIndexOfChild = frameLayout.indexOfChild(view);
                            C21494919Ad c21494919Ad = C21494919Ad.LIZIZ;
                            StringBuilder sbLIZ = C2188811AlT.LIZ();
                            sbLIZ.append("find above scene, targetViewIndex: ");
                            sbLIZ.append(iIndexOfChild);
                            c21494919Ad.LIZIZ("NavigationSceneViewUtility#targetViewIndexOfScene", C2188811AlT.LIZIZ(sbLIZ));
                            return iIndexOfChild;
                        }
                        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                        sbLIZ2.append("Above Scene ");
                        sbLIZ2.append(scene.toString());
                        sbLIZ2.append(" is not in parent scene container, impossible!");
                        throw new C214826195k(C2188811AlT.LIZIZ(sbLIZ2));
                    }
                    if (iIndexOf == 0) {
                        C21494919Ad.LIZIZ.LIZIZ("NavigationSceneViewUtility#targetViewIndexOfScene", "above scene is not created, targetViewIndex: -1");
                        return -1;
                    }
                    View view2 = ((Scene) ListProtector.get(sceneList, iIndexOf - 1)).mView;
                    if (view2 != null) {
                        if (view2.getParent() == frameLayout) {
                            int iIndexOfChild2 = frameLayout.indexOfChild(view2) + 1;
                            C21494919Ad c21494919Ad2 = C21494919Ad.LIZIZ;
                            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                            sbLIZ3.append("find below scene, targetViewIndex: ");
                            sbLIZ3.append(iIndexOfChild2);
                            c21494919Ad2.LIZIZ("NavigationSceneViewUtility#targetViewIndexOfScene", C2188811AlT.LIZIZ(sbLIZ3));
                            return iIndexOfChild2;
                        }
                        StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                        sbLIZ4.append("Below Scene ");
                        sbLIZ4.append(scene.toString());
                        sbLIZ4.append(" is not in parent scene container, impossible!");
                        throw new C214826195k(C2188811AlT.LIZIZ(sbLIZ4));
                    }
                    C21494919Ad.LIZIZ.LIZIZ("NavigationSceneViewUtility#targetViewIndexOfScene", "above scene and below scene all not created, targetViewIndex: -1");
                    return -1;
                }
                throw new C214826195k("Why NavigationScene SceneContainer not found, impossible!");
            }
            StringBuilder sbLIZ5 = C2188811AlT.LIZ();
            sbLIZ5.append("Target Scene ");
            sbLIZ5.append(scene.toString());
            sbLIZ5.append(" is the top Scene, impossible!");
            throw new C214826195k(C2188811AlT.LIZIZ(sbLIZ5));
        }
        StringBuilder sbLIZ6 = C2188811AlT.LIZ();
        sbLIZ6.append("Can't find target Scene ");
        sbLIZ6.append(scene.toString());
        throw new C214826195k(C2188811AlT.LIZIZ(sbLIZ6));
    }
}
