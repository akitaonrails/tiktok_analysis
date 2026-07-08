package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0UQL, reason: invalid class name */
/* JADX INFO: loaded from: classes13.dex */
public final class C0UQL {
    public static final C0UQM Companion;
    public static final C0UQL DECOUPLING;
    public static final /* synthetic */ C0UQL[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final C0UQL PLAYBOOK;
    public static final C0UQL POPUP_PANEL_URL_SCHEMA;
    public static final C0UQL SMB_KYC_KYB_GUIDE;
    public final int LL;

    public static InterfaceC2044707zh<C0UQL> getEntries() {
        return LLILLL;
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [X.0UQM] */
    static {
        C0UQL c0uql = new C0UQL("POPUP_PANEL_URL_SCHEMA", 0, 1);
        POPUP_PANEL_URL_SCHEMA = c0uql;
        C0UQL c0uql2 = new C0UQL("PLAYBOOK", 1, 2);
        PLAYBOOK = c0uql2;
        C0UQL c0uql3 = new C0UQL("DECOUPLING", 2, 3);
        DECOUPLING = c0uql3;
        C0UQL c0uql4 = new C0UQL("SMB_KYC_KYB_GUIDE", 3, 4);
        SMB_KYC_KYB_GUIDE = c0uql4;
        C0UQL[] c0uqlArr = {c0uql, c0uql2, c0uql3, c0uql4};
        LLILLJJLI = c0uqlArr;
        LLILLL = new C2254308sP(c0uqlArr);
        Companion = new Object() { // from class: X.0UQM
        };
    }

    public static C0UQL[] values() {
        return (C0UQL[]) LLILLJJLI.clone();
    }

    public final int getPriority() {
        return this.LL;
    }

    public static C0UQL valueOf(String str) {
        return (C0UQL) C08FF.LIZ(C0UQL.class, str);
    }

    public C0UQL(String str, int i, int i2) {
        this.LL = i2;
    }
}
