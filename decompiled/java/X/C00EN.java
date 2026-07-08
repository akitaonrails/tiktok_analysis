package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.00EN, reason: invalid class name */
/* JADX INFO: loaded from: classes.dex */
public final class C00EN {
    public static final /* synthetic */ C00EN[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final C00EN MARKDOWN_TITLE;
    public final String LL = "markdown_title";

    public static InterfaceC2044707zh<C00EN> getEntries() {
        return LLILLL;
    }

    static {
        C00EN c00en = new C00EN();
        MARKDOWN_TITLE = c00en;
        C00EN[] c00enArr = {c00en};
        LLILLJJLI = c00enArr;
        LLILLL = new C2254308sP(c00enArr);
    }

    public static C00EN[] values() {
        return (C00EN[]) LLILLJJLI.clone();
    }

    public final String getValue() {
        return this.LL;
    }

    public static C00EN valueOf(String str) {
        return (C00EN) C08FF.LIZ(C00EN.class, str);
    }
}
