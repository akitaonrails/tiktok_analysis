package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0Hy1, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class EnumC458230Hy1 {
    public static final EnumC458230Hy1 LLILLJJLI;
    public static final EnumC458230Hy1 LLILLL;
    public static final EnumC458230Hy1 LLILZ;
    public static final /* synthetic */ EnumC458230Hy1[] LLILZIL;
    public final String LL;

    static {
        EnumC458230Hy1 enumC458230Hy1 = new EnumC458230Hy1("LONG_PRESS", 0, "long_press");
        LLILLJJLI = enumC458230Hy1;
        EnumC458230Hy1 enumC458230Hy12 = new EnumC458230Hy1("LOCKED", 1, "swipe_up");
        LLILLL = enumC458230Hy12;
        EnumC458230Hy1 enumC458230Hy13 = new EnumC458230Hy1("TAP_TO_LOCK", 2, "tap");
        LLILZ = enumC458230Hy13;
        EnumC458230Hy1[] enumC458230Hy1Arr = {enumC458230Hy1, enumC458230Hy12, enumC458230Hy13};
        LLILZIL = enumC458230Hy1Arr;
        new C2254308sP(enumC458230Hy1Arr);
    }

    public static EnumC458230Hy1[] values() {
        return (EnumC458230Hy1[]) LLILZIL.clone();
    }

    public static EnumC458230Hy1 valueOf(String str) {
        return (EnumC458230Hy1) C08FF.LIZ(EnumC458230Hy1.class, str);
    }

    public EnumC458230Hy1(String str, int i, String str2) {
        this.LL = str2;
    }
}
