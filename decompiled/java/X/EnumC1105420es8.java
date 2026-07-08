package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0es8, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class EnumC1105420es8 {
    public static final EnumC1105420es8 COUNTCHANGE;
    public static final EnumC1105420es8 HIDE;
    public static final /* synthetic */ EnumC1105420es8[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC1105420es8 SHOW;
    public static final EnumC1105420es8 TURNTOHIDE;
    public static final EnumC1105420es8 TURNTOSHOW;
    public static final EnumC1105420es8 UNKNOWN;
    public final int LL;

    public static InterfaceC2044707zh<EnumC1105420es8> getEntries() {
        return LLILLL;
    }

    static {
        EnumC1105420es8 enumC1105420es8 = new EnumC1105420es8("UNKNOWN", 0, -1);
        UNKNOWN = enumC1105420es8;
        EnumC1105420es8 enumC1105420es82 = new EnumC1105420es8("SHOW", 1, 1);
        SHOW = enumC1105420es82;
        EnumC1105420es8 enumC1105420es83 = new EnumC1105420es8("HIDE", 2, 2);
        HIDE = enumC1105420es83;
        EnumC1105420es8 enumC1105420es84 = new EnumC1105420es8("TURNTOSHOW", 3, 3);
        TURNTOSHOW = enumC1105420es84;
        EnumC1105420es8 enumC1105420es85 = new EnumC1105420es8("TURNTOHIDE", 4, 4);
        TURNTOHIDE = enumC1105420es85;
        EnumC1105420es8 enumC1105420es86 = new EnumC1105420es8("COUNTCHANGE", 5, 5);
        COUNTCHANGE = enumC1105420es86;
        EnumC1105420es8[] enumC1105420es8Arr = {enumC1105420es8, enumC1105420es82, enumC1105420es83, enumC1105420es84, enumC1105420es85, enumC1105420es86};
        LLILLJJLI = enumC1105420es8Arr;
        LLILLL = new C2254308sP(enumC1105420es8Arr);
    }

    public static EnumC1105420es8[] values() {
        return (EnumC1105420es8[]) LLILLJJLI.clone();
    }

    public final int getType() {
        return this.LL;
    }

    public static EnumC1105420es8 valueOf(String str) {
        return (EnumC1105420es8) C08FF.LIZ(EnumC1105420es8.class, str);
    }

    public EnumC1105420es8(String str, int i, int i2) {
        this.LL = i2;
    }
}
