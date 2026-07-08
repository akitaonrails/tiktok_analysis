package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0wOU, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class EnumC1778960wOU {
    public static final EnumC1778960wOU ADD_DM;
    public static final EnumC1778960wOU GO_LIVE_TASKS;
    public static final /* synthetic */ EnumC1778960wOU[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;

    public static InterfaceC2044707zh<EnumC1778960wOU> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC1778960wOU enumC1778960wOU = new EnumC1778960wOU("ADD_DM", 0);
        ADD_DM = enumC1778960wOU;
        EnumC1778960wOU enumC1778960wOU2 = new EnumC1778960wOU("GO_LIVE_TASKS", 1);
        GO_LIVE_TASKS = enumC1778960wOU2;
        EnumC1778960wOU[] enumC1778960wOUArr = {enumC1778960wOU, enumC1778960wOU2};
        LL = enumC1778960wOUArr;
        LLILLJJLI = new C2254308sP(enumC1778960wOUArr);
    }

    public static EnumC1778960wOU[] values() {
        return (EnumC1778960wOU[]) LL.clone();
    }

    public static EnumC1778960wOU valueOf(String str) {
        return (EnumC1778960wOU) C08FF.LIZ(EnumC1778960wOU.class, str);
    }

    public EnumC1778960wOU(String str, int i) {
    }
}
