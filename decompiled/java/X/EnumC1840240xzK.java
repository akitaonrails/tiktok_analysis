package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0xzK, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class EnumC1840240xzK implements InterfaceC1487280oo2<InterfaceC19473011Gm, C11LE> {
    public static final EnumC1840240xzK LL;
    public static final /* synthetic */ EnumC1840240xzK[] LLILLJJLI;

    static {
        EnumC1840240xzK enumC1840240xzK = new EnumC1840240xzK();
        LL = enumC1840240xzK;
        LLILLJJLI = new EnumC1840240xzK[]{enumC1840240xzK};
    }

    public static EnumC1840240xzK[] values() {
        return (EnumC1840240xzK[]) LLILLJJLI.clone();
    }

    public static EnumC1840240xzK valueOf(String str) {
        return (EnumC1840240xzK) C08FF.LIZ(EnumC1840240xzK.class, str);
    }

    @Override // X.InterfaceC1487280oo2
    public final C11LE apply(InterfaceC19473011Gm interfaceC19473011Gm) {
        return new C11LC(interfaceC19473011Gm);
    }
}
