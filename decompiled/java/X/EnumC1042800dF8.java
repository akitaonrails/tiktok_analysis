package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0dF8, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class EnumC1042800dF8 {
    public static final EnumC1042800dF8 GET;
    public static final /* synthetic */ EnumC1042800dF8[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC1042800dF8 POST;

    public static InterfaceC2044707zh<EnumC1042800dF8> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC1042800dF8 enumC1042800dF8 = new EnumC1042800dF8("GET", 0);
        GET = enumC1042800dF8;
        EnumC1042800dF8 enumC1042800dF82 = new EnumC1042800dF8("POST", 1);
        POST = enumC1042800dF82;
        EnumC1042800dF8[] enumC1042800dF8Arr = {enumC1042800dF8, enumC1042800dF82};
        LL = enumC1042800dF8Arr;
        LLILLJJLI = new C2254308sP(enumC1042800dF8Arr);
    }

    public static EnumC1042800dF8[] values() {
        return (EnumC1042800dF8[]) LL.clone();
    }

    public static EnumC1042800dF8 valueOf(String str) {
        return (EnumC1042800dF8) C08FF.LIZ(EnumC1042800dF8.class, str);
    }

    public EnumC1042800dF8(String str, int i) {
    }
}
