package X;

import android.content.Context;
import android.util.AttributeSet;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bytedance.pipo.stellar.base.model.ColorDO;
import com.bytedance.pipo.stellar.base.model.PriceDO;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.u;

/* JADX INFO: renamed from: X.0uso, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1720880uso extends ConstraintLayout {
    public TuxTextView LL;

    public final void setData(PriceDO priceDO) {
        TuxTextView tuxTextView;
        int i;
        if (u.LJIJI(priceDO.getSymbolPosition(), "start", true)) {
            C786410Ut5.LLLLZLL((TuxTextView) findViewById(R.id.fau), 8);
            tuxTextView = (TuxTextView) findViewById(R.id.faw);
            C786410Ut5.LLLLZLL(tuxTextView, 0);
        } else {
            C786410Ut5.LLLLZLL((TuxTextView) findViewById(R.id.faw), 8);
            tuxTextView = (TuxTextView) findViewById(R.id.fau);
            C786410Ut5.LLLLZLL(tuxTextView, 0);
        }
        if (u.LJIJI(priceDO.getSymbolAlign(), "center", true) && Intrinsics.LJFF(priceDO.getAmountFont(), priceDO.getCurrencyFont())) {
            C426750GoL.LJIIIZ(tuxTextView, 0, 0, 0, 0, false, 16);
        }
        if (u.LJIJI(priceDO.getSymbolAlign(), "top", true)) {
            i = 48;
        } else if (!u.LJIJI(priceDO.getSymbolAlign(), "center", true) && u.LJIJI(priceDO.getSymbolAlign(), "bottom", true)) {
            i = 80;
        } else {
            i = 17;
        }
        tuxTextView.setGravity(i);
        tuxTextView.setText(priceDO.getCurrency());
        C2248371CzL c2248371CzL = C2248371CzL.LIZ;
        String currencyFont = priceDO.getCurrencyFont();
        c2248371CzL.getClass();
        tuxTextView.setTuxFont(C2248371CzL.LIZJ(currencyFont));
        ColorDO currencyColor = priceDO.getCurrencyColor();
        if (currencyColor != null) {
            C1721300utU c1721300utU = C1721300utU.LIZ;
            Context context = tuxTextView.getContext();
            c1721300utU.getClass();
            Integer numLJIILIIL = C1721300utU.LJIILIIL(currencyColor, context, null);
            if (numLJIILIIL != null) {
                tuxTextView.setTextColor(numLJIILIIL.intValue());
            }
        }
        TuxTextView tuxTextView2 = (TuxTextView) findViewById(R.id.ayo);
        this.LL = tuxTextView2;
        if (tuxTextView2 != null) {
            tuxTextView2.setText(priceDO.getAmount());
            String amountFont = priceDO.getAmountFont();
            c2248371CzL.getClass();
            tuxTextView2.setTuxFont(C2248371CzL.LIZJ(amountFont));
            ColorDO amountColor = priceDO.getAmountColor();
            if (amountColor != null) {
                C1721300utU c1721300utU2 = C1721300utU.LIZ;
                Context context2 = tuxTextView2.getContext();
                c1721300utU2.getClass();
                Integer numLJIILIIL2 = C1721300utU.LJIILIIL(amountColor, context2, null);
                if (numLJIILIIL2 != null) {
                    tuxTextView2.setTextColor(numLJIILIIL2.intValue());
                }
            }
        }
    }

    public C1720880uso(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C786410Ut5.Td(C786410Ut5.ne(getContext()), R.layout.d7k, this, true);
    }
}
