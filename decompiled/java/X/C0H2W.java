package X;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0H2W, reason: invalid class name */
/* JADX INFO: loaded from: classes7.dex */
public final class C0H2W extends FrameLayout {
    public static final C0H2U LLILZLL = new C0H2U();
    public final View LL;
    public final TuxTextView LLILLJJLI;
    public final C427760Gpy LLILLL;
    public final TuxIconView LLILZ;
    public Integer LLILZIL;

    public final void setEndIcon(C419910GdJ c419910GdJ) {
        TuxIconView tuxIconView = this.LLILZ;
        if (tuxIconView != null) {
            tuxIconView.setTuxIcon(c419910GdJ);
        }
    }

    public final void setHorizontalPadding(int i) {
        View view = this.LL;
        if (view != null) {
            C1591860rWi.LJFF(i, view);
        }
    }

    public C0H2W(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        C786410Ut5.Td(C786410Ut5.ne(context), R.layout.f3_, this, true);
        this.LL = findViewById(R.id.vqx);
        this.LLILLJJLI = (TuxTextView) findViewById(R.id.tv_source_from_entities);
        this.LLILLL = (C427760Gpy) findViewById(R.id.bkc);
        this.LLILZ = (TuxIconView) findViewById(R.id.k3x);
    }
}
