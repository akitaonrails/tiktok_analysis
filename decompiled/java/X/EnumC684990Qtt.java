package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0Qtt, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class EnumC684990Qtt {
    public static final EnumC684990Qtt IMAGE;
    public static final /* synthetic */ EnumC684990Qtt[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC684990Qtt LYNX_SPECIAL_CARD;
    public static final EnumC684990Qtt NIMBLE;
    public static final EnumC684990Qtt SUB_ITEM;
    public static final EnumC684990Qtt VIDEO_STACK;
    public static final EnumC684990Qtt WORD;

    public static InterfaceC2044707zh<EnumC684990Qtt> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC684990Qtt enumC684990Qtt = new EnumC684990Qtt("SUB_ITEM", 0);
        SUB_ITEM = enumC684990Qtt;
        EnumC684990Qtt enumC684990Qtt2 = new EnumC684990Qtt("VIDEO_STACK", 1);
        VIDEO_STACK = enumC684990Qtt2;
        EnumC684990Qtt enumC684990Qtt3 = new EnumC684990Qtt("LYNX_SPECIAL_CARD", 2);
        LYNX_SPECIAL_CARD = enumC684990Qtt3;
        EnumC684990Qtt enumC684990Qtt4 = new EnumC684990Qtt("WORD", 3);
        WORD = enumC684990Qtt4;
        EnumC684990Qtt enumC684990Qtt5 = new EnumC684990Qtt("NIMBLE", 4);
        NIMBLE = enumC684990Qtt5;
        EnumC684990Qtt enumC684990Qtt6 = new EnumC684990Qtt("IMAGE", 5);
        IMAGE = enumC684990Qtt6;
        EnumC684990Qtt[] enumC684990QttArr = {enumC684990Qtt, enumC684990Qtt2, enumC684990Qtt3, enumC684990Qtt4, enumC684990Qtt5, enumC684990Qtt6};
        LL = enumC684990QttArr;
        LLILLJJLI = new C2254308sP(enumC684990QttArr);
    }

    public static EnumC684990Qtt[] values() {
        return (EnumC684990Qtt[]) LL.clone();
    }

    public static EnumC684990Qtt valueOf(String str) {
        return (EnumC684990Qtt) C08FF.LIZ(EnumC684990Qtt.class, str);
    }

    public EnumC684990Qtt(String str, int i) {
    }
}
