package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.1A62, reason: invalid class name */
/* JADX INFO: loaded from: classes34.dex */
public final class C1A62 {
    public static final /* synthetic */ C1A62[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final C1A62 MORE;
    public static final C1A62 REPORT;

    public static InterfaceC2044707zh<C1A62> getEntries() {
        return LLILLJJLI;
    }

    static {
        C1A62 c1a62 = new C1A62("REPORT", 0);
        REPORT = c1a62;
        C1A62 c1a622 = new C1A62("MORE", 1);
        MORE = c1a622;
        C1A62[] c1a62Arr = {c1a62, c1a622};
        LL = c1a62Arr;
        LLILLJJLI = new C2254308sP(c1a62Arr);
    }

    public static C1A62[] values() {
        return (C1A62[]) LL.clone();
    }

    public static C1A62 valueOf(String str) {
        return (C1A62) C08FF.LIZ(C1A62.class, str);
    }

    public C1A62(String str, int i) {
    }
}
