package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0DFx, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class EnumC336190DFx {
    public static final EnumC336190DFx CANCEL;
    public static final EnumC336190DFx EXCEPTION_ERROR;
    public static final /* synthetic */ EnumC336190DFx[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC336190DFx PAYMENT_ERROR;
    public static final EnumC336190DFx SUCCESS;

    public static InterfaceC2044707zh<EnumC336190DFx> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC336190DFx enumC336190DFx = new EnumC336190DFx("SUCCESS", 0);
        SUCCESS = enumC336190DFx;
        EnumC336190DFx enumC336190DFx2 = new EnumC336190DFx("EXCEPTION_ERROR", 1);
        EXCEPTION_ERROR = enumC336190DFx2;
        EnumC336190DFx enumC336190DFx3 = new EnumC336190DFx("PAYMENT_ERROR", 2);
        PAYMENT_ERROR = enumC336190DFx3;
        EnumC336190DFx enumC336190DFx4 = new EnumC336190DFx("CANCEL", 3);
        CANCEL = enumC336190DFx4;
        EnumC336190DFx[] enumC336190DFxArr = {enumC336190DFx, enumC336190DFx2, enumC336190DFx3, enumC336190DFx4};
        LL = enumC336190DFxArr;
        LLILLJJLI = new C2254308sP(enumC336190DFxArr);
    }

    public static EnumC336190DFx[] values() {
        return (EnumC336190DFx[]) LL.clone();
    }

    public static EnumC336190DFx valueOf(String str) {
        return (EnumC336190DFx) C08FF.LIZ(EnumC336190DFx.class, str);
    }

    public EnumC336190DFx(String str, int i) {
    }
}
