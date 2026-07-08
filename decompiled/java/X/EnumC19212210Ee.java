package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.10Ee, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class EnumC19212210Ee {
    public static final /* synthetic */ EnumC19212210Ee[] LLILLL;
    public static final /* synthetic */ C2254308sP LLILZ;
    public static final EnumC19212210Ee TYPE_ACTIVITY_CENTER;
    public static final EnumC19212210Ee TYPE_DUET;
    public static final EnumC19212210Ee TYPE_PRIVACY_CHECKUP;
    public static final EnumC19212210Ee TYPE_REUSE_OF_CONTENT;
    public static final EnumC19212210Ee TYPE_STITCH;
    public final int LL;
    public final String LLILLJJLI;

    public static InterfaceC2044707zh<EnumC19212210Ee> getEntries() {
        return LLILZ;
    }

    static {
        EnumC19212210Ee enumC19212210Ee = new EnumC19212210Ee("TYPE_DUET", 0, 0, "duet_permission");
        TYPE_DUET = enumC19212210Ee;
        EnumC19212210Ee enumC19212210Ee2 = new EnumC19212210Ee("TYPE_STITCH", 1, 1, "stitch_permission");
        TYPE_STITCH = enumC19212210Ee2;
        EnumC19212210Ee enumC19212210Ee3 = new EnumC19212210Ee("TYPE_ACTIVITY_CENTER", 2, 2, "activity_center_page");
        TYPE_ACTIVITY_CENTER = enumC19212210Ee3;
        EnumC19212210Ee enumC19212210Ee4 = new EnumC19212210Ee("TYPE_REUSE_OF_CONTENT", 3, 3, "reuse_of_content_setting");
        TYPE_REUSE_OF_CONTENT = enumC19212210Ee4;
        EnumC19212210Ee enumC19212210Ee5 = new EnumC19212210Ee("TYPE_PRIVACY_CHECKUP", 4, 4, "privacy_checkup");
        TYPE_PRIVACY_CHECKUP = enumC19212210Ee5;
        EnumC19212210Ee[] enumC19212210EeArr = {enumC19212210Ee, enumC19212210Ee2, enumC19212210Ee3, enumC19212210Ee4, enumC19212210Ee5};
        LLILLL = enumC19212210EeArr;
        LLILZ = new C2254308sP(enumC19212210EeArr);
    }

    public static EnumC19212210Ee[] values() {
        return (EnumC19212210Ee[]) LLILLL.clone();
    }

    public final String getTypeName() {
        return this.LLILLJJLI;
    }

    public final int getValue() {
        return this.LL;
    }

    public static EnumC19212210Ee valueOf(String str) {
        return (EnumC19212210Ee) C08FF.LIZ(EnumC19212210Ee.class, str);
    }

    public EnumC19212210Ee(String str, int i, int i2, String str2) {
        this.LL = i2;
        this.LLILLJJLI = str2;
    }
}
