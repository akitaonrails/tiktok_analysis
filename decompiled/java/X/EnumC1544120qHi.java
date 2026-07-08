package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0qHi, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class EnumC1544120qHi {
    public static final EnumC1544120qHi LL;
    public static final EnumC1544120qHi LLILLJJLI;
    public static final EnumC1544120qHi LLILLL;
    public static final EnumC1544120qHi LLILZ;
    public static final EnumC1544120qHi LLILZIL;
    public static final EnumC1544120qHi LLILZLL;
    public static final EnumC1544120qHi LLIZ;
    public static final EnumC1544120qHi LLIZLLLIL;
    public static final /* synthetic */ EnumC1544120qHi[] LLJ;

    static {
        EnumC1544120qHi enumC1544120qHi = new EnumC1544120qHi("LYNX_THREAD", 0);
        LL = enumC1544120qHi;
        EnumC1544120qHi enumC1544120qHi2 = new EnumC1544120qHi("TT_NORMAL_THREAD", 1);
        LLILLJJLI = enumC1544120qHi2;
        EnumC1544120qHi enumC1544120qHi3 = new EnumC1544120qHi("TT_CPU_THREAD", 2);
        LLILLL = enumC1544120qHi3;
        EnumC1544120qHi enumC1544120qHi4 = new EnumC1544120qHi("TT_IO_THREAD", 3);
        LLILZ = enumC1544120qHi4;
        EnumC1544120qHi enumC1544120qHi5 = new EnumC1544120qHi("TT_SERIAL_THREAD", 4);
        LLILZIL = enumC1544120qHi5;
        EnumC1544120qHi enumC1544120qHi6 = new EnumC1544120qHi("TT_BACKGROUND_THREAD", 5);
        LLILZLL = enumC1544120qHi6;
        EnumC1544120qHi enumC1544120qHi7 = new EnumC1544120qHi("MAIN_THREAD", 6);
        LLIZ = enumC1544120qHi7;
        EnumC1544120qHi enumC1544120qHi8 = new EnumC1544120qHi("MAIN_THREAD_IMMEDIATE", 7);
        LLIZLLLIL = enumC1544120qHi8;
        EnumC1544120qHi[] enumC1544120qHiArr = {enumC1544120qHi, enumC1544120qHi2, enumC1544120qHi3, enumC1544120qHi4, enumC1544120qHi5, enumC1544120qHi6, enumC1544120qHi7, enumC1544120qHi8};
        LLJ = enumC1544120qHiArr;
        new C2254308sP(enumC1544120qHiArr);
    }

    public static EnumC1544120qHi[] values() {
        return (EnumC1544120qHi[]) LLJ.clone();
    }

    public static EnumC1544120qHi valueOf(String str) {
        return (EnumC1544120qHi) C08FF.LIZ(EnumC1544120qHi.class, str);
    }

    public EnumC1544120qHi(String str, int i) {
    }
}
