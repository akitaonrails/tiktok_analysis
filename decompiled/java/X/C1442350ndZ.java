package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.property.AVSettingsWrapper;
import kotlin.Pair;

/* JADX INFO: renamed from: X.0ndZ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1442350ndZ {
    public static final C1442350ndZ LIZ = new C1442350ndZ();
    public static boolean LIZIZ;
    public static boolean LIZJ;

    public final void LIZ() {
        synchronized (this) {
            try {
                if (LIZJ && LIZIZ) {
                    int[] recordVideoSize = AVSettingsWrapper.getRecordVideoSize();
                    LIZIZ((recordVideoSize == null || recordVideoSize.length < 2 || recordVideoSize[0] != 720) ? 0 : 1, "resolution", C2097608Jq.LJIIIIZZ(new Pair("resolution_default", C1442380ndc.LIZ()), new Pair("resolution_category", C07MM.LIZ()), new Pair("resolution_real", AVSettingsWrapper.getRecordVideoResolution())).toString());
                    int[] importVideoSize = AVSettingsWrapper.getImportVideoSize();
                    LIZIZ((importVideoSize == null || importVideoSize.length < 2 || importVideoSize[0] != 720) ? 0 : 1, "resolution", C2097608Jq.LJIIIIZZ(new Pair("resolution_default", C1442380ndc.LIZ()), new Pair("resolution_category_upload", C07ML.LIZ()), new Pair("resolution_real_upload", AVSettingsWrapper.getImportVideoResolution())).toString());
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    public static void LIZIZ(int i, String str, String str2) {
        C1637890six.LIZIZ("aweme_android_white_list", C2347509Ht.LIZ(C2097608Jq.LJIIIIZZ(new Pair("white_list_type", str), new Pair("white_list_value", String.valueOf(i)), new Pair("extra", str2))));
    }
}
