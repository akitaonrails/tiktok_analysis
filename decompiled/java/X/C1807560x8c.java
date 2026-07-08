package X;

import com.bytedance.android.livesdk.userservice.UserService;
import com.bytedance.android.livesdk.wallet.Diamond;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: X.0x8c, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1807560x8c {
    public static long LIZ;
    public static long LIZIZ;
    public static String LIZJ = "";
    public static final ConcurrentHashMap<String, Diamond> LIZLLL = new ConcurrentHashMap<>();

    public static boolean LIZIZ() {
        return LIZIZ == UserService.getInstance().user().getCurrentUserId() && LIZJ.length() > 0 && System.currentTimeMillis() - LIZ < 3600000;
    }

    public static Diamond LIZ(String str) {
        if (str.length() != 0 && LIZIZ()) {
            return LIZLLL.get(str);
        }
        return null;
    }
}
