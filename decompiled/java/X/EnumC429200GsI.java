package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0GsI, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class EnumC429200GsI {
    public static final /* synthetic */ EnumC429200GsI[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC429200GsI NoNetwork;

    public static InterfaceC2044707zh<EnumC429200GsI> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC429200GsI enumC429200GsI = new EnumC429200GsI();
        NoNetwork = enumC429200GsI;
        EnumC429200GsI[] enumC429200GsIArr = {enumC429200GsI};
        LL = enumC429200GsIArr;
        LLILLJJLI = new C2254308sP(enumC429200GsIArr);
    }

    public static EnumC429200GsI[] values() {
        return (EnumC429200GsI[]) LL.clone();
    }

    public static EnumC429200GsI valueOf(String str) {
        return (EnumC429200GsI) C08FF.LIZ(EnumC429200GsI.class, str);
    }
}
