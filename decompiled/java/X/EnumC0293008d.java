package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.008d, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC0293008d {
    public static final EnumC0293008d DRAMA_INNER_FEED;
    public static final EnumC0293008d DRAMA_TAB;
    public static final EnumC0293008d FYP_INSERT;
    public static final /* synthetic */ EnumC0293008d[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;

    public static InterfaceC2044707zh<EnumC0293008d> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC0293008d enumC0293008d = new EnumC0293008d("FYP_INSERT", 0);
        FYP_INSERT = enumC0293008d;
        EnumC0293008d enumC0293008d2 = new EnumC0293008d("DRAMA_INNER_FEED", 1);
        DRAMA_INNER_FEED = enumC0293008d2;
        EnumC0293008d enumC0293008d3 = new EnumC0293008d("DRAMA_TAB", 2);
        DRAMA_TAB = enumC0293008d3;
        EnumC0293008d[] enumC0293008dArr = {enumC0293008d, enumC0293008d2, enumC0293008d3};
        LL = enumC0293008dArr;
        LLILLJJLI = new C2254308sP(enumC0293008dArr);
    }

    public static EnumC0293008d[] values() {
        return (EnumC0293008d[]) LL.clone();
    }

    public static EnumC0293008d valueOf(String str) {
        return (EnumC0293008d) C08FF.LIZ(EnumC0293008d.class, str);
    }

    public EnumC0293008d(String str, int i) {
    }
}
