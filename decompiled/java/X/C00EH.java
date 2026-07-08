package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.00EH, reason: invalid class name */
/* JADX INFO: loaded from: classes.dex */
public final class C00EH {
    public static final C00EH COMMERCE_AGENT_MSG_INTERCEPT_TYPE_NORMAL;
    public static final C00EH COMMERCE_AGENT_MSG_INTERCEPT_TYPE_TNS_BLOCKED;
    public static final /* synthetic */ C00EH[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;

    public static InterfaceC2044707zh<C00EH> getEntries() {
        return LLILLJJLI;
    }

    static {
        C00EH c00eh = new C00EH("COMMERCE_AGENT_MSG_INTERCEPT_TYPE_NORMAL", 0);
        COMMERCE_AGENT_MSG_INTERCEPT_TYPE_NORMAL = c00eh;
        C00EH c00eh2 = new C00EH("COMMERCE_AGENT_MSG_INTERCEPT_TYPE_TNS_BLOCKED", 1);
        COMMERCE_AGENT_MSG_INTERCEPT_TYPE_TNS_BLOCKED = c00eh2;
        C00EH[] c00ehArr = {c00eh, c00eh2};
        LL = c00ehArr;
        LLILLJJLI = new C2254308sP(c00ehArr);
    }

    public static C00EH[] values() {
        return (C00EH[]) LL.clone();
    }

    public static C00EH valueOf(String str) {
        return (C00EH) C08FF.LIZ(C00EH.class, str);
    }

    public C00EH(String str, int i) {
    }
}
