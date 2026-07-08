package X;

import android.content.Context;
import android.content.res.TypedArray;
import android.text.Layout;
import android.util.AttributeSet;
import android.view.View;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.ss.android.ugc.aweme.app.R$styleable;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AFwS205S0000000_17;
import kotlin.jvm.internal.AwS561S0100000_17;

/* JADX INFO: renamed from: X.0f6H, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1114190f6H extends ConstraintLayout implements InterfaceC1113760f5a {
    public final C01GW LL;
    public final C01GW LLILLJJLI;
    public final C01GW LLILLL;
    public final int LLILZ;
    public C1112330f3H LLILZIL;

    private final TextView getAction() {
        return (TextView) this.LL.getValue();
    }

    private final int getActionMaxWidth() {
        return ((Number) this.LLILLL.getValue()).intValue();
    }

    private final TextView getContent() {
        return (TextView) this.LLILLJJLI.getValue();
    }

    @Override // X.InterfaceC1113760f5a
    public View getActionView() {
        return getAction();
    }

    @Override // X.InterfaceC1113760f5a
    public View getContentView() {
        return getContent();
    }

    @Override // X.InterfaceC1113760f5a
    public final void LJLJLLL(InterfaceC1113740f5Y interfaceC1113740f5Y) {
        C1112330f3H c1112330f3H;
        getContent().setText(interfaceC1113740f5Y.getContent());
        getAction().setText(interfaceC1113740f5Y.getActionText());
        if (interfaceC1113740f5Y instanceof C1112330f3H) {
            c1112330f3H = (C1112330f3H) interfaceC1113740f5Y;
        } else {
            c1112330f3H = null;
        }
        this.LLILZIL = c1112330f3H;
    }

    public C1114190f6H(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        float f;
        Integer numValueOf;
        if (this.LLILZ == 1) {
            f = 14.0f;
        } else {
            f = 12.0f;
        }
        int i3 = (int) f;
        getAction().setTextSize(1, f);
        getAction().setMaxWidth(Integer.MAX_VALUE);
        getContent().setTextSize(1, f);
        getContent().setMaxLines(Integer.MAX_VALUE);
        super.onMeasure(i, i2);
        Layout layout = getContent().getLayout();
        if (layout != null) {
            numValueOf = Integer.valueOf(layout.getLineCount());
        } else {
            numValueOf = null;
        }
        if (getAction().getMeasuredWidth() > getActionMaxWidth() || (numValueOf != null && numValueOf.intValue() > 3)) {
            getAction().setTextSize(1, 9.0f);
            getAction().setMaxWidth(getActionMaxWidth());
            getContent().setTextSize(1, 9.0f);
            getContent().setMaxLines(3);
            super.onMeasure(i, i2);
            i3 = 9;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("capsule view width: ");
        sbLIZ.append(getMeasuredWidth());
        sbLIZ.append(", ");
        sbLIZ.append(this.LLILZ);
        C20441214yg.LIZLLL(C2188811AlT.LIZIZ(sbLIZ));
        C519270KYb c519270KYb = C519270KYb.LIZ;
        C1112330f3H c1112330f3H = this.LLILZIL;
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        Layout layout2 = getContent().getLayout();
        TextView action = getAction();
        c519270KYb.getClass();
        C519270KYb.LIZ(false, c1112330f3H, measuredWidth, measuredHeight, i3, -1, -1, layout2, action, false);
    }

    public C1114190f6H(Context context, AttributeSet attributeSet, int i) {
        int i2;
        super(context, attributeSet, i);
        this.LL = C452501pT.LIZIZ(new AwS561S0100000_17(this, 97));
        this.LLILLJJLI = C452501pT.LIZIZ(new AwS561S0100000_17(this, 98));
        this.LLILLL = C452501pT.LIZIZ(AFwS205S0000000_17.get$arr$(19));
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.CapsuleMessageView);
        int i3 = typedArrayObtainStyledAttributes.getInt(R$styleable.CapsuleMessageView_style, 0);
        this.LLILZ = i3;
        typedArrayObtainStyledAttributes.recycle();
        if (i3 == 1) {
            i2 = R.layout.gpw;
        } else {
            i2 = R.layout.gpv;
        }
        C500260Jjc.LJIILL(i2, this, true);
    }
}
