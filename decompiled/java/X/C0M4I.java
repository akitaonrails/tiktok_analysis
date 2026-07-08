package X;

import com.ss.android.ugc.aweme.feed.util.LivePreviewCTASmartDisplayManager;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0M4I, reason: invalid class name */
/* JADX INFO: loaded from: classes9.dex */
public final class C0M4I {
    public static final C0M4I DEFAULT;
    public static final /* synthetic */ C0M4I[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final C0M4I PHOTO_MODE;
    public static final C0M4I STORY_LIGHTENING;
    public static final C0M4I TTN;
    public final int LL;

    public static InterfaceC2044707zh<C0M4I> getEntries() {
        return LLILLL;
    }

    static {
        C0M4I c0m4i = new C0M4I(LivePreviewCTASmartDisplayManager.DEFAULT, 0, 1);
        DEFAULT = c0m4i;
        C0M4I c0m4i2 = new C0M4I("STORY_LIGHTENING", 1, 2);
        STORY_LIGHTENING = c0m4i2;
        C0M4I c0m4i3 = new C0M4I("PHOTO_MODE", 2, 4);
        PHOTO_MODE = c0m4i3;
        C0M4I c0m4i4 = new C0M4I("TTN", 3, 8);
        TTN = c0m4i4;
        C0M4I[] c0m4iArr = {c0m4i, c0m4i2, c0m4i3, c0m4i4};
        LLILLJJLI = c0m4iArr;
        LLILLL = new C2254308sP(c0m4iArr);
    }

    public static C0M4I[] values() {
        return (C0M4I[]) LLILLJJLI.clone();
    }

    public final int getValue() {
        return this.LL;
    }

    public static C0M4I valueOf(String str) {
        return (C0M4I) C08FF.LIZ(C0M4I.class, str);
    }

    public C0M4I(String str, int i, int i2) {
        this.LL = i2;
    }
}
