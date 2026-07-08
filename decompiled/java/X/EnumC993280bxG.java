package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0bxG, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class EnumC993280bxG {
    public static final EnumC993280bxG AUTHORIZE_CHANGE;
    public static final EnumC993280bxG BLOCK_USER;
    public static final /* synthetic */ EnumC993280bxG[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC993280bxG UPDATE_AWEMEID;
    public static final EnumC993280bxG UPDATE_PRIVACY_SETTING;
    public final int LL;

    public static InterfaceC2044707zh<EnumC993280bxG> getEntries() {
        return LLILLL;
    }

    static {
        EnumC993280bxG enumC993280bxG = new EnumC993280bxG("UPDATE_AWEMEID", 0, 1);
        UPDATE_AWEMEID = enumC993280bxG;
        EnumC993280bxG enumC993280bxG2 = new EnumC993280bxG("AUTHORIZE_CHANGE", 1, 2);
        AUTHORIZE_CHANGE = enumC993280bxG2;
        EnumC993280bxG enumC993280bxG3 = new EnumC993280bxG("BLOCK_USER", 2, 3);
        BLOCK_USER = enumC993280bxG3;
        EnumC993280bxG enumC993280bxG4 = new EnumC993280bxG("UPDATE_PRIVACY_SETTING", 3, 4);
        UPDATE_PRIVACY_SETTING = enumC993280bxG4;
        EnumC993280bxG[] enumC993280bxGArr = {enumC993280bxG, enumC993280bxG2, enumC993280bxG3, enumC993280bxG4};
        LLILLJJLI = enumC993280bxGArr;
        LLILLL = new C2254308sP(enumC993280bxGArr);
    }

    public static EnumC993280bxG[] values() {
        return (EnumC993280bxG[]) LLILLJJLI.clone();
    }

    public final int getValue() {
        return this.LL;
    }

    public static EnumC993280bxG valueOf(String str) {
        return (EnumC993280bxG) C08FF.LIZ(EnumC993280bxG.class, str);
    }

    public EnumC993280bxG(String str, int i, int i2) {
        this.LL = i2;
    }
}
