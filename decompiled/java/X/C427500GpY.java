package X;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AwS550S0100000_6;

/* JADX INFO: renamed from: X.0GpY, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C427500GpY extends FrameLayout {
    public final View LL;
    public final C01GW LLILLJJLI;
    public final C01GW LLILLL;
    public int LLILZ;

    private final C427660Gpo getAvatar1() {
        return (C427660Gpo) this.LLILLJJLI.getValue();
    }

    private final C425770Gml getAvatar2() {
        return (C425770Gml) this.LLILLL.getValue();
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public CharSequence getAccessibilityClassName() {
        return ImageView.class.getName();
    }

    private final void setSizeDp(int i) {
        this.LLILZ = i;
        getAvatar1().setSize(this.LLILZ);
        getAvatar2().setSize(this.LLILZ);
        requestLayout();
    }

    public final void setSize(int i) {
        setSizeDp(i);
    }

    public C427500GpY(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.LL = C786410Ut5.Sd(R.layout.ft, C786410Ut5.ne(context), this);
        this.LLILLJJLI = C452501pT.LIZIZ(new AwS550S0100000_6(this, 1226));
        this.LLILLL = C452501pT.LIZIZ(new AwS550S0100000_6(this, 1227));
        this.LLILZ = 22;
    }

    public static void LIZ(C427500GpY c427500GpY, C03IT c03it) {
        C427660Gpo.LJIIJJI(c427500GpY.getAvatar1(), c03it, true, null, null, false, true, null, null, false, null, 768);
    }

    public static void LIZIZ(C427500GpY c427500GpY, C03IT c03it) {
        C425770Gml avatar2 = c427500GpY.getAvatar2();
        avatar2.LLJZIJLIL = true;
        avatar2.invalidate();
        C427660Gpo.LJIIJJI(c427500GpY.getAvatar2(), c03it, true, null, null, false, false, null, null, false, null, 768);
    }
}
