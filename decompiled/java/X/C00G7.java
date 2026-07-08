package X;

import com.ss.android.ugc.aweme.feed.util.LivePreviewCTASmartDisplayManager;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.00G7, reason: invalid class name */
/* JADX INFO: loaded from: classes.dex */
public final class C00G7 {
    public static final C00G7 AUDIT_SWITCH;
    public static final C00G7 BIZ_SECOND_CONFIRM;
    public static final C00G7 BIZ_THRESHOLD_CHECK_FAILED;
    public static final C00G7 DEFAULT;
    public static final /* synthetic */ C00G7[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final C00G7 RELATION_CHECK_FAILED;
    public final int LL;

    public static InterfaceC2044707zh<C00G7> getEntries() {
        return LLILLL;
    }

    static {
        C00G7 c00g7 = new C00G7(LivePreviewCTASmartDisplayManager.DEFAULT, 0, 0);
        DEFAULT = c00g7;
        C00G7 c00g72 = new C00G7("AUDIT_SWITCH", 1, 1);
        AUDIT_SWITCH = c00g72;
        C00G7 c00g73 = new C00G7("RELATION_CHECK_FAILED", 2, 2);
        RELATION_CHECK_FAILED = c00g73;
        C00G7 c00g74 = new C00G7("BIZ_THRESHOLD_CHECK_FAILED", 3, 3);
        BIZ_THRESHOLD_CHECK_FAILED = c00g74;
        C00G7 c00g75 = new C00G7("BIZ_SECOND_CONFIRM", 4, 4);
        BIZ_SECOND_CONFIRM = c00g75;
        C00G7[] c00g7Arr = {c00g7, c00g72, c00g73, c00g74, c00g75};
        LLILLJJLI = c00g7Arr;
        LLILLL = new C2254308sP(c00g7Arr);
    }

    public static C00G7[] values() {
        return (C00G7[]) LLILLJJLI.clone();
    }

    public final int getValue() {
        return this.LL;
    }

    public static C00G7 valueOf(String str) {
        return (C00G7) C08FF.LIZ(C00G7.class, str);
    }

    public C00G7(String str, int i, int i2) {
        this.LL = i2;
    }
}
