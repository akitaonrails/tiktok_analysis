package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0e2M, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class EnumC1073320e2M {
    public static final EnumC1073320e2M FYP;
    public static final EnumC1073320e2M INBOX_AND_ME_TAB;
    public static final /* synthetic */ EnumC1073320e2M[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC1073320e2M SOCIAL_RELEVANT_EVENT;
    public static final EnumC1073320e2M UNKNOWN;
    public final int LL;

    public static InterfaceC2044707zh<EnumC1073320e2M> getEntries() {
        return LLILLL;
    }

    static {
        EnumC1073320e2M enumC1073320e2M = new EnumC1073320e2M("UNKNOWN", 0, 0);
        UNKNOWN = enumC1073320e2M;
        EnumC1073320e2M enumC1073320e2M2 = new EnumC1073320e2M("FYP", 1, 1);
        FYP = enumC1073320e2M2;
        EnumC1073320e2M enumC1073320e2M3 = new EnumC1073320e2M("INBOX_AND_ME_TAB", 2, 2);
        INBOX_AND_ME_TAB = enumC1073320e2M3;
        EnumC1073320e2M enumC1073320e2M4 = new EnumC1073320e2M("SOCIAL_RELEVANT_EVENT", 3, 3);
        SOCIAL_RELEVANT_EVENT = enumC1073320e2M4;
        EnumC1073320e2M[] enumC1073320e2MArr = {enumC1073320e2M, enumC1073320e2M2, enumC1073320e2M3, enumC1073320e2M4};
        LLILLJJLI = enumC1073320e2MArr;
        LLILLL = new C2254308sP(enumC1073320e2MArr);
    }

    public static EnumC1073320e2M[] values() {
        return (EnumC1073320e2M[]) LLILLJJLI.clone();
    }

    public final int getValue() {
        return this.LL;
    }

    public static EnumC1073320e2M valueOf(String str) {
        return (EnumC1073320e2M) C08FF.LIZ(EnumC1073320e2M.class, str);
    }

    public EnumC1073320e2M(String str, int i, int i2) {
        this.LL = i2;
    }
}
