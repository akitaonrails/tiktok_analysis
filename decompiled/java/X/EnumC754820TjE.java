package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0TjE, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class EnumC754820TjE {
    public static final EnumC754820TjE FINISH;
    public static final EnumC754820TjE GAME_CATEGORY_LIST;
    public static final EnumC754820TjE GO_BACK;
    public static final EnumC754820TjE HASHTAG_LIST;
    public static final /* synthetic */ EnumC754820TjE[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;

    public static InterfaceC2044707zh<EnumC754820TjE> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC754820TjE enumC754820TjE = new EnumC754820TjE("FINISH", 0);
        FINISH = enumC754820TjE;
        EnumC754820TjE enumC754820TjE2 = new EnumC754820TjE("GO_BACK", 1);
        GO_BACK = enumC754820TjE2;
        EnumC754820TjE enumC754820TjE3 = new EnumC754820TjE("HASHTAG_LIST", 2);
        HASHTAG_LIST = enumC754820TjE3;
        EnumC754820TjE enumC754820TjE4 = new EnumC754820TjE("GAME_CATEGORY_LIST", 3);
        GAME_CATEGORY_LIST = enumC754820TjE4;
        EnumC754820TjE[] enumC754820TjEArr = {enumC754820TjE, enumC754820TjE2, enumC754820TjE3, enumC754820TjE4};
        LL = enumC754820TjEArr;
        LLILLJJLI = new C2254308sP(enumC754820TjEArr);
    }

    public static EnumC754820TjE[] values() {
        return (EnumC754820TjE[]) LL.clone();
    }

    public static EnumC754820TjE valueOf(String str) {
        return (EnumC754820TjE) C08FF.LIZ(EnumC754820TjE.class, str);
    }

    public EnumC754820TjE(String str, int i) {
    }
}
