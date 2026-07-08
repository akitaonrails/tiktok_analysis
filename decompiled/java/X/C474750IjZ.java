package X;

import com.bytedance.android.livesdkapi.host.IHostConfig;
import java.util.HashMap;

/* JADX INFO: renamed from: X.0IjZ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C474750IjZ {
    public static final C01GW LIZ = C452501pT.LIZIZ(new C474760Ija());
    public static final C01GW LIZIZ = C452501pT.LIZIZ(new C474740IjY());
    public static final C01GW LIZJ = C452501pT.LIZIZ(new C474730IjX());
    public static int LIZLLL;

    public static void LIZ() {
        ((HashMap) LIZ.getValue()).clear();
        ((IHostConfig) C1161920gLG.LIZJ(IHostConfig.class)).L80("room_id", null);
    }

    public static void LIZIZ(String str, String str2) {
        if (str2 != null) {
            ((HashMap) LIZ.getValue()).put(str, str2);
            ((IHostConfig) C1161920gLG.LIZJ(IHostConfig.class)).L80(str, str2);
        }
    }
}
