package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0lbH, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class EnumC1364050lbH {
    public static final EnumC1364050lbH DIRECT_MESSAGE_ENTRANCE;
    public static final /* synthetic */ EnumC1364050lbH[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC1364050lbH MASK_WITH_CHECK_MARK;

    public static InterfaceC2044707zh<EnumC1364050lbH> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC1364050lbH enumC1364050lbH = new EnumC1364050lbH("MASK_WITH_CHECK_MARK", 0);
        MASK_WITH_CHECK_MARK = enumC1364050lbH;
        EnumC1364050lbH enumC1364050lbH2 = new EnumC1364050lbH("DIRECT_MESSAGE_ENTRANCE", 1);
        DIRECT_MESSAGE_ENTRANCE = enumC1364050lbH2;
        EnumC1364050lbH[] enumC1364050lbHArr = {enumC1364050lbH, enumC1364050lbH2};
        LL = enumC1364050lbHArr;
        LLILLJJLI = new C2254308sP(enumC1364050lbHArr);
    }

    public static EnumC1364050lbH[] values() {
        return (EnumC1364050lbH[]) LL.clone();
    }

    public static EnumC1364050lbH valueOf(String str) {
        return (EnumC1364050lbH) C08FF.LIZ(EnumC1364050lbH.class, str);
    }

    public EnumC1364050lbH(String str, int i) {
    }
}
