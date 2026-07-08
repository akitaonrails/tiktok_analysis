package X;

/* JADX INFO: renamed from: X.13cT, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C20048713cT {
    public static final int LIZ(AbstractC20048613cS abstractC20048613cS, C115T c115t) {
        int iLJLILLLLZI;
        AbstractC20048613cS abstractC20048613cSLJJZZI = abstractC20048613cS.LJJZZI();
        if (abstractC20048613cSLJJZZI == null) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("Child of ");
            sbLIZ.append(abstractC20048613cS);
            sbLIZ.append(" cannot be null when calculating alignment line");
            C1696250uF5.LIZIZ(C2188811AlT.LIZIZ(sbLIZ));
        }
        if (abstractC20048613cS.LJLIIL().LJIILL().containsKey(c115t)) {
            Integer num = abstractC20048613cS.LJLIIL().LJIILL().get(c115t);
            if (num == null) {
                return Integer.MIN_VALUE;
            }
            return num.intValue();
        }
        int iLJJIJL = abstractC20048613cSLJJZZI.LJJIJL(c115t);
        if (iLJJIJL == Integer.MIN_VALUE) {
            return Integer.MIN_VALUE;
        }
        abstractC20048613cSLJJZZI.LLIZ = true;
        abstractC20048613cS.LLIZLLLIL = true;
        abstractC20048613cS.LJLJJLL();
        abstractC20048613cSLJJZZI.LLIZ = false;
        abstractC20048613cS.LLIZLLLIL = false;
        if (c115t instanceof C115S) {
            iLJLILLLLZI = C1676820tjk.LIZJ(abstractC20048613cSLJJZZI.LJLILLLLZI());
        } else {
            iLJLILLLLZI = (int) (abstractC20048613cSLJJZZI.LJLILLLLZI() >> 32);
        }
        return iLJJIJL + iLJLILLLLZI;
    }
}
