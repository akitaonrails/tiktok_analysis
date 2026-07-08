package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.10Gp, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class EnumC19218510Gp {
    public static final EnumC19218510Gp LL;
    public static final EnumC19218510Gp LLILLJJLI;
    public static final EnumC19218510Gp LLILLL;
    public static final /* synthetic */ EnumC19218510Gp[] LLILZ;

    static {
        EnumC19218510Gp enumC19218510Gp = new EnumC19218510Gp("NONE", 0);
        LL = enumC19218510Gp;
        EnumC19218510Gp enumC19218510Gp2 = new EnumC19218510Gp("LIKED", 1);
        LLILLJJLI = enumC19218510Gp2;
        EnumC19218510Gp enumC19218510Gp3 = new EnumC19218510Gp("DISLIKED", 2);
        LLILLL = enumC19218510Gp3;
        EnumC19218510Gp[] enumC19218510GpArr = {enumC19218510Gp, enumC19218510Gp2, enumC19218510Gp3};
        LLILZ = enumC19218510GpArr;
        new C2254308sP(enumC19218510GpArr);
    }

    public static EnumC19218510Gp[] values() {
        return (EnumC19218510Gp[]) LLILZ.clone();
    }

    public static EnumC19218510Gp valueOf(String str) {
        return (EnumC19218510Gp) C08FF.LIZ(EnumC19218510Gp.class, str);
    }

    public EnumC19218510Gp(String str, int i) {
    }
}
