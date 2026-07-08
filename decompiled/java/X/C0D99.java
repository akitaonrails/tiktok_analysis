package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0D99, reason: invalid class name */
/* JADX INFO: loaded from: classes5.dex */
public final class C0D99 {
    public static final C0D99 CAMERA_PANEL;
    public static final C0D99 CAROUSEL;
    public static final C0D99 EDIT_PANEL;
    public static final /* synthetic */ C0D99[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public final String LL;

    public static InterfaceC2044707zh<C0D99> getEntries() {
        return LLILLL;
    }

    static {
        C0D99 c0d99 = new C0D99("CAROUSEL", 0, "1");
        CAROUSEL = c0d99;
        C0D99 c0d992 = new C0D99("CAMERA_PANEL", 1, "2");
        CAMERA_PANEL = c0d992;
        C0D99 c0d993 = new C0D99("EDIT_PANEL", 2, "3");
        EDIT_PANEL = c0d993;
        C0D99[] c0d99Arr = {c0d99, c0d992, c0d993};
        LLILLJJLI = c0d99Arr;
        LLILLL = new C2254308sP(c0d99Arr);
    }

    public static C0D99[] values() {
        return (C0D99[]) LLILLJJLI.clone();
    }

    public final String getValue() {
        return this.LL;
    }

    public static C0D99 valueOf(String str) {
        return (C0D99) C08FF.LIZ(C0D99.class, str);
    }

    public C0D99(String str, int i, String str2) {
        this.LL = str2;
    }
}
