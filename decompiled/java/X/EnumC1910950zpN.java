package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0zpN, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class EnumC1910950zpN {
    public static final EnumC1910950zpN CONTINUE;
    public static final EnumC1910950zpN END;
    public static final EnumC1910950zpN FAILED;
    public static final EnumC1910950zpN FINISH;
    public static final EnumC1910950zpN INVALID;
    public static final /* synthetic */ EnumC1910950zpN[] LLILLL;
    public static final /* synthetic */ C2254308sP LLILZ;
    public static final EnumC1910950zpN PAUSE;
    public static final EnumC1910950zpN START;
    public final String LL;
    public final int LLILLJJLI;

    public static InterfaceC2044707zh<EnumC1910950zpN> getEntries() {
        return LLILZ;
    }

    static {
        EnumC1910950zpN enumC1910950zpN = new EnumC1910950zpN("INVALID", 0, "invalid", 3);
        INVALID = enumC1910950zpN;
        EnumC1910950zpN enumC1910950zpN2 = new EnumC1910950zpN("PAUSE", 1, "pause", 5);
        PAUSE = enumC1910950zpN2;
        EnumC1910950zpN enumC1910950zpN3 = new EnumC1910950zpN("START", 2, "start", 5);
        START = enumC1910950zpN3;
        EnumC1910950zpN enumC1910950zpN4 = new EnumC1910950zpN("FAILED", 3, "fail", 6);
        FAILED = enumC1910950zpN4;
        EnumC1910950zpN enumC1910950zpN5 = new EnumC1910950zpN("CONTINUE", 4, "continue", 3);
        CONTINUE = enumC1910950zpN5;
        EnumC1910950zpN enumC1910950zpN6 = new EnumC1910950zpN("FINISH", 5, "finish", 3);
        FINISH = enumC1910950zpN6;
        EnumC1910950zpN enumC1910950zpN7 = new EnumC1910950zpN("END", 6, "end", 5);
        END = enumC1910950zpN7;
        EnumC1910950zpN[] enumC1910950zpNArr = {enumC1910950zpN, enumC1910950zpN2, enumC1910950zpN3, enumC1910950zpN4, enumC1910950zpN5, enumC1910950zpN6, enumC1910950zpN7};
        LLILLL = enumC1910950zpNArr;
        LLILZ = new C2254308sP(enumC1910950zpNArr);
    }

    public static EnumC1910950zpN[] values() {
        return (EnumC1910950zpN[]) LLILLL.clone();
    }

    public final String getDescribe() {
        return this.LL;
    }

    public final int getLogLevel() {
        return this.LLILLJJLI;
    }

    public static EnumC1910950zpN valueOf(String str) {
        return (EnumC1910950zpN) C08FF.LIZ(EnumC1910950zpN.class, str);
    }

    public EnumC1910950zpN(String str, int i, String str2, int i2) {
        this.LL = str2;
        this.LLILLJJLI = i2;
    }
}
