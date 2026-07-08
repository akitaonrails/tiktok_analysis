package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0iiC, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class EnumC1253020iiC {
    public static final EnumC1253020iiC LL;
    public static final EnumC1253020iiC LLILLJJLI;
    public static final EnumC1253020iiC LLILLL;
    public static final /* synthetic */ EnumC1253020iiC[] LLILZ;

    static {
        EnumC1253020iiC enumC1253020iiC = new EnumC1253020iiC("COMMON_DATA", 0);
        LL = enumC1253020iiC;
        EnumC1253020iiC enumC1253020iiC2 = new EnumC1253020iiC("PAGE_SELECTED", 1);
        LLILLJJLI = enumC1253020iiC2;
        EnumC1253020iiC enumC1253020iiC3 = new EnumC1253020iiC("TAB_UPDATE", 2);
        LLILLL = enumC1253020iiC3;
        EnumC1253020iiC[] enumC1253020iiCArr = {enumC1253020iiC, enumC1253020iiC2, enumC1253020iiC3};
        LLILZ = enumC1253020iiCArr;
        new C2254308sP(enumC1253020iiCArr);
    }

    public static EnumC1253020iiC[] values() {
        return (EnumC1253020iiC[]) LLILZ.clone();
    }

    public static EnumC1253020iiC valueOf(String str) {
        return (EnumC1253020iiC) C08FF.LIZ(EnumC1253020iiC.class, str);
    }

    public EnumC1253020iiC(String str, int i) {
    }
}
