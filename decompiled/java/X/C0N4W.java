package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0N4W, reason: invalid class name */
/* JADX INFO: loaded from: classes10.dex */
public final class C0N4W {
    public static final C0N4W INVALID_INPUT_PARAMS;
    public static final /* synthetic */ C0N4W[] LLILLL;
    public static final /* synthetic */ C2254308sP LLILZ;
    public static final C0N4W SUCCESS;
    public final int LL;
    public final String LLILLJJLI;

    public static InterfaceC2044707zh<C0N4W> getEntries() {
        return LLILZ;
    }

    static {
        C0N4W c0n4w = new C0N4W("SUCCESS", 0, 0, "success");
        SUCCESS = c0n4w;
        C0N4W c0n4w2 = new C0N4W("INVALID_INPUT_PARAMS", 1, -10000, "params is null");
        INVALID_INPUT_PARAMS = c0n4w2;
        C0N4W[] c0n4wArr = {c0n4w, c0n4w2};
        LLILLL = c0n4wArr;
        LLILZ = new C2254308sP(c0n4wArr);
    }

    public static C0N4W[] values() {
        return (C0N4W[]) LLILLL.clone();
    }

    public final int getCode() {
        return this.LL;
    }

    public final String getMessage() {
        return this.LLILLJJLI;
    }

    public static C0N4W valueOf(String str) {
        return (C0N4W) C08FF.LIZ(C0N4W.class, str);
    }

    public C0N4W(String str, int i, int i2, String str2) {
        this.LL = i2;
        this.LLILLJJLI = str2;
    }
}
