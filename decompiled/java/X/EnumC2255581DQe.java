package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.1DQe, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes36.dex */
public final class EnumC2255581DQe {
    public static final EnumC2255581DQe BANNED;
    public static final EnumC2255581DQe BLOCKED;
    public static final EnumC2255581DQe DISSOLVED;
    public static final EnumC2255581DQe EXPIRED;
    public static final EnumC2255581DQe FULL;
    public static final /* synthetic */ EnumC2255581DQe[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC2255581DQe NONE;
    public static final EnumC2255581DQe REMOVED;
    public final int LL;

    public static InterfaceC2044707zh<EnumC2255581DQe> getEntries() {
        return LLILLL;
    }

    static {
        EnumC2255581DQe enumC2255581DQe = new EnumC2255581DQe("NONE", 0, 0);
        NONE = enumC2255581DQe;
        EnumC2255581DQe enumC2255581DQe2 = new EnumC2255581DQe("REMOVED", 1, 1);
        REMOVED = enumC2255581DQe2;
        EnumC2255581DQe enumC2255581DQe3 = new EnumC2255581DQe("BLOCKED", 2, 2);
        BLOCKED = enumC2255581DQe3;
        EnumC2255581DQe enumC2255581DQe4 = new EnumC2255581DQe("EXPIRED", 3, 3);
        EXPIRED = enumC2255581DQe4;
        EnumC2255581DQe enumC2255581DQe5 = new EnumC2255581DQe("FULL", 4, 4);
        FULL = enumC2255581DQe5;
        EnumC2255581DQe enumC2255581DQe6 = new EnumC2255581DQe("DISSOLVED", 5, 5);
        DISSOLVED = enumC2255581DQe6;
        EnumC2255581DQe enumC2255581DQe7 = new EnumC2255581DQe("BANNED", 6, 6);
        BANNED = enumC2255581DQe7;
        EnumC2255581DQe[] enumC2255581DQeArr = {enumC2255581DQe, enumC2255581DQe2, enumC2255581DQe3, enumC2255581DQe4, enumC2255581DQe5, enumC2255581DQe6, enumC2255581DQe7};
        LLILLJJLI = enumC2255581DQeArr;
        LLILLL = new C2254308sP(enumC2255581DQeArr);
    }

    public static EnumC2255581DQe[] values() {
        return (EnumC2255581DQe[]) LLILLJJLI.clone();
    }

    public final int getValue() {
        return this.LL;
    }

    public static EnumC2255581DQe valueOf(String str) {
        return (EnumC2255581DQe) C08FF.LIZ(EnumC2255581DQe.class, str);
    }

    public EnumC2255581DQe(String str, int i, int i2) {
        this.LL = i2;
    }
}
