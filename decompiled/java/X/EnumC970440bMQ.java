package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0bMQ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class EnumC970440bMQ {
    public static final EnumC970440bMQ BATTLE_INFO_SCENE_ARMIES_FALLBACK;
    public static final EnumC970440bMQ BATTLE_INFO_SCENE_CALIBRATE_NEGATIVE;
    public static final EnumC970440bMQ BATTLE_INFO_SCENE_CANCEL_START;
    public static final EnumC970440bMQ BATTLE_INFO_SCENE_COMPONENT_DISAPPEAR;
    public static final EnumC970440bMQ BATTLE_INFO_SCENE_ENTER_ROOM;
    public static final EnumC970440bMQ BATTLE_INFO_SCENE_FINISH;
    public static final EnumC970440bMQ BATTLE_INFO_SCENE_HEART_BEAT;
    public static final EnumC970440bMQ BATTLE_INFO_SCENE_INVITER_DELAY;
    public static final EnumC970440bMQ BATTLE_INFO_SCENE_MISS_OPEN;
    public static final EnumC970440bMQ BATTLE_INFO_SCENE_OPEN_EXPIRE;
    public static final EnumC970440bMQ BATTLE_INFO_SCENE_OPEN_RESULT;
    public static final EnumC970440bMQ BATTLE_INFO_SCENE_RESUME;
    public static final EnumC970440bMQ BATTLE_INFO_SCENE_SEI_FALLBACK;
    public static final EnumC970440bMQ BATTLE_INFO_SCENE_TASK;
    public static final EnumC970440bMQ BATTLE_INFO_SCENE_WINDOW_RECREATED;
    public static final /* synthetic */ EnumC970440bMQ[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public final int LL;

    public static InterfaceC2044707zh<EnumC970440bMQ> getEntries() {
        return LLILLL;
    }

    static {
        EnumC970440bMQ enumC970440bMQ = new EnumC970440bMQ("BATTLE_INFO_SCENE_FINISH", 0, 0);
        BATTLE_INFO_SCENE_FINISH = enumC970440bMQ;
        EnumC970440bMQ enumC970440bMQ2 = new EnumC970440bMQ("BATTLE_INFO_SCENE_TASK", 1, 1);
        BATTLE_INFO_SCENE_TASK = enumC970440bMQ2;
        EnumC970440bMQ enumC970440bMQ3 = new EnumC970440bMQ("BATTLE_INFO_SCENE_CALIBRATE_NEGATIVE", 2, 2);
        BATTLE_INFO_SCENE_CALIBRATE_NEGATIVE = enumC970440bMQ3;
        EnumC970440bMQ enumC970440bMQ4 = new EnumC970440bMQ("BATTLE_INFO_SCENE_COMPONENT_DISAPPEAR", 3, 3);
        BATTLE_INFO_SCENE_COMPONENT_DISAPPEAR = enumC970440bMQ4;
        EnumC970440bMQ enumC970440bMQ5 = new EnumC970440bMQ("BATTLE_INFO_SCENE_MISS_OPEN", 4, 4);
        BATTLE_INFO_SCENE_MISS_OPEN = enumC970440bMQ5;
        EnumC970440bMQ enumC970440bMQ6 = new EnumC970440bMQ("BATTLE_INFO_SCENE_ENTER_ROOM", 5, 5);
        BATTLE_INFO_SCENE_ENTER_ROOM = enumC970440bMQ6;
        EnumC970440bMQ enumC970440bMQ7 = new EnumC970440bMQ("BATTLE_INFO_SCENE_SEI_FALLBACK", 6, 6);
        BATTLE_INFO_SCENE_SEI_FALLBACK = enumC970440bMQ7;
        EnumC970440bMQ enumC970440bMQ8 = new EnumC970440bMQ("BATTLE_INFO_SCENE_OPEN_EXPIRE", 7, 7);
        BATTLE_INFO_SCENE_OPEN_EXPIRE = enumC970440bMQ8;
        EnumC970440bMQ enumC970440bMQ9 = new EnumC970440bMQ("BATTLE_INFO_SCENE_ARMIES_FALLBACK", 8, 8);
        BATTLE_INFO_SCENE_ARMIES_FALLBACK = enumC970440bMQ9;
        EnumC970440bMQ enumC970440bMQ10 = new EnumC970440bMQ("BATTLE_INFO_SCENE_INVITER_DELAY", 9, 9);
        BATTLE_INFO_SCENE_INVITER_DELAY = enumC970440bMQ10;
        EnumC970440bMQ enumC970440bMQ11 = new EnumC970440bMQ("BATTLE_INFO_SCENE_CANCEL_START", 10, 10);
        BATTLE_INFO_SCENE_CANCEL_START = enumC970440bMQ11;
        EnumC970440bMQ enumC970440bMQ12 = new EnumC970440bMQ("BATTLE_INFO_SCENE_OPEN_RESULT", 11, 11);
        BATTLE_INFO_SCENE_OPEN_RESULT = enumC970440bMQ12;
        EnumC970440bMQ enumC970440bMQ13 = new EnumC970440bMQ("BATTLE_INFO_SCENE_RESUME", 12, 12);
        BATTLE_INFO_SCENE_RESUME = enumC970440bMQ13;
        EnumC970440bMQ enumC970440bMQ14 = new EnumC970440bMQ("BATTLE_INFO_SCENE_HEART_BEAT", 13, 30);
        BATTLE_INFO_SCENE_HEART_BEAT = enumC970440bMQ14;
        EnumC970440bMQ enumC970440bMQ15 = new EnumC970440bMQ("BATTLE_INFO_SCENE_WINDOW_RECREATED", 14, 40);
        BATTLE_INFO_SCENE_WINDOW_RECREATED = enumC970440bMQ15;
        EnumC970440bMQ[] enumC970440bMQArr = {enumC970440bMQ, enumC970440bMQ2, enumC970440bMQ3, enumC970440bMQ4, enumC970440bMQ5, enumC970440bMQ6, enumC970440bMQ7, enumC970440bMQ8, enumC970440bMQ9, enumC970440bMQ10, enumC970440bMQ11, enumC970440bMQ12, enumC970440bMQ13, enumC970440bMQ14, enumC970440bMQ15};
        LLILLJJLI = enumC970440bMQArr;
        LLILLL = new C2254308sP(enumC970440bMQArr);
    }

    public static EnumC970440bMQ[] values() {
        return (EnumC970440bMQ[]) LLILLJJLI.clone();
    }

    public final int getType() {
        return this.LL;
    }

    public static EnumC970440bMQ valueOf(String str) {
        return (EnumC970440bMQ) C08FF.LIZ(EnumC970440bMQ.class, str);
    }

    public EnumC970440bMQ(String str, int i, int i2) {
        this.LL = i2;
    }
}
