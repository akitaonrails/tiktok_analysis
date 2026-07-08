package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.07qO, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class EnumC1987007qO {
    public static final EnumC1987007qO CAMEO;
    public static final EnumC1987007qO IMAGE;
    public static final /* synthetic */ EnumC1987007qO[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC1987007qO TEXT;
    public static final EnumC1987007qO USER;
    public static final EnumC1987007qO VIDEO;
    public final Integer LL;

    public static InterfaceC2044707zh<EnumC1987007qO> getEntries() {
        return LLILLL;
    }

    static {
        EnumC1987007qO enumC1987007qO = new EnumC1987007qO("TEXT", 0, 1);
        TEXT = enumC1987007qO;
        EnumC1987007qO enumC1987007qO2 = new EnumC1987007qO("IMAGE", 1, 2);
        IMAGE = enumC1987007qO2;
        EnumC1987007qO enumC1987007qO3 = new EnumC1987007qO("VIDEO", 2, 3);
        VIDEO = enumC1987007qO3;
        EnumC1987007qO enumC1987007qO4 = new EnumC1987007qO("USER", 3, 4);
        USER = enumC1987007qO4;
        EnumC1987007qO enumC1987007qO5 = new EnumC1987007qO("CAMEO", 4, 5);
        CAMEO = enumC1987007qO5;
        EnumC1987007qO[] enumC1987007qOArr = {enumC1987007qO, enumC1987007qO2, enumC1987007qO3, enumC1987007qO4, enumC1987007qO5};
        LLILLJJLI = enumC1987007qOArr;
        LLILLL = new C2254308sP(enumC1987007qOArr);
    }

    public static EnumC1987007qO[] values() {
        return (EnumC1987007qO[]) LLILLJJLI.clone();
    }

    public final Integer getType() {
        return this.LL;
    }

    public static EnumC1987007qO valueOf(String str) {
        return (EnumC1987007qO) C08FF.LIZ(EnumC1987007qO.class, str);
    }

    public EnumC1987007qO(String str, int i, Integer num) {
        this.LL = num;
    }
}
