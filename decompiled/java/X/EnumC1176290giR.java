package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0giR, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class EnumC1176290giR {
    public static final EnumC1176290giR BACK_TO_HOTEL;
    public static final /* synthetic */ EnumC1176290giR[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC1176290giR SEARCH;

    public static InterfaceC2044707zh<EnumC1176290giR> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC1176290giR enumC1176290giR = new EnumC1176290giR("SEARCH", 0);
        SEARCH = enumC1176290giR;
        EnumC1176290giR enumC1176290giR2 = new EnumC1176290giR("BACK_TO_HOTEL", 1);
        BACK_TO_HOTEL = enumC1176290giR2;
        EnumC1176290giR[] enumC1176290giRArr = {enumC1176290giR, enumC1176290giR2};
        LL = enumC1176290giRArr;
        LLILLJJLI = new C2254308sP(enumC1176290giRArr);
    }

    public static EnumC1176290giR[] values() {
        return (EnumC1176290giR[]) LL.clone();
    }

    public static EnumC1176290giR valueOf(String str) {
        return (EnumC1176290giR) C08FF.LIZ(EnumC1176290giR.class, str);
    }

    public EnumC1176290giR(String str, int i) {
    }
}
