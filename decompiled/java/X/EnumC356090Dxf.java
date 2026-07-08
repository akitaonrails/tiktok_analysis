package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0Dxf, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class EnumC356090Dxf {
    public static final EnumC356090Dxf AUDIO;
    public static final /* synthetic */ EnumC356090Dxf[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC356090Dxf VIDEO;

    public static InterfaceC2044707zh<EnumC356090Dxf> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC356090Dxf enumC356090Dxf = new EnumC356090Dxf("VIDEO", 0);
        VIDEO = enumC356090Dxf;
        EnumC356090Dxf enumC356090Dxf2 = new EnumC356090Dxf("AUDIO", 1);
        AUDIO = enumC356090Dxf2;
        EnumC356090Dxf[] enumC356090DxfArr = {enumC356090Dxf, enumC356090Dxf2};
        LL = enumC356090DxfArr;
        LLILLJJLI = new C2254308sP(enumC356090DxfArr);
    }

    public static EnumC356090Dxf[] values() {
        return (EnumC356090Dxf[]) LL.clone();
    }

    public static EnumC356090Dxf valueOf(String str) {
        return (EnumC356090Dxf) C08FF.LIZ(EnumC356090Dxf.class, str);
    }

    public EnumC356090Dxf(String str, int i) {
    }
}
