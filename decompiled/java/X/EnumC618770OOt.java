package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0OOt, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class EnumC618770OOt {
    public static final EnumC618770OOt ACTION;
    public static final EnumC618770OOt EMOJI;
    public static final /* synthetic */ EnumC618770OOt[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public final int LL;

    public static InterfaceC2044707zh<EnumC618770OOt> getEntries() {
        return LLILLL;
    }

    static {
        EnumC618770OOt enumC618770OOt = new EnumC618770OOt("EMOJI", 0, 0);
        EMOJI = enumC618770OOt;
        EnumC618770OOt enumC618770OOt2 = new EnumC618770OOt("ACTION", 1, 1);
        ACTION = enumC618770OOt2;
        EnumC618770OOt[] enumC618770OOtArr = {enumC618770OOt, enumC618770OOt2};
        LLILLJJLI = enumC618770OOtArr;
        LLILLL = new C2254308sP(enumC618770OOtArr);
    }

    public static EnumC618770OOt[] values() {
        return (EnumC618770OOt[]) LLILLJJLI.clone();
    }

    public final int getType() {
        return this.LL;
    }

    public static EnumC618770OOt valueOf(String str) {
        return (EnumC618770OOt) C08FF.LIZ(EnumC618770OOt.class, str);
    }

    public EnumC618770OOt(String str, int i, int i2) {
        this.LL = i2;
    }
}
