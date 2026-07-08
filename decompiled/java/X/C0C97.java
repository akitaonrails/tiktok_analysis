package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0C97, reason: invalid class name */
/* JADX INFO: loaded from: classes5.dex */
public final class C0C97 {
    public static final C0C97 ACTION_BAR_CLICK;
    public static final C0C97 CHAT_LIST_CLICK;
    public static final C0C97 INNER_PUSH_CLICK;
    public static final /* synthetic */ C0C97[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public final String LL;

    public static InterfaceC2044707zh<C0C97> getEntries() {
        return LLILLL;
    }

    static {
        C0C97 c0c97 = new C0C97("CHAT_LIST_CLICK", 0, "chat_list_click");
        CHAT_LIST_CLICK = c0c97;
        C0C97 c0c972 = new C0C97("INNER_PUSH_CLICK", 1, "inner_push_click");
        INNER_PUSH_CLICK = c0c972;
        C0C97 c0c973 = new C0C97("ACTION_BAR_CLICK", 2, "action_bar_click");
        ACTION_BAR_CLICK = c0c973;
        C0C97[] c0c97Arr = {c0c97, c0c972, c0c973};
        LLILLJJLI = c0c97Arr;
        LLILLL = new C2254308sP(c0c97Arr);
    }

    public static C0C97[] values() {
        return (C0C97[]) LLILLJJLI.clone();
    }

    public final String getLabel() {
        return this.LL;
    }

    public static C0C97 valueOf(String str) {
        return (C0C97) C08FF.LIZ(C0C97.class, str);
    }

    public C0C97(String str, int i, String str2) {
        this.LL = str2;
    }
}
