package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0gSS, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class EnumC1166380gSS {
    public static final EnumC1166380gSS AGE_LIMITED;
    public static final /* synthetic */ EnumC1166380gSS[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC1166380gSS SUCCESS;
    public static final EnumC1166380gSS TAB_ERROR;
    public static final EnumC1166380gSS TAB_LOADING;
    public static final EnumC1166380gSS WHOLE_PAGE_ERROR;
    public static final EnumC1166380gSS WHOLE_PAGE_LOADING;

    public static InterfaceC2044707zh<EnumC1166380gSS> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC1166380gSS enumC1166380gSS = new EnumC1166380gSS("SUCCESS", 0);
        SUCCESS = enumC1166380gSS;
        EnumC1166380gSS enumC1166380gSS2 = new EnumC1166380gSS("AGE_LIMITED", 1);
        AGE_LIMITED = enumC1166380gSS2;
        EnumC1166380gSS enumC1166380gSS3 = new EnumC1166380gSS("TAB_LOADING", 2);
        TAB_LOADING = enumC1166380gSS3;
        EnumC1166380gSS enumC1166380gSS4 = new EnumC1166380gSS("WHOLE_PAGE_LOADING", 3);
        WHOLE_PAGE_LOADING = enumC1166380gSS4;
        EnumC1166380gSS enumC1166380gSS5 = new EnumC1166380gSS("TAB_ERROR", 4);
        TAB_ERROR = enumC1166380gSS5;
        EnumC1166380gSS enumC1166380gSS6 = new EnumC1166380gSS("WHOLE_PAGE_ERROR", 5);
        WHOLE_PAGE_ERROR = enumC1166380gSS6;
        EnumC1166380gSS[] enumC1166380gSSArr = {enumC1166380gSS, enumC1166380gSS2, enumC1166380gSS3, enumC1166380gSS4, enumC1166380gSS5, enumC1166380gSS6};
        LL = enumC1166380gSSArr;
        LLILLJJLI = new C2254308sP(enumC1166380gSSArr);
    }

    public static EnumC1166380gSS[] values() {
        return (EnumC1166380gSS[]) LL.clone();
    }

    public static EnumC1166380gSS valueOf(String str) {
        return (EnumC1166380gSS) C08FF.LIZ(EnumC1166380gSS.class, str);
    }

    public EnumC1166380gSS(String str, int i) {
    }
}
