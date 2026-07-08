package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.03fO, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class EnumC899603fO {
    public static final EnumC899603fO BLOCK;
    public static final /* synthetic */ EnumC899603fO[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC899603fO PASS;
    public static final EnumC899603fO REVIEW;
    public static final EnumC899603fO SLIDER_REVIEW;
    public final String LL;

    public static InterfaceC2044707zh<EnumC899603fO> getEntries() {
        return LLILLL;
    }

    static {
        EnumC899603fO enumC899603fO = new EnumC899603fO("PASS", 0, "pass");
        PASS = enumC899603fO;
        EnumC899603fO enumC899603fO2 = new EnumC899603fO("REVIEW", 1, "review");
        REVIEW = enumC899603fO2;
        EnumC899603fO enumC899603fO3 = new EnumC899603fO("BLOCK", 2, "block");
        BLOCK = enumC899603fO3;
        EnumC899603fO enumC899603fO4 = new EnumC899603fO("SLIDER_REVIEW", 3, "slider_review");
        SLIDER_REVIEW = enumC899603fO4;
        EnumC899603fO[] enumC899603fOArr = {enumC899603fO, enumC899603fO2, enumC899603fO3, enumC899603fO4};
        LLILLJJLI = enumC899603fOArr;
        LLILLL = new C2254308sP(enumC899603fOArr);
    }

    public static EnumC899603fO[] values() {
        return (EnumC899603fO[]) LLILLJJLI.clone();
    }

    public final String getValue() {
        return this.LL;
    }

    public static EnumC899603fO valueOf(String str) {
        return (EnumC899603fO) C08FF.LIZ(EnumC899603fO.class, str);
    }

    public EnumC899603fO(String str, int i, String str2) {
        this.LL = str2;
    }
}
