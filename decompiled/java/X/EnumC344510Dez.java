package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0Dez, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class EnumC344510Dez {
    public static final EnumC344510Dez ENTER_FYP;
    public static final EnumC344510Dez FEED_CARD_GUIDE;
    public static final /* synthetic */ EnumC344510Dez[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC344510Dez NO_NET_TOAST;

    public static InterfaceC2044707zh<EnumC344510Dez> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC344510Dez enumC344510Dez = new EnumC344510Dez("NO_NET_TOAST", 0);
        NO_NET_TOAST = enumC344510Dez;
        EnumC344510Dez enumC344510Dez2 = new EnumC344510Dez("ENTER_FYP", 1);
        ENTER_FYP = enumC344510Dez2;
        EnumC344510Dez enumC344510Dez3 = new EnumC344510Dez("FEED_CARD_GUIDE", 2);
        FEED_CARD_GUIDE = enumC344510Dez3;
        EnumC344510Dez[] enumC344510DezArr = {enumC344510Dez, enumC344510Dez2, enumC344510Dez3};
        LL = enumC344510DezArr;
        LLILLJJLI = new C2254308sP(enumC344510DezArr);
    }

    public static EnumC344510Dez[] values() {
        return (EnumC344510Dez[]) LL.clone();
    }

    public static EnumC344510Dez valueOf(String str) {
        return (EnumC344510Dez) C08FF.LIZ(EnumC344510Dez.class, str);
    }

    public EnumC344510Dez(String str, int i) {
    }
}
