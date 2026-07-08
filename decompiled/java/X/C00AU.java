package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.00AU, reason: invalid class name */
/* JADX INFO: loaded from: classes.dex */
public final class C00AU {
    public static final C00AU EC_COMMENT;
    public static final C00AU EC_SEARCH;
    public static final /* synthetic */ C00AU[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;

    public static InterfaceC2044707zh<C00AU> getEntries() {
        return LLILLJJLI;
    }

    static {
        C00AU c00au = new C00AU("EC_COMMENT", 0);
        EC_COMMENT = c00au;
        C00AU c00au2 = new C00AU("EC_SEARCH", 1);
        EC_SEARCH = c00au2;
        C00AU[] c00auArr = {c00au, c00au2};
        LL = c00auArr;
        LLILLJJLI = new C2254308sP(c00auArr);
    }

    public static C00AU[] values() {
        return (C00AU[]) LL.clone();
    }

    public static C00AU valueOf(String str) {
        return (C00AU) C08FF.LIZ(C00AU.class, str);
    }

    public C00AU(String str, int i) {
    }
}
