package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0aup, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class EnumC953330aup {
    public static final EnumC953330aup COLOR;
    public static final /* synthetic */ EnumC953330aup[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC953330aup PHOTO;
    public final String LL;

    public static InterfaceC2044707zh<EnumC953330aup> getEntries() {
        return LLILLL;
    }

    static {
        EnumC953330aup enumC953330aup = new EnumC953330aup("COLOR", 0, "color");
        COLOR = enumC953330aup;
        EnumC953330aup enumC953330aup2 = new EnumC953330aup("PHOTO", 1, "photo");
        PHOTO = enumC953330aup2;
        EnumC953330aup[] enumC953330aupArr = {enumC953330aup, enumC953330aup2};
        LLILLJJLI = enumC953330aupArr;
        LLILLL = new C2254308sP(enumC953330aupArr);
    }

    public static EnumC953330aup[] values() {
        return (EnumC953330aup[]) LLILLJJLI.clone();
    }

    public final String getValue() {
        return this.LL;
    }

    public static EnumC953330aup valueOf(String str) {
        return (EnumC953330aup) C08FF.LIZ(EnumC953330aup.class, str);
    }

    public EnumC953330aup(String str, int i, String str2) {
        this.LL = str2;
    }
}
