package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0bkL, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class EnumC985270bkL {
    public static final /* synthetic */ EnumC985270bkL[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC985270bkL LOADING;
    public static final EnumC985270bkL NOT_READY;
    public static final EnumC985270bkL READY;

    public static InterfaceC2044707zh<EnumC985270bkL> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC985270bkL enumC985270bkL = new EnumC985270bkL("LOADING", 0);
        LOADING = enumC985270bkL;
        EnumC985270bkL enumC985270bkL2 = new EnumC985270bkL("READY", 1);
        READY = enumC985270bkL2;
        EnumC985270bkL enumC985270bkL3 = new EnumC985270bkL("NOT_READY", 2);
        NOT_READY = enumC985270bkL3;
        EnumC985270bkL[] enumC985270bkLArr = {enumC985270bkL, enumC985270bkL2, enumC985270bkL3};
        LL = enumC985270bkLArr;
        LLILLJJLI = new C2254308sP(enumC985270bkLArr);
    }

    public static EnumC985270bkL[] values() {
        return (EnumC985270bkL[]) LL.clone();
    }

    public static EnumC985270bkL valueOf(String str) {
        return (EnumC985270bkL) C08FF.LIZ(EnumC985270bkL.class, str);
    }

    public EnumC985270bkL(String str, int i) {
    }
}
