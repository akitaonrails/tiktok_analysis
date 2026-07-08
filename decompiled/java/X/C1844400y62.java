package X;

import X.InterfaceC214902198i;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStoreOwner;
import com.ss.android.ugc.aweme.SAFFragmentRootScene;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0y62, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1844400y62<F extends Fragment & InterfaceC214902198i> extends AbstractC1387200mCc {
    public final F LIZLLL;
    public final Fragment LJ;
    public final Fragment LJFF;
    public final C01GW LJI;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C1844400y62) && Intrinsics.LJFF(this.LIZLLL, ((C1844400y62) obj).LIZLLL);
    }

    public final int hashCode() {
        return this.LIZLLL.hashCode();
    }

    @Override // X.AbstractC1387200mCc
    public final void LIZ() {
        this.LIZLLL.finish();
    }

    @Override // X.AbstractC1387200mCc
    public final Activity LIZIZ() {
        return this.LIZLLL.getActivity();
    }

    @Override // X.AbstractC1387200mCc
    public final FragmentManager LJ() {
        return this.LIZLLL.getChildFragmentManager();
    }

    @Override // X.AbstractC1387200mCc
    public final View LJI() {
        SAFFragmentRootScene sAFFragmentRootSceneIb = this.LIZLLL.ib();
        if (sAFFragmentRootSceneIb != null) {
            return sAFFragmentRootSceneIb.mView;
        }
        return null;
    }

    @Override // X.AbstractC1387200mCc
    public final Context LJIIIIZZ() {
        SAFFragmentRootScene sAFFragmentRootSceneIb = this.LIZLLL.ib();
        if (sAFFragmentRootSceneIb != null) {
            return sAFFragmentRootSceneIb.getSceneContext();
        }
        return null;
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
    public final F LIZLLL() {
        return this.LIZLLL;
    }

    @Override // X.AbstractC1387200mCc
    public final LifecycleOwner LJFF() {
        return this.LJ;
    }

    @Override // X.AbstractC1387200mCc
    public final ViewModelStoreOwner LJIIJ() {
        return this.LJFF;
    }

    public C1844400y62(F f) {
        super(f);
        this.LIZLLL = f;
        this.LJ = f;
        this.LJFF = f;
        this.LJI = C452501pT.LIZIZ(new C1844410y63(this));
    }

    @Override // X.AbstractC1387200mCc
    public final void LJIIJJI(Intent intent) {
        C1800490wxD.LIZJ(this.LIZLLL, -1, intent);
    }
}
