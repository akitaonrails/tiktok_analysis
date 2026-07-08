package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0QNK, reason: invalid class name */
/* JADX INFO: loaded from: classes11.dex */
public final class C0QNK {
    public static final C0QNK ICON;
    public static final C0QNK LABEL;
    public static final /* synthetic */ C0QNK[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final C0QNK QUERY;
    public final int LL;

    public static InterfaceC2044707zh<C0QNK> getEntries() {
        return LLILLL;
    }

    static {
        C0QNK c0qnk = new C0QNK("LABEL", 0, 0);
        LABEL = c0qnk;
        C0QNK c0qnk2 = new C0QNK("QUERY", 1, 1);
        QUERY = c0qnk2;
        C0QNK c0qnk3 = new C0QNK("ICON", 2, 2);
        ICON = c0qnk3;
        C0QNK[] c0qnkArr = {c0qnk, c0qnk2, c0qnk3};
        LLILLJJLI = c0qnkArr;
        LLILLL = new C2254308sP(c0qnkArr);
    }

    public static C0QNK[] values() {
        return (C0QNK[]) LLILLJJLI.clone();
    }

    public final int getValue() {
        return this.LL;
    }

    public static C0QNK valueOf(String str) {
        return (C0QNK) C08FF.LIZ(C0QNK.class, str);
    }

    public C0QNK(String str, int i, int i2) {
        this.LL = i2;
    }
}
