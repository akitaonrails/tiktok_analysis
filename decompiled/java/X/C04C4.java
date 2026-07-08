package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.04C4, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
public final class C04C4 {
    public static final C04C4 FIND_SIMILAR;
    public static final /* synthetic */ C04C4[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public final int LL = 1;

    public static InterfaceC2044707zh<C04C4> getEntries() {
        return LLILLL;
    }

    static {
        C04C4 c04c4 = new C04C4();
        FIND_SIMILAR = c04c4;
        C04C4[] c04c4Arr = {c04c4};
        LLILLJJLI = c04c4Arr;
        LLILLL = new C2254308sP(c04c4Arr);
    }

    public static C04C4[] values() {
        return (C04C4[]) LLILLJJLI.clone();
    }

    public final int getValue() {
        return this.LL;
    }

    public static C04C4 valueOf(String str) {
        return (C04C4) C08FF.LIZ(C04C4.class, str);
    }
}
