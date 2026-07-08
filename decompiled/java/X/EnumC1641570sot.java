package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0sot, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class EnumC1641570sot {
    public static final EnumC1641570sot LL;
    public static final EnumC1641570sot LLILLJJLI;
    public static final EnumC1641570sot LLILLL;
    public static final EnumC1641570sot LLILZ;
    public static final /* synthetic */ EnumC1641570sot[] LLILZIL;

    static {
        EnumC1641570sot enumC1641570sot = new EnumC1641570sot("SHOWING", 0);
        LL = enumC1641570sot;
        EnumC1641570sot enumC1641570sot2 = new EnumC1641570sot("SHOWN", 1);
        LLILLJJLI = enumC1641570sot2;
        EnumC1641570sot enumC1641570sot3 = new EnumC1641570sot("HIDING", 2);
        LLILLL = enumC1641570sot3;
        EnumC1641570sot enumC1641570sot4 = new EnumC1641570sot("HIDE", 3);
        LLILZ = enumC1641570sot4;
        EnumC1641570sot[] enumC1641570sotArr = {enumC1641570sot, enumC1641570sot2, enumC1641570sot3, enumC1641570sot4};
        LLILZIL = enumC1641570sotArr;
        new C2254308sP(enumC1641570sotArr);
    }

    public static EnumC1641570sot[] values() {
        return (EnumC1641570sot[]) LLILZIL.clone();
    }

    public static EnumC1641570sot valueOf(String str) {
        return (EnumC1641570sot) C08FF.LIZ(EnumC1641570sot.class, str);
    }

    public EnumC1641570sot(String str, int i) {
    }
}
