package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.12EH, reason: invalid class name */
/* JADX INFO: loaded from: classes30.dex */
public final class C12EH {
    public static final C12EH CLICK_PUBLISH;
    public static final C12EH DRAFT_SAVED;
    public static final /* synthetic */ C12EH[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final C12EH PAGE_INIT;
    public static final C12EH PULL_TO_REFRESH;
    public static final C12EH VISIBILITY_CHANGE;

    public static InterfaceC2044707zh<C12EH> getEntries() {
        return LLILLJJLI;
    }

    static {
        C12EH c12eh = new C12EH("PAGE_INIT", 0);
        PAGE_INIT = c12eh;
        C12EH c12eh2 = new C12EH("PULL_TO_REFRESH", 1);
        PULL_TO_REFRESH = c12eh2;
        C12EH c12eh3 = new C12EH("VISIBILITY_CHANGE", 2);
        VISIBILITY_CHANGE = c12eh3;
        C12EH c12eh4 = new C12EH("CLICK_PUBLISH", 3);
        CLICK_PUBLISH = c12eh4;
        C12EH c12eh5 = new C12EH("DRAFT_SAVED", 4);
        DRAFT_SAVED = c12eh5;
        C12EH[] c12ehArr = {c12eh, c12eh2, c12eh3, c12eh4, c12eh5};
        LL = c12ehArr;
        LLILLJJLI = new C2254308sP(c12ehArr);
    }

    public static C12EH[] values() {
        return (C12EH[]) LL.clone();
    }

    public static C12EH valueOf(String str) {
        return (C12EH) C08FF.LIZ(C12EH.class, str);
    }

    public C12EH(String str, int i) {
    }
}
