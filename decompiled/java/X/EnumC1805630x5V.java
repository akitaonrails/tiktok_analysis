package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0x5V, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class EnumC1805630x5V {
    public static final EnumC1805630x5V LIVE_AFTER_RECHARGE_POPUP;
    public static final EnumC1805630x5V LIVE_RECHARGE_PANEL_FOOTER;
    public static final /* synthetic */ EnumC1805630x5V[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;

    public static InterfaceC2044707zh<EnumC1805630x5V> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC1805630x5V enumC1805630x5V = new EnumC1805630x5V("LIVE_RECHARGE_PANEL_FOOTER", 0);
        LIVE_RECHARGE_PANEL_FOOTER = enumC1805630x5V;
        EnumC1805630x5V enumC1805630x5V2 = new EnumC1805630x5V("LIVE_AFTER_RECHARGE_POPUP", 1);
        LIVE_AFTER_RECHARGE_POPUP = enumC1805630x5V2;
        EnumC1805630x5V[] enumC1805630x5VArr = {enumC1805630x5V, enumC1805630x5V2};
        LL = enumC1805630x5VArr;
        LLILLJJLI = new C2254308sP(enumC1805630x5VArr);
    }

    public static EnumC1805630x5V[] values() {
        return (EnumC1805630x5V[]) LL.clone();
    }

    public static EnumC1805630x5V valueOf(String str) {
        return (EnumC1805630x5V) C08FF.LIZ(EnumC1805630x5V.class, str);
    }

    public EnumC1805630x5V(String str, int i) {
    }
}
