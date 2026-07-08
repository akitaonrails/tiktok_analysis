package X;

import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.ecommercelive.common.biz.us.popcard.data.AuctionData;
import com.ss.android.ugc.aweme.ecommercelive.common.biz.us.popcard.data.SurpriseSetData;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.181g, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public final class C212170181g extends AbstractC212220183e<FrameLayout, AuctionData> {
    public final int LJ;
    public C427970GqJ LJFF;

    public final void LJIIJJI(AuctionData auctionData) {
        float fLongValue;
        String str;
        SurpriseSetData surpriseSetData = auctionData.surpriseSetData;
        if (surpriseSetData != null && surpriseSetData.remainingStock != null && surpriseSetData != null && surpriseSetData.totalStock != null) {
            C12ES.LJIILL(0, this.LIZ);
            C786410Ut5.LJJJJIZL((FrameLayout) this.LIZ);
            C427970GqJ c427970GqJ = new C427970GqJ(this.LJ, this.LIZLLL);
            SurpriseSetData surpriseSetData2 = auctionData.surpriseSetData;
            if (surpriseSetData2 != null) {
                Long l = surpriseSetData2.remainingStock;
                Long l2 = surpriseSetData2.totalStock;
                if (l != null && l2 != null) {
                    if (surpriseSetData2 != null && (str = surpriseSetData2.playName) != null) {
                        c427970GqJ.LLILZIL = str;
                    }
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append(l);
                    sbLIZ.append('/');
                    sbLIZ.append(l2);
                    c427970GqJ.LLILZLL = C2188811AlT.LIZIZ(sbLIZ);
                    if (l2.longValue() <= 0) {
                        C03DZ.LIZ(c427970GqJ.LLILLL);
                    } else {
                        try {
                            C12ES.LJIILL(0, c427970GqJ.LLILLL);
                            fLongValue = l.longValue() / l2.longValue();
                        } catch (Exception e) {
                            TryCatchGuardChecker.doCheck(e);
                            C03DZ.LIZ(c427970GqJ.LLILLL);
                            fLongValue = -1.0f;
                        }
                        c427970GqJ.LLIZ = fLongValue;
                        c427970GqJ.requestLayout();
                    }
                    fLongValue = -1.0f;
                    c427970GqJ.LLIZ = fLongValue;
                    c427970GqJ.requestLayout();
                }
            }
            this.LJFF = c427970GqJ;
            ((ViewGroup) this.LIZ).addView(c427970GqJ);
            return;
        }
        C03DZ.LIZ(this.LIZ);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public C212170181g(FrameLayout frameLayout, int i, int i2) {
        String str;
        if ((i2 & 2) != 0) {
            str = "auction_surprise_stock_bar";
        } else {
            str = null;
        }
        i = (i2 & 4) != 0 ? R.style.acp : i;
        super(frameLayout, str);
        this.LJ = i;
    }
}
