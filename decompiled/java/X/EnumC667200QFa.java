package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0QFa, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class EnumC667200QFa {
    public static final /* synthetic */ EnumC667200QFa[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC667200QFa POWER_PRELOAD;
    public static final EnumC667200QFa TASK;
    public final String LL;

    public static InterfaceC2044707zh<EnumC667200QFa> getEntries() {
        return LLILLL;
    }

    static {
        EnumC667200QFa enumC667200QFa = new EnumC667200QFa("POWER_PRELOAD", 0, "power_preload");
        POWER_PRELOAD = enumC667200QFa;
        EnumC667200QFa enumC667200QFa2 = new EnumC667200QFa("TASK", 1, "task");
        TASK = enumC667200QFa2;
        EnumC667200QFa[] enumC667200QFaArr = {enumC667200QFa, enumC667200QFa2};
        LLILLJJLI = enumC667200QFaArr;
        LLILLL = new C2254308sP(enumC667200QFaArr);
    }

    public static EnumC667200QFa[] values() {
        return (EnumC667200QFa[]) LLILLJJLI.clone();
    }

    public final String getValue() {
        return this.LL;
    }

    public static EnumC667200QFa valueOf(String str) {
        return (EnumC667200QFa) C08FF.LIZ(EnumC667200QFa.class, str);
    }

    public EnumC667200QFa(String str, int i, String str2) {
        this.LL = str2;
    }
}
