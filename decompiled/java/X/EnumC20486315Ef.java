package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.15Ef, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public final class EnumC20486315Ef {
    public static final EnumC20486315Ef LL;
    public static final EnumC20486315Ef LLILLJJLI;
    public static final EnumC20486315Ef LLILLL;
    public static final EnumC20486315Ef LLILZ;
    public static final EnumC20486315Ef LLILZIL;
    public static final /* synthetic */ EnumC20486315Ef[] LLILZLL;

    static {
        EnumC20486315Ef enumC20486315Ef = new EnumC20486315Ef("IDLE", 0);
        LL = enumC20486315Ef;
        EnumC20486315Ef enumC20486315Ef2 = new EnumC20486315Ef("PLAYING_QUEUE", 1);
        LLILLJJLI = enumC20486315Ef2;
        EnumC20486315Ef enumC20486315Ef3 = new EnumC20486315Ef("QUEUE_COMPLETED", 2);
        LLILLL = enumC20486315Ef3;
        EnumC20486315Ef enumC20486315Ef4 = new EnumC20486315Ef("INVALIDATED", 3);
        LLILZ = enumC20486315Ef4;
        EnumC20486315Ef enumC20486315Ef5 = new EnumC20486315Ef("PUNISH_COUNTDOWN_RELEASED", 4);
        LLILZIL = enumC20486315Ef5;
        EnumC20486315Ef[] enumC20486315EfArr = {enumC20486315Ef, enumC20486315Ef2, enumC20486315Ef3, enumC20486315Ef4, enumC20486315Ef5};
        LLILZLL = enumC20486315EfArr;
        new C2254308sP(enumC20486315EfArr);
    }

    public static EnumC20486315Ef[] values() {
        return (EnumC20486315Ef[]) LLILZLL.clone();
    }

    public static EnumC20486315Ef valueOf(String str) {
        return (EnumC20486315Ef) C08FF.LIZ(EnumC20486315Ef.class, str);
    }

    public EnumC20486315Ef(String str, int i) {
    }
}
