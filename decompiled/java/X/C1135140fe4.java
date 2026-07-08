package X;

import Y.ACListenerS152S0100000_17;
import android.content.Context;
import android.content.res.TypedArray;
import android.text.StaticLayout;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.bytedance.android.live.design.view.icon.LiveIconView;
import com.ss.android.ugc.aweme.app.R$styleable;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0fe4, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1135140fe4 extends LinearLayout {
    public final C16F5 LL;
    public final LiveIconView LLILLJJLI;
    public final int LLILLL;
    public final int LLILZ;
    public Function1<? super Boolean, Unit> LLILZIL;
    public boolean LLILZLL;

    public final CharSequence getText() {
        CharSequence text;
        C16F5 c16f5 = this.LL;
        return (c16f5 == null || (text = c16f5.getText()) == null) ? "" : text;
    }

    public final int LIZ(boolean z) {
        int i;
        int i2;
        ViewGroup.MarginLayoutParams marginLayoutParams;
        ViewGroup.MarginLayoutParams marginLayoutParams2;
        C16F5 c16f5 = this.LL;
        int i3 = 0;
        if (c16f5 == null) {
            return 0;
        }
        StaticLayout.Builder includePad = StaticLayout.Builder.obtain(c16f5.getText(), 0, c16f5.getText().length(), c16f5.getPaint(), (c16f5.getMeasuredWidth() - c16f5.getCompoundPaddingStart()) - c16f5.getCompoundPaddingEnd()).setIncludePad(false);
        TextUtils.TruncateAt truncateAt = null;
        if (z) {
            truncateAt = TextUtils.TruncateAt.END;
        }
        StaticLayout.Builder ellipsize = includePad.setEllipsize(truncateAt);
        if (z) {
            i = this.LLILLL;
        } else {
            i = this.LLILZ;
        }
        int height = ellipsize.setMaxLines(i).setLineSpacing(c16f5.getLineSpacingExtra(), c16f5.getLineSpacingMultiplier()).build().getHeight() + getPaddingTop() + getPaddingBottom();
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if ((layoutParams instanceof ViewGroup.MarginLayoutParams) && (marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams) != null) {
            i2 = marginLayoutParams2.topMargin;
        } else {
            i2 = 0;
        }
        int i4 = height + i2;
        ViewGroup.LayoutParams layoutParams2 = getLayoutParams();
        if ((layoutParams2 instanceof ViewGroup.MarginLayoutParams) && (marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams2) != null) {
            i3 = marginLayoutParams.bottomMargin;
        }
        return i3 + i4;
    }

    public final void setIsExpanded(boolean z) {
        if (z) {
            C16F5 c16f5 = this.LL;
            if (c16f5 != null) {
                c16f5.setMaxLines(this.LLILZ);
            }
            LiveIconView liveIconView = this.LLILLJJLI;
            if (liveIconView != null) {
                liveIconView.setImageResource(R.drawable.esx);
            }
        } else {
            C16F5 c16f52 = this.LL;
            if (c16f52 != null) {
                c16f52.setMaxLines(this.LLILLL);
            }
            LiveIconView liveIconView2 = this.LLILLJJLI;
            if (liveIconView2 != null) {
                liveIconView2.setImageResource(R.drawable.esy);
            }
        }
        this.LLILZLL = z;
    }

    public final void setText(CharSequence charSequence) {
        C16F5 c16f5 = this.LL;
        if (c16f5 != null) {
            c16f5.setText(charSequence);
        }
    }

    public final void setToggleClickListener(Function1<? super Boolean, Unit> function1) {
        this.LLILZIL = function1;
    }

    public C1135140fe4(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        LinearLayout.inflate(context, R.layout.gzc, this);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.ExpandableTextView, 0, 0);
        this.LLILLL = typedArrayObtainStyledAttributes.getInt(R$styleable.ExpandableTextView_ttlive_collapsed_maxlines, 2);
        this.LLILZ = typedArrayObtainStyledAttributes.getInt(R$styleable.ExpandableTextView_ttlive_expanded_maxlines, 6);
        typedArrayObtainStyledAttributes.recycle();
        this.LL = (C16F5) findViewById(R.id.zf0);
        LiveIconView liveIconView = (LiveIconView) findViewById(R.id.ly1);
        this.LLILLJJLI = liveIconView;
        setIsExpanded(false);
        if (liveIconView != null) {
            C786410Ut5.g8(liveIconView, new ACListenerS152S0100000_17(this, 200));
        }
        if (isLaidOut() && !isLayoutRequested()) {
            if (LIZ(false) == LIZ(true) && liveIconView != null) {
                C500260Jjc.LJIILIIL(liveIconView);
                return;
            }
            return;
        }
        addOnLayoutChangeListener(new ViewOnLayoutChangeListenerC1151610g4d(this, 23));
    }
}
