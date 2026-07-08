package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.00Cf, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC039900Cf {
    public static final EnumC039900Cf HIGHLIGHT_CERULEAN;
    public static final /* synthetic */ EnumC039900Cf[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC039900Cf NORMAL;

    public static InterfaceC2044707zh<EnumC039900Cf> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC039900Cf enumC039900Cf = new EnumC039900Cf("NORMAL", 0);
        NORMAL = enumC039900Cf;
        EnumC039900Cf enumC039900Cf2 = new EnumC039900Cf("HIGHLIGHT_CERULEAN", 1);
        HIGHLIGHT_CERULEAN = enumC039900Cf2;
        EnumC039900Cf[] enumC039900CfArr = {enumC039900Cf, enumC039900Cf2};
        LL = enumC039900CfArr;
        LLILLJJLI = new C2254308sP(enumC039900CfArr);
    }

    public static EnumC039900Cf[] values() {
        return (EnumC039900Cf[]) LL.clone();
    }

    public static EnumC039900Cf valueOf(String str) {
        return (EnumC039900Cf) C08FF.LIZ(EnumC039900Cf.class, str);
    }

    public EnumC039900Cf(String str, int i) {
    }
}
