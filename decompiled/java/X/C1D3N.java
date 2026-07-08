package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.1D3N, reason: invalid class name */
/* JADX INFO: loaded from: classes36.dex */
public final class C1D3N {
    public static final C1D3N AS_CAMERA_LENS_BACK;
    public static final C1D3N AS_CAMERA_LENS_FRONT;
    public static final C1D3N AS_CAMERA_LENS_WIDE;
    public static final C1D3Q Companion;
    public static final /* synthetic */ C1D3N[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;

    public static InterfaceC2044707zh<C1D3N> getEntries() {
        return LLILLJJLI;
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [X.1D3Q] */
    static {
        C1D3N c1d3n = new C1D3N("AS_CAMERA_LENS_BACK", 0);
        AS_CAMERA_LENS_BACK = c1d3n;
        C1D3N c1d3n2 = new C1D3N("AS_CAMERA_LENS_FRONT", 1);
        AS_CAMERA_LENS_FRONT = c1d3n2;
        C1D3N c1d3n3 = new C1D3N("AS_CAMERA_LENS_WIDE", 2);
        AS_CAMERA_LENS_WIDE = c1d3n3;
        C1D3N[] c1d3nArr = {c1d3n, c1d3n2, c1d3n3};
        LL = c1d3nArr;
        LLILLJJLI = new C2254308sP(c1d3nArr);
        Companion = new Object() { // from class: X.1D3Q
        };
    }

    public static C1D3N[] values() {
        return (C1D3N[]) LL.clone();
    }

    public static final C1D3N fromOrdinal(int i) {
        Companion.getClass();
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    return AS_CAMERA_LENS_BACK;
                }
                return AS_CAMERA_LENS_WIDE;
            }
            return AS_CAMERA_LENS_FRONT;
        }
        return AS_CAMERA_LENS_BACK;
    }

    public static final int toIntValue(C1D3N c1d3n) {
        Companion.getClass();
        int i = C1D3O.LIZ[c1d3n.ordinal()];
        if (i != 1) {
            if (i == 2) {
                return 1;
            }
            if (i == 3) {
                return 2;
            }
            throw new C1954807lC();
        }
        return 0;
    }

    public static C1D3N valueOf(String str) {
        return (C1D3N) C08FF.LIZ(C1D3N.class, str);
    }

    public C1D3N(String str, int i) {
    }
}
