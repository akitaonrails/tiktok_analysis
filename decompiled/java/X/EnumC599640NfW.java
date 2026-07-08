package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0NfW, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class EnumC599640NfW {
    public static final EnumC599640NfW GET_DATA;
    public static final /* synthetic */ EnumC599640NfW[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC599640NfW OBSERVER_DATA;
    public static final EnumC599640NfW SET_DATA;
    public static final EnumC599640NfW UNOBSERVER_DATA;
    public final int LL;

    public static InterfaceC2044707zh<EnumC599640NfW> getEntries() {
        return LLILLL;
    }

    static {
        EnumC599640NfW enumC599640NfW = new EnumC599640NfW("SET_DATA", 0, 1);
        SET_DATA = enumC599640NfW;
        EnumC599640NfW enumC599640NfW2 = new EnumC599640NfW("GET_DATA", 1, 2);
        GET_DATA = enumC599640NfW2;
        EnumC599640NfW enumC599640NfW3 = new EnumC599640NfW("OBSERVER_DATA", 2, 3);
        OBSERVER_DATA = enumC599640NfW3;
        EnumC599640NfW enumC599640NfW4 = new EnumC599640NfW("UNOBSERVER_DATA", 3, 4);
        UNOBSERVER_DATA = enumC599640NfW4;
        EnumC599640NfW[] enumC599640NfWArr = {enumC599640NfW, enumC599640NfW2, enumC599640NfW3, enumC599640NfW4};
        LLILLJJLI = enumC599640NfWArr;
        LLILLL = new C2254308sP(enumC599640NfWArr);
    }

    public static EnumC599640NfW[] values() {
        return (EnumC599640NfW[]) LLILLJJLI.clone();
    }

    public final int getValue() {
        return this.LL;
    }

    public static EnumC599640NfW valueOf(String str) {
        return (EnumC599640NfW) C08FF.LIZ(EnumC599640NfW.class, str);
    }

    public EnumC599640NfW(String str, int i, int i2) {
        this.LL = i2;
    }
}
