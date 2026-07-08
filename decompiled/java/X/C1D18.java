package X;

import com.ss.android.ugc.aweme.series.vip.serviceimpl.SeriesSubscriptionServiceImpl;

/* JADX INFO: renamed from: X.1D18, reason: invalid class name */
/* JADX INFO: loaded from: classes35.dex */
public class C1D18 implements InterfaceC781210Ukh {
    public final int $t;
    public Object l0;

    @Override // X.InterfaceC781210Ukh
    public final void run() {
        switch (this.$t) {
            case 0:
                run$0(this);
                break;
            case 1:
                run$1(this);
                break;
            case 2:
                run$2(this);
                break;
            case 3:
                run$3(this);
                break;
            case 4:
                run$4(this);
                break;
            case 5:
                run$5(this);
                break;
        }
    }

    public static final void run$0(C1D18 c1d18) {
        ((SeriesSubscriptionServiceImpl) c1d18.l0).LIZ.onNext(C1614610s7P.LIZ);
    }

    public static final void run$1(C1D18 c1d18) {
        ((SeriesSubscriptionServiceImpl) c1d18.l0).LIZ.onNext(C1614610s7P.LIZ);
    }

    public static final void run$2(C1D18 c1d18) {
        ((SeriesSubscriptionServiceImpl) c1d18.l0).LIZ.onNext(C1614610s7P.LIZ);
    }

    public static final void run$3(C1D18 c1d18) {
        ((SeriesSubscriptionServiceImpl) c1d18.l0).LIZ.onNext(C1614610s7P.LIZ);
    }

    public static final void run$4(C1D18 c1d18) {
        C2208461Bc4 c2208461Bc4 = (C2208461Bc4) c1d18.l0;
        c2208461Bc4.getClass();
        C2208461Bc4.LIZ("close speedProbe start", true);
        AbstractC2208051BbP abstractC2208051BbP = c2208461Bc4.LIZJ;
        if (abstractC2208051BbP != null) {
            abstractC2208051BbP.LIZIZ();
        }
        AbstractC2208051BbP abstractC2208051BbP2 = c2208461Bc4.LIZJ;
        if (abstractC2208051BbP2 != null) {
            abstractC2208051BbP2.LIZ();
        }
        c2208461Bc4.LIZJ = null;
        C2208461Bc4.LIZ("close speedProbe finish", true);
    }

    public static final void run$5(C1D18 c1d18) {
        C2208451Bc3 c2208451Bc3 = (C2208451Bc3) c1d18.l0;
        c2208451Bc3.getClass();
        C2208451Bc3.LIZ("close speedProbe start", true);
        AbstractC2208061BbQ abstractC2208061BbQ = c2208451Bc3.LIZJ;
        if (abstractC2208061BbQ != null) {
            abstractC2208061BbQ.LIZIZ();
        }
        AbstractC2208061BbQ abstractC2208061BbQ2 = c2208451Bc3.LIZJ;
        if (abstractC2208061BbQ2 != null) {
            abstractC2208061BbQ2.LIZ();
        }
        c2208451Bc3.LIZJ = null;
        C2208451Bc3.LIZ("close speedProbe finish", true);
    }

    public C1D18(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }
}
