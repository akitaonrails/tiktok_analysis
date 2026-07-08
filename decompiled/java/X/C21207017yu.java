package X;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import com.ss.android.ugc.aweme.ecommercelive.audience.common.business.feed.popcard.api.BFFData;
import com.ss.android.ugc.aweme.ecommercelive.audience.common.business.feed.popcard.api.CardConfig;
import com.ss.android.ugc.aweme.ecommercelive.audience.common.business.feed.popcard.api.GoLiveCard;
import com.zhiliaoapp.musically.R;
import java.util.Collections;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.17yu, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public final class C21207017yu extends AbstractC212214182y implements InterfaceC21202517yB {
    public final C21202017y6 LLILZ;
    public C182T LLILZIL;
    public C1564050qnr LLILZLL;

    @Override // X.AbstractC212214182y
    public final void e0() {
    }

    @Override // X.AbstractC212214182y
    public Map<String, String> getContentShowParams() {
        String strLIZLLL;
        Pair[] pairArr = new Pair[2];
        C182T c182t = this.LLILZIL;
        if (c182t == null || (strLIZLLL = c182t.LIZLLL()) == null) {
            strLIZLLL = "";
        }
        pairArr[0] = new Pair("product_id", strLIZLLL);
        pairArr[1] = new Pair("is_lynx", "1");
        return C2097608Jq.LJIIIIZZ(pairArr);
    }

    @Override // X.InterfaceC21202517yB
    public final Set<String> events() {
        return Collections.singleton("ec_lynx_card_click");
    }

    @Override // X.InterfaceC21202517yB
    public final void LLLLLLLLL(C262100zr c262100zr) {
        InterfaceC1107590evd interfaceC1107590evd;
        if (!Intrinsics.LJFF(c262100zr.LIZ, "ec_lynx_card_click") || (interfaceC1107590evd = c262100zr.LIZIZ) == null) {
            return;
        }
        int iLIZLLL = C1871910yoP.LIZLLL(interfaceC1107590evd, "should_close_card", 0);
        InterfaceC1107590evd interfaceC1107590evdLJ = C1871910yoP.LJ(interfaceC1107590evd, "route_page");
        if (iLIZLLL == 1) {
            View view = new View(getContext());
            view.setId(R.id.gl8);
            View.OnClickListener closeClickListener = getCloseClickListener();
            if (closeClickListener != null) {
                closeClickListener.onClick(view);
            }
        }
        if (interfaceC1107590evdLJ != null && C1871910yoP.LIZLLL(interfaceC1107590evdLJ, "page", 0) == 4) {
            performClick();
        }
    }

    public C21207017yu(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C21202017y6 c21202017y6 = new C21202017y6(context);
        c21202017y6.h0(this);
        addView(c21202017y6, -1, -2);
        this.LLILZ = c21202017y6;
    }

    @Override // X.AbstractC212214182y
    public final void h0(C182T c182t, long j, GoLiveCard goLiveCard, Integer num) {
        String str;
        boolean z;
        int iIntValue;
        CardConfig cardConfig;
        this.LLILZIL = c182t;
        BFFData bFFData = c182t.LIZLLL;
        if (bFFData == null || (cardConfig = bFFData.cardConfig) == null || (str = cardConfig.cardSchema) == null) {
            str = "";
        }
        if (str.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        Long lLJIILIIL = null;
        if (z) {
            C2341109Fh.LIZ.getClass();
            C2341109Fh.LIZJ("FeedLynxCardView schema is empty");
            this.LLILZLL = null;
            return;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ecommerce_fyp_lynx_card_");
        sbLIZ.append(num);
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        if (num != null) {
            iIntValue = num.intValue();
        } else {
            iIntValue = 0;
        }
        String strLIZLLL = c182t.LIZLLL();
        if (strLIZLLL != null) {
            lLJIILIIL = C2095008Iq.LJIILIIL(strLIZLLL);
        }
        this.LLILZLL = new C1564050qnr(strLIZIZ, iIntValue, lLJIILIIL, str, Long.valueOf(j), null, null);
    }
}
