package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0zcD, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class EnumC1902790zcD {
    public static final EnumC1902790zcD KEEP;
    public static final /* synthetic */ EnumC1902790zcD[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC1902790zcD NOT_HANDLED;
    public static final EnumC1902790zcD REMOVE;

    public static InterfaceC2044707zh<EnumC1902790zcD> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC1902790zcD enumC1902790zcD = new EnumC1902790zcD("NOT_HANDLED", 0);
        NOT_HANDLED = enumC1902790zcD;
        EnumC1902790zcD enumC1902790zcD2 = new EnumC1902790zcD("KEEP", 1);
        KEEP = enumC1902790zcD2;
        EnumC1902790zcD enumC1902790zcD3 = new EnumC1902790zcD("REMOVE", 2);
        REMOVE = enumC1902790zcD3;
        EnumC1902790zcD[] enumC1902790zcDArr = {enumC1902790zcD, enumC1902790zcD2, enumC1902790zcD3};
        LL = enumC1902790zcDArr;
        LLILLJJLI = new C2254308sP(enumC1902790zcDArr);
    }

    public static EnumC1902790zcD[] values() {
        return (EnumC1902790zcD[]) LL.clone();
    }

    public static EnumC1902790zcD valueOf(String str) {
        return (EnumC1902790zcD) C08FF.LIZ(EnumC1902790zcD.class, str);
    }

    public EnumC1902790zcD(String str, int i) {
    }
}
