package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0MzO, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class EnumC586480MzO {
    public static final EnumC586480MzO ACTION_CARD;
    public static final /* synthetic */ EnumC586480MzO[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC586480MzO NOTICE_MESSAGE;
    public static final EnumC586480MzO RICH_BLOCK;
    public static final EnumC586480MzO UNKNOWN;
    public static final EnumC586480MzO VIDEO;
    public final int LL;

    public static InterfaceC2044707zh<EnumC586480MzO> getEntries() {
        return LLILLL;
    }

    static {
        EnumC586480MzO enumC586480MzO = new EnumC586480MzO("UNKNOWN", 0, 0);
        UNKNOWN = enumC586480MzO;
        EnumC586480MzO enumC586480MzO2 = new EnumC586480MzO("RICH_BLOCK", 1, 1);
        RICH_BLOCK = enumC586480MzO2;
        EnumC586480MzO enumC586480MzO3 = new EnumC586480MzO("VIDEO", 2, 2);
        VIDEO = enumC586480MzO3;
        EnumC586480MzO enumC586480MzO4 = new EnumC586480MzO("NOTICE_MESSAGE", 3, 3);
        NOTICE_MESSAGE = enumC586480MzO4;
        EnumC586480MzO enumC586480MzO5 = new EnumC586480MzO("ACTION_CARD", 4, 4);
        ACTION_CARD = enumC586480MzO5;
        EnumC586480MzO[] enumC586480MzOArr = {enumC586480MzO, enumC586480MzO2, enumC586480MzO3, enumC586480MzO4, enumC586480MzO5};
        LLILLJJLI = enumC586480MzOArr;
        LLILLL = new C2254308sP(enumC586480MzOArr);
    }

    public static EnumC586480MzO[] values() {
        return (EnumC586480MzO[]) LLILLJJLI.clone();
    }

    public final int getValue() {
        return this.LL;
    }

    public static EnumC586480MzO valueOf(String str) {
        return (EnumC586480MzO) C08FF.LIZ(EnumC586480MzO.class, str);
    }

    public EnumC586480MzO(String str, int i, int i2) {
        this.LL = i2;
    }
}
