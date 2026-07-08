package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.15PM, reason: invalid class name */
/* JADX INFO: loaded from: classes32.dex */
public final class C15PM {
    public static final C15PM BLACK;
    public static final C15PO Companion;
    public static final /* synthetic */ C15PM[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final C15PM WHITE;
    public final int LL;

    public static InterfaceC2044707zh<C15PM> getEntries() {
        return LLILLL;
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [X.15PO] */
    static {
        C15PM c15pm = new C15PM("BLACK", 0, 0);
        BLACK = c15pm;
        C15PM c15pm2 = new C15PM("WHITE", 1, 1);
        WHITE = c15pm2;
        C15PM[] c15pmArr = {c15pm, c15pm2};
        LLILLJJLI = c15pmArr;
        LLILLL = new C2254308sP(c15pmArr);
        Companion = new Object() { // from class: X.15PO
        };
    }

    public static C15PM[] values() {
        return (C15PM[]) LLILLJJLI.clone();
    }

    public final int getId() {
        return this.LL;
    }

    public static C15PM valueOf(String str) {
        return (C15PM) C08FF.LIZ(C15PM.class, str);
    }

    public C15PM(String str, int i, int i2) {
        this.LL = i2;
    }
}
