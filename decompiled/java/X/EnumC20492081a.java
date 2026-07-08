package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.081a, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class EnumC20492081a {
    public static final EnumC20492081a FALSE;
    public static final /* synthetic */ EnumC20492081a[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC20492081a TRUE;
    public final String LL;

    public static InterfaceC2044707zh<EnumC20492081a> getEntries() {
        return LLILLL;
    }

    static {
        EnumC20492081a enumC20492081a = new EnumC20492081a("FALSE", 0, "false");
        FALSE = enumC20492081a;
        EnumC20492081a enumC20492081a2 = new EnumC20492081a("TRUE", 1, "true");
        TRUE = enumC20492081a2;
        EnumC20492081a[] enumC20492081aArr = {enumC20492081a, enumC20492081a2};
        LLILLJJLI = enumC20492081aArr;
        LLILLL = new C2254308sP(enumC20492081aArr);
    }

    public static EnumC20492081a[] values() {
        return (EnumC20492081a[]) LLILLJJLI.clone();
    }

    public final String getValue() {
        return this.LL;
    }

    public static EnumC20492081a valueOf(String str) {
        return (EnumC20492081a) C08FF.LIZ(EnumC20492081a.class, str);
    }

    public EnumC20492081a(String str, int i, String str2) {
        this.LL = str2;
    }
}
