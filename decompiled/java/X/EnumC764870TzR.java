package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0TzR, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class EnumC764870TzR {
    public static final EnumC764870TzR CLOSE;
    public static final EnumC764870TzR FORBID_CLOSE;
    public static final /* synthetic */ EnumC764870TzR[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC764870TzR OPEN;

    public static InterfaceC2044707zh<EnumC764870TzR> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC764870TzR enumC764870TzR = new EnumC764870TzR("OPEN", 0);
        OPEN = enumC764870TzR;
        EnumC764870TzR enumC764870TzR2 = new EnumC764870TzR("CLOSE", 1);
        CLOSE = enumC764870TzR2;
        EnumC764870TzR enumC764870TzR3 = new EnumC764870TzR("FORBID_CLOSE", 2);
        FORBID_CLOSE = enumC764870TzR3;
        EnumC764870TzR[] enumC764870TzRArr = {enumC764870TzR, enumC764870TzR2, enumC764870TzR3};
        LL = enumC764870TzRArr;
        LLILLJJLI = new C2254308sP(enumC764870TzRArr);
    }

    public static EnumC764870TzR[] values() {
        return (EnumC764870TzR[]) LL.clone();
    }

    public static EnumC764870TzR valueOf(String str) {
        return (EnumC764870TzR) C08FF.LIZ(EnumC764870TzR.class, str);
    }

    public EnumC764870TzR(String str, int i) {
    }
}
