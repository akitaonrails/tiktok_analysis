package X;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.1Bd6, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2209101Bd6 {
    public static final /* synthetic */ int LIZ = 0;

    public static Integer LIZ(Integer num, EnumC2209071Bd3 enumC2209071Bd3, Function1 function1) {
        EnumC2209071Bd3.Companion.getClass();
        EnumC2209071Bd3 enumC2209071Bd3LIZ = C2209111Bd7.LIZ(num);
        if (enumC2209071Bd3LIZ.isManual() && enumC2209071Bd3 != enumC2209071Bd3LIZ) {
            function1.invoke(Boolean.valueOf(enumC2209071Bd3LIZ.isOn()));
            return null;
        }
        if (!enumC2209071Bd3.isManual() || enumC2209071Bd3LIZ == enumC2209071Bd3) {
            return null;
        }
        return Integer.valueOf(enumC2209071Bd3.getValue());
    }

    public static Integer LIZIZ(Integer num, EnumC2209071Bd3 enumC2209071Bd3, Function0 function0) {
        EnumC2209071Bd3.Companion.getClass();
        EnumC2209071Bd3 enumC2209071Bd3LIZ = C2209111Bd7.LIZ(num);
        if (enumC2209071Bd3 != enumC2209071Bd3LIZ) {
            if (enumC2209071Bd3.isManual()) {
                return Integer.valueOf(enumC2209071Bd3.getValue());
            }
            if (enumC2209071Bd3LIZ.isManual() || enumC2209071Bd3LIZ.isDefault()) {
                function0.invoke();
                return null;
            }
            return null;
        }
        return null;
    }
}
