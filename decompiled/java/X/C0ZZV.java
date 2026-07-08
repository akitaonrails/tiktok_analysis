package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0ZZV, reason: invalid class name */
/* JADX INFO: loaded from: classes15.dex */
public final class C0ZZV {
    public static final C0ZZV ERROR_CODE_AGE_RESTRICTION;
    public static final C0ZZV ERROR_CODE_EC_LIMIT;
    public static final C0ZZV ERROR_CODE_EC_LIMIT_RM_CHILD;
    public static final C0ZZV ERROR_CODE_EC_LIMIT_RM_PARENT;
    public static final C0ZZV ERROR_CODE_LCC_RESTRICTION;
    public static final C0ZZV ERROR_CODE_REGION_BLOCK;
    public static final C0ZZV ERROR_CODE_RESTRICTED_MODE_CHILD;
    public static final C0ZZV ERROR_CODE_RESTRICTED_MODE_PARENT;
    public static final /* synthetic */ C0ZZV[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;

    public static InterfaceC2044707zh<C0ZZV> getEntries() {
        return LLILLJJLI;
    }

    static {
        C0ZZV c0zzv = new C0ZZV("ERROR_CODE_AGE_RESTRICTION", 0);
        ERROR_CODE_AGE_RESTRICTION = c0zzv;
        C0ZZV c0zzv2 = new C0ZZV("ERROR_CODE_LCC_RESTRICTION", 1);
        ERROR_CODE_LCC_RESTRICTION = c0zzv2;
        C0ZZV c0zzv3 = new C0ZZV("ERROR_CODE_REGION_BLOCK", 2);
        ERROR_CODE_REGION_BLOCK = c0zzv3;
        C0ZZV c0zzv4 = new C0ZZV("ERROR_CODE_RESTRICTED_MODE_CHILD", 3);
        ERROR_CODE_RESTRICTED_MODE_CHILD = c0zzv4;
        C0ZZV c0zzv5 = new C0ZZV("ERROR_CODE_RESTRICTED_MODE_PARENT", 4);
        ERROR_CODE_RESTRICTED_MODE_PARENT = c0zzv5;
        C0ZZV c0zzv6 = new C0ZZV("ERROR_CODE_EC_LIMIT", 5);
        ERROR_CODE_EC_LIMIT = c0zzv6;
        C0ZZV c0zzv7 = new C0ZZV("ERROR_CODE_EC_LIMIT_RM_PARENT", 6);
        ERROR_CODE_EC_LIMIT_RM_PARENT = c0zzv7;
        C0ZZV c0zzv8 = new C0ZZV("ERROR_CODE_EC_LIMIT_RM_CHILD", 7);
        ERROR_CODE_EC_LIMIT_RM_CHILD = c0zzv8;
        C0ZZV[] c0zzvArr = {c0zzv, c0zzv2, c0zzv3, c0zzv4, c0zzv5, c0zzv6, c0zzv7, c0zzv8};
        LL = c0zzvArr;
        LLILLJJLI = new C2254308sP(c0zzvArr);
    }

    public static C0ZZV[] values() {
        return (C0ZZV[]) LL.clone();
    }

    public static C0ZZV valueOf(String str) {
        return (C0ZZV) C08FF.LIZ(C0ZZV.class, str);
    }

    public C0ZZV(String str, int i) {
    }
}
