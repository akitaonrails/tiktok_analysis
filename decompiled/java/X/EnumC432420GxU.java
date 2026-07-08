package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0GxU, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class EnumC432420GxU {
    public static final EnumC432420GxU LL;
    public static final EnumC432420GxU LLILLJJLI;
    public static final EnumC432420GxU LLILLL;
    public static final /* synthetic */ EnumC432420GxU[] LLILZ;

    static {
        EnumC432420GxU enumC432420GxU = new EnumC432420GxU(C1649000t0s.LLLJIL, 0);
        LL = enumC432420GxU;
        EnumC432420GxU enumC432420GxU2 = new EnumC432420GxU("LOCKED", 1);
        LLILLJJLI = enumC432420GxU2;
        EnumC432420GxU enumC432420GxU3 = new EnumC432420GxU("RECORD_LIMIT_REACHED", 2);
        LLILLL = enumC432420GxU3;
        EnumC432420GxU[] enumC432420GxUArr = {enumC432420GxU, enumC432420GxU2, enumC432420GxU3};
        LLILZ = enumC432420GxUArr;
        new C2254308sP(enumC432420GxUArr);
    }

    public static EnumC432420GxU[] values() {
        return (EnumC432420GxU[]) LLILZ.clone();
    }

    public static EnumC432420GxU valueOf(String str) {
        return (EnumC432420GxU) C08FF.LIZ(EnumC432420GxU.class, str);
    }

    public EnumC432420GxU(String str, int i) {
    }
}
