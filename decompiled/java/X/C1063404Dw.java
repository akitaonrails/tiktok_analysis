package X;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.ecommerce.base.common.model.Icon;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.04Dw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C1063404Dw extends ConstraintLayout implements C04EW {
    public final SmartImageView LL;
    public final TuxTextView LLILLJJLI;
    public C426770GoN LLILLL;
    public final C1063104Dt LLILZ;

    @Override // X.C04EW
    public final void LLF(C1063004Ds c1063004Ds) {
        int iIntValue;
        this.LLILZ.LIZIZ(c1063004Ds);
        C809003Ea c809003Ea = C809003Ea.LIZ;
        SmartImageView smartImageView = this.LL;
        Icon icon = c1063004Ds.LIZJ;
        c809003Ea.getClass();
        C809003Ea.LIZ(smartImageView, icon);
        this.LLILLJJLI.setText(c1063004Ds.LIZLLL);
        Integer num = c1063004Ds.LJIIZILJ;
        if (num != null && (iIntValue = num.intValue()) > 0) {
            C426770GoN c426770GoN = this.LLILLL;
            if (c426770GoN == null) {
                c426770GoN = new C426770GoN(getContext(), null, 6);
                c426770GoN.setId(View.generateViewId());
                c426770GoN.setVariant(1);
                c426770GoN.setMaxCount(2);
                addView(c426770GoN);
                C19MB c19mb = new C19MB();
                c19mb.LJII(this);
                c19mb.LJIIIIZZ(c426770GoN.getId(), 3, 0, 3);
                c19mb.LJIIIIZZ(c426770GoN.getId(), 7, 0, 7);
                c19mb.LIZIZ(this);
                this.LLILLL = c426770GoN;
            }
            c426770GoN.setCount(iIntValue);
            C786410Ut5.LLLLLLIL(c426770GoN, 0);
            float fLIZ = C0H9H.LIZ(-8);
            ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c426770GoN);
            c426770GoN.setTranslationY(fLIZ);
            return;
        }
        C426770GoN c426770GoN2 = this.LLILLL;
        if (c426770GoN2 == null) {
            return;
        }
        C03DZ.LIZ(c426770GoN2);
    }

    public C1063404Dw(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.LLILZ = new C1063104Dt(this);
        SmartImageView smartImageView = new SmartImageView(context);
        smartImageView.setId(View.generateViewId());
        C786410Ut5.G6(smartImageView, new C19ME(-2, -2));
        this.LL = smartImageView;
        addView(smartImageView);
        TuxTextView tuxTextView = new TuxTextView(context, null, 6, 0);
        tuxTextView.setId(View.generateViewId());
        C786410Ut5.R6(tuxTextView, new C19ME(0, -2));
        tuxTextView.setMaxLines(1);
        tuxTextView.setEllipsize(TextUtils.TruncateAt.END);
        tuxTextView.setTuxFont(91);
        tuxTextView.setTextColorRes(R.attr.a1h);
        tuxTextView.setGravity(1);
        this.LLILLJJLI = tuxTextView;
        addView(tuxTextView);
        C19MB c19mb = new C19MB();
        c19mb.LJIIIIZZ(smartImageView.getId(), 3, 0, 3);
        c19mb.LJIIIIZZ(smartImageView.getId(), 6, 0, 6);
        c19mb.LJIIIIZZ(smartImageView.getId(), 7, 0, 7);
        c19mb.LJIIIZ(tuxTextView.getId(), 3, smartImageView.getId(), 4, C0H9H.LIZIZ(2));
        c19mb.LJIIIIZZ(tuxTextView.getId(), 6, 0, 6);
        c19mb.LJIIIIZZ(tuxTextView.getId(), 7, 0, 7);
        c19mb.LJIIIIZZ(tuxTextView.getId(), 4, 0, 4);
        c19mb.LJIILL(tuxTextView.getId(), 0);
        c19mb.LJIIJJI(tuxTextView.getId(), -2);
        c19mb.LIZIZ(this);
        setClipChildren(false);
        setClipToPadding(false);
    }
}
