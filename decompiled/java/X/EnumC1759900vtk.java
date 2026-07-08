package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0vtk, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class EnumC1759900vtk {
    public static final EnumC1759900vtk BOTTOM;
    public static final EnumC1759900vtk CENTER;
    public static final C1759930vtn Companion;
    public static final /* synthetic */ EnumC1759900vtk[] LLILLL;
    public static final /* synthetic */ C2254308sP LLILZ;
    public static final EnumC1759900vtk TOP;
    public final int LL;
    public final int LLILLJJLI;

    public static InterfaceC2044707zh<EnumC1759900vtk> getEntries() {
        return LLILZ;
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [X.0vtn] */
    static {
        EnumC1759900vtk enumC1759900vtk = new EnumC1759900vtk("TOP", 0, 1, 48);
        TOP = enumC1759900vtk;
        EnumC1759900vtk enumC1759900vtk2 = new EnumC1759900vtk("CENTER", 1, 2, 17);
        CENTER = enumC1759900vtk2;
        EnumC1759900vtk enumC1759900vtk3 = new EnumC1759900vtk("BOTTOM", 2, 3, 80);
        BOTTOM = enumC1759900vtk3;
        EnumC1759900vtk[] enumC1759900vtkArr = {enumC1759900vtk, enumC1759900vtk2, enumC1759900vtk3};
        LLILLL = enumC1759900vtkArr;
        LLILZ = new C2254308sP(enumC1759900vtkArr);
        Companion = new Object() { // from class: X.0vtn
        };
    }

    public static EnumC1759900vtk[] values() {
        return (EnumC1759900vtk[]) LLILLL.clone();
    }

    public final int getAndroidGravity() {
        return this.LLILLJJLI;
    }

    public final int getValue() {
        return this.LL;
    }

    public static EnumC1759900vtk valueOf(String str) {
        return (EnumC1759900vtk) C08FF.LIZ(EnumC1759900vtk.class, str);
    }

    public EnumC1759900vtk(String str, int i, int i2, int i3) {
        this.LL = i2;
        this.LLILLJJLI = i3;
    }
}
