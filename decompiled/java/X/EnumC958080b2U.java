package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0b2U, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class EnumC958080b2U {
    public static final /* synthetic */ EnumC958080b2U[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC958080b2U TAKE_STAGE_EXIT;
    public static final EnumC958080b2U TAKE_STAGE_FINAL_CALL;
    public static final EnumC958080b2U TAKE_STAGE_PERFORM;
    public static final EnumC958080b2U TAKE_STAGE_RESULT;

    public static InterfaceC2044707zh<EnumC958080b2U> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC958080b2U enumC958080b2U = new EnumC958080b2U("TAKE_STAGE_PERFORM", 0);
        TAKE_STAGE_PERFORM = enumC958080b2U;
        EnumC958080b2U enumC958080b2U2 = new EnumC958080b2U("TAKE_STAGE_FINAL_CALL", 1);
        TAKE_STAGE_FINAL_CALL = enumC958080b2U2;
        EnumC958080b2U enumC958080b2U3 = new EnumC958080b2U("TAKE_STAGE_RESULT", 2);
        TAKE_STAGE_RESULT = enumC958080b2U3;
        EnumC958080b2U enumC958080b2U4 = new EnumC958080b2U("TAKE_STAGE_EXIT", 3);
        TAKE_STAGE_EXIT = enumC958080b2U4;
        EnumC958080b2U[] enumC958080b2UArr = {enumC958080b2U, enumC958080b2U2, enumC958080b2U3, enumC958080b2U4};
        LL = enumC958080b2UArr;
        LLILLJJLI = new C2254308sP(enumC958080b2UArr);
    }

    public static EnumC958080b2U[] values() {
        return (EnumC958080b2U[]) LL.clone();
    }

    public static EnumC958080b2U valueOf(String str) {
        return (EnumC958080b2U) C08FF.LIZ(EnumC958080b2U.class, str);
    }

    public EnumC958080b2U(String str, int i) {
    }
}
