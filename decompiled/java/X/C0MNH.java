package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0MNH, reason: invalid class name */
/* JADX INFO: loaded from: classes9.dex */
public final class C0MNH {
    public static final /* synthetic */ C0MNH[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final C0MNH POST;
    public static final C0MNH STORY;

    public static InterfaceC2044707zh<C0MNH> getEntries() {
        return LLILLJJLI;
    }

    static {
        C0MNH c0mnh = new C0MNH("POST", 0);
        POST = c0mnh;
        C0MNH c0mnh2 = new C0MNH("STORY", 1);
        STORY = c0mnh2;
        C0MNH[] c0mnhArr = {c0mnh, c0mnh2};
        LL = c0mnhArr;
        LLILLJJLI = new C2254308sP(c0mnhArr);
    }

    public static C0MNH[] values() {
        return (C0MNH[]) LL.clone();
    }

    public static C0MNH valueOf(String str) {
        return (C0MNH) C08FF.LIZ(C0MNH.class, str);
    }

    public C0MNH(String str, int i) {
    }
}
