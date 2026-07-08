package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0PK8, reason: invalid class name */
/* JADX INFO: loaded from: classes11.dex */
public final class C0PK8 {
    public static final C0PK8 BRAND_HYBRID_AD;
    public static final /* synthetic */ C0PK8[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final C0PK8 MULTI_AD;
    public static final C0PK8 SINGLE_AD;

    public static InterfaceC2044707zh<C0PK8> getEntries() {
        return LLILLJJLI;
    }

    static {
        C0PK8 c0pk8 = new C0PK8("SINGLE_AD", 0);
        SINGLE_AD = c0pk8;
        C0PK8 c0pk82 = new C0PK8("MULTI_AD", 1);
        MULTI_AD = c0pk82;
        C0PK8 c0pk83 = new C0PK8("BRAND_HYBRID_AD", 2);
        BRAND_HYBRID_AD = c0pk83;
        C0PK8[] c0pk8Arr = {c0pk8, c0pk82, c0pk83};
        LL = c0pk8Arr;
        LLILLJJLI = new C2254308sP(c0pk8Arr);
    }

    public static C0PK8[] values() {
        return (C0PK8[]) LL.clone();
    }

    public static C0PK8 valueOf(String str) {
        return (C0PK8) C08FF.LIZ(C0PK8.class, str);
    }

    public C0PK8(String str, int i) {
    }
}
