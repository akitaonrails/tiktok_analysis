package X;

import com.ss.android.ugc.aweme.feed.util.LivePreviewCTASmartDisplayManager;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.10MN, reason: invalid class name */
/* JADX INFO: loaded from: classes29.dex */
public final class C10MN {
    public static final C10MN AFTER_INTEREST_SELECT;
    public static final C10MN AFTER_SWIPE_UP;
    public static final C10MN BEFORE_INTEREST_SELECT;
    public static final C10MN BEFORE_LOGIN;
    public static final C10MN DEFAULT;
    public static final /* synthetic */ C10MN[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final C10MN NO_PUSH_POP_IN_NUJ;
    public static final C10MN UNKNOWN;
    public final int LL;

    public static InterfaceC2044707zh<C10MN> getEntries() {
        return LLILLL;
    }

    static {
        C10MN c10mn = new C10MN("UNKNOWN", 0, -1);
        UNKNOWN = c10mn;
        C10MN c10mn2 = new C10MN(LivePreviewCTASmartDisplayManager.DEFAULT, 1, 0);
        DEFAULT = c10mn2;
        C10MN c10mn3 = new C10MN("BEFORE_INTEREST_SELECT", 2, 1);
        BEFORE_INTEREST_SELECT = c10mn3;
        C10MN c10mn4 = new C10MN("AFTER_INTEREST_SELECT", 3, 2);
        AFTER_INTEREST_SELECT = c10mn4;
        C10MN c10mn5 = new C10MN("AFTER_SWIPE_UP", 4, 3);
        AFTER_SWIPE_UP = c10mn5;
        C10MN c10mn6 = new C10MN("NO_PUSH_POP_IN_NUJ", 5, 4);
        NO_PUSH_POP_IN_NUJ = c10mn6;
        C10MN c10mn7 = new C10MN("BEFORE_LOGIN", 6, 5);
        BEFORE_LOGIN = c10mn7;
        C10MN[] c10mnArr = {c10mn, c10mn2, c10mn3, c10mn4, c10mn5, c10mn6, c10mn7};
        LLILLJJLI = c10mnArr;
        LLILLL = new C2254308sP(c10mnArr);
    }

    public static C10MN[] values() {
        return (C10MN[]) LLILLJJLI.clone();
    }

    public final int getValue() {
        return this.LL;
    }

    public static C10MN valueOf(String str) {
        return (C10MN) C08FF.LIZ(C10MN.class, str);
    }

    public C10MN(String str, int i, int i2) {
        this.LL = i2;
    }
}
