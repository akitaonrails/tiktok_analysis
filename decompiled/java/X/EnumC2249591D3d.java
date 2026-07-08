package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.1D3d, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes36.dex */
public final class EnumC2249591D3d {
    public static final EnumC2249591D3d LL;
    public static final EnumC2249591D3d LLILLJJLI;
    public static final /* synthetic */ EnumC2249591D3d[] LLILLL;

    static {
        EnumC2249591D3d enumC2249591D3d = new EnumC2249591D3d("LINE", 0);
        LL = enumC2249591D3d;
        EnumC2249591D3d enumC2249591D3d2 = new EnumC2249591D3d("SPACE", 1);
        LLILLJJLI = enumC2249591D3d2;
        EnumC2249591D3d[] enumC2249591D3dArr = {enumC2249591D3d, enumC2249591D3d2};
        LLILLL = enumC2249591D3dArr;
        new C2254308sP(enumC2249591D3dArr);
    }

    public static EnumC2249591D3d[] values() {
        return (EnumC2249591D3d[]) LLILLL.clone();
    }

    public static EnumC2249591D3d valueOf(String str) {
        return (EnumC2249591D3d) C08FF.LIZ(EnumC2249591D3d.class, str);
    }

    public EnumC2249591D3d(String str, int i) {
    }
}
