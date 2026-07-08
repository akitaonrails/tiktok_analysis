package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0bwp, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class EnumC993010bwp {
    public static final C993020bwq Companion;
    public static final /* synthetic */ EnumC993010bwp[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC993010bwp MINIS_TECH_TYPE_H5;
    public static final EnumC993010bwp MINIS_TECH_TYPE_PWA;
    public static final EnumC993010bwp MINIS_TECH_TYPE_UNKNOWN;

    public static InterfaceC2044707zh<EnumC993010bwp> getEntries() {
        return LLILLJJLI;
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [X.0bwq] */
    static {
        EnumC993010bwp enumC993010bwp = new EnumC993010bwp("MINIS_TECH_TYPE_UNKNOWN", 0);
        MINIS_TECH_TYPE_UNKNOWN = enumC993010bwp;
        EnumC993010bwp enumC993010bwp2 = new EnumC993010bwp("MINIS_TECH_TYPE_H5", 1);
        MINIS_TECH_TYPE_H5 = enumC993010bwp2;
        EnumC993010bwp enumC993010bwp3 = new EnumC993010bwp("MINIS_TECH_TYPE_PWA", 2);
        MINIS_TECH_TYPE_PWA = enumC993010bwp3;
        EnumC993010bwp[] enumC993010bwpArr = {enumC993010bwp, enumC993010bwp2, enumC993010bwp3};
        LL = enumC993010bwpArr;
        LLILLJJLI = new C2254308sP(enumC993010bwpArr);
        Companion = new Object() { // from class: X.0bwq
        };
    }

    public static EnumC993010bwp[] values() {
        return (EnumC993010bwp[]) LL.clone();
    }

    public static EnumC993010bwp valueOf(String str) {
        return (EnumC993010bwp) C08FF.LIZ(EnumC993010bwp.class, str);
    }

    public EnumC993010bwp(String str, int i) {
    }
}
