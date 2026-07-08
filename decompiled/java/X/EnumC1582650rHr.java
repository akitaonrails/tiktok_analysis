package X;

import com.ss.android.ugc.aweme.feed.util.LivePreviewCTASmartDisplayManager;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0rHr, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class EnumC1582650rHr {
    public static final EnumC1582650rHr AUTO_REFRESH;
    public static final EnumC1582650rHr DEFAULT;
    public static final EnumC1582650rHr GROUP_CHAT_PRELOAD;
    public static final EnumC1582650rHr GROUP_CHAT_REFRESH;
    public static final EnumC1582650rHr HIGH_VALUE_FOLLOW_RELATIONSHIP;
    public static final EnumC1582650rHr INBOX_UPDATE_PRELOAD;
    public static final EnumC1582650rHr IN_APP_PUSH;
    public static final EnumC1582650rHr LIVE_HIGH_VALUE_FOLLOW_RELATIONSHIP;
    public static final /* synthetic */ EnumC1582650rHr[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC1582650rHr MANUAL_REFRESH;
    public static final EnumC1582650rHr POLLING;
    public static final EnumC1582650rHr REFRESH;
    public static final EnumC1582650rHr RELATION_CHANGE;
    public static final EnumC1582650rHr SLIDE_REFRESH;
    public final int LL;

    public static InterfaceC2044707zh<EnumC1582650rHr> getEntries() {
        return LLILLL;
    }

    static {
        EnumC1582650rHr enumC1582650rHr = new EnumC1582650rHr(LivePreviewCTASmartDisplayManager.DEFAULT, 0, 0);
        DEFAULT = enumC1582650rHr;
        EnumC1582650rHr enumC1582650rHr2 = new EnumC1582650rHr("REFRESH", 1, 1);
        REFRESH = enumC1582650rHr2;
        EnumC1582650rHr enumC1582650rHr3 = new EnumC1582650rHr("MANUAL_REFRESH", 2, 2);
        MANUAL_REFRESH = enumC1582650rHr3;
        EnumC1582650rHr enumC1582650rHr4 = new EnumC1582650rHr("RELATION_CHANGE", 3, 3);
        RELATION_CHANGE = enumC1582650rHr4;
        EnumC1582650rHr enumC1582650rHr5 = new EnumC1582650rHr("POLLING", 4, 4);
        POLLING = enumC1582650rHr5;
        EnumC1582650rHr enumC1582650rHr6 = new EnumC1582650rHr("AUTO_REFRESH", 5, 5);
        AUTO_REFRESH = enumC1582650rHr6;
        EnumC1582650rHr enumC1582650rHr7 = new EnumC1582650rHr("IN_APP_PUSH", 6, 6);
        IN_APP_PUSH = enumC1582650rHr7;
        EnumC1582650rHr enumC1582650rHr8 = new EnumC1582650rHr("SLIDE_REFRESH", 7, 7);
        SLIDE_REFRESH = enumC1582650rHr8;
        EnumC1582650rHr enumC1582650rHr9 = new EnumC1582650rHr("INBOX_UPDATE_PRELOAD", 8, 8);
        INBOX_UPDATE_PRELOAD = enumC1582650rHr9;
        EnumC1582650rHr enumC1582650rHr10 = new EnumC1582650rHr("HIGH_VALUE_FOLLOW_RELATIONSHIP", 9, 11);
        HIGH_VALUE_FOLLOW_RELATIONSHIP = enumC1582650rHr10;
        EnumC1582650rHr enumC1582650rHr11 = new EnumC1582650rHr("GROUP_CHAT_PRELOAD", 10, 12);
        GROUP_CHAT_PRELOAD = enumC1582650rHr11;
        EnumC1582650rHr enumC1582650rHr12 = new EnumC1582650rHr("GROUP_CHAT_REFRESH", 11, 13);
        GROUP_CHAT_REFRESH = enumC1582650rHr12;
        EnumC1582650rHr enumC1582650rHr13 = new EnumC1582650rHr("LIVE_HIGH_VALUE_FOLLOW_RELATIONSHIP", 12, 14);
        LIVE_HIGH_VALUE_FOLLOW_RELATIONSHIP = enumC1582650rHr13;
        EnumC1582650rHr[] enumC1582650rHrArr = {enumC1582650rHr, enumC1582650rHr2, enumC1582650rHr3, enumC1582650rHr4, enumC1582650rHr5, enumC1582650rHr6, enumC1582650rHr7, enumC1582650rHr8, enumC1582650rHr9, enumC1582650rHr10, enumC1582650rHr11, enumC1582650rHr12, enumC1582650rHr13};
        LLILLJJLI = enumC1582650rHrArr;
        LLILLL = new C2254308sP(enumC1582650rHrArr);
    }

    public static EnumC1582650rHr[] values() {
        return (EnumC1582650rHr[]) LLILLJJLI.clone();
    }

    public final int getType() {
        return this.LL;
    }

    public static EnumC1582650rHr valueOf(String str) {
        return (EnumC1582650rHr) C08FF.LIZ(EnumC1582650rHr.class, str);
    }

    public EnumC1582650rHr(String str, int i, int i2) {
        this.LL = i2;
    }
}
