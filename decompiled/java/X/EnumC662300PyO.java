package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0PyO, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class EnumC662300PyO {
    public static final EnumC662300PyO COVER;
    public static final EnumC662300PyO IMAGE_LIST;
    public static final /* synthetic */ EnumC662300PyO[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC662300PyO OUTFLOW;

    public static InterfaceC2044707zh<EnumC662300PyO> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC662300PyO enumC662300PyO = new EnumC662300PyO("OUTFLOW", 0);
        OUTFLOW = enumC662300PyO;
        EnumC662300PyO enumC662300PyO2 = new EnumC662300PyO("COVER", 1);
        COVER = enumC662300PyO2;
        EnumC662300PyO enumC662300PyO3 = new EnumC662300PyO("IMAGE_LIST", 2);
        IMAGE_LIST = enumC662300PyO3;
        EnumC662300PyO[] enumC662300PyOArr = {enumC662300PyO, enumC662300PyO2, enumC662300PyO3};
        LL = enumC662300PyOArr;
        LLILLJJLI = new C2254308sP(enumC662300PyOArr);
    }

    public static EnumC662300PyO[] values() {
        return (EnumC662300PyO[]) LL.clone();
    }

    public static EnumC662300PyO valueOf(String str) {
        return (EnumC662300PyO) C08FF.LIZ(EnumC662300PyO.class, str);
    }

    public EnumC662300PyO(String str, int i) {
    }
}
