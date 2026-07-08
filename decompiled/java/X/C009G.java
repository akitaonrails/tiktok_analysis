package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.009G, reason: invalid class name */
/* JADX INFO: loaded from: classes.dex */
public final class C009G {
    public static final C009G CAMERA_SCREEN;
    public static final /* synthetic */ C009G[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final C009G RECORD_BUTTON;

    public static InterfaceC2044707zh<C009G> getEntries() {
        return LLILLJJLI;
    }

    static {
        C009G c009g = new C009G("RECORD_BUTTON", 0);
        RECORD_BUTTON = c009g;
        C009G c009g2 = new C009G("CAMERA_SCREEN", 1);
        CAMERA_SCREEN = c009g2;
        C009G[] c009gArr = {c009g, c009g2};
        LL = c009gArr;
        LLILLJJLI = new C2254308sP(c009gArr);
    }

    public static C009G[] values() {
        return (C009G[]) LL.clone();
    }

    public static C009G valueOf(String str) {
        return (C009G) C08FF.LIZ(C009G.class, str);
    }

    public C009G(String str, int i) {
    }
}
