package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0b63, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class EnumC960290b63 {
    public static final EnumC960290b63 ACCEPT;
    public static final /* synthetic */ EnumC960290b63[] LLILZ;
    public static final /* synthetic */ C2254308sP LLILZIL;
    public static final EnumC960290b63 QUICK_PAIR_INFORMATIVE;
    public static final EnumC960290b63 REQUEST;
    public final int LL;
    public final int LLILLJJLI;
    public final int LLILLL;

    public static InterfaceC2044707zh<EnumC960290b63> getEntries() {
        return LLILZIL;
    }

    static {
        EnumC960290b63 enumC960290b63 = new EnumC960290b63("REQUEST", 0, 2131841187, 2131841186, 2131841185);
        REQUEST = enumC960290b63;
        EnumC960290b63 enumC960290b632 = new EnumC960290b63("ACCEPT", 1, 2131841184, 2131841183, 2131841185);
        ACCEPT = enumC960290b632;
        EnumC960290b63 enumC960290b633 = new EnumC960290b63("QUICK_PAIR_INFORMATIVE", 2, 2131851770, 2131851769, 2131842050);
        QUICK_PAIR_INFORMATIVE = enumC960290b633;
        EnumC960290b63[] enumC960290b63Arr = {enumC960290b63, enumC960290b632, enumC960290b633};
        LLILZ = enumC960290b63Arr;
        LLILZIL = new C2254308sP(enumC960290b63Arr);
    }

    public static EnumC960290b63[] values() {
        return (EnumC960290b63[]) LLILZ.clone();
    }

    public final int getContentResId() {
        return this.LLILLJJLI;
    }

    public final int getPositiveResId() {
        return this.LLILLL;
    }

    public final int getTitleResId() {
        return this.LL;
    }

    public static EnumC960290b63 valueOf(String str) {
        return (EnumC960290b63) C08FF.LIZ(EnumC960290b63.class, str);
    }

    public EnumC960290b63(String str, int i, int i2, int i3, int i4) {
        this.LL = i2;
        this.LLILLJJLI = i3;
        this.LLILLL = i4;
    }
}
