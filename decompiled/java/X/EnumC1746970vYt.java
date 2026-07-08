package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0vYt, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class EnumC1746970vYt {
    public static final EnumC1746970vYt FAILED;
    public static final /* synthetic */ EnumC1746970vYt[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC1746970vYt LOADING;
    public static final EnumC1746970vYt NO_RESULT;
    public static final EnumC1746970vYt SUCCESS;

    public static InterfaceC2044707zh<EnumC1746970vYt> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC1746970vYt enumC1746970vYt = new EnumC1746970vYt("LOADING", 0);
        LOADING = enumC1746970vYt;
        EnumC1746970vYt enumC1746970vYt2 = new EnumC1746970vYt("SUCCESS", 1);
        SUCCESS = enumC1746970vYt2;
        EnumC1746970vYt enumC1746970vYt3 = new EnumC1746970vYt("NO_RESULT", 2);
        NO_RESULT = enumC1746970vYt3;
        EnumC1746970vYt enumC1746970vYt4 = new EnumC1746970vYt("FAILED", 3);
        FAILED = enumC1746970vYt4;
        EnumC1746970vYt[] enumC1746970vYtArr = {enumC1746970vYt, enumC1746970vYt2, enumC1746970vYt3, enumC1746970vYt4};
        LL = enumC1746970vYtArr;
        LLILLJJLI = new C2254308sP(enumC1746970vYtArr);
    }

    public static EnumC1746970vYt[] values() {
        return (EnumC1746970vYt[]) LL.clone();
    }

    public static EnumC1746970vYt valueOf(String str) {
        return (EnumC1746970vYt) C08FF.LIZ(EnumC1746970vYt.class, str);
    }

    public EnumC1746970vYt(String str, int i) {
    }
}
