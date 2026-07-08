package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0aZH, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class EnumC939970aZH {
    public static final EnumC939970aZH GUEST_SHOWDOWN;
    public static final /* synthetic */ EnumC939970aZH[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC939970aZH NOTICEBOARD;
    public static final EnumC939970aZH UNKNOWN;

    public static InterfaceC2044707zh<EnumC939970aZH> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC939970aZH enumC939970aZH = new EnumC939970aZH("NOTICEBOARD", 0);
        NOTICEBOARD = enumC939970aZH;
        EnumC939970aZH enumC939970aZH2 = new EnumC939970aZH("GUEST_SHOWDOWN", 1);
        GUEST_SHOWDOWN = enumC939970aZH2;
        EnumC939970aZH enumC939970aZH3 = new EnumC939970aZH("UNKNOWN", 2);
        UNKNOWN = enumC939970aZH3;
        EnumC939970aZH[] enumC939970aZHArr = {enumC939970aZH, enumC939970aZH2, enumC939970aZH3};
        LL = enumC939970aZHArr;
        LLILLJJLI = new C2254308sP(enumC939970aZHArr);
    }

    public static EnumC939970aZH[] values() {
        return (EnumC939970aZH[]) LL.clone();
    }

    public static EnumC939970aZH valueOf(String str) {
        return (EnumC939970aZH) C08FF.LIZ(EnumC939970aZH.class, str);
    }

    public EnumC939970aZH(String str, int i) {
    }
}
