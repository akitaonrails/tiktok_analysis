package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0wQT, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class EnumC1780190wQT {
    public static final EnumC1780190wQT AD_MULTI_BUBBLE;
    public static final EnumC1780190wQT AD_SINGLE_BUBBLE;
    public static final /* synthetic */ EnumC1780190wQT[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC1780190wQT UNKNOWN;
    public final String LL;

    public static InterfaceC2044707zh<EnumC1780190wQT> getEntries() {
        return LLILLL;
    }

    static {
        EnumC1780190wQT enumC1780190wQT = new EnumC1780190wQT("UNKNOWN", 0, "unknown");
        UNKNOWN = enumC1780190wQT;
        EnumC1780190wQT enumC1780190wQT2 = new EnumC1780190wQT("AD_SINGLE_BUBBLE", 1, "ad_single_bubble");
        AD_SINGLE_BUBBLE = enumC1780190wQT2;
        EnumC1780190wQT enumC1780190wQT3 = new EnumC1780190wQT("AD_MULTI_BUBBLE", 2, "ad_multi_bubble");
        AD_MULTI_BUBBLE = enumC1780190wQT3;
        EnumC1780190wQT[] enumC1780190wQTArr = {enumC1780190wQT, enumC1780190wQT2, enumC1780190wQT3};
        LLILLJJLI = enumC1780190wQTArr;
        LLILLL = new C2254308sP(enumC1780190wQTArr);
    }

    public static EnumC1780190wQT[] values() {
        return (EnumC1780190wQT[]) LLILLJJLI.clone();
    }

    public final String getValue() {
        return this.LL;
    }

    public static EnumC1780190wQT valueOf(String str) {
        return (EnumC1780190wQT) C08FF.LIZ(EnumC1780190wQT.class, str);
    }

    public EnumC1780190wQT(String str, int i, String str2) {
        this.LL = str2;
    }
}
