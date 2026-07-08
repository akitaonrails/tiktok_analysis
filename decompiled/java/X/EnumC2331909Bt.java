package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.09Bt, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class EnumC2331909Bt {
    public static final EnumC2331909Bt CREATION_ID;
    public static final /* synthetic */ EnumC2331909Bt[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC2331909Bt TASK_ID;

    public static InterfaceC2044707zh<EnumC2331909Bt> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC2331909Bt enumC2331909Bt = new EnumC2331909Bt("TASK_ID", 0);
        TASK_ID = enumC2331909Bt;
        EnumC2331909Bt enumC2331909Bt2 = new EnumC2331909Bt("CREATION_ID", 1);
        CREATION_ID = enumC2331909Bt2;
        EnumC2331909Bt[] enumC2331909BtArr = {enumC2331909Bt, enumC2331909Bt2};
        LL = enumC2331909BtArr;
        LLILLJJLI = new C2254308sP(enumC2331909BtArr);
    }

    public static EnumC2331909Bt[] values() {
        return (EnumC2331909Bt[]) LL.clone();
    }

    public static EnumC2331909Bt valueOf(String str) {
        return (EnumC2331909Bt) C08FF.LIZ(EnumC2331909Bt.class, str);
    }

    public EnumC2331909Bt(String str, int i) {
    }
}
