package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0U0K, reason: invalid class name */
/* JADX INFO: loaded from: classes13.dex */
public final class C0U0K {
    public static final C0U0K ADD_FAV;
    public static final /* synthetic */ C0U0K[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final C0U0K REMOVE_FAV;
    public final String LL;

    public static InterfaceC2044707zh<C0U0K> getEntries() {
        return LLILLL;
    }

    static {
        C0U0K c0u0k = new C0U0K("ADD_FAV", 0, "favorite");
        ADD_FAV = c0u0k;
        C0U0K c0u0k2 = new C0U0K("REMOVE_FAV", 1, "cancel_favorite");
        REMOVE_FAV = c0u0k2;
        C0U0K[] c0u0kArr = {c0u0k, c0u0k2};
        LLILLJJLI = c0u0kArr;
        LLILLL = new C2254308sP(c0u0kArr);
    }

    public static C0U0K[] values() {
        return (C0U0K[]) LLILLJJLI.clone();
    }

    public final String getValue() {
        return this.LL;
    }

    public static C0U0K valueOf(String str) {
        return (C0U0K) C08FF.LIZ(C0U0K.class, str);
    }

    public C0U0K(String str, int i, String str2) {
        this.LL = str2;
    }
}
