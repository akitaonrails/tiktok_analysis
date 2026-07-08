package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.15sO, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public final class EnumC20657015sO {
    public static final EnumC20657015sO DISMISSED;
    public static final EnumC20657015sO FAILED;
    public static final EnumC20657015sO IGNORED;
    public static final /* synthetic */ EnumC20657015sO[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC20657015sO PENDING;
    public static final EnumC20657015sO SHOWED;

    public static InterfaceC2044707zh<EnumC20657015sO> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC20657015sO enumC20657015sO = new EnumC20657015sO("PENDING", 0);
        PENDING = enumC20657015sO;
        EnumC20657015sO enumC20657015sO2 = new EnumC20657015sO("IGNORED", 1);
        IGNORED = enumC20657015sO2;
        EnumC20657015sO enumC20657015sO3 = new EnumC20657015sO("FAILED", 2);
        FAILED = enumC20657015sO3;
        EnumC20657015sO enumC20657015sO4 = new EnumC20657015sO("SHOWED", 3);
        SHOWED = enumC20657015sO4;
        EnumC20657015sO enumC20657015sO5 = new EnumC20657015sO("DISMISSED", 4);
        DISMISSED = enumC20657015sO5;
        EnumC20657015sO[] enumC20657015sOArr = {enumC20657015sO, enumC20657015sO2, enumC20657015sO3, enumC20657015sO4, enumC20657015sO5};
        LL = enumC20657015sOArr;
        LLILLJJLI = new C2254308sP(enumC20657015sOArr);
    }

    public static EnumC20657015sO[] values() {
        return (EnumC20657015sO[]) LL.clone();
    }

    public static EnumC20657015sO valueOf(String str) {
        return (EnumC20657015sO) C08FF.LIZ(EnumC20657015sO.class, str);
    }

    public EnumC20657015sO(String str, int i) {
    }
}
