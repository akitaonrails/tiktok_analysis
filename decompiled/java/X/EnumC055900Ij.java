package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.00Ij, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC055900Ij {
    public static final EnumC055900Ij FAILED;
    public static final /* synthetic */ EnumC055900Ij[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC055900Ij LOADING;
    public static final EnumC055900Ij SUCCEED;

    public static InterfaceC2044707zh<EnumC055900Ij> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC055900Ij enumC055900Ij = new EnumC055900Ij("LOADING", 0);
        LOADING = enumC055900Ij;
        EnumC055900Ij enumC055900Ij2 = new EnumC055900Ij("SUCCEED", 1);
        SUCCEED = enumC055900Ij2;
        EnumC055900Ij enumC055900Ij3 = new EnumC055900Ij("FAILED", 2);
        FAILED = enumC055900Ij3;
        EnumC055900Ij[] enumC055900IjArr = {enumC055900Ij, enumC055900Ij2, enumC055900Ij3};
        LL = enumC055900IjArr;
        LLILLJJLI = new C2254308sP(enumC055900IjArr);
    }

    public static EnumC055900Ij[] values() {
        return (EnumC055900Ij[]) LL.clone();
    }

    public static EnumC055900Ij valueOf(String str) {
        return (EnumC055900Ij) C08FF.LIZ(EnumC055900Ij.class, str);
    }

    public EnumC055900Ij(String str, int i) {
    }
}
