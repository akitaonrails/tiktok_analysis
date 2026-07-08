package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0Ous, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class EnumC634640Ous {
    public static final EnumC634640Ous FEED;
    public static final /* synthetic */ EnumC634640Ous[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC634640Ous SEARCH;
    public final String LL;

    public static InterfaceC2044707zh<EnumC634640Ous> getEntries() {
        return LLILLL;
    }

    static {
        EnumC634640Ous enumC634640Ous = new EnumC634640Ous("FEED", 0, "feed");
        FEED = enumC634640Ous;
        EnumC634640Ous enumC634640Ous2 = new EnumC634640Ous("SEARCH", 1, "search");
        SEARCH = enumC634640Ous2;
        EnumC634640Ous[] enumC634640OusArr = {enumC634640Ous, enumC634640Ous2};
        LLILLJJLI = enumC634640OusArr;
        LLILLL = new C2254308sP(enumC634640OusArr);
    }

    public static EnumC634640Ous[] values() {
        return (EnumC634640Ous[]) LLILLJJLI.clone();
    }

    public final String getValue() {
        return this.LL;
    }

    public static EnumC634640Ous valueOf(String str) {
        return (EnumC634640Ous) C08FF.LIZ(EnumC634640Ous.class, str);
    }

    public EnumC634640Ous(String str, int i, String str2) {
        this.LL = str2;
    }
}
