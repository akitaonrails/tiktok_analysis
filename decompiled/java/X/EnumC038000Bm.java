package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.00Bm, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC038000Bm {
    public static final EnumC038000Bm DELETED;
    public static final EnumC038000Bm HIDDEN;
    public static final EnumC038000Bm IN_STORE;
    public static final /* synthetic */ EnumC038000Bm[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public final int LL;

    public static InterfaceC2044707zh<EnumC038000Bm> getEntries() {
        return LLILLL;
    }

    static {
        EnumC038000Bm enumC038000Bm = new EnumC038000Bm("HIDDEN", 0, 1);
        HIDDEN = enumC038000Bm;
        EnumC038000Bm enumC038000Bm2 = new EnumC038000Bm("DELETED", 1, 2);
        DELETED = enumC038000Bm2;
        EnumC038000Bm enumC038000Bm3 = new EnumC038000Bm("IN_STORE", 2, 3);
        IN_STORE = enumC038000Bm3;
        EnumC038000Bm[] enumC038000BmArr = {enumC038000Bm, enumC038000Bm2, enumC038000Bm3};
        LLILLJJLI = enumC038000BmArr;
        LLILLL = new C2254308sP(enumC038000BmArr);
    }

    public static EnumC038000Bm[] values() {
        return (EnumC038000Bm[]) LLILLJJLI.clone();
    }

    public final int getValue() {
        return this.LL;
    }

    public static EnumC038000Bm valueOf(String str) {
        return (EnumC038000Bm) C08FF.LIZ(EnumC038000Bm.class, str);
    }

    public EnumC038000Bm(String str, int i, int i2) {
        this.LL = i2;
    }
}
