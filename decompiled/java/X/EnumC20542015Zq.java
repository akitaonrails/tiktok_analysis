package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.15Zq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public final class EnumC20542015Zq {
    public static final EnumC20542015Zq BREATHING_DONE;
    public static final EnumC20542015Zq BREATHING_EXHALE;
    public static final EnumC20542015Zq BREATHING_HOLD;
    public static final EnumC20542015Zq BREATHING_INHALE;
    public static final EnumC20542015Zq BREATHING_RELAX;
    public static final C20543715a7 Companion;
    public static final EnumC20542015Zq INTRO;
    public static final EnumC20542015Zq INTRO_AFTER_BREATHING;
    public static final /* synthetic */ EnumC20542015Zq[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public final int LL;

    public static InterfaceC2044707zh<EnumC20542015Zq> getEntries() {
        return LLILLL;
    }

    /* JADX WARN: Type inference failed for: r0v9, types: [X.15a7] */
    static {
        EnumC20542015Zq enumC20542015Zq = new EnumC20542015Zq("INTRO", 0, 0);
        INTRO = enumC20542015Zq;
        EnumC20542015Zq enumC20542015Zq2 = new EnumC20542015Zq("BREATHING_RELAX", 1, 1);
        BREATHING_RELAX = enumC20542015Zq2;
        EnumC20542015Zq enumC20542015Zq3 = new EnumC20542015Zq("BREATHING_INHALE", 2, 2);
        BREATHING_INHALE = enumC20542015Zq3;
        EnumC20542015Zq enumC20542015Zq4 = new EnumC20542015Zq("BREATHING_HOLD", 3, 3);
        BREATHING_HOLD = enumC20542015Zq4;
        EnumC20542015Zq enumC20542015Zq5 = new EnumC20542015Zq("BREATHING_EXHALE", 4, 4);
        BREATHING_EXHALE = enumC20542015Zq5;
        EnumC20542015Zq enumC20542015Zq6 = new EnumC20542015Zq("BREATHING_DONE", 5, 5);
        BREATHING_DONE = enumC20542015Zq6;
        EnumC20542015Zq enumC20542015Zq7 = new EnumC20542015Zq("INTRO_AFTER_BREATHING", 6, 6);
        INTRO_AFTER_BREATHING = enumC20542015Zq7;
        EnumC20542015Zq[] enumC20542015ZqArr = {enumC20542015Zq, enumC20542015Zq2, enumC20542015Zq3, enumC20542015Zq4, enumC20542015Zq5, enumC20542015Zq6, enumC20542015Zq7};
        LLILLJJLI = enumC20542015ZqArr;
        LLILLL = new C2254308sP(enumC20542015ZqArr);
        Companion = new Object() { // from class: X.15a7
        };
    }

    public static EnumC20542015Zq[] values() {
        return (EnumC20542015Zq[]) LLILLJJLI.clone();
    }

    public final int getValue() {
        return this.LL;
    }

    public static EnumC20542015Zq valueOf(String str) {
        return (EnumC20542015Zq) C08FF.LIZ(EnumC20542015Zq.class, str);
    }

    public EnumC20542015Zq(String str, int i, int i2) {
        this.LL = i2;
    }
}
