package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0by6, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class EnumC993800by6 {
    public static final EnumC993800by6 IN_RANK;
    public static final /* synthetic */ EnumC993800by6[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC993800by6 NO_IN_RANK;
    public static final EnumC993800by6 NO_PERMISSION;
    public final int LL;

    public static InterfaceC2044707zh<EnumC993800by6> getEntries() {
        return LLILLL;
    }

    static {
        EnumC993800by6 enumC993800by6 = new EnumC993800by6("IN_RANK", 0, 1);
        IN_RANK = enumC993800by6;
        EnumC993800by6 enumC993800by62 = new EnumC993800by6("NO_IN_RANK", 1, 0);
        NO_IN_RANK = enumC993800by62;
        EnumC993800by6 enumC993800by63 = new EnumC993800by6("NO_PERMISSION", 2, 2);
        NO_PERMISSION = enumC993800by63;
        EnumC993800by6[] enumC993800by6Arr = {enumC993800by6, enumC993800by62, enumC993800by63};
        LLILLJJLI = enumC993800by6Arr;
        LLILLL = new C2254308sP(enumC993800by6Arr);
    }

    public static EnumC993800by6[] values() {
        return (EnumC993800by6[]) LLILLJJLI.clone();
    }

    public final int getValue() {
        return this.LL;
    }

    public static EnumC993800by6 valueOf(String str) {
        return (EnumC993800by6) C08FF.LIZ(EnumC993800by6.class, str);
    }

    public EnumC993800by6(String str, int i, int i2) {
        this.LL = i2;
    }
}
