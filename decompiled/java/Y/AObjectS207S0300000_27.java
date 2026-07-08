package Y;

import X.C1842380y2m;
import X.C1842680y3G;
import X.C1842700y3I;
import X.C1842720y3K;
import X.C1842740y3M;
import X.EnumC1100320eju;
import com.bytedance.android.live.rank.impl.entrance.widget.RankEntranceManager;
import com.bytedance.android.live.rank.impl.entrance.widget.RankEntranceWidget;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes28.dex */
public class AObjectS207S0300000_27 implements Function0 {
    public final int $t;
    public Object l0;
    public Object l1;
    public Object l2;

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.$t) {
            case 0:
                return invoke$0(this);
            case 1:
                return invoke$1(this);
            default:
                return null;
        }
    }

    public static final Object invoke$0(AObjectS207S0300000_27 aObjectS207S0300000_27) {
        return new RankEntranceWidget((C1842380y2m) aObjectS207S0300000_27.l0, (EnumC1100320eju) aObjectS207S0300000_27.l1, new C1842680y3G(((RankEntranceManager) aObjectS207S0300000_27.l2).LLILLL), new C1842720y3K(((RankEntranceManager) aObjectS207S0300000_27.l2).LLILLL));
    }

    public static final Object invoke$1(AObjectS207S0300000_27 aObjectS207S0300000_27) {
        return new RankEntranceWidget((C1842380y2m) aObjectS207S0300000_27.l0, (EnumC1100320eju) aObjectS207S0300000_27.l1, new C1842700y3I(((RankEntranceManager) aObjectS207S0300000_27.l2).LLILLL), new C1842740y3M(((RankEntranceManager) aObjectS207S0300000_27.l2).LLILLL));
    }

    public AObjectS207S0300000_27(C1842380y2m c1842380y2m, EnumC1100320eju enumC1100320eju, RankEntranceManager rankEntranceManager, int i) {
        this.$t = i;
        this.l0 = c1842380y2m;
        this.l1 = enumC1100320eju;
        this.l2 = rankEntranceManager;
    }
}
