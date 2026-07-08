package X;

import java.io.Serializable;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0gEA, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class EnumC1157520gEA implements Serializable {
    public static final EnumC1157520gEA GUIDE_SWITCH;
    public static final /* synthetic */ EnumC1157520gEA[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC1157520gEA MANUAL_SETTING_PAGE;

    public static InterfaceC2044707zh<EnumC1157520gEA> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC1157520gEA enumC1157520gEA = new EnumC1157520gEA("GUIDE_SWITCH", 0);
        GUIDE_SWITCH = enumC1157520gEA;
        EnumC1157520gEA enumC1157520gEA2 = new EnumC1157520gEA("MANUAL_SETTING_PAGE", 1);
        MANUAL_SETTING_PAGE = enumC1157520gEA2;
        EnumC1157520gEA[] enumC1157520gEAArr = {enumC1157520gEA, enumC1157520gEA2};
        LL = enumC1157520gEAArr;
        LLILLJJLI = new C2254308sP(enumC1157520gEAArr);
    }

    public static EnumC1157520gEA[] values() {
        return (EnumC1157520gEA[]) LL.clone();
    }

    public static EnumC1157520gEA valueOf(String str) {
        return (EnumC1157520gEA) C08FF.LIZ(EnumC1157520gEA.class, str);
    }

    public EnumC1157520gEA(String str, int i) {
    }
}
