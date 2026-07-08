package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.159k, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public final class EnumC204738159k {
    public static final /* synthetic */ EnumC204738159k[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC204738159k NOT_RUNNING_STATE;
    public static final EnumC204738159k RUNNING_STATE_SHOW_TIME;
    public static final EnumC204738159k RUNNING_STATE_WITHOUT_COUNT_DOWN;
    public static final EnumC204738159k RUNNING_STATE_WITH_COUNT_DOWN_ANIAMTION;

    public static InterfaceC2044707zh<EnumC204738159k> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC204738159k enumC204738159k = new EnumC204738159k("RUNNING_STATE_WITH_COUNT_DOWN_ANIAMTION", 0);
        RUNNING_STATE_WITH_COUNT_DOWN_ANIAMTION = enumC204738159k;
        EnumC204738159k enumC204738159k2 = new EnumC204738159k("RUNNING_STATE_SHOW_TIME", 1);
        RUNNING_STATE_SHOW_TIME = enumC204738159k2;
        EnumC204738159k enumC204738159k3 = new EnumC204738159k("RUNNING_STATE_WITHOUT_COUNT_DOWN", 2);
        RUNNING_STATE_WITHOUT_COUNT_DOWN = enumC204738159k3;
        EnumC204738159k enumC204738159k4 = new EnumC204738159k("NOT_RUNNING_STATE", 3);
        NOT_RUNNING_STATE = enumC204738159k4;
        EnumC204738159k[] enumC204738159kArr = {enumC204738159k, enumC204738159k2, enumC204738159k3, enumC204738159k4};
        LL = enumC204738159kArr;
        LLILLJJLI = new C2254308sP(enumC204738159kArr);
    }

    public static EnumC204738159k[] values() {
        return (EnumC204738159k[]) LL.clone();
    }

    public static EnumC204738159k valueOf(String str) {
        return (EnumC204738159k) C08FF.LIZ(EnumC204738159k.class, str);
    }

    public EnumC204738159k(String str, int i) {
    }
}
