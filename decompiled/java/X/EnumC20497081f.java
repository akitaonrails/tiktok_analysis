package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.081f, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class EnumC20497081f {
    public static final EnumC20497081f FALSE;
    public static final /* synthetic */ EnumC20497081f[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC20497081f TRUE;
    public final String LL;

    public static InterfaceC2044707zh<EnumC20497081f> getEntries() {
        return LLILLL;
    }

    static {
        EnumC20497081f enumC20497081f = new EnumC20497081f("FALSE", 0, "false");
        FALSE = enumC20497081f;
        EnumC20497081f enumC20497081f2 = new EnumC20497081f("TRUE", 1, "true");
        TRUE = enumC20497081f2;
        EnumC20497081f[] enumC20497081fArr = {enumC20497081f, enumC20497081f2};
        LLILLJJLI = enumC20497081fArr;
        LLILLL = new C2254308sP(enumC20497081fArr);
    }

    public static EnumC20497081f[] values() {
        return (EnumC20497081f[]) LLILLJJLI.clone();
    }

    public final String getValue() {
        return this.LL;
    }

    public static EnumC20497081f valueOf(String str) {
        return (EnumC20497081f) C08FF.LIZ(EnumC20497081f.class, str);
    }

    public EnumC20497081f(String str, int i, String str2) {
        this.LL = str2;
    }
}
