package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.00Ai, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC035000Ai {
    public static final EnumC035000Ai ASSET_TYPE_EFFECT;
    public static final EnumC035000Ai ASSET_TYPE_UNSPECIFIED;
    public static final /* synthetic */ EnumC035000Ai[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public final int LL;

    public static InterfaceC2044707zh<EnumC035000Ai> getEntries() {
        return LLILLL;
    }

    static {
        EnumC035000Ai enumC035000Ai = new EnumC035000Ai("ASSET_TYPE_UNSPECIFIED", 0, 0);
        ASSET_TYPE_UNSPECIFIED = enumC035000Ai;
        EnumC035000Ai enumC035000Ai2 = new EnumC035000Ai("ASSET_TYPE_EFFECT", 1, 3);
        ASSET_TYPE_EFFECT = enumC035000Ai2;
        EnumC035000Ai[] enumC035000AiArr = {enumC035000Ai, enumC035000Ai2};
        LLILLJJLI = enumC035000AiArr;
        LLILLL = new C2254308sP(enumC035000AiArr);
    }

    public static EnumC035000Ai[] values() {
        return (EnumC035000Ai[]) LLILLJJLI.clone();
    }

    public final int getCustomOrdinal() {
        return this.LL;
    }

    public static EnumC035000Ai valueOf(String str) {
        return (EnumC035000Ai) C08FF.LIZ(EnumC035000Ai.class, str);
    }

    public EnumC035000Ai(String str, int i, int i2) {
        this.LL = i2;
    }
}
