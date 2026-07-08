package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0fBd, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class EnumC1117510fBd {
    public static final C1117540fBg Companion;
    public static final EnumC1117510fBd FANS_CLUB_CELEBRATION_SWITCH_STATUS_DEFAULT;
    public static final EnumC1117510fBd FANS_CLUB_CELEBRATION_SWITCH_STATUS_OFF;
    public static final EnumC1117510fBd FANS_CLUB_CELEBRATION_SWITCH_STATUS_ON;
    public static final /* synthetic */ EnumC1117510fBd[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public final long LL;

    public static InterfaceC2044707zh<EnumC1117510fBd> getEntries() {
        return LLILLL;
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [X.0fBg] */
    static {
        EnumC1117510fBd enumC1117510fBd = new EnumC1117510fBd("FANS_CLUB_CELEBRATION_SWITCH_STATUS_DEFAULT", 0, 0L);
        FANS_CLUB_CELEBRATION_SWITCH_STATUS_DEFAULT = enumC1117510fBd;
        EnumC1117510fBd enumC1117510fBd2 = new EnumC1117510fBd("FANS_CLUB_CELEBRATION_SWITCH_STATUS_ON", 1, 1L);
        FANS_CLUB_CELEBRATION_SWITCH_STATUS_ON = enumC1117510fBd2;
        EnumC1117510fBd enumC1117510fBd3 = new EnumC1117510fBd("FANS_CLUB_CELEBRATION_SWITCH_STATUS_OFF", 2, 2L);
        FANS_CLUB_CELEBRATION_SWITCH_STATUS_OFF = enumC1117510fBd3;
        EnumC1117510fBd[] enumC1117510fBdArr = {enumC1117510fBd, enumC1117510fBd2, enumC1117510fBd3};
        LLILLJJLI = enumC1117510fBdArr;
        LLILLL = new C2254308sP(enumC1117510fBdArr);
        Companion = new Object() { // from class: X.0fBg
        };
    }

    public static EnumC1117510fBd[] values() {
        return (EnumC1117510fBd[]) LLILLJJLI.clone();
    }

    public final long getValue() {
        return this.LL;
    }

    public static EnumC1117510fBd valueOf(String str) {
        return (EnumC1117510fBd) C08FF.LIZ(EnumC1117510fBd.class, str);
    }

    public EnumC1117510fBd(String str, int i, long j) {
        this.LL = j;
    }
}
