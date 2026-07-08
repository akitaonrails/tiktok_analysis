package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0i2a, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class EnumC1227220i2a {
    public static final EnumC1227220i2a CREATE_GROUP;
    public static final EnumC1227220i2a DISMISS;
    public static final /* synthetic */ EnumC1227220i2a[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC1227220i2a SEARCH;
    public final int LL;

    public static InterfaceC2044707zh<EnumC1227220i2a> getEntries() {
        return LLILLL;
    }

    static {
        EnumC1227220i2a enumC1227220i2a = new EnumC1227220i2a("CREATE_GROUP", 0, 0);
        CREATE_GROUP = enumC1227220i2a;
        EnumC1227220i2a enumC1227220i2a2 = new EnumC1227220i2a("DISMISS", 1, 1);
        DISMISS = enumC1227220i2a2;
        EnumC1227220i2a enumC1227220i2a3 = new EnumC1227220i2a("SEARCH", 2, 2);
        SEARCH = enumC1227220i2a3;
        EnumC1227220i2a[] enumC1227220i2aArr = {enumC1227220i2a, enumC1227220i2a2, enumC1227220i2a3};
        LLILLJJLI = enumC1227220i2aArr;
        LLILLL = new C2254308sP(enumC1227220i2aArr);
    }

    public static EnumC1227220i2a[] values() {
        return (EnumC1227220i2a[]) LLILLJJLI.clone();
    }

    public final int getValue() {
        return this.LL;
    }

    public static EnumC1227220i2a valueOf(String str) {
        return (EnumC1227220i2a) C08FF.LIZ(EnumC1227220i2a.class, str);
    }

    public EnumC1227220i2a(String str, int i, int i2) {
        this.LL = i2;
    }
}
