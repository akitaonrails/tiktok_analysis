package X;

import android.content.Context;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.bytedance.android.live.design.view.icon.LiveIconView;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AwS556S0100000_12;

/* JADX INFO: renamed from: X.0UXv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C774010UXv extends FrameLayout {
    public final int LL;
    public final C01GW LLILLJJLI;
    public final C01GW LLILLL;
    public final C01GW LLILZ;

    private final ImageView getIcon() {
        return (ImageView) this.LLILLJJLI.getValue();
    }

    private final LiveIconView getIconView() {
        return (LiveIconView) this.LLILZ.getValue();
    }

    private final C16F5 getText() {
        return (C16F5) this.LLILLL.getValue();
    }

    public final int getLayoutId() {
        return this.LL;
    }

    public final void LIZ(boolean z) {
        if (z) {
            ImageView icon = getIcon();
            if (icon != null) {
                icon.setImageResource(R.drawable.evm);
            }
            LiveIconView iconView = getIconView();
            if (iconView != null) {
                iconView.setIconAttr(R.attr.cqz);
            }
            C16F5 text = getText();
            if (text != null) {
                text.setText(C497740JfY.LJIJI(2131842003));
                return;
            }
            return;
        }
        ImageView icon2 = getIcon();
        if (icon2 != null) {
            icon2.setImageResource(R.drawable.evk);
        }
        LiveIconView iconView2 = getIconView();
        if (iconView2 != null) {
            iconView2.setIconAttr(R.attr.cr2);
        }
        C16F5 text2 = getText();
        if (text2 == null) {
            return;
        }
        text2.setText(C497740JfY.LJIJI(2131842002));
    }

    public C774010UXv(Context context, int i) {
        super(context);
        this.LL = i;
        this.LLILLJJLI = C452501pT.LIZIZ(new AwS556S0100000_12(this, 917));
        this.LLILLL = C452501pT.LIZIZ(new AwS556S0100000_12(this, 919));
        this.LLILZ = C452501pT.LIZIZ(new AwS556S0100000_12(this, 918));
        C786410Ut5.Td(C786410Ut5.ne(context), i, this, true);
        setWillNotDraw(false);
    }
}
