package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0083, reason: invalid class name */
/* JADX INFO: loaded from: classes.dex */
public final class AnonymousClass0083 {
    public static final AnonymousClass0083 HIDE_DIGITAL_WELLBEING_POPUP;
    public static final /* synthetic */ AnonymousClass0083[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final AnonymousClass0083 SHOW_DIGITAL_WELLBEING_POPUP;
    public final String LL;

    public static InterfaceC2044707zh<AnonymousClass0083> getEntries() {
        return LLILLL;
    }

    static {
        AnonymousClass0083 anonymousClass0083 = new AnonymousClass0083("SHOW_DIGITAL_WELLBEING_POPUP", 0, "ShowDigitalWellbeingPopup");
        SHOW_DIGITAL_WELLBEING_POPUP = anonymousClass0083;
        AnonymousClass0083 anonymousClass00832 = new AnonymousClass0083("HIDE_DIGITAL_WELLBEING_POPUP", 1, "HideDigitalWellbeingPopup");
        HIDE_DIGITAL_WELLBEING_POPUP = anonymousClass00832;
        AnonymousClass0083[] anonymousClass0083Arr = {anonymousClass0083, anonymousClass00832};
        LLILLJJLI = anonymousClass0083Arr;
        LLILLL = new C2254308sP(anonymousClass0083Arr);
    }

    public static AnonymousClass0083[] values() {
        return (AnonymousClass0083[]) LLILLJJLI.clone();
    }

    public final String getString() {
        return this.LL;
    }

    public static AnonymousClass0083 valueOf(String str) {
        return (AnonymousClass0083) C08FF.LIZ(AnonymousClass0083.class, str);
    }

    public AnonymousClass0083(String str, int i, String str2) {
        this.LL = str2;
    }
}
