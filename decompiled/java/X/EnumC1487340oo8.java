package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0oo8, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class EnumC1487340oo8 {
    public static final EnumC1487340oo8 Audio;
    public static final EnumC1487340oo8 Effect;
    public static final EnumC1487340oo8 Filter;
    public static final /* synthetic */ EnumC1487340oo8[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC1487340oo8 NOTHING;
    public static final EnumC1487340oo8 Sticker;

    public static InterfaceC2044707zh<EnumC1487340oo8> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC1487340oo8 enumC1487340oo8 = new EnumC1487340oo8("NOTHING", 0);
        NOTHING = enumC1487340oo8;
        EnumC1487340oo8 enumC1487340oo82 = new EnumC1487340oo8("Audio", 1);
        Audio = enumC1487340oo82;
        EnumC1487340oo8 enumC1487340oo83 = new EnumC1487340oo8("Filter", 2);
        Filter = enumC1487340oo83;
        EnumC1487340oo8 enumC1487340oo84 = new EnumC1487340oo8("Sticker", 3);
        Sticker = enumC1487340oo84;
        EnumC1487340oo8 enumC1487340oo85 = new EnumC1487340oo8("Effect", 4);
        Effect = enumC1487340oo85;
        EnumC1487340oo8[] enumC1487340oo8Arr = {enumC1487340oo8, enumC1487340oo82, enumC1487340oo83, enumC1487340oo84, enumC1487340oo85};
        LL = enumC1487340oo8Arr;
        LLILLJJLI = new C2254308sP(enumC1487340oo8Arr);
    }

    public static EnumC1487340oo8[] values() {
        return (EnumC1487340oo8[]) LL.clone();
    }

    public static EnumC1487340oo8 valueOf(String str) {
        return (EnumC1487340oo8) C08FF.LIZ(EnumC1487340oo8.class, str);
    }

    public EnumC1487340oo8(String str, int i) {
    }
}
