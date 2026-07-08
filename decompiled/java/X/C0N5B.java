package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0N5B, reason: invalid class name */
/* JADX INFO: loaded from: classes10.dex */
public final class C0N5B {
    public static final C0N5B CLIENT_2_CLIENT;
    public static final C0N5B CLIENT_2_CLOUD;
    public static final C0N5B CLOUD_2_CLIENT;
    public static final C0N5B CLOUD_2_CLOUD;
    public static final /* synthetic */ C0N5B[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public final String LL;

    public static InterfaceC2044707zh<C0N5B> getEntries() {
        return LLILLL;
    }

    static {
        C0N5B c0n5b = new C0N5B("CLIENT_2_CLIENT", 0, "client2client");
        CLIENT_2_CLIENT = c0n5b;
        C0N5B c0n5b2 = new C0N5B("CLIENT_2_CLOUD", 1, "client2cloud");
        CLIENT_2_CLOUD = c0n5b2;
        C0N5B c0n5b3 = new C0N5B("CLOUD_2_CLIENT", 2, "cloud2client");
        CLOUD_2_CLIENT = c0n5b3;
        C0N5B c0n5b4 = new C0N5B("CLOUD_2_CLOUD", 3, "cloud2cloud");
        CLOUD_2_CLOUD = c0n5b4;
        C0N5B[] c0n5bArr = {c0n5b, c0n5b2, c0n5b3, c0n5b4};
        LLILLJJLI = c0n5bArr;
        LLILLL = new C2254308sP(c0n5bArr);
    }

    public static C0N5B[] values() {
        return (C0N5B[]) LLILLJJLI.clone();
    }

    public final String getValue() {
        return this.LL;
    }

    public static C0N5B valueOf(String str) {
        return (C0N5B) C08FF.LIZ(C0N5B.class, str);
    }

    public C0N5B(String str, int i, String str2) {
        this.LL = str2;
    }
}
