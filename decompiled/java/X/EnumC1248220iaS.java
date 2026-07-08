package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0iaS, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class EnumC1248220iaS {
    public static final EnumC1248220iaS BOTH;
    public static final /* synthetic */ EnumC1248220iaS[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC1248220iaS OTHER;
    public static final EnumC1248220iaS SELF;

    public static InterfaceC2044707zh<EnumC1248220iaS> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC1248220iaS enumC1248220iaS = new EnumC1248220iaS("SELF", 0);
        SELF = enumC1248220iaS;
        EnumC1248220iaS enumC1248220iaS2 = new EnumC1248220iaS("OTHER", 1);
        OTHER = enumC1248220iaS2;
        EnumC1248220iaS enumC1248220iaS3 = new EnumC1248220iaS("BOTH", 2);
        BOTH = enumC1248220iaS3;
        EnumC1248220iaS[] enumC1248220iaSArr = {enumC1248220iaS, enumC1248220iaS2, enumC1248220iaS3};
        LL = enumC1248220iaSArr;
        LLILLJJLI = new C2254308sP(enumC1248220iaSArr);
    }

    public static EnumC1248220iaS[] values() {
        return (EnumC1248220iaS[]) LL.clone();
    }

    public static EnumC1248220iaS valueOf(String str) {
        return (EnumC1248220iaS) C08FF.LIZ(EnumC1248220iaS.class, str);
    }

    public EnumC1248220iaS(String str, int i) {
    }
}
