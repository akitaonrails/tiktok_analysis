package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0nnQ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class EnumC1448460nnQ {
    public static final EnumC1448460nnQ DM_V1;
    public static final EnumC1448460nnQ IC;
    public static final /* synthetic */ EnumC1448460nnQ[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;

    public static InterfaceC2044707zh<EnumC1448460nnQ> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC1448460nnQ enumC1448460nnQ = new EnumC1448460nnQ("IC", 0);
        IC = enumC1448460nnQ;
        EnumC1448460nnQ enumC1448460nnQ2 = new EnumC1448460nnQ("DM_V1", 1);
        DM_V1 = enumC1448460nnQ2;
        EnumC1448460nnQ[] enumC1448460nnQArr = {enumC1448460nnQ, enumC1448460nnQ2};
        LL = enumC1448460nnQArr;
        LLILLJJLI = new C2254308sP(enumC1448460nnQArr);
    }

    public static EnumC1448460nnQ[] values() {
        return (EnumC1448460nnQ[]) LL.clone();
    }

    public static EnumC1448460nnQ valueOf(String str) {
        return (EnumC1448460nnQ) C08FF.LIZ(EnumC1448460nnQ.class, str);
    }

    public EnumC1448460nnQ(String str, int i) {
    }
}
