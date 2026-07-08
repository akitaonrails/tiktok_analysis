package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.07uS, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class EnumC2012207uS {
    public static final EnumC2012207uS BUTTON;
    public static final /* synthetic */ EnumC2012207uS[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC2012207uS TEXT;
    public final int LL;

    public static InterfaceC2044707zh<EnumC2012207uS> getEntries() {
        return LLILLL;
    }

    static {
        EnumC2012207uS enumC2012207uS = new EnumC2012207uS("BUTTON", 0, 1);
        BUTTON = enumC2012207uS;
        EnumC2012207uS enumC2012207uS2 = new EnumC2012207uS("TEXT", 1, 2);
        TEXT = enumC2012207uS2;
        EnumC2012207uS[] enumC2012207uSArr = {enumC2012207uS, enumC2012207uS2};
        LLILLJJLI = enumC2012207uSArr;
        LLILLL = new C2254308sP(enumC2012207uSArr);
    }

    public static EnumC2012207uS[] values() {
        return (EnumC2012207uS[]) LLILLJJLI.clone();
    }

    public final int getValue() {
        return this.LL;
    }

    public static EnumC2012207uS valueOf(String str) {
        return (EnumC2012207uS) C08FF.LIZ(EnumC2012207uS.class, str);
    }

    public EnumC2012207uS(String str, int i, int i2) {
        this.LL = i2;
    }
}
