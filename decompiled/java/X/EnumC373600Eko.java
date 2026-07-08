package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0Eko, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class EnumC373600Eko {
    public static final /* synthetic */ EnumC373600Eko[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC373600Eko PAUSE;
    public static final EnumC373600Eko PLAY;

    public static InterfaceC2044707zh<EnumC373600Eko> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC373600Eko enumC373600Eko = new EnumC373600Eko("PLAY", 0);
        PLAY = enumC373600Eko;
        EnumC373600Eko enumC373600Eko2 = new EnumC373600Eko("PAUSE", 1);
        PAUSE = enumC373600Eko2;
        EnumC373600Eko[] enumC373600EkoArr = {enumC373600Eko, enumC373600Eko2};
        LL = enumC373600EkoArr;
        LLILLJJLI = new C2254308sP(enumC373600EkoArr);
    }

    public static EnumC373600Eko[] values() {
        return (EnumC373600Eko[]) LL.clone();
    }

    public static EnumC373600Eko valueOf(String str) {
        return (EnumC373600Eko) C08FF.LIZ(EnumC373600Eko.class, str);
    }

    public EnumC373600Eko(String str, int i) {
    }
}
