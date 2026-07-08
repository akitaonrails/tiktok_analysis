package X;

import android.os.Looper;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.ug.IUgCommonService;

/* JADX INFO: renamed from: X.0T3N, reason: invalid class name */
/* JADX INFO: loaded from: classes13.dex */
public final class C0T3N {
    public static final C0T3N LIZ = new C0T3N();
    public static boolean LIZIZ;
    public static boolean LIZJ;
    public static Aweme LIZLLL;
    public static final Keva LJ;
    public static long LJFF;
    public static boolean LJI;
    public static boolean LJII;
    public static final boolean LJIIIIZZ;
    public static final BPEAHandler LJIIIZ;
    public static final C0T3O LJIIJ;
    public static final C0T35 LJIIJJI;

    /* JADX WARN: Type inference failed for: r0v13, types: [X.0T35] */
    static {
        Keva.getRepo("deliverAdKeva");
        LJIIIZ = new BPEAHandler(Looper.getMainLooper());
        Keva repo = Keva.getRepo("keva_video_consume");
        LJ = repo;
        LJFF = repo.getLong("video_consume_time_name", 0L);
        LJI = repo.getBoolean("video_consume_10_minutes", false);
        boolean z = repo.getBoolean("video_consume_15_minutes", false);
        LJII = z;
        LIZJ = !z;
        LJIIIIZZ = Keva.getRepo("deliverAdKeva").getBoolean("webtoon_platform_enabled", false);
        LIZIZ();
        LJIIJ = new C0T3O();
        LJIIJJI = new Runnable() { // from class: X.0T35
            @Override // java.lang.Runnable
            public final void run() {
                boolean zLIZ;
                C1C7U.LIZ("VideoConsumeAttribution@55c9.timerRunnable$1");
                try {
                    C1483410ohn.LJLJJI().LJJLIIIJ();
                    if (C2214201BlK.LJFF() instanceof C19EG) {
                        C01U6.LIZIZ(new C0T36());
                    }
                    C786410Ut5.LJLIIL(1000L, C0T3N.LJIIIZ, this);
                } finally {
                    if (!zLIZ) {
                    }
                }
                C1C7U.LIZIZ("VideoConsumeAttribution@55c9.timerRunnable$1");
            }
        };
    }

    public static void LIZ() {
        if (LIZJ && LJIIIIZZ) {
            C844470XAv.LIZ.getClass();
            C1233040iBy c1233040iBy = new C1233040iBy(C844470XAv.LIZ());
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("");
            sbLIZ.append(LJFF);
            c1233040iBy.LIZJ(C2188811AlT.LIZIZ(sbLIZ));
            c1233040iBy.LIZLLL();
        }
    }

    public static void LIZIZ() {
        ((IUgCommonService) ServiceManager.get().getService(IUgCommonService.class)).LIZLLL();
        if (LJFF >= 600 && !LJI) {
            LJI = true;
            C836440Wra.LJFF(new C20144713rx(939524106), "af_playtime_10min");
            LJ.storeBoolean("video_consume_10_minutes", true);
            LIZ();
        }
        if (LJFF < 900 || LJII) {
            return;
        }
        LJII = true;
        C836440Wra.LJFF(new C20144713rx(939524107), "af_playtime_15min");
        LJ.storeBoolean("video_consume_15_minutes", true);
        LIZ();
        LIZJ = false;
        if (LIZIZ) {
            LIZIZ = false;
            LJIIIZ.removeCallbacks(LJIIJJI);
        }
        LIZIZ();
    }
}
