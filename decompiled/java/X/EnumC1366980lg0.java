package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0lg0, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class EnumC1366980lg0 {
    public static final /* synthetic */ EnumC1366980lg0[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC1366980lg0 SHARE_PANEL_ITEM_TYPE_CLIENT_LAST_SHARE;
    public static final EnumC1366980lg0 SHARE_PANEL_ITEM_TYPE_LOCALCONTACT;
    public static final EnumC1366980lg0 SHARE_PANEL_ITEM_TYPE_MAF;
    public static final EnumC1366980lg0 SHARE_PANEL_ITEM_TYPE_MOST_FREQUENT_SHARE;
    public static final EnumC1366980lg0 SHARE_PANEL_ITEM_TYPE_RECENTCHAT;
    public static final EnumC1366980lg0 SHARE_PANEL_ITEM_TYPE_RECENTSHARE;
    public static final EnumC1366980lg0 SHARE_PANEL_ITEM_TYPE_RESENT_SEND_TO;
    public static final EnumC1366980lg0 SHARE_PANEL_ITEM_TYPE_UNKNOWN;
    public final int LL;

    public static InterfaceC2044707zh<EnumC1366980lg0> getEntries() {
        return LLILLL;
    }

    static {
        EnumC1366980lg0 enumC1366980lg0 = new EnumC1366980lg0("SHARE_PANEL_ITEM_TYPE_UNKNOWN", 0, 0);
        SHARE_PANEL_ITEM_TYPE_UNKNOWN = enumC1366980lg0;
        EnumC1366980lg0 enumC1366980lg02 = new EnumC1366980lg0("SHARE_PANEL_ITEM_TYPE_RECENTSHARE", 1, 1);
        SHARE_PANEL_ITEM_TYPE_RECENTSHARE = enumC1366980lg02;
        EnumC1366980lg0 enumC1366980lg03 = new EnumC1366980lg0("SHARE_PANEL_ITEM_TYPE_RECENTCHAT", 2, 2);
        SHARE_PANEL_ITEM_TYPE_RECENTCHAT = enumC1366980lg03;
        EnumC1366980lg0 enumC1366980lg04 = new EnumC1366980lg0("SHARE_PANEL_ITEM_TYPE_LOCALCONTACT", 3, 3);
        SHARE_PANEL_ITEM_TYPE_LOCALCONTACT = enumC1366980lg04;
        EnumC1366980lg0 enumC1366980lg05 = new EnumC1366980lg0("SHARE_PANEL_ITEM_TYPE_MAF", 4, 4);
        SHARE_PANEL_ITEM_TYPE_MAF = enumC1366980lg05;
        EnumC1366980lg0 enumC1366980lg06 = new EnumC1366980lg0("SHARE_PANEL_ITEM_TYPE_RESENT_SEND_TO", 5, 5);
        SHARE_PANEL_ITEM_TYPE_RESENT_SEND_TO = enumC1366980lg06;
        EnumC1366980lg0 enumC1366980lg07 = new EnumC1366980lg0("SHARE_PANEL_ITEM_TYPE_MOST_FREQUENT_SHARE", 6, 6);
        SHARE_PANEL_ITEM_TYPE_MOST_FREQUENT_SHARE = enumC1366980lg07;
        EnumC1366980lg0 enumC1366980lg08 = new EnumC1366980lg0("SHARE_PANEL_ITEM_TYPE_CLIENT_LAST_SHARE", 7, 7);
        SHARE_PANEL_ITEM_TYPE_CLIENT_LAST_SHARE = enumC1366980lg08;
        EnumC1366980lg0[] enumC1366980lg0Arr = {enumC1366980lg0, enumC1366980lg02, enumC1366980lg03, enumC1366980lg04, enumC1366980lg05, enumC1366980lg06, enumC1366980lg07, enumC1366980lg08};
        LLILLJJLI = enumC1366980lg0Arr;
        LLILLL = new C2254308sP(enumC1366980lg0Arr);
    }

    public static EnumC1366980lg0[] values() {
        return (EnumC1366980lg0[]) LLILLJJLI.clone();
    }

    public final int getValue() {
        return this.LL;
    }

    public static EnumC1366980lg0 valueOf(String str) {
        return (EnumC1366980lg0) C08FF.LIZ(EnumC1366980lg0.class, str);
    }

    public EnumC1366980lg0(String str, int i, int i2) {
        this.LL = i2;
    }
}
