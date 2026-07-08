package X;

import Y.ACListenerS47S0101000_1;
import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.bytedance.tt.reliability.monitor.viewchecker.RemoveViewCausedNPEChecker;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.03s8, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C978603s8 extends LinearLayout {
    public Function1<? super Integer, Unit> LL;
    public int LLILLJJLI;

    public final void LIZ() {
        TextView textView;
        int i;
        int i2;
        int childCount = getChildCount();
        for (int i3 = 0; i3 < childCount; i3++) {
            View childAt = getChildAt(i3);
            if ((childAt instanceof TuxTextView) && (textView = (TextView) childAt) != null) {
                if (i3 == this.LLILLJJLI) {
                    i = R.attr.a00;
                    i2 = R.attr.a0o;
                } else {
                    i = R.attr.a03;
                    i2 = R.attr.a1j;
                }
                GradientDrawable gradientDrawable = new GradientDrawable();
                gradientDrawable.setCornerRadius(C418440Gaw.LIZIZ(Integer.valueOf(EnumC1166860gTE.CAPSULE.getCornerRadiusDp())));
                Integer numLIZJ = C1308910kAL.LIZJ(i, getContext());
                gradientDrawable.setColor(numLIZJ != null ? numLIZJ.intValue() : 0);
                textView.setBackground(gradientDrawable);
                Integer numLIZJ2 = C1308910kAL.LIZJ(i2, getContext());
                textView.setTextColor(numLIZJ2 != null ? numLIZJ2.intValue() : 0);
            }
        }
    }

    public final void setOnTabSelectedListener(Function1<? super Integer, Unit> function1) {
        this.LL = function1;
    }

    public final void setSelectedIndex(int i) {
        if (i >= 0 && i < getChildCount() && this.LLILLJJLI != i) {
            this.LLILLJJLI = i;
            LIZ();
        }
    }

    public final void setTitles(List<String> list) {
        RemoveViewCausedNPEChecker.recordViewRemovedPoint(this, null);
        removeAllViews();
        this.LLILLJJLI = 0;
        int i = 0;
        for (String str : list) {
            int i2 = i + 1;
            if (i >= 0) {
                String str2 = str;
                LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(0, (int) C418440Gaw.LIZIZ(32));
                layoutParams.weight = 1.0f;
                if (i > 0) {
                    layoutParams.setMarginStart((int) C418440Gaw.LIZIZ(4));
                }
                TuxTextView tuxTextView = new TuxTextView(getContext(), null, 6, 0);
                tuxTextView.setPadding(C0H9H.LIZIZ(12), 0, C0H9H.LIZIZ(12), 0);
                tuxTextView.setText(str2);
                tuxTextView.setGravity(17);
                tuxTextView.setTuxFont(52);
                tuxTextView.setMaxLines(1);
                tuxTextView.setEllipsize(TextUtils.TruncateAt.END);
                C786410Ut5.h9(tuxTextView, new ACListenerS47S0101000_1(this, i, 1));
                addView(tuxTextView, layoutParams);
                i = i2;
            } else {
                C1697810uHb.LJIJI();
                throw null;
            }
        }
        LIZ();
    }

    public C978603s8(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        setOrientation(0);
    }
}
