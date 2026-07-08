package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0N6J, reason: invalid class name */
/* JADX INFO: loaded from: classes10.dex */
public final class C0N6J {
    public static final C0N6J ILLEGAL;
    public static final C0N6J LINK;
    public static final /* synthetic */ C0N6J[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final C0N6J PHOTO;
    public static final C0N6J VIDEO;
    public final int LL;

    public static InterfaceC2044707zh<C0N6J> getEntries() {
        return LLILLL;
    }

    static {
        C0N6J c0n6j = new C0N6J("LINK", 0, 0);
        LINK = c0n6j;
        C0N6J c0n6j2 = new C0N6J("VIDEO", 1, 1);
        VIDEO = c0n6j2;
        C0N6J c0n6j3 = new C0N6J("PHOTO", 2, 2);
        PHOTO = c0n6j3;
        C0N6J c0n6j4 = new C0N6J("ILLEGAL", 3, -1);
        ILLEGAL = c0n6j4;
        C0N6J[] c0n6jArr = {c0n6j, c0n6j2, c0n6j3, c0n6j4};
        LLILLJJLI = c0n6jArr;
        LLILLL = new C2254308sP(c0n6jArr);
    }

    public static C0N6J[] values() {
        return (C0N6J[]) LLILLJJLI.clone();
    }

    public final int getNum() {
        return this.LL;
    }

    public static C0N6J valueOf(String str) {
        return (C0N6J) C08FF.LIZ(C0N6J.class, str);
    }

    public C0N6J(String str, int i, int i2) {
        this.LL = i2;
    }
}
