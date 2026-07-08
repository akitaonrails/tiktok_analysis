package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.15UE, reason: invalid class name */
/* JADX INFO: loaded from: classes32.dex */
public final class C15UE {
    public static final C15UE BECOME_INACTIVE;
    public static final /* synthetic */ C15UE[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final C15UE OTHER;
    public static final C15UE RETURN_FROM_DETAIL;
    public final String LL;

    public static InterfaceC2044707zh<C15UE> getEntries() {
        return LLILLL;
    }

    static {
        C15UE c15ue = new C15UE("RETURN_FROM_DETAIL", 0, "return_from_detail");
        RETURN_FROM_DETAIL = c15ue;
        C15UE c15ue2 = new C15UE("BECOME_INACTIVE", 1, "become_inactive");
        BECOME_INACTIVE = c15ue2;
        C15UE c15ue3 = new C15UE("OTHER", 2, "other");
        OTHER = c15ue3;
        C15UE[] c15ueArr = {c15ue, c15ue2, c15ue3};
        LLILLJJLI = c15ueArr;
        LLILLL = new C2254308sP(c15ueArr);
    }

    public static C15UE[] values() {
        return (C15UE[]) LLILLJJLI.clone();
    }

    public final String getValue() {
        return this.LL;
    }

    public static C15UE valueOf(String str) {
        return (C15UE) C08FF.LIZ(C15UE.class, str);
    }

    public C15UE(String str, int i, String str2) {
        this.LL = str2;
    }
}
