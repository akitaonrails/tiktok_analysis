package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0Nf7, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class EnumC599390Nf7 {
    public static final EnumC599390Nf7 CREATE_ERROR;
    public static final /* synthetic */ EnumC599390Nf7[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC599390Nf7 LOAD_ERROR;
    public final int LL;

    public static InterfaceC2044707zh<EnumC599390Nf7> getEntries() {
        return LLILLL;
    }

    static {
        EnumC599390Nf7 enumC599390Nf7 = new EnumC599390Nf7("CREATE_ERROR", 0, 1);
        CREATE_ERROR = enumC599390Nf7;
        EnumC599390Nf7 enumC599390Nf72 = new EnumC599390Nf7("LOAD_ERROR", 1, 2);
        LOAD_ERROR = enumC599390Nf72;
        EnumC599390Nf7[] enumC599390Nf7Arr = {enumC599390Nf7, enumC599390Nf72};
        LLILLJJLI = enumC599390Nf7Arr;
        LLILLL = new C2254308sP(enumC599390Nf7Arr);
    }

    public static EnumC599390Nf7[] values() {
        return (EnumC599390Nf7[]) LLILLJJLI.clone();
    }

    public final int getCode() {
        return this.LL;
    }

    public static EnumC599390Nf7 valueOf(String str) {
        return (EnumC599390Nf7) C08FF.LIZ(EnumC599390Nf7.class, str);
    }

    public EnumC599390Nf7(String str, int i, int i2) {
        this.LL = i2;
    }
}
