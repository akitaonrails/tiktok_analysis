package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0JhW, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class EnumC498960JhW {
    public static final EnumC498960JhW AUDIENCE;
    public static final EnumC498960JhW BROADCAST;
    public static final /* synthetic */ EnumC498960JhW[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC498960JhW PREVIEW;

    public static InterfaceC2044707zh<EnumC498960JhW> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC498960JhW enumC498960JhW = new EnumC498960JhW("PREVIEW", 0);
        PREVIEW = enumC498960JhW;
        EnumC498960JhW enumC498960JhW2 = new EnumC498960JhW("BROADCAST", 1);
        BROADCAST = enumC498960JhW2;
        EnumC498960JhW enumC498960JhW3 = new EnumC498960JhW("AUDIENCE", 2);
        AUDIENCE = enumC498960JhW3;
        EnumC498960JhW[] enumC498960JhWArr = {enumC498960JhW, enumC498960JhW2, enumC498960JhW3};
        LL = enumC498960JhWArr;
        LLILLJJLI = new C2254308sP(enumC498960JhWArr);
    }

    public static EnumC498960JhW[] values() {
        return (EnumC498960JhW[]) LL.clone();
    }

    public static EnumC498960JhW valueOf(String str) {
        return (EnumC498960JhW) C08FF.LIZ(EnumC498960JhW.class, str);
    }

    public EnumC498960JhW(String str, int i) {
    }
}
