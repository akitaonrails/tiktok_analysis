package X;

import com.ss.android.ugc.aweme.feed.util.LivePreviewCTASmartDisplayManager;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0QQZ, reason: invalid class name */
/* JADX INFO: loaded from: classes11.dex */
public final class C0QQZ {
    public static final C0QQZ DEFAULT;
    public static final C0QQZ HALF_NEW;
    public static final C0QQZ HALF_OLD;
    public static final /* synthetic */ C0QQZ[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final C0QQZ NINE_HALF;
    public static final C0QQZ SIMPLE;
    public final int LL;

    public static InterfaceC2044707zh<C0QQZ> getEntries() {
        return LLILLL;
    }

    static {
        C0QQZ c0qqz = new C0QQZ(LivePreviewCTASmartDisplayManager.DEFAULT, 0, 0);
        DEFAULT = c0qqz;
        C0QQZ c0qqz2 = new C0QQZ("SIMPLE", 1, 1);
        SIMPLE = c0qqz2;
        C0QQZ c0qqz3 = new C0QQZ("HALF_NEW", 2, 2);
        HALF_NEW = c0qqz3;
        C0QQZ c0qqz4 = new C0QQZ("HALF_OLD", 3, 3);
        HALF_OLD = c0qqz4;
        C0QQZ c0qqz5 = new C0QQZ("NINE_HALF", 4, 4);
        NINE_HALF = c0qqz5;
        C0QQZ[] c0qqzArr = {c0qqz, c0qqz2, c0qqz3, c0qqz4, c0qqz5};
        LLILLJJLI = c0qqzArr;
        LLILLL = new C2254308sP(c0qqzArr);
    }

    public static C0QQZ[] values() {
        return (C0QQZ[]) LLILLJJLI.clone();
    }

    public final int getValue() {
        return this.LL;
    }

    public static C0QQZ valueOf(String str) {
        return (C0QQZ) C08FF.LIZ(C0QQZ.class, str);
    }

    public C0QQZ(String str, int i, int i2) {
        this.LL = i2;
    }
}
