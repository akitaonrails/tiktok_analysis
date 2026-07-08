package X;

import java.io.Serializable;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0glA, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class EnumC1177980glA implements Serializable {
    public static final EnumC1177980glA BEAUTY;
    public static final C1178000glC Companion;
    public static final EnumC1177980glA FOOD_AND_DRINK;
    public static final EnumC1177980glA HOTEL;
    public static final EnumC1177980glA LEISURE;
    public static final /* synthetic */ EnumC1177980glA[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC1177980glA OTHERS;
    public static final EnumC1177980glA TRAVEL;
    public final String LL;

    public static InterfaceC2044707zh<EnumC1177980glA> getEntries() {
        return LLILLL;
    }

    static {
        EnumC1177980glA enumC1177980glA = new EnumC1177980glA("FOOD_AND_DRINK", 0, "Food and Drink");
        FOOD_AND_DRINK = enumC1177980glA;
        EnumC1177980glA enumC1177980glA2 = new EnumC1177980glA("TRAVEL", 1, "Travel");
        TRAVEL = enumC1177980glA2;
        EnumC1177980glA enumC1177980glA3 = new EnumC1177980glA("LEISURE", 2, "Leisure");
        LEISURE = enumC1177980glA3;
        EnumC1177980glA enumC1177980glA4 = new EnumC1177980glA("BEAUTY", 3, "Beauty");
        BEAUTY = enumC1177980glA4;
        EnumC1177980glA enumC1177980glA5 = new EnumC1177980glA("HOTEL", 4, "Hotel");
        HOTEL = enumC1177980glA5;
        EnumC1177980glA enumC1177980glA6 = new EnumC1177980glA("OTHERS", 5, "Others");
        OTHERS = enumC1177980glA6;
        EnumC1177980glA[] enumC1177980glAArr = {enumC1177980glA, enumC1177980glA2, enumC1177980glA3, enumC1177980glA4, enumC1177980glA5, enumC1177980glA6};
        LLILLJJLI = enumC1177980glAArr;
        LLILLL = new C2254308sP(enumC1177980glAArr);
        Companion = new C1178000glC();
    }

    public static EnumC1177980glA[] values() {
        return (EnumC1177980glA[]) LLILLJJLI.clone();
    }

    public final String getCategory() {
        return this.LL;
    }

    public static EnumC1177980glA valueOf(String str) {
        return (EnumC1177980glA) C08FF.LIZ(EnumC1177980glA.class, str);
    }

    public EnumC1177980glA(String str, int i, String str2) {
        this.LL = str2;
    }
}
