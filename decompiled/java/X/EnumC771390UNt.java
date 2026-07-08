package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0UNt, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class EnumC771390UNt {
    public static final EnumC771390UNt BGM_MINI;
    public static final /* synthetic */ EnumC771390UNt[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC771390UNt MUTE_MIC;
    public static final EnumC771390UNt SOUND_EFFECT;
    public static final EnumC771390UNt STICKER;
    public final int LL = 1;

    public static InterfaceC2044707zh<EnumC771390UNt> getEntries() {
        return LLILLL;
    }

    static {
        EnumC771390UNt enumC771390UNt = new EnumC771390UNt("SOUND_EFFECT", 0);
        SOUND_EFFECT = enumC771390UNt;
        EnumC771390UNt enumC771390UNt2 = new EnumC771390UNt("MUTE_MIC", 1);
        MUTE_MIC = enumC771390UNt2;
        EnumC771390UNt enumC771390UNt3 = new EnumC771390UNt("STICKER", 2);
        STICKER = enumC771390UNt3;
        EnumC771390UNt enumC771390UNt4 = new EnumC771390UNt("BGM_MINI", 3);
        BGM_MINI = enumC771390UNt4;
        EnumC771390UNt[] enumC771390UNtArr = {enumC771390UNt, enumC771390UNt2, enumC771390UNt3, enumC771390UNt4};
        LLILLJJLI = enumC771390UNtArr;
        LLILLL = new C2254308sP(enumC771390UNtArr);
    }

    public static EnumC771390UNt[] values() {
        return (EnumC771390UNt[]) LLILLJJLI.clone();
    }

    public final int getValue() {
        return this.LL;
    }

    public static EnumC771390UNt valueOf(String str) {
        return (EnumC771390UNt) C08FF.LIZ(EnumC771390UNt.class, str);
    }

    public EnumC771390UNt(String str, int i) {
    }
}
