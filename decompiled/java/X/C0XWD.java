package X;

import com.ss.android.ugc.aweme.feed.util.LivePreviewCTASmartDisplayManager;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0XWD, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0XWD {
    public static final C0XWD DEFAULT;
    public static final C0XWD FYP_POP_UP;
    public static final C0XWD INBOX_POP_UP;
    public static final /* synthetic */ C0XWD[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final C0XWD LOGIN;
    public static final C0XWD LOGOUT;
    public static final C0XWD PROFILE_POP_UP;
    public static final C0XWD REFRESH;
    public static final C0XWD SETTING;
    public static final C0XWD SIGN_UP;
    public static final C0XWD SMART_LOCK;
    public final int LL;

    public static InterfaceC2044707zh<C0XWD> getEntries() {
        return LLILLL;
    }

    static {
        C0XWD c0xwd = new C0XWD(LivePreviewCTASmartDisplayManager.DEFAULT, 0, 0);
        DEFAULT = c0xwd;
        C0XWD c0xwd2 = new C0XWD("LOGIN", 1, 1);
        LOGIN = c0xwd2;
        C0XWD c0xwd3 = new C0XWD("SIGN_UP", 2, 2);
        SIGN_UP = c0xwd3;
        C0XWD c0xwd4 = new C0XWD("SETTING", 3, 3);
        SETTING = c0xwd4;
        C0XWD c0xwd5 = new C0XWD("FYP_POP_UP", 4, 4);
        FYP_POP_UP = c0xwd5;
        C0XWD c0xwd6 = new C0XWD("INBOX_POP_UP", 5, 5);
        INBOX_POP_UP = c0xwd6;
        C0XWD c0xwd7 = new C0XWD("PROFILE_POP_UP", 6, 6);
        PROFILE_POP_UP = c0xwd7;
        C0XWD c0xwd8 = new C0XWD("LOGOUT", 7, 7);
        LOGOUT = c0xwd8;
        C0XWD c0xwd9 = new C0XWD("SMART_LOCK", 8, 8);
        SMART_LOCK = c0xwd9;
        C0XWD c0xwd10 = new C0XWD("REFRESH", 9, 9);
        REFRESH = c0xwd10;
        C0XWD[] c0xwdArr = {c0xwd, c0xwd2, c0xwd3, c0xwd4, c0xwd5, c0xwd6, c0xwd7, c0xwd8, c0xwd9, c0xwd10};
        LLILLJJLI = c0xwdArr;
        LLILLL = new C2254308sP(c0xwdArr);
    }

    public static C0XWD[] values() {
        return (C0XWD[]) LLILLJJLI.clone();
    }

    public final int getServerCode() {
        return this.LL;
    }

    public static C0XWD valueOf(String str) {
        return (C0XWD) C08FF.LIZ(C0XWD.class, str);
    }

    public C0XWD(String str, int i, int i2) {
        this.LL = i2;
    }
}
