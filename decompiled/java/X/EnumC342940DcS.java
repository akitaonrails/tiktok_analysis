package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0DcS, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class EnumC342940DcS {
    public static final EnumC342940DcS COMPLETED;
    public static final EnumC342940DcS ERROR;
    public static final /* synthetic */ EnumC342940DcS[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC342940DcS LOADING;

    public static InterfaceC2044707zh<EnumC342940DcS> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC342940DcS enumC342940DcS = new EnumC342940DcS("LOADING", 0);
        LOADING = enumC342940DcS;
        EnumC342940DcS enumC342940DcS2 = new EnumC342940DcS("COMPLETED", 1);
        COMPLETED = enumC342940DcS2;
        EnumC342940DcS enumC342940DcS3 = new EnumC342940DcS("ERROR", 2);
        ERROR = enumC342940DcS3;
        EnumC342940DcS[] enumC342940DcSArr = {enumC342940DcS, enumC342940DcS2, enumC342940DcS3};
        LL = enumC342940DcSArr;
        LLILLJJLI = new C2254308sP(enumC342940DcSArr);
    }

    public static EnumC342940DcS[] values() {
        return (EnumC342940DcS[]) LL.clone();
    }

    public static EnumC342940DcS valueOf(String str) {
        return (EnumC342940DcS) C08FF.LIZ(EnumC342940DcS.class, str);
    }

    public EnumC342940DcS(String str, int i) {
    }
}
