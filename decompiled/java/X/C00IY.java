package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.00IY, reason: invalid class name */
/* JADX INFO: loaded from: classes.dex */
public final class C00IY {
    public static final /* synthetic */ C00IY[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final C00IY MID_DARK;
    public static final C00IY TOP_DARK;

    public static InterfaceC2044707zh<C00IY> getEntries() {
        return LLILLJJLI;
    }

    static {
        C00IY c00iy = new C00IY("TOP_DARK", 0);
        TOP_DARK = c00iy;
        C00IY c00iy2 = new C00IY("MID_DARK", 1);
        MID_DARK = c00iy2;
        C00IY[] c00iyArr = {c00iy, c00iy2};
        LL = c00iyArr;
        LLILLJJLI = new C2254308sP(c00iyArr);
    }

    public static C00IY[] values() {
        return (C00IY[]) LL.clone();
    }

    public static C00IY valueOf(String str) {
        return (C00IY) C08FF.LIZ(C00IY.class, str);
    }

    public C00IY(String str, int i) {
    }
}
