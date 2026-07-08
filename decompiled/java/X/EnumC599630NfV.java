package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0NfV, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class EnumC599630NfV {
    public static final EnumC599630NfV GET_DATA;
    public static final /* synthetic */ EnumC599630NfV[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC599630NfV OBSERVER_DATA;
    public static final EnumC599630NfV SET_DATA;
    public static final EnumC599630NfV UNOBSERVER_DATA;
    public final int LL;

    public static InterfaceC2044707zh<EnumC599630NfV> getEntries() {
        return LLILLL;
    }

    static {
        EnumC599630NfV enumC599630NfV = new EnumC599630NfV("SET_DATA", 0, 1);
        SET_DATA = enumC599630NfV;
        EnumC599630NfV enumC599630NfV2 = new EnumC599630NfV("GET_DATA", 1, 2);
        GET_DATA = enumC599630NfV2;
        EnumC599630NfV enumC599630NfV3 = new EnumC599630NfV("OBSERVER_DATA", 2, 3);
        OBSERVER_DATA = enumC599630NfV3;
        EnumC599630NfV enumC599630NfV4 = new EnumC599630NfV("UNOBSERVER_DATA", 3, 4);
        UNOBSERVER_DATA = enumC599630NfV4;
        EnumC599630NfV[] enumC599630NfVArr = {enumC599630NfV, enumC599630NfV2, enumC599630NfV3, enumC599630NfV4};
        LLILLJJLI = enumC599630NfVArr;
        LLILLL = new C2254308sP(enumC599630NfVArr);
    }

    public static EnumC599630NfV[] values() {
        return (EnumC599630NfV[]) LLILLJJLI.clone();
    }

    public final int getValue() {
        return this.LL;
    }

    public static EnumC599630NfV valueOf(String str) {
        return (EnumC599630NfV) C08FF.LIZ(EnumC599630NfV.class, str);
    }

    public EnumC599630NfV(String str, int i, int i2) {
        this.LL = i2;
    }
}
