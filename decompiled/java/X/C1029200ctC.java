package X;

import Y.ACallableS246S0200000_16;
import android.content.Context;
import android.graphics.Bitmap;
import android.view.View;
import android.view.ViewStub;
import android.widget.ImageView;
import com.ss.android.ugc.aweme.base.ImageUrlModel;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0ctC, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1029200ctC implements InterfaceC690040R4w {
    public final int LIZ;
    public final View LIZIZ;
    public final ImageView LIZJ;
    public final Context LIZLLL;

    public C1029200ctC(ViewStub viewStub, int i) {
        ImageView imageView;
        this.LIZ = i;
        this.LIZLLL = viewStub.getContext();
        if (this.LIZIZ == null) {
            View viewLJLLLL = C786410Ut5.LJLLLL(viewStub);
            this.LIZIZ = viewLJLLLL;
            if (viewLJLLLL != null) {
                C786410Ut5.LJLLLLLL(8, viewLJLLLL);
                imageView = (ImageView) viewLJLLLL.findViewById(R.id.wzk);
            } else {
                imageView = null;
            }
            this.LIZJ = imageView;
        }
    }

    @Override // X.InterfaceC690040R4w
    public final void LIZ(int i, int i2, int i3) {
        if (LIZLLL(i, i2, i3)) {
            View view = this.LIZIZ;
            if (view != null) {
                C786410Ut5.LJLLLLLL(0, view);
            }
            int i4 = C2187451AjH.LIZ;
            return;
        }
        View view2 = this.LIZIZ;
        if (view2 != null) {
            C786410Ut5.LJLLLLLL(8, view2);
        }
        int i5 = C2187451AjH.LIZ;
    }

    @Override // X.InterfaceC690040R4w
    public final void LIZIZ(int i, int i2, ImageUrlModel imageUrlModel) {
        LIZJ(i, i2, 0, imageUrlModel);
    }

    public final boolean LIZLLL(int i, int i2, int i3) {
        boolean z;
        int iLIZIZ;
        boolean z2;
        if (C1389340mG4.LIZJ(this.LIZLLL, null).LJFF && i < ((double) i2) * 1.77d) {
            z = true;
        } else {
            z = false;
        }
        if (!C1389340mG4.LIZJ(this.LIZLLL, null).LJFF && i < i2) {
            z = true;
        }
        Context context = this.LIZLLL;
        if (context != null) {
            iLIZIZ = C497820Jfg.LIZIZ(context);
        } else {
            iLIZIZ = 0;
        }
        if (i3 + 60 <= iLIZIZ) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z && z2) {
            return true;
        }
        return false;
    }

    @Override // X.InterfaceC690040R4w
    public final void LIZJ(int i, int i2, int i3, ImageUrlModel imageUrlModel) {
        View view;
        View view2;
        View view3 = this.LIZIZ;
        if (view3 != null && view3.getVisibility() == 8 && (view2 = this.LIZIZ) != null) {
            C786410Ut5.LJLLLLLL(0, view2);
        }
        if (!LIZLLL(i, i2, i3) && (view = this.LIZIZ) != null) {
            C786410Ut5.LJLLLLLL(8, view);
        }
        C1331670kl3 c1331670kl3LJIIIIZZ = C1331660kl2.LJIIIIZZ(imageUrlModel);
        c1331670kl3LJIIIIZZ.LIZLLL("tablet_gradient_bg_load_bitmap");
        c1331670kl3LJIIIIZZ.LJJII(new InterfaceC1331910klR() { // from class: X.0ctB
            @Override // X.InterfaceC1331910klR
            public final void onCanceled() {
            }

            @Override // X.InterfaceC1331910klR
            public final void onFailed(Throwable th) {
            }

            @Override // X.InterfaceC1331910klR
            public final void onProgress(float f) {
            }

            @Override // X.InterfaceC1331910klR
            public final void LIZ(Bitmap bitmap) {
                C15O7.LIZJ(new ACallableS246S0200000_16(bitmap, this.LL, 2)).LJ(new C1077460e92(this.LL, 0), C15O7.LJIIIIZZ, null);
            }
        });
    }
}
