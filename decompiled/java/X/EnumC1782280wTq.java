package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0wTq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class EnumC1782280wTq {
    public static final EnumC1782280wTq BENEFIT_IMPACT_CARD;
    public static final EnumC1782280wTq LARGE_CARD;
    public static final /* synthetic */ EnumC1782280wTq[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC1782280wTq SMALL_CARD;

    public static InterfaceC2044707zh<EnumC1782280wTq> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC1782280wTq enumC1782280wTq = new EnumC1782280wTq("BENEFIT_IMPACT_CARD", 0);
        BENEFIT_IMPACT_CARD = enumC1782280wTq;
        EnumC1782280wTq enumC1782280wTq2 = new EnumC1782280wTq("LARGE_CARD", 1);
        LARGE_CARD = enumC1782280wTq2;
        EnumC1782280wTq enumC1782280wTq3 = new EnumC1782280wTq("SMALL_CARD", 2);
        SMALL_CARD = enumC1782280wTq3;
        EnumC1782280wTq[] enumC1782280wTqArr = {enumC1782280wTq, enumC1782280wTq2, enumC1782280wTq3};
        LL = enumC1782280wTqArr;
        LLILLJJLI = new C2254308sP(enumC1782280wTqArr);
    }

    public static EnumC1782280wTq[] values() {
        return (EnumC1782280wTq[]) LL.clone();
    }

    public static EnumC1782280wTq valueOf(String str) {
        return (EnumC1782280wTq) C08FF.LIZ(EnumC1782280wTq.class, str);
    }

    public EnumC1782280wTq(String str, int i) {
    }
}
