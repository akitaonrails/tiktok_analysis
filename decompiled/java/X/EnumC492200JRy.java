package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0JRy, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class EnumC492200JRy {
    public static final EnumC492200JRy CLOSE;
    public static final /* synthetic */ EnumC492200JRy[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC492200JRy OPEN;

    public static InterfaceC2044707zh<EnumC492200JRy> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC492200JRy enumC492200JRy = new EnumC492200JRy("OPEN", 0);
        OPEN = enumC492200JRy;
        EnumC492200JRy enumC492200JRy2 = new EnumC492200JRy("CLOSE", 1);
        CLOSE = enumC492200JRy2;
        EnumC492200JRy[] enumC492200JRyArr = {enumC492200JRy, enumC492200JRy2};
        LL = enumC492200JRyArr;
        LLILLJJLI = new C2254308sP(enumC492200JRyArr);
    }

    public static EnumC492200JRy[] values() {
        return (EnumC492200JRy[]) LL.clone();
    }

    public static EnumC492200JRy valueOf(String str) {
        return (EnumC492200JRy) C08FF.LIZ(EnumC492200JRy.class, str);
    }

    public EnumC492200JRy(String str, int i) {
    }
}
