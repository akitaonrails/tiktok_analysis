package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.18VH, reason: invalid class name */
/* JADX INFO: loaded from: classes33.dex */
public final class C18VH {
    public static final C18VH END;
    public static final /* synthetic */ C18VH[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final C18VH START;
    public static final C18VH UNSPECIFIED;

    public static InterfaceC2044707zh<C18VH> getEntries() {
        return LLILLJJLI;
    }

    static {
        C18VH c18vh = new C18VH("START", 0);
        START = c18vh;
        C18VH c18vh2 = new C18VH("END", 1);
        END = c18vh2;
        C18VH c18vh3 = new C18VH("UNSPECIFIED", 2);
        UNSPECIFIED = c18vh3;
        C18VH[] c18vhArr = {c18vh, c18vh2, c18vh3};
        LL = c18vhArr;
        LLILLJJLI = new C2254308sP(c18vhArr);
    }

    public static C18VH[] values() {
        return (C18VH[]) LL.clone();
    }

    public static C18VH valueOf(String str) {
        return (C18VH) C08FF.LIZ(C18VH.class, str);
    }

    public C18VH(String str, int i) {
    }
}
