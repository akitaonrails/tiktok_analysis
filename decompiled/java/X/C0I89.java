package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0I89, reason: invalid class name */
/* JADX INFO: loaded from: classes7.dex */
public final class C0I89 {
    public static final C0I89 EYE_SLASH;
    public static final /* synthetic */ C0I89[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final C0I89 NONE;
    public static final C0I89 PLAY;

    public static InterfaceC2044707zh<C0I89> getEntries() {
        return LLILLJJLI;
    }

    static {
        C0I89 c0i89 = new C0I89("PLAY", 0);
        PLAY = c0i89;
        C0I89 c0i892 = new C0I89("NONE", 1);
        NONE = c0i892;
        C0I89 c0i893 = new C0I89("EYE_SLASH", 2);
        EYE_SLASH = c0i893;
        C0I89[] c0i89Arr = {c0i89, c0i892, c0i893};
        LL = c0i89Arr;
        LLILLJJLI = new C2254308sP(c0i89Arr);
    }

    public static C0I89[] values() {
        return (C0I89[]) LL.clone();
    }

    public static C0I89 valueOf(String str) {
        return (C0I89) C08FF.LIZ(C0I89.class, str);
    }

    public C0I89(String str, int i) {
    }
}
