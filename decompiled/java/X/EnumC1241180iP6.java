package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0iP6, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class EnumC1241180iP6 {
    public static final EnumC1241180iP6 CANCEL;
    public static final EnumC1241180iP6 ERROR;
    public static final /* synthetic */ EnumC1241180iP6[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC1241180iP6 NONE;
    public static final EnumC1241180iP6 NO_RESULT;
    public static final EnumC1241180iP6 SUCCESS;

    public static InterfaceC2044707zh<EnumC1241180iP6> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC1241180iP6 enumC1241180iP6 = new EnumC1241180iP6("SUCCESS", 0);
        SUCCESS = enumC1241180iP6;
        EnumC1241180iP6 enumC1241180iP62 = new EnumC1241180iP6("ERROR", 1);
        ERROR = enumC1241180iP62;
        EnumC1241180iP6 enumC1241180iP63 = new EnumC1241180iP6("NO_RESULT", 2);
        NO_RESULT = enumC1241180iP63;
        EnumC1241180iP6 enumC1241180iP64 = new EnumC1241180iP6("NONE", 3);
        NONE = enumC1241180iP64;
        EnumC1241180iP6 enumC1241180iP65 = new EnumC1241180iP6("CANCEL", 4);
        CANCEL = enumC1241180iP65;
        EnumC1241180iP6[] enumC1241180iP6Arr = {enumC1241180iP6, enumC1241180iP62, enumC1241180iP63, enumC1241180iP64, enumC1241180iP65};
        LL = enumC1241180iP6Arr;
        LLILLJJLI = new C2254308sP(enumC1241180iP6Arr);
    }

    public static EnumC1241180iP6[] values() {
        return (EnumC1241180iP6[]) LL.clone();
    }

    public static EnumC1241180iP6 valueOf(String str) {
        return (EnumC1241180iP6) C08FF.LIZ(EnumC1241180iP6.class, str);
    }

    public EnumC1241180iP6(String str, int i) {
    }
}
