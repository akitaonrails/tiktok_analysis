package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0wUw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class EnumC1782960wUw {
    public static final /* synthetic */ EnumC1782960wUw[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC1782960wUw LOAD_FAILED;
    public static final EnumC1782960wUw NOT_INTERNET;
    public static final EnumC1782960wUw SUCCESS;
    public final int LL;

    public static InterfaceC2044707zh<EnumC1782960wUw> getEntries() {
        return LLILLL;
    }

    static {
        EnumC1782960wUw enumC1782960wUw = new EnumC1782960wUw("SUCCESS", 0, 0);
        SUCCESS = enumC1782960wUw;
        EnumC1782960wUw enumC1782960wUw2 = new EnumC1782960wUw("NOT_INTERNET", 1, 1);
        NOT_INTERNET = enumC1782960wUw2;
        EnumC1782960wUw enumC1782960wUw3 = new EnumC1782960wUw("LOAD_FAILED", 2, 2);
        LOAD_FAILED = enumC1782960wUw3;
        EnumC1782960wUw[] enumC1782960wUwArr = {enumC1782960wUw, enumC1782960wUw2, enumC1782960wUw3};
        LLILLJJLI = enumC1782960wUwArr;
        LLILLL = new C2254308sP(enumC1782960wUwArr);
    }

    public static EnumC1782960wUw[] values() {
        return (EnumC1782960wUw[]) LLILLJJLI.clone();
    }

    public final int getValue() {
        return this.LL;
    }

    public static EnumC1782960wUw valueOf(String str) {
        return (EnumC1782960wUw) C08FF.LIZ(EnumC1782960wUw.class, str);
    }

    public EnumC1782960wUw(String str, int i, int i2) {
        this.LL = i2;
    }
}
