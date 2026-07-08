package X;

import com.bytedance.android.livesdk.livesetting.game.LiveGameSafetyReporterSetting;
import com.bytedance.android.livesdkapi.host.ILiveGameService;

/* JADX INFO: renamed from: X.0UeH, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C777230UeH {
    public static long LIZ;
    public static long LIZIZ;
    public static boolean LIZJ;
    public static boolean LIZLLL;
    public static double LJ;
    public static final double LJFF = LiveGameSafetyReporterSetting.INSTANCE.getValue().threshold;
    public static final double LJI = 0.99d;

    public static void LIZ(Object obj, String str) {
        ((ILiveGameService) C1161920gLG.LIZJ(ILiveGameService.class)).XL0(obj, str);
    }
}
