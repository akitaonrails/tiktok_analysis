package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0nmk, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class EnumC1448040nmk {
    public static final EnumC1448040nmk LL;
    public static final EnumC1448040nmk LLILLJJLI;
    public static final EnumC1448040nmk LLILLL;
    public static final /* synthetic */ EnumC1448040nmk[] LLILZ;

    static {
        EnumC1448040nmk enumC1448040nmk = new EnumC1448040nmk("INITIALIZED", 0);
        LL = enumC1448040nmk;
        EnumC1448040nmk enumC1448040nmk2 = new EnumC1448040nmk("FOREGROUND", 1);
        LLILLJJLI = enumC1448040nmk2;
        EnumC1448040nmk enumC1448040nmk3 = new EnumC1448040nmk("BACKGROUND", 2);
        LLILLL = enumC1448040nmk3;
        EnumC1448040nmk[] enumC1448040nmkArr = {enumC1448040nmk, enumC1448040nmk2, enumC1448040nmk3};
        LLILZ = enumC1448040nmkArr;
        new C2254308sP(enumC1448040nmkArr);
    }

    public static EnumC1448040nmk[] values() {
        return (EnumC1448040nmk[]) LLILZ.clone();
    }

    public static EnumC1448040nmk valueOf(String str) {
        return (EnumC1448040nmk) C08FF.LIZ(EnumC1448040nmk.class, str);
    }

    public EnumC1448040nmk(String str, int i) {
    }
}
