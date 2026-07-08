package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0g9b, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class EnumC1154690g9b {
    public static final EnumC1154690g9b COMMON;
    public static final EnumC1154690g9b GECKO;
    public static final /* synthetic */ EnumC1154690g9b[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC1154690g9b TOOL;

    public static InterfaceC2044707zh<EnumC1154690g9b> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC1154690g9b enumC1154690g9b = new EnumC1154690g9b("COMMON", 0);
        COMMON = enumC1154690g9b;
        EnumC1154690g9b enumC1154690g9b2 = new EnumC1154690g9b("GECKO", 1);
        GECKO = enumC1154690g9b2;
        EnumC1154690g9b enumC1154690g9b3 = new EnumC1154690g9b("TOOL", 2);
        TOOL = enumC1154690g9b3;
        EnumC1154690g9b[] enumC1154690g9bArr = {enumC1154690g9b, enumC1154690g9b2, enumC1154690g9b3};
        LL = enumC1154690g9bArr;
        LLILLJJLI = new C2254308sP(enumC1154690g9bArr);
    }

    public static EnumC1154690g9b[] values() {
        return (EnumC1154690g9b[]) LL.clone();
    }

    public static EnumC1154690g9b valueOf(String str) {
        return (EnumC1154690g9b) C08FF.LIZ(EnumC1154690g9b.class, str);
    }

    public EnumC1154690g9b(String str, int i) {
    }
}
