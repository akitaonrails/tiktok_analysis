package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0EyW, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class EnumC382100EyW {
    public static final EnumC382100EyW IMAGE;
    public static final /* synthetic */ EnumC382100EyW[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC382100EyW VIDEO;

    public static InterfaceC2044707zh<EnumC382100EyW> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC382100EyW enumC382100EyW = new EnumC382100EyW("IMAGE", 0);
        IMAGE = enumC382100EyW;
        EnumC382100EyW enumC382100EyW2 = new EnumC382100EyW("VIDEO", 1);
        VIDEO = enumC382100EyW2;
        EnumC382100EyW[] enumC382100EyWArr = {enumC382100EyW, enumC382100EyW2};
        LL = enumC382100EyWArr;
        LLILLJJLI = new C2254308sP(enumC382100EyWArr);
    }

    public static EnumC382100EyW[] values() {
        return (EnumC382100EyW[]) LL.clone();
    }

    public static EnumC382100EyW valueOf(String str) {
        return (EnumC382100EyW) C08FF.LIZ(EnumC382100EyW.class, str);
    }

    public EnumC382100EyW(String str, int i) {
    }
}
