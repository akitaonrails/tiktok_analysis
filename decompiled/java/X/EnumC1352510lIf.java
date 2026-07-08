package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0lIf, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class EnumC1352510lIf {
    public static final EnumC1352510lIf CANCELLED;
    public static final EnumC1352510lIf ERROR;
    public static final EnumC1352510lIf IDLE;
    public static final /* synthetic */ EnumC1352510lIf[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC1352510lIf RECORDING;
    public static final EnumC1352510lIf STOPPED;

    public static InterfaceC2044707zh<EnumC1352510lIf> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC1352510lIf enumC1352510lIf = new EnumC1352510lIf("IDLE", 0);
        IDLE = enumC1352510lIf;
        EnumC1352510lIf enumC1352510lIf2 = new EnumC1352510lIf(C1649000t0s.LLLJIL, 1);
        RECORDING = enumC1352510lIf2;
        EnumC1352510lIf enumC1352510lIf3 = new EnumC1352510lIf("STOPPED", 2);
        STOPPED = enumC1352510lIf3;
        EnumC1352510lIf enumC1352510lIf4 = new EnumC1352510lIf("CANCELLED", 3);
        CANCELLED = enumC1352510lIf4;
        EnumC1352510lIf enumC1352510lIf5 = new EnumC1352510lIf("ERROR", 4);
        ERROR = enumC1352510lIf5;
        EnumC1352510lIf[] enumC1352510lIfArr = {enumC1352510lIf, enumC1352510lIf2, enumC1352510lIf3, enumC1352510lIf4, enumC1352510lIf5};
        LL = enumC1352510lIfArr;
        LLILLJJLI = new C2254308sP(enumC1352510lIfArr);
    }

    public static EnumC1352510lIf[] values() {
        return (EnumC1352510lIf[]) LL.clone();
    }

    public static EnumC1352510lIf valueOf(String str) {
        return (EnumC1352510lIf) C08FF.LIZ(EnumC1352510lIf.class, str);
    }

    public EnumC1352510lIf(String str, int i) {
    }
}
