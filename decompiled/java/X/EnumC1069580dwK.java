package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0dwK, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class EnumC1069580dwK {
    public static final EnumC1069580dwK CONTACT_AUTH;
    public static final EnumC1069580dwK FACEBOOK_AUTH;
    public static final EnumC1069580dwK INVITE_FRIENDS;
    public static final /* synthetic */ EnumC1069580dwK[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC1069580dwK NEARBY;
    public static final EnumC1069580dwK QRCODE;
    public static final EnumC1069580dwK SCHOOL_FRIENDS;

    public static InterfaceC2044707zh<EnumC1069580dwK> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC1069580dwK enumC1069580dwK = new EnumC1069580dwK("CONTACT_AUTH", 0);
        CONTACT_AUTH = enumC1069580dwK;
        EnumC1069580dwK enumC1069580dwK2 = new EnumC1069580dwK("FACEBOOK_AUTH", 1);
        FACEBOOK_AUTH = enumC1069580dwK2;
        EnumC1069580dwK enumC1069580dwK3 = new EnumC1069580dwK("NEARBY", 2);
        NEARBY = enumC1069580dwK3;
        EnumC1069580dwK enumC1069580dwK4 = new EnumC1069580dwK("INVITE_FRIENDS", 3);
        INVITE_FRIENDS = enumC1069580dwK4;
        EnumC1069580dwK enumC1069580dwK5 = new EnumC1069580dwK("QRCODE", 4);
        QRCODE = enumC1069580dwK5;
        EnumC1069580dwK enumC1069580dwK6 = new EnumC1069580dwK("SCHOOL_FRIENDS", 5);
        SCHOOL_FRIENDS = enumC1069580dwK6;
        EnumC1069580dwK[] enumC1069580dwKArr = {enumC1069580dwK, enumC1069580dwK2, enumC1069580dwK3, enumC1069580dwK4, enumC1069580dwK5, enumC1069580dwK6};
        LL = enumC1069580dwKArr;
        LLILLJJLI = new C2254308sP(enumC1069580dwKArr);
    }

    public static EnumC1069580dwK[] values() {
        return (EnumC1069580dwK[]) LL.clone();
    }

    public static EnumC1069580dwK valueOf(String str) {
        return (EnumC1069580dwK) C08FF.LIZ(EnumC1069580dwK.class, str);
    }

    public EnumC1069580dwK(String str, int i) {
    }
}
