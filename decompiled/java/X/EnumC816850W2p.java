package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0W2p, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class EnumC816850W2p {
    public static final /* synthetic */ EnumC816850W2p[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC816850W2p MAF;
    public static final EnumC816850W2p SORTED_MAF;
    public static final EnumC816850W2p USER;
    public final int LL;

    public static InterfaceC2044707zh<EnumC816850W2p> getEntries() {
        return LLILLL;
    }

    static {
        EnumC816850W2p enumC816850W2p = new EnumC816850W2p("USER", 0, 80216132);
        USER = enumC816850W2p;
        EnumC816850W2p enumC816850W2p2 = new EnumC816850W2p("MAF", 1, 1);
        MAF = enumC816850W2p2;
        EnumC816850W2p enumC816850W2p3 = new EnumC816850W2p("SORTED_MAF", 2, 2);
        SORTED_MAF = enumC816850W2p3;
        EnumC816850W2p[] enumC816850W2pArr = {enumC816850W2p, enumC816850W2p2, enumC816850W2p3};
        LLILLJJLI = enumC816850W2pArr;
        LLILLL = new C2254308sP(enumC816850W2pArr);
    }

    public static EnumC816850W2p[] values() {
        return (EnumC816850W2p[]) LLILLJJLI.clone();
    }

    public final int getValue() {
        return this.LL;
    }

    public static EnumC816850W2p valueOf(String str) {
        return (EnumC816850W2p) C08FF.LIZ(EnumC816850W2p.class, str);
    }

    public EnumC816850W2p(String str, int i, int i2) {
        this.LL = i2;
    }
}
