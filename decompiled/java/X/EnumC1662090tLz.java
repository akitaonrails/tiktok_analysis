package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0tLz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class EnumC1662090tLz {
    public static final /* synthetic */ EnumC1662090tLz[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC1662090tLz NEW_FEATURE;
    public static final EnumC1662090tLz NORMAL;
    public static final EnumC1662090tLz ROUNDED_STYLE;
    public static final EnumC1662090tLz TUX_TIP;

    public static InterfaceC2044707zh<EnumC1662090tLz> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC1662090tLz enumC1662090tLz = new EnumC1662090tLz("NEW_FEATURE", 0);
        NEW_FEATURE = enumC1662090tLz;
        EnumC1662090tLz enumC1662090tLz2 = new EnumC1662090tLz("ROUNDED_STYLE", 1);
        ROUNDED_STYLE = enumC1662090tLz2;
        EnumC1662090tLz enumC1662090tLz3 = new EnumC1662090tLz("NORMAL", 2);
        NORMAL = enumC1662090tLz3;
        EnumC1662090tLz enumC1662090tLz4 = new EnumC1662090tLz("TUX_TIP", 3);
        TUX_TIP = enumC1662090tLz4;
        EnumC1662090tLz[] enumC1662090tLzArr = {enumC1662090tLz, enumC1662090tLz2, enumC1662090tLz3, enumC1662090tLz4};
        LL = enumC1662090tLzArr;
        LLILLJJLI = new C2254308sP(enumC1662090tLzArr);
    }

    public static EnumC1662090tLz[] values() {
        return (EnumC1662090tLz[]) LL.clone();
    }

    public static EnumC1662090tLz valueOf(String str) {
        return (EnumC1662090tLz) C08FF.LIZ(EnumC1662090tLz.class, str);
    }

    public EnumC1662090tLz(String str, int i) {
    }
}
