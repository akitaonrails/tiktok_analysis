package X;

import android.content.Context;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.widget.LinearLayout;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.03Ej, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C809903Ej extends LinearLayout {
    public TuxTextView LL;
    public TuxIconView LLILLJJLI;

    public C809903Ej(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4);
    }

    public final TuxIconView getBackBtnFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLILLJJLI;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.bn2);
            this.LLILLJJLI = (TuxIconView) callbackFindViewById;
        }
        return (TuxIconView) callbackFindViewById;
    }

    public final TuxTextView getShippingTextFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.v5w);
            this.LL = (TuxTextView) callbackFindViewById;
        }
        return (TuxTextView) callbackFindViewById;
    }

    public final void setBackBtnFromXml(TuxIconView tuxIconView) {
        this.LLILLJJLI = tuxIconView;
    }

    public final void setShippingInfo(String str) {
        getShippingTextFromXml().setText(str);
    }

    public final void setShippingTextFromXml(TuxTextView tuxTextView) {
        this.LL = tuxTextView;
    }

    public final void setTagIcon(int i) {
        getBackBtnFromXml().setIconRes(i);
    }

    public final void setTagTintColor(int i) {
        Integer numLIZJ = C1308910kAL.LIZJ(i, getContext());
        if (numLIZJ != null) {
            getBackBtnFromXml().setTintColor(numLIZJ.intValue());
        }
    }

    public final void setTextColor(int i) {
        Integer numLIZJ = C1308910kAL.LIZJ(i, getContext());
        if (numLIZJ != null) {
            getShippingTextFromXml().setTextColor(numLIZJ.intValue());
        }
    }

    public C809903Ej(Context context, AttributeSet attributeSet, int i) {
        super(context, (i & 2) != 0 ? null : attributeSet, 0);
        C786410Ut5.Td(C786410Ut5.ne(context), R.layout.bpn, this, true);
        Integer numLIZJ = C1308910kAL.LIZJ(R.attr.a07, context);
        if (numLIZJ != null) {
            setBackgroundColor(numLIZJ.intValue());
        }
        setGravity(51);
        setOrientation(0);
    }
}
