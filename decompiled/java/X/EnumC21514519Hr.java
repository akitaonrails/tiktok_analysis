package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.19Hr, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public final class EnumC21514519Hr {
    public static final EnumC21514519Hr AUTO;
    public static final /* synthetic */ EnumC21514519Hr[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC21514519Hr OFF;
    public static final EnumC21514519Hr TORCH;
    public final String LL;

    public static InterfaceC2044707zh<EnumC21514519Hr> getEntries() {
        return LLILLL;
    }

    static {
        EnumC21514519Hr enumC21514519Hr = new EnumC21514519Hr("OFF", 0, "off");
        OFF = enumC21514519Hr;
        EnumC21514519Hr enumC21514519Hr2 = new EnumC21514519Hr("TORCH", 1, "torch");
        TORCH = enumC21514519Hr2;
        EnumC21514519Hr enumC21514519Hr3 = new EnumC21514519Hr("AUTO", 2, "auto");
        AUTO = enumC21514519Hr3;
        EnumC21514519Hr[] enumC21514519HrArr = {enumC21514519Hr, enumC21514519Hr2, enumC21514519Hr3};
        LLILLJJLI = enumC21514519HrArr;
        LLILLL = new C2254308sP(enumC21514519HrArr);
    }

    public static EnumC21514519Hr[] values() {
        return (EnumC21514519Hr[]) LLILLJJLI.clone();
    }

    public final String getMode() {
        return this.LL;
    }

    public static EnumC21514519Hr valueOf(String str) {
        return (EnumC21514519Hr) C08FF.LIZ(EnumC21514519Hr.class, str);
    }

    public EnumC21514519Hr(String str, int i, String str2) {
        this.LL = str2;
    }
}
