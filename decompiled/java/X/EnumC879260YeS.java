package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0YeS, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class EnumC879260YeS {
    public static final EnumC879260YeS BOT;
    public static final C879270YeT Companion;
    public static final EnumC879260YeS HUMAN;
    public static final /* synthetic */ EnumC879260YeS[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;

    public static InterfaceC2044707zh<EnumC879260YeS> getEntries() {
        return LLILLJJLI;
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [X.0YeT] */
    static {
        EnumC879260YeS enumC879260YeS = new EnumC879260YeS("HUMAN", 0);
        HUMAN = enumC879260YeS;
        EnumC879260YeS enumC879260YeS2 = new EnumC879260YeS("BOT", 1);
        BOT = enumC879260YeS2;
        EnumC879260YeS[] enumC879260YeSArr = {enumC879260YeS, enumC879260YeS2};
        LL = enumC879260YeSArr;
        LLILLJJLI = new C2254308sP(enumC879260YeSArr);
        Companion = new Object() { // from class: X.0YeT
        };
    }

    public static EnumC879260YeS[] values() {
        return (EnumC879260YeS[]) LL.clone();
    }

    public final boolean isBot() {
        return this == BOT;
    }

    public static EnumC879260YeS valueOf(String str) {
        return (EnumC879260YeS) C08FF.LIZ(EnumC879260YeS.class, str);
    }

    public EnumC879260YeS(String str, int i) {
    }
}
