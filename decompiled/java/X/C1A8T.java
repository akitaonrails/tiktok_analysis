package X;

import android.content.Context;
import android.graphics.Rect;
import com.bytedance.speech.speechengine.SpeechEngineDefines;

/* JADX INFO: renamed from: X.1A8T, reason: invalid class name */
/* JADX INFO: loaded from: classes34.dex */
public final class C1A8T {
    public static void LIZ(C1A8U c1a8u, Context context, String str, String str2, String str3, String str4, C1A8W c1a8w, String str5, Rect rect, EnumC094400Xe enumC094400Xe, EnumC2012007uQ enumC2012007uQ, int i) {
        EnumC2012007uQ enumC2012007uQ2 = enumC2012007uQ;
        EnumC094400Xe enumC094400Xe2 = enumC094400Xe;
        Rect rect2 = rect;
        String str6 = str4;
        String str7 = str5;
        C13BV c13bv = null;
        if ((i & 16) != 0) {
            str6 = null;
        }
        if ((i & 128) != 0) {
            str7 = "";
        }
        if ((i & 256) != 0) {
            rect2 = null;
        }
        if ((i & 512) != 0) {
            c13bv = C13BV.INSTANCE;
        }
        if ((i & 1024) != 0) {
            enumC094400Xe2 = EnumC094400Xe.COMMON_DIALOG;
        }
        if ((i & SpeechEngineDefines.ASR_WORK_MODE_OFFLINE) != 0) {
            enumC2012007uQ2 = EnumC2012007uQ.BANNER;
        }
        c1a8u.LIZ(context, str, str2, str3, str6, c1a8w, str7, rect2, c13bv, enumC094400Xe2, enumC2012007uQ2);
    }
}
