package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0i70, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class EnumC1229960i70 {
    public static final EnumC1229960i70 CAN_JOIN;
    public static final C1229970i71 Companion;
    public static final EnumC1229960i70 FULL;
    public static final EnumC1229960i70 IN_GROUP;
    public static final /* synthetic */ EnumC1229960i70[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC1229960i70 NOT_QUALIFIED;
    public static final EnumC1229960i70 REQUEST_PENDING_APPROVAL;
    public static final EnumC1229960i70 UNKNOWN;
    public final int LL;

    public static InterfaceC2044707zh<EnumC1229960i70> getEntries() {
        return LLILLL;
    }

    static {
        EnumC1229960i70 enumC1229960i70 = new EnumC1229960i70("UNKNOWN", 0, 0);
        UNKNOWN = enumC1229960i70;
        EnumC1229960i70 enumC1229960i702 = new EnumC1229960i70("CAN_JOIN", 1, 1);
        CAN_JOIN = enumC1229960i702;
        EnumC1229960i70 enumC1229960i703 = new EnumC1229960i70("IN_GROUP", 2, 2);
        IN_GROUP = enumC1229960i703;
        EnumC1229960i70 enumC1229960i704 = new EnumC1229960i70("NOT_QUALIFIED", 3, 3);
        NOT_QUALIFIED = enumC1229960i704;
        EnumC1229960i70 enumC1229960i705 = new EnumC1229960i70("REQUEST_PENDING_APPROVAL", 4, 4);
        REQUEST_PENDING_APPROVAL = enumC1229960i705;
        EnumC1229960i70 enumC1229960i706 = new EnumC1229960i70("FULL", 5, 5);
        FULL = enumC1229960i706;
        EnumC1229960i70[] enumC1229960i70Arr = {enumC1229960i70, enumC1229960i702, enumC1229960i703, enumC1229960i704, enumC1229960i705, enumC1229960i706};
        LLILLJJLI = enumC1229960i70Arr;
        LLILLL = new C2254308sP(enumC1229960i70Arr);
        Companion = new C1229970i71();
    }

    public static EnumC1229960i70[] values() {
        return (EnumC1229960i70[]) LLILLJJLI.clone();
    }

    public final int getValue() {
        return this.LL;
    }

    public static EnumC1229960i70 valueOf(String str) {
        return (EnumC1229960i70) C08FF.LIZ(EnumC1229960i70.class, str);
    }

    public EnumC1229960i70(String str, int i, int i2) {
        this.LL = i2;
    }
}
