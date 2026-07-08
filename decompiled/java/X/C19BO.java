package X;

import android.graphics.drawable.Drawable;
import com.bytedance.scene.Scene;
import com.bytedance.scene.navigation.NavigationScene;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: X.19BO, reason: invalid class name */
/* JADX INFO: loaded from: classes33.dex */
public abstract class C19BO {
    public static C20148513sZ LJIIJ;
    public NavigationScene LIZ;
    public List<C191E> LIZIZ;
    public boolean LIZJ;
    public float LIZLLL;
    public Scene LJ;
    public Scene LJFF;
    public Drawable LJI;
    public int LJII;
    public C19BR LJIIIIZZ;
    public C20148513sZ LJIIIZ;

    public abstract void LIZIZ();

    public abstract void LIZJ();

    public void LIZ() {
        if (this.LIZJ) {
            LJ(0.0f);
            this.LIZJ = false;
            LIZLLL();
        }
    }

    public final void LIZLLL() {
        if (LJIIJ == this.LJIIIZ) {
            LJIIJ = null;
        }
        NavigationScene navigationScene = this.LIZ;
        if (navigationScene.LLJILJIL.LIZJ) {
            navigationScene.mView.setBackground(C19BL.LIZLLL(navigationScene.requireSceneContext()));
        }
        C786410Ut5.LJLLLLLL(this.LJII, this.LJFF.mView);
        this.LJ.mView.setBackground(this.LJI);
        LIZIZ();
        C19BR c19br = this.LJIIIIZZ;
        if (c19br != null) {
            c19br.LIZLLL();
        }
    }

    public final void LJ(float f) {
        if (!this.LIZJ) {
            return;
        }
        Iterator<C191E> it2 = this.LIZIZ.iterator();
        while (it2.hasNext()) {
            it2.next().LIZ(f);
        }
        this.LIZLLL = f;
    }
}
