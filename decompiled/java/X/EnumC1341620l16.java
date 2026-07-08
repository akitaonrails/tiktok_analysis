package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0l16, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class EnumC1341620l16 {
    public static final EnumC1341620l16 DETAIL;
    public static final /* synthetic */ EnumC1341620l16[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC1341620l16 THUMBNAIL;

    public static InterfaceC2044707zh<EnumC1341620l16> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC1341620l16 enumC1341620l16 = new EnumC1341620l16("THUMBNAIL", 0);
        THUMBNAIL = enumC1341620l16;
        EnumC1341620l16 enumC1341620l162 = new EnumC1341620l16("DETAIL", 1);
        DETAIL = enumC1341620l162;
        EnumC1341620l16[] enumC1341620l16Arr = {enumC1341620l16, enumC1341620l162};
        LL = enumC1341620l16Arr;
        LLILLJJLI = new C2254308sP(enumC1341620l16Arr);
    }

    public static EnumC1341620l16[] values() {
        return (EnumC1341620l16[]) LL.clone();
    }

    public static EnumC1341620l16 valueOf(String str) {
        return (EnumC1341620l16) C08FF.LIZ(EnumC1341620l16.class, str);
    }

    public EnumC1341620l16(String str, int i) {
    }
}
