package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0E4n, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class EnumC358710E4n {
    public static final EnumC358710E4n APPLY_EFFECT_FAIL;
    public static final EnumC358710E4n DOWNLOAD_EFFECT_FAIL;
    public static final EnumC358710E4n DOWNLOAD_NLE_FAIL;
    public static final EnumC358710E4n FETCH_AI_ASSET_FAIL;
    public static final /* synthetic */ EnumC358710E4n[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC358710E4n OTHERS;
    public static final EnumC358710E4n SUCCESS;
    public final int LL;

    public static InterfaceC2044707zh<EnumC358710E4n> getEntries() {
        return LLILLL;
    }

    static {
        EnumC358710E4n enumC358710E4n = new EnumC358710E4n("SUCCESS", 0, 0);
        SUCCESS = enumC358710E4n;
        EnumC358710E4n enumC358710E4n2 = new EnumC358710E4n("OTHERS", 1, -1);
        OTHERS = enumC358710E4n2;
        EnumC358710E4n enumC358710E4n3 = new EnumC358710E4n("FETCH_AI_ASSET_FAIL", 2, -2);
        FETCH_AI_ASSET_FAIL = enumC358710E4n3;
        EnumC358710E4n enumC358710E4n4 = new EnumC358710E4n("DOWNLOAD_NLE_FAIL", 3, -3);
        DOWNLOAD_NLE_FAIL = enumC358710E4n4;
        EnumC358710E4n enumC358710E4n5 = new EnumC358710E4n("DOWNLOAD_EFFECT_FAIL", 4, -4);
        DOWNLOAD_EFFECT_FAIL = enumC358710E4n5;
        EnumC358710E4n enumC358710E4n6 = new EnumC358710E4n("APPLY_EFFECT_FAIL", 5, -5);
        APPLY_EFFECT_FAIL = enumC358710E4n6;
        EnumC358710E4n[] enumC358710E4nArr = {enumC358710E4n, enumC358710E4n2, enumC358710E4n3, enumC358710E4n4, enumC358710E4n5, enumC358710E4n6};
        LLILLJJLI = enumC358710E4nArr;
        LLILLL = new C2254308sP(enumC358710E4nArr);
    }

    public static EnumC358710E4n[] values() {
        return (EnumC358710E4n[]) LLILLJJLI.clone();
    }

    public final int getValue() {
        return this.LL;
    }

    public static EnumC358710E4n valueOf(String str) {
        return (EnumC358710E4n) C08FF.LIZ(EnumC358710E4n.class, str);
    }

    public EnumC358710E4n(String str, int i, int i2) {
        this.LL = i2;
    }
}
