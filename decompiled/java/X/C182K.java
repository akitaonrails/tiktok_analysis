package X;

import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.bytedance.tux.input.TuxTextView;
import com.bytedance.tux.widget.RadiusLayout;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AFwS187S0000000_2;
import kotlin.jvm.internal.AFwS195S0000000_9;
import kotlin.jvm.internal.AwS550S0100000_6;

/* JADX INFO: renamed from: X.182K, reason: invalid class name */
/* JADX INFO: loaded from: classes33.dex */
public final class C182K extends AbstractC212220183e<LinearLayout, C212189181z> {
    public final LinearLayout LJ;
    public C182L LJFF;
    public int LJI;
    public int LJII;
    public C212189181z LJIIIIZZ;
    public final C01GW LJIIIZ;
    public final C01GW LJIIJ;
    public final C01GW LJIIJJI;
    public final C01GW LJIIL;
    public Drawable LJIILIIL;

    public final View LJIIJJI() {
        RadiusLayout radiusLayout;
        View viewTd = C786410Ut5.Td(C786410Ut5.ne(this.LJ.getContext()), R.layout.bxl, this.LJ, false);
        ViewGroup.LayoutParams layoutParams = viewTd.getLayoutParams();
        if (layoutParams != null) {
            layoutParams.width = this.LJFF.getWidth();
            layoutParams.height = this.LJFF.getHeight();
            C786410Ut5.W5(viewTd, layoutParams);
        }
        if ((viewTd instanceof RadiusLayout) && (radiusLayout = (RadiusLayout) viewTd) != null) {
            radiusLayout.setRadius(this.LJFF.LJIIJJI());
        }
        return viewTd;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:140:0x0215 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0201 A[PHI: r11
      0x0201: PHI (r11v1 java.lang.String) = (r11v0 java.lang.String), (r11v9 java.lang.String), (r11v9 java.lang.String) binds: [B:87:0x01fd, B:46:0x00e6, B:48:0x00ea] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Type inference failed for: r19v0, types: [X.182K] */
    /* JADX WARN: Type inference failed for: r1v19, types: [android.widget.TextView] */
    /* JADX WARN: Type inference failed for: r7v3 */
    /* JADX WARN: Type inference failed for: r7v5, types: [java.lang.CharSequence] */
    /* JADX WARN: Type inference failed for: r7v6, types: [java.lang.CharSequence] */
    /* JADX WARN: Type inference failed for: r7v7, types: [X.0HcX, java.lang.CharSequence] */
    /* JADX WARN: Type inference failed for: r9v0 */
    /* JADX WARN: Type inference failed for: r9v1, types: [boolean] */
    /* JADX WARN: Type inference failed for: r9v2 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJIIL() {
        /*
            Method dump skipped, instruction units count: 780
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C182K.LJIIL():void");
    }

    public C182K(LinearLayout linearLayout) {
        super(linearLayout, "shopping_bag_product_info");
        this.LJ = linearLayout;
        this.LJFF = new C212178181o();
        this.LJI = 2;
        this.LJIIIZ = C452501pT.LIZIZ(AFwS187S0000000_2.get$arr$(1080));
        this.LJIIJ = C452501pT.LIZIZ(AFwS187S0000000_2.get$arr$(1079));
        this.LJIIJJI = C452501pT.LIZIZ(AFwS195S0000000_9.get$arr$(490));
        this.LJIIL = C452501pT.LIZIZ(new AwS550S0100000_6(this, 1246));
        C384050F3z c384050F3z = new C384050F3z();
        c384050F3z.LIZIZ = Integer.valueOf(R.attr.e1);
        this.LJIILIIL = c384050F3z.LIZ(linearLayout.getContext());
    }

    public final void LJIILJJIL(int i) {
        if (i > 0 && i != this.LJII) {
            this.LJII = i;
            int width = this.LJFF.getWidth() + this.LJFF.LIZIZ();
            int i2 = 1;
            while (width <= i) {
                width += this.LJFF.getWidth() + this.LJFF.LJI();
                i2++;
            }
            int i3 = i2 - 1;
            if (i3 < 0) {
                i3 = 0;
            }
            this.LJI = i3;
            if (this.LJ.getChildCount() != this.LJI) {
                LJIIL();
            }
        }
    }

    public final void LJIILL(C212178181o c212178181o) {
        this.LJFF = c212178181o;
        C384050F3z c384050F3z = new C384050F3z();
        c384050F3z.LIZIZ = Integer.valueOf(this.LJFF.LJ());
        this.LJIILIIL = c384050F3z.LIZ(this.LJ.getContext());
    }

    public final void LJIILIIL(View view, boolean z, boolean z2) {
        if (z) {
            TuxTextView tuxTextView = (TuxTextView) view.findViewById(R.id.gn2);
            if (tuxTextView != null) {
                tuxTextView.setTuxFont(this.LJFF.LIZ());
                if (this.LJFF.LIZJ()) {
                    tuxTextView.setMaxLines(3);
                    tuxTextView.setMinTextSize(12.0f);
                } else {
                    tuxTextView.setMaxLines(1);
                    tuxTextView.setMinTextSize(-1.0f);
                }
                C786410Ut5.LLLLZLL(tuxTextView, 0);
            }
            View viewFindViewById = view.findViewById(R.id.gn0);
            if (viewFindViewById != null) {
                Drawable drawable = this.LJIILIIL;
                drawable.setAlpha(this.LJFF.LJFF());
                viewFindViewById.setBackground(drawable);
                C786410Ut5.LJLLLLLL(0, viewFindViewById);
            }
            C786410Ut5.LJLLLLLL(8, view.findViewById(R.id.gmy));
            C786410Ut5.LJLLLLLL(8, view.findViewById(R.id.gn1));
        } else {
            C786410Ut5.LJLLLLLL(8, view.findViewById(R.id.gn2));
            C786410Ut5.LJLLLLLL(0, view.findViewById(R.id.gmy));
            View viewFindViewById2 = view.findViewById(R.id.gn0);
            if (viewFindViewById2 != null) {
                Drawable drawable2 = this.LJIILIIL;
                drawable2.setAlpha(this.LJFF.LJII());
                viewFindViewById2.setBackground(drawable2);
                C786410Ut5.LJLLLLLL(0, viewFindViewById2);
            }
            TuxTextView tuxTextView2 = (TuxTextView) view.findViewById(R.id.gn1);
            if (this.LJFF.LIZLLL()) {
                tuxTextView2.setBackground((Drawable) this.LJIIL.getValue());
                C786410Ut5.LLLLZLL(tuxTextView2, 0);
            } else {
                C786410Ut5.LLLLZLL(tuxTextView2, 8);
            }
        }
        if (z2) {
            C0H9H.LJFF(this.LJFF.LJI(), view);
        } else {
            C0H9H.LJFF(C0H9H.LIZIZ(0), view);
        }
    }
}
