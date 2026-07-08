package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0D90, reason: invalid class name */
/* JADX INFO: loaded from: classes5.dex */
public final class C0D90 {
    public static final C0D90 LL;
    public static final C0D90 LLILLJJLI;
    public static final /* synthetic */ C0D90[] LLILLL;

    static {
        C0D90 c0d90 = new C0D90("OneStepOwner", 0);
        LL = c0d90;
        C0D90 c0d902 = new C0D90("CheckoutOwner", 1);
        LLILLJJLI = c0d902;
        C0D90[] c0d90Arr = {c0d90, c0d902};
        LLILLL = c0d90Arr;
        new C2254308sP(c0d90Arr);
    }

    public static C0D90[] values() {
        return (C0D90[]) LLILLL.clone();
    }

    public static C0D90 valueOf(String str) {
        return (C0D90) C08FF.LIZ(C0D90.class, str);
    }

    public C0D90(String str, int i) {
    }
}
