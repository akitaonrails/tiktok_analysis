package X;

import android.app.Application;
import android.text.TextUtils;
import java.io.File;

/* JADX INFO: renamed from: X.0oQY, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1472720oQY {
    public static String LIZ;

    public static String LIZ() {
        if (!TextUtils.isEmpty(LIZ)) {
            return LIZ;
        }
        Application application = C1475000oUE.LIZ;
        if (application == null) {
            return null;
        }
        File fileW2 = C786410Ut5.w2(application);
        if (C1474810oTv.LLI()) {
            if (C1475000oUE.LIZIZ().isDebug()) {
                fileW2 = C2354809Ko.LIZLLL(application);
            }
            if (TextUtils.equals("playback_simulator_test", C1475000oUE.LIZIZ().getChannel())) {
                fileW2 = C2354809Ko.LIZLLL(application);
            }
        }
        if (fileW2 == null) {
            return null;
        }
        String absolutePath = fileW2.getAbsolutePath();
        LIZ = absolutePath;
        return absolutePath;
    }
}
