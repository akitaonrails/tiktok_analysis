package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bytedance.android.live.design.view.icon.LiveIconView;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveReplayHighlightPageRefactorSetting;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AwS571S0100000_27;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0xrY, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1835420xrY extends ConstraintLayout {
    public static final /* synthetic */ int LLILZLL = 0;
    public final C01GW LL;
    public final C01GW LLILLJJLI;
    public final C01GW LLILLL;
    public final C01GW LLILZ;
    public final C01GW LLILZIL;

    private final TuxTextView getBottomDescView() {
        return (TuxTextView) this.LLILZ.getValue();
    }

    private final C1324720kZq getBottomIconView() {
        return (C1324720kZq) this.LLILLL.getValue();
    }

    private final C1324720kZq getCoverView() {
        return (C1324720kZq) this.LL.getValue();
    }

    private final C16F5 getPostedView() {
        return (C16F5) this.LLILLJJLI.getValue();
    }

    private final LiveIconView getProcessingView() {
        return (LiveIconView) this.LLILZIL.getValue();
    }

    public final void e0() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(3);
        sbLIZ.append(':');
        sbLIZ.append(4);
        setAspectRatio(C2188811AlT.LIZIZ(sbLIZ));
    }

    private final void setAspectRatio(String str) {
        if (str.length() != 0 && str.length() != 0) {
            ViewGroup.LayoutParams layoutParams = getLayoutParams();
            if (layoutParams instanceof C19ME) {
                C19ME c19me = (C19ME) layoutParams;
                if (!Intrinsics.LJFF(c19me.dimensionRatio, str)) {
                    c19me.dimensionRatio = str;
                    ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(this);
                    setLayoutParams(layoutParams);
                }
                requestLayout();
            }
        }
    }

    public C1835420xrY(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public C1835420xrY(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.LL = C452501pT.LIZIZ(new AwS571S0100000_27(this, 488));
        this.LLILLJJLI = C452501pT.LIZIZ(new AwS571S0100000_27(this, 489));
        this.LLILLL = C452501pT.LIZIZ(new AwS571S0100000_27(this, 487));
        this.LLILZ = C452501pT.LIZIZ(new AwS571S0100000_27(this, 486));
        this.LLILZIL = C452501pT.LIZIZ(new AwS571S0100000_27(this, 490));
        C786410Ut5.Td(C786410Ut5.ne(context), R.layout.dgr, this, true);
    }

    public final void h0(String str, String str2, String str3, boolean z, boolean z2, boolean z3) {
        C1324610kZf url = C1819620xS4.LIZ().setUrl(str);
        url.LJIL = z3;
        url.LJJI(getCoverView());
        Drawable drawable = null;
        if (z2) {
            C1324720kZq coverView = getCoverView();
            Drawable drawable2 = getContext().getDrawable(R.drawable.ci0);
            if (drawable2 != null) {
                drawable2.mutate();
                drawable2.setTint(C497740JfY.LIZLLL(R.attr.c9_, getContext()));
                drawable = drawable2;
            }
            coverView.setForeground(drawable);
            C339190DRl.LIZLLL(getProcessingView());
            C339190DRl.LIZIZ(getPostedView());
            C339190DRl.LIZIZ(getBottomIconView());
            getBottomDescView().setText("");
            return;
        }
        getCoverView().setForeground(null);
        C339190DRl.LIZIZ(getProcessingView());
        if (z && !LiveReplayHighlightPageRefactorSetting.INSTANCE.isV3()) {
            C339190DRl.LIZLLL(getPostedView());
        } else {
            C339190DRl.LIZIZ(getPostedView());
        }
        if (str2 == null || str2.length() == 0) {
            C339190DRl.LIZIZ(getBottomIconView());
        } else {
            C1819620xS4.LIZ().setUrl(str2).LJJI(getBottomIconView());
        }
        TuxTextView bottomDescView = getBottomDescView();
        if (str3 == null) {
            str3 = "";
        }
        bottomDescView.setText(str3);
    }
}
