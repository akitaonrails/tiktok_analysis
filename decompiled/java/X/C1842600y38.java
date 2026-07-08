package X;

import Y.ARunnableS32S0201000_27;
import Y.ARunnableS60S0300000_27;
import android.animation.ValueAnimator;
import android.text.Layout;
import android.view.View;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0y38, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1842600y38 extends AbstractC1842530y31 {
    public ARunnableS60S0300000_27 LJJIIZ;
    public int LJJIIZI;
    public ValueAnimator LJJIJ;
    public boolean LJJIJIIJI;

    public C1842600y38(CardView cardView, C1842430y2r c1842430y2r) {
        super(cardView, c1842430y2r);
    }

    @Override // X.AbstractC1842530y31
    public final void LJIIIZ(C1842470y2v c1842470y2v, C1842470y2v c1842470y2v2) {
        int lineWidth;
        CharSequence text = this.LJIILIIL.getText();
        int lineWidth2 = 0;
        if (this.LJIILIIL.getVisibility() == 0 && !Intrinsics.LJFF(text, "")) {
            this.LJIILIIL.measure(View.MeasureSpec.makeMeasureSpec(0, 0), View.MeasureSpec.makeMeasureSpec(0, 0));
            Layout layout = this.LJIILIIL.getLayout();
            if (layout != null) {
                lineWidth = (int) layout.getLineWidth(0);
            } else {
                lineWidth = 0;
            }
            if (lineWidth > this.LJIILIIL.getWidth()) {
                int i = this.LJJIIZI + 1;
                this.LJJIIZI = i;
                if (i == 0) {
                    ARunnableS60S0300000_27 aRunnableS60S0300000_27 = this.LJJIIZ;
                    this.LJJIIZ = null;
                    if (aRunnableS60S0300000_27 != null) {
                        aRunnableS60S0300000_27.run();
                    }
                }
                TextView textView = this.LJIILIIL;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append((Object) text);
                sbLIZ.append("     ");
                textView.setText(C2188811AlT.LIZIZ(sbLIZ));
                this.LJIILIIL.measure(View.MeasureSpec.makeMeasureSpec(0, 0), View.MeasureSpec.makeMeasureSpec(0, 0));
                Layout layout2 = this.LJIILIIL.getLayout();
                if (layout2 != null) {
                    lineWidth2 = (int) layout2.getLineWidth(0);
                }
                TextView textView2 = this.LJIILIIL;
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append((Object) text);
                sbLIZ2.append("     ");
                sbLIZ2.append((Object) text);
                textView2.setText(C2188811AlT.LIZIZ(sbLIZ2));
                HandlerHook.viewPost(this.LJIILIIL, new ARunnableS32S0201000_27(lineWidth2, this, text, 5));
                return;
            }
            this.LIZIZ.LJIJJLI = false;
            LJIILIIL(false);
            return;
        }
        this.LIZIZ.LJIJJLI = false;
        LJIILIIL(false);
    }
}
