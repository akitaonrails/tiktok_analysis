package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0bfu, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class EnumC982520bfu {
    public static final EnumC982520bfu BEANS_ARTIFACTS;
    public static final EnumC982520bfu BEANS_AVATAR;
    public static final EnumC982520bfu BOMB;
    public static final C982960bgc Companion;
    public static final EnumC982520bfu FINISH;
    public static final EnumC982520bfu INITIATE;
    public static final /* synthetic */ EnumC982520bfu[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC982520bfu REPLY;
    public static final EnumC982520bfu SCORE_CHANGE;
    public static final EnumC982520bfu SETTLE_END;
    public static final EnumC982520bfu SETTLE_START;
    public static final EnumC982520bfu START;
    public static final EnumC982520bfu SWITCH_TURN;
    public static final EnumC982520bfu UNKNOWN;
    public final int LL;

    public static InterfaceC2044707zh<EnumC982520bfu> getEntries() {
        return LLILLL;
    }

    public static final EnumC982520bfu getTypeFromInt(Integer num) {
        Companion.getClass();
        return C982960bgc.LIZ(num);
    }

    static {
        EnumC982520bfu enumC982520bfu = new EnumC982520bfu("UNKNOWN", 0, 0);
        UNKNOWN = enumC982520bfu;
        EnumC982520bfu enumC982520bfu2 = new EnumC982520bfu("INITIATE", 1, 1);
        INITIATE = enumC982520bfu2;
        EnumC982520bfu enumC982520bfu3 = new EnumC982520bfu("REPLY", 2, 2);
        REPLY = enumC982520bfu3;
        EnumC982520bfu enumC982520bfu4 = new EnumC982520bfu("START", 3, 3);
        START = enumC982520bfu4;
        EnumC982520bfu enumC982520bfu5 = new EnumC982520bfu("SETTLE_START", 4, 4);
        SETTLE_START = enumC982520bfu5;
        EnumC982520bfu enumC982520bfu6 = new EnumC982520bfu("SETTLE_END", 5, 5);
        SETTLE_END = enumC982520bfu6;
        EnumC982520bfu enumC982520bfu7 = new EnumC982520bfu("SCORE_CHANGE", 6, 6);
        SCORE_CHANGE = enumC982520bfu7;
        EnumC982520bfu enumC982520bfu8 = new EnumC982520bfu("FINISH", 7, 7);
        FINISH = enumC982520bfu8;
        EnumC982520bfu enumC982520bfu9 = new EnumC982520bfu("SWITCH_TURN", 8, 8);
        SWITCH_TURN = enumC982520bfu9;
        EnumC982520bfu enumC982520bfu10 = new EnumC982520bfu("BOMB", 9, 9);
        BOMB = enumC982520bfu10;
        EnumC982520bfu enumC982520bfu11 = new EnumC982520bfu("BEANS_ARTIFACTS", 10, 10);
        BEANS_ARTIFACTS = enumC982520bfu11;
        EnumC982520bfu enumC982520bfu12 = new EnumC982520bfu("BEANS_AVATAR", 11, 11);
        BEANS_AVATAR = enumC982520bfu12;
        EnumC982520bfu[] enumC982520bfuArr = {enumC982520bfu, enumC982520bfu2, enumC982520bfu3, enumC982520bfu4, enumC982520bfu5, enumC982520bfu6, enumC982520bfu7, enumC982520bfu8, enumC982520bfu9, enumC982520bfu10, enumC982520bfu11, enumC982520bfu12};
        LLILLJJLI = enumC982520bfuArr;
        LLILLL = new C2254308sP(enumC982520bfuArr);
        Companion = new C982960bgc();
    }

    public static EnumC982520bfu[] values() {
        return (EnumC982520bfu[]) LLILLJJLI.clone();
    }

    public final int getType() {
        return this.LL;
    }

    public static EnumC982520bfu valueOf(String str) {
        return (EnumC982520bfu) C08FF.LIZ(EnumC982520bfu.class, str);
    }

    public EnumC982520bfu(String str, int i, int i2) {
        this.LL = i2;
    }
}
