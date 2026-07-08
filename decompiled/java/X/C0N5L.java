package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0N5L, reason: invalid class name */
/* JADX INFO: loaded from: classes10.dex */
public final class C0N5L {
    public static final /* synthetic */ C0N5L[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final C0N5L MUTE;
    public static final C0N5L NOT_MUTE;
    public final int LL;

    public static InterfaceC2044707zh<C0N5L> getEntries() {
        return LLILLL;
    }

    static {
        C0N5L c0n5l = new C0N5L("NOT_MUTE", 0, 0);
        NOT_MUTE = c0n5l;
        C0N5L c0n5l2 = new C0N5L("MUTE", 1, 1);
        MUTE = c0n5l2;
        C0N5L[] c0n5lArr = {c0n5l, c0n5l2};
        LLILLJJLI = c0n5lArr;
        LLILLL = new C2254308sP(c0n5lArr);
    }

    public static C0N5L[] values() {
        return (C0N5L[]) LLILLJJLI.clone();
    }

    public final int getState() {
        return this.LL;
    }

    public static C0N5L valueOf(String str) {
        return (C0N5L) C08FF.LIZ(C0N5L.class, str);
    }

    public C0N5L(String str, int i, int i2) {
        this.LL = i2;
    }
}
