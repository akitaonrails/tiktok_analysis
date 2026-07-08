package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0bwd, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class EnumC992890bwd {
    public static final /* synthetic */ EnumC992890bwd[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC992890bwd NOT_FOUND;
    public static final EnumC992890bwd OFFLINED;
    public final Number LL;

    public static InterfaceC2044707zh<EnumC992890bwd> getEntries() {
        return LLILLL;
    }

    static {
        EnumC992890bwd enumC992890bwd = new EnumC992890bwd(0, 0, "NOT_FOUND");
        NOT_FOUND = enumC992890bwd;
        EnumC992890bwd enumC992890bwd2 = new EnumC992890bwd(1, 1, "OFFLINED");
        OFFLINED = enumC992890bwd2;
        EnumC992890bwd[] enumC992890bwdArr = {enumC992890bwd, enumC992890bwd2};
        LLILLJJLI = enumC992890bwdArr;
        LLILLL = new C2254308sP(enumC992890bwdArr);
    }

    public static EnumC992890bwd[] values() {
        return (EnumC992890bwd[]) LLILLJJLI.clone();
    }

    public final Number getValue() {
        return this.LL;
    }

    public static EnumC992890bwd valueOf(String str) {
        return (EnumC992890bwd) C08FF.LIZ(EnumC992890bwd.class, str);
    }

    public EnumC992890bwd(int i, Number number, String str) {
        this.LL = number;
    }
}
