package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0lMJ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class EnumC1354770lMJ {
    public static final EnumC1354770lMJ EMOJI_KEYBOARD;
    public static final /* synthetic */ EnumC1354770lMJ[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC1354770lMJ SOFT_KEYBOARD;

    public static InterfaceC2044707zh<EnumC1354770lMJ> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC1354770lMJ enumC1354770lMJ = new EnumC1354770lMJ("SOFT_KEYBOARD", 0);
        SOFT_KEYBOARD = enumC1354770lMJ;
        EnumC1354770lMJ enumC1354770lMJ2 = new EnumC1354770lMJ("EMOJI_KEYBOARD", 1);
        EMOJI_KEYBOARD = enumC1354770lMJ2;
        EnumC1354770lMJ[] enumC1354770lMJArr = {enumC1354770lMJ, enumC1354770lMJ2};
        LL = enumC1354770lMJArr;
        LLILLJJLI = new C2254308sP(enumC1354770lMJArr);
    }

    public static EnumC1354770lMJ[] values() {
        return (EnumC1354770lMJ[]) LL.clone();
    }

    public static EnumC1354770lMJ valueOf(String str) {
        return (EnumC1354770lMJ) C08FF.LIZ(EnumC1354770lMJ.class, str);
    }

    public EnumC1354770lMJ(String str, int i) {
    }
}
