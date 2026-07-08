package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0Hfw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class EnumC447020Hfw {
    public static final EnumC447020Hfw BOTH_APPLY;
    public static final EnumC447020Hfw CANCEL;
    public static final /* synthetic */ EnumC447020Hfw[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;

    public static InterfaceC2044707zh<EnumC447020Hfw> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC447020Hfw enumC447020Hfw = new EnumC447020Hfw("BOTH_APPLY", 0);
        BOTH_APPLY = enumC447020Hfw;
        EnumC447020Hfw enumC447020Hfw2 = new EnumC447020Hfw("CANCEL", 1);
        CANCEL = enumC447020Hfw2;
        EnumC447020Hfw[] enumC447020HfwArr = {enumC447020Hfw, enumC447020Hfw2};
        LL = enumC447020HfwArr;
        LLILLJJLI = new C2254308sP(enumC447020HfwArr);
    }

    public static EnumC447020Hfw[] values() {
        return (EnumC447020Hfw[]) LL.clone();
    }

    public static EnumC447020Hfw valueOf(String str) {
        return (EnumC447020Hfw) C08FF.LIZ(EnumC447020Hfw.class, str);
    }

    public EnumC447020Hfw(String str, int i) {
    }
}
