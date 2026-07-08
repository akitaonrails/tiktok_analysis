package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.11lA, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class EnumC19593011lA {
    public static final EnumC19593011lA ATTRIBUTION_LINK_MEDIA_SIZE_LARGE;
    public static final EnumC19593011lA ATTRIBUTION_LINK_MEDIA_SIZE_NORMAL;
    public static final C19593411lE Companion;
    public static final /* synthetic */ EnumC19593011lA[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public final int LL;

    public static InterfaceC2044707zh<EnumC19593011lA> getEntries() {
        return LLILLL;
    }

    static {
        EnumC19593011lA enumC19593011lA = new EnumC19593011lA("ATTRIBUTION_LINK_MEDIA_SIZE_NORMAL", 0, 0);
        ATTRIBUTION_LINK_MEDIA_SIZE_NORMAL = enumC19593011lA;
        EnumC19593011lA enumC19593011lA2 = new EnumC19593011lA("ATTRIBUTION_LINK_MEDIA_SIZE_LARGE", 1, 1);
        ATTRIBUTION_LINK_MEDIA_SIZE_LARGE = enumC19593011lA2;
        EnumC19593011lA[] enumC19593011lAArr = {enumC19593011lA, enumC19593011lA2};
        LLILLJJLI = enumC19593011lAArr;
        LLILLL = new C2254308sP(enumC19593011lAArr);
        Companion = new C19593411lE();
    }

    public static EnumC19593011lA[] values() {
        return (EnumC19593011lA[]) LLILLJJLI.clone();
    }

    public final int getValue() {
        return this.LL;
    }

    public static EnumC19593011lA valueOf(String str) {
        return (EnumC19593011lA) C08FF.LIZ(EnumC19593011lA.class, str);
    }

    public EnumC19593011lA(String str, int i, int i2) {
        this.LL = i2;
    }
}
