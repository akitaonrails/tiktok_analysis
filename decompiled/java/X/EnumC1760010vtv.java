package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0vtv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class EnumC1760010vtv {
    public static final /* synthetic */ EnumC1760010vtv[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC1760010vtv LYNX;
    public final int LL = 1;

    public static InterfaceC2044707zh<EnumC1760010vtv> getEntries() {
        return LLILLL;
    }

    static {
        EnumC1760010vtv enumC1760010vtv = new EnumC1760010vtv();
        LYNX = enumC1760010vtv;
        EnumC1760010vtv[] enumC1760010vtvArr = {enumC1760010vtv};
        LLILLJJLI = enumC1760010vtvArr;
        LLILLL = new C2254308sP(enumC1760010vtvArr);
    }

    public static EnumC1760010vtv[] values() {
        return (EnumC1760010vtv[]) LLILLJJLI.clone();
    }

    public final int getValue() {
        return this.LL;
    }

    public static EnumC1760010vtv valueOf(String str) {
        return (EnumC1760010vtv) C08FF.LIZ(EnumC1760010vtv.class, str);
    }
}
