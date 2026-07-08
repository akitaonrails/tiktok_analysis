package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0Ezm, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class EnumC382880Ezm {
    public static final EnumC382880Ezm BY_HINT;
    public static final EnumC382880Ezm BY_USER;
    public static final C382950Ezt Companion;
    public static final /* synthetic */ EnumC382880Ezm[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public final int LL;

    public static InterfaceC2044707zh<EnumC382880Ezm> getEntries() {
        return LLILLL;
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [X.0Ezt] */
    static {
        EnumC382880Ezm enumC382880Ezm = new EnumC382880Ezm("BY_HINT", 0, 1);
        BY_HINT = enumC382880Ezm;
        EnumC382880Ezm enumC382880Ezm2 = new EnumC382880Ezm("BY_USER", 1, 0);
        BY_USER = enumC382880Ezm2;
        EnumC382880Ezm[] enumC382880EzmArr = {enumC382880Ezm, enumC382880Ezm2};
        LLILLJJLI = enumC382880EzmArr;
        LLILLL = new C2254308sP(enumC382880EzmArr);
        Companion = new Object() { // from class: X.0Ezt
        };
    }

    public static EnumC382880Ezm[] values() {
        return (EnumC382880Ezm[]) LLILLJJLI.clone();
    }

    public final int getValue() {
        return this.LL;
    }

    public static EnumC382880Ezm valueOf(String str) {
        return (EnumC382880Ezm) C08FF.LIZ(EnumC382880Ezm.class, str);
    }

    public EnumC382880Ezm(String str, int i, int i2) {
        this.LL = i2;
    }
}
