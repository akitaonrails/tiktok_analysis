package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0b7K, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class EnumC961080b7K {
    public static final EnumC961080b7K IDLE;
    public static final /* synthetic */ EnumC961080b7K[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC961080b7K TOP_LIVING_FRIEND;
    public static final EnumC961080b7K TOP_LIVING_MAY_KNOW;
    public static final EnumC961080b7K TOP_LIVING_RECOMMEND;
    public static final EnumC961080b7K TOP_LIVING_VIEWER_SUGGESTION;

    public static InterfaceC2044707zh<EnumC961080b7K> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC961080b7K enumC961080b7K = new EnumC961080b7K("IDLE", 0);
        IDLE = enumC961080b7K;
        EnumC961080b7K enumC961080b7K2 = new EnumC961080b7K("TOP_LIVING_FRIEND", 1);
        TOP_LIVING_FRIEND = enumC961080b7K2;
        EnumC961080b7K enumC961080b7K3 = new EnumC961080b7K("TOP_LIVING_RECOMMEND", 2);
        TOP_LIVING_RECOMMEND = enumC961080b7K3;
        EnumC961080b7K enumC961080b7K4 = new EnumC961080b7K("TOP_LIVING_MAY_KNOW", 3);
        TOP_LIVING_MAY_KNOW = enumC961080b7K4;
        EnumC961080b7K enumC961080b7K5 = new EnumC961080b7K("TOP_LIVING_VIEWER_SUGGESTION", 4);
        TOP_LIVING_VIEWER_SUGGESTION = enumC961080b7K5;
        EnumC961080b7K[] enumC961080b7KArr = {enumC961080b7K, enumC961080b7K2, enumC961080b7K3, enumC961080b7K4, enumC961080b7K5};
        LL = enumC961080b7KArr;
        LLILLJJLI = new C2254308sP(enumC961080b7KArr);
    }

    public static EnumC961080b7K[] values() {
        return (EnumC961080b7K[]) LL.clone();
    }

    public static EnumC961080b7K valueOf(String str) {
        return (EnumC961080b7K) C08FF.LIZ(EnumC961080b7K.class, str);
    }

    public EnumC961080b7K(String str, int i) {
    }
}
