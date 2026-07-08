package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.10fP, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class EnumC19302510fP {
    public static final EnumC19302510fP CONFIRM;
    public static final EnumC19302510fP DISMISS;
    public static final /* synthetic */ EnumC19302510fP[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC19302510fP SECONDARY;
    public final String LL;

    public static InterfaceC2044707zh<EnumC19302510fP> getEntries() {
        return LLILLL;
    }

    static {
        EnumC19302510fP enumC19302510fP = new EnumC19302510fP("CONFIRM", 0, "confirm");
        CONFIRM = enumC19302510fP;
        EnumC19302510fP enumC19302510fP2 = new EnumC19302510fP("SECONDARY", 1, "secondary");
        SECONDARY = enumC19302510fP2;
        EnumC19302510fP enumC19302510fP3 = new EnumC19302510fP("DISMISS", 2, "dismiss");
        DISMISS = enumC19302510fP3;
        EnumC19302510fP[] enumC19302510fPArr = {enumC19302510fP, enumC19302510fP2, enumC19302510fP3};
        LLILLJJLI = enumC19302510fPArr;
        LLILLL = new C2254308sP(enumC19302510fPArr);
    }

    public static EnumC19302510fP[] values() {
        return (EnumC19302510fP[]) LLILLJJLI.clone();
    }

    public final String getValue() {
        return this.LL;
    }

    public static EnumC19302510fP valueOf(String str) {
        return (EnumC19302510fP) C08FF.LIZ(EnumC19302510fP.class, str);
    }

    public EnumC19302510fP(String str, int i, String str2) {
        this.LL = str2;
    }
}
