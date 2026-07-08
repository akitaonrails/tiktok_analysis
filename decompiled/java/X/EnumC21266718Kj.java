package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.18Kj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public final class EnumC21266718Kj {
    public static final EnumC21266718Kj BUSINESS;
    public static final EnumC21266718Kj EC;
    public static final /* synthetic */ EnumC21266718Kj[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC21266718Kj LOCAL_SERVICE;
    public static final EnumC21266718Kj NONE;

    public static InterfaceC2044707zh<EnumC21266718Kj> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC21266718Kj enumC21266718Kj = new EnumC21266718Kj("NONE", 0);
        NONE = enumC21266718Kj;
        EnumC21266718Kj enumC21266718Kj2 = new EnumC21266718Kj("EC", 1);
        EC = enumC21266718Kj2;
        EnumC21266718Kj enumC21266718Kj3 = new EnumC21266718Kj("LOCAL_SERVICE", 2);
        LOCAL_SERVICE = enumC21266718Kj3;
        EnumC21266718Kj enumC21266718Kj4 = new EnumC21266718Kj("BUSINESS", 3);
        BUSINESS = enumC21266718Kj4;
        EnumC21266718Kj[] enumC21266718KjArr = {enumC21266718Kj, enumC21266718Kj2, enumC21266718Kj3, enumC21266718Kj4};
        LL = enumC21266718KjArr;
        LLILLJJLI = new C2254308sP(enumC21266718KjArr);
    }

    public static EnumC21266718Kj[] values() {
        return (EnumC21266718Kj[]) LL.clone();
    }

    public static EnumC21266718Kj valueOf(String str) {
        return (EnumC21266718Kj) C08FF.LIZ(EnumC21266718Kj.class, str);
    }

    public EnumC21266718Kj(String str, int i) {
    }
}
