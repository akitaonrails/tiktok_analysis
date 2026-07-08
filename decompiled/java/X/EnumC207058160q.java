package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.160q, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public final class EnumC207058160q {
    public static final EnumC207058160q LANDSCAPE;
    public static final /* synthetic */ EnumC207058160q[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC207058160q PORTRAIT_CENTER_ALIGN;
    public static final EnumC207058160q PORTRAIT_CENTER_ALIGN_NATIVE_LAYOUT;
    public static final EnumC207058160q PORTRAIT_FC2;
    public static final EnumC207058160q PORTRAIT_NON_FC2;

    public static InterfaceC2044707zh<EnumC207058160q> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC207058160q enumC207058160q = new EnumC207058160q("LANDSCAPE", 0);
        LANDSCAPE = enumC207058160q;
        EnumC207058160q enumC207058160q2 = new EnumC207058160q("PORTRAIT_FC2", 1);
        PORTRAIT_FC2 = enumC207058160q2;
        EnumC207058160q enumC207058160q3 = new EnumC207058160q("PORTRAIT_NON_FC2", 2);
        PORTRAIT_NON_FC2 = enumC207058160q3;
        EnumC207058160q enumC207058160q4 = new EnumC207058160q("PORTRAIT_CENTER_ALIGN", 3);
        PORTRAIT_CENTER_ALIGN = enumC207058160q4;
        EnumC207058160q enumC207058160q5 = new EnumC207058160q("PORTRAIT_CENTER_ALIGN_NATIVE_LAYOUT", 4);
        PORTRAIT_CENTER_ALIGN_NATIVE_LAYOUT = enumC207058160q5;
        EnumC207058160q[] enumC207058160qArr = {enumC207058160q, enumC207058160q2, enumC207058160q3, enumC207058160q4, enumC207058160q5};
        LL = enumC207058160qArr;
        LLILLJJLI = new C2254308sP(enumC207058160qArr);
    }

    public static EnumC207058160q[] values() {
        return (EnumC207058160q[]) LL.clone();
    }

    public static EnumC207058160q valueOf(String str) {
        return (EnumC207058160q) C08FF.LIZ(EnumC207058160q.class, str);
    }

    public EnumC207058160q(String str, int i) {
    }
}
