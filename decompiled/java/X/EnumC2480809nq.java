package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.09nq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class EnumC2480809nq {
    public static final EnumC2480809nq LL;
    public static final EnumC2480809nq LLILLJJLI;
    public static final EnumC2480809nq LLILLL;
    public static final EnumC2480809nq LLILZ;
    public static final EnumC2480809nq LLILZIL;
    public static final EnumC2480809nq LLILZLL;
    public static final EnumC2480809nq LLIZ;
    public static final /* synthetic */ EnumC2480809nq[] LLIZLLLIL;

    static {
        EnumC2480809nq enumC2480809nq = new EnumC2480809nq("IDLE", 0);
        LL = enumC2480809nq;
        EnumC2480809nq enumC2480809nq2 = new EnumC2480809nq("LOADING", 1);
        LLILLJJLI = enumC2480809nq2;
        EnumC2480809nq enumC2480809nq3 = new EnumC2480809nq("LOADED", 2);
        LLILLL = enumC2480809nq3;
        EnumC2480809nq enumC2480809nq4 = new EnumC2480809nq("ANIMATING", 3);
        LLILZ = enumC2480809nq4;
        EnumC2480809nq enumC2480809nq5 = new EnumC2480809nq("AWAITING_SYNC", 4);
        LLILZIL = enumC2480809nq5;
        EnumC2480809nq enumC2480809nq6 = new EnumC2480809nq("FINISHED", 5);
        LLILZLL = enumC2480809nq6;
        EnumC2480809nq enumC2480809nq7 = new EnumC2480809nq("FAILED", 6);
        LLIZ = enumC2480809nq7;
        EnumC2480809nq[] enumC2480809nqArr = {enumC2480809nq, enumC2480809nq2, enumC2480809nq3, enumC2480809nq4, enumC2480809nq5, enumC2480809nq6, enumC2480809nq7};
        LLIZLLLIL = enumC2480809nqArr;
        new C2254308sP(enumC2480809nqArr);
    }

    public static EnumC2480809nq[] values() {
        return (EnumC2480809nq[]) LLIZLLLIL.clone();
    }

    public static EnumC2480809nq valueOf(String str) {
        return (EnumC2480809nq) C08FF.LIZ(EnumC2480809nq.class, str);
    }

    public EnumC2480809nq(String str, int i) {
    }
}
