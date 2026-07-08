package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0NfL, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class EnumC599530NfL {
    public static final EnumC599530NfL ACTION;
    public static final EnumC599530NfL EVENT;
    public static final /* synthetic */ EnumC599530NfL[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public final Number LL;

    public static InterfaceC2044707zh<EnumC599530NfL> getEntries() {
        return LLILLL;
    }

    static {
        EnumC599530NfL enumC599530NfL = new EnumC599530NfL(0, 1, "ACTION");
        ACTION = enumC599530NfL;
        EnumC599530NfL enumC599530NfL2 = new EnumC599530NfL(1, 2, "EVENT");
        EVENT = enumC599530NfL2;
        EnumC599530NfL[] enumC599530NfLArr = {enumC599530NfL, enumC599530NfL2};
        LLILLJJLI = enumC599530NfLArr;
        LLILLL = new C2254308sP(enumC599530NfLArr);
    }

    public static EnumC599530NfL[] values() {
        return (EnumC599530NfL[]) LLILLJJLI.clone();
    }

    public final Number getValue() {
        return this.LL;
    }

    public static EnumC599530NfL valueOf(String str) {
        return (EnumC599530NfL) C08FF.LIZ(EnumC599530NfL.class, str);
    }

    public EnumC599530NfL(int i, Number number, String str) {
        this.LL = number;
    }
}
