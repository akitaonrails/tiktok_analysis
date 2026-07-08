package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0Nfw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class EnumC599900Nfw {
    public static final EnumC599900Nfw FEED;
    public static final /* synthetic */ EnumC599900Nfw[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC599900Nfw OTHER;
    public final String LL;

    public static InterfaceC2044707zh<EnumC599900Nfw> getEntries() {
        return LLILLL;
    }

    static {
        EnumC599900Nfw enumC599900Nfw = new EnumC599900Nfw("FEED", 0, "feed");
        FEED = enumC599900Nfw;
        EnumC599900Nfw enumC599900Nfw2 = new EnumC599900Nfw("OTHER", 1, "other");
        OTHER = enumC599900Nfw2;
        EnumC599900Nfw[] enumC599900NfwArr = {enumC599900Nfw, enumC599900Nfw2};
        LLILLJJLI = enumC599900NfwArr;
        LLILLL = new C2254308sP(enumC599900NfwArr);
    }

    public static EnumC599900Nfw[] values() {
        return (EnumC599900Nfw[]) LLILLJJLI.clone();
    }

    public final String getValue() {
        return this.LL;
    }

    public static EnumC599900Nfw valueOf(String str) {
        return (EnumC599900Nfw) C08FF.LIZ(EnumC599900Nfw.class, str);
    }

    public EnumC599900Nfw(String str, int i, String str2) {
        this.LL = str2;
    }
}
