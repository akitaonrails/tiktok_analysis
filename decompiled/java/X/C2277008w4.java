package X;

import com.ss.android.ugc.aweme.creative.model.UploadableMobileEffect;
import com.ss.android.ugc.aweme.publish.model.UploadImageConfig;
import kotlin.text.a0;
import kotlin.text.u;

/* JADX INFO: renamed from: X.08w4, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2277008w4 {
    public static String LIZIZ(String str) {
        if (a0.LJJIIZI(str, "file://", false)) {
            return u.LJJIFFI(str, "file://", "", false);
        }
        return str;
    }

    public static Object LIZ(C2277008w4 c2277008w4, UploadableMobileEffect uploadableMobileEffect, UploadImageConfig uploadImageConfig, UploadImageConfig uploadImageConfig2, String str, Integer num, String str2, String str3, InterfaceC1364105Vn interfaceC1364105Vn, int i) {
        String str4 = str2;
        Integer num2 = num;
        String str5 = str3;
        String str6 = str;
        if ((i & 8) != 0) {
            str6 = "mobile_effect_template";
        }
        if ((i & 16) != 0) {
            num2 = 310;
        }
        if ((i & 32) != 0) {
            str4 = "";
        }
        if ((i & 64) != 0) {
            str5 = null;
        }
        c2277008w4.getClass();
        return C2296808zG.LJ(new C1663000tNS(c2277008w4, uploadableMobileEffect, str6, num2, str5, null, str4, uploadImageConfig2, uploadImageConfig, null), interfaceC1364105Vn);
    }
}
