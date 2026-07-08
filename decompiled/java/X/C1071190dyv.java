package X;

import com.bytedance.lobby.auth.AuthResult;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0dyv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1071190dyv {
    public static final List<EnumC1071140dyq> LIZ;
    public static final List<EnumC1071140dyq> LIZIZ;
    public static final List<EnumC1071140dyq> LIZJ;

    static {
        EnumC1071140dyq enumC1071140dyq = EnumC1071140dyq.BLACK_BACKGROUND_ACTUAL_DIALOG_USER;
        LIZ = C1697810uHb.LJIIJJI(EnumC1071140dyq.BLACK_BACKGROUND_ACTUAL, enumC1071140dyq);
        EnumC1071140dyq enumC1071140dyq2 = EnumC1071140dyq.DIALOG_ACTUAL_AND_USER;
        LIZIZ = C1697810uHb.LJIIJJI(EnumC1071140dyq.DIALOG_ACTUAL, enumC1071140dyq2);
        LIZJ = C1697810uHb.LJIIJJI(EnumC1071140dyq.DIALOG_USER, enumC1071140dyq2, enumC1071140dyq);
    }

    public static final String LIZ(EnumC1070340dxY enumC1070340dxY) {
        int i = C1070870dyP.LIZ[enumC1070340dxY.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i == 3) {
                    return "finish_mlbb_permission_process";
                }
                "wrong relationAuthPlatform".toString();
                throw new IllegalStateException("wrong relationAuthPlatform");
            }
            return "finish_facebook_permission_process";
        }
        return "finish_contact_permission_process";
    }

    public static final C19EG LIZIZ(C1071620dzc c1071620dzc) {
        C19EG c19eg = c1071620dzc.LIZIZ;
        if (c19eg != null) {
            return c19eg;
        }
        "context is null".toString();
        throw new IllegalStateException("context is null");
    }

    public static final C19EG LIZJ(C1071630dzd c1071630dzd) {
        C19EG c19eg = c1071630dzd.LIZIZ;
        if (c19eg != null) {
            return c19eg;
        }
        "context is null".toString();
        throw new IllegalStateException("context is null");
    }

    public static final boolean LIZLLL(AuthResult authResult, String str) {
        String[] stringArray = authResult.mBundle.getStringArray("fb_granted_permissions");
        if (stringArray == null || stringArray.length == 0) {
            return false;
        }
        C089E c089e = new C089E(stringArray);
        while (c089e.hasNext()) {
            if (Intrinsics.LJFF(c089e.next(), str)) {
                return true;
            }
        }
        return false;
    }
}
