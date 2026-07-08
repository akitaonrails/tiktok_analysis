package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0F2Z, reason: invalid class name */
/* JADX INFO: loaded from: classes6.dex */
public final class C0F2Z {
    public static final C0F2Z EMPTY;
    public static final C0F2Z GUIDE_ANIMATION;
    public static final C0F2Z GUIDE_CUT;
    public static final /* synthetic */ C0F2Z[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;

    public static InterfaceC2044707zh<C0F2Z> getEntries() {
        return LLILLJJLI;
    }

    static {
        C0F2Z c0f2z = new C0F2Z("EMPTY", 0);
        EMPTY = c0f2z;
        C0F2Z c0f2z2 = new C0F2Z("GUIDE_CUT", 1);
        GUIDE_CUT = c0f2z2;
        C0F2Z c0f2z3 = new C0F2Z("GUIDE_ANIMATION", 2);
        GUIDE_ANIMATION = c0f2z3;
        C0F2Z[] c0f2zArr = {c0f2z, c0f2z2, c0f2z3};
        LL = c0f2zArr;
        LLILLJJLI = new C2254308sP(c0f2zArr);
    }

    public static C0F2Z[] values() {
        return (C0F2Z[]) LL.clone();
    }

    public static C0F2Z valueOf(String str) {
        return (C0F2Z) C08FF.LIZ(C0F2Z.class, str);
    }

    public C0F2Z(String str, int i) {
    }
}
