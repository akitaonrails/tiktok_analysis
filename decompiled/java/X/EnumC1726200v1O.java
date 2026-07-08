package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0v1O, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class EnumC1726200v1O {
    public static final EnumC1726200v1O DIGG;
    public static final /* synthetic */ EnumC1726200v1O[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC1726200v1O REVIEW;
    public static final EnumC1726200v1O TRANS;
    public final int LL;

    public static InterfaceC2044707zh<EnumC1726200v1O> getEntries() {
        return LLILLL;
    }

    static {
        EnumC1726200v1O enumC1726200v1O = new EnumC1726200v1O("REVIEW", 0, 1);
        REVIEW = enumC1726200v1O;
        EnumC1726200v1O enumC1726200v1O2 = new EnumC1726200v1O("TRANS", 1, 2);
        TRANS = enumC1726200v1O2;
        EnumC1726200v1O enumC1726200v1O3 = new EnumC1726200v1O("DIGG", 2, 3);
        DIGG = enumC1726200v1O3;
        EnumC1726200v1O[] enumC1726200v1OArr = {enumC1726200v1O, enumC1726200v1O2, enumC1726200v1O3};
        LLILLJJLI = enumC1726200v1OArr;
        LLILLL = new C2254308sP(enumC1726200v1OArr);
    }

    public static EnumC1726200v1O[] values() {
        return (EnumC1726200v1O[]) LLILLJJLI.clone();
    }

    public final int getValue() {
        return this.LL;
    }

    public static EnumC1726200v1O valueOf(String str) {
        return (EnumC1726200v1O) C08FF.LIZ(EnumC1726200v1O.class, str);
    }

    public EnumC1726200v1O(String str, int i, int i2) {
        this.LL = i2;
    }
}
