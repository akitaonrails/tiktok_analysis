package X;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0Gt3, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C429670Gt3 implements C0H77 {
    public ImageView LIZ;
    public ImageView LIZIZ;
    public C1295960jpS LIZJ;
    public View LIZLLL;
    public boolean LJ;
    public C418640GbG LJFF;

    @Override // X.C0H77
    public final void LIZ() {
        C1706630uVp.LIZ("ECDefaultItemLoadingView", "resLoading");
        ImageView imageView = this.LIZ;
        if (imageView == null) {
            imageView = null;
        }
        C0H0N.LJII(imageView);
        ImageView imageView2 = this.LIZIZ;
        C0H0N.LJII(imageView2 != null ? imageView2 : null);
        if (this.LJ) {
            C0H0N.LJIILJJIL(this.LJFF);
            C418640GbG c418640GbG = this.LJFF;
            if (c418640GbG != null) {
                c418640GbG.LIZ();
                return;
            }
            return;
        }
        C0H0N.LJIILJJIL(this.LIZJ);
        C1295960jpS c1295960jpS = this.LIZJ;
        if (c1295960jpS != null) {
            c1295960jpS.playAnimation();
        }
    }

    @Override // X.C0H77
    public final void LIZIZ() {
        C1706630uVp.LIZ("ECDefaultItemLoadingView", "resNotLoad");
        ImageView imageView = this.LIZ;
        if (imageView == null) {
            imageView = null;
        }
        C0H0N.LJIILJJIL(imageView);
        if (this.LJ) {
            C0H0N.LJII(this.LJFF);
        } else {
            C0H0N.LJII(this.LIZJ);
        }
        ImageView imageView2 = this.LIZIZ;
        if (imageView2 == null) {
            imageView2 = null;
        }
        C0H0N.LJII(imageView2);
        ImageView imageView3 = this.LIZ;
        ImageView imageView4 = imageView3 != null ? imageView3 : null;
        imageView4.setBackground(imageView4.getResources().getDrawable(R.drawable.az5));
    }

    @Override // X.C0H77
    public final void LIZJ() {
        C1706630uVp.LIZ("ECDefaultItemLoadingView", "resLoadFailed");
        ImageView imageView = this.LIZ;
        if (imageView == null) {
            imageView = null;
        }
        C0H0N.LJII(imageView);
        View view = this.LIZLLL;
        if (view == null) {
            view = null;
        }
        C0H0N.LJII(view);
        ImageView imageView2 = this.LIZIZ;
        C0H0N.LJIILJJIL(imageView2 != null ? imageView2 : null);
        if (this.LJ) {
            C0H0N.LJII(this.LJFF);
        } else {
            C0H0N.LJII(this.LIZJ);
        }
    }

    @Override // X.C0H77
    public final void LIZLLL() {
        C1706630uVp.LIZ("ECDefaultItemLoadingView", "resLoadSuccess");
        ImageView imageView = this.LIZ;
        if (imageView == null) {
            imageView = null;
        }
        C0H0N.LJII(imageView);
        ImageView imageView2 = this.LIZIZ;
        if (imageView2 == null) {
            imageView2 = null;
        }
        C0H0N.LJII(imageView2);
        View view = this.LIZLLL;
        C0H0N.LJII(view != null ? view : null);
        if (this.LJ) {
            C0H0N.LJII(this.LJFF);
            C418640GbG c418640GbG = this.LJFF;
            if (c418640GbG != null) {
                c418640GbG.LIZIZ();
                return;
            }
            return;
        }
        C0H0N.LJII(this.LIZJ);
        C1295960jpS c1295960jpS = this.LIZJ;
        if (c1295960jpS != null) {
            c1295960jpS.cancelAnimation();
        }
    }

    public final View LJ(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewTd = C786410Ut5.Td(layoutInflater, R.layout.afc, viewGroup, true);
        this.LIZ = (ImageView) viewTd.findViewById(R.id.du8);
        this.LIZLLL = viewTd.findViewById(R.id.du_);
        this.LIZIZ = (ImageView) viewTd.findViewById(R.id.dua);
        if (this.LJ) {
            ConstraintLayout constraintLayout = (ConstraintLayout) viewTd.findViewById(R.id.f85);
            View viewFindViewById = constraintLayout.findViewById(R.id.du9);
            int iIndexOfChild = constraintLayout.indexOfChild(viewFindViewById);
            C786410Ut5.LJJLI(viewFindViewById, constraintLayout);
            C418640GbG c418640GbG = new C418640GbG(constraintLayout.getContext(), null, 6);
            ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(C416920GWk.LIZIZ(24), C416920GWk.LIZIZ(24));
            ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c418640GbG);
            c418640GbG.setLayoutParams(layoutParams);
            c418640GbG.setId(R.id.dud);
            this.LJFF = c418640GbG;
            constraintLayout.addView(c418640GbG, iIndexOfChild);
            C19MB c19mb = new C19MB();
            c19mb.LJII(constraintLayout);
            c19mb.LJFF(viewFindViewById.getId());
            c19mb.LJIIIIZZ(R.id.dud, 6, 0, 6);
            c19mb.LJIIIIZZ(R.id.dud, 7, 0, 7);
            c19mb.LJIIIIZZ(R.id.dud, 3, 0, 3);
            c19mb.LJIIIIZZ(R.id.dud, 4, 0, 4);
            c19mb.LIZIZ(constraintLayout);
            return viewTd;
        }
        C1295960jpS c1295960jpS = (C1295960jpS) viewTd.findViewById(R.id.du9);
        c1295960jpS.setAnimation(R.raw.effect_cam_default_loading);
        this.LIZJ = c1295960jpS;
        return viewTd;
    }
}
