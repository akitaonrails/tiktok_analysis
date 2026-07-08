package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0zom, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class EnumC1910580zom {
    public static final EnumC1910580zom EFFECT;
    public static final EnumC1910580zom LIVE;
    public static final /* synthetic */ EnumC1910580zom[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC1910580zom PROFILE;
    public static final EnumC1910580zom STORY;
    public static final EnumC1910580zom VIDEO;
    public final int LL;

    public static InterfaceC2044707zh<EnumC1910580zom> getEntries() {
        return LLILLL;
    }

    static {
        EnumC1910580zom enumC1910580zom = new EnumC1910580zom("VIDEO", 0, 1);
        VIDEO = enumC1910580zom;
        EnumC1910580zom enumC1910580zom2 = new EnumC1910580zom("LIVE", 1, 2);
        LIVE = enumC1910580zom2;
        EnumC1910580zom enumC1910580zom3 = new EnumC1910580zom("PROFILE", 2, 3);
        PROFILE = enumC1910580zom3;
        EnumC1910580zom enumC1910580zom4 = new EnumC1910580zom("EFFECT", 3, 4);
        EFFECT = enumC1910580zom4;
        EnumC1910580zom enumC1910580zom5 = new EnumC1910580zom("STORY", 4, 5);
        STORY = enumC1910580zom5;
        EnumC1910580zom[] enumC1910580zomArr = {enumC1910580zom, enumC1910580zom2, enumC1910580zom3, enumC1910580zom4, enumC1910580zom5};
        LLILLJJLI = enumC1910580zomArr;
        LLILLL = new C2254308sP(enumC1910580zomArr);
    }

    public static EnumC1910580zom[] values() {
        return (EnumC1910580zom[]) LLILLJJLI.clone();
    }

    public final int getValue() {
        return this.LL;
    }

    public static EnumC1910580zom valueOf(String str) {
        return (EnumC1910580zom) C08FF.LIZ(EnumC1910580zom.class, str);
    }

    public EnumC1910580zom(String str, int i, int i2) {
        this.LL = i2;
    }
}
