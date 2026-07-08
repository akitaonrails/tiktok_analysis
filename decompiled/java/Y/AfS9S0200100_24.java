package Y;

import X.C09JN;
import X.C0XIR;
import X.C1577310r9F;
import X.C1577450r9T;
import X.C1C7U;
import X.C23112093u;
import X.C259800zU;
import X.C785410UrT;
import X.DialogC1389620mGW;
import X.EnumC1577410r9P;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.model.DramaDNUFeedCardConfig;
import com.ss.android.ugc.aweme.model.MiniDramaTabConfigResponse;
import com.ss.android.ugc.aweme.series.common.serviceimpl.MiniDramaSpecialCardServiceImpl;

/* JADX INFO: loaded from: classes25.dex */
public class AfS9S0200100_24 implements C09JN {
    public final int $t;
    public long j2;
    public Object l0;
    public Object l1;

    @Override // X.C09JN
    public final void accept(Object obj) {
        switch (this.$t) {
            case 0:
                accept$0(this, obj);
                break;
            case 1:
                accept$1(this, obj);
                break;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void accept$0(AfS9S0200100_24 afS9S0200100_24, Object obj) {
        Boolean bool;
        Boolean bool2;
        C1C7U.LIZ("MiniDramaSpecialCardServiceImpl@9ae5.doCheckConfig$2");
        MiniDramaTabConfigResponse miniDramaTabConfigResponse = (MiniDramaTabConfigResponse) obj;
        long jCurrentTimeMillis = System.currentTimeMillis() - afS9S0200100_24.j2;
        DialogC1389620mGW dialogC1389620mGW = (DialogC1389620mGW) ((C259800zU) afS9S0200100_24.l0).element;
        if (dialogC1389620mGW != null) {
            dialogC1389620mGW.dismiss();
            C785410UrT.LIZ(dialogC1389620mGW);
        }
        DramaDNUFeedCardConfig cardConfig = miniDramaTabConfigResponse.getCardConfig();
        if (cardConfig != null) {
            MiniDramaSpecialCardServiceImpl miniDramaSpecialCardServiceImpl = (MiniDramaSpecialCardServiceImpl) afS9S0200100_24.l1;
            miniDramaSpecialCardServiceImpl.LLILZ = miniDramaTabConfigResponse.getCardConfig();
            C1577450r9T c1577450r9T = miniDramaSpecialCardServiceImpl.LLILZIL;
            if (c1577450r9T != null) {
                c1577450r9T.LIZLLL.invoke(cardConfig);
            }
        }
        Boolean bool3 = null;
        ((MiniDramaSpecialCardServiceImpl) afS9S0200100_24.l1).LLILZIL = null;
        C1577310r9F c1577310r9F = C1577310r9F.LIZ;
        EnumC1577410r9P enumC1577410r9P = EnumC1577410r9P.TAB_CONFIG_RESPONSE;
        Long lValueOf = Long.valueOf(jCurrentTimeMillis);
        DramaDNUFeedCardConfig cardConfig2 = miniDramaTabConfigResponse.getCardConfig();
        if (cardConfig2 != null) {
            bool = cardConfig2.shouldShowCard;
        } else {
            bool = null;
        }
        DramaDNUFeedCardConfig cardConfig3 = miniDramaTabConfigResponse.getCardConfig();
        if (cardConfig3 != null) {
            bool2 = cardConfig3.shouldShowDramaTab;
        } else {
            bool2 = null;
        }
        DramaDNUFeedCardConfig cardConfig4 = miniDramaTabConfigResponse.getCardConfig();
        if (cardConfig4 != null) {
            bool3 = cardConfig4.shouldShowInnerFeed;
        }
        C1577310r9F.LIZJ(c1577310r9F, enumC1577410r9P, null, null, null, lValueOf, CardStruct.IStatusCode.DEFAULT, null, bool, bool2, bool3, 638);
        C1C7U.LIZIZ("MiniDramaSpecialCardServiceImpl@9ae5.doCheckConfig$2");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void accept$1(AfS9S0200100_24 afS9S0200100_24, Object obj) {
        String strValueOf;
        String message;
        C1C7U.LIZ("MiniDramaSpecialCardServiceImpl@9ae5.doCheckConfig$3");
        Throwable th = (Throwable) obj;
        long jCurrentTimeMillis = System.currentTimeMillis() - afS9S0200100_24.j2;
        DialogC1389620mGW dialogC1389620mGW = (DialogC1389620mGW) ((C259800zU) afS9S0200100_24.l0).element;
        if (dialogC1389620mGW != null) {
            dialogC1389620mGW.dismiss();
            C785410UrT.LIZ(dialogC1389620mGW);
        }
        ((MiniDramaSpecialCardServiceImpl) afS9S0200100_24.l1).LLILZIL = null;
        boolean z = th instanceof C0XIR;
        if (z) {
            strValueOf = String.valueOf(((C23112093u) th).getErrorCode());
        } else {
            strValueOf = "-1";
        }
        if (z) {
            message = ((C0XIR) th).getErrorMsg();
        } else {
            message = th.getMessage();
        }
        C1577310r9F.LIZJ(C1577310r9F.LIZ, EnumC1577410r9P.TAB_CONFIG_RESPONSE, null, null, null, Long.valueOf(jCurrentTimeMillis), strValueOf, message, null, null, null, 7294);
        C1C7U.LIZIZ("MiniDramaSpecialCardServiceImpl@9ae5.doCheckConfig$3");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Not initialized variable reg: 2, insn: 0x0003: IPUT (r2 I:long), (r0 I:Y.AfS9S0200100_24) (LINE:67108867) Y.AfS9S0200100_24.j2 long, block:B:2:0x0000 */
    /* JADX WARN: Not initialized variable reg: 4, insn: 0x0005: IPUT (r4 I:java.lang.Object), (r0 I:Y.AfS9S0200100_24) (LINE:67108869) Y.AfS9S0200100_24.l0 java.lang.Object, block:B:2:0x0000 */
    /* JADX WARN: Type inference failed for: r1v0, types: [Y.AfS9S0200100_24, java.lang.Object] */
    public AfS9S0200100_24(long j, long j2, C259800zU<DialogC1389620mGW> c259800zU, MiniDramaSpecialCardServiceImpl miniDramaSpecialCardServiceImpl) {
        long j3;
        Object obj;
        obj.$t = miniDramaSpecialCardServiceImpl;
        obj.j2 = j3;
        obj.l0 = obj;
        obj.l1 = c259800zU;
        ?? obj2 = new Object();
    }
}
