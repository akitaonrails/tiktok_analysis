package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0N4b, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class EnumC587910N4b {
    public static final EnumC587910N4b CROSS_BTN;
    public static final /* synthetic */ EnumC587910N4b[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC587910N4b SWIPE_DOWN;
    public final String LL;

    public static InterfaceC2044707zh<EnumC587910N4b> getEntries() {
        return LLILLL;
    }

    static {
        EnumC587910N4b enumC587910N4b = new EnumC587910N4b("CROSS_BTN", 0, "1");
        CROSS_BTN = enumC587910N4b;
        EnumC587910N4b enumC587910N4b2 = new EnumC587910N4b("SWIPE_DOWN", 1, "2");
        SWIPE_DOWN = enumC587910N4b2;
        EnumC587910N4b[] enumC587910N4bArr = {enumC587910N4b, enumC587910N4b2};
        LLILLJJLI = enumC587910N4bArr;
        LLILLL = new C2254308sP(enumC587910N4bArr);
    }

    public static EnumC587910N4b[] values() {
        return (EnumC587910N4b[]) LLILLJJLI.clone();
    }

    public final String getValue() {
        return this.LL;
    }

    public static EnumC587910N4b valueOf(String str) {
        return (EnumC587910N4b) C08FF.LIZ(EnumC587910N4b.class, str);
    }

    public EnumC587910N4b(String str, int i, String str2) {
        this.LL = str2;
    }
}
