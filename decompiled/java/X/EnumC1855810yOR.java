package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0yOR, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class EnumC1855810yOR {
    public static final EnumC1855810yOR HIGH_VOLUME;
    public static final /* synthetic */ EnumC1855810yOR[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC1855810yOR LOW_VOLUME;
    public static final EnumC1855810yOR START;
    public static final EnumC1855810yOR STOP;

    public static InterfaceC2044707zh<EnumC1855810yOR> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC1855810yOR enumC1855810yOR = new EnumC1855810yOR("START", 0);
        START = enumC1855810yOR;
        EnumC1855810yOR enumC1855810yOR2 = new EnumC1855810yOR("LOW_VOLUME", 1);
        LOW_VOLUME = enumC1855810yOR2;
        EnumC1855810yOR enumC1855810yOR3 = new EnumC1855810yOR("HIGH_VOLUME", 2);
        HIGH_VOLUME = enumC1855810yOR3;
        EnumC1855810yOR enumC1855810yOR4 = new EnumC1855810yOR("STOP", 3);
        STOP = enumC1855810yOR4;
        EnumC1855810yOR[] enumC1855810yORArr = {enumC1855810yOR, enumC1855810yOR2, enumC1855810yOR3, enumC1855810yOR4};
        LL = enumC1855810yORArr;
        LLILLJJLI = new C2254308sP(enumC1855810yORArr);
    }

    public static EnumC1855810yOR[] values() {
        return (EnumC1855810yOR[]) LL.clone();
    }

    public static EnumC1855810yOR valueOf(String str) {
        return (EnumC1855810yOR) C08FF.LIZ(EnumC1855810yOR.class, str);
    }

    public EnumC1855810yOR(String str, int i) {
    }
}
