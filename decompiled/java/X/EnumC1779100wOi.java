package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0wOi, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class EnumC1779100wOi {
    public static final EnumC1779100wOi DISMISS;
    public static final EnumC1779100wOi EXPOSE;
    public static final /* synthetic */ EnumC1779100wOi[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC1779100wOi VIEW_DETAIL;
    public final int LL;

    public static InterfaceC2044707zh<EnumC1779100wOi> getEntries() {
        return LLILLL;
    }

    static {
        EnumC1779100wOi enumC1779100wOi = new EnumC1779100wOi("EXPOSE", 0, 1);
        EXPOSE = enumC1779100wOi;
        EnumC1779100wOi enumC1779100wOi2 = new EnumC1779100wOi("DISMISS", 1, 2);
        DISMISS = enumC1779100wOi2;
        EnumC1779100wOi enumC1779100wOi3 = new EnumC1779100wOi("VIEW_DETAIL", 2, 3);
        VIEW_DETAIL = enumC1779100wOi3;
        EnumC1779100wOi[] enumC1779100wOiArr = {enumC1779100wOi, enumC1779100wOi2, enumC1779100wOi3};
        LLILLJJLI = enumC1779100wOiArr;
        LLILLL = new C2254308sP(enumC1779100wOiArr);
    }

    public static EnumC1779100wOi[] values() {
        return (EnumC1779100wOi[]) LLILLJJLI.clone();
    }

    public final int getValue() {
        return this.LL;
    }

    public static EnumC1779100wOi valueOf(String str) {
        return (EnumC1779100wOi) C08FF.LIZ(EnumC1779100wOi.class, str);
    }

    public EnumC1779100wOi(String str, int i, int i2) {
        this.LL = i2;
    }
}
