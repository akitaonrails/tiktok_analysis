package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0LpL, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class EnumC554770LpL {
    public static final EnumC554770LpL ERROR;
    public static final EnumC554770LpL FINISHED;
    public static final /* synthetic */ EnumC554770LpL[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC554770LpL PENDING;
    public static final EnumC554770LpL UNSTARTED;

    public static InterfaceC2044707zh<EnumC554770LpL> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC554770LpL enumC554770LpL = new EnumC554770LpL("UNSTARTED", 0);
        UNSTARTED = enumC554770LpL;
        EnumC554770LpL enumC554770LpL2 = new EnumC554770LpL("PENDING", 1);
        PENDING = enumC554770LpL2;
        EnumC554770LpL enumC554770LpL3 = new EnumC554770LpL("FINISHED", 2);
        FINISHED = enumC554770LpL3;
        EnumC554770LpL enumC554770LpL4 = new EnumC554770LpL("ERROR", 3);
        ERROR = enumC554770LpL4;
        EnumC554770LpL[] enumC554770LpLArr = {enumC554770LpL, enumC554770LpL2, enumC554770LpL3, enumC554770LpL4};
        LL = enumC554770LpLArr;
        LLILLJJLI = new C2254308sP(enumC554770LpLArr);
    }

    public static EnumC554770LpL[] values() {
        return (EnumC554770LpL[]) LL.clone();
    }

    public static EnumC554770LpL valueOf(String str) {
        return (EnumC554770LpL) C08FF.LIZ(EnumC554770LpL.class, str);
    }

    public EnumC554770LpL(String str, int i) {
    }
}
