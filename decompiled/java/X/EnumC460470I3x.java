package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0I3x, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class EnumC460470I3x {
    public static final EnumC460470I3x CIRCLE;
    public static final /* synthetic */ EnumC460470I3x[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC460470I3x ROUNDED_CORNERS;

    public static InterfaceC2044707zh<EnumC460470I3x> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC460470I3x enumC460470I3x = new EnumC460470I3x("ROUNDED_CORNERS", 0);
        ROUNDED_CORNERS = enumC460470I3x;
        EnumC460470I3x enumC460470I3x2 = new EnumC460470I3x("CIRCLE", 1);
        CIRCLE = enumC460470I3x2;
        EnumC460470I3x[] enumC460470I3xArr = {enumC460470I3x, enumC460470I3x2};
        LL = enumC460470I3xArr;
        LLILLJJLI = new C2254308sP(enumC460470I3xArr);
    }

    public static EnumC460470I3x[] values() {
        return (EnumC460470I3x[]) LL.clone();
    }

    public static EnumC460470I3x valueOf(String str) {
        return (EnumC460470I3x) C08FF.LIZ(EnumC460470I3x.class, str);
    }

    public EnumC460470I3x(String str, int i) {
    }
}
