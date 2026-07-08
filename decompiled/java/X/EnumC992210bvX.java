package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0bvX, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class EnumC992210bvX {
    public static final /* synthetic */ EnumC992210bvX[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC992210bvX SNAP_TO_LEFT;
    public static final EnumC992210bvX SNAP_TO_RIGHT;

    public static InterfaceC2044707zh<EnumC992210bvX> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC992210bvX enumC992210bvX = new EnumC992210bvX("SNAP_TO_LEFT", 0);
        SNAP_TO_LEFT = enumC992210bvX;
        EnumC992210bvX enumC992210bvX2 = new EnumC992210bvX("SNAP_TO_RIGHT", 1);
        SNAP_TO_RIGHT = enumC992210bvX2;
        EnumC992210bvX[] enumC992210bvXArr = {enumC992210bvX, enumC992210bvX2};
        LL = enumC992210bvXArr;
        LLILLJJLI = new C2254308sP(enumC992210bvXArr);
    }

    public static EnumC992210bvX[] values() {
        return (EnumC992210bvX[]) LL.clone();
    }

    public static EnumC992210bvX valueOf(String str) {
        return (EnumC992210bvX) C08FF.LIZ(EnumC992210bvX.class, str);
    }

    public EnumC992210bvX(String str, int i) {
    }
}
