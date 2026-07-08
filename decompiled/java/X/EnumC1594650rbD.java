package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0rbD, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class EnumC1594650rbD {
    public static final EnumC1594650rbD CARD_LEAVE;
    public static final EnumC1594650rbD CARD_SHOW;
    public static final EnumC1594650rbD CLIENT_ACCEPT;
    public static final EnumC1594650rbD LAST_DEDUPLICATE;
    public static final /* synthetic */ EnumC1594650rbD[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;

    public static InterfaceC2044707zh<EnumC1594650rbD> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC1594650rbD enumC1594650rbD = new EnumC1594650rbD("LAST_DEDUPLICATE", 0);
        LAST_DEDUPLICATE = enumC1594650rbD;
        EnumC1594650rbD enumC1594650rbD2 = new EnumC1594650rbD("CLIENT_ACCEPT", 1);
        CLIENT_ACCEPT = enumC1594650rbD2;
        EnumC1594650rbD enumC1594650rbD3 = new EnumC1594650rbD("CARD_SHOW", 2);
        CARD_SHOW = enumC1594650rbD3;
        EnumC1594650rbD enumC1594650rbD4 = new EnumC1594650rbD("CARD_LEAVE", 3);
        CARD_LEAVE = enumC1594650rbD4;
        EnumC1594650rbD[] enumC1594650rbDArr = {enumC1594650rbD, enumC1594650rbD2, enumC1594650rbD3, enumC1594650rbD4};
        LL = enumC1594650rbDArr;
        LLILLJJLI = new C2254308sP(enumC1594650rbDArr);
    }

    public static EnumC1594650rbD[] values() {
        return (EnumC1594650rbD[]) LL.clone();
    }

    public static EnumC1594650rbD valueOf(String str) {
        return (EnumC1594650rbD) C08FF.LIZ(EnumC1594650rbD.class, str);
    }

    public EnumC1594650rbD(String str, int i) {
    }
}
