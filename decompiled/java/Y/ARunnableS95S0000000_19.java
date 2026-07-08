package Y;

import X.C1192870h9B;
import X.C1259520isg;
import X.C1474930oU7;
import X.C1C7U;
import com.ss.android.ugc.aweme.IMandatoryLoginService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import java.util.Iterator;

/* JADX INFO: loaded from: classes20.dex */
public class ARunnableS95S0000000_19 implements Runnable {
    public final int $t;

    @Override // java.lang.Runnable
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
        }
    }

    public String toString() {
        return this.$t + "_" + super.toString();
    }

    public ARunnableS95S0000000_19(int i) {
        this.$t = i;
    }

    public static final void run$0(ARunnableS95S0000000_19 aRunnableS95S0000000_19) {
        C1C7U.LIZ("InitAllServiceImpl@9f53.lambda$initNewUserHook$1$1L");
        C1192870h9B.LIZ.getClass();
        ((IMandatoryLoginService) ServiceManager.get().getService(IMandatoryLoginService.class)).shouldShowForcedLogin(false);
        C1C7U.LIZIZ("InitAllServiceImpl@9f53.lambda$initNewUserHook$1$1L");
    }

    public static final void run$1(ARunnableS95S0000000_19 aRunnableS95S0000000_19) {
        C1C7U.LIZ("Cbof@7eb0.<clinit>$1L");
        Iterator<Runnable> it2 = C1474930oU7.LIZ.iterator();
        while (it2.hasNext()) {
            it2.next().run();
        }
        C1474930oU7.LIZ.clear();
        C1C7U.LIZIZ("Cbof@7eb0.<clinit>$1L");
    }

    public static final void run$2(ARunnableS95S0000000_19 aRunnableS95S0000000_19) {
        C1C7U.LIZ("AwemeListFragmentImpl@a373.dealWithFavoritesMobOnStart$1L");
        C1259520isg.LIZIZ.setDataSetChangedOnStart(false);
        C1C7U.LIZIZ("AwemeListFragmentImpl@a373.dealWithFavoritesMobOnStart$1L");
    }
}
