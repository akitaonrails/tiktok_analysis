package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0soh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class EnumC1641450soh {
    public static final EnumC1641450soh CLICK;
    public static final EnumC1641450soh IGNORE;
    public static final /* synthetic */ EnumC1641450soh[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC1641450soh SLIDE;

    public static InterfaceC2044707zh<EnumC1641450soh> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC1641450soh enumC1641450soh = new EnumC1641450soh("CLICK", 0);
        CLICK = enumC1641450soh;
        EnumC1641450soh enumC1641450soh2 = new EnumC1641450soh("SLIDE", 1);
        SLIDE = enumC1641450soh2;
        EnumC1641450soh enumC1641450soh3 = new EnumC1641450soh("IGNORE", 2);
        IGNORE = enumC1641450soh3;
        EnumC1641450soh[] enumC1641450sohArr = {enumC1641450soh, enumC1641450soh2, enumC1641450soh3};
        LL = enumC1641450sohArr;
        LLILLJJLI = new C2254308sP(enumC1641450sohArr);
    }

    public static EnumC1641450soh[] values() {
        return (EnumC1641450soh[]) LL.clone();
    }

    public static EnumC1641450soh valueOf(String str) {
        return (EnumC1641450soh) C08FF.LIZ(EnumC1641450soh.class, str);
    }

    public EnumC1641450soh(String str, int i) {
    }
}
