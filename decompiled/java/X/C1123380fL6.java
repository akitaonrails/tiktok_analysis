package X;

import com.bytedance.android.livesdk.livesetting.gift.LiveGiftUserJourneyStepSizeLimitSetting;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.concurrent.ConcurrentLinkedQueue;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0fL6, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1123380fL6 {
    public static final ConcurrentLinkedQueue<Integer> LIZ = new ConcurrentLinkedQueue<>();
    public static int LIZIZ;
    public static long LIZJ;
    public static int LIZLLL;
    public static long LJ;

    public static boolean LIZIZ() {
        return LiveGiftUserJourneyStepSizeLimitSetting.sizeLimit() > 0;
    }

    public static void LIZLLL() {
        if (LIZIZ()) {
            ConcurrentLinkedQueue<Integer> concurrentLinkedQueue = LIZ;
            concurrentLinkedQueue.clear();
            concurrentLinkedQueue.add(101);
            LIZLLL = 0;
            LJ = 0L;
            LIZIZ = 101;
            LIZJ = System.currentTimeMillis();
        }
    }

    public static void LIZ(JSONObject jSONObject) {
        if (LIZIZ()) {
            try {
                jSONObject.put("journey", C13LP.LJJLIIIJ(LIZ, ",", null, ",", 0, null, null, 58));
                jSONObject.put("journey_last_step", LIZLLL);
                jSONObject.put("journey_last_step_duration", LIZJ - LJ);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                C1AF0.LJFF(th, "live gift user journey append info error");
            }
        }
    }

    public static void LIZJ(int i, boolean z) {
        if (LIZIZ()) {
            if (z && LIZIZ == i) {
                LIZJ = System.currentTimeMillis();
                return;
            }
            LIZLLL = LIZIZ;
            LJ = LIZJ;
            LIZIZ = i;
            LIZJ = System.currentTimeMillis();
            ConcurrentLinkedQueue<Integer> concurrentLinkedQueue = LIZ;
            if (concurrentLinkedQueue.size() >= LiveGiftUserJourneyStepSizeLimitSetting.sizeLimit()) {
                int size = concurrentLinkedQueue.size() - LiveGiftUserJourneyStepSizeLimitSetting.sizeLimit();
                int i2 = 1;
                int i3 = size + 1;
                if (1 <= i3) {
                    while (true) {
                        LIZ.poll();
                        if (i2 == i3) {
                            break;
                        } else {
                            i2++;
                        }
                    }
                }
            }
            LIZ.add(Integer.valueOf(i));
        }
    }
}
