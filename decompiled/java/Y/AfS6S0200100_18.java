package Y;

import X.C09JN;
import X.C0XIR;
import X.C1155910gBZ;
import X.C1159120gGk;
import X.C1169930gYB;
import X.C1388190mED;
import X.C1389890mGx;
import X.C1C7U;
import X.C2214201BlK;
import android.app.Activity;
import android.content.Context;
import com.ss.android.ugc.aweme.series.payment.serviceimpl.SeriesPaymentServiceImpl;

/* JADX INFO: loaded from: classes19.dex */
public class AfS6S0200100_18 implements C09JN {
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

    public static final void accept$0(AfS6S0200100_18 afS6S0200100_18, Object obj) {
        C1C7U.LIZ("SeriesPaymentServiceImpl@a944.makePurchase$disposable$14");
        Throwable th = (Throwable) obj;
        if (th instanceof C0XIR) {
            C0XIR c0xir = (C0XIR) th;
            if (c0xir.getErrorCode() == 3004063) {
                SeriesPaymentServiceImpl seriesPaymentServiceImpl = (SeriesPaymentServiceImpl) afS6S0200100_18.l0;
                Context context = (Context) afS6S0200100_18.l1;
                seriesPaymentServiceImpl.getClass();
                SeriesPaymentServiceImpl.LJIILJJIL(context);
            } else {
                SeriesPaymentServiceImpl seriesPaymentServiceImpl2 = (SeriesPaymentServiceImpl) afS6S0200100_18.l0;
                Context context2 = (Context) afS6S0200100_18.l1;
                String errorMsg = c0xir.getErrorMsg();
                seriesPaymentServiceImpl2.getClass();
                Activity activityLIZ = C1388190mED.LIZ(context2);
                if (activityLIZ != null) {
                    C1389890mGx c1389890mGx = new C1389890mGx(activityLIZ);
                    c1389890mGx.LJIIJ(errorMsg);
                    c1389890mGx.LJIIJJI();
                }
            }
        } else if (th instanceof C1169930gYB) {
            ((SeriesPaymentServiceImpl) afS6S0200100_18.l0).getClass();
            Activity activityLJFF = C2214201BlK.LJFF();
            if (activityLJFF != null) {
                C1389890mGx c1389890mGx2 = new C1389890mGx(activityLJFF);
                c1389890mGx2.LJIIIZ(2131847499);
                c1389890mGx2.LJIIJJI();
            }
        } else {
            SeriesPaymentServiceImpl seriesPaymentServiceImpl3 = (SeriesPaymentServiceImpl) afS6S0200100_18.l0;
            Context context3 = (Context) afS6S0200100_18.l1;
            seriesPaymentServiceImpl3.getClass();
            Activity activityLIZ2 = C1388190mED.LIZ(context3);
            if (activityLIZ2 != null) {
                C1389890mGx c1389890mGx3 = new C1389890mGx(activityLIZ2);
                c1389890mGx3.LJIIIZ(2131847498);
                c1389890mGx3.LJIIJJI();
            }
        }
        ((SeriesPaymentServiceImpl) afS6S0200100_18.l0).LJIILIIL(new C1159120gGk(new C1155910gBZ(th), afS6S0200100_18.j2));
        C1C7U.LIZIZ("SeriesPaymentServiceImpl@a944.makePurchase$disposable$14");
    }

    public static final void accept$1(AfS6S0200100_18 afS6S0200100_18, Object obj) {
        C1C7U.LIZ("SeriesPaymentServiceImpl@a944.makePurchase$disposable$7");
        Throwable th = (Throwable) obj;
        if (th instanceof C0XIR) {
            C0XIR c0xir = (C0XIR) th;
            if (c0xir.getErrorCode() == 3004063) {
                SeriesPaymentServiceImpl seriesPaymentServiceImpl = (SeriesPaymentServiceImpl) afS6S0200100_18.l0;
                Context context = (Context) afS6S0200100_18.l1;
                seriesPaymentServiceImpl.getClass();
                SeriesPaymentServiceImpl.LJIILJJIL(context);
            } else {
                SeriesPaymentServiceImpl seriesPaymentServiceImpl2 = (SeriesPaymentServiceImpl) afS6S0200100_18.l0;
                Context context2 = (Context) afS6S0200100_18.l1;
                String errorMsg = c0xir.getErrorMsg();
                seriesPaymentServiceImpl2.getClass();
                Activity activityLIZ = C1388190mED.LIZ(context2);
                if (activityLIZ != null) {
                    C1389890mGx c1389890mGx = new C1389890mGx(activityLIZ);
                    c1389890mGx.LJIIJ(errorMsg);
                    c1389890mGx.LJIIJJI();
                }
            }
        } else if (th instanceof C1169930gYB) {
            ((SeriesPaymentServiceImpl) afS6S0200100_18.l0).getClass();
            Activity activityLJFF = C2214201BlK.LJFF();
            if (activityLJFF != null) {
                C1389890mGx c1389890mGx2 = new C1389890mGx(activityLJFF);
                c1389890mGx2.LJIIIZ(2131847499);
                c1389890mGx2.LJIIJJI();
            }
        } else {
            SeriesPaymentServiceImpl seriesPaymentServiceImpl3 = (SeriesPaymentServiceImpl) afS6S0200100_18.l0;
            Context context3 = (Context) afS6S0200100_18.l1;
            seriesPaymentServiceImpl3.getClass();
            Activity activityLIZ2 = C1388190mED.LIZ(context3);
            if (activityLIZ2 != null) {
                C1389890mGx c1389890mGx3 = new C1389890mGx(activityLIZ2);
                c1389890mGx3.LJIIIZ(2131847498);
                c1389890mGx3.LJIIJJI();
            }
        }
        ((SeriesPaymentServiceImpl) afS6S0200100_18.l0).LJIILIIL(new C1159120gGk(new C1155910gBZ(th), afS6S0200100_18.j2));
        C1C7U.LIZIZ("SeriesPaymentServiceImpl@a944.makePurchase$disposable$7");
    }

    public AfS6S0200100_18(SeriesPaymentServiceImpl seriesPaymentServiceImpl, Context context, long j, int i) {
        this.$t = i;
        this.l0 = seriesPaymentServiceImpl;
        this.l1 = context;
        this.j2 = j;
    }
}
