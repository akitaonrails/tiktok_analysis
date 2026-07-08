package X;

import android.content.Context;
import android.view.View;
import android.widget.LinearLayout;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;
import java.util.Set;
import kotlin.Pair;

/* JADX INFO: renamed from: X.0GrV, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C428710GrV extends LinearLayout {
    public final TuxTextView LL;
    public final TuxIconView LLILLJJLI;

    private final int getIconSize() {
        return C814420VxA.LIZIZ(C418440Gaw.LIZIZ(20));
    }

    public C428710GrV(Context context) {
        int i;
        Pair pair;
        super(context);
        TuxTextView tuxTextView = new TuxTextView(context, null, 6, 0);
        tuxTextView.setText("1");
        C786410Ut5.LLLLZLL(tuxTextView, 8);
        tuxTextView.setTuxFont(62);
        tuxTextView.setTextColor(C1618770sE7.LIZ(R.attr.a1h));
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        layoutParams.setMarginStart(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(4)));
        C786410Ut5.R6(tuxTextView, layoutParams);
        this.LL = tuxTextView;
        TuxIconView tuxIconView = new TuxIconView(context, null, 0, 6, null);
        C419910GdJ c419910GdJ = new C419910GdJ();
        if (C877920YcI.LIZ()) {
            i = R.raw.icon_filter;
        } else {
            i = R.raw.icon_control;
        }
        c419910GdJ.LIZ = i;
        c419910GdJ.LJ = Integer.valueOf(R.attr.a1h);
        c419910GdJ.LIZIZ = getIconSize();
        c419910GdJ.LIZJ = getIconSize();
        tuxIconView.setTuxIcon(c419910GdJ);
        this.LLILLJJLI = tuxIconView;
        setId(View.generateViewId());
        setGravity(17);
        if (C889930Yvf.LIZ.LJIIL()) {
            pair = new Pair(Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(28))), Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(20))));
        } else {
            pair = new Pair(Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(32))), Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(20))));
        }
        C19ME c19me = new C19ME(((Number) pair.getFirst()).intValue(), ((Number) pair.getSecond()).intValue());
        c19me.setMarginEnd(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12)));
        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(this);
        setLayoutParams(c19me);
        addView(tuxIconView);
        addView(tuxTextView);
        LIZ(C08CX.INSTANCE);
    }

    public final void LIZ(Set<? extends EnumC880480YgQ> set) {
        int iLIZ;
        boolean zLIZ = C883810Yln.LIZ(set);
        C889930Yvf c889930Yvf = C889930Yvf.LIZ;
        int i = 8;
        if (c889930Yvf.LJIIL()) {
            this.LLILLJJLI.setTintColor(C1618770sE7.LIZ(R.attr.a1h));
            C786410Ut5.LLLLZLL(this.LL, 8);
            return;
        }
        if (c889930Yvf.LJIIIZ()) {
            if (zLIZ) {
                iLIZ = C1618770sE7.LIZ(R.attr.j1);
            } else {
                iLIZ = C1618770sE7.LIZ(R.attr.a1h);
            }
            this.LLILLJJLI.setTintColor(iLIZ);
            TuxTextView tuxTextView = this.LL;
            if (zLIZ) {
                tuxTextView.setText(String.valueOf(set.size()));
                this.LL.setTextColor(iLIZ);
                i = 0;
            }
            C786410Ut5.LLLLZLL(tuxTextView, i);
            return;
        }
        this.LLILLJJLI.setTintColor(C1618770sE7.LIZ(R.attr.a1h));
        TuxTextView tuxTextView2 = this.LL;
        if (zLIZ) {
            i = 0;
        }
        C786410Ut5.LLLLZLL(tuxTextView2, i);
    }
}
