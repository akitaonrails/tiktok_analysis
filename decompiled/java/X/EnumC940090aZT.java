package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0aZT, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class EnumC940090aZT {
    public static final EnumC940090aZT FEED;
    public static final /* synthetic */ EnumC940090aZT[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC940090aZT SEARCH;
    public final String LL;

    public static InterfaceC2044707zh<EnumC940090aZT> getEntries() {
        return LLILLL;
    }

    static {
        EnumC940090aZT enumC940090aZT = new EnumC940090aZT("FEED", 0, "feed");
        FEED = enumC940090aZT;
        EnumC940090aZT enumC940090aZT2 = new EnumC940090aZT("SEARCH", 1, "search");
        SEARCH = enumC940090aZT2;
        EnumC940090aZT[] enumC940090aZTArr = {enumC940090aZT, enumC940090aZT2};
        LLILLJJLI = enumC940090aZTArr;
        LLILLL = new C2254308sP(enumC940090aZTArr);
    }

    public static EnumC940090aZT[] values() {
        return (EnumC940090aZT[]) LLILLJJLI.clone();
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.LL;
    }

    public static EnumC940090aZT valueOf(String str) {
        return (EnumC940090aZT) C08FF.LIZ(EnumC940090aZT.class, str);
    }

    public EnumC940090aZT(String str, int i, String str2) {
        this.LL = str2;
    }
}
