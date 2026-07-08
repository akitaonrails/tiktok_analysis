package Y;

import X.AbstractC19484711Kz;
import X.AbstractC19486711Lt;
import X.C11HU;
import X.C11I8;
import X.C11KD;
import X.C11QJ;
import X.C11S5;
import X.C1620280sGY;
import X.C1701890uOB;
import X.C1701940uOG;
import X.C19489311Mt;
import X.C1C7U;
import X.C2097608Jq;
import X.C280320Ayk;
import X.C517630KRt;
import X.C786410Ut5;
import X.EnumC2198071B0z;
import X.InterfaceC1487280oo2;
import android.content.Context;
import android.os.Handler;
import com.ss.android.ugc.aweme.discover.experiment.DiscoveryCommonPoolExperiment;
import com.ss.android.ugc.aweme.discover.ui.TrendsTabFragment;
import com.ss.android.ugc.aweme.series.vip.serviceimpl.SeriesSubscriptionServiceImpl;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;
import kotlin.Unit;

/* JADX INFO: loaded from: classes30.dex */
public class ACallableS183S0300000_29 implements Callable {
    public final int $t;
    public Object l0;
    public Object l1;
    public Object l2;

    @Override // java.util.concurrent.Callable
    public final Object call() {
        switch (this.$t) {
            case 0:
                return call$0(this);
            case 1:
                return call$1(this);
            default:
                return null;
        }
    }

    public static final Object call$0(ACallableS183S0300000_29 aCallableS183S0300000_29) {
        AbstractC19486711Lt abstractC19486711LtLJIJ;
        AbstractC19484711Kz abstractC19484711KzLJIJJLI;
        C1C7U.LIZ("SeriesSubscriptionServiceImpl@3758.gateOnPrecheck$1");
        if (((Number) C280320Ayk.LIZ.getValue()).intValue() == 1) {
            Map<String, C517630KRt> map = ((SeriesSubscriptionServiceImpl) aCallableS183S0300000_29.l0).LIZLLL;
            C19489311Mt<Map<String, C517630KRt>> c19489311Mt = ((SeriesSubscriptionServiceImpl) aCallableS183S0300000_29.l0).LJ;
            if (true ^ map.isEmpty()) {
                abstractC19484711KzLJIJJLI = AbstractC19484711Kz.LJIJJLI(map);
            } else if (c19489311Mt != null) {
                C11I8 c11i8LJJIJIL = c19489311Mt.LJJIJIL(1500L, TimeUnit.MILLISECONDS, C11S5.LIZIZ, null);
                Map mapLJ = C2097608Jq.LJ();
                C1701890uOB.LIZ(mapLJ, "value is null");
                abstractC19484711KzLJIJJLI = new C11KD(c11i8LJJIJIL, null, mapLJ);
            } else {
                abstractC19484711KzLJIJJLI = AbstractC19484711Kz.LJIJJLI(C2097608Jq.LJ());
            }
            C11HU c11huLJJ = abstractC19484711KzLJIJJLI.LJJ(C1701940uOG.LIZIZ());
            final SeriesSubscriptionServiceImpl seriesSubscriptionServiceImpl = (SeriesSubscriptionServiceImpl) aCallableS183S0300000_29.l0;
            final EnumC2198071B0z enumC2198071B0z = (EnumC2198071B0z) aCallableS183S0300000_29.l1;
            final Context context = (Context) aCallableS183S0300000_29.l2;
            abstractC19486711LtLJIJ = c11huLJJ.LJIJ(new InterfaceC1487280oo2() { // from class: X.1B0v
                /* JADX WARN: Removed duplicated region for block: B:103:0x019d  */
                /* JADX WARN: Removed duplicated region for block: B:110:0x01be  */
                /* JADX WARN: Removed duplicated region for block: B:123:0x0163 A[SYNTHETIC] */
                /* JADX WARN: Removed duplicated region for block: B:69:0x0128  */
                /* JADX WARN: Removed duplicated region for block: B:77:0x0141  */
                /* JADX WARN: Removed duplicated region for block: B:97:0x0189  */
                @Override // X.InterfaceC1487280oo2
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final java.lang.Object apply(java.lang.Object r24) {
                    /*
                        Method dump skipped, instruction units count: 526
                        To view this dump add '--comments-level debug' option
                    */
                    throw new UnsupportedOperationException("Method not decompiled: X.C2198031B0v.apply(java.lang.Object):java.lang.Object");
                }
            });
        } else {
            abstractC19486711LtLJIJ = C11QJ.LL;
        }
        C1C7U.LIZIZ("SeriesSubscriptionServiceImpl@3758.gateOnPrecheck$1");
        return abstractC19486711LtLJIJ;
    }

    public static final Object call$1(ACallableS183S0300000_29 aCallableS183S0300000_29) {
        C1C7U.LIZ("TrendsTabFragment@d507.doPreCreateCoverViewHolder$1");
        int i = ((DiscoveryCommonPoolExperiment.DiscoveryCommonPoolExperimentConfig) DiscoveryCommonPoolExperiment.LIZIZ.getValue()).poolSize;
        if (i >= 0) {
            int i2 = 0;
            while (true) {
                C786410Ut5.LJJZZIII((Handler) aCallableS183S0300000_29.l2, new ARunnableS98S0200000_29((TrendsTabFragment) aCallableS183S0300000_29.l1, ((C1620280sGY) aCallableS183S0300000_29.l0).createViewHolder(((TrendsTabFragment) aCallableS183S0300000_29.l1).RR(), 0), 80));
                if (i2 == i) {
                    break;
                }
                i2++;
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("TrendsTabFragment@d507.doPreCreateCoverViewHolder$1");
        return unit;
    }

    public ACallableS183S0300000_29(Object obj, Object obj2, Object obj3, int i) {
        this.$t = i;
        this.l0 = obj;
        this.l1 = obj2;
        this.l2 = obj3;
    }
}
