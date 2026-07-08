package X;

import kotlin.Pair;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0yzt, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public abstract class AbstractC1879030yzt {
    public static void LIZ(Function0 function0) {
        LIZIZ(new Pair("msg", function0));
    }

    public static void LIZIZ(Pair... pairArr) {
        LIZJ(EnumC1879020yzs.LOGIC, EnumC1910950zpN.FAILED, pairArr);
    }

    public static void LIZJ(EnumC1879020yzs enumC1879020yzs, EnumC1910950zpN enumC1910950zpN, Pair[] pairArr) {
        new C1879010yzr(enumC1879020yzs, enumC1910950zpN, pairArr);
        if (enumC1910950zpN.getLogLevel() != 6 && enumC1910950zpN.getLogLevel() != 5 && enumC1910950zpN.getLogLevel() != 4 && enumC1910950zpN.getLogLevel() != 3) {
            enumC1910950zpN.getLogLevel();
        }
    }
}
