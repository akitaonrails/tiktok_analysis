package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0EbE, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class EnumC367660EbE {
    public static final /* synthetic */ EnumC367660EbE[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC367660EbE MUSIC;
    public static final EnumC367660EbE RECORD;
    public static final EnumC367660EbE SOUND_EFFECT;
    public static final EnumC367660EbE TEXT_TO_SPEECH;

    public static InterfaceC2044707zh<EnumC367660EbE> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC367660EbE enumC367660EbE = new EnumC367660EbE("MUSIC", 0);
        MUSIC = enumC367660EbE;
        EnumC367660EbE enumC367660EbE2 = new EnumC367660EbE("RECORD", 1);
        RECORD = enumC367660EbE2;
        EnumC367660EbE enumC367660EbE3 = new EnumC367660EbE("SOUND_EFFECT", 2);
        SOUND_EFFECT = enumC367660EbE3;
        EnumC367660EbE enumC367660EbE4 = new EnumC367660EbE("TEXT_TO_SPEECH", 3);
        TEXT_TO_SPEECH = enumC367660EbE4;
        EnumC367660EbE[] enumC367660EbEArr = {enumC367660EbE, enumC367660EbE2, enumC367660EbE3, enumC367660EbE4};
        LL = enumC367660EbEArr;
        LLILLJJLI = new C2254308sP(enumC367660EbEArr);
    }

    public static EnumC367660EbE[] values() {
        return (EnumC367660EbE[]) LL.clone();
    }

    public static EnumC367660EbE valueOf(String str) {
        return (EnumC367660EbE) C08FF.LIZ(EnumC367660EbE.class, str);
    }

    public EnumC367660EbE(String str, int i) {
    }
}
