package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0hSC, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class EnumC1204660hSC {
    public static final EnumC1204660hSC GPS;
    public static final /* synthetic */ EnumC1204660hSC[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC1204660hSC PROMOTE_PRECISE_GPS;

    public static InterfaceC2044707zh<EnumC1204660hSC> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC1204660hSC enumC1204660hSC = new EnumC1204660hSC("GPS", 0);
        GPS = enumC1204660hSC;
        EnumC1204660hSC enumC1204660hSC2 = new EnumC1204660hSC("PROMOTE_PRECISE_GPS", 1);
        PROMOTE_PRECISE_GPS = enumC1204660hSC2;
        EnumC1204660hSC[] enumC1204660hSCArr = {enumC1204660hSC, enumC1204660hSC2};
        LL = enumC1204660hSCArr;
        LLILLJJLI = new C2254308sP(enumC1204660hSCArr);
    }

    public static EnumC1204660hSC[] values() {
        return (EnumC1204660hSC[]) LL.clone();
    }

    public static EnumC1204660hSC valueOf(String str) {
        return (EnumC1204660hSC) C08FF.LIZ(EnumC1204660hSC.class, str);
    }

    public EnumC1204660hSC(String str, int i) {
    }
}
