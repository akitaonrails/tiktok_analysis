package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0QFf, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class EnumC667250QFf {
    public static final /* synthetic */ EnumC667250QFf[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC667250QFf STATE_CLOSE_SCREEN;
    public static final EnumC667250QFf STATE_FULL_SCREEN;
    public static final EnumC667250QFf STATE_SEVEN_SCREEN;

    public static InterfaceC2044707zh<EnumC667250QFf> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC667250QFf enumC667250QFf = new EnumC667250QFf("STATE_SEVEN_SCREEN", 0);
        STATE_SEVEN_SCREEN = enumC667250QFf;
        EnumC667250QFf enumC667250QFf2 = new EnumC667250QFf("STATE_FULL_SCREEN", 1);
        STATE_FULL_SCREEN = enumC667250QFf2;
        EnumC667250QFf enumC667250QFf3 = new EnumC667250QFf("STATE_CLOSE_SCREEN", 2);
        STATE_CLOSE_SCREEN = enumC667250QFf3;
        EnumC667250QFf[] enumC667250QFfArr = {enumC667250QFf, enumC667250QFf2, enumC667250QFf3};
        LL = enumC667250QFfArr;
        LLILLJJLI = new C2254308sP(enumC667250QFfArr);
    }

    public static EnumC667250QFf[] values() {
        return (EnumC667250QFf[]) LL.clone();
    }

    public static EnumC667250QFf valueOf(String str) {
        return (EnumC667250QFf) C08FF.LIZ(EnumC667250QFf.class, str);
    }

    public EnumC667250QFf(String str, int i) {
    }
}
