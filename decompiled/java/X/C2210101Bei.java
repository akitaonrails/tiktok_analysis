package X;

/* JADX INFO: renamed from: X.1Bei, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2210101Bei {
    public static int LIZ(C2209921BeQ c2209921BeQ, AbstractC2209931BeR abstractC2209931BeR) {
        boolean zLIZLLL;
        if (!c2209921BeQ.LJFF()) {
            return 0;
        }
        if (abstractC2209931BeR instanceof C2209961BeU) {
            zLIZLLL = c2209921BeQ.LIZLLL(((C2209961BeU) abstractC2209931BeR).LLJJLIIIJLLLLLLLZ);
        } else if (abstractC2209931BeR instanceof C2209941BeS) {
            zLIZLLL = c2209921BeQ.LIZLLL(((C2209941BeS) abstractC2209931BeR).LLJL);
        } else if (abstractC2209931BeR instanceof C2209981BeW) {
            zLIZLLL = c2209921BeQ.LIZLLL(((C2209981BeW) abstractC2209931BeR).LLJJL);
        } else if (abstractC2209931BeR instanceof C2209971BeV) {
            zLIZLLL = c2209921BeQ.LIZLLL("launch");
        } else {
            if (!(abstractC2209931BeR instanceof C2210011BeZ)) {
                return 0;
            }
            zLIZLLL = c2209921BeQ.LIZLLL("terminate");
        }
        if (!zLIZLLL) {
            return 0;
        }
        if (c2209921BeQ.LL.LJIILJJIL) {
            return 3;
        }
        return 1;
    }

    public static void LIZIZ(C2209921BeQ c2209921BeQ, EnumC21646419na enumC21646419na, AbstractC2209931BeR abstractC2209931BeR) {
        if (!c2209921BeQ.LJFF()) {
            return;
        }
        if (abstractC2209931BeR instanceof C2209961BeU) {
            c2209921BeQ.LJIIL(enumC21646419na, ((C2209961BeU) abstractC2209931BeR).LLJJL, String.valueOf(abstractC2209931BeR.LLJJIJI), abstractC2209931BeR.LLILLJJLI, EnumC2176421AFs.V1_EVENT);
            return;
        }
        if (abstractC2209931BeR instanceof C2209941BeS) {
            c2209921BeQ.LJIIL(enumC21646419na, ((C2209941BeS) abstractC2209931BeR).LLJL, String.valueOf(abstractC2209931BeR.LLJJIJI), abstractC2209931BeR.LLILLJJLI, EnumC2176421AFs.V3_EVENT);
            return;
        }
        if (abstractC2209931BeR instanceof C2209981BeW) {
            c2209921BeQ.LJIIL(enumC21646419na, ((C2209981BeW) abstractC2209931BeR).LLJJL, String.valueOf(abstractC2209931BeR.LLJJIJI), abstractC2209931BeR.LLILLJJLI, EnumC2176421AFs.LOG_DATA);
        } else if (abstractC2209931BeR instanceof C2209971BeV) {
            c2209921BeQ.LJIIL(enumC21646419na, "launch", String.valueOf(abstractC2209931BeR.LLJJIJI), abstractC2209931BeR.LLILLJJLI, EnumC2176421AFs.LAUNCH);
        } else {
            if (!(abstractC2209931BeR instanceof C2210011BeZ)) {
                return;
            }
            c2209921BeQ.LJIIL(enumC21646419na, "terminate", String.valueOf(abstractC2209931BeR.LLJJIJI), abstractC2209931BeR.LLILLJJLI, EnumC2176421AFs.TERMINATE);
        }
    }

    public static void LIZJ(C2209921BeQ c2209921BeQ, EnumC21646419na enumC21646419na, C21655119oz c21655119oz) {
        if (!c2209921BeQ.LJFF()) {
            return;
        }
        c2209921BeQ.LJIIJJI(c21655119oz.LJ, c21655119oz.LJFF, enumC21646419na, c21655119oz.LIZ, c21655119oz.LIZIZ, c21655119oz.LIZJ, c21655119oz.LIZLLL);
    }
}
