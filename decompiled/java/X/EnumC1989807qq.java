package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.07qq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class EnumC1989807qq {
    public static final /* synthetic */ EnumC1989807qq[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC1989807qq SINGLE_UNIT_ENQUEUE;
    public static final EnumC1989807qq TURN_TO_BG;
    public static final EnumC1989807qq TURN_TO_DISCARD;
    public final String LL;

    public static InterfaceC2044707zh<EnumC1989807qq> getEntries() {
        return LLILLL;
    }

    static {
        EnumC1989807qq enumC1989807qq = new EnumC1989807qq("TURN_TO_DISCARD", 0, "turn_to_discard");
        TURN_TO_DISCARD = enumC1989807qq;
        EnumC1989807qq enumC1989807qq2 = new EnumC1989807qq("SINGLE_UNIT_ENQUEUE", 1, "single_unit_enqueue");
        SINGLE_UNIT_ENQUEUE = enumC1989807qq2;
        EnumC1989807qq enumC1989807qq3 = new EnumC1989807qq("TURN_TO_BG", 2, "turn_to_bg");
        TURN_TO_BG = enumC1989807qq3;
        EnumC1989807qq[] enumC1989807qqArr = {enumC1989807qq, enumC1989807qq2, enumC1989807qq3};
        LLILLJJLI = enumC1989807qqArr;
        LLILLL = new C2254308sP(enumC1989807qqArr);
    }

    public static EnumC1989807qq[] values() {
        return (EnumC1989807qq[]) LLILLJJLI.clone();
    }

    public final String getMobValue() {
        return this.LL;
    }

    public static EnumC1989807qq valueOf(String str) {
        return (EnumC1989807qq) C08FF.LIZ(EnumC1989807qq.class, str);
    }

    public EnumC1989807qq(String str, int i, String str2) {
        this.LL = str2;
    }
}
