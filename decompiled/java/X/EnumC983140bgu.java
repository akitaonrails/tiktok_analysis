package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0bgu, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class EnumC983140bgu {
    public static final C983940biC Companion;
    public static final /* synthetic */ EnumC983140bgu[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC983140bgu QUIT;
    public static final EnumC983140bgu RESTART;
    public static final EnumC983140bgu SETTLE_START;
    public static final EnumC983140bgu STAY;
    public static final EnumC983140bgu SWITCH_TURN;
    public static final EnumC983140bgu USER_LEAVE;
    public final int LL;

    public static InterfaceC2044707zh<EnumC983140bgu> getEntries() {
        return LLILLL;
    }

    /* JADX WARN: Type inference failed for: r0v8, types: [X.0biC] */
    static {
        EnumC983140bgu enumC983140bgu = new EnumC983140bgu("STAY", 0, 0);
        STAY = enumC983140bgu;
        EnumC983140bgu enumC983140bgu2 = new EnumC983140bgu("QUIT", 1, 1);
        QUIT = enumC983140bgu2;
        EnumC983140bgu enumC983140bgu3 = new EnumC983140bgu("RESTART", 2, 2);
        RESTART = enumC983140bgu3;
        EnumC983140bgu enumC983140bgu4 = new EnumC983140bgu("SWITCH_TURN", 3, 3);
        SWITCH_TURN = enumC983140bgu4;
        EnumC983140bgu enumC983140bgu5 = new EnumC983140bgu("SETTLE_START", 4, 4);
        SETTLE_START = enumC983140bgu5;
        EnumC983140bgu enumC983140bgu6 = new EnumC983140bgu("USER_LEAVE", 5, 5);
        USER_LEAVE = enumC983140bgu6;
        EnumC983140bgu[] enumC983140bguArr = {enumC983140bgu, enumC983140bgu2, enumC983140bgu3, enumC983140bgu4, enumC983140bgu5, enumC983140bgu6};
        LLILLJJLI = enumC983140bguArr;
        LLILLL = new C2254308sP(enumC983140bguArr);
        Companion = new Object() { // from class: X.0biC
        };
    }

    public static EnumC983140bgu[] values() {
        return (EnumC983140bgu[]) LLILLJJLI.clone();
    }

    public final int getType() {
        return this.LL;
    }

    public static final EnumC983140bgu getTypeFromInt(Integer num) {
        Companion.getClass();
        EnumC983140bgu enumC983140bgu = STAY;
        int type = enumC983140bgu.getType();
        if (num == null || num.intValue() != type) {
            EnumC983140bgu enumC983140bgu2 = QUIT;
            int type2 = enumC983140bgu2.getType();
            if (num != null && num.intValue() == type2) {
                return enumC983140bgu2;
            }
            EnumC983140bgu enumC983140bgu3 = RESTART;
            int type3 = enumC983140bgu3.getType();
            if (num != null && num.intValue() == type3) {
                return enumC983140bgu3;
            }
            EnumC983140bgu enumC983140bgu4 = SWITCH_TURN;
            int type4 = enumC983140bgu4.getType();
            if (num != null && num.intValue() == type4) {
                return enumC983140bgu4;
            }
            EnumC983140bgu enumC983140bgu5 = SETTLE_START;
            int type5 = enumC983140bgu5.getType();
            if (num != null && num.intValue() == type5) {
                return enumC983140bgu5;
            }
            EnumC983140bgu enumC983140bgu6 = USER_LEAVE;
            int type6 = enumC983140bgu6.getType();
            if (num != null && num.intValue() == type6) {
                return enumC983140bgu6;
            }
        }
        return enumC983140bgu;
    }

    public static EnumC983140bgu valueOf(String str) {
        return (EnumC983140bgu) C08FF.LIZ(EnumC983140bgu.class, str);
    }

    public EnumC983140bgu(String str, int i, int i2) {
        this.LL = i2;
    }
}
