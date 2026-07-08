package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.008s, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC0308008s {
    public static final EnumC0308008s GENERAL_CHUNK;
    public static final EnumC0308008s HEADER_CHUNK;
    public static final /* synthetic */ EnumC0308008s[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public final String LL;

    public static InterfaceC2044707zh<EnumC0308008s> getEntries() {
        return LLILLL;
    }

    static {
        EnumC0308008s enumC0308008s = new EnumC0308008s("HEADER_CHUNK", 0, "header_chunk");
        HEADER_CHUNK = enumC0308008s;
        EnumC0308008s enumC0308008s2 = new EnumC0308008s("GENERAL_CHUNK", 1, "general_chunk");
        GENERAL_CHUNK = enumC0308008s2;
        EnumC0308008s[] enumC0308008sArr = {enumC0308008s, enumC0308008s2};
        LLILLJJLI = enumC0308008sArr;
        LLILLL = new C2254308sP(enumC0308008sArr);
    }

    public static EnumC0308008s[] values() {
        return (EnumC0308008s[]) LLILLJJLI.clone();
    }

    public final String getValue() {
        return this.LL;
    }

    public static EnumC0308008s valueOf(String str) {
        return (EnumC0308008s) C08FF.LIZ(EnumC0308008s.class, str);
    }

    public EnumC0308008s(String str, int i, String str2) {
        this.LL = str2;
    }
}
