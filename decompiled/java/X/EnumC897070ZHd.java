package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0ZHd, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class EnumC897070ZHd {
    public static final EnumC897070ZHd CUSTOMIZE_LABEL;
    public static final /* synthetic */ EnumC897070ZHd[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC897070ZHd READ_STATUS;
    public static final EnumC897070ZHd WHEE_DM_BADGE;
    public static final EnumC897070ZHd WHEE_EXCLUSIVE_BUBBLE;

    public static InterfaceC2044707zh<EnumC897070ZHd> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC897070ZHd enumC897070ZHd = new EnumC897070ZHd("WHEE_EXCLUSIVE_BUBBLE", 0);
        WHEE_EXCLUSIVE_BUBBLE = enumC897070ZHd;
        EnumC897070ZHd enumC897070ZHd2 = new EnumC897070ZHd("WHEE_DM_BADGE", 1);
        WHEE_DM_BADGE = enumC897070ZHd2;
        EnumC897070ZHd enumC897070ZHd3 = new EnumC897070ZHd("CUSTOMIZE_LABEL", 2);
        CUSTOMIZE_LABEL = enumC897070ZHd3;
        EnumC897070ZHd enumC897070ZHd4 = new EnumC897070ZHd("READ_STATUS", 3);
        READ_STATUS = enumC897070ZHd4;
        EnumC897070ZHd[] enumC897070ZHdArr = {enumC897070ZHd, enumC897070ZHd2, enumC897070ZHd3, enumC897070ZHd4};
        LL = enumC897070ZHdArr;
        LLILLJJLI = new C2254308sP(enumC897070ZHdArr);
    }

    public static EnumC897070ZHd[] values() {
        return (EnumC897070ZHd[]) LL.clone();
    }

    public static EnumC897070ZHd valueOf(String str) {
        return (EnumC897070ZHd) C08FF.LIZ(EnumC897070ZHd.class, str);
    }

    public EnumC897070ZHd(String str, int i) {
    }
}
