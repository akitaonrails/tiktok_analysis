package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0N4X, reason: invalid class name */
/* JADX INFO: loaded from: classes10.dex */
public final class C0N4X {
    public static final /* synthetic */ C0N4X[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final C0N4X META_CONTAIN_IPTC;
    public static final C0N4X UNKNOWN;
    public final String LL;

    public static InterfaceC2044707zh<C0N4X> getEntries() {
        return LLILLL;
    }

    static {
        C0N4X c0n4x = new C0N4X("UNKNOWN", 0, "unknown");
        UNKNOWN = c0n4x;
        C0N4X c0n4x2 = new C0N4X("META_CONTAIN_IPTC", 1, "meta_contain_iptc");
        META_CONTAIN_IPTC = c0n4x2;
        C0N4X[] c0n4xArr = {c0n4x, c0n4x2};
        LLILLJJLI = c0n4xArr;
        LLILLL = new C2254308sP(c0n4xArr);
    }

    public static C0N4X[] values() {
        return (C0N4X[]) LLILLJJLI.clone();
    }

    public final String getType() {
        return this.LL;
    }

    public static C0N4X valueOf(String str) {
        return (C0N4X) C08FF.LIZ(C0N4X.class, str);
    }

    public C0N4X(String str, int i, String str2) {
        this.LL = str2;
    }
}
