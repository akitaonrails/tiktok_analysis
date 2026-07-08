package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.06Gk, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class EnumC1579606Gk {
    public static final EnumC1579606Gk ACTIVE;
    public static final EnumC1579606Gk EXPIRED;
    public static final EnumC1579606Gk INVALID;
    public static final /* synthetic */ EnumC1579606Gk[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC1579606Gk SECONDARY_ACTIVE;

    public static InterfaceC2044707zh<EnumC1579606Gk> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC1579606Gk enumC1579606Gk = new EnumC1579606Gk("INVALID", 0);
        INVALID = enumC1579606Gk;
        EnumC1579606Gk enumC1579606Gk2 = new EnumC1579606Gk("ACTIVE", 1);
        ACTIVE = enumC1579606Gk2;
        EnumC1579606Gk enumC1579606Gk3 = new EnumC1579606Gk("SECONDARY_ACTIVE", 2);
        SECONDARY_ACTIVE = enumC1579606Gk3;
        EnumC1579606Gk enumC1579606Gk4 = new EnumC1579606Gk("EXPIRED", 3);
        EXPIRED = enumC1579606Gk4;
        EnumC1579606Gk[] enumC1579606GkArr = {enumC1579606Gk, enumC1579606Gk2, enumC1579606Gk3, enumC1579606Gk4};
        LL = enumC1579606GkArr;
        LLILLJJLI = new C2254308sP(enumC1579606GkArr);
    }

    public static EnumC1579606Gk[] values() {
        return (EnumC1579606Gk[]) LL.clone();
    }

    public static EnumC1579606Gk valueOf(String str) {
        return (EnumC1579606Gk) C08FF.LIZ(EnumC1579606Gk.class, str);
    }

    public EnumC1579606Gk(String str, int i) {
    }
}
