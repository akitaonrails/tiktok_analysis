package X;

import com.ss.android.ugc.aweme.feed.util.LivePreviewCTASmartDisplayManager;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0N6O, reason: invalid class name */
/* JADX INFO: loaded from: classes10.dex */
public final class C0N6O {
    public static final C0N6O DEFAULT;
    public static final C0N6O GOOD;
    public static final /* synthetic */ C0N6O[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public final int LL;

    public static InterfaceC2044707zh<C0N6O> getEntries() {
        return LLILLL;
    }

    static {
        C0N6O c0n6o = new C0N6O(LivePreviewCTASmartDisplayManager.DEFAULT, 0, 0);
        DEFAULT = c0n6o;
        C0N6O c0n6o2 = new C0N6O("GOOD", 1, 1);
        GOOD = c0n6o2;
        C0N6O[] c0n6oArr = {c0n6o, c0n6o2};
        LLILLJJLI = c0n6oArr;
        LLILLL = new C2254308sP(c0n6oArr);
    }

    public static C0N6O[] values() {
        return (C0N6O[]) LLILLJJLI.clone();
    }

    public final int getValue() {
        return this.LL;
    }

    public static C0N6O valueOf(String str) {
        return (C0N6O) C08FF.LIZ(C0N6O.class, str);
    }

    public C0N6O(String str, int i, int i2) {
        this.LL = i2;
    }
}
