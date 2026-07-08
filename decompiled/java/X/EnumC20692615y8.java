package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.15y8, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public final class EnumC20692615y8 {
    public static final /* synthetic */ EnumC20692615y8[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC20692615y8 PLAY_IN_ORDER;
    public static final EnumC20692615y8 REPEAT;

    public static InterfaceC2044707zh<EnumC20692615y8> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC20692615y8 enumC20692615y8 = new EnumC20692615y8("PLAY_IN_ORDER", 0);
        PLAY_IN_ORDER = enumC20692615y8;
        EnumC20692615y8 enumC20692615y82 = new EnumC20692615y8("REPEAT", 1);
        REPEAT = enumC20692615y82;
        EnumC20692615y8[] enumC20692615y8Arr = {enumC20692615y8, enumC20692615y82};
        LL = enumC20692615y8Arr;
        LLILLJJLI = new C2254308sP(enumC20692615y8Arr);
    }

    public static EnumC20692615y8[] values() {
        return (EnumC20692615y8[]) LL.clone();
    }

    public final String toMobString() {
        int i = C20692715y9.LIZ[ordinal()];
        if (i == 1) {
            return "order";
        }
        if (i == 2) {
            return "repeat";
        }
        throw new C1954807lC();
    }

    public static EnumC20692615y8 valueOf(String str) {
        return (EnumC20692615y8) C08FF.LIZ(EnumC20692615y8.class, str);
    }

    public EnumC20692615y8(String str, int i) {
    }
}
