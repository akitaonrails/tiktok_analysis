package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0lAr, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class EnumC1347670lAr {
    public static final /* synthetic */ EnumC1347670lAr[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC1347670lAr ON_PAUSE;
    public static final EnumC1347670lAr ON_RESUME;
    public static final EnumC1347670lAr ON_START;
    public static final EnumC1347670lAr UN_INIT;

    public static InterfaceC2044707zh<EnumC1347670lAr> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC1347670lAr enumC1347670lAr = new EnumC1347670lAr("UN_INIT", 0);
        UN_INIT = enumC1347670lAr;
        EnumC1347670lAr enumC1347670lAr2 = new EnumC1347670lAr("ON_START", 1);
        ON_START = enumC1347670lAr2;
        EnumC1347670lAr enumC1347670lAr3 = new EnumC1347670lAr("ON_RESUME", 2);
        ON_RESUME = enumC1347670lAr3;
        EnumC1347670lAr enumC1347670lAr4 = new EnumC1347670lAr("ON_PAUSE", 3);
        ON_PAUSE = enumC1347670lAr4;
        EnumC1347670lAr[] enumC1347670lArArr = {enumC1347670lAr, enumC1347670lAr2, enumC1347670lAr3, enumC1347670lAr4};
        LL = enumC1347670lArArr;
        LLILLJJLI = new C2254308sP(enumC1347670lArArr);
    }

    public static EnumC1347670lAr[] values() {
        return (EnumC1347670lAr[]) LL.clone();
    }

    public static EnumC1347670lAr valueOf(String str) {
        return (EnumC1347670lAr) C08FF.LIZ(EnumC1347670lAr.class, str);
    }

    public EnumC1347670lAr(String str, int i) {
    }
}
