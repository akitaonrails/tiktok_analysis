package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0QdE, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class EnumC674660QdE {
    public static final EnumC674660QdE AUTO_NO_SPEECH;
    public static final EnumC674660QdE AUTO_SILENCE;
    public static final EnumC674660QdE LEAVE_PAGE;
    public static final /* synthetic */ EnumC674660QdE[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC674660QdE MANUAL_STOP;
    public static final EnumC674660QdE SWITCH_TAB;
    public static final EnumC674660QdE SYSTEM_INTERRUPT;
    public static final EnumC674660QdE TIMEOUT;
    public final String LL;

    public static InterfaceC2044707zh<EnumC674660QdE> getEntries() {
        return LLILLL;
    }

    static {
        EnumC674660QdE enumC674660QdE = new EnumC674660QdE("MANUAL_STOP", 0, "manual_stop");
        MANUAL_STOP = enumC674660QdE;
        EnumC674660QdE enumC674660QdE2 = new EnumC674660QdE("AUTO_NO_SPEECH", 1, "auto_no_speech");
        AUTO_NO_SPEECH = enumC674660QdE2;
        EnumC674660QdE enumC674660QdE3 = new EnumC674660QdE("AUTO_SILENCE", 2, "auto_silence");
        AUTO_SILENCE = enumC674660QdE3;
        EnumC674660QdE enumC674660QdE4 = new EnumC674660QdE("TIMEOUT", 3, "timeout");
        TIMEOUT = enumC674660QdE4;
        EnumC674660QdE enumC674660QdE5 = new EnumC674660QdE("SWITCH_TAB", 4, "switch_tab");
        SWITCH_TAB = enumC674660QdE5;
        EnumC674660QdE enumC674660QdE6 = new EnumC674660QdE("SYSTEM_INTERRUPT", 5, "system_interrupt");
        SYSTEM_INTERRUPT = enumC674660QdE6;
        EnumC674660QdE enumC674660QdE7 = new EnumC674660QdE("LEAVE_PAGE", 6, "leave_page");
        LEAVE_PAGE = enumC674660QdE7;
        EnumC674660QdE[] enumC674660QdEArr = {enumC674660QdE, enumC674660QdE2, enumC674660QdE3, enumC674660QdE4, enumC674660QdE5, enumC674660QdE6, enumC674660QdE7};
        LLILLJJLI = enumC674660QdEArr;
        LLILLL = new C2254308sP(enumC674660QdEArr);
    }

    public static EnumC674660QdE[] values() {
        return (EnumC674660QdE[]) LLILLJJLI.clone();
    }

    public final String getReason() {
        return this.LL;
    }

    public static EnumC674660QdE valueOf(String str) {
        return (EnumC674660QdE) C08FF.LIZ(EnumC674660QdE.class, str);
    }

    public EnumC674660QdE(String str, int i, String str2) {
        this.LL = str2;
    }
}
