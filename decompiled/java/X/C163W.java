package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.163W, reason: invalid class name */
/* JADX INFO: loaded from: classes32.dex */
public final class C163W {
    public static final C163W CLIENT_ERROR;
    public static final /* synthetic */ C163W[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final C163W NETWORK_ERROR;
    public static final C163W SERVER_ERROR;
    public final int LL;

    public static InterfaceC2044707zh<C163W> getEntries() {
        return LLILLL;
    }

    static {
        C163W c163w = new C163W("NETWORK_ERROR", 0, 1);
        NETWORK_ERROR = c163w;
        C163W c163w2 = new C163W("SERVER_ERROR", 1, 2);
        SERVER_ERROR = c163w2;
        C163W c163w3 = new C163W("CLIENT_ERROR", 2, 3);
        CLIENT_ERROR = c163w3;
        C163W[] c163wArr = {c163w, c163w2, c163w3};
        LLILLJJLI = c163wArr;
        LLILLL = new C2254308sP(c163wArr);
    }

    public static C163W[] values() {
        return (C163W[]) LLILLJJLI.clone();
    }

    public final int getErrorCode() {
        return this.LL;
    }

    public static C163W valueOf(String str) {
        return (C163W) C08FF.LIZ(C163W.class, str);
    }

    public C163W(String str, int i, int i2) {
        this.LL = i2;
    }
}
