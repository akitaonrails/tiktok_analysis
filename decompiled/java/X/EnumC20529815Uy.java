package X;

import java.io.Serializable;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.15Uy, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public final class EnumC20529815Uy implements Serializable {
    public static final C20529915Uz Companion;
    public static final EnumC20529815Uy EXPLORE_INSERT_CARD_STATUS_TYPE_FAIL;
    public static final EnumC20529815Uy EXPLORE_INSERT_CARD_STATUS_TYPE_SUCCESS;
    public static final /* synthetic */ EnumC20529815Uy[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public final int LL;

    public static final EnumC20529815Uy fromValue(Integer num) {
        Companion.getClass();
        return C20529915Uz.LIZ(num);
    }

    public static InterfaceC2044707zh<EnumC20529815Uy> getEntries() {
        return LLILLL;
    }

    static {
        EnumC20529815Uy enumC20529815Uy = new EnumC20529815Uy("EXPLORE_INSERT_CARD_STATUS_TYPE_SUCCESS", 0, 0);
        EXPLORE_INSERT_CARD_STATUS_TYPE_SUCCESS = enumC20529815Uy;
        EnumC20529815Uy enumC20529815Uy2 = new EnumC20529815Uy("EXPLORE_INSERT_CARD_STATUS_TYPE_FAIL", 1, 1);
        EXPLORE_INSERT_CARD_STATUS_TYPE_FAIL = enumC20529815Uy2;
        EnumC20529815Uy[] enumC20529815UyArr = {enumC20529815Uy, enumC20529815Uy2};
        LLILLJJLI = enumC20529815UyArr;
        LLILLL = new C2254308sP(enumC20529815UyArr);
        Companion = new C20529915Uz();
    }

    public static EnumC20529815Uy[] values() {
        return (EnumC20529815Uy[]) LLILLJJLI.clone();
    }

    public final int getValue() {
        return this.LL;
    }

    public static EnumC20529815Uy valueOf(String str) {
        return (EnumC20529815Uy) C08FF.LIZ(EnumC20529815Uy.class, str);
    }

    public EnumC20529815Uy(String str, int i, int i2) {
        this.LL = i2;
    }
}
