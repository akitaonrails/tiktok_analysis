package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.14Ie, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class EnumC20241814Ie {
    public static final EnumC20241814Ie FAILED;
    public static final /* synthetic */ EnumC20241814Ie[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC20241814Ie LOADING;
    public static final EnumC20241814Ie SUCCESS;
    public static final EnumC20241814Ie UNINITIALIZED;

    public static InterfaceC2044707zh<EnumC20241814Ie> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC20241814Ie enumC20241814Ie = new EnumC20241814Ie("LOADING", 0);
        LOADING = enumC20241814Ie;
        EnumC20241814Ie enumC20241814Ie2 = new EnumC20241814Ie("SUCCESS", 1);
        SUCCESS = enumC20241814Ie2;
        EnumC20241814Ie enumC20241814Ie3 = new EnumC20241814Ie("FAILED", 2);
        FAILED = enumC20241814Ie3;
        EnumC20241814Ie enumC20241814Ie4 = new EnumC20241814Ie("UNINITIALIZED", 3);
        UNINITIALIZED = enumC20241814Ie4;
        EnumC20241814Ie[] enumC20241814IeArr = {enumC20241814Ie, enumC20241814Ie2, enumC20241814Ie3, enumC20241814Ie4};
        LL = enumC20241814IeArr;
        LLILLJJLI = new C2254308sP(enumC20241814IeArr);
    }

    public static EnumC20241814Ie[] values() {
        return (EnumC20241814Ie[]) LL.clone();
    }

    public static EnumC20241814Ie valueOf(String str) {
        return (EnumC20241814Ie) C08FF.LIZ(EnumC20241814Ie.class, str);
    }

    public EnumC20241814Ie(String str, int i) {
    }
}
