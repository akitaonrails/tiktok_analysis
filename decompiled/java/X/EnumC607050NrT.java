package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0NrT, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class EnumC607050NrT {
    public static final EnumC607050NrT LL;
    public static final EnumC607050NrT LLILLJJLI;
    public static final EnumC607050NrT LLILLL;
    public static final /* synthetic */ EnumC607050NrT[] LLILZ;

    static {
        EnumC607050NrT enumC607050NrT = new EnumC607050NrT("STALL", 0);
        LL = enumC607050NrT;
        EnumC607050NrT enumC607050NrT2 = new EnumC607050NrT("CONSUMED", 1);
        LLILLJJLI = enumC607050NrT2;
        EnumC607050NrT enumC607050NrT3 = new EnumC607050NrT("CONSECUTIVE_STALL", 2);
        LLILLL = enumC607050NrT3;
        EnumC607050NrT[] enumC607050NrTArr = {enumC607050NrT, enumC607050NrT2, enumC607050NrT3};
        LLILZ = enumC607050NrTArr;
        new C2254308sP(enumC607050NrTArr);
    }

    public static EnumC607050NrT[] values() {
        return (EnumC607050NrT[]) LLILZ.clone();
    }

    public static EnumC607050NrT valueOf(String str) {
        return (EnumC607050NrT) C08FF.LIZ(EnumC607050NrT.class, str);
    }

    public EnumC607050NrT(String str, int i) {
    }
}
