package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0cx9, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class EnumC1031650cx9 {
    public static final EnumC1031650cx9 CLOSE;
    public static final /* synthetic */ EnumC1031650cx9[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC1031650cx9 SHOWING;
    public static final EnumC1031650cx9 SHOWN;

    public static InterfaceC2044707zh<EnumC1031650cx9> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC1031650cx9 enumC1031650cx9 = new EnumC1031650cx9("SHOWING", 0);
        SHOWING = enumC1031650cx9;
        EnumC1031650cx9 enumC1031650cx92 = new EnumC1031650cx9("SHOWN", 1);
        SHOWN = enumC1031650cx92;
        EnumC1031650cx9 enumC1031650cx93 = new EnumC1031650cx9("CLOSE", 2);
        CLOSE = enumC1031650cx93;
        EnumC1031650cx9[] enumC1031650cx9Arr = {enumC1031650cx9, enumC1031650cx92, enumC1031650cx93};
        LL = enumC1031650cx9Arr;
        LLILLJJLI = new C2254308sP(enumC1031650cx9Arr);
    }

    public static EnumC1031650cx9[] values() {
        return (EnumC1031650cx9[]) LL.clone();
    }

    public static EnumC1031650cx9 valueOf(String str) {
        return (EnumC1031650cx9) C08FF.LIZ(EnumC1031650cx9.class, str);
    }

    public EnumC1031650cx9(String str, int i) {
    }
}
