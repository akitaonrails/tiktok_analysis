package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0GsD, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class EnumC429150GsD {
    public static final EnumC429150GsD FORMAT;
    public static final /* synthetic */ EnumC429150GsD[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC429150GsD NORMAL;

    public static InterfaceC2044707zh<EnumC429150GsD> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC429150GsD enumC429150GsD = new EnumC429150GsD("FORMAT", 0);
        FORMAT = enumC429150GsD;
        EnumC429150GsD enumC429150GsD2 = new EnumC429150GsD("NORMAL", 1);
        NORMAL = enumC429150GsD2;
        EnumC429150GsD[] enumC429150GsDArr = {enumC429150GsD, enumC429150GsD2};
        LL = enumC429150GsDArr;
        LLILLJJLI = new C2254308sP(enumC429150GsDArr);
    }

    public static EnumC429150GsD[] values() {
        return (EnumC429150GsD[]) LL.clone();
    }

    public static EnumC429150GsD valueOf(String str) {
        return (EnumC429150GsD) C08FF.LIZ(EnumC429150GsD.class, str);
    }

    public EnumC429150GsD(String str, int i) {
    }
}
