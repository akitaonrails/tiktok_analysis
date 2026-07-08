package X;

import android.content.Context;
import android.view.KeyEvent;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;
import g1c.AjS60S0100000_1;

/* JADX INFO: renamed from: X.03Bp, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C802703Bp extends FrameLayout {
    public SmartImageView LL;
    public TuxTextView LLILLJJLI;
    public ConstraintLayout LLILLL;

    public final TuxTextView getComTextFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLILLJJLI;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.e97);
            this.LLILLJJLI = (TuxTextView) callbackFindViewById;
        }
        return (TuxTextView) callbackFindViewById;
    }

    public final SmartImageView getIconFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.jxe);
            this.LL = (SmartImageView) callbackFindViewById;
        }
        return (SmartImageView) callbackFindViewById;
    }

    public final ConstraintLayout getTgContainerFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLILLL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.xs0);
            this.LLILLL = (ConstraintLayout) callbackFindViewById;
        }
        return (ConstraintLayout) callbackFindViewById;
    }

    public C802703Bp(Context context) {
        super(context, null, 0);
        C1701430uNR.LIZ(context, R.layout.bob, this, true);
    }

    public final void setComTextFromXml(TuxTextView tuxTextView) {
        this.LLILLJJLI = tuxTextView;
    }

    public final void setIconFromXml(SmartImageView smartImageView) {
        this.LL = smartImageView;
    }

    public final void setTgContainerFromXml(ConstraintLayout constraintLayout) {
        this.LLILLL = constraintLayout;
    }

    public static void LIZ(C802703Bp c802703Bp, C03IT c03it, Integer num, Integer num2, C037V c037v, int i) {
        if ((i & 1) != 0) {
            c03it = null;
        }
        if ((i & 4) != 0) {
            num = null;
        }
        if ((i & 8) != 0) {
            num2 = null;
        }
        if ((i & 32) != 0) {
            c037v = null;
        }
        C12ES.LJIILL(0, c802703Bp.getIconFromXml());
        if (c03it != null) {
            C1331670kl3 c1331670kl3LJIIJ = C1331660kl2.LJIIJ(c03it);
            c1331670kl3LJIIJ.LJJ(c802703Bp.getIconFromXml());
            C786410Ut5.h3(c1331670kl3LJIIJ);
        } else {
            C0H1U.LIZIZ(c802703Bp.getIconFromXml());
        }
        ViewGroup.LayoutParams layoutParams = c802703Bp.getIconFromXml().getLayoutParams();
        if (num != null) {
            layoutParams.width = num.intValue();
        }
        if (num2 != null) {
            layoutParams.height = num2.intValue();
        }
        C786410Ut5.G6(c802703Bp.getIconFromXml(), layoutParams);
        C786410Ut5.I7(new AjS60S0100000_1(c037v, 116), c802703Bp.getIconFromXml());
    }
}
