package X;

import android.os.Build;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.lynx.animax.ability.BaseAbility;
import com.lynx.animax.util.AnimaXLog;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

/* JADX INFO: renamed from: X.0jZ9, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1285850jZ9 {
    public static final String LIZ;
    public static int LIZIZ;
    public static final boolean LIZJ;
    public static boolean LIZLLL;
    public static boolean LJ;
    public static boolean LJFF;
    public static boolean LJI;
    public static boolean LJII;
    public static boolean LJIIIIZZ;

    static {
        String lowerCase = Build.MODEL.toLowerCase();
        LIZ = lowerCase;
        LIZIZ = -1;
        LIZJ = Arrays.asList("m6 note", "m721c").contains(lowerCase);
        LIZLLL = false;
        LJ = false;
        LJFF = false;
        LJI = false;
        LJII = false;
        LJIIIIZZ = false;
    }

    public static boolean LIZJ(String str) {
        if (str != null && !str.isEmpty()) {
            if ("1".equals(str) || "true".equalsIgnoreCase(str)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public static String LIZ(BaseAbility baseAbility, String str) {
        C1285830jZ7 c1285830jZ7LIZIZ;
        InterfaceC1285870jZB interfaceC1285870jZB = (InterfaceC1285870jZB) baseAbility.LIZJ.LIZ(InterfaceC1285870jZB.class);
        if (interfaceC1285870jZB == null || (c1285830jZ7LIZIZ = interfaceC1285870jZB.LIZIZ(str)) == null || c1285830jZ7LIZIZ.LIZJ != EnumC1285840jZ8.STRING) {
            return "";
        }
        return c1285830jZ7LIZIZ.LIZ;
    }

    public static boolean LIZIZ(BaseAbility baseAbility, String str) {
        C1285830jZ7 c1285830jZ7LIZIZ;
        Collection collectionEmptyList;
        String str2;
        String str3;
        InterfaceC1285870jZB interfaceC1285870jZB = (InterfaceC1285870jZB) baseAbility.LIZJ.LIZ(InterfaceC1285870jZB.class);
        if (interfaceC1285870jZB == null) {
            return false;
        }
        try {
            c1285830jZ7LIZIZ = interfaceC1285870jZB.LIZIZ(str);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("isInSettingList fail, message");
            sbLIZ.append(th.getMessage());
            AnimaXLog.LIZ("DeviceUtil", C2188811AlT.LIZIZ(sbLIZ));
        }
        if (c1285830jZ7LIZIZ == null) {
            return false;
        }
        EnumC1285840jZ8 enumC1285840jZ8 = c1285830jZ7LIZIZ.LIZJ;
        EnumC1285840jZ8 enumC1285840jZ82 = EnumC1285840jZ8.STRING;
        if (enumC1285840jZ8 == enumC1285840jZ82) {
            if (enumC1285840jZ8 != enumC1285840jZ82) {
                str3 = "";
            } else {
                str3 = c1285830jZ7LIZIZ.LIZ;
            }
            return LIZJ(str3);
        }
        EnumC1285840jZ8 enumC1285840jZ83 = EnumC1285840jZ8.COLLECTION;
        if (enumC1285840jZ8 == enumC1285840jZ83) {
            if (enumC1285840jZ8 != enumC1285840jZ83) {
                collectionEmptyList = Collections.emptyList();
            } else {
                collectionEmptyList = c1285830jZ7LIZIZ.LIZIZ;
            }
            if (collectionEmptyList.isEmpty() || (str2 = LIZ) == null || str2.isEmpty() || !collectionEmptyList.contains(str2)) {
                return false;
            }
            return true;
        }
        return false;
    }
}
