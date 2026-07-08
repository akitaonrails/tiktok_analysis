package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.03Ch, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class EnumC804503Ch {
    public static final EnumC804503Ch ADDON;
    public static final EnumC804503Ch BUY_MORE;
    public static final /* synthetic */ EnumC804503Ch[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public final int LL;

    public static InterfaceC2044707zh<EnumC804503Ch> getEntries() {
        return LLILLL;
    }

    static {
        EnumC804503Ch enumC804503Ch = new EnumC804503Ch("BUY_MORE", 0, 0);
        BUY_MORE = enumC804503Ch;
        EnumC804503Ch enumC804503Ch2 = new EnumC804503Ch("ADDON", 1, 1);
        ADDON = enumC804503Ch2;
        EnumC804503Ch[] enumC804503ChArr = {enumC804503Ch, enumC804503Ch2};
        LLILLJJLI = enumC804503ChArr;
        LLILLL = new C2254308sP(enumC804503ChArr);
    }

    public static EnumC804503Ch[] values() {
        return (EnumC804503Ch[]) LLILLJJLI.clone();
    }

    public final int getValue() {
        return this.LL;
    }

    public static EnumC804503Ch valueOf(String str) {
        return (EnumC804503Ch) C08FF.LIZ(EnumC804503Ch.class, str);
    }

    public EnumC804503Ch(String str, int i, int i2) {
        this.LL = i2;
    }
}
