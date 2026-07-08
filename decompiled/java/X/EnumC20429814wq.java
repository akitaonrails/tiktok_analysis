package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.14wq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public final class EnumC20429814wq {
    public static final EnumC20429814wq KEVA;
    public static final /* synthetic */ EnumC20429814wq[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC20429814wq SP;

    public static InterfaceC2044707zh<EnumC20429814wq> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC20429814wq enumC20429814wq = new EnumC20429814wq("SP", 0);
        SP = enumC20429814wq;
        EnumC20429814wq enumC20429814wq2 = new EnumC20429814wq("KEVA", 1);
        KEVA = enumC20429814wq2;
        EnumC20429814wq[] enumC20429814wqArr = {enumC20429814wq, enumC20429814wq2};
        LL = enumC20429814wqArr;
        LLILLJJLI = new C2254308sP(enumC20429814wqArr);
    }

    public static EnumC20429814wq[] values() {
        return (EnumC20429814wq[]) LL.clone();
    }

    public static EnumC20429814wq valueOf(String str) {
        return (EnumC20429814wq) C08FF.LIZ(EnumC20429814wq.class, str);
    }

    public EnumC20429814wq(String str, int i) {
    }
}
