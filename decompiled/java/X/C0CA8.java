package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0CA8, reason: invalid class name */
/* JADX INFO: loaded from: classes5.dex */
public final class C0CA8 {
    public static final C0CA8 IDX_REOPEN_DEADLINE;
    public static final /* synthetic */ C0CA8[] LLILLL;
    public static final /* synthetic */ C2254308sP LLILZ;
    public final String LL = "idx_reopen_deadline";
    public final String LLILLJJLI = "reopen_deadline_time";

    public static InterfaceC2044707zh<C0CA8> getEntries() {
        return LLILZ;
    }

    static {
        C0CA8 c0ca8 = new C0CA8();
        IDX_REOPEN_DEADLINE = c0ca8;
        C0CA8[] c0ca8Arr = {c0ca8};
        LLILLL = c0ca8Arr;
        LLILZ = new C2254308sP(c0ca8Arr);
    }

    public static C0CA8[] values() {
        return (C0CA8[]) LLILLL.clone();
    }

    public final String getColumns() {
        return this.LLILLJJLI;
    }

    public final String getIndexName() {
        return this.LL;
    }

    public static C0CA8 valueOf(String str) {
        return (C0CA8) C08FF.LIZ(C0CA8.class, str);
    }
}
