package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0Xdn, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class EnumC853370Xdn {
    public static final /* synthetic */ EnumC853370Xdn[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC853370Xdn NON1P_BIND_TYPE;
    public static final EnumC853370Xdn NONE;
    public static final EnumC853370Xdn PASSPORT_TICKET;

    public static InterfaceC2044707zh<EnumC853370Xdn> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC853370Xdn enumC853370Xdn = new EnumC853370Xdn("PASSPORT_TICKET", 0);
        PASSPORT_TICKET = enumC853370Xdn;
        EnumC853370Xdn enumC853370Xdn2 = new EnumC853370Xdn("NON1P_BIND_TYPE", 1);
        NON1P_BIND_TYPE = enumC853370Xdn2;
        EnumC853370Xdn enumC853370Xdn3 = new EnumC853370Xdn("NONE", 2);
        NONE = enumC853370Xdn3;
        EnumC853370Xdn[] enumC853370XdnArr = {enumC853370Xdn, enumC853370Xdn2, enumC853370Xdn3};
        LL = enumC853370XdnArr;
        LLILLJJLI = new C2254308sP(enumC853370XdnArr);
    }

    public static EnumC853370Xdn[] values() {
        return (EnumC853370Xdn[]) LL.clone();
    }

    public static EnumC853370Xdn valueOf(String str) {
        return (EnumC853370Xdn) C08FF.LIZ(EnumC853370Xdn.class, str);
    }

    public EnumC853370Xdn(String str, int i) {
    }
}
