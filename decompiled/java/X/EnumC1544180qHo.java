package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0qHo, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class EnumC1544180qHo {
    public static final EnumC1544180qHo BACKGROUND_THREAD;
    public static final EnumC1544180qHo CPU_THREAD;
    public static final EnumC1544180qHo CURRENT_THREAD;
    public static final EnumC1544180qHo IO_THREAD;
    public static final /* synthetic */ EnumC1544180qHo[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC1544180qHo MAIN_THREAD;
    public static final EnumC1544180qHo MAIN_THREAD_IMMEDIATE;
    public static final EnumC1544180qHo NORMAL_THREAD;
    public static final EnumC1544180qHo SERIAL_THREAD;

    public static InterfaceC2044707zh<EnumC1544180qHo> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC1544180qHo enumC1544180qHo = new EnumC1544180qHo("CURRENT_THREAD", 0);
        CURRENT_THREAD = enumC1544180qHo;
        EnumC1544180qHo enumC1544180qHo2 = new EnumC1544180qHo("MAIN_THREAD", 1);
        MAIN_THREAD = enumC1544180qHo2;
        EnumC1544180qHo enumC1544180qHo3 = new EnumC1544180qHo("MAIN_THREAD_IMMEDIATE", 2);
        MAIN_THREAD_IMMEDIATE = enumC1544180qHo3;
        EnumC1544180qHo enumC1544180qHo4 = new EnumC1544180qHo("BACKGROUND_THREAD", 3);
        BACKGROUND_THREAD = enumC1544180qHo4;
        EnumC1544180qHo enumC1544180qHo5 = new EnumC1544180qHo("IO_THREAD", 4);
        IO_THREAD = enumC1544180qHo5;
        EnumC1544180qHo enumC1544180qHo6 = new EnumC1544180qHo("NORMAL_THREAD", 5);
        NORMAL_THREAD = enumC1544180qHo6;
        EnumC1544180qHo enumC1544180qHo7 = new EnumC1544180qHo("CPU_THREAD", 6);
        CPU_THREAD = enumC1544180qHo7;
        EnumC1544180qHo enumC1544180qHo8 = new EnumC1544180qHo("SERIAL_THREAD", 7);
        SERIAL_THREAD = enumC1544180qHo8;
        EnumC1544180qHo[] enumC1544180qHoArr = {enumC1544180qHo, enumC1544180qHo2, enumC1544180qHo3, enumC1544180qHo4, enumC1544180qHo5, enumC1544180qHo6, enumC1544180qHo7, enumC1544180qHo8};
        LL = enumC1544180qHoArr;
        LLILLJJLI = new C2254308sP(enumC1544180qHoArr);
    }

    public static EnumC1544180qHo[] values() {
        return (EnumC1544180qHo[]) LL.clone();
    }

    public static EnumC1544180qHo valueOf(String str) {
        return (EnumC1544180qHo) C08FF.LIZ(EnumC1544180qHo.class, str);
    }

    public EnumC1544180qHo(String str, int i) {
    }
}
