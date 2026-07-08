package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0UfP, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class EnumC777930UfP {
    public static final /* synthetic */ EnumC777930UfP[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC777930UfP PRIORITY_TYPE_P0;
    public static final EnumC777930UfP PRIORITY_TYPE_P1;
    public static final EnumC777930UfP PRIORITY_TYPE_P2;
    public static final EnumC777930UfP PRIORITY_TYPE_P3;

    public static InterfaceC2044707zh<EnumC777930UfP> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC777930UfP enumC777930UfP = new EnumC777930UfP("PRIORITY_TYPE_P0", 0);
        PRIORITY_TYPE_P0 = enumC777930UfP;
        EnumC777930UfP enumC777930UfP2 = new EnumC777930UfP("PRIORITY_TYPE_P1", 1);
        PRIORITY_TYPE_P1 = enumC777930UfP2;
        EnumC777930UfP enumC777930UfP3 = new EnumC777930UfP("PRIORITY_TYPE_P2", 2);
        PRIORITY_TYPE_P2 = enumC777930UfP3;
        EnumC777930UfP enumC777930UfP4 = new EnumC777930UfP("PRIORITY_TYPE_P3", 3);
        PRIORITY_TYPE_P3 = enumC777930UfP4;
        EnumC777930UfP[] enumC777930UfPArr = {enumC777930UfP, enumC777930UfP2, enumC777930UfP3, enumC777930UfP4};
        LL = enumC777930UfPArr;
        LLILLJJLI = new C2254308sP(enumC777930UfPArr);
    }

    public static EnumC777930UfP[] values() {
        return (EnumC777930UfP[]) LL.clone();
    }

    public static EnumC777930UfP valueOf(String str) {
        return (EnumC777930UfP) C08FF.LIZ(EnumC777930UfP.class, str);
    }

    public EnumC777930UfP(String str, int i) {
    }
}
