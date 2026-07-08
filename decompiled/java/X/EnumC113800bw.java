package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.00bw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC113800bw {
    public static final EnumC113800bw COMBO_NORMAL_SEND;
    public static final /* synthetic */ EnumC113800bw[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC113800bw NORMAL_SEND;
    public final int LL;

    public static InterfaceC2044707zh<EnumC113800bw> getEntries() {
        return LLILLL;
    }

    static {
        EnumC113800bw enumC113800bw = new EnumC113800bw("NORMAL_SEND", 0, 1);
        NORMAL_SEND = enumC113800bw;
        EnumC113800bw enumC113800bw2 = new EnumC113800bw("COMBO_NORMAL_SEND", 1, 4);
        COMBO_NORMAL_SEND = enumC113800bw2;
        EnumC113800bw[] enumC113800bwArr = {enumC113800bw, enumC113800bw2};
        LLILLJJLI = enumC113800bwArr;
        LLILLL = new C2254308sP(enumC113800bwArr);
    }

    public static EnumC113800bw[] values() {
        return (EnumC113800bw[]) LLILLJJLI.clone();
    }

    public final int getValue() {
        return this.LL;
    }

    public static EnumC113800bw valueOf(String str) {
        return (EnumC113800bw) C08FF.LIZ(EnumC113800bw.class, str);
    }

    public EnumC113800bw(String str, int i, int i2) {
        this.LL = i2;
    }
}
