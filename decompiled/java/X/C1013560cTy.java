package X;

import java.util.Arrays;

/* JADX INFO: renamed from: X.0cTy, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1013560cTy extends AbstractC1023470cjx {
    public final C1023630ckD<?>[] LIZ;
    public final C1023960ckk LIZIZ;
    public final C1023960ckk LIZJ;
    public final C1023960ckk LIZLLL;
    public final C1023960ckk LJ;

    @Override // X.AbstractC1023380cjo, X.C1023640ckE
    public final C1023630ckD<?>[] getInternalLogics() {
        return this.LIZ;
    }

    public C1013560cTy(Object... objArr) {
        super(Arrays.copyOf(objArr, objArr.length));
        this.LIZ = new C1023630ckD[0];
        C1009980cOC c1009980cOC = C1009980cOC.LIZ;
        C1013570cTz.LIZ.getClass();
        C1002190cBd c1002190cBd = C1013570cTz.LIZJ;
        C1002190cBd c1002190cBd2 = C1013570cTz.LIZLLL;
        C1002190cBd c1002190cBd3 = C1013570cTz.LJ;
        C1002190cBd c1002190cBd4 = C1013570cTz.LJFF;
        this.LIZIZ = C1023500ck0.LIZJ("draw_ad", "addon_play", "multi_video_addon", new InterfaceC1023650ckF[]{c1009980cOC.LJI(c1002190cBd, c1002190cBd2, c1002190cBd3, c1002190cBd4)});
        this.LIZJ = C1023500ck0.LIZJ("draw_ad", "addon_play_2s", "multi_video_addon", new InterfaceC1023650ckF[]{c1009980cOC.LJI(c1002190cBd, c1002190cBd2, c1002190cBd4, c1002190cBd3)});
        C1002190cBd c1002190cBd5 = C1013570cTz.LIZIZ;
        this.LIZLLL = C1023500ck0.LIZJ("draw_ad", "addon_break", "multi_video_addon", new InterfaceC1023650ckF[]{c1009980cOC.LJI(c1002190cBd5, c1002190cBd, c1002190cBd2, c1002190cBd4, c1002190cBd3)});
        this.LJ = C1023500ck0.LIZJ("draw_ad", "addon_over", "multi_video_addon", new InterfaceC1023650ckF[]{c1009980cOC.LJI(c1002190cBd5, c1002190cBd, c1002190cBd2, c1002190cBd4, c1002190cBd3)});
    }

    public static String LJJIIZ(int i) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("video_");
        sbLIZ.append(Math.max(i, 0) + 1);
        return C2188811AlT.LIZIZ(sbLIZ);
    }
}
