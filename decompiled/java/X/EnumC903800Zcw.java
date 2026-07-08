package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0Zcw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class EnumC903800Zcw {
    public static final EnumC903800Zcw FAILED;
    public static final /* synthetic */ EnumC903800Zcw[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC903800Zcw SUCCESS;
    public static final EnumC903800Zcw UNEXPECTED;
    public static final EnumC903800Zcw USER_EXIT;
    public final int LL;

    public static InterfaceC2044707zh<EnumC903800Zcw> getEntries() {
        return LLILLL;
    }

    static {
        EnumC903800Zcw enumC903800Zcw = new EnumC903800Zcw("SUCCESS", 0, 1);
        SUCCESS = enumC903800Zcw;
        EnumC903800Zcw enumC903800Zcw2 = new EnumC903800Zcw("FAILED", 1, 2);
        FAILED = enumC903800Zcw2;
        EnumC903800Zcw enumC903800Zcw3 = new EnumC903800Zcw("USER_EXIT", 2, 3);
        USER_EXIT = enumC903800Zcw3;
        EnumC903800Zcw enumC903800Zcw4 = new EnumC903800Zcw("UNEXPECTED", 3, 4);
        UNEXPECTED = enumC903800Zcw4;
        EnumC903800Zcw[] enumC903800ZcwArr = {enumC903800Zcw, enumC903800Zcw2, enumC903800Zcw3, enumC903800Zcw4};
        LLILLJJLI = enumC903800ZcwArr;
        LLILLL = new C2254308sP(enumC903800ZcwArr);
    }

    public static EnumC903800Zcw[] values() {
        return (EnumC903800Zcw[]) LLILLJJLI.clone();
    }

    public final int getValue() {
        return this.LL;
    }

    public static EnumC903800Zcw valueOf(String str) {
        return (EnumC903800Zcw) C08FF.LIZ(EnumC903800Zcw.class, str);
    }

    public EnumC903800Zcw(String str, int i, int i2) {
        this.LL = i2;
    }
}
