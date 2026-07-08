package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.081i, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class EnumC20500081i {
    public static final EnumC20500081i FALSE;
    public static final /* synthetic */ EnumC20500081i[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC20500081i TRUE;
    public final String LL;

    public static InterfaceC2044707zh<EnumC20500081i> getEntries() {
        return LLILLL;
    }

    static {
        EnumC20500081i enumC20500081i = new EnumC20500081i("FALSE", 0, "false");
        FALSE = enumC20500081i;
        EnumC20500081i enumC20500081i2 = new EnumC20500081i("TRUE", 1, "true");
        TRUE = enumC20500081i2;
        EnumC20500081i[] enumC20500081iArr = {enumC20500081i, enumC20500081i2};
        LLILLJJLI = enumC20500081iArr;
        LLILLL = new C2254308sP(enumC20500081iArr);
    }

    public static EnumC20500081i[] values() {
        return (EnumC20500081i[]) LLILLJJLI.clone();
    }

    public final String getValue() {
        return this.LL;
    }

    public static EnumC20500081i valueOf(String str) {
        return (EnumC20500081i) C08FF.LIZ(EnumC20500081i.class, str);
    }

    public EnumC20500081i(String str, int i, String str2) {
        this.LL = str2;
    }
}
