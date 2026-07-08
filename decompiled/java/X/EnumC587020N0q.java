package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0N0q, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class EnumC587020N0q {
    public static final EnumC587020N0q FEED_CACHE;
    public static final /* synthetic */ EnumC587020N0q[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC587020N0q SKYLIGHT_CACHE;
    public final String LL;

    public static InterfaceC2044707zh<EnumC587020N0q> getEntries() {
        return LLILLL;
    }

    static {
        EnumC587020N0q enumC587020N0q = new EnumC587020N0q("FEED_CACHE", 0, "friends_v3_feed_cache_event");
        FEED_CACHE = enumC587020N0q;
        EnumC587020N0q enumC587020N0q2 = new EnumC587020N0q("SKYLIGHT_CACHE", 1, "friends_v3_skylight_cache_event");
        SKYLIGHT_CACHE = enumC587020N0q2;
        EnumC587020N0q[] enumC587020N0qArr = {enumC587020N0q, enumC587020N0q2};
        LLILLJJLI = enumC587020N0qArr;
        LLILLL = new C2254308sP(enumC587020N0qArr);
    }

    public static EnumC587020N0q[] values() {
        return (EnumC587020N0q[]) LLILLJJLI.clone();
    }

    public final String getEventName() {
        return this.LL;
    }

    public static EnumC587020N0q valueOf(String str) {
        return (EnumC587020N0q) C08FF.LIZ(EnumC587020N0q.class, str);
    }

    public EnumC587020N0q(String str, int i, String str2) {
        this.LL = str2;
    }
}
