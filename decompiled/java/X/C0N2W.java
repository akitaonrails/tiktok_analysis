package X;

/* JADX INFO: renamed from: X.0N2W, reason: invalid class name */
/* JADX INFO: loaded from: classes10.dex */
public enum C0N2W {
    LYNX_FIRST_SCREEN(1),
    LYNX_RELOAD(2);

    public final int origin;

    public static C0N2W valueOf(String str) {
        return (C0N2W) C08FF.LIZ(C0N2W.class, str);
    }

    C0N2W(int i) {
        this.origin = i;
    }
}
