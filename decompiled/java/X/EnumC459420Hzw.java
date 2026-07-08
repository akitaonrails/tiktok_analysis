package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0Hzw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class EnumC459420Hzw {
    public static final EnumC459420Hzw EMPTY;
    public static final EnumC459420Hzw ERROR;
    public static final EnumC459420Hzw INITIAL;
    public static final /* synthetic */ EnumC459420Hzw[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public final int LL;

    public static InterfaceC2044707zh<EnumC459420Hzw> getEntries() {
        return LLILLL;
    }

    static {
        EnumC459420Hzw enumC459420Hzw = new EnumC459420Hzw("EMPTY", 0, 0);
        EMPTY = enumC459420Hzw;
        EnumC459420Hzw enumC459420Hzw2 = new EnumC459420Hzw("INITIAL", 1, -1);
        INITIAL = enumC459420Hzw2;
        EnumC459420Hzw enumC459420Hzw3 = new EnumC459420Hzw("ERROR", 2, -2);
        ERROR = enumC459420Hzw3;
        EnumC459420Hzw[] enumC459420HzwArr = {enumC459420Hzw, enumC459420Hzw2, enumC459420Hzw3};
        LLILLJJLI = enumC459420HzwArr;
        LLILLL = new C2254308sP(enumC459420HzwArr);
    }

    public static EnumC459420Hzw[] values() {
        return (EnumC459420Hzw[]) LLILLJJLI.clone();
    }

    public final int getValue() {
        return this.LL;
    }

    public static EnumC459420Hzw valueOf(String str) {
        return (EnumC459420Hzw) C08FF.LIZ(EnumC459420Hzw.class, str);
    }

    public EnumC459420Hzw(String str, int i, int i2) {
        this.LL = i2;
    }
}
