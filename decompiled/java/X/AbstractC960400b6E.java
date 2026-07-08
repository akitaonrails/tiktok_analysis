package X;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.scene.Scene;
import java.util.List;

/* JADX INFO: renamed from: X.0b6E, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public abstract class AbstractC960400b6E<D> extends RecyclerView.ViewHolder {
    public static final /* synthetic */ int LLILLL = 0;
    public boolean LL;
    public long LLILLJJLI;

    public abstract void I5(List list, int i, Object obj);

    public void LLIILZL() {
        this.LL = false;
    }

    public abstract String getName();

    public void onViewAttachedToWindow() {
        this.LL = true;
        this.LLILLJJLI = C158B.LIZ();
    }

    public void onViewDetachedFromWindow() {
        this.LL = false;
        this.LLILLJJLI = 0L;
    }

    public final boolean isViewValid() {
        return this.LL;
    }

    public AbstractC960400b6E(View view) {
        super(view);
        this.LL = true;
    }

    public final void L5(List list, int i, Object obj) {
        C955440ayE c955440ayE = new C955440ayE();
        I5(list, i, obj);
        String name = getName();
        if (C956080azG.LJFF) {
            c955440ayE.LJIIL(name, Scene.SCENE_SERVICE, true);
            c955440ayE.LJIILIIL();
            c955440ayE.LJIJJLI("cell_bind");
        }
    }
}
