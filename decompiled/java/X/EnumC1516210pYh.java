package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0pYh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class EnumC1516210pYh {
    public static final EnumC1516210pYh LL;
    public static final EnumC1516210pYh LLILLJJLI;
    public static final /* synthetic */ EnumC1516210pYh[] LLILLL;

    static {
        EnumC1516210pYh enumC1516210pYh = new EnumC1516210pYh("DEFER", 0);
        LL = enumC1516210pYh;
        EnumC1516210pYh enumC1516210pYh2 = new EnumC1516210pYh("PREFER", 1);
        LLILLJJLI = enumC1516210pYh2;
        EnumC1516210pYh[] enumC1516210pYhArr = {enumC1516210pYh, enumC1516210pYh2};
        LLILLL = enumC1516210pYhArr;
        new C2254308sP(enumC1516210pYhArr);
    }

    public static EnumC1516210pYh[] values() {
        return (EnumC1516210pYh[]) LLILLL.clone();
    }

    public static EnumC1516210pYh valueOf(String str) {
        return (EnumC1516210pYh) C08FF.LIZ(EnumC1516210pYh.class, str);
    }

    public EnumC1516210pYh(String str, int i) {
    }
}
