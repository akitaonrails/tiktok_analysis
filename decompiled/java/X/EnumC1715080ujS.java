package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0ujS, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class EnumC1715080ujS {
    public static final EnumC1715080ujS API_ERROR;
    public static final /* synthetic */ EnumC1715080ujS[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC1715080ujS LOADING;
    public static final EnumC1715080ujS NOT_START;
    public static final EnumC1715080ujS SUCCESS;

    public static InterfaceC2044707zh<EnumC1715080ujS> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC1715080ujS enumC1715080ujS = new EnumC1715080ujS("NOT_START", 0);
        NOT_START = enumC1715080ujS;
        EnumC1715080ujS enumC1715080ujS2 = new EnumC1715080ujS("LOADING", 1);
        LOADING = enumC1715080ujS2;
        EnumC1715080ujS enumC1715080ujS3 = new EnumC1715080ujS("SUCCESS", 2);
        SUCCESS = enumC1715080ujS3;
        EnumC1715080ujS enumC1715080ujS4 = new EnumC1715080ujS("API_ERROR", 3);
        API_ERROR = enumC1715080ujS4;
        EnumC1715080ujS[] enumC1715080ujSArr = {enumC1715080ujS, enumC1715080ujS2, enumC1715080ujS3, enumC1715080ujS4};
        LL = enumC1715080ujSArr;
        LLILLJJLI = new C2254308sP(enumC1715080ujSArr);
    }

    public static EnumC1715080ujS[] values() {
        return (EnumC1715080ujS[]) LL.clone();
    }

    public static EnumC1715080ujS valueOf(String str) {
        return (EnumC1715080ujS) C08FF.LIZ(EnumC1715080ujS.class, str);
    }

    public EnumC1715080ujS(String str, int i) {
    }
}
