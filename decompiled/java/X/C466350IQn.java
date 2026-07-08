package X;

import android.os.Build;
import android.text.TextUtils;
import com.bytedance.speech.speechengine.SpeechEngineDefines;
import java.util.ArrayList;

/* JADX INFO: renamed from: X.0IQn, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C466350IQn {
    public static String LIZ(int i) {
        ArrayList arrayList = new ArrayList();
        if ((i & 1) != 0) {
            arrayList.add("CONFIG_MCC");
        }
        if ((i & 2) != 0) {
            arrayList.add("CONFIG_MNC");
        }
        if ((i & 4) != 0) {
            arrayList.add("CONFIG_LOCALE");
        }
        if ((i & 8) != 0) {
            arrayList.add("CONFIG_TOUCHSCREEN");
        }
        if ((i & 16) != 0) {
            arrayList.add("CONFIG_KEYBOARD");
        }
        if ((i & 32) != 0) {
            arrayList.add("CONFIG_KEYBOARD_HIDDEN");
        }
        if ((i & 64) != 0) {
            arrayList.add("CONFIG_NAVIGATION");
        }
        if ((i & 128) != 0) {
            arrayList.add("CONFIG_ORIENTATION");
        }
        if ((i & 256) != 0) {
            arrayList.add("CONFIG_SCREEN_LAYOUT");
        }
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 26 && (i & 16384) != 0) {
            arrayList.add("CONFIG_COLOR_MODE");
        }
        if ((i & 512) != 0) {
            arrayList.add("CONFIG_UI_MODE");
        }
        if ((i & 1024) != 0) {
            arrayList.add("CONFIG_SCREEN_SIZE");
        }
        if ((i & SpeechEngineDefines.ASR_WORK_MODE_OFFLINE) != 0) {
            arrayList.add("CONFIG_SMALLEST_SCREEN_SIZE");
        }
        if ((i & SpeechEngineDefines.TTS_WORK_MODE_BOTH) != 0) {
            arrayList.add("CONFIG_DENSITY");
        }
        if ((i & 8192) != 0) {
            arrayList.add("CONFIG_LAYOUT_DIRECTION");
        }
        if ((1073741824 & i) != 0) {
            arrayList.add("CONFIG_FONT_SCALE");
        }
        if ((Integer.MIN_VALUE & i) != 0) {
            arrayList.add("CONFIG_ASSETS_PATHS");
        }
        if ((536870912 & i) != 0) {
            arrayList.add("CONFIG_WINDOW_CONFIGURATION");
        }
        if (i2 >= 31) {
            if ((268435456 & i) != 0) {
                arrayList.add("CONFIG_AUTO_BOLD_TEXT");
            }
            if (i2 >= 34 && (i & 32768) != 0) {
                arrayList.add("CONFIG_GRAMMATICAL_GENDER");
            }
        }
        if (arrayList.size() > 0) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("{");
            sbLIZ.append(TextUtils.join(", ", arrayList));
            sbLIZ.append("}");
            return C2188811AlT.LIZIZ(sbLIZ);
        }
        return "";
    }
}
