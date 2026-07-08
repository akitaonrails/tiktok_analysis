package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0b5M, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class EnumC959860b5M {
    public static final /* synthetic */ EnumC959860b5M[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC959860b5M P2P_GROUP_CHANGE_IM;
    public static final EnumC959860b5M QUICK_BATTLE_START;
    public static final EnumC959860b5M QUICK_CO_HOST_FINISH;
    public static final EnumC959860b5M QUICK_CO_HOST_START;

    public static InterfaceC2044707zh<EnumC959860b5M> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC959860b5M enumC959860b5M = new EnumC959860b5M("QUICK_CO_HOST_START", 0);
        QUICK_CO_HOST_START = enumC959860b5M;
        EnumC959860b5M enumC959860b5M2 = new EnumC959860b5M("QUICK_CO_HOST_FINISH", 1);
        QUICK_CO_HOST_FINISH = enumC959860b5M2;
        EnumC959860b5M enumC959860b5M3 = new EnumC959860b5M("P2P_GROUP_CHANGE_IM", 2);
        P2P_GROUP_CHANGE_IM = enumC959860b5M3;
        EnumC959860b5M enumC959860b5M4 = new EnumC959860b5M("QUICK_BATTLE_START", 3);
        QUICK_BATTLE_START = enumC959860b5M4;
        EnumC959860b5M[] enumC959860b5MArr = {enumC959860b5M, enumC959860b5M2, enumC959860b5M3, enumC959860b5M4};
        LL = enumC959860b5MArr;
        LLILLJJLI = new C2254308sP(enumC959860b5MArr);
    }

    public static EnumC959860b5M[] values() {
        return (EnumC959860b5M[]) LL.clone();
    }

    public static EnumC959860b5M valueOf(String str) {
        return (EnumC959860b5M) C08FF.LIZ(EnumC959860b5M.class, str);
    }

    public EnumC959860b5M(String str, int i) {
    }
}
