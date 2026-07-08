package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.07uU, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class EnumC2012407uU {
    public static final EnumC2012407uU CARD;
    public static final /* synthetic */ EnumC2012407uU[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC2012407uU OLD_STYLE;

    public static InterfaceC2044707zh<EnumC2012407uU> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC2012407uU enumC2012407uU = new EnumC2012407uU("OLD_STYLE", 0);
        OLD_STYLE = enumC2012407uU;
        EnumC2012407uU enumC2012407uU2 = new EnumC2012407uU("CARD", 1);
        CARD = enumC2012407uU2;
        EnumC2012407uU[] enumC2012407uUArr = {enumC2012407uU, enumC2012407uU2};
        LL = enumC2012407uUArr;
        LLILLJJLI = new C2254308sP(enumC2012407uUArr);
    }

    public static EnumC2012407uU[] values() {
        return (EnumC2012407uU[]) LL.clone();
    }

    public static EnumC2012407uU valueOf(String str) {
        return (EnumC2012407uU) C08FF.LIZ(EnumC2012407uU.class, str);
    }

    public EnumC2012407uU(String str, int i) {
    }
}
