package X;

import android.app.Activity;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.view.View;
import com.bytedance.scene.navigation.NavigationScene;

/* JADX INFO: renamed from: X.19CD, reason: invalid class name */
/* JADX INFO: loaded from: classes33.dex */
public final class C19CD implements InterfaceC1655610tBX {
    public final Activity LIZ;
    public final NavigationScene LIZIZ;
    public final C19CC LIZJ;
    public final C19CE LIZLLL;
    public final Boolean LJ;
    public boolean LJFF;

    @Override // X.InterfaceC1655610tBX
    public final void LIZ() {
        if (this.LJFF) {
            return;
        }
        this.LJFF = true;
        View view = this.LIZIZ.mView;
        FragmentManager fragmentManager = this.LIZ.getFragmentManager();
        FragmentTransaction fragmentTransactionRemove = fragmentManager.beginTransaction().remove(this.LIZJ).remove(this.LIZLLL);
        if (this.LJ.booleanValue()) {
            this.LIZJ.LL = new C19CF(this, view);
            C19BL.LIZ(fragmentManager, fragmentTransactionRemove, true);
            return;
        }
        C19BL.LIZ(fragmentManager, fragmentTransactionRemove, false);
        Activity activity = this.LIZ;
        C788890Ux5.LIZ.get(activity).remove(this.LIZJ.getTag());
        if (view != null) {
            C19BL.LJFF(view);
        }
    }

    @Override // X.InterfaceC1655610tBX
    public final NavigationScene getNavigationScene() {
        if (this.LJFF) {
            return null;
        }
        return this.LIZIZ;
    }

    @Override // X.InterfaceC1655610tBX
    public final boolean onBackPressed() {
        return !this.LJFF && this.LIZIZ.LLLLLJIL(null);
    }

    public C19CD(Activity activity, NavigationScene navigationScene, C19CC c19cc, C19CE c19ce, boolean z) {
        this.LIZ = activity;
        this.LIZIZ = navigationScene;
        this.LIZJ = c19cc;
        this.LIZLLL = c19ce;
        this.LJ = Boolean.valueOf(z);
    }
}
