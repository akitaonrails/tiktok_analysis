package X;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.bytedance.mt.protector.impl.color.ColorProtector;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0bzn, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C994850bzn extends FrameLayout {
    public final LinearLayout LL;
    public final LinearLayout LLILLJJLI;
    public final C16F5 LLILLL;
    public final C16F5 LLILZ;
    public ObjectAnimator LLILZIL;
    public ObjectAnimator LLILZLL;
    public ObjectAnimator LLIZ;
    public ObjectAnimator LLIZLLLIL;
    public ObjectAnimator LLJ;
    public ObjectAnimator LLJI;
    public AnimatorSet LLJIJIL;
    public AnimatorSet LLJILJIL;

    public final void setHighGearDuration(long j) {
        C16F5 c16f5 = this.LLILZ;
        if (c16f5 != null) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(j);
            sbLIZ.append('s');
            c16f5.setText(C2188811AlT.LIZIZ(sbLIZ));
        }
    }

    public final void setLowGearDuration(long j) {
        C16F5 c16f5 = this.LLILLL;
        if (c16f5 != null) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(j);
            sbLIZ.append('s');
            c16f5.setText(C2188811AlT.LIZIZ(sbLIZ));
        }
    }

    public C994850bzn(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        FrameLayout.inflate(context, R.layout.gas, this);
        setBackground(C800330VaR.LIZIZ(context, R.drawable.e7t));
        this.LL = (LinearLayout) getRootView().findViewById(R.id.ns3);
        this.LLILLL = (C16F5) getRootView().findViewById(R.id.m28);
        this.LLILLJJLI = (LinearLayout) getRootView().findViewById(R.id.jmc);
        C16F5 c16f5 = (C16F5) getRootView().findViewById(R.id.m29);
        this.LLILZ = c16f5;
        if (c16f5 != null) {
            c16f5.setTextColor(ColorProtector.parseColor("#F2EEFF"));
        }
    }

    public final void LIZ(int i, long j) {
        if (i == 20) {
            LinearLayout linearLayout = this.LL;
            if (linearLayout != null) {
                C786410Ut5.LJZL(8, linearLayout);
            }
            LinearLayout linearLayout2 = this.LLILLJJLI;
            if (linearLayout2 != null) {
                C786410Ut5.LJZL(0, linearLayout2);
            }
            setHighGearDuration(j);
            return;
        }
        LinearLayout linearLayout3 = this.LL;
        if (linearLayout3 != null) {
            C786410Ut5.LJZL(0, linearLayout3);
        }
        LinearLayout linearLayout4 = this.LLILLJJLI;
        if (linearLayout4 != null) {
            C786410Ut5.LJZL(8, linearLayout4);
        }
        setLowGearDuration(j);
    }
}
