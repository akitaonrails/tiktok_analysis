package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0wNm, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class EnumC1778520wNm {
    public static final EnumC1778520wNm KEEP_LAST_STATE;
    public static final /* synthetic */ EnumC1778520wNm[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC1778520wNm NEW;
    public static final EnumC1778520wNm READ_LAST_ANSWER;
    public static final EnumC1778520wNm READ_LAST_ANSWER_5_60;

    public static InterfaceC2044707zh<EnumC1778520wNm> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC1778520wNm enumC1778520wNm = new EnumC1778520wNm("NEW", 0);
        NEW = enumC1778520wNm;
        EnumC1778520wNm enumC1778520wNm2 = new EnumC1778520wNm("KEEP_LAST_STATE", 1);
        KEEP_LAST_STATE = enumC1778520wNm2;
        EnumC1778520wNm enumC1778520wNm3 = new EnumC1778520wNm("READ_LAST_ANSWER", 2);
        READ_LAST_ANSWER = enumC1778520wNm3;
        EnumC1778520wNm enumC1778520wNm4 = new EnumC1778520wNm("READ_LAST_ANSWER_5_60", 3);
        READ_LAST_ANSWER_5_60 = enumC1778520wNm4;
        EnumC1778520wNm[] enumC1778520wNmArr = {enumC1778520wNm, enumC1778520wNm2, enumC1778520wNm3, enumC1778520wNm4};
        LL = enumC1778520wNmArr;
        LLILLJJLI = new C2254308sP(enumC1778520wNmArr);
    }

    public static EnumC1778520wNm[] values() {
        return (EnumC1778520wNm[]) LL.clone();
    }

    public static EnumC1778520wNm valueOf(String str) {
        return (EnumC1778520wNm) C08FF.LIZ(EnumC1778520wNm.class, str);
    }

    public EnumC1778520wNm(String str, int i) {
    }
}
