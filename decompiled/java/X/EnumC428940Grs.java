package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0Grs, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class EnumC428940Grs {
    public static final EnumC428940Grs ALPHA;
    public static final EnumC428940Grs LIGHT_MASK;
    public static final /* synthetic */ EnumC428940Grs[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC428940Grs SCALE;
    public static final EnumC428940Grs STRONG_MASK;

    public static InterfaceC2044707zh<EnumC428940Grs> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC428940Grs enumC428940Grs = new EnumC428940Grs("ALPHA", 0);
        ALPHA = enumC428940Grs;
        EnumC428940Grs enumC428940Grs2 = new EnumC428940Grs("LIGHT_MASK", 1);
        LIGHT_MASK = enumC428940Grs2;
        EnumC428940Grs enumC428940Grs3 = new EnumC428940Grs("STRONG_MASK", 2);
        STRONG_MASK = enumC428940Grs3;
        EnumC428940Grs enumC428940Grs4 = new EnumC428940Grs("SCALE", 3);
        SCALE = enumC428940Grs4;
        EnumC428940Grs[] enumC428940GrsArr = {enumC428940Grs, enumC428940Grs2, enumC428940Grs3, enumC428940Grs4};
        LL = enumC428940GrsArr;
        LLILLJJLI = new C2254308sP(enumC428940GrsArr);
    }

    public static EnumC428940Grs[] values() {
        return (EnumC428940Grs[]) LL.clone();
    }

    public static EnumC428940Grs valueOf(String str) {
        return (EnumC428940Grs) C08FF.LIZ(EnumC428940Grs.class, str);
    }

    public EnumC428940Grs(String str, int i) {
    }
}
