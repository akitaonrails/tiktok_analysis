package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0iBM, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class EnumC1232660iBM {
    public static final EnumC1232660iBM ACTIVE;
    public static final EnumC1232660iBM CANCELED;
    public static final EnumC1232660iBM EXPIRED;
    public static final /* synthetic */ EnumC1232660iBM[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC1232660iBM ONHOLD;
    public final String LL;

    public static InterfaceC2044707zh<EnumC1232660iBM> getEntries() {
        return LLILLL;
    }

    static {
        EnumC1232660iBM enumC1232660iBM = new EnumC1232660iBM("ACTIVE", 0, "active");
        ACTIVE = enumC1232660iBM;
        EnumC1232660iBM enumC1232660iBM2 = new EnumC1232660iBM("CANCELED", 1, "canceled");
        CANCELED = enumC1232660iBM2;
        EnumC1232660iBM enumC1232660iBM3 = new EnumC1232660iBM("ONHOLD", 2, "onhold");
        ONHOLD = enumC1232660iBM3;
        EnumC1232660iBM enumC1232660iBM4 = new EnumC1232660iBM("EXPIRED", 3, "expired");
        EXPIRED = enumC1232660iBM4;
        EnumC1232660iBM[] enumC1232660iBMArr = {enumC1232660iBM, enumC1232660iBM2, enumC1232660iBM3, enumC1232660iBM4};
        LLILLJJLI = enumC1232660iBMArr;
        LLILLL = new C2254308sP(enumC1232660iBMArr);
    }

    public static EnumC1232660iBM[] values() {
        return (EnumC1232660iBM[]) LLILLJJLI.clone();
    }

    public final String getValue() {
        return this.LL;
    }

    public static EnumC1232660iBM valueOf(String str) {
        return (EnumC1232660iBM) C08FF.LIZ(EnumC1232660iBM.class, str);
    }

    public EnumC1232660iBM(String str, int i, String str2) {
        this.LL = str2;
    }
}
