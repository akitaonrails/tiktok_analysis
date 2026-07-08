package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.00Ca, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC039400Ca {
    public static final /* synthetic */ EnumC039400Ca[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC039400Ca MOBILE;
    public static final EnumC039400Ca UNKNOWN;
    public static final EnumC039400Ca WIFI;

    public static InterfaceC2044707zh<EnumC039400Ca> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC039400Ca enumC039400Ca = new EnumC039400Ca("WIFI", 0);
        WIFI = enumC039400Ca;
        EnumC039400Ca enumC039400Ca2 = new EnumC039400Ca("MOBILE", 1);
        MOBILE = enumC039400Ca2;
        EnumC039400Ca enumC039400Ca3 = new EnumC039400Ca("UNKNOWN", 2);
        UNKNOWN = enumC039400Ca3;
        EnumC039400Ca[] enumC039400CaArr = {enumC039400Ca, enumC039400Ca2, enumC039400Ca3};
        LL = enumC039400CaArr;
        LLILLJJLI = new C2254308sP(enumC039400CaArr);
    }

    public static EnumC039400Ca[] values() {
        return (EnumC039400Ca[]) LL.clone();
    }

    public static EnumC039400Ca valueOf(String str) {
        return (EnumC039400Ca) C08FF.LIZ(EnumC039400Ca.class, str);
    }

    public EnumC039400Ca(String str, int i) {
    }
}
