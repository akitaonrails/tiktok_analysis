package X;

import android.content.Context;
import android.util.AttributeSet;
import android.view.KeyEvent;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0GfF, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C421110GfF extends C421130GfH {
    public TuxTextView LLILLJJLI;
    public TuxTextView LLILLL;

    public final TuxTextView getEmojiFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLILLJJLI;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.gz1);
            this.LLILLJJLI = (TuxTextView) callbackFindViewById;
        }
        return (TuxTextView) callbackFindViewById;
    }

    public final TuxTextView getTextFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLILLL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.text);
            this.LLILLL = (TuxTextView) callbackFindViewById;
        }
        return (TuxTextView) callbackFindViewById;
    }

    public final void setEmojiFromXml(TuxTextView tuxTextView) {
        this.LLILLJJLI = tuxTextView;
    }

    public final void setTextFromXml(TuxTextView tuxTextView) {
        this.LLILLL = tuxTextView;
    }

    public C421110GfF(Context context, AttributeSet attributeSet) {
        int i;
        int i2;
        super(context, attributeSet, 0);
        C786410Ut5.Sd(R.layout.fox, C786410Ut5.ne(context), this);
        Integer numLIZJ = C1308910kAL.LIZJ(R.attr.zo, getContext());
        if (numLIZJ != null) {
            setBackgroundColor(numLIZJ.intValue());
        }
        setGravity(16);
        setRadius(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(14)));
        C427690Gpr.LJ(this, C418440Gaw.LIZIZ(10));
        TuxIconView tuxIconView = (TuxIconView) findViewById(R.id.wnk);
        if (tuxIconView != null) {
            C419910GdJ c419910GdJ = new C419910GdJ();
            if (C07IF.LIZ()) {
                i = R.raw.icon_arrow_right_ltr;
            } else {
                i = R.raw.icon_arrow_right_fill_ltr;
            }
            c419910GdJ.LIZ = i;
            if (C07IF.LIZ()) {
                i2 = R.attr.a1h;
            } else {
                i2 = R.attr.d5;
            }
            c419910GdJ.LJ = Integer.valueOf(i2);
            tuxIconView.setTuxIcon(c419910GdJ);
        }
    }
}
