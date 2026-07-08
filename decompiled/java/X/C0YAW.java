package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0YAW, reason: invalid class name */
/* JADX INFO: loaded from: classes15.dex */
public final class C0YAW {
    public static final C0YAW COLUMN_CONV_ID;
    public static final C0YAW COLUMN_KEY;
    public static final C0YAW COLUMN_VALUE;
    public static final /* synthetic */ C0YAW[] LLILLL;
    public static final /* synthetic */ C2254308sP LLILZ;
    public final String LL;
    public final String LLILLJJLI = "TEXT";

    public static InterfaceC2044707zh<C0YAW> getEntries() {
        return LLILZ;
    }

    static {
        C0YAW c0yaw = new C0YAW("COLUMN_CONV_ID", 0, "conv_id");
        COLUMN_CONV_ID = c0yaw;
        C0YAW c0yaw2 = new C0YAW("COLUMN_KEY", 1, "key");
        COLUMN_KEY = c0yaw2;
        C0YAW c0yaw3 = new C0YAW("COLUMN_VALUE", 2, "value");
        COLUMN_VALUE = c0yaw3;
        C0YAW[] c0yawArr = {c0yaw, c0yaw2, c0yaw3};
        LLILLL = c0yawArr;
        LLILZ = new C2254308sP(c0yawArr);
    }

    public static C0YAW[] values() {
        return (C0YAW[]) LLILLL.clone();
    }

    public final String getKey() {
        return this.LL;
    }

    public final String getType() {
        return this.LLILLJJLI;
    }

    public static C0YAW valueOf(String str) {
        return (C0YAW) C08FF.LIZ(C0YAW.class, str);
    }

    public C0YAW(String str, int i, String str2) {
        this.LL = str2;
    }
}
