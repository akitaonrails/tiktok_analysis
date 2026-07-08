package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.07qr, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class EnumC1989907qr {
    public static final EnumC1989907qr INVOKE_SEARCH;
    public static final /* synthetic */ EnumC1989907qr[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC1989907qr SET_DEFAULT_DATA;

    public static InterfaceC2044707zh<EnumC1989907qr> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC1989907qr enumC1989907qr = new EnumC1989907qr("SET_DEFAULT_DATA", 0);
        SET_DEFAULT_DATA = enumC1989907qr;
        EnumC1989907qr enumC1989907qr2 = new EnumC1989907qr("INVOKE_SEARCH", 1);
        INVOKE_SEARCH = enumC1989907qr2;
        EnumC1989907qr[] enumC1989907qrArr = {enumC1989907qr, enumC1989907qr2};
        LL = enumC1989907qrArr;
        LLILLJJLI = new C2254308sP(enumC1989907qrArr);
    }

    public static EnumC1989907qr[] values() {
        return (EnumC1989907qr[]) LL.clone();
    }

    public static EnumC1989907qr valueOf(String str) {
        return (EnumC1989907qr) C08FF.LIZ(EnumC1989907qr.class, str);
    }

    public EnumC1989907qr(String str, int i) {
    }
}
