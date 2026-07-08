package X;

/* JADX INFO: renamed from: X.0dJu, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1045760dJu {
    public final EnumC1046030dKL LIZ;
    public final EnumC1046030dKL LIZIZ;
    public final boolean LIZJ;
    public final EnumC1045420dJM LIZLLL;
    public final EnumC1045410dJL LJ;

    public C1045760dJu(EnumC1045420dJM enumC1045420dJM, EnumC1045410dJL enumC1045410dJL, EnumC1046030dKL enumC1046030dKL, EnumC1046030dKL enumC1046030dKL2) {
        this.LIZLLL = enumC1045420dJM;
        this.LJ = enumC1045410dJL;
        this.LIZ = enumC1046030dKL;
        if (enumC1046030dKL2 == null) {
            this.LIZIZ = EnumC1046030dKL.NONE;
        } else {
            this.LIZIZ = enumC1046030dKL2;
        }
        this.LIZJ = false;
    }

    public static C1045760dJu LIZ(EnumC1045420dJM enumC1045420dJM, EnumC1045410dJL enumC1045410dJL, EnumC1046030dKL enumC1046030dKL, EnumC1046030dKL enumC1046030dKL2) {
        C1045780dJw.LIZ(enumC1045420dJM, "CreativeType is null");
        C1045780dJw.LIZ(enumC1045410dJL, "ImpressionType is null");
        C1045780dJw.LIZ(enumC1046030dKL, "Impression owner is null");
        if (enumC1046030dKL != EnumC1046030dKL.NONE) {
            if (enumC1045420dJM == EnumC1045420dJM.DEFINED_BY_JAVASCRIPT && enumC1046030dKL == EnumC1046030dKL.NATIVE) {
                throw new IllegalArgumentException("ImpressionType/CreativeType can only be defined as DEFINED_BY_JAVASCRIPT if Impression Owner is JavaScript");
            }
            if (enumC1045410dJL == EnumC1045410dJL.DEFINED_BY_JAVASCRIPT && enumC1046030dKL == EnumC1046030dKL.NATIVE) {
                throw new IllegalArgumentException("ImpressionType/CreativeType can only be defined as DEFINED_BY_JAVASCRIPT if Impression Owner is JavaScript");
            }
            return new C1045760dJu(enumC1045420dJM, enumC1045410dJL, enumC1046030dKL, enumC1046030dKL2);
        }
        throw new IllegalArgumentException("Impression owner is none");
    }
}
