package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0byf, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class EnumC994150byf {
    public static final EnumC994150byf ANCHOR;
    public static final EnumC994150byf GUEST;
    public static final /* synthetic */ EnumC994150byf[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;

    public static InterfaceC2044707zh<EnumC994150byf> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC994150byf enumC994150byf = new EnumC994150byf("ANCHOR", 0);
        ANCHOR = enumC994150byf;
        EnumC994150byf enumC994150byf2 = new EnumC994150byf("GUEST", 1);
        GUEST = enumC994150byf2;
        EnumC994150byf[] enumC994150byfArr = {enumC994150byf, enumC994150byf2};
        LL = enumC994150byfArr;
        LLILLJJLI = new C2254308sP(enumC994150byfArr);
    }

    public static EnumC994150byf[] values() {
        return (EnumC994150byf[]) LL.clone();
    }

    public static EnumC994150byf valueOf(String str) {
        return (EnumC994150byf) C08FF.LIZ(EnumC994150byf.class, str);
    }

    public EnumC994150byf(String str, int i) {
    }
}
