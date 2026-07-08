package X;

import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;
import irm.AkS100S0100000_35;
import kotlin.jvm.internal.AwS579S0100000_35;

/* JADX INFO: renamed from: X.1Dh7, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes36.dex */
public final class C2262551Dh7 extends ConstraintLayout {
    public InterfaceC2262561Dh8 LL;
    public final C01GW LLILLJJLI;
    public final C01GW LLILLL;
    public final C01GW LLILZ;
    public final C01GW LLILZIL;
    public final C01GW LLILZLL;
    public final C01GW LLIZ;
    public final C01GW LLIZLLLIL;
    public final C01GW LLJ;

    private final LinearLayout getCommentContainer() {
        return (LinearLayout) this.LLILZ.getValue();
    }

    private final TuxTextView getCommentCountTextView() {
        return (TuxTextView) this.LLILZIL.getValue();
    }

    private final LinearLayout getDiggContainer() {
        return (LinearLayout) this.LLILLJJLI.getValue();
    }

    private final TuxTextView getDiggCountTextView() {
        return (TuxTextView) this.LLILLL.getValue();
    }

    private final LinearLayout getFavoriteContainer() {
        return (LinearLayout) this.LLILZLL.getValue();
    }

    private final TuxTextView getFavoriteCountTextView() {
        return (TuxTextView) this.LLIZ.getValue();
    }

    private final LinearLayout getShareContainer() {
        return (LinearLayout) this.LLIZLLLIL.getValue();
    }

    private final TuxTextView getShareCountTextView() {
        return (TuxTextView) this.LLJ.getValue();
    }

    public final InterfaceC2262561Dh8 getActionsListener() {
        return this.LL;
    }

    public final void setActionsListener(InterfaceC2262561Dh8 interfaceC2262561Dh8) {
        this.LL = interfaceC2262561Dh8;
    }

    public final void setCommentText(String str) {
        getCommentCountTextView().setText(str);
    }

    public final void setCountsVisible$lemon_release(boolean z) {
        int i;
        if (z) {
            i = 0;
        } else {
            i = 8;
        }
        C786410Ut5.LLLLZLL(getDiggCountTextView(), i);
        C786410Ut5.LLLLZLL(getCommentCountTextView(), i);
        C786410Ut5.LLLLZLL(getFavoriteCountTextView(), i);
        C786410Ut5.LLLLZLL(getShareCountTextView(), i);
    }

    public final void setDiggText(String str) {
        getDiggCountTextView().setText(str);
    }

    public final void setFavoriteText(String str) {
        getFavoriteCountTextView().setText(str);
    }

    public final void setShareText(String str) {
        getShareCountTextView().setText(str);
    }

    public C2262551Dh7(C19EG c19eg, InterfaceC2262561Dh8 interfaceC2262561Dh8) {
        super(c19eg, null, 0);
        this.LL = interfaceC2262561Dh8;
        this.LLILLJJLI = C452501pT.LIZIZ(new AwS579S0100000_35(this, 251));
        this.LLILLL = C452501pT.LIZIZ(new AwS579S0100000_35(this, 252));
        this.LLILZ = C452501pT.LIZIZ(new AwS579S0100000_35(this, 249));
        this.LLILZIL = C452501pT.LIZIZ(new AwS579S0100000_35(this, 250));
        this.LLILZLL = C452501pT.LIZIZ(new AwS579S0100000_35(this, 253));
        this.LLIZ = C452501pT.LIZIZ(new AwS579S0100000_35(this, 254));
        this.LLIZLLLIL = C452501pT.LIZIZ(new AwS579S0100000_35(this, 255));
        this.LLJ = C452501pT.LIZIZ(new AwS579S0100000_35(this, 256));
        C21146717pB.LIZIZ(c19eg, R.layout.dad, this, true);
        C786410Ut5.I7(new AkS100S0100000_35(this, 3), getDiggContainer());
        C786410Ut5.I7(new AkS100S0100000_35(this, 4), getCommentContainer());
        C786410Ut5.I7(new AkS100S0100000_35(this, 5), getFavoriteContainer());
        C786410Ut5.I7(new AkS100S0100000_35(this, 6), getShareContainer());
    }
}
