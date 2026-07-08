package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.07u5, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class EnumC2009907u5 {
    public static final /* synthetic */ EnumC2009907u5[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC2009907u5 SCENE_CARD;
    public static final EnumC2009907u5 SCENE_FOR_YOU_PAGE;
    public final int LL;

    public static InterfaceC2044707zh<EnumC2009907u5> getEntries() {
        return LLILLL;
    }

    static {
        EnumC2009907u5 enumC2009907u5 = new EnumC2009907u5("SCENE_CARD", 0, 0);
        SCENE_CARD = enumC2009907u5;
        EnumC2009907u5 enumC2009907u52 = new EnumC2009907u5("SCENE_FOR_YOU_PAGE", 1, 1);
        SCENE_FOR_YOU_PAGE = enumC2009907u52;
        EnumC2009907u5[] enumC2009907u5Arr = {enumC2009907u5, enumC2009907u52};
        LLILLJJLI = enumC2009907u5Arr;
        LLILLL = new C2254308sP(enumC2009907u5Arr);
    }

    public static EnumC2009907u5[] values() {
        return (EnumC2009907u5[]) LLILLJJLI.clone();
    }

    public final int getValue() {
        return this.LL;
    }

    public static EnumC2009907u5 valueOf(String str) {
        return (EnumC2009907u5) C08FF.LIZ(EnumC2009907u5.class, str);
    }

    public EnumC2009907u5(String str, int i, int i2) {
        this.LL = i2;
    }
}
