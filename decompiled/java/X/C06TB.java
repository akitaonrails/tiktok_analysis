package X;

import com.ss.android.ugc.aweme.feed.util.LivePreviewCTASmartDisplayManager;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.06TB, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
public final class C06TB {
    public static final C06TB ANIMATED_STICKER;
    public static final C06TB DEFAULT;
    public static final C06TB DM_AVATAR;
    public static final /* synthetic */ C06TB[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final C06TB STABLE_STICKER;
    public static final C06TB STATIC_STICKER;
    public final String LL;

    public static InterfaceC2044707zh<C06TB> getEntries() {
        return LLILLL;
    }

    static {
        C06TB c06tb = new C06TB(LivePreviewCTASmartDisplayManager.DEFAULT, 0, "dm_default");
        DEFAULT = c06tb;
        C06TB c06tb2 = new C06TB("STABLE_STICKER", 1, "stable_sticker");
        STABLE_STICKER = c06tb2;
        C06TB c06tb3 = new C06TB("STATIC_STICKER", 2, "static_sticker");
        STATIC_STICKER = c06tb3;
        C06TB c06tb4 = new C06TB("ANIMATED_STICKER", 3, "store_sticker");
        ANIMATED_STICKER = c06tb4;
        C06TB c06tb5 = new C06TB("DM_AVATAR", 4, "dm_avatar");
        DM_AVATAR = c06tb5;
        C06TB[] c06tbArr = {c06tb, c06tb2, c06tb3, c06tb4, c06tb5};
        LLILLJJLI = c06tbArr;
        LLILLL = new C2254308sP(c06tbArr);
    }

    public static C06TB[] values() {
        return (C06TB[]) LLILLJJLI.clone();
    }

    public final String getSpace() {
        return this.LL;
    }

    public static C06TB valueOf(String str) {
        return (C06TB) C08FF.LIZ(C06TB.class, str);
    }

    public C06TB(String str, int i, String str2) {
        this.LL = str2;
    }
}
