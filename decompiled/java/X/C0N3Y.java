package X;

import com.ss.android.ugc.aweme.feed.util.LivePreviewCTASmartDisplayManager;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0N3Y, reason: invalid class name */
/* JADX INFO: loaded from: classes10.dex */
public final class C0N3Y {
    public static final C0N3Y BITMAP_PLACEHOLDER;
    public static final C0N3Y DEFAULT;
    public static final /* synthetic */ C0N3Y[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final C0N3Y PLACEHOLDER;
    public final int LL;

    public static InterfaceC2044707zh<C0N3Y> getEntries() {
        return LLILLL;
    }

    static {
        C0N3Y c0n3y = new C0N3Y(LivePreviewCTASmartDisplayManager.DEFAULT, 0, 0);
        DEFAULT = c0n3y;
        C0N3Y c0n3y2 = new C0N3Y("PLACEHOLDER", 1, 1);
        PLACEHOLDER = c0n3y2;
        C0N3Y c0n3y3 = new C0N3Y("BITMAP_PLACEHOLDER", 2, 2);
        BITMAP_PLACEHOLDER = c0n3y3;
        C0N3Y[] c0n3yArr = {c0n3y, c0n3y2, c0n3y3};
        LLILLJJLI = c0n3yArr;
        LLILLL = new C2254308sP(c0n3yArr);
    }

    public static C0N3Y[] values() {
        return (C0N3Y[]) LLILLJJLI.clone();
    }

    public final int getValue() {
        return this.LL;
    }

    public static C0N3Y valueOf(String str) {
        return (C0N3Y) C08FF.LIZ(C0N3Y.class, str);
    }

    public C0N3Y(String str, int i, int i2) {
        this.LL = i2;
    }
}
