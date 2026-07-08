package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0d5C, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class EnumC1036640d5C {
    public static final /* synthetic */ EnumC1036640d5C[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC1036640d5C PAGE_SELECT;
    public static final EnumC1036640d5C SLIDE_1PX;
    public final String LL;

    public static InterfaceC2044707zh<EnumC1036640d5C> getEntries() {
        return LLILLL;
    }

    static {
        EnumC1036640d5C enumC1036640d5C = new EnumC1036640d5C("PAGE_SELECT", 0, "page_select");
        PAGE_SELECT = enumC1036640d5C;
        EnumC1036640d5C enumC1036640d5C2 = new EnumC1036640d5C("SLIDE_1PX", 1, "slide_1px");
        SLIDE_1PX = enumC1036640d5C2;
        EnumC1036640d5C[] enumC1036640d5CArr = {enumC1036640d5C, enumC1036640d5C2};
        LLILLJJLI = enumC1036640d5CArr;
        LLILLL = new C2254308sP(enumC1036640d5CArr);
    }

    public static EnumC1036640d5C[] values() {
        return (EnumC1036640d5C[]) LLILLJJLI.clone();
    }

    public final String getFrom() {
        return this.LL;
    }

    public static EnumC1036640d5C valueOf(String str) {
        return (EnumC1036640d5C) C08FF.LIZ(EnumC1036640d5C.class, str);
    }

    public EnumC1036640d5C(String str, int i, String str2) {
        this.LL = str2;
    }
}
