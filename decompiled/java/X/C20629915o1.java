package X;

import com.bytedance.scene.Scene;
import com.bytedance.scene.navigation.NavigationScene;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: X.15o1, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public final class C20629915o1 {
    public static final InterfaceC214902198i LIZ(InterfaceC20622815ms interfaceC20622815ms) {
        C198H rootSAFSceneWrapper = interfaceC20622815ms.getRootSAFSceneWrapper();
        if (rootSAFSceneWrapper != null) {
            return C20629815o0.LIZ(rootSAFSceneWrapper);
        }
        return null;
    }

    public static final List<InterfaceC20630715o9> LIZIZ(InterfaceC20622815ms interfaceC20622815ms) {
        List<Scene> sceneList;
        NavigationScene navigationScene = interfaceC20622815ms.getNavigationScene();
        if (navigationScene != null && (sceneList = navigationScene.getSceneList()) != null) {
            ArrayList arrayList = new ArrayList();
            for (C128Y c128y : sceneList) {
                if (c128y instanceof C214932199m) {
                    c128y = ((C214932199m) c128y).LLJI;
                } else if (c128y instanceof InterfaceC20630715o9) {
                }
                if (c128y != null) {
                    arrayList.add(c128y);
                }
            }
            return arrayList;
        }
        return C13BV.INSTANCE;
    }

    public static final InterfaceC214902198i LIZJ(InterfaceC20622815ms interfaceC20622815ms) {
        C198H c198hLIZLLL = LIZLLL(interfaceC20622815ms);
        if (c198hLIZLLL != null) {
            return C20629815o0.LIZ(c198hLIZLLL);
        }
        return null;
    }

    public static final C198H LIZLLL(InterfaceC20622815ms interfaceC20622815ms) {
        C198H c198h;
        NavigationScene navigationScene = interfaceC20622815ms.getNavigationScene();
        C128Y c128yLLLLIIIILLL = null;
        if (navigationScene != null) {
            c128yLLLLIIIILLL = navigationScene.LLLLIIIILLL();
        }
        if (c128yLLLLIIIILLL instanceof C214932199m) {
            c128yLLLLIIIILLL = ((C214932199m) c128yLLLLIIIILLL).LLJI;
        }
        if (!(c128yLLLLIIIILLL instanceof C198H) || (c198h = (C198H) c128yLLLLIIIILLL) == null) {
            return interfaceC20622815ms.getRootSAFSceneWrapper();
        }
        return c198h;
    }
}
