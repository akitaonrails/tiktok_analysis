package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0bfi, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class EnumC982400bfi {
    public static final EnumC982400bfi ALARM;
    public static final EnumC982400bfi FINAL_CALL;
    public static final EnumC982400bfi FINAL_RESULT;
    public static final EnumC982400bfi FINISH;
    public static final /* synthetic */ EnumC982400bfi[] LLILLL;
    public static final /* synthetic */ C2254308sP LLILZ;
    public static final EnumC982400bfi PERFORMING;
    public static final EnumC982400bfi UNKNOWN;
    public final int LL;
    public final String LLILLJJLI;

    public static InterfaceC2044707zh<EnumC982400bfi> getEntries() {
        return LLILZ;
    }

    static {
        EnumC982400bfi enumC982400bfi = new EnumC982400bfi("UNKNOWN", 0, 0, "unknown");
        UNKNOWN = enumC982400bfi;
        EnumC982400bfi enumC982400bfi2 = new EnumC982400bfi("PERFORMING", 1, 1, "performing");
        PERFORMING = enumC982400bfi2;
        EnumC982400bfi enumC982400bfi3 = new EnumC982400bfi("FINAL_CALL", 2, 2, "final_call");
        FINAL_CALL = enumC982400bfi3;
        EnumC982400bfi enumC982400bfi4 = new EnumC982400bfi("ALARM", 3, 3, "alarm");
        ALARM = enumC982400bfi4;
        EnumC982400bfi enumC982400bfi5 = new EnumC982400bfi("FINAL_RESULT", 4, 4, "final_result");
        FINAL_RESULT = enumC982400bfi5;
        EnumC982400bfi enumC982400bfi6 = new EnumC982400bfi("FINISH", 5, 5, "finish");
        FINISH = enumC982400bfi6;
        EnumC982400bfi[] enumC982400bfiArr = {enumC982400bfi, enumC982400bfi2, enumC982400bfi3, enumC982400bfi4, enumC982400bfi5, enumC982400bfi6};
        LLILLL = enumC982400bfiArr;
        LLILZ = new C2254308sP(enumC982400bfiArr);
    }

    public static EnumC982400bfi[] values() {
        return (EnumC982400bfi[]) LLILLL.clone();
    }

    public final int getIndex() {
        return this.LL;
    }

    public final String getValue() {
        return this.LLILLJJLI;
    }

    public static EnumC982400bfi valueOf(String str) {
        return (EnumC982400bfi) C08FF.LIZ(EnumC982400bfi.class, str);
    }

    public EnumC982400bfi(String str, int i, int i2, String str2) {
        this.LL = i2;
        this.LLILLJJLI = str2;
    }
}
