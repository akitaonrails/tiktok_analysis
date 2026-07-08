package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.00wu, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC243800wu {
    public static final EnumC243800wu ALL;
    public static final /* synthetic */ EnumC243800wu[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC243800wu ONLY_GIFT;
    public static final EnumC243800wu ONLY_NORMAL;

    public static InterfaceC2044707zh<EnumC243800wu> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC243800wu enumC243800wu = new EnumC243800wu("ALL", 0);
        ALL = enumC243800wu;
        EnumC243800wu enumC243800wu2 = new EnumC243800wu("ONLY_NORMAL", 1);
        ONLY_NORMAL = enumC243800wu2;
        EnumC243800wu enumC243800wu3 = new EnumC243800wu("ONLY_GIFT", 2);
        ONLY_GIFT = enumC243800wu3;
        EnumC243800wu[] enumC243800wuArr = {enumC243800wu, enumC243800wu2, enumC243800wu3};
        LL = enumC243800wuArr;
        LLILLJJLI = new C2254308sP(enumC243800wuArr);
    }

    public static EnumC243800wu[] values() {
        return (EnumC243800wu[]) LL.clone();
    }

    public static EnumC243800wu valueOf(String str) {
        return (EnumC243800wu) C08FF.LIZ(EnumC243800wu.class, str);
    }

    public EnumC243800wu(String str, int i) {
    }
}
