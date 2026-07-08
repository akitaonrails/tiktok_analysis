package X;

import android.content.Context;
import android.content.res.TypedArray;
import android.text.method.LinkMovementMethod;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.app.R$styleable;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0GuS, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C430540GuS extends LinearLayout {
    public final View LL;
    public final TuxTextView LLILLJJLI;

    public C430540GuS(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4);
    }

    public final void setTitle(CharSequence charSequence) {
        this.LLILLJJLI.setMovementMethod(new LinkMovementMethod());
        if (charSequence != null && charSequence.length() > 0) {
            this.LLILLJJLI.setText(charSequence);
            C786410Ut5.LLLLZLL(this.LLILLJJLI, 0);
        } else {
            C786410Ut5.LLLLZLL(this.LLILLJJLI, 8);
        }
    }

    public final void setTitleAllCap(boolean z) {
        this.LLILLJJLI.setAllCaps(z);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public C430540GuS(Context context, AttributeSet attributeSet, int i) {
        attributeSet = (i & 2) != 0 ? null : attributeSet;
        super(context, attributeSet, 0);
        setOrientation(1);
        int iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16));
        C426750GoL.LJIIL(this, Integer.valueOf(iLIZIZ), null, Integer.valueOf(iLIZIZ), null, 26);
        View view = new View(context);
        this.LL = view;
        TuxTextView tuxTextView = new TuxTextView(context, null, 6, 0);
        this.LLILLJJLI = tuxTextView;
        Integer numLIZJ = C1308910kAL.LIZJ(R.attr.bx, context);
        if (numLIZJ != null) {
            setBackgroundColor(numLIZJ.intValue());
        }
        int iLIZIZ2 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(4));
        Integer numLIZJ2 = C1308910kAL.LIZJ(R.attr.nd, context);
        if (numLIZJ2 != null) {
            view.setBackgroundColor(numLIZJ2.intValue());
        }
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, 1);
        layoutParams.topMargin = iLIZIZ2;
        layoutParams.bottomMargin = iLIZIZ2;
        addView(view, layoutParams);
        tuxTextView.setTextColorRes(R.attr.a1k);
        tuxTextView.setTuxFont(62);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-2, -2);
        layoutParams2.topMargin = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(18));
        layoutParams2.bottomMargin = iLIZIZ2;
        addView(tuxTextView, layoutParams2);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.SettingDivider);
        CharSequence charSequenceXd = C786410Ut5.Xd(typedArrayObtainStyledAttributes, R$styleable.SettingDivider_dividerTitle);
        boolean z = typedArrayObtainStyledAttributes.getBoolean(R$styleable.SettingDivider_showDividerLine, true);
        boolean z2 = typedArrayObtainStyledAttributes.getBoolean(R$styleable.SettingDivider_titleAllCap, false);
        typedArrayObtainStyledAttributes.recycle();
        C786410Ut5.LJLLLLLL(z ? 0 : 8, view);
        setTitle(charSequenceXd);
        setTitleAllCap(z2);
    }
}
