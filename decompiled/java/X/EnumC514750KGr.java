package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0KGr, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class EnumC514750KGr {
    public static final EnumC514750KGr BOTTOM_ASSEM;
    public static final EnumC514750KGr CONTENT_ASSEM;
    public static final /* synthetic */ EnumC514750KGr[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC514750KGr TOP_NAVIGATION_ASSEM;

    public static InterfaceC2044707zh<EnumC514750KGr> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC514750KGr enumC514750KGr = new EnumC514750KGr("TOP_NAVIGATION_ASSEM", 0);
        TOP_NAVIGATION_ASSEM = enumC514750KGr;
        EnumC514750KGr enumC514750KGr2 = new EnumC514750KGr("CONTENT_ASSEM", 1);
        CONTENT_ASSEM = enumC514750KGr2;
        EnumC514750KGr enumC514750KGr3 = new EnumC514750KGr("BOTTOM_ASSEM", 2);
        BOTTOM_ASSEM = enumC514750KGr3;
        EnumC514750KGr[] enumC514750KGrArr = {enumC514750KGr, enumC514750KGr2, enumC514750KGr3};
        LL = enumC514750KGrArr;
        LLILLJJLI = new C2254308sP(enumC514750KGrArr);
    }

    public static EnumC514750KGr[] values() {
        return (EnumC514750KGr[]) LL.clone();
    }

    public static EnumC514750KGr valueOf(String str) {
        return (EnumC514750KGr) C08FF.LIZ(EnumC514750KGr.class, str);
    }

    public EnumC514750KGr(String str, int i) {
    }
}
