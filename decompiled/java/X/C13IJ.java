package X;

import com.bytedance.speech.speechengine.SpeechEngineDefines;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;

/* JADX INFO: renamed from: X.13IJ, reason: invalid class name */
/* JADX INFO: loaded from: classes31.dex */
@InterfaceC1294060jmO
public /* synthetic */ class C13IJ implements C13H1<C1784480wXO> {
    public static final C13IJ LIZ;
    public static final InterfaceC19983313Gt descriptor;

    @Override // X.C13HG, X.InterfaceC19984413He, X.InterfaceC19984213Hc
    public final InterfaceC19983313Gt getDescriptor() {
        return descriptor;
    }

    @Override // X.C13H1
    public final /* synthetic */ C13HG[] typeParametersSerializers() {
        return C13H3.LIZ;
    }

    static {
        C13IJ c13ij = new C13IJ();
        LIZ = c13ij;
        C19983913Gz c19983913Gz = new C19983913Gz("com.tiktok.kmp.shareprop.KMPSharePropagationCacheItem", c13ij, 12);
        c19983913Gz.LJIIJ("itemId", false);
        c19983913Gz.LJIIJ("sceneType", false);
        c19983913Gz.LJIIJ("spRootD", false);
        c19983913Gz.LJIIJ("spLevel", false);
        c19983913Gz.LJIIJ("spRootU", true);
        c19983913Gz.LJIIJ("spRootOd", true);
        c19983913Gz.LJIIJ("spSourceD", true);
        c19983913Gz.LJIIJ("spSourceOd", true);
        c19983913Gz.LJIIJ("spSourceU", true);
        c19983913Gz.LJIIJ("spSourceW", true);
        c19983913Gz.LJIIJ("spRootShareLinkId", true);
        c19983913Gz.LJIIJ("timestamp", true);
        descriptor = c19983913Gz;
    }

    @Override // X.C13H1
    public final C13HG<?>[] childSerializers() {
        C13GX c13gx = C13GX.LIZ;
        return new C13HG[]{c13gx, C13HI.LIZ, c13gx, c13gx, C19983613Gw.LIZ(c13gx), C19983613Gw.LIZ(c13gx), C19983613Gw.LIZ(c13gx), C19983613Gw.LIZ(c13gx), C19983613Gw.LIZ(c13gx), C19983613Gw.LIZ(c13gx), C19983613Gw.LIZ(c13gx), C13H6.LIZ};
    }

    @Override // X.InterfaceC19984213Hc
    public final Object deserialize(C13HB c13hb) {
        InterfaceC19983313Gt interfaceC19983313Gt = descriptor;
        InterfaceC19986313Hx interfaceC19986313HxLIZIZ = c13hb.LIZIZ(interfaceC19983313Gt);
        interfaceC19986313HxLIZIZ.LJJII();
        String str = null;
        String str2 = null;
        String strLJIILL = null;
        String strLJIILL2 = null;
        String strLJIILL3 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        long jLJIIIIZZ = 0;
        int i = 0;
        int iLJIJJLI = 0;
        String str6 = null;
        String str7 = null;
        while (true) {
            int iLJIJJ = interfaceC19986313HxLIZIZ.LJIJJ(interfaceC19983313Gt);
            switch (iLJIJJ) {
                case -1:
                    interfaceC19986313HxLIZIZ.LJIIJJI(interfaceC19983313Gt);
                    return new C1784480wXO(i, strLJIILL, iLJIJJLI, strLJIILL2, strLJIILL3, str3, str4, str5, str, str6, str7, str2, jLJIIIIZZ);
                case 0:
                    strLJIILL = interfaceC19986313HxLIZIZ.LJIILL(interfaceC19983313Gt, 0);
                    i |= 1;
                    break;
                case 1:
                    iLJIJJLI = interfaceC19986313HxLIZIZ.LJIJJLI(interfaceC19983313Gt, 1);
                    i |= 2;
                    break;
                case 2:
                    strLJIILL2 = interfaceC19986313HxLIZIZ.LJIILL(interfaceC19983313Gt, 2);
                    i |= 4;
                    break;
                case 3:
                    strLJIILL3 = interfaceC19986313HxLIZIZ.LJIILL(interfaceC19983313Gt, 3);
                    i |= 8;
                    break;
                case 4:
                    str3 = (String) interfaceC19986313HxLIZIZ.LJIIIZ(interfaceC19983313Gt, 4, C13GX.LIZ, str3);
                    i |= 16;
                    break;
                case 5:
                    str4 = (String) interfaceC19986313HxLIZIZ.LJIIIZ(interfaceC19983313Gt, 5, C13GX.LIZ, str4);
                    i |= 32;
                    break;
                case 6:
                    str5 = (String) interfaceC19986313HxLIZIZ.LJIIIZ(interfaceC19983313Gt, 6, C13GX.LIZ, str5);
                    i |= 64;
                    break;
                case 7:
                    str = (String) interfaceC19986313HxLIZIZ.LJIIIZ(interfaceC19983313Gt, 7, C13GX.LIZ, str);
                    i |= 128;
                    break;
                case 8:
                    str6 = (String) interfaceC19986313HxLIZIZ.LJIIIZ(interfaceC19983313Gt, 8, C13GX.LIZ, str6);
                    i |= 256;
                    break;
                case BdTuring.TYPE_ECAF /* 9 */:
                    str7 = (String) interfaceC19986313HxLIZIZ.LJIIIZ(interfaceC19983313Gt, 9, C13GX.LIZ, str7);
                    i |= 512;
                    break;
                case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                    str2 = (String) interfaceC19986313HxLIZIZ.LJIIIZ(interfaceC19983313Gt, 10, C13GX.LIZ, str2);
                    i |= 1024;
                    break;
                case BdTuring.TYPE_EMAIL /* 11 */:
                    jLJIIIIZZ = interfaceC19986313HxLIZIZ.LJIIIIZZ(interfaceC19983313Gt, 11);
                    i |= SpeechEngineDefines.ASR_WORK_MODE_OFFLINE;
                    break;
                default:
                    throw new C13II(iLJIJJ);
            }
        }
    }

    @Override // X.InterfaceC19984413He
    public final void serialize(C13HD c13hd, Object obj) {
        C1784480wXO c1784480wXO = (C1784480wXO) obj;
        InterfaceC19983313Gt interfaceC19983313Gt = descriptor;
        InterfaceC19986513Hz interfaceC19986513HzLIZIZ = c13hd.LIZIZ(interfaceC19983313Gt);
        interfaceC19986513HzLIZIZ.LJIILIIL(interfaceC19983313Gt, 0, c1784480wXO.LIZ);
        interfaceC19986513HzLIZIZ.LJ(1, c1784480wXO.LIZIZ, interfaceC19983313Gt);
        interfaceC19986513HzLIZIZ.LJIILIIL(interfaceC19983313Gt, 2, c1784480wXO.LIZJ);
        interfaceC19986513HzLIZIZ.LJIILIIL(interfaceC19983313Gt, 3, c1784480wXO.LIZLLL);
        if (interfaceC19986513HzLIZIZ.LJIJJ() || c1784480wXO.LJ != null) {
            interfaceC19986513HzLIZIZ.LJIIZILJ(interfaceC19983313Gt, 4, C13GX.LIZ, c1784480wXO.LJ);
        }
        if (interfaceC19986513HzLIZIZ.LJIJJ() || c1784480wXO.LJFF != null) {
            interfaceC19986513HzLIZIZ.LJIIZILJ(interfaceC19983313Gt, 5, C13GX.LIZ, c1784480wXO.LJFF);
        }
        if (interfaceC19986513HzLIZIZ.LJIJJ() || c1784480wXO.LJI != null) {
            interfaceC19986513HzLIZIZ.LJIIZILJ(interfaceC19983313Gt, 6, C13GX.LIZ, c1784480wXO.LJI);
        }
        if (interfaceC19986513HzLIZIZ.LJIJJ() || c1784480wXO.LJII != null) {
            interfaceC19986513HzLIZIZ.LJIIZILJ(interfaceC19983313Gt, 7, C13GX.LIZ, c1784480wXO.LJII);
        }
        if (interfaceC19986513HzLIZIZ.LJIJJ() || c1784480wXO.LJIIIIZZ != null) {
            interfaceC19986513HzLIZIZ.LJIIZILJ(interfaceC19983313Gt, 8, C13GX.LIZ, c1784480wXO.LJIIIIZZ);
        }
        if (interfaceC19986513HzLIZIZ.LJIJJ() || c1784480wXO.LJIIIZ != null) {
            interfaceC19986513HzLIZIZ.LJIIZILJ(interfaceC19983313Gt, 9, C13GX.LIZ, c1784480wXO.LJIIIZ);
        }
        if (interfaceC19986513HzLIZIZ.LJIJJ() || c1784480wXO.LJIIJ != null) {
            interfaceC19986513HzLIZIZ.LJIIZILJ(interfaceC19983313Gt, 10, C13GX.LIZ, c1784480wXO.LJIIJ);
        }
        if (interfaceC19986513HzLIZIZ.LJIJJ() || c1784480wXO.LJIIJJI != 0) {
            interfaceC19986513HzLIZIZ.LJFF(interfaceC19983313Gt, 11, c1784480wXO.LJIIJJI);
        }
        interfaceC19986513HzLIZIZ.LIZLLL();
    }
}
