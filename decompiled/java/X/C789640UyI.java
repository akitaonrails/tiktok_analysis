package X;

import android.content.Context;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.widget.FrameLayout;
import com.bytedance.tux.icon.TuxIconView;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AwS557S0100000_13;

/* JADX INFO: renamed from: X.0UyI, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C789640UyI extends FrameLayout {
    public TuxIconView LL;
    public TuxIconView LLILLJJLI;
    public final C01GW LLILLL;
    public final C01GW LLILZ;

    private final TuxIconView getActivateIcon() {
        return (TuxIconView) this.LLILZ.getValue();
    }

    private final TuxIconView getInactivateIcon() {
        return (TuxIconView) this.LLILLL.getValue();
    }

    public final TuxIconView getActivatedIconFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLILLJJLI;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.a5a);
            this.LLILLJJLI = (TuxIconView) callbackFindViewById;
        }
        return (TuxIconView) callbackFindViewById;
    }

    public final TuxIconView getInactivatedIconFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.kil);
            this.LL = (TuxIconView) callbackFindViewById;
        }
        return (TuxIconView) callbackFindViewById;
    }

    public final void setActivatedIconFromXml(TuxIconView tuxIconView) {
        this.LLILLJJLI = tuxIconView;
    }

    public final void setInactivatedIconFromXml(TuxIconView tuxIconView) {
        this.LL = tuxIconView;
    }

    public C789640UyI(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.LLILLL = C452501pT.LIZIZ(new AwS557S0100000_13(this, 154));
        this.LLILZ = C452501pT.LIZIZ(new AwS557S0100000_13(this, 153));
        C786410Ut5.Sd(R.layout.b5x, C786410Ut5.ne(context), this);
    }
}
