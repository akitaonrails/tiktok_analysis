package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0CAA, reason: invalid class name */
/* JADX INFO: loaded from: classes5.dex */
public final class C0CAA {
    public static final C0CAA IDX_BOARD_ID;
    public static final C0CAA IDX_CREATE_TIME;
    public static final C0CAA IDX_PUBLISH_USER;
    public static final C0CAA IDX_STATUS_READ;
    public static final C0CAA IDX_TYPE_STATUS;
    public static final /* synthetic */ C0CAA[] LLILLL;
    public static final /* synthetic */ C2254308sP LLILZ;
    public final String LL;
    public final String LLILLJJLI;

    public static InterfaceC2044707zh<C0CAA> getEntries() {
        return LLILZ;
    }

    static {
        C0CAA c0caa = new C0CAA("IDX_BOARD_ID", 0, "idx_bulletin_board_id", "bulletin_board_id");
        IDX_BOARD_ID = c0caa;
        C0CAA c0caa2 = new C0CAA("IDX_PUBLISH_USER", 1, "idx_publish_user", "publish_user_id");
        IDX_PUBLISH_USER = c0caa2;
        C0CAA c0caa3 = new C0CAA("IDX_CREATE_TIME", 2, "idx_create_time", "create_time DESC");
        IDX_CREATE_TIME = c0caa3;
        C0CAA c0caa4 = new C0CAA("IDX_STATUS_READ", 3, "idx_status_read", "status, has_read");
        IDX_STATUS_READ = c0caa4;
        C0CAA c0caa5 = new C0CAA("IDX_TYPE_STATUS", 4, "idx_type_status", "type, status");
        IDX_TYPE_STATUS = c0caa5;
        C0CAA[] c0caaArr = {c0caa, c0caa2, c0caa3, c0caa4, c0caa5};
        LLILLL = c0caaArr;
        LLILZ = new C2254308sP(c0caaArr);
    }

    public static C0CAA[] values() {
        return (C0CAA[]) LLILLL.clone();
    }

    public final String getColumns() {
        return this.LLILLJJLI;
    }

    public final String getIndexName() {
        return this.LL;
    }

    public static C0CAA valueOf(String str) {
        return (C0CAA) C08FF.LIZ(C0CAA.class, str);
    }

    public C0CAA(String str, int i, String str2, String str3) {
        this.LL = str2;
        this.LLILLJJLI = str3;
    }
}
