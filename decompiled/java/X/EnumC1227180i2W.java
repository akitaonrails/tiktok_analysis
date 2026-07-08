package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0i2W, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class EnumC1227180i2W {
    public static final /* synthetic */ EnumC1227180i2W[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC1227180i2W NORMAL;
    public static final EnumC1227180i2W RECOMMEND;
    public static final EnumC1227180i2W RELATED;
    public static final EnumC1227180i2W SEARCH;
    public final String LL;

    public static InterfaceC2044707zh<EnumC1227180i2W> getEntries() {
        return LLILLL;
    }

    static {
        EnumC1227180i2W enumC1227180i2W = new EnumC1227180i2W("SEARCH", 0, "search");
        SEARCH = enumC1227180i2W;
        EnumC1227180i2W enumC1227180i2W2 = new EnumC1227180i2W("RELATED", 1, "related");
        RELATED = enumC1227180i2W2;
        EnumC1227180i2W enumC1227180i2W3 = new EnumC1227180i2W("NORMAL", 2, "normal");
        NORMAL = enumC1227180i2W3;
        EnumC1227180i2W enumC1227180i2W4 = new EnumC1227180i2W("RECOMMEND", 3, "recommend");
        RECOMMEND = enumC1227180i2W4;
        EnumC1227180i2W[] enumC1227180i2WArr = {enumC1227180i2W, enumC1227180i2W2, enumC1227180i2W3, enumC1227180i2W4};
        LLILLJJLI = enumC1227180i2WArr;
        LLILLL = new C2254308sP(enumC1227180i2WArr);
    }

    public static EnumC1227180i2W[] values() {
        return (EnumC1227180i2W[]) LLILLJJLI.clone();
    }

    public final String getKey() {
        return this.LL;
    }

    public static EnumC1227180i2W valueOf(String str) {
        return (EnumC1227180i2W) C08FF.LIZ(EnumC1227180i2W.class, str);
    }

    public EnumC1227180i2W(String str, int i, String str2) {
        this.LL = str2;
    }
}
