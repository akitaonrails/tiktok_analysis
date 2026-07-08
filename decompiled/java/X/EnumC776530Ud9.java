package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0Ud9, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class EnumC776530Ud9 {
    public static final EnumC776530Ud9 AUTO_TEST_RUNNING;
    public static final EnumC776530Ud9 IDLE;
    public static final EnumC776530Ud9 INITIALIZED;
    public static final /* synthetic */ EnumC776530Ud9[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC776530Ud9 MANUAL_TEST_RUNNING;
    public static final EnumC776530Ud9 STOPPED;

    public static InterfaceC2044707zh<EnumC776530Ud9> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC776530Ud9 enumC776530Ud9 = new EnumC776530Ud9("IDLE", 0);
        IDLE = enumC776530Ud9;
        EnumC776530Ud9 enumC776530Ud92 = new EnumC776530Ud9("INITIALIZED", 1);
        INITIALIZED = enumC776530Ud92;
        EnumC776530Ud9 enumC776530Ud93 = new EnumC776530Ud9("AUTO_TEST_RUNNING", 2);
        AUTO_TEST_RUNNING = enumC776530Ud93;
        EnumC776530Ud9 enumC776530Ud94 = new EnumC776530Ud9("MANUAL_TEST_RUNNING", 3);
        MANUAL_TEST_RUNNING = enumC776530Ud94;
        EnumC776530Ud9 enumC776530Ud95 = new EnumC776530Ud9("STOPPED", 4);
        STOPPED = enumC776530Ud95;
        EnumC776530Ud9[] enumC776530Ud9Arr = {enumC776530Ud9, enumC776530Ud92, enumC776530Ud93, enumC776530Ud94, enumC776530Ud95};
        LL = enumC776530Ud9Arr;
        LLILLJJLI = new C2254308sP(enumC776530Ud9Arr);
    }

    public static EnumC776530Ud9[] values() {
        return (EnumC776530Ud9[]) LL.clone();
    }

    public static EnumC776530Ud9 valueOf(String str) {
        return (EnumC776530Ud9) C08FF.LIZ(EnumC776530Ud9.class, str);
    }

    public EnumC776530Ud9(String str, int i) {
    }
}
