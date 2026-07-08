package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0x9q, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class EnumC1808320x9q {
    public static final EnumC1808320x9q AGGRESSIVE_RETRY;
    public static final C1808330x9r Companion;
    public static final EnumC1808320x9q DUPLICATED;
    public static final /* synthetic */ EnumC1808320x9q[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC1808320x9q NORMAL;
    public static final EnumC1808320x9q RETRY;
    public final String LL;

    public static InterfaceC2044707zh<EnumC1808320x9q> getEntries() {
        return LLILLL;
    }

    /* JADX WARN: Type inference failed for: r0v6, types: [X.0x9r] */
    static {
        EnumC1808320x9q enumC1808320x9q = new EnumC1808320x9q("NORMAL", 0, "normal");
        NORMAL = enumC1808320x9q;
        EnumC1808320x9q enumC1808320x9q2 = new EnumC1808320x9q("DUPLICATED", 1, "duplicated");
        DUPLICATED = enumC1808320x9q2;
        EnumC1808320x9q enumC1808320x9q3 = new EnumC1808320x9q("AGGRESSIVE_RETRY", 2, "aggressive_retry");
        AGGRESSIVE_RETRY = enumC1808320x9q3;
        EnumC1808320x9q enumC1808320x9q4 = new EnumC1808320x9q("RETRY", 3, "retry");
        RETRY = enumC1808320x9q4;
        EnumC1808320x9q[] enumC1808320x9qArr = {enumC1808320x9q, enumC1808320x9q2, enumC1808320x9q3, enumC1808320x9q4};
        LLILLJJLI = enumC1808320x9qArr;
        LLILLL = new C2254308sP(enumC1808320x9qArr);
        Companion = new Object() { // from class: X.0x9r
        };
    }

    public static EnumC1808320x9q[] values() {
        return (EnumC1808320x9q[]) LLILLJJLI.clone();
    }

    public final String getType() {
        return this.LL;
    }

    public static EnumC1808320x9q valueOf(String str) {
        return (EnumC1808320x9q) C08FF.LIZ(EnumC1808320x9q.class, str);
    }

    public EnumC1808320x9q(String str, int i, String str2) {
        this.LL = str2;
    }
}
