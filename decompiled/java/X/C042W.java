package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.042W, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
public final class C042W {
    public static final C042W LESS;
    public static final /* synthetic */ C042W[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final C042W MORE;
    public static final C042W NOT_EXPANDABLE;

    public static InterfaceC2044707zh<C042W> getEntries() {
        return LLILLJJLI;
    }

    static {
        C042W c042w = new C042W("LESS", 0);
        LESS = c042w;
        C042W c042w2 = new C042W("MORE", 1);
        MORE = c042w2;
        C042W c042w3 = new C042W("NOT_EXPANDABLE", 2);
        NOT_EXPANDABLE = c042w3;
        C042W[] c042wArr = {c042w, c042w2, c042w3};
        LL = c042wArr;
        LLILLJJLI = new C2254308sP(c042wArr);
    }

    public static C042W[] values() {
        return (C042W[]) LL.clone();
    }

    public static C042W valueOf(String str) {
        return (C042W) C08FF.LIZ(C042W.class, str);
    }

    public C042W(String str, int i) {
    }
}
