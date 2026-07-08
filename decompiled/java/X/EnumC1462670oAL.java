package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0oAL, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class EnumC1462670oAL {
    public static final EnumC1462670oAL ABSENCE;
    public static final EnumC1462670oAL EXIT;
    public static final /* synthetic */ EnumC1462670oAL[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC1462670oAL NO_NEEDED;
    public final String LL;

    public static InterfaceC2044707zh<EnumC1462670oAL> getEntries() {
        return LLILLL;
    }

    static {
        EnumC1462670oAL enumC1462670oAL = new EnumC1462670oAL("EXIT", 0, "exit");
        EXIT = enumC1462670oAL;
        EnumC1462670oAL enumC1462670oAL2 = new EnumC1462670oAL("ABSENCE", 1, "miss");
        ABSENCE = enumC1462670oAL2;
        EnumC1462670oAL enumC1462670oAL3 = new EnumC1462670oAL("NO_NEEDED", 2, "no needed");
        NO_NEEDED = enumC1462670oAL3;
        EnumC1462670oAL[] enumC1462670oALArr = {enumC1462670oAL, enumC1462670oAL2, enumC1462670oAL3};
        LLILLJJLI = enumC1462670oALArr;
        LLILLL = new C2254308sP(enumC1462670oALArr);
    }

    public static EnumC1462670oAL[] values() {
        return (EnumC1462670oAL[]) LLILLJJLI.clone();
    }

    public final String getStatus() {
        return this.LL;
    }

    public static EnumC1462670oAL valueOf(String str) {
        return (EnumC1462670oAL) C08FF.LIZ(EnumC1462670oAL.class, str);
    }

    public EnumC1462670oAL(String str, int i, String str2) {
        this.LL = str2;
    }
}
