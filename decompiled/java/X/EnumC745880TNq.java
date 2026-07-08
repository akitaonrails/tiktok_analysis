package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0TNq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class EnumC745880TNq {
    public static final EnumC745880TNq CONTINUE_PAY_PAGE;
    public static final EnumC745880TNq INTRO_PAGE;
    public static final /* synthetic */ EnumC745880TNq[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC745880TNq REMINDER_PAGE;

    public static InterfaceC2044707zh<EnumC745880TNq> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC745880TNq enumC745880TNq = new EnumC745880TNq("INTRO_PAGE", 0);
        INTRO_PAGE = enumC745880TNq;
        EnumC745880TNq enumC745880TNq2 = new EnumC745880TNq("REMINDER_PAGE", 1);
        REMINDER_PAGE = enumC745880TNq2;
        EnumC745880TNq enumC745880TNq3 = new EnumC745880TNq("CONTINUE_PAY_PAGE", 2);
        CONTINUE_PAY_PAGE = enumC745880TNq3;
        EnumC745880TNq[] enumC745880TNqArr = {enumC745880TNq, enumC745880TNq2, enumC745880TNq3};
        LL = enumC745880TNqArr;
        LLILLJJLI = new C2254308sP(enumC745880TNqArr);
    }

    public static EnumC745880TNq[] values() {
        return (EnumC745880TNq[]) LL.clone();
    }

    public final int toMobType() {
        int i = C745890TNr.LIZ[ordinal()];
        if (i == 1) {
            return 4;
        }
        if (i == 2) {
            return 5;
        }
        if (i == 3) {
            return 6;
        }
        throw new C1954807lC();
    }

    public static EnumC745880TNq valueOf(String str) {
        return (EnumC745880TNq) C08FF.LIZ(EnumC745880TNq.class, str);
    }

    public EnumC745880TNq(String str, int i) {
    }
}
