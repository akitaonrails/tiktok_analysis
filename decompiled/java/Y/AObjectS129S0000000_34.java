package Y;

import X.C1BMW;
import X.C1BMY;
import X.C2203591BMf;
import X.C291680Bby;
import X.C538540LAe;
import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.experiment.FollowFeedViewStubExperiment;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes35.dex */
public class AObjectS129S0000000_34 implements Function1 {
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
            default:
                return null;
        }
    }

    public AObjectS129S0000000_34(int i) {
        this.$t = i;
    }

    public static final Object invoke$0(AObjectS129S0000000_34 aObjectS129S0000000_34, Object obj) {
        if (!Keva.getRepo(FollowFeedViewStubExperiment.REPO_NAME).getBoolean("should_crash", false) && !C291680Bby.LIZ()) {
            C2203591BMf.LIZIZ(86400000);
        } else {
            C2203591BMf.LIZIZ(C538540LAe.LLJJJIL);
        }
        C1BMY.LIZIZ().getClass();
        C1BMW.LIZIZ();
        return null;
    }

    public static final Object invoke$1(AObjectS129S0000000_34 aObjectS129S0000000_34, Object obj) {
        if (!Keva.getRepo(FollowFeedViewStubExperiment.REPO_NAME).getBoolean("should_crash", false) && !C291680Bby.LIZ()) {
            C2203591BMf.LIZIZ(14400000);
        } else {
            C2203591BMf.LIZIZ(C538540LAe.LLJJJIL);
        }
        C1BMY.LIZIZ().getClass();
        C1BMW.LIZ();
        return null;
    }

    public static final /* bridge */ /* synthetic */ Object invoke$2(AObjectS129S0000000_34 aObjectS129S0000000_34, Object obj) {
        return Unit.LIZ;
    }
}
