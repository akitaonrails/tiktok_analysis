package X;

import android.view.View;
import android.view.ViewGroup;
import androidx.cardview.widget.CardView;
import com.bytedance.android.livesdk.rank.api.RankTypeV2;

/* JADX INFO: renamed from: X.0y30, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1842520y30 extends AbstractC1842530y31 {
    public static final int LJJIIZ = (int) C497740JfY.LIZIZ(3.0f);
    public static final int LJJIIZI = (int) C497740JfY.LIZIZ(5.0f);
    public static final int LJJIJ = (int) C497740JfY.LIZIZ(4.0f);
    public static final int LJJIJIIJI = (int) C497740JfY.LIZIZ(6.0f);

    public final void LJIJ() {
        C1810410xDD c1810410xDD;
        RankTypeV2 rankTypeV2;
        C1842430y2r c1842430y2r = this.LIZIZ;
        c1842430y2r.LJIL = null;
        InterfaceC1842810y3T interfaceC1842810y3T = c1842430y2r.LIZIZ;
        C1842470y2v c1842470y2v = c1842430y2r.LJIILLIIL;
        if (interfaceC1842810y3T.LJLJJL((c1842470y2v == null || (c1810410xDD = c1842470y2v.LIZ) == null || (rankTypeV2 = c1810410xDD.LIZIZ) == null) ? 0 : rankTypeV2.type)) {
            return;
        }
        LJIIZILJ();
        this.LIZIZ.LIZJ();
    }

    public C1842520y30(CardView cardView, C1842430y2r c1842430y2r) {
        super(cardView, c1842430y2r);
    }

    public static final void LJIJI(int i, View view) {
        ViewGroup.MarginLayoutParams marginLayoutParams;
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (!(layoutParams instanceof ViewGroup.MarginLayoutParams) || (marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams) == null || marginLayoutParams.getMarginStart() == i) {
            return;
        }
        marginLayoutParams.setMarginStart(i);
        C786410Ut5.W5(view, marginLayoutParams);
    }
}
