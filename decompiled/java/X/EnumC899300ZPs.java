package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0ZPs, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class EnumC899300ZPs {
    public static final /* synthetic */ EnumC899300ZPs[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC899300ZPs LOADING;
    public static final EnumC899300ZPs MEMBER;
    public static final EnumC899300ZPs PREVIEW;

    public static InterfaceC2044707zh<EnumC899300ZPs> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC899300ZPs enumC899300ZPs = new EnumC899300ZPs("LOADING", 0);
        LOADING = enumC899300ZPs;
        EnumC899300ZPs enumC899300ZPs2 = new EnumC899300ZPs("PREVIEW", 1);
        PREVIEW = enumC899300ZPs2;
        EnumC899300ZPs enumC899300ZPs3 = new EnumC899300ZPs("MEMBER", 2);
        MEMBER = enumC899300ZPs3;
        EnumC899300ZPs[] enumC899300ZPsArr = {enumC899300ZPs, enumC899300ZPs2, enumC899300ZPs3};
        LL = enumC899300ZPsArr;
        LLILLJJLI = new C2254308sP(enumC899300ZPsArr);
    }

    public static EnumC899300ZPs[] values() {
        return (EnumC899300ZPs[]) LL.clone();
    }

    public final boolean isLoadingOrPreview() {
        return this == LOADING || this == PREVIEW;
    }

    public static EnumC899300ZPs valueOf(String str) {
        return (EnumC899300ZPs) C08FF.LIZ(EnumC899300ZPs.class, str);
    }

    public EnumC899300ZPs(String str, int i) {
    }
}
