package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0aht, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class EnumC945310aht {
    public static final EnumC945310aht COMMON_FEED;
    public static final EnumC945310aht LIVE_ROOM;
    public static final /* synthetic */ EnumC945310aht[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC945310aht PREVIEW_LIVE;
    public static final EnumC945310aht SEARCH;
    public final String LL;

    public static InterfaceC2044707zh<EnumC945310aht> getEntries() {
        return LLILLL;
    }

    static {
        EnumC945310aht enumC945310aht = new EnumC945310aht("COMMON_FEED", 0, "common_feed");
        COMMON_FEED = enumC945310aht;
        EnumC945310aht enumC945310aht2 = new EnumC945310aht("LIVE_ROOM", 1, "live_room");
        LIVE_ROOM = enumC945310aht2;
        EnumC945310aht enumC945310aht3 = new EnumC945310aht("SEARCH", 2, "search");
        SEARCH = enumC945310aht3;
        EnumC945310aht enumC945310aht4 = new EnumC945310aht("PREVIEW_LIVE", 3, "preview_live");
        PREVIEW_LIVE = enumC945310aht4;
        EnumC945310aht[] enumC945310ahtArr = {enumC945310aht, enumC945310aht2, enumC945310aht3, enumC945310aht4};
        LLILLJJLI = enumC945310ahtArr;
        LLILLL = new C2254308sP(enumC945310ahtArr);
    }

    public static EnumC945310aht[] values() {
        return (EnumC945310aht[]) LLILLJJLI.clone();
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.LL;
    }

    public static EnumC945310aht valueOf(String str) {
        return (EnumC945310aht) C08FF.LIZ(EnumC945310aht.class, str);
    }

    public EnumC945310aht(String str, int i, String str2) {
        this.LL = str2;
    }
}
