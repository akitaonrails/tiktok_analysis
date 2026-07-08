package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.04C2, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
public final class C04C2 {
    public static final C04C2 DEFAULT;
    public static final /* synthetic */ C04C2[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public final int LL = 0;

    public static InterfaceC2044707zh<C04C2> getEntries() {
        return LLILLL;
    }

    static {
        C04C2 c04c2 = new C04C2();
        DEFAULT = c04c2;
        C04C2[] c04c2Arr = {c04c2};
        LLILLJJLI = c04c2Arr;
        LLILLL = new C2254308sP(c04c2Arr);
    }

    public static C04C2[] values() {
        return (C04C2[]) LLILLJJLI.clone();
    }

    public final int getValue() {
        return this.LL;
    }

    public static C04C2 valueOf(String str) {
        return (C04C2) C08FF.LIZ(C04C2.class, str);
    }
}
