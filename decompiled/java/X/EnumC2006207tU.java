package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.07tU, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class EnumC2006207tU {
    public static final EnumC2006207tU ENTERREQ;
    public static final /* synthetic */ EnumC2006207tU[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC2006207tU SECONDREQ;

    public static InterfaceC2044707zh<EnumC2006207tU> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC2006207tU enumC2006207tU = new EnumC2006207tU("ENTERREQ", 0);
        ENTERREQ = enumC2006207tU;
        EnumC2006207tU enumC2006207tU2 = new EnumC2006207tU("SECONDREQ", 1);
        SECONDREQ = enumC2006207tU2;
        EnumC2006207tU[] enumC2006207tUArr = {enumC2006207tU, enumC2006207tU2};
        LL = enumC2006207tUArr;
        LLILLJJLI = new C2254308sP(enumC2006207tUArr);
    }

    public static EnumC2006207tU[] values() {
        return (EnumC2006207tU[]) LL.clone();
    }

    public static EnumC2006207tU valueOf(String str) {
        return (EnumC2006207tU) C08FF.LIZ(EnumC2006207tU.class, str);
    }

    public EnumC2006207tU(String str, int i) {
    }
}
