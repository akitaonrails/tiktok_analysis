package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0Xsl, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class EnumC862650Xsl {
    public static final EnumC862650Xsl BELOW_ICON;
    public static final /* synthetic */ EnumC862650Xsl[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC862650Xsl OVER_ICON;

    public static InterfaceC2044707zh<EnumC862650Xsl> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC862650Xsl enumC862650Xsl = new EnumC862650Xsl("BELOW_ICON", 0);
        BELOW_ICON = enumC862650Xsl;
        EnumC862650Xsl enumC862650Xsl2 = new EnumC862650Xsl("OVER_ICON", 1);
        OVER_ICON = enumC862650Xsl2;
        EnumC862650Xsl[] enumC862650XslArr = {enumC862650Xsl, enumC862650Xsl2};
        LL = enumC862650XslArr;
        LLILLJJLI = new C2254308sP(enumC862650XslArr);
    }

    public static EnumC862650Xsl[] values() {
        return (EnumC862650Xsl[]) LL.clone();
    }

    public static EnumC862650Xsl valueOf(String str) {
        return (EnumC862650Xsl) C08FF.LIZ(EnumC862650Xsl.class, str);
    }

    public EnumC862650Xsl(String str, int i) {
    }
}
