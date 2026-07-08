package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0Dy8, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class EnumC356380Dy8 {
    public static final EnumC356380Dy8 ALGORITHM;
    public static final EnumC356380Dy8 EFFECT;
    public static final /* synthetic */ EnumC356380Dy8[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;

    public static InterfaceC2044707zh<EnumC356380Dy8> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC356380Dy8 enumC356380Dy8 = new EnumC356380Dy8("EFFECT", 0);
        EFFECT = enumC356380Dy8;
        EnumC356380Dy8 enumC356380Dy82 = new EnumC356380Dy8("ALGORITHM", 1);
        ALGORITHM = enumC356380Dy82;
        EnumC356380Dy8[] enumC356380Dy8Arr = {enumC356380Dy8, enumC356380Dy82};
        LL = enumC356380Dy8Arr;
        LLILLJJLI = new C2254308sP(enumC356380Dy8Arr);
    }

    public static EnumC356380Dy8[] values() {
        return (EnumC356380Dy8[]) LL.clone();
    }

    public static EnumC356380Dy8 valueOf(String str) {
        return (EnumC356380Dy8) C08FF.LIZ(EnumC356380Dy8.class, str);
    }

    public EnumC356380Dy8(String str, int i) {
    }
}
