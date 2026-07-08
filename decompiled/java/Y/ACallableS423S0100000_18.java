package Y;

import X.C1159710gHh;
import X.C189200o6;
import X.C1C7U;
import X.InterfaceC1158780gGC;
import com.ss.android.ugc.aweme.ogc.news.managetopics.ManageTopicsContentVM;
import java.util.concurrent.Callable;
import kotlin.Unit;
import kotlin.jvm.internal.AwS562S0100000_18;

/* JADX INFO: loaded from: classes19.dex */
public class ACallableS423S0100000_18 implements Callable {
    public final int $t;
    public Object l0;

    @Override // java.util.concurrent.Callable
    public final Object call() {
        switch (this.$t) {
            case 0:
                return call$0(this);
            case 1:
                return call$1(this);
            case 2:
                return call$2(this);
            default:
                return null;
        }
    }

    public static final Object call$0(ACallableS423S0100000_18 aCallableS423S0100000_18) {
        C1C7U.LIZ("DramaTopTabMainViewModel@c9d0.loadData$2");
        C189200o6 c189200o6M1boximpl = C189200o6.m1boximpl(((InterfaceC1158780gGC) aCallableS423S0100000_18.l0).LIZ());
        C1C7U.LIZIZ("DramaTopTabMainViewModel@c9d0.loadData$2");
        return c189200o6M1boximpl;
    }

    public static final Object call$1(ACallableS423S0100000_18 aCallableS423S0100000_18) {
        C1C7U.LIZ("ManageTopicsContentVM@4b1f.maybeTriggerGuideShow$1");
        Integer numLIZ = ((ManageTopicsContentVM) aCallableS423S0100000_18.l0).LLILLJJLI.LIZ();
        C1C7U.LIZIZ("ManageTopicsContentVM@4b1f.maybeTriggerGuideShow$1");
        return numLIZ;
    }

    public static final Object call$2(ACallableS423S0100000_18 aCallableS423S0100000_18) {
        C1C7U.LIZ("ManageTopicsContentVM@4b1f.handleGuideShow$1");
        C1159710gHh c1159710gHh = ((ManageTopicsContentVM) aCallableS423S0100000_18.l0).LLILLJJLI.LIZ;
        c1159710gHh.getClass();
        C1159710gHh.LIZ("updateTopicsGuideShowTime", new AwS562S0100000_18(c1159710gHh, 2771));
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("ManageTopicsContentVM@4b1f.handleGuideShow$1");
        return unit;
    }

    public ACallableS423S0100000_18(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }
}
