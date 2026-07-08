package Y;

import X.C09UU;
import X.C1444670nhJ;
import X.C1444720nhO;
import X.C1C7U;
import X.EnumC2272608vM;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.services.IFoundationAVService;
import com.ss.android.ugc.aweme.services.IInternalAVService;
import java.util.HashMap;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes23.dex */
public class ACallableS152S0000000_22 implements Callable {
    public final int $t;

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

    public ACallableS152S0000000_22(int i) {
        this.$t = i;
    }

    public static final Object call$0(ACallableS152S0000000_22 aCallableS152S0000000_22) {
        C1C7U.LIZ("TTUploaderService@e032.cacheUploadAuthKeyConfig$1L");
        C09UU.LIZ(C1444720nhO.LIZIZ().getUploadAuthKeyConfig(new HashMap(0)), new C1444670nhJ(System.currentTimeMillis()), EnumC2272608vM.LL);
        C1C7U.LIZIZ("TTUploaderService@e032.cacheUploadAuthKeyConfig$1L");
        return null;
    }

    public static final Object call$1(ACallableS152S0000000_22 aCallableS152S0000000_22) {
        C1C7U.LIZ("DuetWithMovieHelper@adfe.tryCopyDuetDefaultLayout$1L");
        ((IFoundationAVService) ServiceManager.get().getService(IInternalAVService.class)).tryCopyDuetDefaultLayout();
        C1C7U.LIZIZ("DuetWithMovieHelper@adfe.tryCopyDuetDefaultLayout$1L");
        return null;
    }
}
