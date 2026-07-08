package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0Tq9, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class EnumC759110Tq9 {
    public static final C759100Tq8 Companion;
    public static final /* synthetic */ EnumC759110Tq9[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC759110Tq9 OFF;
    public static final EnumC759110Tq9 ON;
    public static final EnumC759110Tq9 UNSET;
    public final long LL;

    public static InterfaceC2044707zh<EnumC759110Tq9> getEntries() {
        return LLILLL;
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [X.0Tq8] */
    static {
        EnumC759110Tq9 enumC759110Tq9 = new EnumC759110Tq9("UNSET", 0, 0L);
        UNSET = enumC759110Tq9;
        EnumC759110Tq9 enumC759110Tq92 = new EnumC759110Tq9("ON", 1, 1L);
        ON = enumC759110Tq92;
        EnumC759110Tq9 enumC759110Tq93 = new EnumC759110Tq9("OFF", 2, 2L);
        OFF = enumC759110Tq93;
        EnumC759110Tq9[] enumC759110Tq9Arr = {enumC759110Tq9, enumC759110Tq92, enumC759110Tq93};
        LLILLJJLI = enumC759110Tq9Arr;
        LLILLL = new C2254308sP(enumC759110Tq9Arr);
        Companion = new Object() { // from class: X.0Tq8
        };
    }

    public static EnumC759110Tq9[] values() {
        return (EnumC759110Tq9[]) LLILLJJLI.clone();
    }

    public final Boolean toBooleanOrNull() {
        int i = C759120TqA.LIZ[ordinal()];
        if (i == 1) {
            return Boolean.TRUE;
        }
        if (i == 2) {
            return Boolean.FALSE;
        }
        if (i == 3) {
            return null;
        }
        throw new C1954807lC();
    }

    public final long getValue() {
        return this.LL;
    }

    public static EnumC759110Tq9 valueOf(String str) {
        return (EnumC759110Tq9) C08FF.LIZ(EnumC759110Tq9.class, str);
    }

    public EnumC759110Tq9(String str, int i, long j) {
        this.LL = j;
    }
}
