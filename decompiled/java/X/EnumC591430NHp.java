package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0NHp, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class EnumC591430NHp {
    public static final EnumC591430NHp LL;
    public static final EnumC591430NHp LLILLJJLI;
    public static final /* synthetic */ EnumC591430NHp[] LLILLL;

    static {
        EnumC591430NHp enumC591430NHp = new EnumC591430NHp("JSON", 0);
        LL = enumC591430NHp;
        EnumC591430NHp enumC591430NHp2 = new EnumC591430NHp("PB", 1);
        LLILLJJLI = enumC591430NHp2;
        EnumC591430NHp[] enumC591430NHpArr = {enumC591430NHp, enumC591430NHp2};
        LLILLL = enumC591430NHpArr;
        new C2254308sP(enumC591430NHpArr);
    }

    public static EnumC591430NHp[] values() {
        return (EnumC591430NHp[]) LLILLL.clone();
    }

    public static EnumC591430NHp valueOf(String str) {
        return (EnumC591430NHp) C08FF.LIZ(EnumC591430NHp.class, str);
    }

    public EnumC591430NHp(String str, int i) {
    }
}
