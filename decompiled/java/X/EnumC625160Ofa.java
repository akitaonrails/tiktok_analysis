package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0Ofa, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class EnumC625160Ofa {
    public static final EnumC625160Ofa FEED_CARD_CLICK;
    public static final /* synthetic */ EnumC625160Ofa[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC625160Ofa NO_NET_WATCH_OFFLINE_VIDEOS_TOAST;
    public static final EnumC625160Ofa WEAK_NET_WATCH_OFFLINE_VIDEOS_TOAST;
    public final String LL;

    public static InterfaceC2044707zh<EnumC625160Ofa> getEntries() {
        return LLILLL;
    }

    static {
        EnumC625160Ofa enumC625160Ofa = new EnumC625160Ofa("WEAK_NET_WATCH_OFFLINE_VIDEOS_TOAST", 0, "weak_net_watch_offline_videos");
        WEAK_NET_WATCH_OFFLINE_VIDEOS_TOAST = enumC625160Ofa;
        EnumC625160Ofa enumC625160Ofa2 = new EnumC625160Ofa("NO_NET_WATCH_OFFLINE_VIDEOS_TOAST", 1, "no_net_watch_offline_videos");
        NO_NET_WATCH_OFFLINE_VIDEOS_TOAST = enumC625160Ofa2;
        EnumC625160Ofa enumC625160Ofa3 = new EnumC625160Ofa("FEED_CARD_CLICK", 2, "feed_card_click");
        FEED_CARD_CLICK = enumC625160Ofa3;
        EnumC625160Ofa[] enumC625160OfaArr = {enumC625160Ofa, enumC625160Ofa2, enumC625160Ofa3};
        LLILLJJLI = enumC625160OfaArr;
        LLILLL = new C2254308sP(enumC625160OfaArr);
    }

    public static EnumC625160Ofa[] values() {
        return (EnumC625160Ofa[]) LLILLJJLI.clone();
    }

    public final String getMobName() {
        return this.LL;
    }

    public static EnumC625160Ofa valueOf(String str) {
        return (EnumC625160Ofa) C08FF.LIZ(EnumC625160Ofa.class, str);
    }

    public EnumC625160Ofa(String str, int i, String str2) {
        this.LL = str2;
    }
}
