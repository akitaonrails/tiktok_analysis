package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.081b, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class EnumC20493081b {
    public static final EnumC20493081b FALSE;
    public static final /* synthetic */ EnumC20493081b[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC20493081b TRUE;
    public final String LL;

    public static InterfaceC2044707zh<EnumC20493081b> getEntries() {
        return LLILLL;
    }

    static {
        EnumC20493081b enumC20493081b = new EnumC20493081b("FALSE", 0, "false");
        FALSE = enumC20493081b;
        EnumC20493081b enumC20493081b2 = new EnumC20493081b("TRUE", 1, "true");
        TRUE = enumC20493081b2;
        EnumC20493081b[] enumC20493081bArr = {enumC20493081b, enumC20493081b2};
        LLILLJJLI = enumC20493081bArr;
        LLILLL = new C2254308sP(enumC20493081bArr);
    }

    public static EnumC20493081b[] values() {
        return (EnumC20493081b[]) LLILLJJLI.clone();
    }

    public final String getValue() {
        return this.LL;
    }

    public static EnumC20493081b valueOf(String str) {
        return (EnumC20493081b) C08FF.LIZ(EnumC20493081b.class, str);
    }

    public EnumC20493081b(String str, int i, String str2) {
        this.LL = str2;
    }
}
