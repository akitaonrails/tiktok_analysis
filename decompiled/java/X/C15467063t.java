package X;

import com.bytedance.android.livesdk.livesetting.other.LiveToolbarIconStyleSetting;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.063t, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C15467063t {
    public static final /* synthetic */ int LIZ = 0;

    public static String LIZ(int i) {
        if (i == -15) {
            return "Error dir check fail";
        }
        if (i == -14) {
            return "Error cert verify";
        }
        if (i == 28) {
            return "Error cose invalid cert";
        }
        if (i == 83) {
            return "Error remote cert mismatch";
        }
        switch (i) {
            case -103:
                return "Error file does not exist";
            case -102:
                return "Error c2pa service init";
            case -101:
                return "Error invalid file path";
            default:
                switch (i) {
                    case -7:
                    case -6:
                        return "Error download cert";
                    case -5:
                    case -4:
                    case -3:
                        return "Local cert read error";
                    case -2:
                        return "Error cert not ready";
                    case -1:
                        return "Error SDK init";
                    default:
                        switch (i) {
                            case 31:
                                return "Error cose cert expiration";
                            case 32:
                                return "Error cose cert revoked";
                            case LiveToolbarIconStyleSetting.GRAY_WITHOUT_TEXT /* 33 */:
                                return "Error cose cert untrusted";
                            default:
                                return "Something went wrong while writing c2pa data";
                        }
                }
        }
    }

    public static void LIZIZ(String str, EnumC15469063v enumC15469063v, Function1 function1, int i) {
        Function1 function12 = function1;
        if ((i & 16) != 0) {
            function12 = null;
        }
        C23250099c.LIZLLL(C2296808zG.LIZ(C0PEM.LIZJ), null, null, new C15465063r(str, function12, false, null, enumC15469063v, null), 3);
    }
}
