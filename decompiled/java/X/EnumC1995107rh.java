package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.07rh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class EnumC1995107rh {
    public static final EnumC1995107rh LL;
    public static final EnumC1995107rh LLILLJJLI;
    public static final EnumC1995107rh LLILLL;
    public static final /* synthetic */ EnumC1995107rh[] LLILZ;

    static {
        EnumC1995107rh enumC1995107rh = new EnumC1995107rh("NONE", 0);
        LL = enumC1995107rh;
        EnumC1995107rh enumC1995107rh2 = new EnumC1995107rh("RUBBER_BAND", 1);
        LLILLJJLI = enumC1995107rh2;
        EnumC1995107rh enumC1995107rh3 = new EnumC1995107rh("SCALE_REDUCTION", 2);
        LLILLL = enumC1995107rh3;
        EnumC1995107rh[] enumC1995107rhArr = {enumC1995107rh, enumC1995107rh2, enumC1995107rh3};
        LLILZ = enumC1995107rhArr;
        new C2254308sP(enumC1995107rhArr);
    }

    public static EnumC1995107rh[] values() {
        return (EnumC1995107rh[]) LLILZ.clone();
    }

    public static EnumC1995107rh valueOf(String str) {
        return (EnumC1995107rh) C08FF.LIZ(EnumC1995107rh.class, str);
    }

    public EnumC1995107rh(String str, int i) {
    }
}
