package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.03EH, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
public final class C03EH {
    public static final C03EH ICON;
    public static final /* synthetic */ C03EH[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final C03EH TEXT;

    public static InterfaceC2044707zh<C03EH> getEntries() {
        return LLILLJJLI;
    }

    static {
        C03EH c03eh = new C03EH("TEXT", 0);
        TEXT = c03eh;
        C03EH c03eh2 = new C03EH("ICON", 1);
        ICON = c03eh2;
        C03EH[] c03ehArr = {c03eh, c03eh2};
        LL = c03ehArr;
        LLILLJJLI = new C2254308sP(c03ehArr);
    }

    public static C03EH[] values() {
        return (C03EH[]) LL.clone();
    }

    public static C03EH valueOf(String str) {
        return (C03EH) C08FF.LIZ(C03EH.class, str);
    }

    public C03EH(String str, int i) {
    }
}
