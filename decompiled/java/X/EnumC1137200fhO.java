package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0fhO, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class EnumC1137200fhO {
    public static final EnumC1137200fhO COMB;
    public static final EnumC1137200fhO COMB_FROM_EVENT;
    public static final EnumC1137200fhO ENTRY;
    public static final EnumC1137200fhO EXIT;
    public static final /* synthetic */ EnumC1137200fhO[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC1137200fhO RESHOW;
    public static final EnumC1137200fhO RIGHT_TAG;

    public static InterfaceC2044707zh<EnumC1137200fhO> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC1137200fhO enumC1137200fhO = new EnumC1137200fhO("ENTRY", 0);
        ENTRY = enumC1137200fhO;
        EnumC1137200fhO enumC1137200fhO2 = new EnumC1137200fhO("RIGHT_TAG", 1);
        RIGHT_TAG = enumC1137200fhO2;
        EnumC1137200fhO enumC1137200fhO3 = new EnumC1137200fhO("COMB", 2);
        COMB = enumC1137200fhO3;
        EnumC1137200fhO enumC1137200fhO4 = new EnumC1137200fhO("COMB_FROM_EVENT", 3);
        COMB_FROM_EVENT = enumC1137200fhO4;
        EnumC1137200fhO enumC1137200fhO5 = new EnumC1137200fhO("EXIT", 4);
        EXIT = enumC1137200fhO5;
        EnumC1137200fhO enumC1137200fhO6 = new EnumC1137200fhO("RESHOW", 5);
        RESHOW = enumC1137200fhO6;
        EnumC1137200fhO[] enumC1137200fhOArr = {enumC1137200fhO, enumC1137200fhO2, enumC1137200fhO3, enumC1137200fhO4, enumC1137200fhO5, enumC1137200fhO6};
        LL = enumC1137200fhOArr;
        LLILLJJLI = new C2254308sP(enumC1137200fhOArr);
    }

    public static EnumC1137200fhO[] values() {
        return (EnumC1137200fhO[]) LL.clone();
    }

    public static EnumC1137200fhO valueOf(String str) {
        return (EnumC1137200fhO) C08FF.LIZ(EnumC1137200fhO.class, str);
    }

    public EnumC1137200fhO(String str, int i) {
    }
}
