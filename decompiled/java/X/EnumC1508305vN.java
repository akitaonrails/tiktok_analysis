package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.05vN, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class EnumC1508305vN {
    public static final /* synthetic */ EnumC1508305vN[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC1508305vN SUGGESTED_REPLY_SCENE_INTENT;
    public static final EnumC1508305vN SUGGESTED_REPLY_SCENE_REPLY;
    public static final EnumC1508305vN SUGGESTED_REPLY_SCENE_UNKNOWN;
    public final int LL;

    public static InterfaceC2044707zh<EnumC1508305vN> getEntries() {
        return LLILLL;
    }

    static {
        EnumC1508305vN enumC1508305vN = new EnumC1508305vN("SUGGESTED_REPLY_SCENE_UNKNOWN", 0, 0);
        SUGGESTED_REPLY_SCENE_UNKNOWN = enumC1508305vN;
        EnumC1508305vN enumC1508305vN2 = new EnumC1508305vN("SUGGESTED_REPLY_SCENE_INTENT", 1, 1);
        SUGGESTED_REPLY_SCENE_INTENT = enumC1508305vN2;
        EnumC1508305vN enumC1508305vN3 = new EnumC1508305vN("SUGGESTED_REPLY_SCENE_REPLY", 2, 2);
        SUGGESTED_REPLY_SCENE_REPLY = enumC1508305vN3;
        EnumC1508305vN[] enumC1508305vNArr = {enumC1508305vN, enumC1508305vN2, enumC1508305vN3};
        LLILLJJLI = enumC1508305vNArr;
        LLILLL = new C2254308sP(enumC1508305vNArr);
    }

    public static EnumC1508305vN[] values() {
        return (EnumC1508305vN[]) LLILLJJLI.clone();
    }

    public final int getValue() {
        return this.LL;
    }

    public static EnumC1508305vN valueOf(String str) {
        return (EnumC1508305vN) C08FF.LIZ(EnumC1508305vN.class, str);
    }

    public EnumC1508305vN(String str, int i, int i2) {
        this.LL = i2;
    }
}
