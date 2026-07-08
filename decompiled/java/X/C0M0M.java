package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0M0M, reason: invalid class name */
/* JADX INFO: loaded from: classes9.dex */
public final class C0M0M {
    public static final C0M0M LIVE_PHOTO;
    public static final /* synthetic */ C0M0M[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final C0M0M PHOTO;
    public static final C0M0M TEXT;

    public static InterfaceC2044707zh<C0M0M> getEntries() {
        return LLILLJJLI;
    }

    static {
        C0M0M c0m0m = new C0M0M("TEXT", 0);
        TEXT = c0m0m;
        C0M0M c0m0m2 = new C0M0M("PHOTO", 1);
        PHOTO = c0m0m2;
        C0M0M c0m0m3 = new C0M0M("LIVE_PHOTO", 2);
        LIVE_PHOTO = c0m0m3;
        C0M0M[] c0m0mArr = {c0m0m, c0m0m2, c0m0m3};
        LL = c0m0mArr;
        LLILLJJLI = new C2254308sP(c0m0mArr);
    }

    public static C0M0M[] values() {
        return (C0M0M[]) LL.clone();
    }

    public static C0M0M valueOf(String str) {
        return (C0M0M) C08FF.LIZ(C0M0M.class, str);
    }

    public C0M0M(String str, int i) {
    }
}
