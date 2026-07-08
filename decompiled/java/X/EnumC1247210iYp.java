package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0iYp, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class EnumC1247210iYp {
    public static final EnumC1247210iYp FOLLOWER;
    public static final EnumC1247210iYp FOLLOWING;
    public static final /* synthetic */ EnumC1247210iYp[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC1247210iYp SCHOOL;
    public final int LL;

    public static InterfaceC2044707zh<EnumC1247210iYp> getEntries() {
        return LLILLL;
    }

    static {
        EnumC1247210iYp enumC1247210iYp = new EnumC1247210iYp("FOLLOWING", 0, 0);
        FOLLOWING = enumC1247210iYp;
        EnumC1247210iYp enumC1247210iYp2 = new EnumC1247210iYp("FOLLOWER", 1, 1);
        FOLLOWER = enumC1247210iYp2;
        EnumC1247210iYp enumC1247210iYp3 = new EnumC1247210iYp("SCHOOL", 2, 2);
        SCHOOL = enumC1247210iYp3;
        EnumC1247210iYp[] enumC1247210iYpArr = {enumC1247210iYp, enumC1247210iYp2, enumC1247210iYp3};
        LLILLJJLI = enumC1247210iYpArr;
        LLILLL = new C2254308sP(enumC1247210iYpArr);
    }

    public static EnumC1247210iYp[] values() {
        return (EnumC1247210iYp[]) LLILLJJLI.clone();
    }

    public final int getValue() {
        return this.LL;
    }

    public static EnumC1247210iYp valueOf(String str) {
        return (EnumC1247210iYp) C08FF.LIZ(EnumC1247210iYp.class, str);
    }

    public EnumC1247210iYp(String str, int i, int i2) {
        this.LL = i2;
    }
}
