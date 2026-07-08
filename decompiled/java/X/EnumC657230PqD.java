package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0PqD, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class EnumC657230PqD {
    public static final /* synthetic */ EnumC657230PqD[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC657230PqD ONE_LINE;
    public static final EnumC657230PqD TWO_LINES;

    public static InterfaceC2044707zh<EnumC657230PqD> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC657230PqD enumC657230PqD = new EnumC657230PqD("ONE_LINE", 0);
        ONE_LINE = enumC657230PqD;
        EnumC657230PqD enumC657230PqD2 = new EnumC657230PqD("TWO_LINES", 1);
        TWO_LINES = enumC657230PqD2;
        EnumC657230PqD[] enumC657230PqDArr = {enumC657230PqD, enumC657230PqD2};
        LL = enumC657230PqDArr;
        LLILLJJLI = new C2254308sP(enumC657230PqDArr);
    }

    public static EnumC657230PqD[] values() {
        return (EnumC657230PqD[]) LL.clone();
    }

    public static EnumC657230PqD valueOf(String str) {
        return (EnumC657230PqD) C08FF.LIZ(EnumC657230PqD.class, str);
    }

    public EnumC657230PqD(String str, int i) {
    }
}
