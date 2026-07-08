package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0le0, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class EnumC1365740le0 {
    public static final EnumC1365740le0 BOTTOM;
    public static final EnumC1365740le0 CENTER;
    public static final /* synthetic */ EnumC1365740le0[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC1365740le0 TOP;

    public static InterfaceC2044707zh<EnumC1365740le0> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC1365740le0 enumC1365740le0 = new EnumC1365740le0("TOP", 0);
        TOP = enumC1365740le0;
        EnumC1365740le0 enumC1365740le02 = new EnumC1365740le0("CENTER", 1);
        CENTER = enumC1365740le02;
        EnumC1365740le0 enumC1365740le03 = new EnumC1365740le0("BOTTOM", 2);
        BOTTOM = enumC1365740le03;
        EnumC1365740le0[] enumC1365740le0Arr = {enumC1365740le0, enumC1365740le02, enumC1365740le03};
        LL = enumC1365740le0Arr;
        LLILLJJLI = new C2254308sP(enumC1365740le0Arr);
    }

    public static EnumC1365740le0[] values() {
        return (EnumC1365740le0[]) LL.clone();
    }

    public static EnumC1365740le0 valueOf(String str) {
        return (EnumC1365740le0) C08FF.LIZ(EnumC1365740le0.class, str);
    }

    public EnumC1365740le0(String str, int i) {
    }
}
