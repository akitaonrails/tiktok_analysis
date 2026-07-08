package X;

import Y.ALAdapterS4S0000000_29;
import Y.AUListenerS256S0100000_6;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.graphics.Paint;
import android.text.TextPaint;
import android.text.TextUtils;
import android.view.ViewGroup;
import android.view.animation.LinearInterpolator;
import com.bytedance.tux.input.TuxTextView;
import kotlin.jvm.internal.AFwS218S0000000_29;

/* JADX INFO: renamed from: X.11yk, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public abstract class AbstractC19677211yk extends C187K {
    public final int LJIIIZ;
    public final C01GW LJIIJ;

    public abstract int LJJ();

    public AbstractC19677211yk(int i, ViewGroup viewGroup) {
        super(i, viewGroup);
        this.LJIIIZ = C1210230hbB.LIZ(40, this.LIZJ);
        this.LJIIJ = C452501pT.LIZIZ(AFwS218S0000000_29.get$arr$(352));
    }

    public final AnimatorSet LJIL(TuxTextView tuxTextView, ViewGroup viewGroup) {
        int i;
        AnimatorSet animatorSet = new AnimatorSet();
        C786410Ut5.LJLZ(0, viewGroup);
        C786410Ut5.R4(0.0f, viewGroup);
        CharSequence text = tuxTextView.getText();
        if (text != null) {
            if (tuxTextView.getEllipsize() == TextUtils.TruncateAt.MARQUEE) {
                AnimatorSet.Builder builderPlay = animatorSet.play(AnonymousClass1889.LIZ(viewGroup, LJJ(), null, 12));
                TextPaint paint = tuxTextView.getPaint();
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append((Object) text);
                sbLIZ.append("     ");
                int iMeasureText = (int) paint.measureText(C2188811AlT.LIZIZ(sbLIZ));
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append((Object) text);
                sbLIZ2.append("     ");
                sbLIZ2.append((Object) text);
                tuxTextView.setText(C2188811AlT.LIZIZ(sbLIZ2));
                int[] iArr = new int[2];
                iArr[0] = 0;
                if (C444960Hcc.LIZJ(this.LIZJ)) {
                    i = -iMeasureText;
                } else {
                    i = iMeasureText;
                }
                iArr[1] = i;
                ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(iArr);
                valueAnimatorOfInt.setInterpolator(new LinearInterpolator());
                valueAnimatorOfInt.setDuration((long) (((iMeasureText * 1.0f) / this.LJIIIZ) * 1000));
                valueAnimatorOfInt.addUpdateListener(new AUListenerS256S0100000_6(tuxTextView, 80));
                valueAnimatorOfInt.addListener(new ALAdapterS4S0000000_29(0));
                valueAnimatorOfInt.setStartDelay(500L);
                builderPlay.before(valueAnimatorOfInt);
            } else {
                animatorSet.play(AnonymousClass1889.LIZ(viewGroup, LJJ(), null, 12));
                return animatorSet;
            }
        }
        return animatorSet;
    }

    public final void LJJI(TuxTextView tuxTextView, float f) {
        Paint paint = new Paint(tuxTextView.getPaint());
        paint.setTextSize(C1210230hbB.LIZ(9, this.LIZJ));
        CharSequence text = tuxTextView.getText();
        if (text == null) {
            return;
        }
        if (paint.measureText(text.toString()) > f) {
            tuxTextView.setSingleLine(false);
            tuxTextView.LJJJJI(9.0f);
            tuxTextView.setEllipsize(TextUtils.TruncateAt.MARQUEE);
            tuxTextView.setHorizontallyScrolling(true);
            tuxTextView.setMarqueeRepeatLimit(0);
            return;
        }
        tuxTextView.setSingleLine(true);
        tuxTextView.setHorizontallyScrolling(false);
        tuxTextView.setMaxLines(1);
        tuxTextView.setMaxWidth((int) f);
        tuxTextView.setEllipsize(TextUtils.TruncateAt.END);
        tuxTextView.setMinTextSize(9.0f);
        tuxTextView.requestLayout();
    }
}
