package X;

import android.os.Bundle;
import android.view.ViewGroup;
import androidx.fragment.app.FragmentManager;
import com.bytedance.effectcreatormobile.infrastructure.ui.widgets.bottomdrawerviewpager.BottomDrawerFragment;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.118P, reason: invalid class name */
/* JADX INFO: loaded from: classes30.dex */
public abstract class C118P<T> implements InterfaceC21662119q7 {
    public final T LIZ;
    public final FragmentManager LIZIZ;
    public C21661919q5 LIZJ;

    public abstract BottomDrawerFragment LJFF(Bundle bundle);

    @Override // X.InterfaceC21662119q7
    public final int LJ() {
        return this.LIZIZ.LJJLIIIIJ();
    }

    @Override // X.InterfaceC21662119q7
    public final void LIZIZ(C21661919q5 c21661919q5) {
        this.LIZJ = c21661919q5;
    }

    @Override // X.InterfaceC21662119q7
    public void LIZLLL(int i) {
        if (this.LIZIZ.LJJLIIIIJ() > 0) {
            FragmentManager fragmentManager = this.LIZIZ;
            C128Y c128yLJJJJZI = this.LIZIZ.LJJJJZI(fragmentManager.LJJLI(fragmentManager.LJJLIIIIJ() - 1).getName());
            if ((c128yLJJJJZI instanceof C118R) && ((C118R) c128yLJJJJZI).LJIJ()) {
                return;
            }
        }
        if (this.LIZIZ.LJJLIIIIJ() > 1) {
            this.LIZIZ.LJLLILLLL();
            return;
        }
        C21661919q5 c21661919q5 = this.LIZJ;
        if (c21661919q5 == null) {
            return;
        }
        c21661919q5.LIZ(i);
    }

    public C118P(T t, FragmentManager fragmentManager) {
        this.LIZ = t;
        this.LIZIZ = fragmentManager;
    }

    @Override // X.InterfaceC21662119q7
    public final void LIZ(Bundle bundle, ViewGroup viewGroup) {
        String string = bundle.getString("page");
        if (this.LIZIZ.LJJJJZI(string) == null) {
            C19EH c19ehLJIIJ = this.LIZIZ.LJIIJ();
            BottomDrawerFragment bottomDrawerFragmentLJFF = LJFF(bundle);
            if (bottomDrawerFragmentLJFF != null) {
                bottomDrawerFragmentLJFF.setArguments(bundle);
                c19ehLJIIJ.LIZJ(viewGroup.getId(), bottomDrawerFragmentLJFF, string);
                c19ehLJIIJ.LJII(string);
            }
            c19ehLJIIJ.LJIIJ();
        }
    }

    @Override // X.InterfaceC21662119q7
    public final void LIZJ(Bundle bundle, ViewGroup viewGroup, boolean z) {
        String string = bundle.getString("page");
        if (this.LIZIZ.LJJJJZI(string) == null) {
            C19EH c19ehLJIIJ = this.LIZIZ.LJIIJ();
            BottomDrawerFragment bottomDrawerFragmentLJFF = LJFF(bundle);
            if (bottomDrawerFragmentLJFF != null) {
                bottomDrawerFragmentLJFF.setArguments(bundle);
                if (z) {
                    c19ehLJIIJ.LJIJJLI(R.anim.i6, R.anim.i9, R.anim.i5, R.anim.i_);
                }
                c19ehLJIIJ.LJIJ(viewGroup.getId(), bottomDrawerFragmentLJFF, string);
                c19ehLJIIJ.LJII(string);
            }
            c19ehLJIIJ.LJIIJ();
        }
    }
}
