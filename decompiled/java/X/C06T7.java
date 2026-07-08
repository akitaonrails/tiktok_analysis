package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.06T7, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
public final class C06T7 {
    public static final C06T7 APP_START;
    public static final C06T7 CONVERSATION_PRELOAD;
    public static final C06T7 INBOX_ENTER;
    public static final /* synthetic */ C06T7[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final C06T7 MESSAGE_LOAD;
    public static final C06T7 RETRY;

    public static InterfaceC2044707zh<C06T7> getEntries() {
        return LLILLJJLI;
    }

    static {
        C06T7 c06t7 = new C06T7("APP_START", 0);
        APP_START = c06t7;
        C06T7 c06t72 = new C06T7("INBOX_ENTER", 1);
        INBOX_ENTER = c06t72;
        C06T7 c06t73 = new C06T7("CONVERSATION_PRELOAD", 2);
        CONVERSATION_PRELOAD = c06t73;
        C06T7 c06t74 = new C06T7("MESSAGE_LOAD", 3);
        MESSAGE_LOAD = c06t74;
        C06T7 c06t75 = new C06T7("RETRY", 4);
        RETRY = c06t75;
        C06T7[] c06t7Arr = {c06t7, c06t72, c06t73, c06t74, c06t75};
        LL = c06t7Arr;
        LLILLJJLI = new C2254308sP(c06t7Arr);
    }

    public static C06T7[] values() {
        return (C06T7[]) LL.clone();
    }

    public final boolean isFromLogin() {
        return this == APP_START || this == INBOX_ENTER;
    }

    public final boolean isPreload() {
        return isFromLogin() || this == CONVERSATION_PRELOAD;
    }

    public static C06T7 valueOf(String str) {
        return (C06T7) C08FF.LIZ(C06T7.class, str);
    }

    public C06T7(String str, int i) {
    }
}
