package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0Gwe, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class EnumC431900Gwe {
    public static final EnumC431900Gwe LEFT_BOTTOM;
    public static final EnumC431900Gwe LEFT_TOP;
    public static final /* synthetic */ EnumC431900Gwe[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC431900Gwe RIGHT_TOP;

    public static InterfaceC2044707zh<EnumC431900Gwe> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC431900Gwe enumC431900Gwe = new EnumC431900Gwe("LEFT_BOTTOM", 0);
        LEFT_BOTTOM = enumC431900Gwe;
        EnumC431900Gwe enumC431900Gwe2 = new EnumC431900Gwe("LEFT_TOP", 1);
        LEFT_TOP = enumC431900Gwe2;
        EnumC431900Gwe enumC431900Gwe3 = new EnumC431900Gwe("RIGHT_TOP", 2);
        RIGHT_TOP = enumC431900Gwe3;
        EnumC431900Gwe[] enumC431900GweArr = {enumC431900Gwe, enumC431900Gwe2, enumC431900Gwe3};
        LL = enumC431900GweArr;
        LLILLJJLI = new C2254308sP(enumC431900GweArr);
    }

    public static EnumC431900Gwe[] values() {
        return (EnumC431900Gwe[]) LL.clone();
    }

    public static EnumC431900Gwe valueOf(String str) {
        return (EnumC431900Gwe) C08FF.LIZ(EnumC431900Gwe.class, str);
    }

    public EnumC431900Gwe(String str, int i) {
    }
}
