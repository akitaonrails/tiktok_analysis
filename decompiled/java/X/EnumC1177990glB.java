package X;

import java.io.Serializable;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0glB, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class EnumC1177990glB implements Serializable {
    public static final EnumC1177990glB BEAUTY;
    public static final EnumC1177990glB FOOD_AND_DRINK;
    public static final EnumC1177990glB HOTEL;
    public static final EnumC1177990glB LEISURE;
    public static final /* synthetic */ EnumC1177990glB[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC1177990glB TRAVEL;
    public final String LL;

    public static InterfaceC2044707zh<EnumC1177990glB> getEntries() {
        return LLILLL;
    }

    static {
        EnumC1177990glB enumC1177990glB = new EnumC1177990glB("FOOD_AND_DRINK", 0, "Food and Drink");
        FOOD_AND_DRINK = enumC1177990glB;
        EnumC1177990glB enumC1177990glB2 = new EnumC1177990glB("TRAVEL", 1, "Travel");
        TRAVEL = enumC1177990glB2;
        EnumC1177990glB enumC1177990glB3 = new EnumC1177990glB("LEISURE", 2, "Leisure");
        LEISURE = enumC1177990glB3;
        EnumC1177990glB enumC1177990glB4 = new EnumC1177990glB("BEAUTY", 3, "Beauty");
        BEAUTY = enumC1177990glB4;
        EnumC1177990glB enumC1177990glB5 = new EnumC1177990glB("HOTEL", 4, "Hotel");
        HOTEL = enumC1177990glB5;
        EnumC1177990glB[] enumC1177990glBArr = {enumC1177990glB, enumC1177990glB2, enumC1177990glB3, enumC1177990glB4, enumC1177990glB5};
        LLILLJJLI = enumC1177990glBArr;
        LLILLL = new C2254308sP(enumC1177990glBArr);
    }

    public static EnumC1177990glB[] values() {
        return (EnumC1177990glB[]) LLILLJJLI.clone();
    }

    public final String getCategory() {
        return this.LL;
    }

    public static EnumC1177990glB valueOf(String str) {
        return (EnumC1177990glB) C08FF.LIZ(EnumC1177990glB.class, str);
    }

    public EnumC1177990glB(String str, int i, String str2) {
        this.LL = str2;
    }
}
