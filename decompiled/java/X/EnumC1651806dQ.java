package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.06dQ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class EnumC1651806dQ {
    public static final /* synthetic */ EnumC1651806dQ[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC1651806dQ O18;
    public static final EnumC1651806dQ U16;
    public static final EnumC1651806dQ U18;
    public final String LL;

    public static InterfaceC2044707zh<EnumC1651806dQ> getEntries() {
        return LLILLL;
    }

    static {
        EnumC1651806dQ enumC1651806dQ = new EnumC1651806dQ("U16", 0, "msg_read_status_default");
        U16 = enumC1651806dQ;
        EnumC1651806dQ enumC1651806dQ2 = new EnumC1651806dQ("U18", 1, "msg_read_status_guide");
        U18 = enumC1651806dQ2;
        EnumC1651806dQ enumC1651806dQ3 = new EnumC1651806dQ("O18", 2, "msg_read_status_notice");
        O18 = enumC1651806dQ3;
        EnumC1651806dQ[] enumC1651806dQArr = {enumC1651806dQ, enumC1651806dQ2, enumC1651806dQ3};
        LLILLJJLI = enumC1651806dQArr;
        LLILLL = new C2254308sP(enumC1651806dQArr);
    }

    public static EnumC1651806dQ[] values() {
        return (EnumC1651806dQ[]) LLILLJJLI.clone();
    }

    public final String getNoticeCode() {
        return this.LL;
    }

    public static EnumC1651806dQ valueOf(String str) {
        return (EnumC1651806dQ) C08FF.LIZ(EnumC1651806dQ.class, str);
    }

    public EnumC1651806dQ(String str, int i, String str2) {
        this.LL = str2;
    }
}
