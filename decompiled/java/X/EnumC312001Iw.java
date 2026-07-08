package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.01Iw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC312001Iw {
    public static final EnumC312001Iw BOTTOM_BUTTON;
    public static final /* synthetic */ EnumC312001Iw[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC312001Iw OTHER;

    public static InterfaceC2044707zh<EnumC312001Iw> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC312001Iw enumC312001Iw = new EnumC312001Iw("OTHER", 0);
        OTHER = enumC312001Iw;
        EnumC312001Iw enumC312001Iw2 = new EnumC312001Iw("BOTTOM_BUTTON", 1);
        BOTTOM_BUTTON = enumC312001Iw2;
        EnumC312001Iw[] enumC312001IwArr = {enumC312001Iw, enumC312001Iw2};
        LL = enumC312001IwArr;
        LLILLJJLI = new C2254308sP(enumC312001IwArr);
    }

    public static EnumC312001Iw[] values() {
        return (EnumC312001Iw[]) LL.clone();
    }

    public static EnumC312001Iw valueOf(String str) {
        return (EnumC312001Iw) C08FF.LIZ(EnumC312001Iw.class, str);
    }

    public EnumC312001Iw(String str, int i) {
    }
}
