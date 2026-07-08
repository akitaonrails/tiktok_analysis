package X;

import Y.ARunnableS112S0100000_12;
import android.os.Handler;
import com.bytedance.android.livesdkapi.depend.model.live.LiveMode;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS199S0000000_12;

/* JADX INFO: renamed from: X.0UUu, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C773220UUu extends C0K04 {
    public static LiveMode LJ;
    public static boolean LJIIIZ;
    public static boolean LJIIJ;
    public static boolean LJIIJJI;
    public static boolean LJIIL;
    public static boolean LJIILIIL;
    public static int LJIILL;
    public static final C773220UUu LIZ = new C773220UUu();
    public static final ConcurrentHashMap<EnumC773230UUv, C773210UUt> LIZIZ = new ConcurrentHashMap<>();
    public static final C01GW LIZJ = C452501pT.LIZIZ(AFwS199S0000000_12.get$arr$(519));
    public static final C01GW LIZLLL = C452501pT.LIZIZ(AFwS199S0000000_12.get$arr$(520));
    public static final ConcurrentHashMap<String, String> LJFF = new ConcurrentHashMap<>();
    public static EnumC773230UUv LJI = EnumC773230UUv.STATE_T0;
    public static List<String> LJII = C13BV.INSTANCE;
    public static long LJIIIIZZ = -1;
    public static String LJIILJJIL = "";

    public static boolean LJIIJ() {
        return C13LP.LJJJJ(LJ, C1697810uHb.LJIIJJI(LiveMode.SCREEN_RECORD, LiveMode.THIRD_PARTY, LiveMode.LIVE_STUDIO));
    }

    public static void LJIIJJI(LiveMode liveMode) {
        C786410Ut5.LJJZZIII((Handler) LIZLLL.getValue(), new ARunnableS112S0100000_12(liveMode, 464));
    }

    public static void LJIIL(Function1 function1) {
        if (!LJIIJ()) {
            return;
        }
        C786410Ut5.LJJZZIII((Handler) LIZLLL.getValue(), new ARunnableS112S0100000_12(function1, 465));
    }

    public static C773210UUt LJIILIIL(EnumC773230UUv enumC773230UUv) {
        ConcurrentHashMap<EnumC773230UUv, C773210UUt> concurrentHashMap = LIZIZ;
        C773210UUt c773210UUt = concurrentHashMap.get(enumC773230UUv);
        if (c773210UUt == null) {
            C773210UUt c773210UUt2 = new C773210UUt(enumC773230UUv);
            concurrentHashMap.put(enumC773230UUv, c773210UUt2);
            return c773210UUt2;
        }
        return c773210UUt;
    }
}
