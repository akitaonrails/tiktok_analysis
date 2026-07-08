package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0zMJ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class EnumC1892930zMJ {
    public static final EnumC1892930zMJ COPY_LINK;
    public static final /* synthetic */ EnumC1892930zMJ[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC1892930zMJ VIEW_ON_BROWSER;
    public final String LL;

    public static InterfaceC2044707zh<EnumC1892930zMJ> getEntries() {
        return LLILLL;
    }

    static {
        EnumC1892930zMJ enumC1892930zMJ = new EnumC1892930zMJ("VIEW_ON_BROWSER", 0, "click_view_on_browser");
        VIEW_ON_BROWSER = enumC1892930zMJ;
        EnumC1892930zMJ enumC1892930zMJ2 = new EnumC1892930zMJ("COPY_LINK", 1, "click_copy_link");
        COPY_LINK = enumC1892930zMJ2;
        EnumC1892930zMJ[] enumC1892930zMJArr = {enumC1892930zMJ, enumC1892930zMJ2};
        LLILLJJLI = enumC1892930zMJArr;
        LLILLL = new C2254308sP(enumC1892930zMJArr);
    }

    public static EnumC1892930zMJ[] values() {
        return (EnumC1892930zMJ[]) LLILLJJLI.clone();
    }

    public final String getEnterMethod() {
        return this.LL;
    }

    public static EnumC1892930zMJ valueOf(String str) {
        return (EnumC1892930zMJ) C08FF.LIZ(EnumC1892930zMJ.class, str);
    }

    public EnumC1892930zMJ(String str, int i, String str2) {
        this.LL = str2;
    }
}
