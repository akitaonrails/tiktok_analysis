package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0onW, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class EnumC1486960onW {
    public static final EnumC1486960onW INIT;
    public static final /* synthetic */ EnumC1486960onW[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC1486960onW PAUSE;
    public static final EnumC1486960onW RELEASE;
    public static final EnumC1486960onW RESUME;
    public static final EnumC1486960onW START;
    public static final EnumC1486960onW STOP;

    public static InterfaceC2044707zh<EnumC1486960onW> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC1486960onW enumC1486960onW = new EnumC1486960onW("INIT", 0);
        INIT = enumC1486960onW;
        EnumC1486960onW enumC1486960onW2 = new EnumC1486960onW("START", 1);
        START = enumC1486960onW2;
        EnumC1486960onW enumC1486960onW3 = new EnumC1486960onW("PAUSE", 2);
        PAUSE = enumC1486960onW3;
        EnumC1486960onW enumC1486960onW4 = new EnumC1486960onW("RESUME", 3);
        RESUME = enumC1486960onW4;
        EnumC1486960onW enumC1486960onW5 = new EnumC1486960onW("STOP", 4);
        STOP = enumC1486960onW5;
        EnumC1486960onW enumC1486960onW6 = new EnumC1486960onW("RELEASE", 5);
        RELEASE = enumC1486960onW6;
        EnumC1486960onW[] enumC1486960onWArr = {enumC1486960onW, enumC1486960onW2, enumC1486960onW3, enumC1486960onW4, enumC1486960onW5, enumC1486960onW6};
        LL = enumC1486960onWArr;
        LLILLJJLI = new C2254308sP(enumC1486960onWArr);
    }

    public static EnumC1486960onW[] values() {
        return (EnumC1486960onW[]) LL.clone();
    }

    public static EnumC1486960onW valueOf(String str) {
        return (EnumC1486960onW) C08FF.LIZ(EnumC1486960onW.class, str);
    }

    public EnumC1486960onW(String str, int i) {
    }
}
