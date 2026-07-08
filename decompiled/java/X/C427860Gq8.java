package X;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.ss.android.ugc.aweme.base.ImageUrlModel;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AwS550S0100000_6;

/* JADX INFO: renamed from: X.0Gq8, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C427860Gq8 extends FrameLayout {
    public final View LL;
    public final C01GW LLILLJJLI;
    public final C01GW LLILLL;

    private final C427660Gpo getAvatar1() {
        return (C427660Gpo) this.LLILLJJLI.getValue();
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public CharSequence getAccessibilityClassName() {
        return ImageView.class.getName();
    }

    public final C425790Gmn getAvatar2() {
        return (C425790Gmn) this.LLILLL.getValue();
    }

    public C427860Gq8(Context context) {
        super(context, null);
        this.LL = C786410Ut5.Sd(R.layout.c7o, C786410Ut5.ne(context), this);
        this.LLILLJJLI = C452501pT.LIZIZ(new AwS550S0100000_6(this, 1151));
        this.LLILLL = C452501pT.LIZIZ(new AwS550S0100000_6(this, 1152));
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

    public static void LIZ(C427860Gq8 c427860Gq8, ImageUrlModel imageUrlModel) {
        C427660Gpo.LJIIJJI(c427860Gq8.getAvatar1(), imageUrlModel, true, null, null, false, true, null, null, false, null, 768);
    }
}
