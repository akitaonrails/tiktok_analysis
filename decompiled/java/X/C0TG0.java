package X;

import android.content.Context;
import android.widget.FrameLayout;
import com.bytedance.android.live.design.view.icon.LiveIconView;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AwS556S0100000_12;

/* JADX INFO: renamed from: X.0TG0, reason: invalid class name */
/* JADX INFO: loaded from: classes13.dex */
public final class C0TG0 extends FrameLayout {
    public final C01GW LL;
    public final C01GW LLILLJJLI;

    private final LiveIconView getIcon() {
        return (LiveIconView) this.LL.getValue();
    }

    private final C16F5 getText() {
        return (C16F5) this.LLILLJJLI.getValue();
    }

    public C0TG0(Context context) {
        super(context, null, 0);
        C786410Ut5.Td(C786410Ut5.ne(context), R.layout.hr2, this, true);
        setWillNotDraw(false);
        this.LL = C452501pT.LIZIZ(new AwS556S0100000_12(this, 915));
        this.LLILLJJLI = C452501pT.LIZIZ(new AwS556S0100000_12(this, 916));
    }

    public final void LIZ(boolean z) {
        if (z) {
            getIcon().setIcon(C20736316Cj.LIZLLL(R.attr.d2k, getContext()));
            getText().setText(C497740JfY.LJIJI(2131854568));
        } else {
            getIcon().setIcon(C20736316Cj.LIZLLL(R.attr.d3m, getContext()));
            getText().setText(C497740JfY.LJIJI(2131853410));
        }
    }
}
