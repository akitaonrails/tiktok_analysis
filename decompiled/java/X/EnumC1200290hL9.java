package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0hL9, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class EnumC1200290hL9 {
    public static final EnumC1200290hL9 COARSE;
    public static final /* synthetic */ EnumC1200290hL9[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC1200290hL9 NOT_GRANTED;
    public static final EnumC1200290hL9 PRECISE;

    public static InterfaceC2044707zh<EnumC1200290hL9> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC1200290hL9 enumC1200290hL9 = new EnumC1200290hL9("NOT_GRANTED", 0);
        NOT_GRANTED = enumC1200290hL9;
        EnumC1200290hL9 enumC1200290hL92 = new EnumC1200290hL9("COARSE", 1);
        COARSE = enumC1200290hL92;
        EnumC1200290hL9 enumC1200290hL93 = new EnumC1200290hL9("PRECISE", 2);
        PRECISE = enumC1200290hL93;
        EnumC1200290hL9[] enumC1200290hL9Arr = {enumC1200290hL9, enumC1200290hL92, enumC1200290hL93};
        LL = enumC1200290hL9Arr;
        LLILLJJLI = new C2254308sP(enumC1200290hL9Arr);
    }

    public static EnumC1200290hL9[] values() {
        return (EnumC1200290hL9[]) LL.clone();
    }

    public static EnumC1200290hL9 valueOf(String str) {
        return (EnumC1200290hL9) C08FF.LIZ(EnumC1200290hL9.class, str);
    }

    public EnumC1200290hL9(String str, int i) {
    }
}
