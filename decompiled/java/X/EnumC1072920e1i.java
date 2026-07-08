package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0e1i, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class EnumC1072920e1i {
    public static final EnumC1072920e1i CONSENT;
    public static final /* synthetic */ EnumC1072920e1i[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC1072920e1i NEW_VERSION_CONTACT;
    public static final EnumC1072920e1i NEW_VERSION_FACEBOOK;
    public static final EnumC1072920e1i NEW_VERSION_RECOMMEND;
    public static final EnumC1072920e1i NONE;
    public static final EnumC1072920e1i RECOMMEND;
    public final int LL;

    public static InterfaceC2044707zh<EnumC1072920e1i> getEntries() {
        return LLILLL;
    }

    static {
        EnumC1072920e1i enumC1072920e1i = new EnumC1072920e1i("NONE", 0, 0);
        NONE = enumC1072920e1i;
        EnumC1072920e1i enumC1072920e1i2 = new EnumC1072920e1i("CONSENT", 1, 1);
        CONSENT = enumC1072920e1i2;
        EnumC1072920e1i enumC1072920e1i3 = new EnumC1072920e1i("RECOMMEND", 2, 2);
        RECOMMEND = enumC1072920e1i3;
        EnumC1072920e1i enumC1072920e1i4 = new EnumC1072920e1i("NEW_VERSION_CONTACT", 3, 3);
        NEW_VERSION_CONTACT = enumC1072920e1i4;
        EnumC1072920e1i enumC1072920e1i5 = new EnumC1072920e1i("NEW_VERSION_FACEBOOK", 4, 4);
        NEW_VERSION_FACEBOOK = enumC1072920e1i5;
        EnumC1072920e1i enumC1072920e1i6 = new EnumC1072920e1i("NEW_VERSION_RECOMMEND", 5, 5);
        NEW_VERSION_RECOMMEND = enumC1072920e1i6;
        EnumC1072920e1i[] enumC1072920e1iArr = {enumC1072920e1i, enumC1072920e1i2, enumC1072920e1i3, enumC1072920e1i4, enumC1072920e1i5, enumC1072920e1i6};
        LLILLJJLI = enumC1072920e1iArr;
        LLILLL = new C2254308sP(enumC1072920e1iArr);
    }

    public static EnumC1072920e1i[] values() {
        return (EnumC1072920e1i[]) LLILLJJLI.clone();
    }

    public final int getValue() {
        return this.LL;
    }

    public static EnumC1072920e1i valueOf(String str) {
        return (EnumC1072920e1i) C08FF.LIZ(EnumC1072920e1i.class, str);
    }

    public EnumC1072920e1i(String str, int i, int i2) {
        this.LL = i2;
    }
}
