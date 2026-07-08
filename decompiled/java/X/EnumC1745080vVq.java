package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0vVq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class EnumC1745080vVq {
    public static final EnumC1745080vVq Bottom;
    public static final /* synthetic */ EnumC1745080vVq[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC1745080vVq Middle;
    public static final EnumC1745080vVq Top;

    public static InterfaceC2044707zh<EnumC1745080vVq> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC1745080vVq enumC1745080vVq = new EnumC1745080vVq("Top", 0);
        Top = enumC1745080vVq;
        EnumC1745080vVq enumC1745080vVq2 = new EnumC1745080vVq("Middle", 1);
        Middle = enumC1745080vVq2;
        EnumC1745080vVq enumC1745080vVq3 = new EnumC1745080vVq("Bottom", 2);
        Bottom = enumC1745080vVq3;
        EnumC1745080vVq[] enumC1745080vVqArr = {enumC1745080vVq, enumC1745080vVq2, enumC1745080vVq3};
        LL = enumC1745080vVqArr;
        LLILLJJLI = new C2254308sP(enumC1745080vVqArr);
    }

    public static EnumC1745080vVq[] values() {
        return (EnumC1745080vVq[]) LL.clone();
    }

    public static EnumC1745080vVq valueOf(String str) {
        return (EnumC1745080vVq) C08FF.LIZ(EnumC1745080vVq.class, str);
    }

    public EnumC1745080vVq(String str, int i) {
    }
}
