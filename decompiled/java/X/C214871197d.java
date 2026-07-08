package X;

import android.os.Bundle;
import com.bytedance.scene.Scene;
import com.bytedance.scene.navigation.NavigationScene;

/* JADX INFO: renamed from: X.197d, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public final class C214871197d {
    public static final NavigationScene LIZ(final C19A3 c19a3) {
        C214936199q c214936199q = new C214936199q((Bundle) null, c19a3.getClass());
        c214936199q.LIZJ = false;
        c214936199q.LIZLLL = false;
        c214936199q.LJ = 0;
        c214936199q.LJFF = true;
        c214936199q.LJIIZILJ = C293940Bfc.LIZ();
        NavigationScene navigationScene = (NavigationScene) C2350509Ix.LIZ(c214936199q.LIZ(), NavigationScene.class);
        navigationScene.LLJIJIL = new InterfaceC214877197j() { // from class: X.0tCr
            @Override // X.InterfaceC214877197j
            public final Scene LIZ(ClassLoader classLoader, String str, Bundle bundle) {
                return c19a3;
            }
        };
        C365090ETb.LIZIZ();
        navigationScene.mRootScopeFactory = new InterfaceC21498919Br() { // from class: X.197e
            @Override // X.InterfaceC21498919Br
            public final C214937199r IQ() {
                return C214937199r.LJI.IQ();
            }
        };
        return navigationScene;
    }
}
