package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0u1G, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class EnumC1687680u1G {
    public static final C1687720u1K Companion;
    public static final EnumC1687680u1G EXISTED;
    public static final /* synthetic */ EnumC1687680u1G[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC1687680u1G NEW;
    public static final EnumC1687680u1G NO_RELATION;
    public static final EnumC1687680u1G UNKNOWN;
    public final int LL;

    public static InterfaceC2044707zh<EnumC1687680u1G> getEntries() {
        return LLILLL;
    }

    static {
        EnumC1687680u1G enumC1687680u1G = new EnumC1687680u1G("UNKNOWN", 0, 0);
        UNKNOWN = enumC1687680u1G;
        EnumC1687680u1G enumC1687680u1G2 = new EnumC1687680u1G("EXISTED", 1, 1);
        EXISTED = enumC1687680u1G2;
        EnumC1687680u1G enumC1687680u1G3 = new EnumC1687680u1G("NEW", 2, 2);
        NEW = enumC1687680u1G3;
        EnumC1687680u1G enumC1687680u1G4 = new EnumC1687680u1G("NO_RELATION", 3, 3);
        NO_RELATION = enumC1687680u1G4;
        EnumC1687680u1G[] enumC1687680u1GArr = {enumC1687680u1G, enumC1687680u1G2, enumC1687680u1G3, enumC1687680u1G4};
        LLILLJJLI = enumC1687680u1GArr;
        LLILLL = new C2254308sP(enumC1687680u1GArr);
        Companion = new C1687720u1K();
    }

    public static EnumC1687680u1G[] values() {
        return (EnumC1687680u1G[]) LLILLJJLI.clone();
    }

    public final int getValue() {
        return this.LL;
    }

    public static EnumC1687680u1G valueOf(String str) {
        return (EnumC1687680u1G) C08FF.LIZ(EnumC1687680u1G.class, str);
    }

    public EnumC1687680u1G(String str, int i, int i2) {
        this.LL = i2;
    }
}
