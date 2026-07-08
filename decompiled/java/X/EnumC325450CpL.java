package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0CpL, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class EnumC325450CpL {
    public static final EnumC325450CpL COMMENT_COMBO_TRAY;
    public static final /* synthetic */ EnumC325450CpL[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC325450CpL PIN_COMMENT;
    public static final EnumC325450CpL WATCH_FOCUS;
    public Long LL;

    public EnumC325450CpL() {
        throw null;
    }

    public static InterfaceC2044707zh<EnumC325450CpL> getEntries() {
        return LLILLL;
    }

    static {
        EnumC325450CpL enumC325450CpL = new EnumC325450CpL("COMMENT_COMBO_TRAY", 0);
        COMMENT_COMBO_TRAY = enumC325450CpL;
        EnumC325450CpL enumC325450CpL2 = new EnumC325450CpL("WATCH_FOCUS", 1);
        WATCH_FOCUS = enumC325450CpL2;
        EnumC325450CpL enumC325450CpL3 = new EnumC325450CpL("PIN_COMMENT", 2);
        PIN_COMMENT = enumC325450CpL3;
        EnumC325450CpL[] enumC325450CpLArr = {enumC325450CpL, enumC325450CpL2, enumC325450CpL3};
        LLILLJJLI = enumC325450CpLArr;
        LLILLL = new C2254308sP(enumC325450CpLArr);
    }

    public static EnumC325450CpL[] values() {
        return (EnumC325450CpL[]) LLILLJJLI.clone();
    }

    public final Long getBitOperationValue() {
        return this.LL;
    }

    public static EnumC325450CpL valueOf(String str) {
        return (EnumC325450CpL) C08FF.LIZ(EnumC325450CpL.class, str);
    }

    public final void setBitOperationValue(Long l) {
        this.LL = l;
    }

    public EnumC325450CpL(String str, int i) {
        this.LL = null;
    }
}
