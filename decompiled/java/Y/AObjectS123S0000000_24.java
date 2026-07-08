package Y;

import X.C06W2;
import X.C1588700rRc;
import X.C1588710rRd;
import X.C1588840rRq;
import X.C1609770rzb;
import X.C2187451AjH;
import X.C2188811AlT;
import X.C23250099c;
import X.EnumC1588650rRX;
import X.InterfaceC497601wk;
import com.ss.android.ugc.aweme.experiment.FollowingRedDotOptExp;
import com.ss.android.ugc.aweme.feed.model.FeedItemList;
import com.ss.android.ugc.aweme.follow.presenter.FollowFeedList;
import com.ss.android.ugc.aweme.main.MainActivity;
import java.util.Random;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes25.dex */
public class AObjectS123S0000000_24 implements Function1 {
    public final int $t;

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.$t) {
            case 0:
                return invoke$0(this, obj);
            case 1:
                return invoke$1(this, obj);
            case 2:
                return invoke$2(this, obj);
            case 3:
                return invoke$3(this, obj);
            case 4:
                return invoke$4(this, obj);
            default:
                return null;
        }
    }

    public AObjectS123S0000000_24(int i) {
        this.$t = i;
    }

    public static final Object invoke$0(AObjectS123S0000000_24 aObjectS123S0000000_24, Object obj) {
        return C1588840rRq.LJIILJJIL(((FollowFeedList) obj).getItems());
    }

    public static final Object invoke$1(AObjectS123S0000000_24 aObjectS123S0000000_24, Object obj) {
        return MainActivity.lambda$beforeSuperOnCreate$5((C06W2) obj);
    }

    public static final Object invoke$2(AObjectS123S0000000_24 aObjectS123S0000000_24, Object obj) {
        int i = C2187451AjH.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("LoadImageCallbackData, duration = ");
        sbLIZ.append(((C1609770rzb) obj).LJFF);
        C2188811AlT.LIZIZ(sbLIZ);
        return Unit.LIZ;
    }

    public static final Object invoke$3(AObjectS123S0000000_24 aObjectS123S0000000_24, Object obj) {
        if (((Random) FollowingRedDotOptExp.LIZIZ.getValue()).nextFloat() < FollowingRedDotOptExp.LIZ().preloadSampleRate) {
            C1588700rRc c1588700rRc = C1588700rRc.LIZ;
            EnumC1588650rRX enumC1588650rRX = EnumC1588650rRX.RED_DOT;
            c1588700rRc.getClass();
            C23250099c.LIZLLL((InterfaceC497601wk) C1588700rRc.LIZIZ.getValue(), null, null, new C1588710rRd(enumC1588650rRX, null), 3);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$4(AObjectS123S0000000_24 aObjectS123S0000000_24, Object obj) {
        return ((FeedItemList) obj).getItems();
    }
}
