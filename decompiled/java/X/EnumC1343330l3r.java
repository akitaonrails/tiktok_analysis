package X;

import com.ss.android.ugc.aweme.feed.util.LivePreviewCTASmartDisplayManager;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0l3r, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class EnumC1343330l3r {
    public static final EnumC1343330l3r COMMENT_EMPTY;
    public static final EnumC1343330l3r DEFAULT;
    public static final /* synthetic */ EnumC1343330l3r[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC1343330l3r LOADING;
    public static final EnumC1343330l3r LOAD_MORE_ERR;
    public static final EnumC1343330l3r POST_MODE_FULL_PAGE_LOAD_COMPLETE;
    public static final EnumC1343330l3r REFRESH_ERR;

    public static InterfaceC2044707zh<EnumC1343330l3r> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC1343330l3r enumC1343330l3r = new EnumC1343330l3r(LivePreviewCTASmartDisplayManager.DEFAULT, 0);
        DEFAULT = enumC1343330l3r;
        EnumC1343330l3r enumC1343330l3r2 = new EnumC1343330l3r("LOADING", 1);
        LOADING = enumC1343330l3r2;
        EnumC1343330l3r enumC1343330l3r3 = new EnumC1343330l3r("REFRESH_ERR", 2);
        REFRESH_ERR = enumC1343330l3r3;
        EnumC1343330l3r enumC1343330l3r4 = new EnumC1343330l3r("LOAD_MORE_ERR", 3);
        LOAD_MORE_ERR = enumC1343330l3r4;
        EnumC1343330l3r enumC1343330l3r5 = new EnumC1343330l3r("COMMENT_EMPTY", 4);
        COMMENT_EMPTY = enumC1343330l3r5;
        EnumC1343330l3r enumC1343330l3r6 = new EnumC1343330l3r("POST_MODE_FULL_PAGE_LOAD_COMPLETE", 5);
        POST_MODE_FULL_PAGE_LOAD_COMPLETE = enumC1343330l3r6;
        EnumC1343330l3r[] enumC1343330l3rArr = {enumC1343330l3r, enumC1343330l3r2, enumC1343330l3r3, enumC1343330l3r4, enumC1343330l3r5, enumC1343330l3r6};
        LL = enumC1343330l3rArr;
        LLILLJJLI = new C2254308sP(enumC1343330l3rArr);
    }

    public static EnumC1343330l3r[] values() {
        return (EnumC1343330l3r[]) LL.clone();
    }

    public static EnumC1343330l3r valueOf(String str) {
        return (EnumC1343330l3r) C08FF.LIZ(EnumC1343330l3r.class, str);
    }

    public EnumC1343330l3r(String str, int i) {
    }
}
