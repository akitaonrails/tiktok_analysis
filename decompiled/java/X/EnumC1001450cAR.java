package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0cAR, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class EnumC1001450cAR {
    public static final EnumC1001450cAR DIRECT_DISCARD;
    public static final EnumC1001450cAR DISCARD_AND_STOP_STYLE_SHOW;
    public static final EnumC1001450cAR FORCE_RUN;
    public static final /* synthetic */ EnumC1001450cAR[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;

    public static InterfaceC2044707zh<EnumC1001450cAR> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC1001450cAR enumC1001450cAR = new EnumC1001450cAR("DIRECT_DISCARD", 0);
        DIRECT_DISCARD = enumC1001450cAR;
        EnumC1001450cAR enumC1001450cAR2 = new EnumC1001450cAR("FORCE_RUN", 1);
        FORCE_RUN = enumC1001450cAR2;
        EnumC1001450cAR enumC1001450cAR3 = new EnumC1001450cAR("DISCARD_AND_STOP_STYLE_SHOW", 2);
        DISCARD_AND_STOP_STYLE_SHOW = enumC1001450cAR3;
        EnumC1001450cAR[] enumC1001450cARArr = {enumC1001450cAR, enumC1001450cAR2, enumC1001450cAR3};
        LL = enumC1001450cARArr;
        LLILLJJLI = new C2254308sP(enumC1001450cARArr);
    }

    public static EnumC1001450cAR[] values() {
        return (EnumC1001450cAR[]) LL.clone();
    }

    public static EnumC1001450cAR valueOf(String str) {
        return (EnumC1001450cAR) C08FF.LIZ(EnumC1001450cAR.class, str);
    }

    public EnumC1001450cAR(String str, int i) {
    }
}
