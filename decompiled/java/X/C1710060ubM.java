package X;

import android.content.Context;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.pipo.cashier.common.model.richtext.PipoRichText;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0ubM, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1710060ubM extends FrameLayout {
    public TuxIconView LL;
    public TuxTextView LLILLJJLI;
    public TuxIconView LLILLL;
    public View LLILZ;
    public View.OnTouchListener LLILZIL;

    public C1710060ubM(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4);
    }

    public final TuxIconView getAppliedIcon() {
        KeyEvent.Callback callbackFindViewById = this.LL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.b6v);
            this.LL = (TuxIconView) callbackFindViewById;
        }
        return (TuxIconView) callbackFindViewById;
    }

    public final TuxIconView getArrowIcon() {
        KeyEvent.Callback callbackFindViewById = this.LLILLL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.b8y);
            this.LLILLL = (TuxIconView) callbackFindViewById;
        }
        return (TuxIconView) callbackFindViewById;
    }

    public final View getContent() {
        View view = this.LLILZ;
        if (view != null) {
            return view;
        }
        View viewFindViewById = findViewById(R.id.eu1);
        this.LLILZ = viewFindViewById;
        return viewFindViewById;
    }

    public final TuxTextView getDesc() {
        KeyEvent.Callback callbackFindViewById = this.LLILLJJLI;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.desc);
            this.LLILLJJLI = (TuxTextView) callbackFindViewById;
        }
        return (TuxTextView) callbackFindViewById;
    }

    public final View.OnTouchListener getTouchListener() {
        return this.LLILZIL;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        View.OnTouchListener onTouchListener = this.LLILZIL;
        if (onTouchListener != null) {
            onTouchListener.onTouch(this, motionEvent);
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    public final void setAppliedIcon(TuxIconView tuxIconView) {
        this.LL = tuxIconView;
    }

    public final void setArrowIcon(TuxIconView tuxIconView) {
        this.LLILLL = tuxIconView;
    }

    public final void setContent(View view) {
        this.LLILZ = view;
    }

    public final void setDesc(TuxTextView tuxTextView) {
        this.LLILLJJLI = tuxTextView;
    }

    public final void setTouchListener(View.OnTouchListener onTouchListener) {
        this.LLILZIL = onTouchListener;
    }

    public C1710060ubM(Context context, AttributeSet attributeSet, int i) {
        super(context, (i & 2) != 0 ? null : attributeSet, 0);
        FrameLayout.inflate(context, R.layout.dvy, this);
    }

    public final void LIZ(boolean z, PipoRichText pipoRichText, String str, C1708990uZd c1708990uZd, View.OnClickListener onClickListener, View.OnTouchListener onTouchListener) {
        this.LLILZIL = onTouchListener;
        if (z) {
            TuxIconView appliedIcon = getAppliedIcon();
            if (appliedIcon != null) {
                C337180DJs.LIZJ(appliedIcon);
            }
        } else {
            TuxIconView appliedIcon2 = getAppliedIcon();
            if (appliedIcon2 != null) {
                C337180DJs.LIZ(appliedIcon2);
            }
        }
        TuxTextView desc = getDesc();
        if (desc != null && c1708990uZd != null) {
            desc.setText(C1711870ueH.LIZ(pipoRichText));
        }
        View content = getContent();
        if (content != null) {
            C786410Ut5.I7(onClickListener, content);
        }
        if (str != null && str.length() > 0) {
            TuxIconView arrowIcon = getArrowIcon();
            if (arrowIcon != null) {
                C337180DJs.LIZJ(arrowIcon);
                return;
            }
            return;
        }
        TuxIconView arrowIcon2 = getArrowIcon();
        if (arrowIcon2 == null) {
            return;
        }
        C337180DJs.LIZ(arrowIcon2);
    }
}
