package Y;

import X.C05P0;
import X.C1601380rm4;
import X.C1606010rtX;
import X.C20303114cP;
import X.EnumC1606080rte;
import X.EnumC1615506Uf;
import android.os.PowerManager;
import com.ss.android.ugc.aweme.feed.model.FeedItemList;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes20.dex */
public class AObjectS293S0200000_19 implements Function0 {
    public final int $t;
    public Object l0;
    public Object l1;

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, kotlin.Unit] */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Unit] */
    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        switch (this.$t) {
            case 0:
                return invoke$0(this);
            case 1:
                return invoke$1(this);
            default:
                return null;
        }
    }

    public static final Object invoke$0(AObjectS293S0200000_19 aObjectS293S0200000_19) {
        ((C05P0) aObjectS293S0200000_19.l0).setValue(Boolean.valueOf(C20303114cP.LJII((PowerManager) aObjectS293S0200000_19.l1)));
        return Unit.LIZ;
    }

    public static final Object invoke$1(AObjectS293S0200000_19 aObjectS293S0200000_19) {
        C1601380rm4 c1601380rm4 = (C1601380rm4) aObjectS293S0200000_19.l0;
        FeedItemList feedItemList = (FeedItemList) aObjectS293S0200000_19.l1;
        c1601380rm4.getClass();
        C1606010rtX.LIZIZ.LIZJ(EnumC1615506Uf.STORY, EnumC1606080rte.FEED, feedItemList.getItems(), new AObjectS362S0100000_19(c1601380rm4, 30));
        return null;
    }

    public AObjectS293S0200000_19(Object obj, Object obj2, int i) {
        this.$t = i;
        this.l0 = obj;
        this.l1 = obj2;
    }
}
