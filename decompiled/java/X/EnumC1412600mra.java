package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0mra, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class EnumC1412600mra {
    public static final EnumC1412600mra EFFECT_MUSIC_TEMPLATE;
    public static final EnumC1412600mra EFFECT_TEMPLATE;
    public static final /* synthetic */ EnumC1412600mra[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC1412600mra SLIDESHOW_TEMPLATE;
    public static final EnumC1412600mra SOUND_SYNC_TEMPLATE;

    @C040H
    public final int LL;

    public static InterfaceC2044707zh<EnumC1412600mra> getEntries() {
        return LLILLL;
    }

    static {
        EnumC1412600mra enumC1412600mra = new EnumC1412600mra("SOUND_SYNC_TEMPLATE", 0, 7);
        SOUND_SYNC_TEMPLATE = enumC1412600mra;
        EnumC1412600mra enumC1412600mra2 = new EnumC1412600mra("EFFECT_TEMPLATE", 1, 12);
        EFFECT_TEMPLATE = enumC1412600mra2;
        EnumC1412600mra enumC1412600mra3 = new EnumC1412600mra("EFFECT_MUSIC_TEMPLATE", 2, 13);
        EFFECT_MUSIC_TEMPLATE = enumC1412600mra3;
        EnumC1412600mra enumC1412600mra4 = new EnumC1412600mra("SLIDESHOW_TEMPLATE", 3, 10);
        SLIDESHOW_TEMPLATE = enumC1412600mra4;
        EnumC1412600mra[] enumC1412600mraArr = {enumC1412600mra, enumC1412600mra2, enumC1412600mra3, enumC1412600mra4};
        LLILLJJLI = enumC1412600mraArr;
        LLILLL = new C2254308sP(enumC1412600mraArr);
    }

    public static EnumC1412600mra[] values() {
        return (EnumC1412600mra[]) LLILLJJLI.clone();
    }

    public final int getValue() {
        return this.LL;
    }

    public static EnumC1412600mra valueOf(String str) {
        return (EnumC1412600mra) C08FF.LIZ(EnumC1412600mra.class, str);
    }

    public EnumC1412600mra(String str, int i, int i2) {
        this.LL = i2;
    }
}
