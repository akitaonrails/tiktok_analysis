package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.04Bw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class EnumC1058204Bw {
    public static final EnumC1058204Bw FULL_DATA;
    public static final /* synthetic */ EnumC1058204Bw[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC1058204Bw LOG_SHOW;
    public static final EnumC1058204Bw PREVIEW;
    public final int LL;

    public static InterfaceC2044707zh<EnumC1058204Bw> getEntries() {
        return LLILLL;
    }

    static {
        EnumC1058204Bw enumC1058204Bw = new EnumC1058204Bw("PREVIEW", 0, 1);
        PREVIEW = enumC1058204Bw;
        EnumC1058204Bw enumC1058204Bw2 = new EnumC1058204Bw("FULL_DATA", 1, 2);
        FULL_DATA = enumC1058204Bw2;
        EnumC1058204Bw enumC1058204Bw3 = new EnumC1058204Bw("LOG_SHOW", 2, 3);
        LOG_SHOW = enumC1058204Bw3;
        EnumC1058204Bw[] enumC1058204BwArr = {enumC1058204Bw, enumC1058204Bw2, enumC1058204Bw3};
        LLILLJJLI = enumC1058204BwArr;
        LLILLL = new C2254308sP(enumC1058204BwArr);
    }

    public static EnumC1058204Bw[] values() {
        return (EnumC1058204Bw[]) LLILLJJLI.clone();
    }

    public final int getValue() {
        return this.LL;
    }

    public static EnumC1058204Bw valueOf(String str) {
        return (EnumC1058204Bw) C08FF.LIZ(EnumC1058204Bw.class, str);
    }

    public EnumC1058204Bw(String str, int i, int i2) {
        this.LL = i2;
    }
}
