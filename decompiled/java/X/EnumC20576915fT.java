package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.15fT, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public final class EnumC20576915fT {
    public static final EnumC20576915fT AUDIO;
    public static final EnumC20576915fT EFFECT;
    public static final EnumC20576915fT FILTER;
    public static final /* synthetic */ EnumC20576915fT[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC20576915fT NOTHING;
    public static final EnumC20576915fT STICKER;
    public static final EnumC20576915fT VIDEO;

    public static InterfaceC2044707zh<EnumC20576915fT> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC20576915fT enumC20576915fT = new EnumC20576915fT("NOTHING", 0);
        NOTHING = enumC20576915fT;
        EnumC20576915fT enumC20576915fT2 = new EnumC20576915fT("AUDIO", 1);
        AUDIO = enumC20576915fT2;
        EnumC20576915fT enumC20576915fT3 = new EnumC20576915fT("VIDEO", 2);
        VIDEO = enumC20576915fT3;
        EnumC20576915fT enumC20576915fT4 = new EnumC20576915fT("STICKER", 3);
        STICKER = enumC20576915fT4;
        EnumC20576915fT enumC20576915fT5 = new EnumC20576915fT("FILTER", 4);
        FILTER = enumC20576915fT5;
        EnumC20576915fT enumC20576915fT6 = new EnumC20576915fT("EFFECT", 5);
        EFFECT = enumC20576915fT6;
        EnumC20576915fT[] enumC20576915fTArr = {enumC20576915fT, enumC20576915fT2, enumC20576915fT3, enumC20576915fT4, enumC20576915fT5, enumC20576915fT6};
        LL = enumC20576915fTArr;
        LLILLJJLI = new C2254308sP(enumC20576915fTArr);
    }

    public static EnumC20576915fT[] values() {
        return (EnumC20576915fT[]) LL.clone();
    }

    public static EnumC20576915fT valueOf(String str) {
        return (EnumC20576915fT) C08FF.LIZ(EnumC20576915fT.class, str);
    }

    public EnumC20576915fT(String str, int i) {
    }
}
