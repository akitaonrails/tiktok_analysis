package X;

import android.content.Context;
import android.content.res.TypedArray;
import android.view.View;
import android.widget.FrameLayout;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.app.R$styleable;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0FRN, reason: invalid class name */
/* JADX INFO: loaded from: classes6.dex */
public final class C0FRN extends FrameLayout {
    public final View LL;

    public final View getView() {
        return this.LL;
    }

    public C0FRN(Context context) {
        super(context, null, R.attr.z6);
        View viewTd = C786410Ut5.Td(C786410Ut5.ne(context), R.layout.c4d, this, true);
        this.LL = viewTd;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(null, R$styleable.TuxTooltip, R.attr.z6, 0);
        TuxTextView tuxTextView = (TuxTextView) viewTd.findViewById(R.id.o8v);
        tuxTextView.setTextColor(typedArrayObtainStyledAttributes.getColor(R$styleable.TuxTooltip__tux_tooltipMessageTextColor, -1));
        tuxTextView.setTuxFont(typedArrayObtainStyledAttributes.getInt(R$styleable.TuxTooltip__tux_tooltipMessageFont, 0));
        typedArrayObtainStyledAttributes.recycle();
    }
}
