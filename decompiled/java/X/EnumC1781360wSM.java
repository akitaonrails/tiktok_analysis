package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0wSM, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class EnumC1781360wSM {
    public static final EnumC1781360wSM ADD_TO_DESKTOP;
    public static final C1781370wSN Companion;
    public static final /* synthetic */ EnumC1781360wSM[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC1781360wSM REVISIT_EDUCATION;
    public final String LL;

    public static InterfaceC2044707zh<EnumC1781360wSM> getEntries() {
        return LLILLL;
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [X.0wSN] */
    static {
        EnumC1781360wSM enumC1781360wSM = new EnumC1781360wSM("REVISIT_EDUCATION", 0, "REVISIT_EDUCATION");
        REVISIT_EDUCATION = enumC1781360wSM;
        EnumC1781360wSM enumC1781360wSM2 = new EnumC1781360wSM("ADD_TO_DESKTOP", 1, "ADD_TO_DESKTOP");
        ADD_TO_DESKTOP = enumC1781360wSM2;
        EnumC1781360wSM[] enumC1781360wSMArr = {enumC1781360wSM, enumC1781360wSM2};
        LLILLJJLI = enumC1781360wSMArr;
        LLILLL = new C2254308sP(enumC1781360wSMArr);
        Companion = new Object() { // from class: X.0wSN
        };
    }

    public static EnumC1781360wSM[] values() {
        return (EnumC1781360wSM[]) LLILLJJLI.clone();
    }

    public final String getServerValue() {
        return this.LL;
    }

    public static EnumC1781360wSM valueOf(String str) {
        return (EnumC1781360wSM) C08FF.LIZ(EnumC1781360wSM.class, str);
    }

    public EnumC1781360wSM(String str, int i, String str2) {
        this.LL = str2;
    }
}
