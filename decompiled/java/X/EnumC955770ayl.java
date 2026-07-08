package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0ayl, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class EnumC955770ayl {
    public static final EnumC955770ayl APPLYING;
    public static final EnumC955770ayl APPLY_DISABLED;
    public static final EnumC955770ayl APPLY_ENABLED;
    public static final EnumC955770ayl INVITE_DISABLED;
    public static final EnumC955770ayl INVITE_ENABLED;
    public static final EnumC955770ayl INVITING;
    public static final /* synthetic */ EnumC955770ayl[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC955770ayl RESERVED_ENABLED;
    public static final EnumC955770ayl RESERVE_SENT;
    public static final EnumC955770ayl UNKNOWN;
    public final int LL;

    public static InterfaceC2044707zh<EnumC955770ayl> getEntries() {
        return LLILLL;
    }

    static {
        EnumC955770ayl enumC955770ayl = new EnumC955770ayl("UNKNOWN", 0, 0);
        UNKNOWN = enumC955770ayl;
        EnumC955770ayl enumC955770ayl2 = new EnumC955770ayl("RESERVED_ENABLED", 1, 1);
        RESERVED_ENABLED = enumC955770ayl2;
        EnumC955770ayl enumC955770ayl3 = new EnumC955770ayl("RESERVE_SENT", 2, 2);
        RESERVE_SENT = enumC955770ayl3;
        EnumC955770ayl enumC955770ayl4 = new EnumC955770ayl("INVITE_ENABLED", 3, 6);
        INVITE_ENABLED = enumC955770ayl4;
        EnumC955770ayl enumC955770ayl5 = new EnumC955770ayl("INVITING", 4, 7);
        INVITING = enumC955770ayl5;
        EnumC955770ayl enumC955770ayl6 = new EnumC955770ayl("INVITE_DISABLED", 5, 8);
        INVITE_DISABLED = enumC955770ayl6;
        EnumC955770ayl enumC955770ayl7 = new EnumC955770ayl("APPLY_ENABLED", 6, 9);
        APPLY_ENABLED = enumC955770ayl7;
        EnumC955770ayl enumC955770ayl8 = new EnumC955770ayl("APPLYING", 7, 10);
        APPLYING = enumC955770ayl8;
        EnumC955770ayl enumC955770ayl9 = new EnumC955770ayl("APPLY_DISABLED", 8, 11);
        APPLY_DISABLED = enumC955770ayl9;
        EnumC955770ayl[] enumC955770aylArr = {enumC955770ayl, enumC955770ayl2, enumC955770ayl3, enumC955770ayl4, enumC955770ayl5, enumC955770ayl6, enumC955770ayl7, enumC955770ayl8, enumC955770ayl9};
        LLILLJJLI = enumC955770aylArr;
        LLILLL = new C2254308sP(enumC955770aylArr);
    }

    public static EnumC955770ayl[] values() {
        return (EnumC955770ayl[]) LLILLJJLI.clone();
    }

    public final int getValue() {
        return this.LL;
    }

    public static EnumC955770ayl valueOf(String str) {
        return (EnumC955770ayl) C08FF.LIZ(EnumC955770ayl.class, str);
    }

    public EnumC955770ayl(String str, int i, int i2) {
        this.LL = i2;
    }
}
