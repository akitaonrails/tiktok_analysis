package X;

import android.app.Activity;
import android.widget.FrameLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;

/* JADX INFO: renamed from: X.0d6d, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public abstract class AbstractC1037530d6d implements InterfaceC1038230d7l {
    public final InterfaceC1034470d1h LIZIZ;
    public final C1037620d6m LIZJ;
    public boolean LIZLLL = true;

    public abstract boolean LIZ(C19EG c19eg, Fragment fragment, FrameLayout frameLayout);

    @Override // X.InterfaceC1038230d7l
    public final void l1() {
    }

    @Override // X.InterfaceC1038230d7l
    public final void remove() {
        FragmentManager supportFragmentManager;
        Fragment fragment = this.LIZIZ.getFragment();
        C19EG activity = fragment.getActivity();
        if (activity != null && (supportFragmentManager = activity.getSupportFragmentManager()) != null && supportFragmentManager.LJJLIIIJL().contains(fragment)) {
            C19EH c19ehLJIIJ = supportFragmentManager.LJIIJ();
            c19ehLJIIJ.LJIIZILJ(fragment);
            c19ehLJIIJ.LJIIJ();
        }
        this.LIZLLL = true;
    }

    @Override // X.InterfaceC1038230d7l
    public void LIZIZ(String str) {
        this.LIZIZ.LLLIL(str);
    }

    public AbstractC1037530d6d(InterfaceC1034470d1h interfaceC1034470d1h, C1037620d6m c1037620d6m) {
        this.LIZIZ = interfaceC1034470d1h;
        this.LIZJ = c1037620d6m;
    }

    @Override // X.InterfaceC1038230d7l
    public final boolean LIZJ(FrameLayout frameLayout, FragmentManager fragmentManager) {
        C19EG c19eg;
        Activity activityLIZ = C1388190mED.LIZ(frameLayout.getContext());
        if (activityLIZ == null || !(activityLIZ instanceof C19EG) || (c19eg = (C19EG) activityLIZ) == null) {
            return false;
        }
        Fragment fragment = this.LIZIZ.getFragment();
        if (!this.LIZLLL) {
            this.LIZIZ.ge(EnumC1036640d5C.PAGE_SELECT);
            this.LIZIZ.LJJ(this.LIZJ.LIZIZ);
            return true;
        }
        boolean zLIZ = LIZ(c19eg, fragment, frameLayout);
        if (zLIZ) {
            this.LIZLLL = false;
        }
        return zLIZ;
    }
}
