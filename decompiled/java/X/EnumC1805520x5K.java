package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0x5K, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class EnumC1805520x5K {
    public static final /* synthetic */ EnumC1805520x5K[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC1805520x5K NEW;
    public static final EnumC1805520x5K NONE;
    public static final EnumC1805520x5K REVAMP;
    public static final EnumC1805520x5K STUBBORN;
    public final String LL;

    public static InterfaceC2044707zh<EnumC1805520x5K> getEntries() {
        return LLILLL;
    }

    static {
        EnumC1805520x5K enumC1805520x5K = new EnumC1805520x5K("NONE", 0, "");
        NONE = enumC1805520x5K;
        EnumC1805520x5K enumC1805520x5K2 = new EnumC1805520x5K("NEW", 1, "new");
        NEW = enumC1805520x5K2;
        EnumC1805520x5K enumC1805520x5K3 = new EnumC1805520x5K("STUBBORN", 2, "stubborn");
        STUBBORN = enumC1805520x5K3;
        EnumC1805520x5K enumC1805520x5K4 = new EnumC1805520x5K("REVAMP", 3, "revamp");
        REVAMP = enumC1805520x5K4;
        EnumC1805520x5K[] enumC1805520x5KArr = {enumC1805520x5K, enumC1805520x5K2, enumC1805520x5K3, enumC1805520x5K4};
        LLILLJJLI = enumC1805520x5KArr;
        LLILLL = new C2254308sP(enumC1805520x5KArr);
    }

    public static EnumC1805520x5K[] values() {
        return (EnumC1805520x5K[]) LLILLJJLI.clone();
    }

    public final String getGroupName() {
        return this.LL;
    }

    public static EnumC1805520x5K valueOf(String str) {
        return (EnumC1805520x5K) C08FF.LIZ(EnumC1805520x5K.class, str);
    }

    public EnumC1805520x5K(String str, int i, String str2) {
        this.LL = str2;
    }
}
