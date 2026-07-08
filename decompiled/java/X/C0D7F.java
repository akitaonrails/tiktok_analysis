package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0D7F, reason: invalid class name */
/* JADX INFO: loaded from: classes5.dex */
public final class C0D7F {
    public static final C0D7F LL;
    public static final C0D7F LLILLJJLI;
    public static final C0D7F LLILLL;
    public static final /* synthetic */ C0D7F[] LLILZ;

    static {
        C0D7F c0d7f = new C0D7F("NETWORK", 0);
        LL = c0d7f;
        C0D7F c0d7f2 = new C0D7F("PARSING", 1);
        LLILLJJLI = c0d7f2;
        C0D7F c0d7f3 = new C0D7F("PROTOCOL", 2);
        LLILLL = c0d7f3;
        C0D7F[] c0d7fArr = {c0d7f, c0d7f2, c0d7f3};
        LLILZ = c0d7fArr;
        new C2254308sP(c0d7fArr);
    }

    public static C0D7F[] values() {
        return (C0D7F[]) LLILZ.clone();
    }

    public static C0D7F valueOf(String str) {
        return (C0D7F) C08FF.LIZ(C0D7F.class, str);
    }

    public C0D7F(String str, int i) {
    }
}
