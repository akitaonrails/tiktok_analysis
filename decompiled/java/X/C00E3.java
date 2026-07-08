package X;

import java.io.Serializable;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.00E3, reason: invalid class name */
/* JADX INFO: loaded from: classes.dex */
public final class C00E3 implements Serializable {
    public static final /* synthetic */ C00E3[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final C00E3 NORMAL;
    public static final C00E3 OPTION_UNAVAILABLE;

    public static InterfaceC2044707zh<C00E3> getEntries() {
        return LLILLJJLI;
    }

    static {
        C00E3 c00e3 = new C00E3("NORMAL", 0);
        NORMAL = c00e3;
        C00E3 c00e32 = new C00E3("OPTION_UNAVAILABLE", 1);
        OPTION_UNAVAILABLE = c00e32;
        C00E3[] c00e3Arr = {c00e3, c00e32};
        LL = c00e3Arr;
        LLILLJJLI = new C2254308sP(c00e3Arr);
    }

    public static C00E3[] values() {
        return (C00E3[]) LL.clone();
    }

    public static C00E3 valueOf(String str) {
        return (C00E3) C08FF.LIZ(C00E3.class, str);
    }

    public C00E3(String str, int i) {
    }
}
