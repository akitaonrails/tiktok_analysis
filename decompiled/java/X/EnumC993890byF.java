package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0byF, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class EnumC993890byF {
    public static final EnumC993890byF FILE_EXIST;
    public static final /* synthetic */ EnumC993890byF[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC993890byF NOT_EXIST_AND_EXPIRED;
    public static final EnumC993890byF NOT_EXIST_AND_INVALID;
    public static final EnumC993890byF NOT_EXIST_AND_NOT_EXPIRED;
    public final int LL;

    public static InterfaceC2044707zh<EnumC993890byF> getEntries() {
        return LLILLL;
    }

    static {
        EnumC993890byF enumC993890byF = new EnumC993890byF("FILE_EXIST", 0, 0);
        FILE_EXIST = enumC993890byF;
        EnumC993890byF enumC993890byF2 = new EnumC993890byF("NOT_EXIST_AND_NOT_EXPIRED", 1, 1);
        NOT_EXIST_AND_NOT_EXPIRED = enumC993890byF2;
        EnumC993890byF enumC993890byF3 = new EnumC993890byF("NOT_EXIST_AND_EXPIRED", 2, 2);
        NOT_EXIST_AND_EXPIRED = enumC993890byF3;
        EnumC993890byF enumC993890byF4 = new EnumC993890byF("NOT_EXIST_AND_INVALID", 3, 3);
        NOT_EXIST_AND_INVALID = enumC993890byF4;
        EnumC993890byF[] enumC993890byFArr = {enumC993890byF, enumC993890byF2, enumC993890byF3, enumC993890byF4};
        LLILLJJLI = enumC993890byFArr;
        LLILLL = new C2254308sP(enumC993890byFArr);
    }

    public static EnumC993890byF[] values() {
        return (EnumC993890byF[]) LLILLJJLI.clone();
    }

    public final int getCode() {
        return this.LL;
    }

    public static EnumC993890byF valueOf(String str) {
        return (EnumC993890byF) C08FF.LIZ(EnumC993890byF.class, str);
    }

    public EnumC993890byF(String str, int i, int i2) {
        this.LL = i2;
    }
}
