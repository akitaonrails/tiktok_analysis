package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0Lgf, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class EnumC549390Lgf {
    public static final C549400Lgg Companion;
    public static final EnumC549390Lgf DEFAULT;
    public static final EnumC549390Lgf FRIENDS;
    public static final /* synthetic */ EnumC549390Lgf[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC549390Lgf PRIVATE;
    public static final EnumC549390Lgf PUBLIC;
    public final int LL;

    public static InterfaceC2044707zh<EnumC549390Lgf> getEntries() {
        return LLILLL;
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [X.0Lgg] */
    static {
        EnumC549390Lgf enumC549390Lgf = new EnumC549390Lgf("FRIENDS", 0, 1);
        FRIENDS = enumC549390Lgf;
        EnumC549390Lgf enumC549390Lgf2 = new EnumC549390Lgf("PUBLIC", 1, 0);
        PUBLIC = enumC549390Lgf2;
        EnumC549390Lgf enumC549390Lgf3 = new EnumC549390Lgf("PRIVATE", 2, 2);
        PRIVATE = enumC549390Lgf3;
        EnumC549390Lgf[] enumC549390LgfArr = {enumC549390Lgf, enumC549390Lgf2, enumC549390Lgf3};
        LLILLJJLI = enumC549390LgfArr;
        LLILLL = new C2254308sP(enumC549390LgfArr);
        Companion = new Object() { // from class: X.0Lgg
        };
        DEFAULT = enumC549390Lgf;
    }

    public static EnumC549390Lgf[] values() {
        return (EnumC549390Lgf[]) LLILLJJLI.clone();
    }

    public final int getCode() {
        return this.LL;
    }

    public static EnumC549390Lgf valueOf(String str) {
        return (EnumC549390Lgf) C08FF.LIZ(EnumC549390Lgf.class, str);
    }

    public EnumC549390Lgf(String str, int i, int i2) {
        this.LL = i2;
    }
}
