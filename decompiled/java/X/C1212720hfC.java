package X;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AwS563S0100000_19;

/* JADX INFO: renamed from: X.0hfC, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class C1212720hfC extends FrameLayout {
    public final C01GW LL;
    public final C01GW LLILLJJLI;
    public final C01GW LLILLL;

    private final TuxIconView getAddInfoIcon() {
        return (TuxIconView) this.LL.getValue();
    }

    private final TuxTextView getAddInfoText() {
        return (TuxTextView) this.LLILLL.getValue();
    }

    private final TuxTextView getAddInfoTitle() {
        return (TuxTextView) this.LLILLJJLI.getValue();
    }

    public C1212720hfC(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.LL = C452501pT.LIZIZ(new AwS563S0100000_19(this, 2784));
        this.LLILLJJLI = C452501pT.LIZIZ(new AwS563S0100000_19(this, 2786));
        this.LLILLL = C452501pT.LIZIZ(new AwS563S0100000_19(this, 2785));
        C786410Ut5.Td(C786410Ut5.ne(context), R.layout.b3v, this, true);
    }

    public final void LIZ(int i, String str, String str2) {
        getAddInfoIcon().setIconRes(i);
        getAddInfoTitle().setText(str);
        getAddInfoText().setText(str2);
    }
}
