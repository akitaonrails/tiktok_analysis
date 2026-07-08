package Y;

import X.C09JN;
import X.C0XIR;
import X.C1577320r9G;
import X.C1577390r9N;
import X.C1611670s2f;
import X.C1611810s2t;
import X.C1C7U;
import X.C20684815ws;
import X.C2188811AlT;
import X.C23112093u;
import X.C2344009Gk;
import X.C518170KTv;
import X.C786410Ut5;
import X.EnumC1577400r9O;
import X.EnumC1611820s2u;
import X.InterfaceC1577470r9V;
import android.os.Handler;
import android.os.SystemClock;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.model.DramaContentType;
import com.ss.android.ugc.aweme.model.DramaDNUFeedCardConfig;
import com.ss.android.ugc.aweme.model.MiniDramaFeedCardResponse;
import com.ss.android.ugc.aweme.model.MiniDramaTabConfigResponse;
import com.ss.android.ugc.aweme.model.PaidCollectionDetailResponse;
import com.ss.android.ugc.aweme.series.innerfeed.viewmodel.SeriesInnerFeedViewModel;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import kotlin.jvm.internal.AwS603S0100000_24;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;

/* JADX INFO: loaded from: classes25.dex */
public class AfS9S0100100_24 implements C09JN {
    public final int $t;
    public long j1;
    public Object l0;

    @Override // X.C09JN
    public final void accept(Object obj) throws JSONException {
        switch (this.$t) {
            case 0:
                accept$0(this, obj);
                break;
            case 1:
                accept$1(this, obj);
                break;
            case 2:
                accept$2(this, obj);
                break;
            case 3:
                accept$3(this, obj);
                break;
            case 4:
                accept$4(this, obj);
                break;
            case 5:
                accept$5(this, obj);
                break;
            case 6:
                accept$6(this, obj);
                break;
            case 7:
                accept$7(this, obj);
                break;
            case 8:
                accept$8(this, obj);
                break;
        }
    }

    public static final void accept$0(AfS9S0100100_24 afS9S0100100_24, Object obj) {
        C1C7U.LIZ("PaywallDataSource@b65f.loadResponse$2");
        C518170KTv.LIZIZ("prefetch_config", "success", SystemClock.elapsedRealtime() - afS9S0100100_24.j1, null, null, null, null, null, null, (Map) afS9S0100100_24.l0, 1016);
        C1C7U.LIZIZ("PaywallDataSource@b65f.loadResponse$2");
    }

    public static final void accept$1(AfS9S0100100_24 afS9S0100100_24, Object obj) {
        C1C7U.LIZ("PaywallDataSource@b65f.loadResponse$3");
        C518170KTv.LIZIZ("prefetch_config", "fail", SystemClock.elapsedRealtime() - afS9S0100100_24.j1, null, null, null, null, ((Throwable) obj).getMessage(), "server", (Map) afS9S0100100_24.l0, 248);
        C1C7U.LIZIZ("PaywallDataSource@b65f.loadResponse$3");
    }

    public static final void accept$2(AfS9S0100100_24 afS9S0100100_24, Object obj) {
        C1C7U.LIZ("PgcPaymentServiceImpl@624d.getPaymentComponent$1");
        C518170KTv.LIZIZ("prefetch_config", "success", SystemClock.elapsedRealtime() - afS9S0100100_24.j1, null, null, null, null, null, null, (Map) afS9S0100100_24.l0, 1016);
        C1C7U.LIZIZ("PgcPaymentServiceImpl@624d.getPaymentComponent$1");
    }

    public static final void accept$3(AfS9S0100100_24 afS9S0100100_24, Object obj) {
        C1C7U.LIZ("PgcPaymentServiceImpl@624d.getPaymentComponent$2");
        C518170KTv.LIZIZ("prefetch_config", "fail", SystemClock.elapsedRealtime() - afS9S0100100_24.j1, null, null, null, null, ((Throwable) obj).getMessage(), "server", (Map) afS9S0100100_24.l0, 248);
        C1C7U.LIZIZ("PgcPaymentServiceImpl@624d.getPaymentComponent$2");
    }

    public static final void accept$4(AfS9S0100100_24 afS9S0100100_24, Object obj) throws JSONException {
        C1C7U.LIZ("SeriesInnerFeedViewModel@ef4a.getCollectionDetail$2");
        PaidCollectionDetailResponse paidCollectionDetailResponse = (PaidCollectionDetailResponse) obj;
        C1611670s2f c1611670s2f = C1611670s2f.LIZ;
        String strValueOf = String.valueOf(afS9S0100100_24.j1);
        c1611670s2f.getClass();
        C1611810s2t c1611810s2tLIZIZ = C1611670s2f.LIZIZ(strValueOf);
        c1611810s2tLIZIZ.LJ();
        if (c1611810s2tLIZIZ.LJIIZILJ != 0 || c1611810s2tLIZIZ.LJIJ != 0) {
            c1611810s2tLIZIZ.LIZ(EnumC1611820s2u.DETAIL_SUCCESS);
        }
        ((SeriesInnerFeedViewModel) afS9S0100100_24.l0).Vm(paidCollectionDetailResponse.collectionDetail);
        ((SeriesInnerFeedViewModel) afS9S0100100_24.l0).setState(new AwS603S0100000_24(paidCollectionDetailResponse, 243));
        C1C7U.LIZIZ("SeriesInnerFeedViewModel@ef4a.getCollectionDetail$2");
    }

    public static final void accept$5(AfS9S0100100_24 afS9S0100100_24, Object obj) throws JSONException {
        String strValueOf;
        String message;
        C1C7U.LIZ("SeriesInnerFeedViewModel@ef4a.getCollectionDetail$3");
        Throwable th = (Throwable) obj;
        if (th instanceof C0XIR) {
            strValueOf = String.valueOf(((C23112093u) th).getErrorCode());
            message = ((C0XIR) th).getErrorMsg();
        } else {
            strValueOf = "-1";
            message = th.getMessage();
        }
        C1611670s2f c1611670s2f = C1611670s2f.LIZ;
        String strValueOf2 = String.valueOf(afS9S0100100_24.j1);
        c1611670s2f.getClass();
        C1611810s2t c1611810s2tLIZIZ = C1611670s2f.LIZIZ(strValueOf2);
        c1611810s2tLIZIZ.LIZLLL(strValueOf, message);
        c1611810s2tLIZIZ.LIZ(EnumC1611820s2u.DETAIL_FAILED);
        ((SeriesInnerFeedViewModel) afS9S0100100_24.l0).setState(new AwS603S0100000_24(th, 244));
        C1C7U.LIZIZ("SeriesInnerFeedViewModel@ef4a.getCollectionDetail$3");
    }

    public static final void accept$6(AfS9S0100100_24 afS9S0100100_24, Object obj) {
        boolean z;
        DramaContentType contentType;
        Boolean bool;
        Boolean bool2;
        int iIntValue;
        C1C7U.LIZ("DramaNUJDataLoader@be57.doRequest$1");
        MiniDramaFeedCardResponse miniDramaFeedCardResponse = (MiniDramaFeedCardResponse) obj;
        C1577320r9G.LIZ.getClass();
        if (miniDramaFeedCardResponse.getCardInfo() != null) {
            z = true;
        } else {
            z = false;
        }
        C1577320r9G.LJFF = z;
        if (miniDramaFeedCardResponse.status_code == 0 && miniDramaFeedCardResponse.getCardInfo() != null) {
            C1577320r9G.LIZLLL = miniDramaFeedCardResponse.getContentType();
            C1577320r9G.LIZJ = miniDramaFeedCardResponse.getInsertScene();
            Aweme cardInfo = miniDramaFeedCardResponse.getCardInfo();
            if (cardInfo != null) {
                cardInfo.getAid();
            }
        }
        ((C1577390r9N) afS9S0100100_24.l0).LJII = false;
        long jCurrentTimeMillis = System.currentTimeMillis() - afS9S0100100_24.j1;
        Boolean bool3 = null;
        if (Intrinsics.LJFF(miniDramaFeedCardResponse.getNeedRetry(), Boolean.TRUE)) {
            Integer retryInterval = miniDramaFeedCardResponse.getRetryInterval();
            if (retryInterval != null) {
                iIntValue = retryInterval.intValue();
            } else {
                iIntValue = 5000;
            }
            C786410Ut5.LJLIIL(((long) iIntValue) * 1000, (Handler) ((C1577390r9N) afS9S0100100_24.l0).LIZIZ.getValue(), new ARunnableS124S0100000_24((C1577390r9N) afS9S0100100_24.l0, 128));
        } else {
            ((C1577390r9N) afS9S0100100_24.l0).getClass();
            ((C1577390r9N) afS9S0100100_24.l0).LIZLLL = miniDramaFeedCardResponse;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("notify via dramaNUJDataListeners : ");
            sbLIZ.append(((ArrayList) ((C1577390r9N) afS9S0100100_24.l0).LJI).size());
            sbLIZ.append(" content type ; ");
            MiniDramaFeedCardResponse miniDramaFeedCardResponse2 = ((C1577390r9N) afS9S0100100_24.l0).LIZLLL;
            if (miniDramaFeedCardResponse2 != null) {
                contentType = miniDramaFeedCardResponse2.getContentType();
            } else {
                contentType = null;
            }
            sbLIZ.append(contentType);
            C2188811AlT.LIZIZ(sbLIZ);
            C1577390r9N c1577390r9N = (C1577390r9N) afS9S0100100_24.l0;
            Aweme cardInfo2 = miniDramaFeedCardResponse.getCardInfo();
            if (cardInfo2 != null) {
                C2344009Gk c2344009Gk = new C2344009Gk();
                c2344009Gk.LJIIIIZZ("enter_from", "homepage_hot");
                c2344009Gk.LJIIIIZZ("card_id", "pgc_drama_dnu_card");
                c2344009Gk.LJIIIIZZ("aweme_id", cardInfo2.getAid());
                c2344009Gk.LJIIIIZZ("business_type", "pgc");
                c2344009Gk.LJIIIIZZ("card_type", "card");
                c2344009Gk.LJIIIIZZ("series_card_type", C1577320r9G.LIZ(cardInfo2));
                C20684815ws.LJIILLIIL("special_shaped_card_server", c2344009Gk.LIZ);
            }
            c1577390r9N.getClass();
            ((C1577390r9N) afS9S0100100_24.l0).LJFF = miniDramaFeedCardResponse.getCardConfig();
            Iterator it2 = ((ArrayList) ((C1577390r9N) afS9S0100100_24.l0).LJI).iterator();
            while (it2.hasNext()) {
                ((InterfaceC1577470r9V) it2.next()).LIZ(miniDramaFeedCardResponse);
            }
        }
        C1577320r9G c1577320r9G = C1577320r9G.LIZ;
        EnumC1577400r9O enumC1577400r9O = EnumC1577400r9O.FEED_CARD_RESPONSE;
        Integer numValueOf = Integer.valueOf(((C1577390r9N) afS9S0100100_24.l0).LIZ);
        Boolean needRetry = miniDramaFeedCardResponse.getNeedRetry();
        Aweme cardInfo3 = miniDramaFeedCardResponse.getCardInfo();
        c1577320r9G.getClass();
        String strLIZ = C1577320r9G.LIZ(cardInfo3);
        Long lValueOf = Long.valueOf(jCurrentTimeMillis);
        DramaDNUFeedCardConfig cardConfig = miniDramaFeedCardResponse.getCardConfig();
        if (cardConfig != null) {
            bool = cardConfig.shouldShowCard;
        } else {
            bool = null;
        }
        DramaDNUFeedCardConfig cardConfig2 = miniDramaFeedCardResponse.getCardConfig();
        if (cardConfig2 != null) {
            bool2 = cardConfig2.shouldShowDramaTab;
        } else {
            bool2 = null;
        }
        DramaDNUFeedCardConfig cardConfig3 = miniDramaFeedCardResponse.getCardConfig();
        if (cardConfig3 != null) {
            bool3 = cardConfig3.shouldShowInnerFeed;
        }
        C1577320r9G.LIZIZ(c1577320r9G, enumC1577400r9O, numValueOf, needRetry, strLIZ, null, null, lValueOf, CardStruct.IStatusCode.DEFAULT, null, bool, bool2, bool3, null, null, null, null, null, null, 516720);
        C1C7U.LIZIZ("DramaNUJDataLoader@be57.doRequest$1");
    }

    public static final void accept$7(AfS9S0100100_24 afS9S0100100_24, Object obj) {
        String strValueOf;
        String message;
        C1C7U.LIZ("DramaNUJDataLoader@be57.doRequest$2");
        Throwable th = (Throwable) obj;
        ((C1577390r9N) afS9S0100100_24.l0).LJII = false;
        long jCurrentTimeMillis = System.currentTimeMillis() - afS9S0100100_24.j1;
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
        C1577320r9G.LIZIZ(C1577320r9G.LIZ, EnumC1577400r9O.FEED_CARD_RESPONSE, Integer.valueOf(((C1577390r9N) afS9S0100100_24.l0).LIZ), null, null, null, null, Long.valueOf(jCurrentTimeMillis), strValueOf, message, null, null, null, null, null, null, null, null, null, 523388);
        C1C7U.LIZIZ("DramaNUJDataLoader@be57.doRequest$2");
    }

    public static final void accept$8(AfS9S0100100_24 afS9S0100100_24, Object obj) {
        Boolean bool;
        Boolean bool2;
        Boolean bool3;
        Boolean bool4;
        C1C7U.LIZ("DramaNUJDataLoader@be57.doCheckConfig$1");
        MiniDramaTabConfigResponse miniDramaTabConfigResponse = (MiniDramaTabConfigResponse) obj;
        long jCurrentTimeMillis = System.currentTimeMillis() - afS9S0100100_24.j1;
        ((C1577390r9N) afS9S0100100_24.l0).LJFF = miniDramaTabConfigResponse.getCardConfig();
        C1577390r9N c1577390r9N = (C1577390r9N) afS9S0100100_24.l0;
        DramaDNUFeedCardConfig dramaDNUFeedCardConfig = c1577390r9N.LJFF;
        if (dramaDNUFeedCardConfig != null) {
            Iterator it2 = ((ArrayList) c1577390r9N.LJI).iterator();
            while (it2.hasNext()) {
                ((InterfaceC1577470r9V) it2.next()).LIZIZ(dramaDNUFeedCardConfig);
            }
        }
        C1577320r9G c1577320r9G = C1577320r9G.LIZ;
        EnumC1577400r9O enumC1577400r9O = EnumC1577400r9O.TAB_CONFIG_RESPONSE;
        Long lValueOf = Long.valueOf(jCurrentTimeMillis);
        DramaDNUFeedCardConfig cardConfig = miniDramaTabConfigResponse.getCardConfig();
        if (cardConfig != null) {
            bool = cardConfig.shouldShowCard;
        } else {
            bool = null;
        }
        DramaDNUFeedCardConfig cardConfig2 = miniDramaTabConfigResponse.getCardConfig();
        if (cardConfig2 != null) {
            bool2 = cardConfig2.shouldShowDramaTab;
        } else {
            bool2 = null;
        }
        DramaDNUFeedCardConfig cardConfig3 = miniDramaTabConfigResponse.getCardConfig();
        if (cardConfig3 != null) {
            bool3 = cardConfig3.shouldShowInnerFeed;
        } else {
            bool3 = null;
        }
        DramaDNUFeedCardConfig cardConfig4 = miniDramaTabConfigResponse.getCardConfig();
        if (cardConfig4 != null) {
            bool4 = cardConfig4.shouldShowInnerFeed;
        } else {
            bool4 = null;
        }
        C1577320r9G.LIZIZ(c1577320r9G, enumC1577400r9O, null, null, null, null, null, lValueOf, CardStruct.IStatusCode.DEFAULT, null, bool, bool2, bool3, bool4, null, null, null, null, null, 508542);
        C1C7U.LIZIZ("DramaNUJDataLoader@be57.doCheckConfig$1");
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public AfS9S0100100_24(long r2, X.C1577390r9N r4, int r5) {
        /*
            r1 = this;
            r1.$t = r5
            switch(r5) {
                case 6: goto Le;
                case 7: goto Le;
                default: goto L5;
            }
        L5:
            r0 = r1
            r0.j1 = r2
            r0.l0 = r4
        La:
            r0.<init>()
            return
        Le:
            r0 = r1
            r0.l0 = r4
            r0.j1 = r2
            goto La
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.AfS9S0100100_24.<init>(long, X.0r9N, int):void");
    }

    public AfS9S0100100_24(long j, Object obj, int i) {
        this.$t = i;
        this.j1 = j;
        this.l0 = obj;
    }
}
