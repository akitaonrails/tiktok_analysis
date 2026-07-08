package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.00IX, reason: invalid class name */
/* JADX INFO: loaded from: classes.dex */
public final class C00IX {
    public static final C00IX HAS_ONE_SELECTED_CONTACT_AFTER_LOADED;
    public static final /* synthetic */ C00IX[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final C00IX SELECT_CONTACT;
    public static final C00IX UNSELECT_CONTACT;

    public static InterfaceC2044707zh<C00IX> getEntries() {
        return LLILLJJLI;
    }

    static {
        C00IX c00ix = new C00IX("SELECT_CONTACT", 0);
        SELECT_CONTACT = c00ix;
        C00IX c00ix2 = new C00IX("UNSELECT_CONTACT", 1);
        UNSELECT_CONTACT = c00ix2;
        C00IX c00ix3 = new C00IX("HAS_ONE_SELECTED_CONTACT_AFTER_LOADED", 2);
        HAS_ONE_SELECTED_CONTACT_AFTER_LOADED = c00ix3;
        C00IX[] c00ixArr = {c00ix, c00ix2, c00ix3};
        LL = c00ixArr;
        LLILLJJLI = new C2254308sP(c00ixArr);
    }

    public static C00IX[] values() {
        return (C00IX[]) LL.clone();
    }

    public static C00IX valueOf(String str) {
        return (C00IX) C08FF.LIZ(C00IX.class, str);
    }

    public C00IX(String str, int i) {
    }
}
