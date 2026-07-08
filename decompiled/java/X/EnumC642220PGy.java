package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0PGy, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class EnumC642220PGy {
    public static final EnumC642220PGy DOWN;
    public static final /* synthetic */ EnumC642220PGy[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC642220PGy NORMAL;
    public static final EnumC642220PGy UP;
    public final String LL;

    public static InterfaceC2044707zh<EnumC642220PGy> getEntries() {
        return LLILLL;
    }

    static {
        EnumC642220PGy enumC642220PGy = new EnumC642220PGy("NORMAL", 0, "normal");
        NORMAL = enumC642220PGy;
        EnumC642220PGy enumC642220PGy2 = new EnumC642220PGy("UP", 1, "up");
        UP = enumC642220PGy2;
        EnumC642220PGy enumC642220PGy3 = new EnumC642220PGy("DOWN", 2, "down");
        DOWN = enumC642220PGy3;
        EnumC642220PGy[] enumC642220PGyArr = {enumC642220PGy, enumC642220PGy2, enumC642220PGy3};
        LLILLJJLI = enumC642220PGyArr;
        LLILLL = new C2254308sP(enumC642220PGyArr);
    }

    public static EnumC642220PGy[] values() {
        return (EnumC642220PGy[]) LLILLJJLI.clone();
    }

    public final String getDirectionName() {
        return this.LL;
    }

    public static EnumC642220PGy valueOf(String str) {
        return (EnumC642220PGy) C08FF.LIZ(EnumC642220PGy.class, str);
    }

    public EnumC642220PGy(String str, int i, String str2) {
        this.LL = str2;
    }
}
