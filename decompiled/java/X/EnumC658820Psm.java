package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0Psm, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class EnumC658820Psm {
    public static final EnumC658820Psm COPYRIGHT_MUTE;
    public static final /* synthetic */ EnumC658820Psm[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC658820Psm NOTING;
    public static final EnumC658820Psm SOUND_OFF;
    public static final EnumC658820Psm SOUND_ON;

    public static InterfaceC2044707zh<EnumC658820Psm> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC658820Psm enumC658820Psm = new EnumC658820Psm("SOUND_OFF", 0);
        SOUND_OFF = enumC658820Psm;
        EnumC658820Psm enumC658820Psm2 = new EnumC658820Psm("SOUND_ON", 1);
        SOUND_ON = enumC658820Psm2;
        EnumC658820Psm enumC658820Psm3 = new EnumC658820Psm("COPYRIGHT_MUTE", 2);
        COPYRIGHT_MUTE = enumC658820Psm3;
        EnumC658820Psm enumC658820Psm4 = new EnumC658820Psm("NOTING", 3);
        NOTING = enumC658820Psm4;
        EnumC658820Psm[] enumC658820PsmArr = {enumC658820Psm, enumC658820Psm2, enumC658820Psm3, enumC658820Psm4};
        LL = enumC658820PsmArr;
        LLILLJJLI = new C2254308sP(enumC658820PsmArr);
    }

    public static EnumC658820Psm[] values() {
        return (EnumC658820Psm[]) LL.clone();
    }

    public static EnumC658820Psm valueOf(String str) {
        return (EnumC658820Psm) C08FF.LIZ(EnumC658820Psm.class, str);
    }

    public EnumC658820Psm(String str, int i) {
    }
}
