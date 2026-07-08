package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0Ud4, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class EnumC776480Ud4 {
    public static final /* synthetic */ EnumC776480Ud4[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC776480Ud4 PAGE_PREPARATION;
    public static final EnumC776480Ud4 PAGE_PREVIEW;
    public final String LL;

    public static InterfaceC2044707zh<EnumC776480Ud4> getEntries() {
        return LLILLL;
    }

    static {
        EnumC776480Ud4 enumC776480Ud4 = new EnumC776480Ud4("PAGE_PREVIEW", 0, "screen_share_preview_page");
        PAGE_PREVIEW = enumC776480Ud4;
        EnumC776480Ud4 enumC776480Ud42 = new EnumC776480Ud4("PAGE_PREPARATION", 1, "screen_share_rehearsal_page");
        PAGE_PREPARATION = enumC776480Ud42;
        EnumC776480Ud4[] enumC776480Ud4Arr = {enumC776480Ud4, enumC776480Ud42};
        LLILLJJLI = enumC776480Ud4Arr;
        LLILLL = new C2254308sP(enumC776480Ud4Arr);
    }

    public static EnumC776480Ud4[] values() {
        return (EnumC776480Ud4[]) LLILLJJLI.clone();
    }

    public final String getValue() {
        return this.LL;
    }

    public static EnumC776480Ud4 valueOf(String str) {
        return (EnumC776480Ud4) C08FF.LIZ(EnumC776480Ud4.class, str);
    }

    public EnumC776480Ud4(String str, int i, String str2) {
        this.LL = str2;
    }
}
