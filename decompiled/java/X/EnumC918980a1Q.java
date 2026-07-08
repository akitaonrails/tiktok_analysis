package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0a1Q, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class EnumC918980a1Q {
    public static final EnumC918980a1Q BATTLE_IM;
    public static final EnumC918980a1Q COHOST_LAYOUT_UPDATE_IM;
    public static final EnumC918980a1Q COMPETITION_IM;
    public static final /* synthetic */ EnumC918980a1Q[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC918980a1Q UPDATE_LAYOUT_API;

    public static InterfaceC2044707zh<EnumC918980a1Q> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC918980a1Q enumC918980a1Q = new EnumC918980a1Q("BATTLE_IM", 0);
        BATTLE_IM = enumC918980a1Q;
        EnumC918980a1Q enumC918980a1Q2 = new EnumC918980a1Q("COMPETITION_IM", 1);
        COMPETITION_IM = enumC918980a1Q2;
        EnumC918980a1Q enumC918980a1Q3 = new EnumC918980a1Q("UPDATE_LAYOUT_API", 2);
        UPDATE_LAYOUT_API = enumC918980a1Q3;
        EnumC918980a1Q enumC918980a1Q4 = new EnumC918980a1Q("COHOST_LAYOUT_UPDATE_IM", 3);
        COHOST_LAYOUT_UPDATE_IM = enumC918980a1Q4;
        EnumC918980a1Q[] enumC918980a1QArr = {enumC918980a1Q, enumC918980a1Q2, enumC918980a1Q3, enumC918980a1Q4};
        LL = enumC918980a1QArr;
        LLILLJJLI = new C2254308sP(enumC918980a1QArr);
    }

    public static EnumC918980a1Q[] values() {
        return (EnumC918980a1Q[]) LL.clone();
    }

    public static EnumC918980a1Q valueOf(String str) {
        return (EnumC918980a1Q) C08FF.LIZ(EnumC918980a1Q.class, str);
    }

    public EnumC918980a1Q(String str, int i) {
    }
}
