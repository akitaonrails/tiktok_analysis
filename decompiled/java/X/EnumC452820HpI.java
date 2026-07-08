package X;

import java.util.Locale;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0HpI, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class EnumC452820HpI {
    public static final EnumC452820HpI INTERRUPTED;
    public static final EnumC452820HpI LEFT;
    public static final /* synthetic */ EnumC452820HpI[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC452820HpI NONE;
    public static final EnumC452820HpI RIGHT;

    public static InterfaceC2044707zh<EnumC452820HpI> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC452820HpI enumC452820HpI = new EnumC452820HpI("LEFT", 0);
        LEFT = enumC452820HpI;
        EnumC452820HpI enumC452820HpI2 = new EnumC452820HpI("RIGHT", 1);
        RIGHT = enumC452820HpI2;
        EnumC452820HpI enumC452820HpI3 = new EnumC452820HpI("INTERRUPTED", 2);
        INTERRUPTED = enumC452820HpI3;
        EnumC452820HpI enumC452820HpI4 = new EnumC452820HpI("NONE", 3);
        NONE = enumC452820HpI4;
        EnumC452820HpI[] enumC452820HpIArr = {enumC452820HpI, enumC452820HpI2, enumC452820HpI3, enumC452820HpI4};
        LL = enumC452820HpIArr;
        LLILLJJLI = new C2254308sP(enumC452820HpIArr);
    }

    public static EnumC452820HpI[] values() {
        return (EnumC452820HpI[]) LL.clone();
    }

    public final String lowerName() {
        return name().toLowerCase(Locale.ROOT);
    }

    public static EnumC452820HpI valueOf(String str) {
        return (EnumC452820HpI) C08FF.LIZ(EnumC452820HpI.class, str);
    }

    public EnumC452820HpI(String str, int i) {
    }
}
