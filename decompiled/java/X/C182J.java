package X;

import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.bytedance.tux.input.TuxTextView;
import com.bytedance.tux.widget.RadiusLayout;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AFwS221S0000000_31;
import kotlin.jvm.internal.AwS575S0100000_31;

/* JADX INFO: renamed from: X.182J, reason: invalid class name */
/* JADX INFO: loaded from: classes33.dex */
public final class C182J extends C185J<LinearLayout, C212183181t> {
    public final LinearLayout LIZLLL;
    public C182M LJ;
    public int LJFF;
    public int LJI;
    public C212183181t LJII;
    public final C01GW LJIIIIZZ;
    public final C01GW LJIIIZ;
    public final C01GW LJIIJ;
    public final C01GW LJIIJJI;
    public final C01GW LJIIL;

    public final View LJIIJ() {
        RadiusLayout radiusLayout;
        View viewTd = C786410Ut5.Td(C786410Ut5.ne(this.LIZLLL.getContext()), R.layout.bwh, this.LIZLLL, false);
        ViewGroup.LayoutParams layoutParams = viewTd.getLayoutParams();
        if (layoutParams != null) {
            layoutParams.width = this.LJ.getWidth();
            layoutParams.height = this.LJ.getHeight();
            C786410Ut5.W5(viewTd, layoutParams);
        }
        if ((viewTd instanceof RadiusLayout) && (radiusLayout = (RadiusLayout) viewTd) != null) {
            radiusLayout.setRadius(this.LJ.LJIIJJI());
        }
        return viewTd;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:135:0x020d A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x01f9 A[PHI: r11
      0x01f9: PHI (r11v1 java.lang.String) = (r11v0 java.lang.String), (r11v9 java.lang.String), (r11v9 java.lang.String) binds: [B:82:0x01f5, B:41:0x00de, B:43:0x00e2] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Type inference failed for: r19v0, types: [X.182J] */
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
    public final void LJIIJJI() {
        /*
            Method dump skipped, instruction units count: 762
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C182J.LJIIJJI():void");
    }

    public C182J(LinearLayout linearLayout) {
        super(linearLayout);
        this.LIZLLL = linearLayout;
        this.LJ = new C19396210uW();
        this.LJFF = 2;
        this.LJIIIIZZ = C452501pT.LIZIZ(AFwS221S0000000_31.get$arr$(374));
        this.LJIIIZ = C452501pT.LIZIZ(AFwS221S0000000_31.get$arr$(373));
        this.LJIIJ = C452501pT.LIZIZ(AFwS221S0000000_31.get$arr$(375));
        this.LJIIJJI = C452501pT.LIZIZ(new AwS575S0100000_31(this, 1368));
        this.LJIIL = C452501pT.LIZIZ(new AwS575S0100000_31(this, 1367));
    }

    public final void LJIIL(View view, boolean z, boolean z2) {
        if (z) {
            TuxTextView tuxTextView = (TuxTextView) view.findViewById(R.id.gn2);
            if (tuxTextView != null) {
                tuxTextView.setTuxFont(this.LJ.LIZ());
                if (this.LJ.LIZJ()) {
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
                Drawable drawable = (Drawable) this.LJIIL.getValue();
                drawable.setAlpha(20);
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
                Drawable drawable2 = (Drawable) this.LJIIL.getValue();
                drawable2.setAlpha(10);
                viewFindViewById2.setBackground(drawable2);
                C786410Ut5.LJLLLLLL(0, viewFindViewById2);
            }
            TuxTextView tuxTextView2 = (TuxTextView) view.findViewById(R.id.gn1);
            if (this.LJ.LIZLLL()) {
                tuxTextView2.setBackground((Drawable) this.LJIIJJI.getValue());
                C786410Ut5.LLLLZLL(tuxTextView2, 0);
            } else {
                C786410Ut5.LLLLZLL(tuxTextView2, 8);
            }
        }
        if (z2) {
            C0H9H.LJFF(C0H9H.LIZIZ(6), view);
        } else {
            C0H9H.LJFF(C0H9H.LIZIZ(0), view);
        }
    }
}
