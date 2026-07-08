package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0a19, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class EnumC918810a19 {
    public static final /* synthetic */ EnumC918810a19[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;

    @InterfaceC1294060jmO
    public static final EnumC918810a19 StateIdle;
    public static final EnumC918810a19 StateInit;

    @InterfaceC1294060jmO
    public static final EnumC918810a19 StateJoined;
    public static final EnumC918810a19 StateLinked;
    public static final EnumC918810a19 StatePreparing;

    public static InterfaceC2044707zh<EnumC918810a19> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC918810a19 enumC918810a19 = new EnumC918810a19("StateIdle", 0);
        StateIdle = enumC918810a19;
        EnumC918810a19 enumC918810a192 = new EnumC918810a19("StateInit", 1);
        StateInit = enumC918810a192;
        EnumC918810a19 enumC918810a193 = new EnumC918810a19("StatePreparing", 2);
        StatePreparing = enumC918810a193;
        EnumC918810a19 enumC918810a194 = new EnumC918810a19("StateJoined", 3);
        StateJoined = enumC918810a194;
        EnumC918810a19 enumC918810a195 = new EnumC918810a19("StateLinked", 4);
        StateLinked = enumC918810a195;
        EnumC918810a19[] enumC918810a19Arr = {enumC918810a19, enumC918810a192, enumC918810a193, enumC918810a194, enumC918810a195};
        LL = enumC918810a19Arr;
        LLILLJJLI = new C2254308sP(enumC918810a19Arr);
    }

    public static EnumC918810a19[] values() {
        return (EnumC918810a19[]) LL.clone();
    }

    public static EnumC918810a19 valueOf(String str) {
        return (EnumC918810a19) C08FF.LIZ(EnumC918810a19.class, str);
    }

    public EnumC918810a19(String str, int i) {
    }
}
