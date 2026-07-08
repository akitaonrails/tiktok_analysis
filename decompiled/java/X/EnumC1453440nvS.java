package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0nvS, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class EnumC1453440nvS {
    public static final C1453660nvo Companion;
    public static final /* synthetic */ EnumC1453440nvS[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC1453440nvS TYPE1;
    public static final EnumC1453440nvS TYPE2;
    public static final EnumC1453440nvS TYPE3;
    public static final EnumC1453440nvS TYPE8;
    public final int LL;

    public static InterfaceC2044707zh<EnumC1453440nvS> getEntries() {
        return LLILLL;
    }

    /* JADX WARN: Type inference failed for: r0v6, types: [X.0nvo] */
    static {
        EnumC1453440nvS enumC1453440nvS = new EnumC1453440nvS("TYPE1", 0, 1);
        TYPE1 = enumC1453440nvS;
        EnumC1453440nvS enumC1453440nvS2 = new EnumC1453440nvS("TYPE2", 1, 2);
        TYPE2 = enumC1453440nvS2;
        EnumC1453440nvS enumC1453440nvS3 = new EnumC1453440nvS("TYPE3", 2, 3);
        TYPE3 = enumC1453440nvS3;
        EnumC1453440nvS enumC1453440nvS4 = new EnumC1453440nvS("TYPE8", 3, 8);
        TYPE8 = enumC1453440nvS4;
        EnumC1453440nvS[] enumC1453440nvSArr = {enumC1453440nvS, enumC1453440nvS2, enumC1453440nvS3, enumC1453440nvS4};
        LLILLJJLI = enumC1453440nvSArr;
        LLILLL = new C2254308sP(enumC1453440nvSArr);
        Companion = new Object() { // from class: X.0nvo
        };
    }

    public static EnumC1453440nvS[] values() {
        return (EnumC1453440nvS[]) LLILLJJLI.clone();
    }

    public final int getValue() {
        return this.LL;
    }

    public static EnumC1453440nvS valueOf(String str) {
        return (EnumC1453440nvS) C08FF.LIZ(EnumC1453440nvS.class, str);
    }

    public EnumC1453440nvS(String str, int i, int i2) {
        this.LL = i2;
    }
}
