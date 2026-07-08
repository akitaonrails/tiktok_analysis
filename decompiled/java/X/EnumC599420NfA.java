package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0NfA, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class EnumC599420NfA {
    public static final EnumC599420NfA GET_TRACK_PARAMS;
    public static final /* synthetic */ EnumC599420NfA[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC599420NfA PUT_TRACK_PARAMS;
    public final int LL;

    public static InterfaceC2044707zh<EnumC599420NfA> getEntries() {
        return LLILLL;
    }

    static {
        EnumC599420NfA enumC599420NfA = new EnumC599420NfA("PUT_TRACK_PARAMS", 0, 1);
        PUT_TRACK_PARAMS = enumC599420NfA;
        EnumC599420NfA enumC599420NfA2 = new EnumC599420NfA("GET_TRACK_PARAMS", 1, 2);
        GET_TRACK_PARAMS = enumC599420NfA2;
        EnumC599420NfA[] enumC599420NfAArr = {enumC599420NfA, enumC599420NfA2};
        LLILLJJLI = enumC599420NfAArr;
        LLILLL = new C2254308sP(enumC599420NfAArr);
    }

    public static EnumC599420NfA[] values() {
        return (EnumC599420NfA[]) LLILLJJLI.clone();
    }

    public final int getValue() {
        return this.LL;
    }

    public static EnumC599420NfA valueOf(String str) {
        return (EnumC599420NfA) C08FF.LIZ(EnumC599420NfA.class, str);
    }

    public EnumC599420NfA(String str, int i, int i2) {
        this.LL = i2;
    }
}
