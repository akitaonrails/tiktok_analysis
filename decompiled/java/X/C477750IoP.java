package X;

import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS586S0100000_7;

/* JADX INFO: renamed from: X.0IoP, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C477750IoP extends LinearLayout {
    public final TuxTextView LL;
    public final TuxTextView LLILLJJLI;
    public Function0<Unit> LLILLL;
    public Function0<Unit> LLILZ;

    public C477750IoP(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4);
    }

    public final void setHangoutInfoText(String str) {
        TuxTextView tuxTextView = this.LL;
        if (tuxTextView != null) {
            tuxTextView.setText(str);
        }
    }

    public final void setJoinText(String str) {
        if (str != null && str.length() != 0) {
            C500260Jjc.LJLJLJ(this.LLILLJJLI, true);
            TuxTextView tuxTextView = this.LLILLJJLI;
            if (tuxTextView != null) {
                tuxTextView.setText(str);
                return;
            }
            return;
        }
        C500260Jjc.LJLJLJ(this.LLILLJJLI, false);
    }

    public C477750IoP(Context context, AttributeSet attributeSet, int i) {
        super(context, (i & 2) != 0 ? null : attributeSet, 0);
        View viewInflate = LinearLayout.inflate(context, R.layout.di3, this);
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setColor(C497740JfY.LIZJ(R.attr.zh));
        gradientDrawable.setCornerRadius((int) C497740JfY.LIZIZ(16.0f));
        setBackground(gradientDrawable);
        viewInflate.findViewById(R.id.jvy);
        this.LL = (TuxTextView) viewInflate.findViewById(R.id.zp0);
        TuxTextView tuxTextView = (TuxTextView) viewInflate.findViewById(R.id.cla);
        this.LLILLJJLI = tuxTextView;
        if (tuxTextView != null) {
            C500260Jjc.LJLIIIL(500L, tuxTextView, new AwS586S0100000_7(this, 207));
        }
        C500260Jjc.LJLIIIL(500L, this, new AwS586S0100000_7(this, 208));
    }
}
