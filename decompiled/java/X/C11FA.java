package X;

import com.ss.android.ugc.aweme.feed.util.LivePreviewCTASmartDisplayManager;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.11FA, reason: invalid class name */
/* JADX INFO: loaded from: classes30.dex */
public final class C11FA {
    public static final C11FA DEFAULT;
    public static final /* synthetic */ C11FA[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final C11FA TAB_TYPE_COLLECT;
    public static final C11FA TAB_TYPE_DISCOVER;
    public static final C11FA TAB_TYPE_FOR_YOU;
    public static final C11FA TAB_TYPE_LOCAL;
    public static final C11FA TAB_TYPE_MORE;
    public static final C11FA TAB_TYPE_UNLIMITED_MUSIC;
    public final int LL;

    public static InterfaceC2044707zh<C11FA> getEntries() {
        return LLILLL;
    }

    static {
        C11FA c11fa = new C11FA(LivePreviewCTASmartDisplayManager.DEFAULT, 0, -1);
        DEFAULT = c11fa;
        C11FA c11fa2 = new C11FA("TAB_TYPE_DISCOVER", 1, 0);
        TAB_TYPE_DISCOVER = c11fa2;
        C11FA c11fa3 = new C11FA("TAB_TYPE_FOR_YOU", 2, 0);
        TAB_TYPE_FOR_YOU = c11fa3;
        C11FA c11fa4 = new C11FA("TAB_TYPE_COLLECT", 3, 1);
        TAB_TYPE_COLLECT = c11fa4;
        C11FA c11fa5 = new C11FA("TAB_TYPE_LOCAL", 4, 2);
        TAB_TYPE_LOCAL = c11fa5;
        C11FA c11fa6 = new C11FA("TAB_TYPE_MORE", 5, 2);
        TAB_TYPE_MORE = c11fa6;
        C11FA c11fa7 = new C11FA("TAB_TYPE_UNLIMITED_MUSIC", 6, 2);
        TAB_TYPE_UNLIMITED_MUSIC = c11fa7;
        C11FA[] c11faArr = {c11fa, c11fa2, c11fa3, c11fa4, c11fa5, c11fa6, c11fa7};
        LLILLJJLI = c11faArr;
        LLILLL = new C2254308sP(c11faArr);
    }

    public static C11FA[] values() {
        return (C11FA[]) LLILLJJLI.clone();
    }

    public final int getPosition() {
        return this.LL;
    }

    public static C11FA valueOf(String str) {
        return (C11FA) C08FF.LIZ(C11FA.class, str);
    }

    public C11FA(String str, int i, int i2) {
        this.LL = i2;
    }
}
