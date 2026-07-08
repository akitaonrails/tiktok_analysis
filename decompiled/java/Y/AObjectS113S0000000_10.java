package Y;

import X.C0PLT;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes11.dex */
public class AObjectS113S0000000_10 implements Function1 {
    public final int $t;

    public static final Object invoke$2(AObjectS113S0000000_10 aObjectS113S0000000_10, Object obj) {
        return obj;
    }

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

    public AObjectS113S0000000_10(int i) {
        this.$t = i;
    }

    public static final Object invoke$0(AObjectS113S0000000_10 aObjectS113S0000000_10, Object obj) {
        C0PLT c0plt = (C0PLT) obj;
        if (c0plt != null) {
            return c0plt.getAweme();
        }
        return null;
    }

    public static final Object invoke$1(AObjectS113S0000000_10 aObjectS113S0000000_10, Object obj) {
        C0PLT c0plt = (C0PLT) obj;
        if (c0plt != null) {
            return c0plt.getAweme();
        }
        return null;
    }

    public static final Object invoke$3(AObjectS113S0000000_10 aObjectS113S0000000_10, Object obj) {
        Aweme aweme = (Aweme) obj;
        if (aweme != null) {
            return aweme.getAid();
        }
        return null;
    }

    public static final Object invoke$4(AObjectS113S0000000_10 aObjectS113S0000000_10, Object obj) {
        return obj;
    }
}
