package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.00Cn, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC040700Cn {
    public static final EnumC040700Cn FAILED;
    public static final /* synthetic */ EnumC040700Cn[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC040700Cn LOADING;
    public static final EnumC040700Cn SUCCEED;

    public static InterfaceC2044707zh<EnumC040700Cn> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC040700Cn enumC040700Cn = new EnumC040700Cn("LOADING", 0);
        LOADING = enumC040700Cn;
        EnumC040700Cn enumC040700Cn2 = new EnumC040700Cn("SUCCEED", 1);
        SUCCEED = enumC040700Cn2;
        EnumC040700Cn enumC040700Cn3 = new EnumC040700Cn("FAILED", 2);
        FAILED = enumC040700Cn3;
        EnumC040700Cn[] enumC040700CnArr = {enumC040700Cn, enumC040700Cn2, enumC040700Cn3};
        LL = enumC040700CnArr;
        LLILLJJLI = new C2254308sP(enumC040700CnArr);
    }

    public static EnumC040700Cn[] values() {
        return (EnumC040700Cn[]) LL.clone();
    }

    public static EnumC040700Cn valueOf(String str) {
        return (EnumC040700Cn) C08FF.LIZ(EnumC040700Cn.class, str);
    }

    public EnumC040700Cn(String str, int i) {
    }
}
