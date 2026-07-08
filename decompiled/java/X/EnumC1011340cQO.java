package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0cQO, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class EnumC1011340cQO {
    public static final EnumC1011340cQO FOLLOW;
    public static final /* synthetic */ EnumC1011340cQO[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC1011340cQO NORMAL;
    public static final EnumC1011340cQO TOP_SINGLE_CARD;

    public static InterfaceC2044707zh<EnumC1011340cQO> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC1011340cQO enumC1011340cQO = new EnumC1011340cQO("NORMAL", 0);
        NORMAL = enumC1011340cQO;
        EnumC1011340cQO enumC1011340cQO2 = new EnumC1011340cQO("FOLLOW", 1);
        FOLLOW = enumC1011340cQO2;
        EnumC1011340cQO enumC1011340cQO3 = new EnumC1011340cQO("TOP_SINGLE_CARD", 2);
        TOP_SINGLE_CARD = enumC1011340cQO3;
        EnumC1011340cQO[] enumC1011340cQOArr = {enumC1011340cQO, enumC1011340cQO2, enumC1011340cQO3};
        LL = enumC1011340cQOArr;
        LLILLJJLI = new C2254308sP(enumC1011340cQOArr);
    }

    public static EnumC1011340cQO[] values() {
        return (EnumC1011340cQO[]) LL.clone();
    }

    public static EnumC1011340cQO valueOf(String str) {
        return (EnumC1011340cQO) C08FF.LIZ(EnumC1011340cQO.class, str);
    }

    public EnumC1011340cQO(String str, int i) {
    }
}
