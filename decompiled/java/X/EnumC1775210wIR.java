package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0wIR, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class EnumC1775210wIR {
    public static final EnumC1775210wIR EMIT_PLAY;
    public static final EnumC1775210wIR EXPOSURE;
    public static final /* synthetic */ EnumC1775210wIR[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC1775210wIR LOAD_DATA;
    public final String LL;

    public static InterfaceC2044707zh<EnumC1775210wIR> getEntries() {
        return LLILLL;
    }

    static {
        EnumC1775210wIR enumC1775210wIR = new EnumC1775210wIR("LOAD_DATA", 0, "load_data");
        LOAD_DATA = enumC1775210wIR;
        EnumC1775210wIR enumC1775210wIR2 = new EnumC1775210wIR("EXPOSURE", 1, "exposure");
        EXPOSURE = enumC1775210wIR2;
        EnumC1775210wIR enumC1775210wIR3 = new EnumC1775210wIR("EMIT_PLAY", 2, "emit_play");
        EMIT_PLAY = enumC1775210wIR3;
        EnumC1775210wIR[] enumC1775210wIRArr = {enumC1775210wIR, enumC1775210wIR2, enumC1775210wIR3};
        LLILLJJLI = enumC1775210wIRArr;
        LLILLL = new C2254308sP(enumC1775210wIRArr);
    }

    public static EnumC1775210wIR[] values() {
        return (EnumC1775210wIR[]) LLILLJJLI.clone();
    }

    public final String getValue() {
        return this.LL;
    }

    public static EnumC1775210wIR valueOf(String str) {
        return (EnumC1775210wIR) C08FF.LIZ(EnumC1775210wIR.class, str);
    }

    public EnumC1775210wIR(String str, int i, String str2) {
        this.LL = str2;
    }
}
