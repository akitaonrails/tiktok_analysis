package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0XfQ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class EnumC854380XfQ {
    public static final C858250Xlf Companion;
    public static final EnumC854380XfQ EMAIL;
    public static final /* synthetic */ EnumC854380XfQ[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC854380XfQ PASSWORD;
    public static final EnumC854380XfQ PHONE;
    public final int LL;

    public static InterfaceC2044707zh<EnumC854380XfQ> getEntries() {
        return LLILLL;
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [X.0Xlf] */
    static {
        EnumC854380XfQ enumC854380XfQ = new EnumC854380XfQ("PHONE", 0, 0);
        PHONE = enumC854380XfQ;
        EnumC854380XfQ enumC854380XfQ2 = new EnumC854380XfQ("EMAIL", 1, 1);
        EMAIL = enumC854380XfQ2;
        EnumC854380XfQ enumC854380XfQ3 = new EnumC854380XfQ("PASSWORD", 2, 2);
        PASSWORD = enumC854380XfQ3;
        EnumC854380XfQ[] enumC854380XfQArr = {enumC854380XfQ, enumC854380XfQ2, enumC854380XfQ3};
        LLILLJJLI = enumC854380XfQArr;
        LLILLL = new C2254308sP(enumC854380XfQArr);
        Companion = new Object() { // from class: X.0Xlf
        };
    }

    public static EnumC854380XfQ[] values() {
        return (EnumC854380XfQ[]) LLILLJJLI.clone();
    }

    public final int getValue() {
        return this.LL;
    }

    public static EnumC854380XfQ valueOf(String str) {
        return (EnumC854380XfQ) C08FF.LIZ(EnumC854380XfQ.class, str);
    }

    public EnumC854380XfQ(String str, int i, int i2) {
        this.LL = i2;
    }
}
