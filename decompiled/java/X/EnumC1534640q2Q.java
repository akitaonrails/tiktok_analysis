package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0q2Q, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class EnumC1534640q2Q {
    public static final EnumC1534640q2Q AUTO;
    public static final EnumC1534640q2Q FORCE_MEMORY;
    public static final EnumC1534640q2Q FORCE_WRITE_BACK;
    public static final /* synthetic */ EnumC1534640q2Q[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;

    public static InterfaceC2044707zh<EnumC1534640q2Q> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC1534640q2Q enumC1534640q2Q = new EnumC1534640q2Q("AUTO", 0);
        AUTO = enumC1534640q2Q;
        EnumC1534640q2Q enumC1534640q2Q2 = new EnumC1534640q2Q("FORCE_MEMORY", 1);
        FORCE_MEMORY = enumC1534640q2Q2;
        EnumC1534640q2Q enumC1534640q2Q3 = new EnumC1534640q2Q("FORCE_WRITE_BACK", 2);
        FORCE_WRITE_BACK = enumC1534640q2Q3;
        EnumC1534640q2Q[] enumC1534640q2QArr = {enumC1534640q2Q, enumC1534640q2Q2, enumC1534640q2Q3};
        LL = enumC1534640q2QArr;
        LLILLJJLI = new C2254308sP(enumC1534640q2QArr);
    }

    public static EnumC1534640q2Q[] values() {
        return (EnumC1534640q2Q[]) LL.clone();
    }

    public static EnumC1534640q2Q valueOf(String str) {
        return (EnumC1534640q2Q) C08FF.LIZ(EnumC1534640q2Q.class, str);
    }

    public EnumC1534640q2Q(String str, int i) {
    }
}
