package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.054z, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class EnumC12951054z {
    public static final EnumC12951054z FORCE_INSERT;
    public static final /* synthetic */ EnumC12951054z[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC12951054z NOT_SET;

    public static InterfaceC2044707zh<EnumC12951054z> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC12951054z enumC12951054z = new EnumC12951054z("NOT_SET", 0);
        NOT_SET = enumC12951054z;
        EnumC12951054z enumC12951054z2 = new EnumC12951054z("FORCE_INSERT", 1);
        FORCE_INSERT = enumC12951054z2;
        EnumC12951054z[] enumC12951054zArr = {enumC12951054z, enumC12951054z2};
        LL = enumC12951054zArr;
        LLILLJJLI = new C2254308sP(enumC12951054zArr);
    }

    public static EnumC12951054z[] values() {
        return (EnumC12951054z[]) LL.clone();
    }

    public static EnumC12951054z valueOf(String str) {
        return (EnumC12951054z) C08FF.LIZ(EnumC12951054z.class, str);
    }

    public EnumC12951054z(String str, int i) {
    }
}
