package Y;

import X.C1590120rTu;
import X.C1616470sAP;
import X.C1C7U;
import X.C707370Rot;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.services.IExternalService;

/* JADX INFO: loaded from: classes25.dex */
public class ARunnableS99S0000000_24 implements Runnable {
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
            case 3:
                run$3(this);
                break;
        }
    }

    public String toString() {
        return this.$t + "_" + super.toString();
    }

    public ARunnableS99S0000000_24(int i) {
        this.$t = i;
    }

    public static final void run$0(ARunnableS99S0000000_24 aRunnableS99S0000000_24) {
        C1C7U.LIZ("SettingManager@d659.setServerSetting$1L");
        ((IExternalService) ServiceManager.get().getService(IExternalService.class)).initService().initTask(3, null);
        C1C7U.LIZIZ("SettingManager@d659.setServerSetting$1L");
    }

    public static final void run$1(ARunnableS99S0000000_24 aRunnableS99S0000000_24) {
        boolean zLIZ;
        C1C7U.LIZ("LiveBroadcastActivity@bdab.<field>$2");
        try {
            C707370Rot.LIZ.LIZIZ("LiveBroadcastPageEnter").postValue(null);
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("LiveBroadcastActivity@bdab.<field>$2");
    }

    public static final void run$2(ARunnableS99S0000000_24 aRunnableS99S0000000_24) {
        C1C7U.LIZ("LiveOuterService@2ce2.prepareTTNetInterceptor$1L");
        C1590120rTu.LIZIZ.LJ();
        C1C7U.LIZIZ("LiveOuterService@2ce2.prepareTTNetInterceptor$1L");
    }

    public static final void run$3(ARunnableS99S0000000_24 aRunnableS99S0000000_24) {
        C1C7U.LIZ("FeedFetchModel@3835.fetchList$1L");
        C1616470sAP.LIZ.getClass();
        C1616470sAP.LIZIZ.LJI(null);
        C1C7U.LIZIZ("FeedFetchModel@3835.fetchList$1L");
    }
}
