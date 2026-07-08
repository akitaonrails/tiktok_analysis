package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.1BZM, reason: invalid class name */
/* JADX INFO: loaded from: classes35.dex */
public final class C1BZM {
    public static final C1BZM ENABLE_DOWN_LOGGER;
    public static final C1BZM ENABLE_DOWN_TEA;
    public static final C1BZM ENABLE_DOWN_VLM_EXE;
    public static final C1BZM ENABLE_UP_CTL;
    public static final /* synthetic */ C1BZM[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public final int LL;

    public static InterfaceC2044707zh<C1BZM> getEntries() {
        return LLILLL;
    }

    static {
        C1BZM c1bzm = new C1BZM("ENABLE_UP_CTL", 0, 1);
        ENABLE_UP_CTL = c1bzm;
        C1BZM c1bzm2 = new C1BZM("ENABLE_DOWN_LOGGER", 1, 2);
        ENABLE_DOWN_LOGGER = c1bzm2;
        C1BZM c1bzm3 = new C1BZM("ENABLE_DOWN_TEA", 2, 4);
        ENABLE_DOWN_TEA = c1bzm3;
        C1BZM c1bzm4 = new C1BZM("ENABLE_DOWN_VLM_EXE", 3, 8);
        ENABLE_DOWN_VLM_EXE = c1bzm4;
        C1BZM[] c1bzmArr = {c1bzm, c1bzm2, c1bzm3, c1bzm4};
        LLILLJJLI = c1bzmArr;
        LLILLL = new C2254308sP(c1bzmArr);
    }

    public static C1BZM[] values() {
        return (C1BZM[]) LLILLJJLI.clone();
    }

    public final int getValue() {
        return this.LL;
    }

    public static C1BZM valueOf(String str) {
        return (C1BZM) C08FF.LIZ(C1BZM.class, str);
    }

    public C1BZM(String str, int i, int i2) {
        this.LL = i2;
    }
}
