package X;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStoreOwner;
import com.bytedance.scene.Scene;

/* JADX INFO: renamed from: X.0mCc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public abstract class AbstractC1387200mCc {
    public final Object LIZ;
    public final LifecycleOwner LIZIZ;
    public final ViewModelStoreOwner LIZJ;

    public abstract void LIZ();

    public abstract Activity LIZIZ();

    public Fragment LIZLLL() {
        return null;
    }

    public abstract FragmentManager LJ();

    public abstract View LJI();

    public Scene LJII() {
        return null;
    }

    public abstract ViewModelProvider LJIIIZ();

    public abstract void LJIIJJI(Intent intent);

    public String toString() {
        Object obj = this.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(obj.getClass().getSimpleName());
        sbLIZ.append('#');
        sbLIZ.append(System.identityHashCode(obj));
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final Context LIZJ() {
        return LIZIZ();
    }

    public Context LJIIIIZZ() {
        return LIZIZ();
    }

    public LifecycleOwner LJFF() {
        return this.LIZIZ;
    }

    public ViewModelStoreOwner LJIIJ() {
        return this.LIZJ;
    }

    public AbstractC1387200mCc(Object obj) {
        LifecycleOwner lifecycleOwner;
        this.LIZ = obj;
        if (obj instanceof LifecycleOwner) {
            lifecycleOwner = (LifecycleOwner) obj;
        } else {
            lifecycleOwner = null;
        }
        this.LIZIZ = lifecycleOwner;
        this.LIZJ = obj instanceof ViewModelStoreOwner ? (ViewModelStoreOwner) obj : null;
    }
}
