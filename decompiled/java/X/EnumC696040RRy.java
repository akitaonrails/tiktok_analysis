package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0RRy, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class EnumC696040RRy {
    public static final EnumC696040RRy ASSEM;
    public static final EnumC696040RRy CUSTOM;
    public static final /* synthetic */ EnumC696040RRy[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC696040RRy TRIGGER;

    public static InterfaceC2044707zh<EnumC696040RRy> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC696040RRy enumC696040RRy = new EnumC696040RRy("TRIGGER", 0);
        TRIGGER = enumC696040RRy;
        EnumC696040RRy enumC696040RRy2 = new EnumC696040RRy("ASSEM", 1);
        ASSEM = enumC696040RRy2;
        EnumC696040RRy enumC696040RRy3 = new EnumC696040RRy("CUSTOM", 2);
        CUSTOM = enumC696040RRy3;
        EnumC696040RRy[] enumC696040RRyArr = {enumC696040RRy, enumC696040RRy2, enumC696040RRy3};
        LL = enumC696040RRyArr;
        LLILLJJLI = new C2254308sP(enumC696040RRyArr);
    }

    public static EnumC696040RRy[] values() {
        return (EnumC696040RRy[]) LL.clone();
    }

    public static EnumC696040RRy valueOf(String str) {
        return (EnumC696040RRy) C08FF.LIZ(EnumC696040RRy.class, str);
    }

    public EnumC696040RRy(String str, int i) {
    }
}
