package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0fcy, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class EnumC1134460fcy {
    public static final /* synthetic */ EnumC1134460fcy[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC1134460fcy TASK_COMPLETED;
    public static final EnumC1134460fcy TASK_ENTER;
    public static final EnumC1134460fcy TASK_EXIT;
    public static final EnumC1134460fcy TASK_EXPIRED;
    public static final EnumC1134460fcy TASK_IN_PROGRESS;
    public static final EnumC1134460fcy TASK_REWARDED;
    public static final EnumC1134460fcy TASK_TO_REWARD;
    public static final EnumC1134460fcy TASK_UNKNOWN;
    public final int LL;

    public static InterfaceC2044707zh<EnumC1134460fcy> getEntries() {
        return LLILLL;
    }

    static {
        EnumC1134460fcy enumC1134460fcy = new EnumC1134460fcy("TASK_UNKNOWN", 0, -1);
        TASK_UNKNOWN = enumC1134460fcy;
        EnumC1134460fcy enumC1134460fcy2 = new EnumC1134460fcy("TASK_ENTER", 1, 0);
        TASK_ENTER = enumC1134460fcy2;
        EnumC1134460fcy enumC1134460fcy3 = new EnumC1134460fcy("TASK_IN_PROGRESS", 2, 1);
        TASK_IN_PROGRESS = enumC1134460fcy3;
        EnumC1134460fcy enumC1134460fcy4 = new EnumC1134460fcy("TASK_COMPLETED", 3, 2);
        TASK_COMPLETED = enumC1134460fcy4;
        EnumC1134460fcy enumC1134460fcy5 = new EnumC1134460fcy("TASK_TO_REWARD", 4, 3);
        TASK_TO_REWARD = enumC1134460fcy5;
        EnumC1134460fcy enumC1134460fcy6 = new EnumC1134460fcy("TASK_REWARDED", 5, 4);
        TASK_REWARDED = enumC1134460fcy6;
        EnumC1134460fcy enumC1134460fcy7 = new EnumC1134460fcy("TASK_EXIT", 6, 5);
        TASK_EXIT = enumC1134460fcy7;
        EnumC1134460fcy enumC1134460fcy8 = new EnumC1134460fcy("TASK_EXPIRED", 7, 6);
        TASK_EXPIRED = enumC1134460fcy8;
        EnumC1134460fcy[] enumC1134460fcyArr = {enumC1134460fcy, enumC1134460fcy2, enumC1134460fcy3, enumC1134460fcy4, enumC1134460fcy5, enumC1134460fcy6, enumC1134460fcy7, enumC1134460fcy8};
        LLILLJJLI = enumC1134460fcyArr;
        LLILLL = new C2254308sP(enumC1134460fcyArr);
    }

    public static EnumC1134460fcy[] values() {
        return (EnumC1134460fcy[]) LLILLJJLI.clone();
    }

    public final int getStatusValue() {
        return this.LL;
    }

    public static EnumC1134460fcy valueOf(String str) {
        return (EnumC1134460fcy) C08FF.LIZ(EnumC1134460fcy.class, str);
    }

    public final boolean afterOrEqualsStatus(EnumC1134460fcy enumC1134460fcy) {
        if (this.LL >= enumC1134460fcy.LL) {
            return true;
        }
        return false;
    }

    public final boolean afterStatus(EnumC1134460fcy enumC1134460fcy) {
        if (this.LL > enumC1134460fcy.LL) {
            return true;
        }
        return false;
    }

    public final boolean beforeOrEqualsStatus(EnumC1134460fcy enumC1134460fcy) {
        if (this.LL <= enumC1134460fcy.LL) {
            return true;
        }
        return false;
    }

    public final boolean beforeStatus(EnumC1134460fcy enumC1134460fcy) {
        if (this.LL < enumC1134460fcy.LL) {
            return true;
        }
        return false;
    }

    public EnumC1134460fcy(String str, int i, int i2) {
        this.LL = i2;
    }
}
