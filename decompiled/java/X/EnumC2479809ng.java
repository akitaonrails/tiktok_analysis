package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.09ng, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class EnumC2479809ng {
    public static final EnumC2479809ng AUTO;
    public static final EnumC2479809ng JPEG;
    public static final /* synthetic */ EnumC2479809ng[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC2479809ng PNG;

    public static InterfaceC2044707zh<EnumC2479809ng> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC2479809ng enumC2479809ng = new EnumC2479809ng("JPEG", 0);
        JPEG = enumC2479809ng;
        EnumC2479809ng enumC2479809ng2 = new EnumC2479809ng("PNG", 1);
        PNG = enumC2479809ng2;
        EnumC2479809ng enumC2479809ng3 = new EnumC2479809ng("AUTO", 2);
        AUTO = enumC2479809ng3;
        EnumC2479809ng[] enumC2479809ngArr = {enumC2479809ng, enumC2479809ng2, enumC2479809ng3};
        LL = enumC2479809ngArr;
        LLILLJJLI = new C2254308sP(enumC2479809ngArr);
    }

    public static EnumC2479809ng[] values() {
        return (EnumC2479809ng[]) LL.clone();
    }

    public static EnumC2479809ng valueOf(String str) {
        return (EnumC2479809ng) C08FF.LIZ(EnumC2479809ng.class, str);
    }

    public EnumC2479809ng(String str, int i) {
    }
}
