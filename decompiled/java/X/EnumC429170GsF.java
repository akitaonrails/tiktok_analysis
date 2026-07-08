package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0GsF, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class EnumC429170GsF {
    public static final EnumC429170GsF BEAUTY;
    public static final EnumC429170GsF FILTER;
    public static final /* synthetic */ EnumC429170GsF[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;

    public static InterfaceC2044707zh<EnumC429170GsF> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC429170GsF enumC429170GsF = new EnumC429170GsF("FILTER", 0);
        FILTER = enumC429170GsF;
        EnumC429170GsF enumC429170GsF2 = new EnumC429170GsF("BEAUTY", 1);
        BEAUTY = enumC429170GsF2;
        EnumC429170GsF[] enumC429170GsFArr = {enumC429170GsF, enumC429170GsF2};
        LL = enumC429170GsFArr;
        LLILLJJLI = new C2254308sP(enumC429170GsFArr);
    }

    public static EnumC429170GsF[] values() {
        return (EnumC429170GsF[]) LL.clone();
    }

    public static EnumC429170GsF valueOf(String str) {
        return (EnumC429170GsF) C08FF.LIZ(EnumC429170GsF.class, str);
    }

    public EnumC429170GsF(String str, int i) {
    }
}
