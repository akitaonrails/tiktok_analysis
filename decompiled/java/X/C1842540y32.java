package X;

import android.view.View;
import android.view.ViewGroup;
import androidx.cardview.widget.CardView;

/* JADX INFO: renamed from: X.0y32, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1842540y32 extends AbstractC1842530y31 {
    public static final int LJJIIZ = (int) C497740JfY.LIZIZ(3.0f);
    public static final int LJJIIZI = (int) C497740JfY.LIZIZ(4.0f);
    public static final int LJJIJ = (int) C497740JfY.LIZIZ(6.0f);
    public static final int LJJIJIIJI = (int) C497740JfY.LIZIZ(5.0f);

    public C1842540y32(CardView cardView, C1842430y2r c1842430y2r) {
        super(cardView, c1842430y2r);
    }

    public static final void LJIJ(int i, View view) {
        ViewGroup.MarginLayoutParams marginLayoutParams;
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (!(layoutParams instanceof ViewGroup.MarginLayoutParams) || (marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams) == null || marginLayoutParams.getMarginStart() == i) {
            return;
        }
        marginLayoutParams.setMarginStart(i);
        C786410Ut5.W5(view, marginLayoutParams);
    }
}
