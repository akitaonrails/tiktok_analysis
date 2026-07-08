package X;

import android.content.Context;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.widget.LinearLayout;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.03lw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C940203lw extends LinearLayout {
    public TuxTextView LL;
    public TuxTextView LLILLJJLI;
    public final int LLILLL;

    public final TuxTextView getPromotionHeaderDescCountDownFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLILLJJLI;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.saq);
            this.LLILLJJLI = (TuxTextView) callbackFindViewById;
        }
        return (TuxTextView) callbackFindViewById;
    }

    public final TuxTextView getPromotionHeaderDescFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.sap);
            this.LL = (TuxTextView) callbackFindViewById;
        }
        return (TuxTextView) callbackFindViewById;
    }

    private final void setCountDownViewWidth(String str) {
        getPromotionHeaderDescCountDownFromXml().getPaint().measureText(str);
        if (a0.LJJIIZI(str, ":", false) && getPromotionHeaderDescCountDownFromXml().getWidth() != this.LLILLL) {
            C1744700vVE.LJIIJ(this.LLILLL, getPromotionHeaderDescCountDownFromXml());
        } else {
            if (a0.LJJIIZI(str, ":", false)) {
                return;
            }
            C1744700vVE.LJIIJ(-2, getPromotionHeaderDescCountDownFromXml());
        }
    }

    public final void LIZ(long j) {
        String strLIZ = C03BI.LIZ(j, getContext());
        getPromotionHeaderDescCountDownFromXml().setText(strLIZ);
        setCountDownViewWidth(strLIZ);
        TuxTextView promotionHeaderDescFromXml = getPromotionHeaderDescFromXml();
        int i = 0;
        if (j > 86400000) {
            i = 8;
        }
        C786410Ut5.LJLLLLLL(i, promotionHeaderDescFromXml);
    }

    public final void setPromotionHeaderDescCountDownFromXml(TuxTextView tuxTextView) {
        this.LLILLJJLI = tuxTextView;
    }

    public final void setPromotionHeaderDescFromXml(TuxTextView tuxTextView) {
        this.LL = tuxTextView;
    }

    public C940203lw(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.LLILLL = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(72));
        C786410Ut5.LJLLJ(context, R.layout.ams, this);
    }
}
