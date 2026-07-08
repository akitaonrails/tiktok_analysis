package X;

import com.bytedance.applog.AppLog;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Vgo, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C804280Vgo {
    public static volatile String LIZIZ;
    public static volatile String LIZJ;
    public static volatile String LIZLLL;
    public static volatile String LJ;
    public static volatile String LJFF;
    public static volatile String LJI;
    public static volatile String LJII;
    public static volatile String LJIIIIZZ;
    public static volatile String LJIIIZ;
    public static volatile String LJIIJ;
    public static volatile String LJIIJJI;
    public static boolean LJIILIIL;
    public static final C804280Vgo LIZ = new C804280Vgo();
    public static final ConcurrentHashMap<String, String> LJIIL = new ConcurrentHashMap<>();

    public static final void LIZ(EnumC805430Vif enumC805430Vif) {
        String sessionId = AppLog.getSessionId();
        if (sessionId == null) {
            sessionId = "";
        }
        switch (C804310Vgr.LIZ[enumC805430Vif.ordinal()]) {
            case 1:
                if (!Intrinsics.LJFF(LIZJ, sessionId)) {
                    LIZJ = sessionId;
                    C804290Vgp.LIZ(new C804330Vgt(enumC805430Vif, EnumC804170Vgd.ENTER, sessionId, 0L, 24));
                }
                break;
            case 2:
                if (!Intrinsics.LJFF(LIZLLL, sessionId)) {
                    LIZLLL = sessionId;
                    C804290Vgp.LIZ(new C804330Vgt(enumC805430Vif, EnumC804170Vgd.ENTER, sessionId, 0L, 24));
                }
                break;
            case 3:
                if (!Intrinsics.LJFF(LJ, sessionId)) {
                    LJ = sessionId;
                    C804290Vgp.LIZ(new C804330Vgt(enumC805430Vif, EnumC804170Vgd.ENTER, sessionId, 0L, 24));
                }
                break;
            case 4:
                if (!Intrinsics.LJFF(LJFF, sessionId)) {
                    LJFF = sessionId;
                    C804290Vgp.LIZ(new C804330Vgt(enumC805430Vif, EnumC804170Vgd.ENTER, sessionId, 0L, 24));
                }
                break;
            case 5:
                if (!Intrinsics.LJFF(LJI, sessionId)) {
                    LJI = sessionId;
                    C804290Vgp.LIZ(new C804330Vgt(enumC805430Vif, EnumC804170Vgd.ENTER, sessionId, 0L, 24));
                }
                break;
            case 6:
                if (!Intrinsics.LJFF(LJII, sessionId)) {
                    LJII = sessionId;
                    C804290Vgp.LIZ(new C804330Vgt(enumC805430Vif, EnumC804170Vgd.ENTER, sessionId, 0L, 24));
                }
                break;
            case 7:
                if (!Intrinsics.LJFF(LJIIIIZZ, sessionId)) {
                    LJIIIIZZ = sessionId;
                    C804290Vgp.LIZ(new C804330Vgt(enumC805430Vif, EnumC804170Vgd.ENTER, sessionId, 0L, 24));
                }
                break;
            case 8:
                if (!Intrinsics.LJFF(LJIIIZ, sessionId)) {
                    LJIIIZ = sessionId;
                    C804290Vgp.LIZ(new C804330Vgt(enumC805430Vif, EnumC804170Vgd.ENTER, sessionId, 0L, 24));
                }
                break;
            case BdTuring.TYPE_ECAF /* 9 */:
                if (!Intrinsics.LJFF(LJIIJ, sessionId)) {
                    LJIIJ = sessionId;
                    C804290Vgp.LIZ(new C804330Vgt(enumC805430Vif, EnumC804170Vgd.ENTER, sessionId, 0L, 24));
                }
                break;
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                if (!Intrinsics.LJFF(LJIIJJI, sessionId)) {
                    LJIIJJI = sessionId;
                    C804290Vgp.LIZ(new C804330Vgt(enumC805430Vif, EnumC804170Vgd.ENTER, sessionId, 0L, 24));
                }
                break;
        }
    }
}
