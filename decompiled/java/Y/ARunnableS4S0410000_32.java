package Y;

import X.C013C;
import X.C1537900q7g;
import X.C1541950qED;
import X.C1547280qMo;
import X.C1697810uHb;
import X.C1741890vQh;
import X.C1742080vR0;
import X.C1743860vTs;
import X.C181R;
import X.C18OW;
import X.C1C7U;
import X.C21198117xT;
import X.C21272118Ml;
import android.content.Context;
import android.view.View;
import com.bytedance.hybrid.spark.SparkContext;
import com.bytedance.router.SmartRouter;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.ecommercelive.common.biz.us.popcard.bidding.UsBidViewModel;
import com.ss.android.ugc.aweme.ecommercelive.common.infra.data.AuctionCheckResp;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CancellationException;
import kotlin.Pair;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes33.dex */
public class ARunnableS4S0410000_32 implements Runnable {
    public final int $t;
    public Object l0;
    public Object l1;
    public Object l2;
    public Object l3;
    public boolean z4;

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.$t) {
            case 0:
                run$0(this);
                break;
            case 1:
                run$1(this);
                break;
        }
    }

    public String toString() {
        return this.$t + "_" + super.toString();
    }

    public final void LIZ$0() {
        String str;
        Map<String, Object> map;
        String str2;
        ((Function1) this.l0).invoke(Boolean.FALSE);
        if (this.z4) {
            ((Function0) this.l1).invoke();
            return;
        }
        AuctionCheckResp auctionCheckResp = (AuctionCheckResp) this.l2;
        if (auctionCheckResp == null || (map = auctionCheckResp.actionAgreement) == null) {
            C181R c181r = (C181R) this.l3;
            if (auctionCheckResp == null || (str = auctionCheckResp.addressPaymentSchema) == null) {
                return;
            }
            C21198117xT c21198117xT = C21198117xT.LIZ;
            UsBidViewModel bidVM = c181r.getBidVM();
            c21198117xT.getClass();
            C21198117xT.LIZ("auction_shipment_and_payment_show", bidVM, null);
            SmartRouter.buildRoute(c181r.getContext(), str).open();
            return;
        }
        C181R c181r2 = (C181R) this.l3;
        String str3 = auctionCheckResp.addressPaymentSchema;
        c181r2.getClass();
        Object obj = map.get("schema");
        if ((obj instanceof String) && (str2 = (String) obj) != null) {
            C1537900q7g c1537900q7g = C1541950qED.LIZJ;
            Context context = c181r2.getContext();
            SparkContext sparkContext = new SparkContext();
            sparkContext.LJJLIIJ(str2);
            try {
                Pair[] pairArr = new Pair[3];
                pairArr[0] = new Pair("agreement", C1741890vQh.LJIIIIZZ(map));
                pairArr[1] = new Pair("address_payment_schema", str3);
                UsBidViewModel usBidViewModel = c181r2.LLILZIL;
                pairArr[2] = new Pair("track_params", usBidViewModel != null ? C1741890vQh.LJIIIIZZ(usBidViewModel.xQ2(null, null, true)) : null);
                C1547280qMo.LJFF(sparkContext, pairArr);
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
            }
            c1537900q7g.getClass();
            new C1541950qED(context, sparkContext).LIZIZ();
        }
        C21198117xT c21198117xT2 = C21198117xT.LIZ;
        UsBidViewModel bidVM2 = c181r2.getBidVM();
        c21198117xT2.getClass();
        C21198117xT.LIZ("auction_tc_show", bidVM2, null);
    }

    public final void LIZ$1() {
        View view = (View) this.l0;
        C21272118Ml c21272118Ml = (C21272118Ml) this.l1;
        C013C c013c = (C013C) this.l2;
        boolean z = this.z4;
        Aweme aweme = (Aweme) this.l3;
        int i = 0;
        if (view != null) {
            try {
                if (!view.isAttachedToWindow()) {
                    return;
                }
            } catch (CancellationException e) {
                TryCatchGuardChecker.doCheck(e);
                throw e;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                return;
            }
        }
        int i2 = C18OW.LIZ().preloadSize;
        List<String> listLIZJ = c21272118Ml.LIZJ();
        if (((ArrayList) listLIZJ).size() > 0 && 1 != 0 && listLIZJ != null) {
            for (String str : listLIZJ) {
                int i3 = i + 1;
                if (i < 0) {
                    C1697810uHb.LJIJI();
                    throw null;
                }
                String str2 = str;
                if (i <= i2) {
                    if (!z) {
                        C1743860vTs.LIZ.getClass();
                        C1743860vTs.LIZ(str2);
                    } else if (c013c.element) {
                        C1743860vTs.LIZ.getClass();
                        C1743860vTs.LIZ(str2);
                    }
                }
                i = i3;
            }
        }
        if (c013c.element && z) {
            C21272118Ml.LJ(c21272118Ml.LIZIZ(), C1742080vR0.LJ(aweme));
        }
    }

    public static final void run$0(ARunnableS4S0410000_32 aRunnableS4S0410000_32) {
        boolean zLIZ;
        C1C7U.LIZ("UsBidPopCardBaseView@fbef.handleButtonClickCommon$2$1");
        try {
            aRunnableS4S0410000_32.LIZ$0();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("UsBidPopCardBaseView@fbef.handleButtonClickCommon$2$1");
    }

    public static final void run$1(ARunnableS4S0410000_32 aRunnableS4S0410000_32) {
        boolean zLIZ;
        C1C7U.LIZ("ShopWindowAnchorMaker@b379.onVideoSelect$3");
        try {
            aRunnableS4S0410000_32.LIZ$1();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("ShopWindowAnchorMaker@b379.onVideoSelect$3");
    }

    public ARunnableS4S0410000_32(Object obj, Object obj2, Object obj3, boolean z, Object obj4, int i) {
        this.$t = i;
        this.l0 = obj;
        this.l1 = obj2;
        this.l2 = obj3;
        this.z4 = z;
        this.l3 = obj4;
    }
}
