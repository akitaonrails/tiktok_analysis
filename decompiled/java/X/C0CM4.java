package X;

import com.ss.android.ugc.aweme.feed.util.LivePreviewCTASmartDisplayManager;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0CM4, reason: invalid class name */
/* JADX INFO: loaded from: classes5.dex */
public final class C0CM4 {
    public static final C0CM4 DEFAULT;
    public static final /* synthetic */ C0CM4[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final C0CM4 MAIN_THREAD;
    public static final C0CM4 SUB_THREAD;
    public final int LL;

    public static InterfaceC2044707zh<C0CM4> getEntries() {
        return LLILLL;
    }

    static {
        C0CM4 c0cm4 = new C0CM4(LivePreviewCTASmartDisplayManager.DEFAULT, 0, 0);
        DEFAULT = c0cm4;
        C0CM4 c0cm42 = new C0CM4("MAIN_THREAD", 1, 1);
        MAIN_THREAD = c0cm42;
        C0CM4 c0cm43 = new C0CM4("SUB_THREAD", 2, 2);
        SUB_THREAD = c0cm43;
        C0CM4[] c0cm4Arr = {c0cm4, c0cm42, c0cm43};
        LLILLJJLI = c0cm4Arr;
        LLILLL = new C2254308sP(c0cm4Arr);
    }

    public static C0CM4[] values() {
        return (C0CM4[]) LLILLJJLI.clone();
    }

    public final int getType() {
        return this.LL;
    }

    public static C0CM4 valueOf(String str) {
        return (C0CM4) C08FF.LIZ(C0CM4.class, str);
    }

    public C0CM4(String str, int i, int i2) {
        this.LL = i2;
    }
}
