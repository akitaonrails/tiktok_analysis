package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0gIO, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class EnumC1160140gIO {
    public static final EnumC1160140gIO HIDDEN;
    public static final /* synthetic */ EnumC1160140gIO[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC1160140gIO VISIBLE;

    public static InterfaceC2044707zh<EnumC1160140gIO> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC1160140gIO enumC1160140gIO = new EnumC1160140gIO("VISIBLE", 0);
        VISIBLE = enumC1160140gIO;
        EnumC1160140gIO enumC1160140gIO2 = new EnumC1160140gIO("HIDDEN", 1);
        HIDDEN = enumC1160140gIO2;
        EnumC1160140gIO[] enumC1160140gIOArr = {enumC1160140gIO, enumC1160140gIO2};
        LL = enumC1160140gIOArr;
        LLILLJJLI = new C2254308sP(enumC1160140gIOArr);
    }

    public static EnumC1160140gIO[] values() {
        return (EnumC1160140gIO[]) LL.clone();
    }

    public static EnumC1160140gIO valueOf(String str) {
        return (EnumC1160140gIO) C08FF.LIZ(EnumC1160140gIO.class, str);
    }

    public EnumC1160140gIO(String str, int i) {
    }
}
