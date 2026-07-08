package X;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AwS550S0100000_6;

/* JADX INFO: renamed from: X.0Gdt, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C420270Gdt extends FrameLayout {
    public final C01GW LL;
    public final C01GW LLILLJJLI;

    private final View getProgressView() {
        return (View) this.LLILLJJLI.getValue();
    }

    private final View getTrackView() {
        return (View) this.LL.getValue();
    }

    public final void setProgress(float f) {
        C786410Ut5.Jc(getProgressView(), (getTrackView().getWidth() - getProgressView().getWidth()) * f);
        getProgressView().requestLayout();
    }

    public C420270Gdt(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.LL = C452501pT.LIZIZ(new AwS550S0100000_6(this, 1449));
        this.LLILLJJLI = C452501pT.LIZIZ(new AwS550S0100000_6(this, 1448));
        C786410Ut5.Td(C786410Ut5.ne(context), R.layout.apt, this, true);
        View trackView = getTrackView();
        C384050F3z c384050F3z = new C384050F3z();
        c384050F3z.LIZJ = Float.valueOf(C418440Gaw.LIZIZ(10));
        c384050F3z.LIZIZ = Integer.valueOf(R.attr.a02);
        trackView.setBackground(c384050F3z.LIZ(context));
        View progressView = getProgressView();
        C384050F3z c384050F3z2 = new C384050F3z();
        c384050F3z2.LIZJ = Float.valueOf(C418440Gaw.LIZIZ(10));
        c384050F3z2.LIZIZ = Integer.valueOf(R.attr.a00);
        progressView.setBackground(c384050F3z2.LIZ(context));
    }
}
