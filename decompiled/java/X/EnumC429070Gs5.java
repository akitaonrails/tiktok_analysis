package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0Gs5, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class EnumC429070Gs5 {
    public static final EnumC429070Gs5 CANCEL;
    public static final EnumC429070Gs5 INPUT;
    public static final /* synthetic */ EnumC429070Gs5[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;

    public static InterfaceC2044707zh<EnumC429070Gs5> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC429070Gs5 enumC429070Gs5 = new EnumC429070Gs5("INPUT", 0);
        INPUT = enumC429070Gs5;
        EnumC429070Gs5 enumC429070Gs52 = new EnumC429070Gs5("CANCEL", 1);
        CANCEL = enumC429070Gs52;
        EnumC429070Gs5[] enumC429070Gs5Arr = {enumC429070Gs5, enumC429070Gs52};
        LL = enumC429070Gs5Arr;
        LLILLJJLI = new C2254308sP(enumC429070Gs5Arr);
    }

    public static EnumC429070Gs5[] values() {
        return (EnumC429070Gs5[]) LL.clone();
    }

    public static EnumC429070Gs5 valueOf(String str) {
        return (EnumC429070Gs5) C08FF.LIZ(EnumC429070Gs5.class, str);
    }

    public EnumC429070Gs5(String str, int i) {
    }
}
