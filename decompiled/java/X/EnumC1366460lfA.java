package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0lfA, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class EnumC1366460lfA {
    public static final EnumC1366460lfA AUTO_DISMISS;
    public static final EnumC1366460lfA CLICK_ACTION;
    public static final EnumC1366460lfA CLICK_DISMISS;
    public static final /* synthetic */ EnumC1366460lfA[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;

    public static InterfaceC2044707zh<EnumC1366460lfA> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC1366460lfA enumC1366460lfA = new EnumC1366460lfA("CLICK_ACTION", 0);
        CLICK_ACTION = enumC1366460lfA;
        EnumC1366460lfA enumC1366460lfA2 = new EnumC1366460lfA("AUTO_DISMISS", 1);
        AUTO_DISMISS = enumC1366460lfA2;
        EnumC1366460lfA enumC1366460lfA3 = new EnumC1366460lfA("CLICK_DISMISS", 2);
        CLICK_DISMISS = enumC1366460lfA3;
        EnumC1366460lfA[] enumC1366460lfAArr = {enumC1366460lfA, enumC1366460lfA2, enumC1366460lfA3};
        LL = enumC1366460lfAArr;
        LLILLJJLI = new C2254308sP(enumC1366460lfAArr);
    }

    public static EnumC1366460lfA[] values() {
        return (EnumC1366460lfA[]) LL.clone();
    }

    public static EnumC1366460lfA valueOf(String str) {
        return (EnumC1366460lfA) C08FF.LIZ(EnumC1366460lfA.class, str);
    }

    public EnumC1366460lfA(String str, int i) {
    }
}
