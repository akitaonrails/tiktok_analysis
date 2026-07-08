package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.14Ar, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class EnumC20222314Ar {
    public static final EnumC20222314Ar COLLECT_MODE_ALL;
    public static final EnumC20222314Ar COLLECT_MODE_EEA_GUEST;
    public static final EnumC20222314Ar COLLECT_MODE_INIT;
    public static final EnumC20222314Ar COLLECT_MODE_KIDS;
    public static final /* synthetic */ EnumC20222314Ar[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;

    public static InterfaceC2044707zh<EnumC20222314Ar> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC20222314Ar enumC20222314Ar = new EnumC20222314Ar("COLLECT_MODE_INIT", 0);
        COLLECT_MODE_INIT = enumC20222314Ar;
        EnumC20222314Ar enumC20222314Ar2 = new EnumC20222314Ar("COLLECT_MODE_KIDS", 1);
        COLLECT_MODE_KIDS = enumC20222314Ar2;
        EnumC20222314Ar enumC20222314Ar3 = new EnumC20222314Ar("COLLECT_MODE_EEA_GUEST", 2);
        COLLECT_MODE_EEA_GUEST = enumC20222314Ar3;
        EnumC20222314Ar enumC20222314Ar4 = new EnumC20222314Ar("COLLECT_MODE_ALL", 3);
        COLLECT_MODE_ALL = enumC20222314Ar4;
        EnumC20222314Ar[] enumC20222314ArArr = {enumC20222314Ar, enumC20222314Ar2, enumC20222314Ar3, enumC20222314Ar4};
        LL = enumC20222314ArArr;
        LLILLJJLI = new C2254308sP(enumC20222314ArArr);
    }

    public static EnumC20222314Ar[] values() {
        return (EnumC20222314Ar[]) LL.clone();
    }

    public static EnumC20222314Ar valueOf(String str) {
        return (EnumC20222314Ar) C08FF.LIZ(EnumC20222314Ar.class, str);
    }

    public EnumC20222314Ar(String str, int i) {
    }
}
