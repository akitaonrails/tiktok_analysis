package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0ZNp, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class EnumC898750ZNp {
    public static final EnumC898750ZNp CONTROL;
    public static final C898760ZNq Companion;
    public static final /* synthetic */ EnumC898750ZNp[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC898750ZNp V1;
    public static final EnumC898750ZNp V2;
    public static final EnumC898750ZNp V3;
    public static final EnumC898750ZNp V4;
    public final int LL;

    public static InterfaceC2044707zh<EnumC898750ZNp> getEntries() {
        return LLILLL;
    }

    /* JADX WARN: Type inference failed for: r0v7, types: [X.0ZNq] */
    static {
        EnumC898750ZNp enumC898750ZNp = new EnumC898750ZNp("CONTROL", 0, 0);
        CONTROL = enumC898750ZNp;
        EnumC898750ZNp enumC898750ZNp2 = new EnumC898750ZNp("V1", 1, 1);
        V1 = enumC898750ZNp2;
        EnumC898750ZNp enumC898750ZNp3 = new EnumC898750ZNp("V2", 2, 2);
        V2 = enumC898750ZNp3;
        EnumC898750ZNp enumC898750ZNp4 = new EnumC898750ZNp("V3", 3, 3);
        V3 = enumC898750ZNp4;
        EnumC898750ZNp enumC898750ZNp5 = new EnumC898750ZNp("V4", 4, 4);
        V4 = enumC898750ZNp5;
        EnumC898750ZNp[] enumC898750ZNpArr = {enumC898750ZNp, enumC898750ZNp2, enumC898750ZNp3, enumC898750ZNp4, enumC898750ZNp5};
        LLILLJJLI = enumC898750ZNpArr;
        LLILLL = new C2254308sP(enumC898750ZNpArr);
        Companion = new Object() { // from class: X.0ZNq
        };
    }

    public static EnumC898750ZNp[] values() {
        return (EnumC898750ZNp[]) LLILLJJLI.clone();
    }

    public final int getLibraValue() {
        return this.LL;
    }

    public static EnumC898750ZNp valueOf(String str) {
        return (EnumC898750ZNp) C08FF.LIZ(EnumC898750ZNp.class, str);
    }

    public EnumC898750ZNp(String str, int i, int i2) {
        this.LL = i2;
    }
}
