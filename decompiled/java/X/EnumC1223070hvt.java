package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0hvt, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class EnumC1223070hvt {
    public static final EnumC1223070hvt ERROR;
    public static final /* synthetic */ EnumC1223070hvt[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC1223070hvt LOADING;
    public static final EnumC1223070hvt SUCCESS;

    public static InterfaceC2044707zh<EnumC1223070hvt> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC1223070hvt enumC1223070hvt = new EnumC1223070hvt("LOADING", 0);
        LOADING = enumC1223070hvt;
        EnumC1223070hvt enumC1223070hvt2 = new EnumC1223070hvt("SUCCESS", 1);
        SUCCESS = enumC1223070hvt2;
        EnumC1223070hvt enumC1223070hvt3 = new EnumC1223070hvt("ERROR", 2);
        ERROR = enumC1223070hvt3;
        EnumC1223070hvt[] enumC1223070hvtArr = {enumC1223070hvt, enumC1223070hvt2, enumC1223070hvt3};
        LL = enumC1223070hvtArr;
        LLILLJJLI = new C2254308sP(enumC1223070hvtArr);
    }

    public static EnumC1223070hvt[] values() {
        return (EnumC1223070hvt[]) LL.clone();
    }

    public static EnumC1223070hvt valueOf(String str) {
        return (EnumC1223070hvt) C08FF.LIZ(EnumC1223070hvt.class, str);
    }

    public EnumC1223070hvt(String str, int i) {
    }
}
