package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.13vz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class EnumC20169713vz {
    public static final EnumC20169713vz FAILED;
    public static final /* synthetic */ EnumC20169713vz[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC20169713vz PENDING;
    public static final EnumC20169713vz RUNNING;
    public static final EnumC20169713vz SKIPPED;
    public static final EnumC20169713vz SUCCESS;

    public static InterfaceC2044707zh<EnumC20169713vz> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC20169713vz enumC20169713vz = new EnumC20169713vz("PENDING", 0);
        PENDING = enumC20169713vz;
        EnumC20169713vz enumC20169713vz2 = new EnumC20169713vz("RUNNING", 1);
        RUNNING = enumC20169713vz2;
        EnumC20169713vz enumC20169713vz3 = new EnumC20169713vz("SUCCESS", 2);
        SUCCESS = enumC20169713vz3;
        EnumC20169713vz enumC20169713vz4 = new EnumC20169713vz("FAILED", 3);
        FAILED = enumC20169713vz4;
        EnumC20169713vz enumC20169713vz5 = new EnumC20169713vz("SKIPPED", 4);
        SKIPPED = enumC20169713vz5;
        EnumC20169713vz[] enumC20169713vzArr = {enumC20169713vz, enumC20169713vz2, enumC20169713vz3, enumC20169713vz4, enumC20169713vz5};
        LL = enumC20169713vzArr;
        LLILLJJLI = new C2254308sP(enumC20169713vzArr);
    }

    public static EnumC20169713vz[] values() {
        return (EnumC20169713vz[]) LL.clone();
    }

    public static EnumC20169713vz valueOf(String str) {
        return (EnumC20169713vz) C08FF.LIZ(EnumC20169713vz.class, str);
    }

    public EnumC20169713vz(String str, int i) {
    }
}
