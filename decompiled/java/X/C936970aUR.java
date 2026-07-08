package X;

/* JADX INFO: renamed from: X.0aUR, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C936970aUR {
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static final EnumC936960aUQ LIZ(String str) {
        switch (str.hashCode()) {
            case -1929069240:
                if (str.equals("shared_background")) {
                    return EnumC936960aUQ.WALLPAPER;
                }
                break;
            case -983286850:
                if (str.equals("count_down_for_all")) {
                    return EnumC936960aUQ.COUNTDOWN_FOR_ALL;
                }
                break;
            case 188467820:
                if (str.equals("lets_dance")) {
                    return EnumC936960aUQ.LETS_DANCE;
                }
                break;
            case 292972223:
                if (str.equals("notice_board")) {
                    return EnumC936960aUQ.NOTICE_BOARD;
                }
                break;
            case 1008965232:
                if (str.equals("live_show")) {
                    return EnumC936960aUQ.LIVE_SHOW;
                }
                break;
            case 1886539686:
                if (str.equals("guest_showdown")) {
                    return EnumC936960aUQ.GUEST_SHOWDOWN;
                }
                break;
        }
        return EnumC936960aUQ.NONE;
    }
}
