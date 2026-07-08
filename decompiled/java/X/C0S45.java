package X;

import com.zhiliaoapp.musically.R;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0S45, reason: invalid class name */
/* JADX INFO: loaded from: classes12.dex */
public final class C0S45 {
    public static final C0S45 ERROR_VISIBLE_CELL_ROOT;
    public static final C0S45 ERROR_VISIBLE_INTERACT_BOTTOM;
    public static final C0S45 ERROR_VISIBLE_INTERACT_INFO;
    public static final C0S45 ERROR_VISIBLE_INTERACT_RIGHT;
    public static final C0S45 ERROR_VISIBLE_INTERACT_ROOT;
    public static final C0S45 ERROR_VISIBLE_INTERACT_TOP;
    public static final C0S45 INFO_TITLE;
    public static final /* synthetic */ C0S45[] LLILZ;
    public static final /* synthetic */ C2254308sP LLILZIL;
    public static final C0S45 RIGHT_AVATAR;
    public static final C0S45 RIGHT_COMMENT;
    public static final C0S45 RIGHT_COVER;
    public static final C0S45 RIGHT_DIGG;
    public static final C0S45 RIGHT_FAVORITE;
    public static final C0S45 RIGHT_SHARE;
    public final String LL;
    public final int LLILLJJLI;
    public final int LLILLL;

    public static InterfaceC2044707zh<C0S45> getEntries() {
        return LLILZIL;
    }

    static {
        C0S45 c0s45 = new C0S45(0, R.id.view_rootview, "ERROR_VISIBLE_CELL_ROOT", "cell_root");
        ERROR_VISIBLE_CELL_ROOT = c0s45;
        C0S45 c0s452 = new C0S45(1, R.id.widget_container, "ERROR_VISIBLE_INTERACT_ROOT", "interact_root");
        ERROR_VISIBLE_INTERACT_ROOT = c0s452;
        C0S45 c0s453 = new C0S45(2, R.id.kv_, 3, "ERROR_VISIBLE_INTERACT_INFO", "interact_info");
        ERROR_VISIBLE_INTERACT_INFO = c0s453;
        C0S45 c0s454 = new C0S45(3, R.id.kvd, 1, "ERROR_VISIBLE_INTERACT_RIGHT", "interact_right");
        ERROR_VISIBLE_INTERACT_RIGHT = c0s454;
        C0S45 c0s455 = new C0S45(4, R.id.c26, "ERROR_VISIBLE_INTERACT_TOP", "interact_top");
        ERROR_VISIBLE_INTERACT_TOP = c0s455;
        C0S45 c0s456 = new C0S45(5, R.id.c25, "ERROR_VISIBLE_INTERACT_BOTTOM", "interact_bottom");
        ERROR_VISIBLE_INTERACT_BOTTOM = c0s456;
        C0S45 c0s457 = new C0S45(6, R.id.hsd, 2, "RIGHT_AVATAR", "right_avatar");
        RIGHT_AVATAR = c0s457;
        C0S45 c0s458 = new C0S45(7, R.id.ftt, 3, "RIGHT_DIGG", "right_digg");
        RIGHT_DIGG = c0s458;
        C0S45 c0s459 = new C0S45(8, R.id.ebd, 4, "RIGHT_COMMENT", "right_comment");
        RIGHT_COMMENT = c0s459;
        C0S45 c0s4510 = new C0S45(9, R.id.hpv, 3, "RIGHT_FAVORITE", "right_favorite");
        RIGHT_FAVORITE = c0s4510;
        C0S45 c0s4511 = new C0S45(10, R.id.uz4, 3, "RIGHT_SHARE", "right_share");
        RIGHT_SHARE = c0s4511;
        C0S45 c0s4512 = new C0S45(11, R.id.ou3, 6, "RIGHT_COVER", "right_cover");
        RIGHT_COVER = c0s4512;
        C0S45 c0s4513 = new C0S45(12, R.id.hvf, 3, "INFO_TITLE", "info_title");
        INFO_TITLE = c0s4513;
        C0S45[] c0s45Arr = {c0s45, c0s452, c0s453, c0s454, c0s455, c0s456, c0s457, c0s458, c0s459, c0s4510, c0s4511, c0s4512, c0s4513};
        LLILZ = c0s45Arr;
        LLILZIL = new C2254308sP(c0s45Arr);
    }

    public static C0S45[] values() {
        return (C0S45[]) LLILZ.clone();
    }

    public final int getUpLevelSearch() {
        return this.LLILLL;
    }

    public final String getViewKey() {
        return this.LL;
    }

    public final int getViewResId() {
        return this.LLILLJJLI;
    }

    public static C0S45 valueOf(String str) {
        return (C0S45) C08FF.LIZ(C0S45.class, str);
    }

    public /* synthetic */ C0S45(int i, int i2, String str, String str2) {
        this(i, i2, 0, str, str2);
    }

    public C0S45(int i, int i2, int i3, String str, String str2) {
        this.LL = str2;
        this.LLILLJJLI = i2;
        this.LLILLL = i3;
    }
}
