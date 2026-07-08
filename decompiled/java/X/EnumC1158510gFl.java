package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0gFl, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class EnumC1158510gFl {
    public static final EnumC1158510gFl EMPTY_STORE;
    public static final EnumC1158510gFl EXPIRED;
    public static final EnumC1158510gFl KEY_MISMATCH;
    public static final /* synthetic */ EnumC1158510gFl[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC1158510gFl NO_STORE;

    public static InterfaceC2044707zh<EnumC1158510gFl> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC1158510gFl enumC1158510gFl = new EnumC1158510gFl("NO_STORE", 0);
        NO_STORE = enumC1158510gFl;
        EnumC1158510gFl enumC1158510gFl2 = new EnumC1158510gFl("EMPTY_STORE", 1);
        EMPTY_STORE = enumC1158510gFl2;
        EnumC1158510gFl enumC1158510gFl3 = new EnumC1158510gFl("EXPIRED", 2);
        EXPIRED = enumC1158510gFl3;
        EnumC1158510gFl enumC1158510gFl4 = new EnumC1158510gFl("KEY_MISMATCH", 3);
        KEY_MISMATCH = enumC1158510gFl4;
        EnumC1158510gFl[] enumC1158510gFlArr = {enumC1158510gFl, enumC1158510gFl2, enumC1158510gFl3, enumC1158510gFl4};
        LL = enumC1158510gFlArr;
        LLILLJJLI = new C2254308sP(enumC1158510gFlArr);
    }

    public static EnumC1158510gFl[] values() {
        return (EnumC1158510gFl[]) LL.clone();
    }

    public static EnumC1158510gFl valueOf(String str) {
        return (EnumC1158510gFl) C08FF.LIZ(EnumC1158510gFl.class, str);
    }

    public EnumC1158510gFl(String str, int i) {
    }
}
