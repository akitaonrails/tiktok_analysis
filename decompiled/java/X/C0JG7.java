package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0JG7, reason: invalid class name */
/* JADX INFO: loaded from: classes8.dex */
public final class C0JG7 {
    public static final C0JG7 CURRENT_ANCHOR;
    public static final C0JG7 GUEST_ANCHOR;
    public static final C0JG7 GUEST_AUDIENCE;
    public static final /* synthetic */ C0JG7[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final C0JG7 NORMAL_AUDIENCE;

    public static InterfaceC2044707zh<C0JG7> getEntries() {
        return LLILLJJLI;
    }

    static {
        C0JG7 c0jg7 = new C0JG7("NORMAL_AUDIENCE", 0);
        NORMAL_AUDIENCE = c0jg7;
        C0JG7 c0jg72 = new C0JG7("GUEST_AUDIENCE", 1);
        GUEST_AUDIENCE = c0jg72;
        C0JG7 c0jg73 = new C0JG7("CURRENT_ANCHOR", 2);
        CURRENT_ANCHOR = c0jg73;
        C0JG7 c0jg74 = new C0JG7("GUEST_ANCHOR", 3);
        GUEST_ANCHOR = c0jg74;
        C0JG7[] c0jg7Arr = {c0jg7, c0jg72, c0jg73, c0jg74};
        LL = c0jg7Arr;
        LLILLJJLI = new C2254308sP(c0jg7Arr);
    }

    public static C0JG7[] values() {
        return (C0JG7[]) LL.clone();
    }

    public static C0JG7 valueOf(String str) {
        return (C0JG7) C08FF.LIZ(C0JG7.class, str);
    }

    public C0JG7(String str, int i) {
    }
}
