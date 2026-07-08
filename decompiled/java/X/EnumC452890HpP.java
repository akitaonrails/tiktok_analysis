package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0HpP, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class EnumC452890HpP {
    public static final EnumC452890HpP LL;
    public static final EnumC452890HpP LLILLJJLI;
    public static final EnumC452890HpP LLILLL;
    public static final /* synthetic */ EnumC452890HpP[] LLILZ;

    static {
        EnumC452890HpP enumC452890HpP = new EnumC452890HpP("IDLE", 0);
        LL = enumC452890HpP;
        EnumC452890HpP enumC452890HpP2 = new EnumC452890HpP("WAITING", 1);
        LLILLJJLI = enumC452890HpP2;
        EnumC452890HpP enumC452890HpP3 = new EnumC452890HpP("TIMED_OUT", 2);
        LLILLL = enumC452890HpP3;
        EnumC452890HpP[] enumC452890HpPArr = {enumC452890HpP, enumC452890HpP2, enumC452890HpP3};
        LLILZ = enumC452890HpPArr;
        new C2254308sP(enumC452890HpPArr);
    }

    public static EnumC452890HpP[] values() {
        return (EnumC452890HpP[]) LLILZ.clone();
    }

    public static EnumC452890HpP valueOf(String str) {
        return (EnumC452890HpP) C08FF.LIZ(EnumC452890HpP.class, str);
    }

    public EnumC452890HpP(String str, int i) {
    }
}
