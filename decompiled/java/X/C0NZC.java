package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0NZC, reason: invalid class name */
/* JADX INFO: loaded from: classes10.dex */
public final class C0NZC {
    public static final C0NZC CONVERSATION_NOT_FOUND;
    public static final C0NZC ILLEGAL_STATUS;
    public static final C0NZC INIT_MSG_FAIL;
    public static final /* synthetic */ C0NZC[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;

    public static InterfaceC2044707zh<C0NZC> getEntries() {
        return LLILLJJLI;
    }

    static {
        C0NZC c0nzc = new C0NZC("ILLEGAL_STATUS", 0);
        ILLEGAL_STATUS = c0nzc;
        C0NZC c0nzc2 = new C0NZC("CONVERSATION_NOT_FOUND", 1);
        CONVERSATION_NOT_FOUND = c0nzc2;
        C0NZC c0nzc3 = new C0NZC("INIT_MSG_FAIL", 2);
        INIT_MSG_FAIL = c0nzc3;
        C0NZC[] c0nzcArr = {c0nzc, c0nzc2, c0nzc3};
        LL = c0nzcArr;
        LLILLJJLI = new C2254308sP(c0nzcArr);
    }

    public static C0NZC[] values() {
        return (C0NZC[]) LL.clone();
    }

    public static C0NZC valueOf(String str) {
        return (C0NZC) C08FF.LIZ(C0NZC.class, str);
    }

    public C0NZC(String str, int i) {
    }
}
