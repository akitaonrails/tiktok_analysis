package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0Pwq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class EnumC661340Pwq {
    public static final EnumC661340Pwq BUFFERING;
    public static final EnumC661340Pwq ERROR;
    public static final EnumC661340Pwq IDLE;
    public static final /* synthetic */ EnumC661340Pwq[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC661340Pwq PAUSED;
    public static final EnumC661340Pwq PAUSING;
    public static final EnumC661340Pwq PLAY_COMPLETED;
    public static final EnumC661340Pwq PREPARED;
    public static final EnumC661340Pwq PREPARING;
    public static final EnumC661340Pwq RELEASED;
    public static final EnumC661340Pwq STARTED;
    public static final EnumC661340Pwq STOPPED;
    public static final EnumC661340Pwq STOPPING;
    public final int LL;

    public static InterfaceC2044707zh<EnumC661340Pwq> getEntries() {
        return LLILLL;
    }

    static {
        EnumC661340Pwq enumC661340Pwq = new EnumC661340Pwq("ERROR", 0, -1);
        ERROR = enumC661340Pwq;
        EnumC661340Pwq enumC661340Pwq2 = new EnumC661340Pwq("RELEASED", 1, 0);
        RELEASED = enumC661340Pwq2;
        EnumC661340Pwq enumC661340Pwq3 = new EnumC661340Pwq("IDLE", 2, 1);
        IDLE = enumC661340Pwq3;
        EnumC661340Pwq enumC661340Pwq4 = new EnumC661340Pwq("PREPARING", 3, 2);
        PREPARING = enumC661340Pwq4;
        EnumC661340Pwq enumC661340Pwq5 = new EnumC661340Pwq("PREPARED", 4, 3);
        PREPARED = enumC661340Pwq5;
        EnumC661340Pwq enumC661340Pwq6 = new EnumC661340Pwq("BUFFERING", 5, 4);
        BUFFERING = enumC661340Pwq6;
        EnumC661340Pwq enumC661340Pwq7 = new EnumC661340Pwq("STARTED", 6, 5);
        STARTED = enumC661340Pwq7;
        EnumC661340Pwq enumC661340Pwq8 = new EnumC661340Pwq("PAUSING", 7, 6);
        PAUSING = enumC661340Pwq8;
        EnumC661340Pwq enumC661340Pwq9 = new EnumC661340Pwq("PAUSED", 8, 7);
        PAUSED = enumC661340Pwq9;
        EnumC661340Pwq enumC661340Pwq10 = new EnumC661340Pwq("PLAY_COMPLETED", 9, 8);
        PLAY_COMPLETED = enumC661340Pwq10;
        EnumC661340Pwq enumC661340Pwq11 = new EnumC661340Pwq("STOPPING", 10, 9);
        STOPPING = enumC661340Pwq11;
        EnumC661340Pwq enumC661340Pwq12 = new EnumC661340Pwq("STOPPED", 11, 10);
        STOPPED = enumC661340Pwq12;
        EnumC661340Pwq[] enumC661340PwqArr = {enumC661340Pwq, enumC661340Pwq2, enumC661340Pwq3, enumC661340Pwq4, enumC661340Pwq5, enumC661340Pwq6, enumC661340Pwq7, enumC661340Pwq8, enumC661340Pwq9, enumC661340Pwq10, enumC661340Pwq11, enumC661340Pwq12};
        LLILLJJLI = enumC661340PwqArr;
        LLILLL = new C2254308sP(enumC661340PwqArr);
    }

    public static EnumC661340Pwq[] values() {
        return (EnumC661340Pwq[]) LLILLJJLI.clone();
    }

    public static EnumC661340Pwq valueOf(String str) {
        return (EnumC661340Pwq) C08FF.LIZ(EnumC661340Pwq.class, str);
    }

    public final boolean isAtLeast(EnumC661340Pwq enumC661340Pwq) {
        if (this.LL >= enumC661340Pwq.LL) {
            return true;
        }
        return false;
    }

    public final boolean isAtMost(EnumC661340Pwq enumC661340Pwq) {
        if (this.LL <= enumC661340Pwq.LL) {
            return true;
        }
        return false;
    }

    public EnumC661340Pwq(String str, int i, int i2) {
        this.LL = i2;
    }
}
