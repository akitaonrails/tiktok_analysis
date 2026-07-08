package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0hvm, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class EnumC1223000hvm {
    public static final EnumC1223000hvm EMPTY;
    public static final EnumC1223000hvm FAIL;
    public static final /* synthetic */ EnumC1223000hvm[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC1223000hvm LOADING;
    public static final EnumC1223000hvm NOT_EMPTY;
    public static final EnumC1223000hvm UNINITIALIZED;

    public static InterfaceC2044707zh<EnumC1223000hvm> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC1223000hvm enumC1223000hvm = new EnumC1223000hvm("UNINITIALIZED", 0);
        UNINITIALIZED = enumC1223000hvm;
        EnumC1223000hvm enumC1223000hvm2 = new EnumC1223000hvm("LOADING", 1);
        LOADING = enumC1223000hvm2;
        EnumC1223000hvm enumC1223000hvm3 = new EnumC1223000hvm("EMPTY", 2);
        EMPTY = enumC1223000hvm3;
        EnumC1223000hvm enumC1223000hvm4 = new EnumC1223000hvm("NOT_EMPTY", 3);
        NOT_EMPTY = enumC1223000hvm4;
        EnumC1223000hvm enumC1223000hvm5 = new EnumC1223000hvm("FAIL", 4);
        FAIL = enumC1223000hvm5;
        EnumC1223000hvm[] enumC1223000hvmArr = {enumC1223000hvm, enumC1223000hvm2, enumC1223000hvm3, enumC1223000hvm4, enumC1223000hvm5};
        LL = enumC1223000hvmArr;
        LLILLJJLI = new C2254308sP(enumC1223000hvmArr);
    }

    public static EnumC1223000hvm[] values() {
        return (EnumC1223000hvm[]) LL.clone();
    }

    public static EnumC1223000hvm valueOf(String str) {
        return (EnumC1223000hvm) C08FF.LIZ(EnumC1223000hvm.class, str);
    }

    public EnumC1223000hvm(String str, int i) {
    }
}
