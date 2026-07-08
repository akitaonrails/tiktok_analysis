package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0TnM, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class EnumC757380TnM {
    public static final EnumC757380TnM LIVE_LINK_CARD;
    public static final EnumC757380TnM LIVE_LINK_PIN;
    public static final /* synthetic */ EnumC757380TnM[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public final String LL;

    public static InterfaceC2044707zh<EnumC757380TnM> getEntries() {
        return LLILLL;
    }

    static {
        EnumC757380TnM enumC757380TnM = new EnumC757380TnM("LIVE_LINK_PIN", 0, "live-link-pin");
        LIVE_LINK_PIN = enumC757380TnM;
        EnumC757380TnM enumC757380TnM2 = new EnumC757380TnM("LIVE_LINK_CARD", 1, "live-link-card");
        LIVE_LINK_CARD = enumC757380TnM2;
        EnumC757380TnM[] enumC757380TnMArr = {enumC757380TnM, enumC757380TnM2};
        LLILLJJLI = enumC757380TnMArr;
        LLILLL = new C2254308sP(enumC757380TnMArr);
    }

    public static EnumC757380TnM[] values() {
        return (EnumC757380TnM[]) LLILLJJLI.clone();
    }

    public final String getValue() {
        return this.LL;
    }

    public static EnumC757380TnM valueOf(String str) {
        return (EnumC757380TnM) C08FF.LIZ(EnumC757380TnM.class, str);
    }

    public EnumC757380TnM(String str, int i, String str2) {
        this.LL = str2;
    }
}
