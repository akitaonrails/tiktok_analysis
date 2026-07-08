package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0Gsn, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class EnumC429510Gsn {
    public static final EnumC429510Gsn FANS_CLUB;
    public static final /* synthetic */ EnumC429510Gsn[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC429510Gsn SUPER_FAN;
    public static final EnumC429510Gsn UNKNOWN;

    public static InterfaceC2044707zh<EnumC429510Gsn> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC429510Gsn enumC429510Gsn = new EnumC429510Gsn("FANS_CLUB", 0);
        FANS_CLUB = enumC429510Gsn;
        EnumC429510Gsn enumC429510Gsn2 = new EnumC429510Gsn("SUPER_FAN", 1);
        SUPER_FAN = enumC429510Gsn2;
        EnumC429510Gsn enumC429510Gsn3 = new EnumC429510Gsn("UNKNOWN", 2);
        UNKNOWN = enumC429510Gsn3;
        EnumC429510Gsn[] enumC429510GsnArr = {enumC429510Gsn, enumC429510Gsn2, enumC429510Gsn3};
        LL = enumC429510GsnArr;
        LLILLJJLI = new C2254308sP(enumC429510GsnArr);
    }

    public static EnumC429510Gsn[] values() {
        return (EnumC429510Gsn[]) LL.clone();
    }

    public static EnumC429510Gsn valueOf(String str) {
        return (EnumC429510Gsn) C08FF.LIZ(EnumC429510Gsn.class, str);
    }

    public EnumC429510Gsn(String str, int i) {
    }
}
