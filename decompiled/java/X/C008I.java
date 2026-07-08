package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.008I, reason: invalid class name */
/* JADX INFO: loaded from: classes.dex */
public final class C008I {
    public static final /* synthetic */ C008I[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final C008I ON_GET_MESSAGE;
    public static final C008I ON_LOAD_OLDER_MESSAGES;
    public static final C008I ON_QUERY_MESSAGE;

    public static InterfaceC2044707zh<C008I> getEntries() {
        return LLILLJJLI;
    }

    static {
        C008I c008i = new C008I("ON_GET_MESSAGE", 0);
        ON_GET_MESSAGE = c008i;
        C008I c008i2 = new C008I("ON_QUERY_MESSAGE", 1);
        ON_QUERY_MESSAGE = c008i2;
        C008I c008i3 = new C008I("ON_LOAD_OLDER_MESSAGES", 2);
        ON_LOAD_OLDER_MESSAGES = c008i3;
        C008I[] c008iArr = {c008i, c008i2, c008i3};
        LL = c008iArr;
        LLILLJJLI = new C2254308sP(c008iArr);
    }

    public static C008I[] values() {
        return (C008I[]) LL.clone();
    }

    public static C008I valueOf(String str) {
        return (C008I) C08FF.LIZ(C008I.class, str);
    }

    public C008I(String str, int i) {
    }
}
