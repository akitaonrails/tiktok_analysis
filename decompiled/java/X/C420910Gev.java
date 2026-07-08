package X;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0Gev, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C420910Gev extends TuxTextView {
    public final C01GW LLJJJJ;
    public final C01GW LLJJJJJIL;
    public final C01GW LLJJJJLIIL;

    private final int getHasIconPaddingLeft() {
        return ((Number) this.LLJJJJJIL.getValue()).intValue();
    }

    private final int getHasIconPaddingRight() {
        return ((Number) this.LLJJJJLIIL.getValue()).intValue();
    }

    private final int getNoIconPadding() {
        return ((Number) this.LLJJJJ.getValue()).intValue();
    }

    @Override // android.widget.TextView, android.view.View
    public final void onDraw(Canvas canvas) {
        int intrinsicWidth;
        Drawable[] compoundDrawables = getCompoundDrawables();
        if (compoundDrawables.length == 4) {
            Drawable drawable = compoundDrawables[0];
            Drawable drawable2 = compoundDrawables[2];
            float fMeasureText = getPaint().measureText(getText().toString());
            if (drawable == null && drawable2 == null) {
                setGravity(17);
                if (getPaddingStart() != getNoIconPadding()) {
                    setPadding(getNoIconPadding(), getPaddingTop(), getNoIconPadding(), getPaddingBottom());
                }
            } else {
                int compoundDrawablePadding = getCompoundDrawablePadding();
                if (drawable != null) {
                    intrinsicWidth = drawable.getIntrinsicWidth();
                } else {
                    intrinsicWidth = drawable2.getIntrinsicWidth();
                }
                float paddingStart = fMeasureText + intrinsicWidth + compoundDrawablePadding + getPaddingStart() + getPaddingEnd();
                if (drawable != null) {
                    setGravity(19);
                    canvas.translate((getWidth() - paddingStart) / 2, 0.0f);
                } else {
                    setGravity(21);
                    canvas.translate((paddingStart - getWidth()) / 2, 0.0f);
                }
                if (C1899620zX6.LIZ()) {
                    if (getPaddingStart() != getHasIconPaddingRight() || getPaddingEnd() != getHasIconPaddingLeft()) {
                        setPadding(getHasIconPaddingRight(), getPaddingTop(), getHasIconPaddingLeft(), getPaddingBottom());
                    }
                } else if (getPaddingStart() != getHasIconPaddingLeft() || getPaddingEnd() != getHasIconPaddingRight()) {
                    setPadding(getHasIconPaddingLeft(), getPaddingTop(), getHasIconPaddingRight(), getPaddingBottom());
                }
            }
        }
        super.onDraw(canvas);
    }

    public C420910Gev(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.z4);
        EnumC452301pR enumC452301pR = EnumC452301pR.NONE;
        this.LLJJJJ = C452501pT.LIZ(enumC452301pR, AnonymousClass0206.get$arr$(538));
        this.LLJJJJJIL = C452501pT.LIZ(enumC452301pR, AnonymousClass0206.get$arr$(536));
        this.LLJJJJLIIL = C452501pT.LIZ(enumC452301pR, AnonymousClass0206.get$arr$(537));
    }
}
