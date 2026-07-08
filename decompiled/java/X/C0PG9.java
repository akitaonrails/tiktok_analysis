package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0PG9, reason: invalid class name */
/* JADX INFO: loaded from: classes11.dex */
public final class C0PG9 {
    public static final C0PG9 DISLIKE;
    public static final C0PG9 INFLOW_CONSUMED_DUPLICATE;
    public static final C0PG9 INFLOW_REPLACE;
    public static final /* synthetic */ C0PG9[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;

    public static InterfaceC2044707zh<C0PG9> getEntries() {
        return LLILLJJLI;
    }

    static {
        C0PG9 c0pg9 = new C0PG9("DISLIKE", 0);
        DISLIKE = c0pg9;
        C0PG9 c0pg92 = new C0PG9("INFLOW_CONSUMED_DUPLICATE", 1);
        INFLOW_CONSUMED_DUPLICATE = c0pg92;
        C0PG9 c0pg93 = new C0PG9("INFLOW_REPLACE", 2);
        INFLOW_REPLACE = c0pg93;
        C0PG9[] c0pg9Arr = {c0pg9, c0pg92, c0pg93};
        LL = c0pg9Arr;
        LLILLJJLI = new C2254308sP(c0pg9Arr);
    }

    public static C0PG9[] values() {
        return (C0PG9[]) LL.clone();
    }

    public static C0PG9 valueOf(String str) {
        return (C0PG9) C08FF.LIZ(C0PG9.class, str);
    }

    public C0PG9(String str, int i) {
    }
}
