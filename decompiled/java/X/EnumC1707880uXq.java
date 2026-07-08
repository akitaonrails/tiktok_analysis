package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0uXq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class EnumC1707880uXq {
    public static final EnumC1707880uXq ERROR;
    public static final /* synthetic */ EnumC1707880uXq[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC1707880uXq NEED_MORE_INFO;
    public static final EnumC1707880uXq PROCESSING;
    public static final EnumC1707880uXq REDIRECT;
    public static final EnumC1707880uXq SUCCESS;
    public static final EnumC1707880uXq VERIFY;
    public final String LL;

    public static InterfaceC2044707zh<EnumC1707880uXq> getEntries() {
        return LLILLL;
    }

    static {
        EnumC1707880uXq enumC1707880uXq = new EnumC1707880uXq("SUCCESS", 0, "success");
        SUCCESS = enumC1707880uXq;
        EnumC1707880uXq enumC1707880uXq2 = new EnumC1707880uXq("PROCESSING", 1, "processing");
        PROCESSING = enumC1707880uXq2;
        EnumC1707880uXq enumC1707880uXq3 = new EnumC1707880uXq("ERROR", 2, "error");
        ERROR = enumC1707880uXq3;
        EnumC1707880uXq enumC1707880uXq4 = new EnumC1707880uXq("NEED_MORE_INFO", 3, "need_more_info");
        NEED_MORE_INFO = enumC1707880uXq4;
        EnumC1707880uXq enumC1707880uXq5 = new EnumC1707880uXq("REDIRECT", 4, "redirect");
        REDIRECT = enumC1707880uXq5;
        EnumC1707880uXq enumC1707880uXq6 = new EnumC1707880uXq("VERIFY", 5, "verify");
        VERIFY = enumC1707880uXq6;
        EnumC1707880uXq[] enumC1707880uXqArr = {enumC1707880uXq, enumC1707880uXq2, enumC1707880uXq3, enumC1707880uXq4, enumC1707880uXq5, enumC1707880uXq6};
        LLILLJJLI = enumC1707880uXqArr;
        LLILLL = new C2254308sP(enumC1707880uXqArr);
    }

    public static EnumC1707880uXq[] values() {
        return (EnumC1707880uXq[]) LLILLJJLI.clone();
    }

    public final String getValue() {
        return this.LL;
    }

    public static EnumC1707880uXq valueOf(String str) {
        return (EnumC1707880uXq) C08FF.LIZ(EnumC1707880uXq.class, str);
    }

    public EnumC1707880uXq(String str, int i, String str2) {
        this.LL = str2;
    }
}
