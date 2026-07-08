package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0zhn, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class EnumC1906250zhn {
    public static final EnumC1906250zhn FEW;
    public static final /* synthetic */ EnumC1906250zhn[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC1906250zhn MANY;
    public static final EnumC1906250zhn ONE;
    public static final EnumC1906250zhn OTHER;
    public static final EnumC1906250zhn TWO;
    public static final EnumC1906250zhn ZERO;

    public static InterfaceC2044707zh<EnumC1906250zhn> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC1906250zhn enumC1906250zhn = new EnumC1906250zhn("ZERO", 0);
        ZERO = enumC1906250zhn;
        EnumC1906250zhn enumC1906250zhn2 = new EnumC1906250zhn("ONE", 1);
        ONE = enumC1906250zhn2;
        EnumC1906250zhn enumC1906250zhn3 = new EnumC1906250zhn("TWO", 2);
        TWO = enumC1906250zhn3;
        EnumC1906250zhn enumC1906250zhn4 = new EnumC1906250zhn("MANY", 3);
        MANY = enumC1906250zhn4;
        EnumC1906250zhn enumC1906250zhn5 = new EnumC1906250zhn("FEW", 4);
        FEW = enumC1906250zhn5;
        EnumC1906250zhn enumC1906250zhn6 = new EnumC1906250zhn("OTHER", 5);
        OTHER = enumC1906250zhn6;
        EnumC1906250zhn[] enumC1906250zhnArr = {enumC1906250zhn, enumC1906250zhn2, enumC1906250zhn3, enumC1906250zhn4, enumC1906250zhn5, enumC1906250zhn6};
        LL = enumC1906250zhnArr;
        LLILLJJLI = new C2254308sP(enumC1906250zhnArr);
    }

    public static EnumC1906250zhn[] values() {
        return (EnumC1906250zhn[]) LL.clone();
    }

    public static EnumC1906250zhn valueOf(String str) {
        return (EnumC1906250zhn) C08FF.LIZ(EnumC1906250zhn.class, str);
    }

    public EnumC1906250zhn(String str, int i) {
    }
}
