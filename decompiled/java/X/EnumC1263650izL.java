package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0izL, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class EnumC1263650izL {
    public static final EnumC1263650izL FULL_SCREEN_AUTH_PAGE;
    public static final EnumC1263650izL FULL_SCREEN_LOADING;
    public static final EnumC1263650izL FULL_SCREEN_RETRY;
    public static final /* synthetic */ EnumC1263650izL[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC1263650izL MUF_COMPLETE;
    public static final EnumC1263650izL MUF_INCOMPLETE;
    public static final EnumC1263650izL UNINITIALIZED;

    public static InterfaceC2044707zh<EnumC1263650izL> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC1263650izL enumC1263650izL = new EnumC1263650izL("UNINITIALIZED", 0);
        UNINITIALIZED = enumC1263650izL;
        EnumC1263650izL enumC1263650izL2 = new EnumC1263650izL("MUF_INCOMPLETE", 1);
        MUF_INCOMPLETE = enumC1263650izL2;
        EnumC1263650izL enumC1263650izL3 = new EnumC1263650izL("MUF_COMPLETE", 2);
        MUF_COMPLETE = enumC1263650izL3;
        EnumC1263650izL enumC1263650izL4 = new EnumC1263650izL("FULL_SCREEN_AUTH_PAGE", 3);
        FULL_SCREEN_AUTH_PAGE = enumC1263650izL4;
        EnumC1263650izL enumC1263650izL5 = new EnumC1263650izL("FULL_SCREEN_LOADING", 4);
        FULL_SCREEN_LOADING = enumC1263650izL5;
        EnumC1263650izL enumC1263650izL6 = new EnumC1263650izL("FULL_SCREEN_RETRY", 5);
        FULL_SCREEN_RETRY = enumC1263650izL6;
        EnumC1263650izL[] enumC1263650izLArr = {enumC1263650izL, enumC1263650izL2, enumC1263650izL3, enumC1263650izL4, enumC1263650izL5, enumC1263650izL6};
        LL = enumC1263650izLArr;
        LLILLJJLI = new C2254308sP(enumC1263650izLArr);
    }

    public static EnumC1263650izL[] values() {
        return (EnumC1263650izL[]) LL.clone();
    }

    public static EnumC1263650izL valueOf(String str) {
        return (EnumC1263650izL) C08FF.LIZ(EnumC1263650izL.class, str);
    }

    public EnumC1263650izL(String str, int i) {
    }
}
