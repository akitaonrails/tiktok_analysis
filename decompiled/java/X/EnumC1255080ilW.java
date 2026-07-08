package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0ilW, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class EnumC1255080ilW {
    public static final EnumC1255080ilW HOMEPAGE;
    public static final EnumC1255080ilW INBOX;
    public static final /* synthetic */ EnumC1255080ilW[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC1255080ilW PROFILE;
    public final String LL;

    public static InterfaceC2044707zh<EnumC1255080ilW> getEntries() {
        return LLILLL;
    }

    static {
        EnumC1255080ilW enumC1255080ilW = new EnumC1255080ilW("HOMEPAGE", 0, "homepage");
        HOMEPAGE = enumC1255080ilW;
        EnumC1255080ilW enumC1255080ilW2 = new EnumC1255080ilW("INBOX", 1, "notification_page");
        INBOX = enumC1255080ilW2;
        EnumC1255080ilW enumC1255080ilW3 = new EnumC1255080ilW("PROFILE", 2, "personal_homepage");
        PROFILE = enumC1255080ilW3;
        EnumC1255080ilW[] enumC1255080ilWArr = {enumC1255080ilW, enumC1255080ilW2, enumC1255080ilW3};
        LLILLJJLI = enumC1255080ilWArr;
        LLILLL = new C2254308sP(enumC1255080ilWArr);
    }

    public static EnumC1255080ilW[] values() {
        return (EnumC1255080ilW[]) LLILLJJLI.clone();
    }

    public final String getValue() {
        return this.LL;
    }

    public static EnumC1255080ilW valueOf(String str) {
        return (EnumC1255080ilW) C08FF.LIZ(EnumC1255080ilW.class, str);
    }

    public EnumC1255080ilW(String str, int i, String str2) {
        this.LL = str2;
    }
}
