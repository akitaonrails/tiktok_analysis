package X;

import com.ss.android.ugc.aweme.feed.util.LivePreviewCTASmartDisplayManager;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0QGY, reason: invalid class name */
/* JADX INFO: loaded from: classes11.dex */
public final class C0QGY {
    public static final C0QGY ALWAYS_SHOW;
    public static final C0QGY DEFAULT;
    public static final /* synthetic */ C0QGY[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final C0QGY ONLY_SHOW_WHEN_KEYBOARD_OPENED;
    public final int LL;

    public static InterfaceC2044707zh<C0QGY> getEntries() {
        return LLILLL;
    }

    static {
        C0QGY c0qgy = new C0QGY(LivePreviewCTASmartDisplayManager.DEFAULT, 0, 0);
        DEFAULT = c0qgy;
        C0QGY c0qgy2 = new C0QGY("ALWAYS_SHOW", 1, 1);
        ALWAYS_SHOW = c0qgy2;
        C0QGY c0qgy3 = new C0QGY("ONLY_SHOW_WHEN_KEYBOARD_OPENED", 2, 2);
        ONLY_SHOW_WHEN_KEYBOARD_OPENED = c0qgy3;
        C0QGY[] c0qgyArr = {c0qgy, c0qgy2, c0qgy3};
        LLILLJJLI = c0qgyArr;
        LLILLL = new C2254308sP(c0qgyArr);
    }

    public static C0QGY[] values() {
        return (C0QGY[]) LLILLJJLI.clone();
    }

    public final int getValue() {
        return this.LL;
    }

    public static C0QGY valueOf(String str) {
        return (C0QGY) C08FF.LIZ(C0QGY.class, str);
    }

    public C0QGY(String str, int i, int i2) {
        this.LL = i2;
    }
}
