package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0C8a, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class EnumC308660C8a {
    public static final EnumC308660C8a CASE_C;
    public static final EnumC308660C8a CASE_DEFAULT;
    public static final /* synthetic */ EnumC308660C8a[] LLILLL;
    public static final /* synthetic */ C2254308sP LLILZ;
    public final int LL;
    public final int LLILLJJLI;

    public static InterfaceC2044707zh<EnumC308660C8a> getEntries() {
        return LLILZ;
    }

    static {
        EnumC308660C8a enumC308660C8a = new EnumC308660C8a("CASE_DEFAULT", 0, 0, 2);
        CASE_DEFAULT = enumC308660C8a;
        EnumC308660C8a enumC308660C8a2 = new EnumC308660C8a("CASE_C", 1, 3, ((Number) C0B1Q.LIZ.getValue()).intValue());
        CASE_C = enumC308660C8a2;
        EnumC308660C8a[] enumC308660C8aArr = {enumC308660C8a, enumC308660C8a2};
        LLILLL = enumC308660C8aArr;
        LLILZ = new C2254308sP(enumC308660C8aArr);
    }

    public static EnumC308660C8a[] values() {
        return (EnumC308660C8a[]) LLILLL.clone();
    }

    public final int getLineCount() {
        return this.LLILLJJLI;
    }

    public final int getValue() {
        return this.LL;
    }

    public static EnumC308660C8a valueOf(String str) {
        return (EnumC308660C8a) C08FF.LIZ(EnumC308660C8a.class, str);
    }

    public EnumC308660C8a(String str, int i, int i2, int i3) {
        this.LL = i2;
        this.LLILLJJLI = i3;
    }
}
