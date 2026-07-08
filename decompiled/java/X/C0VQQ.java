package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0VQQ, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0VQQ {
    public static final C0VQQ COLUMN_BUSINESS_TYPE;
    public static final C0VQQ COLUMN_DATA;
    public static final C0VQQ COLUMN_ID;
    public static final C0VQQ COLUMN_TARGET_TYPE;
    public static final /* synthetic */ C0VQQ[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public final boolean isPrimaryKey;
    public final String key;
    public final boolean nullable;
    public final String type;

    public static InterfaceC2044707zh<C0VQQ> getEntries() {
        return LLILLJJLI;
    }

    static {
        C0VQQ c0vqq = new C0VQQ(0, "COLUMN_ID", true, "ID", "TEXT", false);
        COLUMN_ID = c0vqq;
        C0VQQ c0vqq2 = new C0VQQ(1, "COLUMN_TARGET_TYPE", true, "TARGET_TYPE", "INTEGER", false);
        COLUMN_TARGET_TYPE = c0vqq2;
        C0VQQ c0vqq3 = new C0VQQ(2, "COLUMN_BUSINESS_TYPE", true, "BUSINESS_TYPE", "INTEGER", false);
        COLUMN_BUSINESS_TYPE = c0vqq3;
        C0VQQ c0vqq4 = new C0VQQ(3, "COLUMN_DATA", false, "DATA", "TEXT", true);
        COLUMN_DATA = c0vqq4;
        C0VQQ[] c0vqqArr = {c0vqq, c0vqq2, c0vqq3, c0vqq4};
        LL = c0vqqArr;
        LLILLJJLI = new C2254308sP(c0vqqArr);
    }

    public static C0VQQ[] values() {
        return (C0VQQ[]) LL.clone();
    }

    public static C0VQQ valueOf(String str) {
        return (C0VQQ) C08FF.LIZ(C0VQQ.class, str);
    }

    public C0VQQ(int i, String str, boolean z, String str2, String str3, boolean z2) {
        this.key = str2;
        this.type = str3;
        this.isPrimaryKey = z;
        this.nullable = z2;
    }
}
