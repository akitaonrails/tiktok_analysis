package X;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.KeyEvent;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0GcU, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C419400GcU extends ConstraintLayout {
    public TuxIconView LL;
    public SmartImageView LLILLJJLI;
    public TuxTextView LLILLL;
    public ObjectAnimator LLILZ;
    public AnimatorSet LLILZIL;

    public final TuxIconView getBubbleArrowFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.cx5);
            this.LL = (TuxIconView) callbackFindViewById;
        }
        return (TuxIconView) callbackFindViewById;
    }

    public final SmartImageView getBubbleIconFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLILLJJLI;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.cxg);
            this.LLILLJJLI = (SmartImageView) callbackFindViewById;
        }
        return (SmartImageView) callbackFindViewById;
    }

    public final TuxTextView getBubbleTextFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLILLL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.cxn);
            this.LLILLL = (TuxTextView) callbackFindViewById;
        }
        return (TuxTextView) callbackFindViewById;
    }

    public final void setBubbleArrowFromXml(TuxIconView tuxIconView) {
        this.LL = tuxIconView;
    }

    public final void setBubbleIconFromXml(SmartImageView smartImageView) {
        this.LLILLJJLI = smartImageView;
    }

    public final void setBubbleTextFromXml(TuxTextView tuxTextView) {
        this.LLILLL = tuxTextView;
    }

    public C419400GcU(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public C419400GcU(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C786410Ut5.Td(C786410Ut5.ne(context), R.layout.ay_, this, true);
        C419910GdJ c419910GdJ = new C419910GdJ();
        c419910GdJ.LIZ = R.raw.icon_chevron_right_slim_thin_ltr;
        c419910GdJ.LJ = Integer.valueOf(R.attr.ee);
        getBubbleArrowFromXml().setImageDrawable(c419910GdJ.LIZ(getContext()));
    }
}
