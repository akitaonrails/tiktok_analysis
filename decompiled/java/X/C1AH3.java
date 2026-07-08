package X;

import com.bytedance.android.livesdk.broadcast.setting.LiveCenterNativePageRenew;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveCenterMockToolSwitch;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.1AH3, reason: invalid class name */
/* JADX INFO: loaded from: classes34.dex */
public final class C1AH3 {
    public static final C1AH3 DATA_BOARD;
    public static final C1AH3 FLARE_CARD;
    public static final C1AH3 GROWTH;
    public static final C1AH3 LIVE_JOURNEY;
    public static final /* synthetic */ C1AH3[] LLILZLL;
    public static final /* synthetic */ C2254308sP LLIZ;
    public static final C1AH3 LOP;
    public static final C1AH3 PC_WEBSITE;
    public static final C1AH3 PLAY_BOOK;
    public static final C1AH3 PUNISH;
    public static final C1AH3 STATUS;
    public static final C1AH3 TIKTOK_SHOP;
    public static final C1AH3 TIPS;
    public static final C1AH3 TIPS_LYNX;
    public static final C1AH3 TITLE;
    public static final C1AH3 TRAFFIC_GRAPH;
    public final int LL;
    public final String LLILLJJLI;
    public final String LLILLL;
    public final boolean LLILZ;
    public final boolean LLILZIL;

    public static InterfaceC2044707zh<C1AH3> getEntries() {
        return LLIZ;
    }

    /* JADX WARN: Multi-variable type inference failed */
    static {
        String str = null;
        C1AH3 c1ah3 = new C1AH3(0, 1, "TITLE", "title", str, 1 == true ? 1 : 0);
        TITLE = c1ah3;
        C1AH3 c1ah32 = new C1AH3("STATUS", FollowStatusChangeMethod.PARAM_FOLLOW_STATUS, null, 1, 2, true, true);
        STATUS = c1ah32;
        C1AH3 c1ah33 = new C1AH3("DATA_BOARD", "data_board", null, 2, 3, true, true);
        DATA_BOARD = c1ah33;
        C1AH3 c1ah34 = new C1AH3("TIPS", "tips", null, 3, 4, true, true);
        TIPS = c1ah34;
        C1AH3 c1ah35 = new C1AH3("TIPS_LYNX", "tips_lynx", null, 4, -1, false, false);
        TIPS_LYNX = c1ah35;
        int i = 5;
        C1AH3 c1ah36 = new C1AH3(i, i, "PUNISH", "punish_records", str, true);
        PUNISH = c1ah36;
        C1AH3 c1ah37 = new C1AH3("GROWTH", "anchor_grow_level", null, 6, 7, true, true);
        GROWTH = c1ah37;
        C1AH3 c1ah38 = new C1AH3(7, 8, "PC_WEBSITE", "web_instructions", "pc_live_center_guide", true);
        PC_WEBSITE = c1ah38;
        LiveCenterNativePageRenew liveCenterNativePageRenew = LiveCenterNativePageRenew.INSTANCE;
        C1AH3 c1ah39 = new C1AH3("TIKTOK_SHOP", "tiktok_shop", "shop", 8, 9, liveCenterNativePageRenew.isEnable(), liveCenterNativePageRenew.isEnable());
        TIKTOK_SHOP = c1ah39;
        C1AH3 c1ah310 = new C1AH3("LIVE_JOURNEY", LiveCenterMockToolSwitch.LIVEJOURNEY, null, 9, 10, true, true);
        LIVE_JOURNEY = c1ah310;
        C1AH3 c1ah311 = new C1AH3("LOP", LiveCenterMockToolSwitch.LOP, null, 10, 11, true, true);
        LOP = c1ah311;
        C1AH3 c1ah312 = new C1AH3("FLARE_CARD", "flare_card", null, 11, 12, true, true);
        FLARE_CARD = c1ah312;
        C1AH3 c1ah313 = new C1AH3("PLAY_BOOK", "play_book", null, 12, 13, true, true);
        PLAY_BOOK = c1ah313;
        C1AH3 c1ah314 = new C1AH3(13, 0, "TRAFFIC_GRAPH", "traffic_graph", null, 0 == true ? 1 : 0);
        TRAFFIC_GRAPH = c1ah314;
        C1AH3[] c1ah3Arr = {c1ah3, c1ah32, c1ah33, c1ah34, c1ah35, c1ah36, c1ah37, c1ah38, c1ah39, c1ah310, c1ah311, c1ah312, c1ah313, c1ah314};
        LLILZLL = c1ah3Arr;
        LLIZ = new C2254308sP(c1ah3Arr);
    }

    public static C1AH3[] values() {
        return (C1AH3[]) LLILZLL.clone();
    }

    public final String getReportName() {
        String str = this.LLILLL;
        return str == null ? this.LLILLJJLI : str;
    }

    public final String getLayoutName() {
        return this.LLILLJJLI;
    }

    public final boolean getShouldForceRefesh() {
        return this.LLILZIL;
    }

    public final int getType() {
        return this.LL;
    }

    public final boolean isNative() {
        return this.LLILZ;
    }

    public static C1AH3 valueOf(String str) {
        return (C1AH3) C08FF.LIZ(C1AH3.class, str);
    }

    public /* synthetic */ C1AH3(int i, int i2, String str, String str2, String str3, boolean z) {
        this(str, str2, str3, i, i2, z, false);
    }

    public C1AH3(String str, String str2, String str3, int i, int i2, boolean z, boolean z2) {
        this.LL = i2;
        this.LLILLJJLI = str2;
        this.LLILLL = str3;
        this.LLILZ = z;
        this.LLILZIL = z2;
    }
}
