package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.082s, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class EnumC20536082s {
    public static final /* synthetic */ EnumC20536082s[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC20536082s ONLY_RECORD;
    public static final EnumC20536082s RECORD_REQUEST_SELF;
    public final int LL;

    public static InterfaceC2044707zh<EnumC20536082s> getEntries() {
        return LLILLL;
    }

    static {
        EnumC20536082s enumC20536082s = new EnumC20536082s("ONLY_RECORD", 0, 1);
        ONLY_RECORD = enumC20536082s;
        EnumC20536082s enumC20536082s2 = new EnumC20536082s("RECORD_REQUEST_SELF", 1, 2);
        RECORD_REQUEST_SELF = enumC20536082s2;
        EnumC20536082s[] enumC20536082sArr = {enumC20536082s, enumC20536082s2};
        LLILLJJLI = enumC20536082sArr;
        LLILLL = new C2254308sP(enumC20536082sArr);
    }

    public static EnumC20536082s[] values() {
        return (EnumC20536082s[]) LLILLJJLI.clone();
    }

    public final int getType() {
        return this.LL;
    }

    public static EnumC20536082s valueOf(String str) {
        return (EnumC20536082s) C08FF.LIZ(EnumC20536082s.class, str);
    }

    public EnumC20536082s(String str, int i, int i2) {
        this.LL = i2;
    }
}
