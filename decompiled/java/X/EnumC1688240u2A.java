package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0u2A, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class EnumC1688240u2A {
    public static final EnumC1688240u2A Clip;
    public static final EnumC1688240u2A ExpandIndicator;
    public static final EnumC1688240u2A ExpandOrCollapseIndicator;
    public static final /* synthetic */ EnumC1688240u2A[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC1688240u2A Visible;

    public static InterfaceC2044707zh<EnumC1688240u2A> getEntries() {
        return LLILLJJLI;
    }

    public static EnumC1688240u2A valueOf(String str) {
        return (EnumC1688240u2A) C08FF.LIZ(EnumC1688240u2A.class, str);
    }

    public static EnumC1688240u2A[] values() {
        return (EnumC1688240u2A[]) LL.clone();
    }

    static {
        EnumC1688240u2A enumC1688240u2A = new EnumC1688240u2A("Visible", 0);
        Visible = enumC1688240u2A;
        EnumC1688240u2A enumC1688240u2A2 = new EnumC1688240u2A("Clip", 1);
        Clip = enumC1688240u2A2;
        EnumC1688240u2A enumC1688240u2A3 = new EnumC1688240u2A("ExpandIndicator", 2);
        ExpandIndicator = enumC1688240u2A3;
        EnumC1688240u2A enumC1688240u2A4 = new EnumC1688240u2A("ExpandOrCollapseIndicator", 3);
        ExpandOrCollapseIndicator = enumC1688240u2A4;
        EnumC1688240u2A[] enumC1688240u2AArr = {enumC1688240u2A, enumC1688240u2A2, enumC1688240u2A3, enumC1688240u2A4};
        LL = enumC1688240u2AArr;
        LLILLJJLI = new C2254308sP(enumC1688240u2AArr);
    }

    public EnumC1688240u2A(String str, int i) {
    }
}
