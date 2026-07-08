package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.05Af, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class EnumC1308705Af {
    public static final /* synthetic */ EnumC1308705Af[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC1308705Af NOT_RECORDING;
    public static final EnumC1308705Af PROCESSING;
    public static final EnumC1308705Af RECORDING;

    public static InterfaceC2044707zh<EnumC1308705Af> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC1308705Af enumC1308705Af = new EnumC1308705Af("NOT_RECORDING", 0);
        NOT_RECORDING = enumC1308705Af;
        EnumC1308705Af enumC1308705Af2 = new EnumC1308705Af(C1649000t0s.LLLJIL, 1);
        RECORDING = enumC1308705Af2;
        EnumC1308705Af enumC1308705Af3 = new EnumC1308705Af("PROCESSING", 2);
        PROCESSING = enumC1308705Af3;
        EnumC1308705Af[] enumC1308705AfArr = {enumC1308705Af, enumC1308705Af2, enumC1308705Af3};
        LL = enumC1308705AfArr;
        LLILLJJLI = new C2254308sP(enumC1308705AfArr);
    }

    public static EnumC1308705Af[] values() {
        return (EnumC1308705Af[]) LL.clone();
    }

    public static EnumC1308705Af valueOf(String str) {
        return (EnumC1308705Af) C08FF.LIZ(EnumC1308705Af.class, str);
    }

    public EnumC1308705Af(String str, int i) {
    }
}
