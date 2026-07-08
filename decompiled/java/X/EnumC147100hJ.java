package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.00hJ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC147100hJ {
    public static final EnumC147100hJ ANCHOR;
    public static final EnumC147100hJ AUDIENCE;
    public static final /* synthetic */ EnumC147100hJ[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public final String LL;

    public static InterfaceC2044707zh<EnumC147100hJ> getEntries() {
        return LLILLL;
    }

    static {
        EnumC147100hJ enumC147100hJ = new EnumC147100hJ("ANCHOR", 0, "anchor");
        ANCHOR = enumC147100hJ;
        EnumC147100hJ enumC147100hJ2 = new EnumC147100hJ("AUDIENCE", 1, "audience");
        AUDIENCE = enumC147100hJ2;
        EnumC147100hJ[] enumC147100hJArr = {enumC147100hJ, enumC147100hJ2};
        LLILLJJLI = enumC147100hJArr;
        LLILLL = new C2254308sP(enumC147100hJArr);
    }

    public static EnumC147100hJ[] values() {
        return (EnumC147100hJ[]) LLILLJJLI.clone();
    }

    public final String getValue() {
        return this.LL;
    }

    public static EnumC147100hJ valueOf(String str) {
        return (EnumC147100hJ) C08FF.LIZ(EnumC147100hJ.class, str);
    }

    public EnumC147100hJ(String str, int i, String str2) {
        this.LL = str2;
    }
}
