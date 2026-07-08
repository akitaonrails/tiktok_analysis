package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0vhZ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class EnumC1752350vhZ {
    public static final C1752360vha Companion;
    public static final EnumC1752350vhZ DEFAULT_MODE;
    public static final EnumC1752350vhZ ENRICH_MODE;
    public static final EnumC1752350vhZ EXCHANGE_MODE;
    public static final /* synthetic */ EnumC1752350vhZ[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public final int LL;

    public static InterfaceC2044707zh<EnumC1752350vhZ> getEntries() {
        return LLILLL;
    }

    static {
        EnumC1752350vhZ enumC1752350vhZ = new EnumC1752350vhZ("DEFAULT_MODE", 0, 0);
        DEFAULT_MODE = enumC1752350vhZ;
        EnumC1752350vhZ enumC1752350vhZ2 = new EnumC1752350vhZ("ENRICH_MODE", 1, 1);
        ENRICH_MODE = enumC1752350vhZ2;
        EnumC1752350vhZ enumC1752350vhZ3 = new EnumC1752350vhZ("EXCHANGE_MODE", 2, 2);
        EXCHANGE_MODE = enumC1752350vhZ3;
        EnumC1752350vhZ[] enumC1752350vhZArr = {enumC1752350vhZ, enumC1752350vhZ2, enumC1752350vhZ3};
        LLILLJJLI = enumC1752350vhZArr;
        LLILLL = new C2254308sP(enumC1752350vhZArr);
        Companion = new C1752360vha();
    }

    public static EnumC1752350vhZ[] values() {
        return (EnumC1752350vhZ[]) LLILLJJLI.clone();
    }

    public final int getType() {
        return this.LL;
    }

    public static EnumC1752350vhZ valueOf(String str) {
        return (EnumC1752350vhZ) C08FF.LIZ(EnumC1752350vhZ.class, str);
    }

    public EnumC1752350vhZ(String str, int i, int i2) {
        this.LL = i2;
    }
}
