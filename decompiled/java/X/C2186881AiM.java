package X;

import android.hardware.Camera;
import com.bytedance.mt.protector.impl.PatternProtector;
import java.util.Collection;
import java.util.List;

/* JADX INFO: renamed from: X.1AiM, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes34.dex */
public final class C2186881AiM {
    public static final /* synthetic */ int LIZ = 0;

    static {
        PatternProtector.compile(";");
    }

    public static String LIZ(Collection collection, String... strArr) {
        if (collection != null) {
            for (String str : strArr) {
                if (collection.contains(str)) {
                    return str;
                }
            }
            return null;
        }
        return null;
    }

    public static void LIZIZ(Camera.Parameters parameters, boolean z) {
        String strLIZ;
        List<String> supportedFlashModes = parameters.getSupportedFlashModes();
        if (z) {
            strLIZ = LIZ(supportedFlashModes, "torch", "on");
        } else {
            strLIZ = LIZ(supportedFlashModes, "off");
        }
        if (strLIZ != null && !strLIZ.equals(parameters.getFlashMode())) {
            parameters.setFlashMode(strLIZ);
        }
    }
}
