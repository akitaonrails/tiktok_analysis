package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.1BVI, reason: invalid class name */
/* JADX INFO: loaded from: classes35.dex */
public final class C1BVI {
    public static final C1BVI EMAIL;
    public static final /* synthetic */ C1BVI[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final C1BVI PHONE;
    public final int LL;

    public static InterfaceC2044707zh<C1BVI> getEntries() {
        return LLILLL;
    }

    static {
        C1BVI c1bvi = new C1BVI("EMAIL", 0, 0);
        EMAIL = c1bvi;
        C1BVI c1bvi2 = new C1BVI("PHONE", 1, 1);
        PHONE = c1bvi2;
        C1BVI[] c1bviArr = {c1bvi, c1bvi2};
        LLILLJJLI = c1bviArr;
        LLILLL = new C2254308sP(c1bviArr);
    }

    public static C1BVI[] values() {
        return (C1BVI[]) LLILLJJLI.clone();
    }

    public final int getValue() {
        return this.LL;
    }

    public static C1BVI valueOf(String str) {
        return (C1BVI) C08FF.LIZ(C1BVI.class, str);
    }

    public C1BVI(String str, int i, int i2) {
        this.LL = i2;
    }
}
