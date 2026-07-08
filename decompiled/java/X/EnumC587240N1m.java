package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0N1m, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class EnumC587240N1m {
    public static final EnumC587240N1m DOWN;
    public static final /* synthetic */ EnumC587240N1m[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC587240N1m UP;

    public static InterfaceC2044707zh<EnumC587240N1m> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC587240N1m enumC587240N1m = new EnumC587240N1m("UP", 0);
        UP = enumC587240N1m;
        EnumC587240N1m enumC587240N1m2 = new EnumC587240N1m("DOWN", 1);
        DOWN = enumC587240N1m2;
        EnumC587240N1m[] enumC587240N1mArr = {enumC587240N1m, enumC587240N1m2};
        LL = enumC587240N1mArr;
        LLILLJJLI = new C2254308sP(enumC587240N1mArr);
    }

    public static EnumC587240N1m[] values() {
        return (EnumC587240N1m[]) LL.clone();
    }

    public static EnumC587240N1m valueOf(String str) {
        return (EnumC587240N1m) C08FF.LIZ(EnumC587240N1m.class, str);
    }

    public EnumC587240N1m(String str, int i) {
    }
}
