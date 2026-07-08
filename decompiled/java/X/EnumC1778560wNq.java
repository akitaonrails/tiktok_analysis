package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0wNq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class EnumC1778560wNq {
    public static final EnumC1778560wNq CANCEL;
    public static final EnumC1778560wNq DEVICE_BLOCK;
    public static final EnumC1778560wNq ERROR;
    public static final /* synthetic */ EnumC1778560wNq[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC1778560wNq UNDER_AGE;

    public static InterfaceC2044707zh<EnumC1778560wNq> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC1778560wNq enumC1778560wNq = new EnumC1778560wNq("UNDER_AGE", 0);
        UNDER_AGE = enumC1778560wNq;
        EnumC1778560wNq enumC1778560wNq2 = new EnumC1778560wNq("DEVICE_BLOCK", 1);
        DEVICE_BLOCK = enumC1778560wNq2;
        EnumC1778560wNq enumC1778560wNq3 = new EnumC1778560wNq("ERROR", 2);
        ERROR = enumC1778560wNq3;
        EnumC1778560wNq enumC1778560wNq4 = new EnumC1778560wNq("CANCEL", 3);
        CANCEL = enumC1778560wNq4;
        EnumC1778560wNq[] enumC1778560wNqArr = {enumC1778560wNq, enumC1778560wNq2, enumC1778560wNq3, enumC1778560wNq4};
        LL = enumC1778560wNqArr;
        LLILLJJLI = new C2254308sP(enumC1778560wNqArr);
    }

    public static EnumC1778560wNq[] values() {
        return (EnumC1778560wNq[]) LL.clone();
    }

    public static EnumC1778560wNq valueOf(String str) {
        return (EnumC1778560wNq) C08FF.LIZ(EnumC1778560wNq.class, str);
    }

    public EnumC1778560wNq(String str, int i) {
    }
}
