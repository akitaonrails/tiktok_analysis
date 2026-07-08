package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.10Ed, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class EnumC19212110Ed {
    public static final /* synthetic */ EnumC19212110Ed[] LLILLL;
    public static final /* synthetic */ C2254308sP LLILZ;
    public static final EnumC19212110Ed TYPE_ACTIVITY_CENTER;
    public static final EnumC19212110Ed TYPE_DUET;
    public static final EnumC19212110Ed TYPE_PRIVACY_CHECKUP;
    public static final EnumC19212110Ed TYPE_REUSE_OF_CONTENT;
    public static final EnumC19212110Ed TYPE_STITCH;
    public final int LL;
    public final String LLILLJJLI;

    public static InterfaceC2044707zh<EnumC19212110Ed> getEntries() {
        return LLILZ;
    }

    static {
        EnumC19212110Ed enumC19212110Ed = new EnumC19212110Ed("TYPE_DUET", 0, 0, "duet_permission");
        TYPE_DUET = enumC19212110Ed;
        EnumC19212110Ed enumC19212110Ed2 = new EnumC19212110Ed("TYPE_STITCH", 1, 1, "stitch_permission");
        TYPE_STITCH = enumC19212110Ed2;
        EnumC19212110Ed enumC19212110Ed3 = new EnumC19212110Ed("TYPE_ACTIVITY_CENTER", 2, 2, "activity_center_page");
        TYPE_ACTIVITY_CENTER = enumC19212110Ed3;
        EnumC19212110Ed enumC19212110Ed4 = new EnumC19212110Ed("TYPE_REUSE_OF_CONTENT", 3, 3, "reuse_of_content_setting");
        TYPE_REUSE_OF_CONTENT = enumC19212110Ed4;
        EnumC19212110Ed enumC19212110Ed5 = new EnumC19212110Ed("TYPE_PRIVACY_CHECKUP", 4, 4, "privacy_checkup");
        TYPE_PRIVACY_CHECKUP = enumC19212110Ed5;
        EnumC19212110Ed[] enumC19212110EdArr = {enumC19212110Ed, enumC19212110Ed2, enumC19212110Ed3, enumC19212110Ed4, enumC19212110Ed5};
        LLILLL = enumC19212110EdArr;
        LLILZ = new C2254308sP(enumC19212110EdArr);
    }

    public static EnumC19212110Ed[] values() {
        return (EnumC19212110Ed[]) LLILLL.clone();
    }

    public final String getTypeName() {
        return this.LLILLJJLI;
    }

    public final int getValue() {
        return this.LL;
    }

    public static EnumC19212110Ed valueOf(String str) {
        return (EnumC19212110Ed) C08FF.LIZ(EnumC19212110Ed.class, str);
    }

    public EnumC19212110Ed(String str, int i, int i2, String str2) {
        this.LL = i2;
        this.LLILLJJLI = str2;
    }
}
