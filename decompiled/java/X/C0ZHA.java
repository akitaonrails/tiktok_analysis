package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0ZHA, reason: invalid class name */
/* JADX INFO: loaded from: classes15.dex */
public final class C0ZHA {
    public static final C0ZHA CHAT;
    public static final C0ZHA INBOX_TITLE;
    public static final C0ZHA INTRO_PANEL;
    public static final /* synthetic */ C0ZHA[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public final String LL;

    public static InterfaceC2044707zh<C0ZHA> getEntries() {
        return LLILLL;
    }

    static {
        C0ZHA c0zha = new C0ZHA("INTRO_PANEL", 0, "intro_panel");
        INTRO_PANEL = c0zha;
        C0ZHA c0zha2 = new C0ZHA("INBOX_TITLE", 1, "inbox_title");
        INBOX_TITLE = c0zha2;
        C0ZHA c0zha3 = new C0ZHA("CHAT", 2, "chat");
        CHAT = c0zha3;
        C0ZHA[] c0zhaArr = {c0zha, c0zha2, c0zha3};
        LLILLJJLI = c0zhaArr;
        LLILLL = new C2254308sP(c0zhaArr);
    }

    public static C0ZHA[] values() {
        return (C0ZHA[]) LLILLJJLI.clone();
    }

    public final String getValue() {
        return this.LL;
    }

    public static C0ZHA valueOf(String str) {
        return (C0ZHA) C08FF.LIZ(C0ZHA.class, str);
    }

    public C0ZHA(String str, int i, String str2) {
        this.LL = str2;
    }
}
