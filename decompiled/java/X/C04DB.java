package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.04DB, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
public final class C04DB {
    public static final C04DB HEAD_PAGER;
    public static final /* synthetic */ C04DB[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final C04DB SKU_ENTRANCE;

    public static InterfaceC2044707zh<C04DB> getEntries() {
        return LLILLJJLI;
    }

    static {
        C04DB c04db = new C04DB("HEAD_PAGER", 0);
        HEAD_PAGER = c04db;
        C04DB c04db2 = new C04DB("SKU_ENTRANCE", 1);
        SKU_ENTRANCE = c04db2;
        C04DB[] c04dbArr = {c04db, c04db2};
        LL = c04dbArr;
        LLILLJJLI = new C2254308sP(c04dbArr);
    }

    public static C04DB[] values() {
        return (C04DB[]) LL.clone();
    }

    public static C04DB valueOf(String str) {
        return (C04DB) C08FF.LIZ(C04DB.class, str);
    }

    public C04DB(String str, int i) {
    }
}
