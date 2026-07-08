package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0CIl, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class EnumC311370CIl {
    public static final EnumC311370CIl ALL_EVENT;
    public static final /* synthetic */ EnumC311370CIl[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC311370CIl OMIT_ON_DESTROY;

    public static InterfaceC2044707zh<EnumC311370CIl> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC311370CIl enumC311370CIl = new EnumC311370CIl("ALL_EVENT", 0);
        ALL_EVENT = enumC311370CIl;
        EnumC311370CIl enumC311370CIl2 = new EnumC311370CIl("OMIT_ON_DESTROY", 1);
        OMIT_ON_DESTROY = enumC311370CIl2;
        EnumC311370CIl[] enumC311370CIlArr = {enumC311370CIl, enumC311370CIl2};
        LL = enumC311370CIlArr;
        LLILLJJLI = new C2254308sP(enumC311370CIlArr);
    }

    public static EnumC311370CIl[] values() {
        return (EnumC311370CIl[]) LL.clone();
    }

    public static EnumC311370CIl valueOf(String str) {
        return (EnumC311370CIl) C08FF.LIZ(EnumC311370CIl.class, str);
    }

    public EnumC311370CIl(String str, int i) {
    }
}
