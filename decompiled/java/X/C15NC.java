package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.15NC, reason: invalid class name */
/* JADX INFO: loaded from: classes32.dex */
public final class C15NC {
    public static final C15NC CHECK_FAILED;
    public static final C15NC CHECK_SKIPPED;
    public static final C15NC CHECK_SUCCEED;
    public static final C15NC DONE_BA_FAILED;
    public static final C15NC DONE_FAILED;
    public static final C15NC DONE_SUCCEED;
    public static final C15NC HANDLE_TAG_BA;
    public static final /* synthetic */ C15NC[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;

    public static InterfaceC2044707zh<C15NC> getEntries() {
        return LLILLJJLI;
    }

    static {
        C15NC c15nc = new C15NC("HANDLE_TAG_BA", 0);
        HANDLE_TAG_BA = c15nc;
        C15NC c15nc2 = new C15NC("CHECK_SUCCEED", 1);
        CHECK_SUCCEED = c15nc2;
        C15NC c15nc3 = new C15NC("CHECK_FAILED", 2);
        CHECK_FAILED = c15nc3;
        C15NC c15nc4 = new C15NC("CHECK_SKIPPED", 3);
        CHECK_SKIPPED = c15nc4;
        C15NC c15nc5 = new C15NC("DONE_SUCCEED", 4);
        DONE_SUCCEED = c15nc5;
        C15NC c15nc6 = new C15NC("DONE_FAILED", 5);
        DONE_FAILED = c15nc6;
        C15NC c15nc7 = new C15NC("DONE_BA_FAILED", 6);
        DONE_BA_FAILED = c15nc7;
        C15NC[] c15ncArr = {c15nc, c15nc2, c15nc3, c15nc4, c15nc5, c15nc6, c15nc7};
        LL = c15ncArr;
        LLILLJJLI = new C2254308sP(c15ncArr);
    }

    public static C15NC[] values() {
        return (C15NC[]) LL.clone();
    }

    public static C15NC valueOf(String str) {
        return (C15NC) C08FF.LIZ(C15NC.class, str);
    }

    public C15NC(String str, int i) {
    }
}
