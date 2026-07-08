package X;

import android.content.Context;
import android.graphics.PointF;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0eRK, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1088800eRK extends FrameLayout {
    public final View LL;
    public final View LLILLJJLI;
    public final View LLILLL;
    public final View LLILZ;

    public final PointF LIZIZ() {
        ViewGroup.LayoutParams layoutParams;
        ViewGroup.LayoutParams layoutParams2;
        View view = this.LL;
        float f = 0.0f;
        float f2 = (view == null || (layoutParams2 = view.getLayoutParams()) == null) ? 0.0f : layoutParams2.width;
        View view2 = this.LLILLJJLI;
        if (view2 != null && (layoutParams = view2.getLayoutParams()) != null) {
            f = layoutParams.height;
        }
        return new PointF(f2, f);
    }

    public C1088800eRK(Context context) {
        super(context, null, 0);
        C786410Ut5.Td(C786410Ut5.ne(context), R.layout.d2a, this, true);
        this.LL = findViewById(R.id.mkf);
        this.LLILLJJLI = findViewById(R.id.ybn);
        this.LLILLL = findViewById(R.id.tlp);
        this.LLILZ = findViewById(R.id.cev);
    }

    public final void setHeight(int i) {
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        layoutParams.height = i;
        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(this);
        setLayoutParams(layoutParams);
    }

    public static void LIZ(View view, int i, int i2, int i3, int i4) {
        ViewGroup.MarginLayoutParams marginLayoutParams;
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (!(layoutParams instanceof ViewGroup.MarginLayoutParams) || (marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams) == null) {
            marginLayoutParams = new ViewGroup.MarginLayoutParams(-2, -2);
        }
        marginLayoutParams.height = i2;
        marginLayoutParams.width = i;
        marginLayoutParams.topMargin = i3;
        marginLayoutParams.bottomMargin = i4;
        C786410Ut5.W5(view, marginLayoutParams);
    }
}
