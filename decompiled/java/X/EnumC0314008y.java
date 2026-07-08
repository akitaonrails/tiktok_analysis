package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.008y, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC0314008y {
    public static final EnumC0314008y Giphy;
    public static final /* synthetic */ EnumC0314008y[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC0314008y TopTiktok;

    public static InterfaceC2044707zh<EnumC0314008y> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC0314008y enumC0314008y = new EnumC0314008y("Giphy", 0);
        Giphy = enumC0314008y;
        EnumC0314008y enumC0314008y2 = new EnumC0314008y("TopTiktok", 1);
        TopTiktok = enumC0314008y2;
        EnumC0314008y[] enumC0314008yArr = {enumC0314008y, enumC0314008y2};
        LL = enumC0314008yArr;
        LLILLJJLI = new C2254308sP(enumC0314008yArr);
    }

    public static EnumC0314008y[] values() {
        return (EnumC0314008y[]) LL.clone();
    }

    public static EnumC0314008y valueOf(String str) {
        return (EnumC0314008y) C08FF.LIZ(EnumC0314008y.class, str);
    }

    public EnumC0314008y(String str, int i) {
    }
}
