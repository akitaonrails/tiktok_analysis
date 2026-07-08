package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0Qcf, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class EnumC674310Qcf {
    public static final EnumC674310Qcf BACK;
    public static final EnumC674310Qcf BACK_FROM_RESULT;
    public static final EnumC674310Qcf ENTER_CHAT;
    public static final /* synthetic */ EnumC674310Qcf[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC674310Qcf SLIDE;
    public static final EnumC674310Qcf SWITCH_TAB;
    public final String LL;

    public static InterfaceC2044707zh<EnumC674310Qcf> getEntries() {
        return LLILLL;
    }

    static {
        EnumC674310Qcf enumC674310Qcf = new EnumC674310Qcf("SWITCH_TAB", 0, "switch_tab");
        SWITCH_TAB = enumC674310Qcf;
        EnumC674310Qcf enumC674310Qcf2 = new EnumC674310Qcf("SLIDE", 1, "slide");
        SLIDE = enumC674310Qcf2;
        EnumC674310Qcf enumC674310Qcf3 = new EnumC674310Qcf("BACK", 2, "back");
        BACK = enumC674310Qcf3;
        EnumC674310Qcf enumC674310Qcf4 = new EnumC674310Qcf("BACK_FROM_RESULT", 3, "back_from_result");
        BACK_FROM_RESULT = enumC674310Qcf4;
        EnumC674310Qcf enumC674310Qcf5 = new EnumC674310Qcf("ENTER_CHAT", 4, "enter_chat");
        ENTER_CHAT = enumC674310Qcf5;
        EnumC674310Qcf[] enumC674310QcfArr = {enumC674310Qcf, enumC674310Qcf2, enumC674310Qcf3, enumC674310Qcf4, enumC674310Qcf5};
        LLILLJJLI = enumC674310QcfArr;
        LLILLL = new C2254308sP(enumC674310QcfArr);
    }

    public static EnumC674310Qcf[] values() {
        return (EnumC674310Qcf[]) LLILLJJLI.clone();
    }

    public final String getReason() {
        return this.LL;
    }

    public static EnumC674310Qcf valueOf(String str) {
        return (EnumC674310Qcf) C08FF.LIZ(EnumC674310Qcf.class, str);
    }

    public EnumC674310Qcf(String str, int i, String str2) {
        this.LL = str2;
    }
}
