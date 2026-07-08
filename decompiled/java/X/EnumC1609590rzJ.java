package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0rzJ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class EnumC1609590rzJ {
    public static final EnumC1609590rzJ CONST;
    public static final EnumC1609590rzJ DARK;
    public static final EnumC1609590rzJ LIGHT;
    public static final /* synthetic */ EnumC1609590rzJ[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;

    public static InterfaceC2044707zh<EnumC1609590rzJ> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC1609590rzJ enumC1609590rzJ = new EnumC1609590rzJ("CONST", 0);
        CONST = enumC1609590rzJ;
        EnumC1609590rzJ enumC1609590rzJ2 = new EnumC1609590rzJ("LIGHT", 1);
        LIGHT = enumC1609590rzJ2;
        EnumC1609590rzJ enumC1609590rzJ3 = new EnumC1609590rzJ("DARK", 2);
        DARK = enumC1609590rzJ3;
        EnumC1609590rzJ[] enumC1609590rzJArr = {enumC1609590rzJ, enumC1609590rzJ2, enumC1609590rzJ3};
        LL = enumC1609590rzJArr;
        LLILLJJLI = new C2254308sP(enumC1609590rzJArr);
    }

    public static EnumC1609590rzJ[] values() {
        return (EnumC1609590rzJ[]) LL.clone();
    }

    public static EnumC1609590rzJ valueOf(String str) {
        return (EnumC1609590rzJ) C08FF.LIZ(EnumC1609590rzJ.class, str);
    }

    public EnumC1609590rzJ(String str, int i) {
    }
}
