package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0HKX, reason: invalid class name */
/* JADX INFO: loaded from: classes7.dex */
public final class C0HKX {
    public static final C0HKX ANCHOR;
    public static final C0HKX CAMERA;
    public static final /* synthetic */ C0HKX[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final C0HKX MIX_STUDIO;
    public static final C0HKX PROFILE;
    public static final C0HKX STICKER_POST;

    public static InterfaceC2044707zh<C0HKX> getEntries() {
        return LLILLJJLI;
    }

    static {
        C0HKX c0hkx = new C0HKX("CAMERA", 0);
        CAMERA = c0hkx;
        C0HKX c0hkx2 = new C0HKX("PROFILE", 1);
        PROFILE = c0hkx2;
        C0HKX c0hkx3 = new C0HKX("MIX_STUDIO", 2);
        MIX_STUDIO = c0hkx3;
        C0HKX c0hkx4 = new C0HKX("STICKER_POST", 3);
        STICKER_POST = c0hkx4;
        C0HKX c0hkx5 = new C0HKX("ANCHOR", 4);
        ANCHOR = c0hkx5;
        C0HKX[] c0hkxArr = {c0hkx, c0hkx2, c0hkx3, c0hkx4, c0hkx5};
        LL = c0hkxArr;
        LLILLJJLI = new C2254308sP(c0hkxArr);
    }

    public static C0HKX[] values() {
        return (C0HKX[]) LL.clone();
    }

    public static C0HKX valueOf(String str) {
        return (C0HKX) C08FF.LIZ(C0HKX.class, str);
    }

    public C0HKX(String str, int i) {
    }
}
