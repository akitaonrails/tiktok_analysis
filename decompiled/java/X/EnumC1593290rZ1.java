package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0rZ1, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class EnumC1593290rZ1 {
    public static final /* synthetic */ EnumC1593290rZ1[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC1593290rZ1 LYNX;
    public static final EnumC1593290rZ1 VIDEO;
    public static final EnumC1593290rZ1 VIEW;

    public static InterfaceC2044707zh<EnumC1593290rZ1> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC1593290rZ1 enumC1593290rZ1 = new EnumC1593290rZ1("VIEW", 0);
        VIEW = enumC1593290rZ1;
        EnumC1593290rZ1 enumC1593290rZ12 = new EnumC1593290rZ1("VIDEO", 1);
        VIDEO = enumC1593290rZ12;
        EnumC1593290rZ1 enumC1593290rZ13 = new EnumC1593290rZ1("LYNX", 2);
        LYNX = enumC1593290rZ13;
        EnumC1593290rZ1[] enumC1593290rZ1Arr = {enumC1593290rZ1, enumC1593290rZ12, enumC1593290rZ13};
        LL = enumC1593290rZ1Arr;
        LLILLJJLI = new C2254308sP(enumC1593290rZ1Arr);
    }

    public static EnumC1593290rZ1[] values() {
        return (EnumC1593290rZ1[]) LL.clone();
    }

    public static EnumC1593290rZ1 valueOf(String str) {
        return (EnumC1593290rZ1) C08FF.LIZ(EnumC1593290rZ1.class, str);
    }

    public EnumC1593290rZ1(String str, int i) {
    }
}
