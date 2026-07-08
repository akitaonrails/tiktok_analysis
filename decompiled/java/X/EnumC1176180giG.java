package X;

import java.io.Serializable;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0giG, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class EnumC1176180giG implements Serializable {
    public static final EnumC1176180giG EMPTY;
    public static final EnumC1176180giG FAR_FROM_HOTEL;
    public static final /* synthetic */ EnumC1176180giG[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC1176180giG NO_INTERNET;
    public static final EnumC1176180giG SOMETHING_WRONG;

    public static InterfaceC2044707zh<EnumC1176180giG> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC1176180giG enumC1176180giG = new EnumC1176180giG("NO_INTERNET", 0);
        NO_INTERNET = enumC1176180giG;
        EnumC1176180giG enumC1176180giG2 = new EnumC1176180giG("SOMETHING_WRONG", 1);
        SOMETHING_WRONG = enumC1176180giG2;
        EnumC1176180giG enumC1176180giG3 = new EnumC1176180giG("EMPTY", 2);
        EMPTY = enumC1176180giG3;
        EnumC1176180giG enumC1176180giG4 = new EnumC1176180giG("FAR_FROM_HOTEL", 3);
        FAR_FROM_HOTEL = enumC1176180giG4;
        EnumC1176180giG[] enumC1176180giGArr = {enumC1176180giG, enumC1176180giG2, enumC1176180giG3, enumC1176180giG4};
        LL = enumC1176180giGArr;
        LLILLJJLI = new C2254308sP(enumC1176180giGArr);
    }

    public static EnumC1176180giG[] values() {
        return (EnumC1176180giG[]) LL.clone();
    }

    public static EnumC1176180giG valueOf(String str) {
        return (EnumC1176180giG) C08FF.LIZ(EnumC1176180giG.class, str);
    }

    public EnumC1176180giG(String str, int i) {
    }
}
