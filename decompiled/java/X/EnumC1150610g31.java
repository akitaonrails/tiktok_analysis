package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0g31, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class EnumC1150610g31 {
    public static final C1150730g3D Companion;
    public static final /* synthetic */ EnumC1150610g31[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC1150610g31 TYPE_JOIN_ENIGMA;
    public static final EnumC1150610g31 TYPE_MAGIC_GIFT_CREATE;
    public static final EnumC1150610g31 TYPE_UNKNOWN;
    public final String LL;

    public static InterfaceC2044707zh<EnumC1150610g31> getEntries() {
        return LLILLL;
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [X.0g3D] */
    static {
        EnumC1150610g31 enumC1150610g31 = new EnumC1150610g31("TYPE_UNKNOWN", 0, "unknown");
        TYPE_UNKNOWN = enumC1150610g31;
        EnumC1150610g31 enumC1150610g312 = new EnumC1150610g31("TYPE_MAGIC_GIFT_CREATE", 1, "magic_gift_create");
        TYPE_MAGIC_GIFT_CREATE = enumC1150610g312;
        EnumC1150610g31 enumC1150610g313 = new EnumC1150610g31("TYPE_JOIN_ENIGMA", 2, "join_enigma");
        TYPE_JOIN_ENIGMA = enumC1150610g313;
        EnumC1150610g31[] enumC1150610g31Arr = {enumC1150610g31, enumC1150610g312, enumC1150610g313};
        LLILLJJLI = enumC1150610g31Arr;
        LLILLL = new C2254308sP(enumC1150610g31Arr);
        Companion = new Object() { // from class: X.0g3D
        };
    }

    public static EnumC1150610g31[] values() {
        return (EnumC1150610g31[]) LLILLJJLI.clone();
    }

    public final boolean isJoinEnigma() {
        return this == TYPE_JOIN_ENIGMA;
    }

    public final boolean isMagicGiftCreate() {
        return this == TYPE_MAGIC_GIFT_CREATE;
    }

    public final String getType() {
        return this.LL;
    }

    public static EnumC1150610g31 valueOf(String str) {
        return (EnumC1150610g31) C08FF.LIZ(EnumC1150610g31.class, str);
    }

    public EnumC1150610g31(String str, int i, String str2) {
        this.LL = str2;
    }
}
