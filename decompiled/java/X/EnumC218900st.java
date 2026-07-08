package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.00st, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC218900st {
    public static final EnumC218900st FULL_EXPOSE;
    public static final /* synthetic */ EnumC218900st[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC218900st PRECISE;
    public final String LL;

    public static InterfaceC2044707zh<EnumC218900st> getEntries() {
        return LLILLL;
    }

    static {
        EnumC218900st enumC218900st = new EnumC218900st("FULL_EXPOSE", 0, "full_expose");
        FULL_EXPOSE = enumC218900st;
        EnumC218900st enumC218900st2 = new EnumC218900st("PRECISE", 1, "precise");
        PRECISE = enumC218900st2;
        EnumC218900st[] enumC218900stArr = {enumC218900st, enumC218900st2};
        LLILLJJLI = enumC218900stArr;
        LLILLL = new C2254308sP(enumC218900stArr);
    }

    public static EnumC218900st[] values() {
        return (EnumC218900st[]) LLILLJJLI.clone();
    }

    public final String getValue() {
        return this.LL;
    }

    public static EnumC218900st valueOf(String str) {
        return (EnumC218900st) C08FF.LIZ(EnumC218900st.class, str);
    }

    public EnumC218900st(String str, int i, String str2) {
        this.LL = str2;
    }
}
