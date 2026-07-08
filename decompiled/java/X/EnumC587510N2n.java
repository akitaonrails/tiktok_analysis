package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0N2n, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class EnumC587510N2n {
    public static final EnumC587510N2n DISLIKE_FEATURE;
    public static final EnumC587510N2n DISLIKE_USER;
    public static final /* synthetic */ EnumC587510N2n[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public final int LL;

    public static InterfaceC2044707zh<EnumC587510N2n> getEntries() {
        return LLILLL;
    }

    static {
        EnumC587510N2n enumC587510N2n = new EnumC587510N2n("DISLIKE_USER", 0, 0);
        DISLIKE_USER = enumC587510N2n;
        EnumC587510N2n enumC587510N2n2 = new EnumC587510N2n("DISLIKE_FEATURE", 1, 1);
        DISLIKE_FEATURE = enumC587510N2n2;
        EnumC587510N2n[] enumC587510N2nArr = {enumC587510N2n, enumC587510N2n2};
        LLILLJJLI = enumC587510N2nArr;
        LLILLL = new C2254308sP(enumC587510N2nArr);
    }

    public static EnumC587510N2n[] values() {
        return (EnumC587510N2n[]) LLILLJJLI.clone();
    }

    public final int getValue() {
        return this.LL;
    }

    public static EnumC587510N2n valueOf(String str) {
        return (EnumC587510N2n) C08FF.LIZ(EnumC587510N2n.class, str);
    }

    public EnumC587510N2n(String str, int i, int i2) {
        this.LL = i2;
    }
}
