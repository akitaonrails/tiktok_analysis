package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0ZU4, reason: invalid class name */
/* JADX INFO: loaded from: classes15.dex */
public final class C0ZU4 {
    public static final C0ZU4 CHAT;
    public static final C0ZU4 DETAIL_MEDIA_GRID;
    public static final C0ZU4 DETAIL_SEARCH;
    public static final /* synthetic */ C0ZU4[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;

    public static InterfaceC2044707zh<C0ZU4> getEntries() {
        return LLILLJJLI;
    }

    static {
        C0ZU4 c0zu4 = new C0ZU4("CHAT", 0);
        CHAT = c0zu4;
        C0ZU4 c0zu42 = new C0ZU4("DETAIL_MEDIA_GRID", 1);
        DETAIL_MEDIA_GRID = c0zu42;
        C0ZU4 c0zu43 = new C0ZU4("DETAIL_SEARCH", 2);
        DETAIL_SEARCH = c0zu43;
        C0ZU4[] c0zu4Arr = {c0zu4, c0zu42, c0zu43};
        LL = c0zu4Arr;
        LLILLJJLI = new C2254308sP(c0zu4Arr);
    }

    public static C0ZU4[] values() {
        return (C0ZU4[]) LL.clone();
    }

    public static C0ZU4 valueOf(String str) {
        return (C0ZU4) C08FF.LIZ(C0ZU4.class, str);
    }

    public C0ZU4(String str, int i) {
    }
}
