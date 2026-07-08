package X;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.ss.android.ugc.aweme.unifiedauthapi.experiment.OppoPermissionPopupMaskDelayExp;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AwS0S0100101_17;
import kotlin.jvm.internal.AwS125S0101000_17;

/* JADX INFO: renamed from: X.0fPi, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1126240fPi extends FrameLayout {
    public final View LL;
    public final C16F5 LLILLJJLI;
    public C1126370fPv LLILLL;
    public C1126370fPv LLILZ;
    public C1126370fPv LLILZIL;
    public float LLILZLL;
    public int LLIZ;
    public C1126480fQ6 LLIZLLLIL;
    public C1126300fPo LLJ;

    public final C1126480fQ6 getComboNumberOptManager() {
        return this.LLIZLLLIL;
    }

    public final void LIZIZ(int i) {
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if (layoutParams != null) {
            layoutParams.width = i;
            ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(this);
            setLayoutParams(layoutParams);
            requestLayout();
        }
    }

    public final void setComboNumberOptManager(C1126480fQ6 c1126480fQ6) {
        this.LLIZLLLIL = c1126480fQ6;
    }

    public C1126240fPi(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.LLILZLL = 1.0f;
        C786410Ut5.Sd(R.layout.fzj, C786410Ut5.ne(context), this);
        this.LL = findViewById(R.id.e9k);
        C16F5 c16f5 = (C16F5) findViewById(R.id.e9l);
        this.LLILLJJLI = c16f5;
        C1119920fFW.LJI(OppoPermissionPopupMaskDelayExp.DEFAULT, c16f5);
        C16F5 c16f52 = this.LLILLJJLI;
        if (c16f52 != null) {
            c16f52.setTypeface(c16f52.getTypeface(), 2);
        }
    }

    public final void LIZ(int i, boolean z) {
        C1126370fPv c1126370fPvLIZ;
        if (this.LL == null) {
            return;
        }
        C1126370fPv c1126370fPv = this.LLILZ;
        if (c1126370fPv != null && c1126370fPv.LIZIZ()) {
            C1126370fPv c1126370fPv2 = this.LLILZ;
            if (c1126370fPv2 != null) {
                c1126370fPv2.LIZ();
            }
            this.LLILZ = null;
        }
        if (z) {
            if (i > 20) {
                C786410Ut5.T4(this.LL, 1.0f);
                return;
            } else {
                c1126370fPvLIZ = C1126360fPu.LIZ(new AwS125S0101000_17(this, i, 2));
                c1126370fPvLIZ.LIZJ();
            }
        } else {
            float alpha = this.LL.getAlpha();
            if (alpha <= 0.0f) {
                return;
            }
            c1126370fPvLIZ = C1126360fPu.LIZ(new AwS0S0100101_17(this, alpha, (long) ((alpha / 0.05f) * 100), 1));
            c1126370fPvLIZ.LIZJ();
        }
        this.LLILZ = c1126370fPvLIZ;
    }
}
