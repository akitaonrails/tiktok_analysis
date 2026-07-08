package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0lcB, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class EnumC1364610lcB {
    public static final EnumC1364610lcB EMOJI;
    public static final EnumC1364610lcB EMPTY;
    public static final /* synthetic */ EnumC1364610lcB[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC1364610lcB TEXT;
    public static final EnumC1364610lcB TEXT_EMOJI;
    public final String LL;

    public static InterfaceC2044707zh<EnumC1364610lcB> getEntries() {
        return LLILLL;
    }

    static {
        EnumC1364610lcB enumC1364610lcB = new EnumC1364610lcB("TEXT", 0, "text");
        TEXT = enumC1364610lcB;
        EnumC1364610lcB enumC1364610lcB2 = new EnumC1364610lcB("TEXT_EMOJI", 1, "text_emoji");
        TEXT_EMOJI = enumC1364610lcB2;
        EnumC1364610lcB enumC1364610lcB3 = new EnumC1364610lcB("EMOJI", 2, "emoji");
        EMOJI = enumC1364610lcB3;
        EnumC1364610lcB enumC1364610lcB4 = new EnumC1364610lcB("EMPTY", 3, "");
        EMPTY = enumC1364610lcB4;
        EnumC1364610lcB[] enumC1364610lcBArr = {enumC1364610lcB, enumC1364610lcB2, enumC1364610lcB3, enumC1364610lcB4};
        LLILLJJLI = enumC1364610lcBArr;
        LLILLL = new C2254308sP(enumC1364610lcBArr);
    }

    public static EnumC1364610lcB[] values() {
        return (EnumC1364610lcB[]) LLILLJJLI.clone();
    }

    public final String getValue() {
        return this.LL;
    }

    public static EnumC1364610lcB valueOf(String str) {
        return (EnumC1364610lcB) C08FF.LIZ(EnumC1364610lcB.class, str);
    }

    public EnumC1364610lcB(String str, int i, String str2) {
        this.LL = str2;
    }
}
