package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0LQ4, reason: invalid class name */
/* JADX INFO: loaded from: classes9.dex */
public final class C0LQ4 implements C0LQB {
    public static final C0LQ4 CLOUD_DRAFT_NAVIGATE;
    public static final C0LQ4 DRAFT_BOX;
    public static final /* synthetic */ C0LQ4[] LLILLL;
    public static final /* synthetic */ C2254308sP LLILZ;
    public static final C0LQ4 PUSH_ARRIVAL;
    public static final C0LQ4 PUSH_CLICK;
    public final String LL;
    public final C0LQ6 LLILLJJLI;

    public C0LQ4() {
        throw null;
    }

    public static InterfaceC2044707zh<C0LQ4> getEntries() {
        return LLILZ;
    }

    static {
        C0LQ4 c0lq4 = new C0LQ4("PUSH_ARRIVAL", 0, "reconcile_push_arrival");
        PUSH_ARRIVAL = c0lq4;
        C0LQ4 c0lq42 = new C0LQ4("PUSH_CLICK", 1, "reconcile_push_click");
        PUSH_CLICK = c0lq42;
        C0LQ4 c0lq43 = new C0LQ4("CLOUD_DRAFT_NAVIGATE", 2, "reconcile_cloud_draft_navigate");
        CLOUD_DRAFT_NAVIGATE = c0lq43;
        C0LQ4 c0lq44 = new C0LQ4("DRAFT_BOX", 3, "reconcile_draft_box");
        DRAFT_BOX = c0lq44;
        C0LQ4[] c0lq4Arr = {c0lq4, c0lq42, c0lq43, c0lq44};
        LLILLL = c0lq4Arr;
        LLILZ = new C2254308sP(c0lq4Arr);
    }

    public static C0LQ4[] values() {
        return (C0LQ4[]) LLILLL.clone();
    }

    @Override // X.C0LQB
    public String getBranchName() {
        return this.LL;
    }

    @Override // X.C0LQB
    public C0LQ6 getScope() {
        return this.LLILLJJLI;
    }

    public static C0LQ4 valueOf(String str) {
        return (C0LQ4) C08FF.LIZ(C0LQ4.class, str);
    }

    public C0LQ4(String str, int i, String str2) {
        C0LQ6 c0lq6 = C0LQ6.GLOBAL;
        this.LL = str2;
        this.LLILLJJLI = c0lq6;
    }
}
