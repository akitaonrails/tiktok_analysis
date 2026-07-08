package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0g8T, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class EnumC1153990g8T {
    public static final EnumC1153990g8T ADD_TO_QUEUE;
    public static final EnumC1153990g8T CANCEL_AND_ADD_TO_QUEUE;
    public static final EnumC1153990g8T CLEAR_AND_ADD_TO_QUEUE;
    public static final EnumC1153990g8T CLEAR_QUEUE;
    public static final /* synthetic */ EnumC1153990g8T[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;

    public static InterfaceC2044707zh<EnumC1153990g8T> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC1153990g8T enumC1153990g8T = new EnumC1153990g8T("ADD_TO_QUEUE", 0);
        ADD_TO_QUEUE = enumC1153990g8T;
        EnumC1153990g8T enumC1153990g8T2 = new EnumC1153990g8T("CLEAR_AND_ADD_TO_QUEUE", 1);
        CLEAR_AND_ADD_TO_QUEUE = enumC1153990g8T2;
        EnumC1153990g8T enumC1153990g8T3 = new EnumC1153990g8T("CANCEL_AND_ADD_TO_QUEUE", 2);
        CANCEL_AND_ADD_TO_QUEUE = enumC1153990g8T3;
        EnumC1153990g8T enumC1153990g8T4 = new EnumC1153990g8T("CLEAR_QUEUE", 3);
        CLEAR_QUEUE = enumC1153990g8T4;
        EnumC1153990g8T[] enumC1153990g8TArr = {enumC1153990g8T, enumC1153990g8T2, enumC1153990g8T3, enumC1153990g8T4};
        LL = enumC1153990g8TArr;
        LLILLJJLI = new C2254308sP(enumC1153990g8TArr);
    }

    public static EnumC1153990g8T[] values() {
        return (EnumC1153990g8T[]) LL.clone();
    }

    public static EnumC1153990g8T valueOf(String str) {
        return (EnumC1153990g8T) C08FF.LIZ(EnumC1153990g8T.class, str);
    }

    public EnumC1153990g8T(String str, int i) {
    }
}
