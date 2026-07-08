package Y;

import X.C0V4W;
import X.C1C7U;
import X.C786410Ut5;
import android.content.Context;
import com.facebook.FacebookSdk;
import java.io.File;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes14.dex */
public class ACallableS150S0000000_13 implements Callable {
    public final int $t;

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

    public ACallableS150S0000000_13(int i) {
        this.$t = i;
    }

    public static final Object call$0(ACallableS150S0000000_13 aCallableS150S0000000_13) {
        C1C7U.LIZ("NetworkLegacyApi@97d.<clinit>$1L");
        return Boolean.valueOf(C0V4W.LIZ());
    }

    public static final Object call$1(ACallableS150S0000000_13 aCallableS150S0000000_13) {
        C1C7U.LIZ("KidsModeApplicationImpl@d552.beforeSuperOnCreate$1L");
        return Boolean.valueOf(C0V4W.LIZ());
    }

    public static final Object call$2(ACallableS150S0000000_13 aCallableS150S0000000_13) {
        C1C7U.LIZ("FacebookSdk@8a1e.com_facebook_FacebookSdk__sdkInitialize$___twin___$1L");
        Context context = FacebookSdk.LJII;
        context.getClass();
        File fileW2 = C786410Ut5.w2(context);
        C1C7U.LIZIZ("FacebookSdk@8a1e.com_facebook_FacebookSdk__sdkInitialize$___twin___$1L");
        return fileW2;
    }
}
