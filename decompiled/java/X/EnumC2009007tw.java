package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.07tw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class EnumC2009007tw {
    public static final /* synthetic */ EnumC2009007tw[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC2009007tw SINGLE_LINE_HINT;
    public static final EnumC2009007tw TWO_LINE_ALL;
    public static final EnumC2009007tw TWO_LINE_HINT;
    public final int LL;

    public static InterfaceC2044707zh<EnumC2009007tw> getEntries() {
        return LLILLL;
    }

    static {
        EnumC2009007tw enumC2009007tw = new EnumC2009007tw("SINGLE_LINE_HINT", 0, 1);
        SINGLE_LINE_HINT = enumC2009007tw;
        EnumC2009007tw enumC2009007tw2 = new EnumC2009007tw("TWO_LINE_HINT", 1, 2);
        TWO_LINE_HINT = enumC2009007tw2;
        EnumC2009007tw enumC2009007tw3 = new EnumC2009007tw("TWO_LINE_ALL", 2, 3);
        TWO_LINE_ALL = enumC2009007tw3;
        EnumC2009007tw[] enumC2009007twArr = {enumC2009007tw, enumC2009007tw2, enumC2009007tw3};
        LLILLJJLI = enumC2009007twArr;
        LLILLL = new C2254308sP(enumC2009007twArr);
    }

    public static EnumC2009007tw[] values() {
        return (EnumC2009007tw[]) LLILLJJLI.clone();
    }

    public final int getValue() {
        return this.LL;
    }

    public static EnumC2009007tw valueOf(String str) {
        return (EnumC2009007tw) C08FF.LIZ(EnumC2009007tw.class, str);
    }

    public EnumC2009007tw(String str, int i, int i2) {
        this.LL = i2;
    }
}
