package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0ZTt, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class EnumC900350ZTt {
    public static final EnumC900350ZTt CREATE;
    public static final EnumC900350ZTt JOIN;
    public static final /* synthetic */ EnumC900350ZTt[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;

    public static InterfaceC2044707zh<EnumC900350ZTt> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC900350ZTt enumC900350ZTt = new EnumC900350ZTt("CREATE", 0);
        CREATE = enumC900350ZTt;
        EnumC900350ZTt enumC900350ZTt2 = new EnumC900350ZTt("JOIN", 1);
        JOIN = enumC900350ZTt2;
        EnumC900350ZTt[] enumC900350ZTtArr = {enumC900350ZTt, enumC900350ZTt2};
        LL = enumC900350ZTtArr;
        LLILLJJLI = new C2254308sP(enumC900350ZTtArr);
    }

    public static EnumC900350ZTt[] values() {
        return (EnumC900350ZTt[]) LL.clone();
    }

    public static EnumC900350ZTt valueOf(String str) {
        return (EnumC900350ZTt) C08FF.LIZ(EnumC900350ZTt.class, str);
    }

    public EnumC900350ZTt(String str, int i) {
    }
}
