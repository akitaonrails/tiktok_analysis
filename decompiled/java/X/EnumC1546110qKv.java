package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0qKv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class EnumC1546110qKv {
    public static final EnumC1546110qKv DARK;
    public static final /* synthetic */ EnumC1546110qKv[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC1546110qKv Light;

    public static InterfaceC2044707zh<EnumC1546110qKv> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC1546110qKv enumC1546110qKv = new EnumC1546110qKv("DARK", 0);
        DARK = enumC1546110qKv;
        EnumC1546110qKv enumC1546110qKv2 = new EnumC1546110qKv("Light", 1);
        Light = enumC1546110qKv2;
        EnumC1546110qKv[] enumC1546110qKvArr = {enumC1546110qKv, enumC1546110qKv2};
        LL = enumC1546110qKvArr;
        LLILLJJLI = new C2254308sP(enumC1546110qKvArr);
    }

    public static EnumC1546110qKv[] values() {
        return (EnumC1546110qKv[]) LL.clone();
    }

    public static EnumC1546110qKv valueOf(String str) {
        return (EnumC1546110qKv) C08FF.LIZ(EnumC1546110qKv.class, str);
    }

    public EnumC1546110qKv(String str, int i) {
    }
}
