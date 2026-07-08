package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0byi, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class EnumC994180byi {
    public static final EnumC994180byi ANCHOR;
    public static final /* synthetic */ EnumC994180byi[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC994180byi MULTI_GUEST;
    public static final EnumC994180byi UNKNOWN;
    public static final EnumC994180byi VIEWER;
    public final int LL;

    public static InterfaceC2044707zh<EnumC994180byi> getEntries() {
        return LLILLL;
    }

    static {
        EnumC994180byi enumC994180byi = new EnumC994180byi("UNKNOWN", 0, 0);
        UNKNOWN = enumC994180byi;
        EnumC994180byi enumC994180byi2 = new EnumC994180byi("ANCHOR", 1, 1);
        ANCHOR = enumC994180byi2;
        EnumC994180byi enumC994180byi3 = new EnumC994180byi("VIEWER", 2, 2);
        VIEWER = enumC994180byi3;
        EnumC994180byi enumC994180byi4 = new EnumC994180byi("MULTI_GUEST", 3, 3);
        MULTI_GUEST = enumC994180byi4;
        EnumC994180byi[] enumC994180byiArr = {enumC994180byi, enumC994180byi2, enumC994180byi3, enumC994180byi4};
        LLILLJJLI = enumC994180byiArr;
        LLILLL = new C2254308sP(enumC994180byiArr);
    }

    public static EnumC994180byi[] values() {
        return (EnumC994180byi[]) LLILLJJLI.clone();
    }

    public final int getValue() {
        return this.LL;
    }

    public static EnumC994180byi valueOf(String str) {
        return (EnumC994180byi) C08FF.LIZ(EnumC994180byi.class, str);
    }

    public EnumC994180byi(String str, int i, int i2) {
        this.LL = i2;
    }
}
