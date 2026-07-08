package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0HmW, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class EnumC451100HmW {
    public static final EnumC451100HmW FAVORITE;
    public static final /* synthetic */ EnumC451100HmW[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC451100HmW POPULAR;
    public static final EnumC451100HmW RECENT;

    public static InterfaceC2044707zh<EnumC451100HmW> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC451100HmW enumC451100HmW = new EnumC451100HmW("RECENT", 0);
        RECENT = enumC451100HmW;
        EnumC451100HmW enumC451100HmW2 = new EnumC451100HmW("FAVORITE", 1);
        FAVORITE = enumC451100HmW2;
        EnumC451100HmW enumC451100HmW3 = new EnumC451100HmW("POPULAR", 2);
        POPULAR = enumC451100HmW3;
        EnumC451100HmW[] enumC451100HmWArr = {enumC451100HmW, enumC451100HmW2, enumC451100HmW3};
        LL = enumC451100HmWArr;
        LLILLJJLI = new C2254308sP(enumC451100HmWArr);
    }

    public static EnumC451100HmW[] values() {
        return (EnumC451100HmW[]) LL.clone();
    }

    public static EnumC451100HmW valueOf(String str) {
        return (EnumC451100HmW) C08FF.LIZ(EnumC451100HmW.class, str);
    }

    public EnumC451100HmW(String str, int i) {
    }
}
