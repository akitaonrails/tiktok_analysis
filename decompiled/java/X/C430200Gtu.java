package X;

import Y.AObjectS381S0100000_6;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.ss.android.ugc.aweme.app.R$styleable;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0Gtu, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C430200Gtu extends FrameLayout {
    public final View LL;
    public final C01GW LLILLJJLI;
    public final C01GW LLILLL;

    public C430200Gtu(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4);
    }

    private final C427660Gpo getAvatar1() {
        return (C427660Gpo) this.LLILLJJLI.getValue();
    }

    private final C425760Gmk getAvatar2() {
        return (C425760Gmk) this.LLILLL.getValue();
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public CharSequence getAccessibilityClassName() {
        return ImageView.class.getName();
    }

    private final void setSizeDp(int i) {
        int i2 = (i * 3) / 4;
        int iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Integer.valueOf(i - i2)));
        getAvatar1().setSize(i2);
        getAvatar2().setSize(i2);
        C426750GoL.LJII(getAvatar1(), 0, Integer.valueOf(iLIZIZ), Integer.valueOf(iLIZIZ), 0, false);
        C426750GoL.LJII(getAvatar2(), Integer.valueOf(iLIZIZ), 0, 0, Integer.valueOf(iLIZIZ), false);
        requestLayout();
    }

    public final void setSize(int i) {
        setSizeDp(i);
    }

    public static void LIZ(C430200Gtu c430200Gtu, Object obj) {
        C427660Gpo.LJIIJJI(c430200Gtu.getAvatar1(), obj, true, null, null, false, true, null, null, false, null, 768);
    }

    public static void LIZIZ(C430200Gtu c430200Gtu, Object obj) {
        C425760Gmk avatar2 = c430200Gtu.getAvatar2();
        avatar2.LLJZIJLIL = true;
        avatar2.invalidate();
        C427660Gpo.LJIIJJI(c430200Gtu.getAvatar2(), obj, true, null, null, false, false, null, null, false, null, 768);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public C430200Gtu(Context context, AttributeSet attributeSet, int i) {
        int i2;
        attributeSet = (i & 2) != 0 ? null : attributeSet;
        if ((i & 4) != 0) {
            i2 = R.attr.xu;
        } else {
            i2 = 0;
        }
        super(context, attributeSet, i2);
        this.LL = C786410Ut5.Sd(R.layout.fx, C786410Ut5.ne(context), this);
        this.LLILLJJLI = C452501pT.LIZIZ(new AObjectS381S0100000_6(this, 0));
        this.LLILLL = C452501pT.LIZIZ(new AObjectS381S0100000_6(this, 1));
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.TuxDualAvatarView, i2, 0);
            setSizeDp(typedArrayObtainStyledAttributes.getInt(R$styleable.TuxDualAvatarView_tux_dualAvatarSize, 72));
            typedArrayObtainStyledAttributes.recycle();
            return;
        }
        setSizeDp(72);
    }
}
