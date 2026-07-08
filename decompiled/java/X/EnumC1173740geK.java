package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0geK, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class EnumC1173740geK {
    public static final EnumC1173740geK CALENDAR;
    public static final EnumC1173740geK LIST;
    public static final /* synthetic */ EnumC1173740geK[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC1173740geK THOUGHT;
    public final String LL;

    public static InterfaceC2044707zh<EnumC1173740geK> getEntries() {
        return LLILLL;
    }

    static {
        EnumC1173740geK enumC1173740geK = new EnumC1173740geK("LIST", 0, "story_archive_v2_list");
        LIST = enumC1173740geK;
        EnumC1173740geK enumC1173740geK2 = new EnumC1173740geK("THOUGHT", 1, "story_archive_v2_thought");
        THOUGHT = enumC1173740geK2;
        EnumC1173740geK enumC1173740geK3 = new EnumC1173740geK("CALENDAR", 2, "story_archive_v2_calendar");
        CALENDAR = enumC1173740geK3;
        EnumC1173740geK[] enumC1173740geKArr = {enumC1173740geK, enumC1173740geK2, enumC1173740geK3};
        LLILLJJLI = enumC1173740geKArr;
        LLILLL = new C2254308sP(enumC1173740geKArr);
    }

    public static EnumC1173740geK[] values() {
        return (EnumC1173740geK[]) LLILLJJLI.clone();
    }

    public final String getPageKey() {
        return this.LL;
    }

    public static EnumC1173740geK valueOf(String str) {
        return (EnumC1173740geK) C08FF.LIZ(EnumC1173740geK.class, str);
    }

    public EnumC1173740geK(String str, int i, String str2) {
        this.LL = str2;
    }
}
