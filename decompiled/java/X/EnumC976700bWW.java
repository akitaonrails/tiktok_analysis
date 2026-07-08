package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0bWW, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class EnumC976700bWW {
    public static final EnumC976700bWW ACCEPTED;
    public static final EnumC976700bWW DRAW;
    public static final EnumC976700bWW FINAL_CALL;
    public static final EnumC976700bWW FINISH;
    public static final EnumC976700bWW INVITED;
    public static final /* synthetic */ EnumC976700bWW[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC976700bWW NONE;
    public static final EnumC976700bWW PREPARING;
    public static final EnumC976700bWW PUNISH;
    public static final EnumC976700bWW RECEIVED;
    public static final EnumC976700bWW SETTLE;
    public static final EnumC976700bWW START;

    public static InterfaceC2044707zh<EnumC976700bWW> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC976700bWW enumC976700bWW = new EnumC976700bWW("NONE", 0);
        NONE = enumC976700bWW;
        EnumC976700bWW enumC976700bWW2 = new EnumC976700bWW("PREPARING", 1);
        PREPARING = enumC976700bWW2;
        EnumC976700bWW enumC976700bWW3 = new EnumC976700bWW("INVITED", 2);
        INVITED = enumC976700bWW3;
        EnumC976700bWW enumC976700bWW4 = new EnumC976700bWW("RECEIVED", 3);
        RECEIVED = enumC976700bWW4;
        EnumC976700bWW enumC976700bWW5 = new EnumC976700bWW("ACCEPTED", 4);
        ACCEPTED = enumC976700bWW5;
        EnumC976700bWW enumC976700bWW6 = new EnumC976700bWW("START", 5);
        START = enumC976700bWW6;
        EnumC976700bWW enumC976700bWW7 = new EnumC976700bWW("FINAL_CALL", 6);
        FINAL_CALL = enumC976700bWW7;
        EnumC976700bWW enumC976700bWW8 = new EnumC976700bWW("SETTLE", 7);
        SETTLE = enumC976700bWW8;
        EnumC976700bWW enumC976700bWW9 = new EnumC976700bWW("PUNISH", 8);
        PUNISH = enumC976700bWW9;
        EnumC976700bWW enumC976700bWW10 = new EnumC976700bWW("DRAW", 9);
        DRAW = enumC976700bWW10;
        EnumC976700bWW enumC976700bWW11 = new EnumC976700bWW("FINISH", 10);
        FINISH = enumC976700bWW11;
        EnumC976700bWW[] enumC976700bWWArr = {enumC976700bWW, enumC976700bWW2, enumC976700bWW3, enumC976700bWW4, enumC976700bWW5, enumC976700bWW6, enumC976700bWW7, enumC976700bWW8, enumC976700bWW9, enumC976700bWW10, enumC976700bWW11};
        LL = enumC976700bWWArr;
        LLILLJJLI = new C2254308sP(enumC976700bWWArr);
    }

    public static EnumC976700bWW[] values() {
        return (EnumC976700bWW[]) LL.clone();
    }

    public static EnumC976700bWW valueOf(String str) {
        return (EnumC976700bWW) C08FF.LIZ(EnumC976700bWW.class, str);
    }

    public EnumC976700bWW(String str, int i) {
    }
}
