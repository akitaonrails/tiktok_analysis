package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0L9N, reason: invalid class name */
/* JADX INFO: loaded from: classes9.dex */
public final class C0L9N {
    public static final C0L9N AI_AVATAR_SHOOT_CONFIRM_PAGE;
    public static final /* synthetic */ C0L9N[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final C0L9N UPLOAD_CONFIRM_POP_UP;
    public static final C0L9N UPLOAD_CONTENT_NEXT;
    public final String LL;

    public static InterfaceC2044707zh<C0L9N> getEntries() {
        return LLILLL;
    }

    static {
        C0L9N c0l9n = new C0L9N("UPLOAD_CONFIRM_POP_UP", 0, "upload_confirm_pop_up");
        UPLOAD_CONFIRM_POP_UP = c0l9n;
        C0L9N c0l9n2 = new C0L9N("AI_AVATAR_SHOOT_CONFIRM_PAGE", 1, "ai_avatar_shoot_confirm_page");
        AI_AVATAR_SHOOT_CONFIRM_PAGE = c0l9n2;
        C0L9N c0l9n3 = new C0L9N("UPLOAD_CONTENT_NEXT", 2, "upload_content_next");
        UPLOAD_CONTENT_NEXT = c0l9n3;
        C0L9N[] c0l9nArr = {c0l9n, c0l9n2, c0l9n3};
        LLILLJJLI = c0l9nArr;
        LLILLL = new C2254308sP(c0l9nArr);
    }

    public static C0L9N[] values() {
        return (C0L9N[]) LLILLJJLI.clone();
    }

    public final String getValue() {
        return this.LL;
    }

    public static C0L9N valueOf(String str) {
        return (C0L9N) C08FF.LIZ(C0L9N.class, str);
    }

    public C0L9N(String str, int i, String str2) {
        this.LL = str2;
    }
}
