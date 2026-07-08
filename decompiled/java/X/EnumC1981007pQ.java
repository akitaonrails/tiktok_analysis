package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.07pQ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class EnumC1981007pQ {
    public static final EnumC1981007pQ BODY;
    public static final /* synthetic */ EnumC1981007pQ[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC1981007pQ QUERY;
    public final int LL;

    public static InterfaceC2044707zh<EnumC1981007pQ> getEntries() {
        return LLILLL;
    }

    static {
        EnumC1981007pQ enumC1981007pQ = new EnumC1981007pQ("QUERY", 0, 0);
        QUERY = enumC1981007pQ;
        EnumC1981007pQ enumC1981007pQ2 = new EnumC1981007pQ("BODY", 1, 1);
        BODY = enumC1981007pQ2;
        EnumC1981007pQ[] enumC1981007pQArr = {enumC1981007pQ, enumC1981007pQ2};
        LLILLJJLI = enumC1981007pQArr;
        LLILLL = new C2254308sP(enumC1981007pQArr);
    }

    public static EnumC1981007pQ[] values() {
        return (EnumC1981007pQ[]) LLILLJJLI.clone();
    }

    public final int getValue() {
        return this.LL;
    }

    public static EnumC1981007pQ valueOf(String str) {
        return (EnumC1981007pQ) C08FF.LIZ(EnumC1981007pQ.class, str);
    }

    public EnumC1981007pQ(String str, int i, int i2) {
        this.LL = i2;
    }
}
