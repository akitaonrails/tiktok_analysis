package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0QpW, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class EnumC682280QpW {
    public static final EnumC682280QpW ADD_OBSERVER;
    public static final C673180Qaq Companion;
    public static final EnumC682280QpW FINISH;
    public static final EnumC682280QpW GET_CURRENT_STATE;
    public static final EnumC682280QpW GET_INTENT;
    public static final EnumC682280QpW IS_DESTROY;
    public static final EnumC682280QpW IS_FINISHING;
    public static final EnumC682280QpW LIVEDATA_OBSERVE;
    public static final /* synthetic */ EnumC682280QpW[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC682280QpW MAIN;
    public static final EnumC682280QpW VIEWMODEL_STORE;
    public static final EnumC682280QpW VSCOPE_ATTACH;
    public static int enableAll;
    public final int LL;

    public static InterfaceC2044707zh<EnumC682280QpW> getEntries() {
        return LLILLL;
    }

    /* JADX WARN: Type inference failed for: r0v18, types: [X.0Qaq] */
    static {
        EnumC682280QpW enumC682280QpW = new EnumC682280QpW("MAIN", 0, 1);
        MAIN = enumC682280QpW;
        EnumC682280QpW enumC682280QpW2 = new EnumC682280QpW("GET_CURRENT_STATE", 1, 2);
        GET_CURRENT_STATE = enumC682280QpW2;
        EnumC682280QpW enumC682280QpW3 = new EnumC682280QpW("FINISH", 2, 4);
        FINISH = enumC682280QpW3;
        EnumC682280QpW enumC682280QpW4 = new EnumC682280QpW("IS_FINISHING", 3, 8);
        IS_FINISHING = enumC682280QpW4;
        EnumC682280QpW enumC682280QpW5 = new EnumC682280QpW("IS_DESTROY", 4, 16);
        IS_DESTROY = enumC682280QpW5;
        EnumC682280QpW enumC682280QpW6 = new EnumC682280QpW("LIVEDATA_OBSERVE", 5, 32);
        LIVEDATA_OBSERVE = enumC682280QpW6;
        EnumC682280QpW enumC682280QpW7 = new EnumC682280QpW("VIEWMODEL_STORE", 6, 64);
        VIEWMODEL_STORE = enumC682280QpW7;
        EnumC682280QpW enumC682280QpW8 = new EnumC682280QpW("ADD_OBSERVER", 7, 128);
        ADD_OBSERVER = enumC682280QpW8;
        EnumC682280QpW enumC682280QpW9 = new EnumC682280QpW("VSCOPE_ATTACH", 8, 256);
        VSCOPE_ATTACH = enumC682280QpW9;
        EnumC682280QpW enumC682280QpW10 = new EnumC682280QpW("GET_INTENT", 9, 512);
        GET_INTENT = enumC682280QpW10;
        EnumC682280QpW[] enumC682280QpWArr = {enumC682280QpW, enumC682280QpW2, enumC682280QpW3, enumC682280QpW4, enumC682280QpW5, enumC682280QpW6, enumC682280QpW7, enumC682280QpW8, enumC682280QpW9, enumC682280QpW10};
        LLILLJJLI = enumC682280QpWArr;
        LLILLL = new C2254308sP(enumC682280QpWArr);
        Companion = new Object() { // from class: X.0Qaq
        };
        int i = 0;
        for (EnumC682280QpW enumC682280QpW11 : values()) {
            i |= enumC682280QpW11.LL;
        }
        enableAll = i;
    }

    public static EnumC682280QpW[] values() {
        return (EnumC682280QpW[]) LLILLJJLI.clone();
    }

    public final int getValue() {
        return this.LL;
    }

    public static EnumC682280QpW valueOf(String str) {
        return (EnumC682280QpW) C08FF.LIZ(EnumC682280QpW.class, str);
    }

    public EnumC682280QpW(String str, int i, int i2) {
        this.LL = i2;
    }
}
