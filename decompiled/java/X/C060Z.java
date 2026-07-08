package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.060Z, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
public final class C060Z {
    public static final C060Z AI_CANNOT_REPLY;
    public static final C060Z ASK_FOR_APPROVAL;
    public static final /* synthetic */ C060Z[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;

    public static InterfaceC2044707zh<C060Z> getEntries() {
        return LLILLJJLI;
    }

    static {
        C060Z c060z = new C060Z("AI_CANNOT_REPLY", 0);
        AI_CANNOT_REPLY = c060z;
        C060Z c060z2 = new C060Z("ASK_FOR_APPROVAL", 1);
        ASK_FOR_APPROVAL = c060z2;
        C060Z[] c060zArr = {c060z, c060z2};
        LL = c060zArr;
        LLILLJJLI = new C2254308sP(c060zArr);
    }

    public static C060Z[] values() {
        return (C060Z[]) LL.clone();
    }

    public static C060Z valueOf(String str) {
        return (C060Z) C08FF.LIZ(C060Z.class, str);
    }

    public C060Z(String str, int i) {
    }
}
