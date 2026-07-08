package X;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.view.View;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStoreOwner;
import com.bytedance.scene.Scene;
import kotlin.jvm.internal.AwS576S0100000_32;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.198S, reason: invalid class name */
/* JADX INFO: loaded from: classes33.dex */
public final class C198S extends AbstractC1387200mCc {
    public final Scene LIZLLL;
    public final Scene LJ;
    public final Scene LJFF;
    public final C01GW LJI;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C198S) && Intrinsics.LJFF(this.LIZLLL, ((C198S) obj).LIZLLL);
    }

    public final int hashCode() {
        return this.LIZLLL.hashCode();
    }

    @Override // X.AbstractC1387200mCc
    public final void LIZ() {
        C128Y c128y = this.LIZLLL;
        if (c128y instanceof C198H) {
            ((C198H) c128y).finish();
        }
    }

    @Override // X.AbstractC1387200mCc
    public final Activity LIZIZ() {
        return this.LIZLLL.mActivity;
    }

    @Override // X.AbstractC1387200mCc
    public final FragmentManager LJ() {
        C128Y c128y = this.LIZLLL;
        if (c128y instanceof InterfaceC20622815ms) {
            return ((InterfaceC20622815ms) c128y).getContainerFragmentManager();
        }
        return null;
    }

    @Override // X.AbstractC1387200mCc
    public final View LJI() {
        return this.LIZLLL.mView;
    }

    @Override // X.AbstractC1387200mCc
    public final Context LJIIIIZZ() {
        return this.LIZLLL.getSceneContext();
    }

    @Override // X.AbstractC1387200mCc
    public final ViewModelProvider LJIIIZ() {
        return (ViewModelProvider) this.LJI.getValue();
    }

    @Override // X.AbstractC1387200mCc
    public final String toString() {
        return super.toString();
    }

    @Override // X.AbstractC1387200mCc
    public final LifecycleOwner LJFF() {
        return this.LJ;
    }

    @Override // X.AbstractC1387200mCc
    public final Scene LJII() {
        return this.LIZLLL;
    }

    @Override // X.AbstractC1387200mCc
    public final ViewModelStoreOwner LJIIJ() {
        return this.LJFF;
    }

    public C198S(Scene scene) {
        super(scene);
        this.LIZLLL = scene;
        this.LJ = scene;
        this.LJFF = scene;
        this.LJI = C452501pT.LIZIZ(new AwS576S0100000_32(this, 889));
    }

    @Override // X.AbstractC1387200mCc
    public final void LJIIJJI(Intent intent) {
        C128Y c128y = this.LIZLLL;
        if (c128y instanceof C198H) {
            ((C198H) c128y).setResult(-1, intent);
        }
    }
}
