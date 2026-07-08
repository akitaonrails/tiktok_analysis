package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.1AsQ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class EnumC2193121AsQ {
    public static final EnumC2193121AsQ CLICK;
    public static final EnumC2193121AsQ CLOSE;
    public static final EnumC2193121AsQ DISLIKE;
    public static final EnumC2193121AsQ FLAG;
    public static final /* synthetic */ EnumC2193121AsQ[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC2193121AsQ PUBLISH;
    public static final EnumC2193121AsQ SHOW;
    public final int LL;

    public static InterfaceC2044707zh<EnumC2193121AsQ> getEntries() {
        return LLILLL;
    }

    static {
        EnumC2193121AsQ enumC2193121AsQ = new EnumC2193121AsQ("SHOW", 0, 1);
        SHOW = enumC2193121AsQ;
        EnumC2193121AsQ enumC2193121AsQ2 = new EnumC2193121AsQ("CLICK", 1, 2);
        CLICK = enumC2193121AsQ2;
        EnumC2193121AsQ enumC2193121AsQ3 = new EnumC2193121AsQ("CLOSE", 2, 3);
        CLOSE = enumC2193121AsQ3;
        EnumC2193121AsQ enumC2193121AsQ4 = new EnumC2193121AsQ("PUBLISH", 3, 4);
        PUBLISH = enumC2193121AsQ4;
        EnumC2193121AsQ enumC2193121AsQ5 = new EnumC2193121AsQ("FLAG", 4, 5);
        FLAG = enumC2193121AsQ5;
        EnumC2193121AsQ enumC2193121AsQ6 = new EnumC2193121AsQ("DISLIKE", 5, 6);
        DISLIKE = enumC2193121AsQ6;
        EnumC2193121AsQ[] enumC2193121AsQArr = {enumC2193121AsQ, enumC2193121AsQ2, enumC2193121AsQ3, enumC2193121AsQ4, enumC2193121AsQ5, enumC2193121AsQ6};
        LLILLJJLI = enumC2193121AsQArr;
        LLILLL = new C2254308sP(enumC2193121AsQArr);
    }

    public static EnumC2193121AsQ[] values() {
        return (EnumC2193121AsQ[]) LLILLJJLI.clone();
    }

    public final int getValue() {
        return this.LL;
    }

    public static EnumC2193121AsQ valueOf(String str) {
        return (EnumC2193121AsQ) C08FF.LIZ(EnumC2193121AsQ.class, str);
    }

    public EnumC2193121AsQ(String str, int i, int i2) {
        this.LL = i2;
    }
}
