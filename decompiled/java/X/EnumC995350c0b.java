package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0c0b, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class EnumC995350c0b {
    public static final /* synthetic */ EnumC995350c0b[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC995350c0b MINI_DRAMA_REPORT_EVENT_TYPE_DRAMA_TAB_VALID_STAY;
    public static final EnumC995350c0b MINI_DRAMA_REPORT_EVENT_TYPE_ENTER_DRAMA_CENTER;
    public static final EnumC995350c0b MINI_DRAMA_REPORT_EVENT_TYPE_ENTER_INNER_FEED;
    public final int LL;

    public static InterfaceC2044707zh<EnumC995350c0b> getEntries() {
        return LLILLL;
    }

    static {
        EnumC995350c0b enumC995350c0b = new EnumC995350c0b("MINI_DRAMA_REPORT_EVENT_TYPE_DRAMA_TAB_VALID_STAY", 0, 1);
        MINI_DRAMA_REPORT_EVENT_TYPE_DRAMA_TAB_VALID_STAY = enumC995350c0b;
        EnumC995350c0b enumC995350c0b2 = new EnumC995350c0b("MINI_DRAMA_REPORT_EVENT_TYPE_ENTER_DRAMA_CENTER", 1, 2);
        MINI_DRAMA_REPORT_EVENT_TYPE_ENTER_DRAMA_CENTER = enumC995350c0b2;
        EnumC995350c0b enumC995350c0b3 = new EnumC995350c0b("MINI_DRAMA_REPORT_EVENT_TYPE_ENTER_INNER_FEED", 2, 3);
        MINI_DRAMA_REPORT_EVENT_TYPE_ENTER_INNER_FEED = enumC995350c0b3;
        EnumC995350c0b[] enumC995350c0bArr = {enumC995350c0b, enumC995350c0b2, enumC995350c0b3};
        LLILLJJLI = enumC995350c0bArr;
        LLILLL = new C2254308sP(enumC995350c0bArr);
    }

    public static EnumC995350c0b[] values() {
        return (EnumC995350c0b[]) LLILLJJLI.clone();
    }

    public final int getValue() {
        return this.LL;
    }

    public static EnumC995350c0b valueOf(String str) {
        return (EnumC995350c0b) C08FF.LIZ(EnumC995350c0b.class, str);
    }

    public EnumC995350c0b(String str, int i, int i2) {
        this.LL = i2;
    }
}
