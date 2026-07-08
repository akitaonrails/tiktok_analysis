package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.00Bi, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC037600Bi {
    public static final EnumC037600Bi FAIL;
    public static final EnumC037600Bi FAIL_NO_RETRY;
    public static final EnumC037600Bi IDLE;
    public static final /* synthetic */ EnumC037600Bi[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC037600Bi LOADING;
    public static final EnumC037600Bi SUCC;

    public static InterfaceC2044707zh<EnumC037600Bi> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC037600Bi enumC037600Bi = new EnumC037600Bi("IDLE", 0);
        IDLE = enumC037600Bi;
        EnumC037600Bi enumC037600Bi2 = new EnumC037600Bi("LOADING", 1);
        LOADING = enumC037600Bi2;
        EnumC037600Bi enumC037600Bi3 = new EnumC037600Bi("SUCC", 2);
        SUCC = enumC037600Bi3;
        EnumC037600Bi enumC037600Bi4 = new EnumC037600Bi("FAIL", 3);
        FAIL = enumC037600Bi4;
        EnumC037600Bi enumC037600Bi5 = new EnumC037600Bi("FAIL_NO_RETRY", 4);
        FAIL_NO_RETRY = enumC037600Bi5;
        EnumC037600Bi[] enumC037600BiArr = {enumC037600Bi, enumC037600Bi2, enumC037600Bi3, enumC037600Bi4, enumC037600Bi5};
        LL = enumC037600BiArr;
        LLILLJJLI = new C2254308sP(enumC037600BiArr);
    }

    public static EnumC037600Bi[] values() {
        return (EnumC037600Bi[]) LL.clone();
    }

    public static EnumC037600Bi valueOf(String str) {
        return (EnumC037600Bi) C08FF.LIZ(EnumC037600Bi.class, str);
    }

    public EnumC037600Bi(String str, int i) {
    }
}
