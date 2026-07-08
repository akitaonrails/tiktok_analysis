package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.10qm, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class EnumC19373010qm {
    public static final /* synthetic */ EnumC19373010qm[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC19373010qm PERSISTENT;
    public static final EnumC19373010qm PRIVATE;
    public static final EnumC19373010qm PUBLIC;

    public static InterfaceC2044707zh<EnumC19373010qm> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC19373010qm enumC19373010qm = new EnumC19373010qm("PUBLIC", 0);
        PUBLIC = enumC19373010qm;
        EnumC19373010qm enumC19373010qm2 = new EnumC19373010qm("PERSISTENT", 1);
        PERSISTENT = enumC19373010qm2;
        EnumC19373010qm enumC19373010qm3 = new EnumC19373010qm("PRIVATE", 2);
        PRIVATE = enumC19373010qm3;
        EnumC19373010qm[] enumC19373010qmArr = {enumC19373010qm, enumC19373010qm2, enumC19373010qm3};
        LL = enumC19373010qmArr;
        LLILLJJLI = new C2254308sP(enumC19373010qmArr);
    }

    public static EnumC19373010qm[] values() {
        return (EnumC19373010qm[]) LL.clone();
    }

    public static EnumC19373010qm valueOf(String str) {
        return (EnumC19373010qm) C08FF.LIZ(EnumC19373010qm.class, str);
    }

    public EnumC19373010qm(String str, int i) {
    }
}
