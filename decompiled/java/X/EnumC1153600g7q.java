package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0g7q, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class EnumC1153600g7q {
    public static final EnumC1153600g7q DOUBLE_CLICK;
    public static final EnumC1153600g7q FRAGMENT_HAS_SHOW;
    public static final /* synthetic */ EnumC1153600g7q[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public final String LL;

    public static InterfaceC2044707zh<EnumC1153600g7q> getEntries() {
        return LLILLL;
    }

    static {
        EnumC1153600g7q enumC1153600g7q = new EnumC1153600g7q("DOUBLE_CLICK", 0, "double_click");
        DOUBLE_CLICK = enumC1153600g7q;
        EnumC1153600g7q enumC1153600g7q2 = new EnumC1153600g7q("FRAGMENT_HAS_SHOW", 1, "fragment_has_show");
        FRAGMENT_HAS_SHOW = enumC1153600g7q2;
        EnumC1153600g7q[] enumC1153600g7qArr = {enumC1153600g7q, enumC1153600g7q2};
        LLILLJJLI = enumC1153600g7qArr;
        LLILLL = new C2254308sP(enumC1153600g7qArr);
    }

    public static EnumC1153600g7q[] values() {
        return (EnumC1153600g7q[]) LLILLJJLI.clone();
    }

    public final String getType() {
        return this.LL;
    }

    public static EnumC1153600g7q valueOf(String str) {
        return (EnumC1153600g7q) C08FF.LIZ(EnumC1153600g7q.class, str);
    }

    public EnumC1153600g7q(String str, int i, String str2) {
        this.LL = str2;
    }
}
