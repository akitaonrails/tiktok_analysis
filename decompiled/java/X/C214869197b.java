package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.scene.Scene;
import com.bytedance.scene.navigation.NavigationScene;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.197b, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public final class C214869197b {
    /* JADX WARN: Type inference failed for: r3v0, types: [X.11Ap] */
    public static final NavigationScene LIZ(C19A3 c19a3, NavigationScene navigationScene) {
        if (navigationScene != null && c19a3.isAdded(navigationScene)) {
            return navigationScene;
        }
        NavigationScene navigationScene2 = (NavigationScene) c19a3.findSceneByTag("EditorProPanelNavigationScene");
        if (navigationScene2 != null) {
            return navigationScene2;
        }
        final ?? r3 = new C19A3() { // from class: X.11Ap
            @Override // X.C19A3, com.bytedance.scene.Scene
            public final ViewGroup onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
                return (ViewGroup) C786410Ut5.Td(layoutInflater, R.layout.epi, viewGroup, false);
            }

            @Override // X.C19A3, com.bytedance.scene.Scene
            public final /* bridge */ /* synthetic */ View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
                return onCreateView(layoutInflater, viewGroup, bundle);
            }
        };
        C214936199q c214936199q = new C214936199q((Bundle) null, C19457711Ap.class);
        c214936199q.LIZJ = false;
        c214936199q.LIZLLL = false;
        c214936199q.LJ = 0;
        c214936199q.LJFF = true;
        c214936199q.LJIIZILJ = C293940Bfc.LIZ();
        NavigationScene navigationScene3 = (NavigationScene) C2350509Ix.LIZ(c214936199q.LIZ(), NavigationScene.class);
        navigationScene3.LLJIJIL = new InterfaceC214877197j() { // from class: X.11x8
            @Override // X.InterfaceC214877197j
            public final Scene LIZ(ClassLoader classLoader, String str, Bundle bundle) {
                return r3;
            }
        };
        C365090ETb.LIZIZ();
        navigationScene3.mRootScopeFactory = new InterfaceC21498919Br() { // from class: X.197c
            @Override // X.InterfaceC21498919Br
            public final C214937199r IQ() {
                return C214937199r.LJI.IQ();
            }
        };
        c19a3.add(R.id.gcw, navigationScene3, "EditorProPanelNavigationScene");
        return navigationScene3;
    }
}
