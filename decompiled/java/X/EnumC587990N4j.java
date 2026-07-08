package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0N4j, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class EnumC587990N4j {
    public static final EnumC587990N4j CSP_HEADER;
    public static final EnumC587990N4j DISABLE_SETTING;
    public static final EnumC587990N4j ERROR_RESOURCE;
    public static final /* synthetic */ EnumC587990N4j[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public final int LL;

    public static InterfaceC2044707zh<EnumC587990N4j> getEntries() {
        return LLILLL;
    }

    static {
        EnumC587990N4j enumC587990N4j = new EnumC587990N4j("DISABLE_SETTING", 0, -990);
        DISABLE_SETTING = enumC587990N4j;
        EnumC587990N4j enumC587990N4j2 = new EnumC587990N4j("ERROR_RESOURCE", 1, -991);
        ERROR_RESOURCE = enumC587990N4j2;
        EnumC587990N4j enumC587990N4j3 = new EnumC587990N4j("CSP_HEADER", 2, -992);
        CSP_HEADER = enumC587990N4j3;
        EnumC587990N4j[] enumC587990N4jArr = {enumC587990N4j, enumC587990N4j2, enumC587990N4j3};
        LLILLJJLI = enumC587990N4jArr;
        LLILLL = new C2254308sP(enumC587990N4jArr);
    }

    public static EnumC587990N4j[] values() {
        return (EnumC587990N4j[]) LLILLJJLI.clone();
    }

    public final int getCode() {
        return this.LL;
    }

    public static EnumC587990N4j valueOf(String str) {
        return (EnumC587990N4j) C08FF.LIZ(EnumC587990N4j.class, str);
    }

    public EnumC587990N4j(String str, int i, int i2) {
        this.LL = i2;
    }
}
