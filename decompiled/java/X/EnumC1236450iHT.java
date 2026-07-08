package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0iHT, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class EnumC1236450iHT {
    public static final EnumC1236450iHT CELL;
    public static final EnumC1236450iHT GROUP_HEAD;
    public static final EnumC1236450iHT GROUP_NAME;
    public static final /* synthetic */ EnumC1236450iHT[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC1236450iHT MEMBER_HEAD;
    public static final EnumC1236450iHT MEMBER_NAME;
    public final String LL;

    public static InterfaceC2044707zh<EnumC1236450iHT> getEntries() {
        return LLILLL;
    }

    static {
        EnumC1236450iHT enumC1236450iHT = new EnumC1236450iHT("MEMBER_HEAD", 0, "member_head");
        MEMBER_HEAD = enumC1236450iHT;
        EnumC1236450iHT enumC1236450iHT2 = new EnumC1236450iHT("GROUP_HEAD", 1, "group_head");
        GROUP_HEAD = enumC1236450iHT2;
        EnumC1236450iHT enumC1236450iHT3 = new EnumC1236450iHT("MEMBER_NAME", 2, "member_name");
        MEMBER_NAME = enumC1236450iHT3;
        EnumC1236450iHT enumC1236450iHT4 = new EnumC1236450iHT("GROUP_NAME", 3, "group_name");
        GROUP_NAME = enumC1236450iHT4;
        EnumC1236450iHT enumC1236450iHT5 = new EnumC1236450iHT("CELL", 4, "cell");
        CELL = enumC1236450iHT5;
        EnumC1236450iHT[] enumC1236450iHTArr = {enumC1236450iHT, enumC1236450iHT2, enumC1236450iHT3, enumC1236450iHT4, enumC1236450iHT5};
        LLILLJJLI = enumC1236450iHTArr;
        LLILLL = new C2254308sP(enumC1236450iHTArr);
    }

    public static EnumC1236450iHT[] values() {
        return (EnumC1236450iHT[]) LLILLJJLI.clone();
    }

    public final String getParamValue() {
        return this.LL;
    }

    public static EnumC1236450iHT valueOf(String str) {
        return (EnumC1236450iHT) C08FF.LIZ(EnumC1236450iHT.class, str);
    }

    public EnumC1236450iHT(String str, int i, String str2) {
        this.LL = str2;
    }
}
