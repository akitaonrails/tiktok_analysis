package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0o2d, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class EnumC1457890o2d {
    public static final EnumC1457890o2d DARK_COLOR_WITHOUT_CANCEL_BUTTON;
    public static final EnumC1457890o2d DARK_COLOR_WITH_CANCEL_BUTTON;
    public static final /* synthetic */ EnumC1457890o2d[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;

    public static InterfaceC2044707zh<EnumC1457890o2d> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC1457890o2d enumC1457890o2d = new EnumC1457890o2d("DARK_COLOR_WITHOUT_CANCEL_BUTTON", 0);
        DARK_COLOR_WITHOUT_CANCEL_BUTTON = enumC1457890o2d;
        EnumC1457890o2d enumC1457890o2d2 = new EnumC1457890o2d("DARK_COLOR_WITH_CANCEL_BUTTON", 1);
        DARK_COLOR_WITH_CANCEL_BUTTON = enumC1457890o2d2;
        EnumC1457890o2d[] enumC1457890o2dArr = {enumC1457890o2d, enumC1457890o2d2};
        LL = enumC1457890o2dArr;
        LLILLJJLI = new C2254308sP(enumC1457890o2dArr);
    }

    public static EnumC1457890o2d[] values() {
        return (EnumC1457890o2d[]) LL.clone();
    }

    public static EnumC1457890o2d valueOf(String str) {
        return (EnumC1457890o2d) C08FF.LIZ(EnumC1457890o2d.class, str);
    }

    public EnumC1457890o2d(String str, int i) {
    }
}
