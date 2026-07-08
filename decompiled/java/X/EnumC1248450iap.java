package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0iap, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class EnumC1248450iap {
    public static final EnumC1248450iap FOLD;
    public static final /* synthetic */ EnumC1248450iap[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC1248450iap NORMAL;
    public static final EnumC1248450iap SHOW_MORE;
    public static final EnumC1248450iap UNFOLD;

    public static InterfaceC2044707zh<EnumC1248450iap> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC1248450iap enumC1248450iap = new EnumC1248450iap("NORMAL", 0);
        NORMAL = enumC1248450iap;
        EnumC1248450iap enumC1248450iap2 = new EnumC1248450iap("UNFOLD", 1);
        UNFOLD = enumC1248450iap2;
        EnumC1248450iap enumC1248450iap3 = new EnumC1248450iap("SHOW_MORE", 2);
        SHOW_MORE = enumC1248450iap3;
        EnumC1248450iap enumC1248450iap4 = new EnumC1248450iap("FOLD", 3);
        FOLD = enumC1248450iap4;
        EnumC1248450iap[] enumC1248450iapArr = {enumC1248450iap, enumC1248450iap2, enumC1248450iap3, enumC1248450iap4};
        LL = enumC1248450iapArr;
        LLILLJJLI = new C2254308sP(enumC1248450iapArr);
    }

    public static EnumC1248450iap[] values() {
        return (EnumC1248450iap[]) LL.clone();
    }

    public static EnumC1248450iap valueOf(String str) {
        return (EnumC1248450iap) C08FF.LIZ(EnumC1248450iap.class, str);
    }

    public EnumC1248450iap(String str, int i) {
    }
}
