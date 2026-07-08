package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0g81, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class EnumC1153710g81 {
    public static final /* synthetic */ EnumC1153710g81[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC1153710g81 RET_FAIL;
    public static final EnumC1153710g81 RET_FALSE;
    public static final EnumC1153710g81 RET_TRUE;

    public static InterfaceC2044707zh<EnumC1153710g81> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC1153710g81 enumC1153710g81 = new EnumC1153710g81("RET_FALSE", 0);
        RET_FALSE = enumC1153710g81;
        EnumC1153710g81 enumC1153710g812 = new EnumC1153710g81("RET_TRUE", 1);
        RET_TRUE = enumC1153710g812;
        EnumC1153710g81 enumC1153710g813 = new EnumC1153710g81("RET_FAIL", 2);
        RET_FAIL = enumC1153710g813;
        EnumC1153710g81[] enumC1153710g81Arr = {enumC1153710g81, enumC1153710g812, enumC1153710g813};
        LL = enumC1153710g81Arr;
        LLILLJJLI = new C2254308sP(enumC1153710g81Arr);
    }

    public static EnumC1153710g81[] values() {
        return (EnumC1153710g81[]) LL.clone();
    }

    public static EnumC1153710g81 valueOf(String str) {
        return (EnumC1153710g81) C08FF.LIZ(EnumC1153710g81.class, str);
    }

    public EnumC1153710g81(String str, int i) {
    }
}
