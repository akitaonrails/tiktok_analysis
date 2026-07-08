package X;

import android.graphics.Rect;
import com.bytedance.mt.protector.impl.string2number.CastIntegerProtector;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;
import java.util.ArrayList;
import java.util.HashMap;

/* JADX INFO: renamed from: X.0jnQ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1294700jnQ {
    public static final C1296750jqj LIZ = C1296750jqj.LIZ("w", "h", "ip", "op", "fr", "v", "layers", "assets", "fonts", "chars", "markers");
    public static final C1296750jqj LIZIZ = C1296750jqj.LIZ(FollowStatusChangeMethod.PARAM_UID, "layers", "w", "h", "p", "u");
    public static final C1296750jqj LIZJ = C1296750jqj.LIZ("list");
    public static final C1296750jqj LIZLLL = C1296750jqj.LIZ("cm", "tm", "dr");

    public static C1294720jnS LIZ(C1296380jq8 c1296380jq8) {
        float fLIZJ = C1294350jmr.LIZJ();
        C20066713fN<C1294730jnT> c20066713fN = new C20066713fN<>();
        ArrayList arrayList = new ArrayList();
        HashMap map = new HashMap();
        HashMap map2 = new HashMap();
        HashMap map3 = new HashMap();
        ArrayList arrayList2 = new ArrayList();
        C1119470fEn<C1295700jp2> c1119470fEn = new C1119470fEn<>();
        C1294720jnS c1294720jnS = new C1294720jnS();
        c1296380jq8.LIZIZ();
        int iLJIIZILJ = 0;
        float fLJIILLIIL = 0.0f;
        float fLJIILLIIL2 = 0.0f;
        float fLJIILLIIL3 = 0.0f;
        int iLJIIZILJ2 = 0;
        while (c1296380jq8.LJII()) {
            switch (c1296380jq8.LJJIL(LIZ)) {
                case 0:
                    iLJIIZILJ2 = c1296380jq8.LJIIZILJ();
                    break;
                case 1:
                    iLJIIZILJ = c1296380jq8.LJIIZILJ();
                    break;
                case 2:
                    fLJIILLIIL2 = (float) c1296380jq8.LJIILLIIL();
                    break;
                case 3:
                    fLJIILLIIL3 = ((float) c1296380jq8.LJIILLIIL()) - 0.01f;
                    break;
                case 4:
                    fLJIILLIIL = (float) c1296380jq8.LJIILLIIL();
                    break;
                case 5:
                    String[] strArrSplit = c1296380jq8.LJIJJ().split("\\.");
                    int i = CastIntegerProtector.parseInt(strArrSplit[0]);
                    int i2 = CastIntegerProtector.parseInt(strArrSplit[1]);
                    int i3 = CastIntegerProtector.parseInt(strArrSplit[2]);
                    if (i < 4 || (i <= 4 && (i2 < 4 || (i2 <= 4 && i3 < 0)))) {
                        c1294720jnS.LIZ("Lottie only supports bodymovin >= 4.4.0");
                    }
                    break;
                case 6:
                    c1296380jq8.LIZ();
                    int i4 = 0;
                    while (c1296380jq8.LJII()) {
                        C1294730jnT c1294730jnTLIZ = C1294710jnR.LIZ(c1296380jq8, c1294720jnS);
                        if (c1294730jnTLIZ.LJ == EnumC1294940jno.IMAGE) {
                            i4++;
                        }
                        arrayList.add(c1294730jnTLIZ);
                        c20066713fN.LJIIIZ(c1294730jnTLIZ.LIZLLL, c1294730jnTLIZ);
                        if (i4 > 4) {
                            StringBuilder sbLIZ = C2188811AlT.LIZ();
                            sbLIZ.append("You have ");
                            sbLIZ.append(i4);
                            sbLIZ.append(" images. Lottie should primarily be used with shapes. If you are using Adobe Illustrator, convert the Illustrator layers to shape layers.");
                            C1292050jj9.LIZIZ(C2188811AlT.LIZIZ(sbLIZ));
                        }
                    }
                    c1296380jq8.LIZLLL();
                    break;
                case 7:
                    c1296380jq8.LIZ();
                    while (c1296380jq8.LJII()) {
                        ArrayList arrayList3 = new ArrayList();
                        C20066713fN c20066713fN2 = new C20066713fN();
                        c1296380jq8.LIZIZ();
                        String strLJIJJ = null;
                        String strLJIJJ2 = null;
                        String strLJIJJ3 = null;
                        int iLJIIZILJ3 = 0;
                        int iLJIIZILJ4 = 0;
                        while (c1296380jq8.LJII()) {
                            int iLJJIL = c1296380jq8.LJJIL(LIZIZ);
                            if (iLJJIL != 0) {
                                if (iLJJIL != 1) {
                                    if (iLJJIL != 2) {
                                        if (iLJJIL != 3) {
                                            if (iLJJIL != 4) {
                                                if (iLJJIL != 5) {
                                                    c1296380jq8.LJJIZ();
                                                    c1296380jq8.LJJJ();
                                                } else {
                                                    strLJIJJ3 = c1296380jq8.LJIJJ();
                                                }
                                            } else {
                                                strLJIJJ2 = c1296380jq8.LJIJJ();
                                            }
                                        } else {
                                            iLJIIZILJ4 = c1296380jq8.LJIIZILJ();
                                        }
                                    } else {
                                        iLJIIZILJ3 = c1296380jq8.LJIIZILJ();
                                    }
                                } else {
                                    c1296380jq8.LIZ();
                                    while (c1296380jq8.LJII()) {
                                        C1294730jnT c1294730jnTLIZ2 = C1294710jnR.LIZ(c1296380jq8, c1294720jnS);
                                        c20066713fN2.LJIIIZ(c1294730jnTLIZ2.LIZLLL, c1294730jnTLIZ2);
                                        arrayList3.add(c1294730jnTLIZ2);
                                    }
                                    c1296380jq8.LIZLLL();
                                }
                            } else {
                                strLJIJJ = c1296380jq8.LJIJJ();
                            }
                        }
                        c1296380jq8.LJFF();
                        if (strLJIJJ2 != null) {
                            map2.put(strLJIJJ, new C1294320jmo(iLJIIZILJ3, iLJIIZILJ4, strLJIJJ, strLJIJJ2, strLJIJJ3));
                        } else {
                            map.put(strLJIJJ, arrayList3);
                        }
                    }
                    c1296380jq8.LIZLLL();
                    break;
                case 8:
                    c1296380jq8.LIZIZ();
                    while (c1296380jq8.LJII()) {
                        if (c1296380jq8.LJJIL(LIZJ) != 0) {
                            c1296380jq8.LJJIZ();
                            c1296380jq8.LJJJ();
                        } else {
                            c1296380jq8.LIZ();
                            while (c1296380jq8.LJII()) {
                                C1296750jqj c1296750jqj = C1292920jkY.LIZ;
                                c1296380jq8.LIZIZ();
                                String strLJIJJ4 = null;
                                String strLJIJJ5 = null;
                                String strLJIJJ6 = null;
                                while (c1296380jq8.LJII()) {
                                    int iLJJIL2 = c1296380jq8.LJJIL(C1292920jkY.LIZ);
                                    if (iLJJIL2 != 0) {
                                        if (iLJJIL2 != 1) {
                                            if (iLJJIL2 != 2) {
                                                if (iLJJIL2 != 3) {
                                                    c1296380jq8.LJJIZ();
                                                    c1296380jq8.LJJJ();
                                                } else {
                                                    c1296380jq8.LJIILLIIL();
                                                }
                                            } else {
                                                strLJIJJ6 = c1296380jq8.LJIJJ();
                                            }
                                        } else {
                                            strLJIJJ5 = c1296380jq8.LJIJJ();
                                        }
                                    } else {
                                        strLJIJJ4 = c1296380jq8.LJIJJ();
                                    }
                                }
                                c1296380jq8.LJFF();
                                map3.put(strLJIJJ5, new C1294400jmw(strLJIJJ4, strLJIJJ5, strLJIJJ6));
                            }
                            c1296380jq8.LIZLLL();
                        }
                    }
                    c1296380jq8.LJFF();
                    break;
                case BdTuring.TYPE_ECAF /* 9 */:
                    c1296380jq8.LIZ();
                    while (c1296380jq8.LJII()) {
                        C1296750jqj c1296750jqj2 = C1292930jkZ.LIZ;
                        ArrayList arrayList4 = new ArrayList();
                        c1296380jq8.LIZIZ();
                        double dLJIILLIIL = 0.0d;
                        String strLJIJJ7 = null;
                        String strLJIJJ8 = null;
                        char cCharAt = 0;
                        while (c1296380jq8.LJII()) {
                            int iLJJIL3 = c1296380jq8.LJJIL(C1292930jkZ.LIZ);
                            if (iLJJIL3 != 0) {
                                if (iLJJIL3 != 1) {
                                    if (iLJJIL3 != 2) {
                                        if (iLJJIL3 != 3) {
                                            if (iLJJIL3 != 4) {
                                                if (iLJJIL3 != 5) {
                                                    c1296380jq8.LJJIZ();
                                                    c1296380jq8.LJJJ();
                                                } else {
                                                    c1296380jq8.LIZIZ();
                                                    while (c1296380jq8.LJII()) {
                                                        if (c1296380jq8.LJJIL(C1292930jkZ.LIZIZ) != 0) {
                                                            c1296380jq8.LJJIZ();
                                                            c1296380jq8.LJJJ();
                                                        } else {
                                                            c1296380jq8.LIZ();
                                                            while (c1296380jq8.LJII()) {
                                                                arrayList4.add(C1294690jnP.LIZ(c1296380jq8, c1294720jnS));
                                                            }
                                                            c1296380jq8.LIZLLL();
                                                        }
                                                    }
                                                    c1296380jq8.LJFF();
                                                }
                                            } else {
                                                strLJIJJ8 = c1296380jq8.LJIJJ();
                                            }
                                        } else {
                                            strLJIJJ7 = c1296380jq8.LJIJJ();
                                        }
                                    } else {
                                        dLJIILLIIL = c1296380jq8.LJIILLIIL();
                                    }
                                } else {
                                    c1296380jq8.LJIILLIIL();
                                }
                            } else {
                                cCharAt = c1296380jq8.LJIJJ().charAt(0);
                            }
                        }
                        c1296380jq8.LJFF();
                        C1295700jp2 c1295700jp2 = new C1295700jp2(arrayList4, cCharAt, dLJIILLIIL, strLJIJJ7, strLJIJJ8);
                        c1119470fEn.LJFF(c1295700jp2.hashCode(), c1295700jp2);
                    }
                    c1296380jq8.LIZLLL();
                    break;
                case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                    c1296380jq8.LIZ();
                    while (c1296380jq8.LJII()) {
                        c1296380jq8.LIZIZ();
                        String strLJIJJ9 = null;
                        float fLJIILLIIL4 = 0.0f;
                        float fLJIILLIIL5 = 0.0f;
                        while (c1296380jq8.LJII()) {
                            int iLJJIL4 = c1296380jq8.LJJIL(LIZLLL);
                            if (iLJJIL4 != 0) {
                                if (iLJJIL4 != 1) {
                                    if (iLJJIL4 != 2) {
                                        c1296380jq8.LJJIZ();
                                        c1296380jq8.LJJJ();
                                    } else {
                                        fLJIILLIIL5 = (float) c1296380jq8.LJIILLIIL();
                                    }
                                } else {
                                    fLJIILLIIL4 = (float) c1296380jq8.LJIILLIIL();
                                }
                            } else {
                                strLJIJJ9 = c1296380jq8.LJIJJ();
                            }
                        }
                        c1296380jq8.LJFF();
                        arrayList2.add(new C1295850jpH(strLJIJJ9, fLJIILLIIL4, fLJIILLIIL5));
                    }
                    c1296380jq8.LIZLLL();
                    break;
                default:
                    c1296380jq8.LJJIZ();
                    c1296380jq8.LJJJ();
                    break;
            }
        }
        c1294720jnS.LJIIIZ = new Rect(0, 0, (int) (iLJIIZILJ2 * fLIZJ), (int) (iLJIIZILJ * fLIZJ));
        c1294720jnS.LJIIJ = fLJIILLIIL2;
        c1294720jnS.LJIIJJI = fLJIILLIIL3;
        c1294720jnS.LJIIL = fLJIILLIIL;
        c1294720jnS.LJIIIIZZ = arrayList;
        c1294720jnS.LJII = c20066713fN;
        c1294720jnS.LIZJ = map;
        c1294720jnS.LIZLLL = map2;
        c1294720jnS.LJI = c1119470fEn;
        c1294720jnS.LJ = map3;
        c1294720jnS.LJFF = arrayList2;
        return c1294720jnS;
    }
}
