package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.07qb, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class EnumC1988307qb {
    public static final EnumC1988307qb ADDRESS_REGION_NEED_UPDATE;
    public static final /* synthetic */ EnumC1988307qb[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public final int LL = 8;

    public static InterfaceC2044707zh<EnumC1988307qb> getEntries() {
        return LLILLL;
    }

    static {
        EnumC1988307qb enumC1988307qb = new EnumC1988307qb();
        ADDRESS_REGION_NEED_UPDATE = enumC1988307qb;
        EnumC1988307qb[] enumC1988307qbArr = {enumC1988307qb};
        LLILLJJLI = enumC1988307qbArr;
        LLILLL = new C2254308sP(enumC1988307qbArr);
    }

    public static EnumC1988307qb[] values() {
        return (EnumC1988307qb[]) LLILLJJLI.clone();
    }

    public final int getValue() {
        return this.LL;
    }

    public static EnumC1988307qb valueOf(String str) {
        return (EnumC1988307qb) C08FF.LIZ(EnumC1988307qb.class, str);
    }
}
