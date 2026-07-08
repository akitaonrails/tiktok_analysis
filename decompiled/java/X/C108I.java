package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.108I, reason: invalid class name */
/* JADX INFO: loaded from: classes29.dex */
public final class C108I {
    public static final C108I LLILLJJLI;
    public static final C108I LLILLL;
    public static final C108I LLILZ;
    public static final C108I LLILZIL;
    public static final C108I LLILZLL;
    public static final /* synthetic */ C108I[] LLIZ;
    public final String LL;

    static {
        C108I c108i = new C108I("CLOSE", 0, "close");
        LLILLJJLI = c108i;
        C108I c108i2 = new C108I("TOGGLE", 1, "toggle");
        LLILLL = c108i2;
        C108I c108i3 = new C108I("PROFILE_VIEW_INFO", 2, "profile_view_info");
        LLILZ = c108i3;
        C108I c108i4 = new C108I("POST_VIEW_INFO", 3, "post_view_info");
        LLILZIL = c108i4;
        C108I c108i5 = new C108I("CONFIRM", 4, "confirm");
        LLILZLL = c108i5;
        C108I[] c108iArr = {c108i, c108i2, c108i3, c108i4, c108i5};
        LLIZ = c108iArr;
        new C2254308sP(c108iArr);
    }

    public static C108I[] values() {
        return (C108I[]) LLIZ.clone();
    }

    public static C108I valueOf(String str) {
        return (C108I) C08FF.LIZ(C108I.class, str);
    }

    public C108I(String str, int i, String str2) {
        this.LL = str2;
    }
}
