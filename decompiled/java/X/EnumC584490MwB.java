package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0MwB, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class EnumC584490MwB {
    public static final EnumC584490MwB COMMENT;
    public static final /* synthetic */ EnumC584490MwB[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC584490MwB PAGE_CHANGE;
    public final String LL;

    public static InterfaceC2044707zh<EnumC584490MwB> getEntries() {
        return LLILLL;
    }

    static {
        EnumC584490MwB enumC584490MwB = new EnumC584490MwB("COMMENT", 0, "comment");
        COMMENT = enumC584490MwB;
        EnumC584490MwB enumC584490MwB2 = new EnumC584490MwB("PAGE_CHANGE", 1, "page_change");
        PAGE_CHANGE = enumC584490MwB2;
        EnumC584490MwB[] enumC584490MwBArr = {enumC584490MwB, enumC584490MwB2};
        LLILLJJLI = enumC584490MwBArr;
        LLILLL = new C2254308sP(enumC584490MwBArr);
    }

    public static EnumC584490MwB[] values() {
        return (EnumC584490MwB[]) LLILLJJLI.clone();
    }

    public final String getTag() {
        return this.LL;
    }

    public static EnumC584490MwB valueOf(String str) {
        return (EnumC584490MwB) C08FF.LIZ(EnumC584490MwB.class, str);
    }

    public EnumC584490MwB(String str, int i, String str2) {
        this.LL = str2;
    }
}
