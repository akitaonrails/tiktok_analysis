package X;

import android.graphics.PointF;
import android.view.animation.Interpolator;
import com.bytedance.android.livesdk.livesetting.other.LiveToolbarIconStyleSetting;
import com.bytedance.mt.protector.impl.color.ColorProtector;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: X.0jnR, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1294710jnR {
    public static final C1296750jqj LIZ = C1296750jqj.LIZ("nm", "ind", "refId", "ty", "parent", "sw", "sh", "sc", "ks", "tt", "masksProperties", "shapes", "t", "ef", "sr", "st", "w", "h", "ip", "op", "tm", "cl", "hd");
    public static final C1296750jqj LIZIZ = C1296750jqj.LIZ("d", "a");
    public static final C1296750jqj LIZJ = C1296750jqj.LIZ("ty", "nm");

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Multi-variable type inference failed */
    public static C1294730jnT LIZ(C1296380jq8 c1296380jq8, C1294720jnS c1294720jnS) {
        C1295020jnw c1295020jnw;
        C1295020jnw c1295020jnw2;
        C1295020jnw c1295020jnw3;
        C1295020jnw c1295020jnw4;
        EnumC1295410joZ enumC1295410joZ = EnumC1295410joZ.NONE;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        c1296380jq8.LIZIZ();
        Float fValueOf = Float.valueOf(0.0f);
        Float fValueOf2 = Float.valueOf(1.0f);
        String strLJIJJ = "UNSET";
        boolean z = false;
        float fLJIILLIIL = 1.0f;
        long jLJIIZILJ = 0;
        int iLJIIZILJ = 0;
        int iLJIIZILJ2 = 0;
        int color = 0;
        boolean zLJIILL = false;
        float fLJIILLIIL2 = 0.0f;
        float fLJIILLIIL3 = 0.0f;
        float fLJIILLIIL4 = 0.0f;
        float fLJIILLIIL5 = 0.0f;
        long jLJIIZILJ2 = -1;
        String strLJIJJ2 = null;
        EnumC1294940jno enumC1294940jno = null;
        String strLJIJJ3 = null;
        C1295320joQ c1295320joQLIZ = null;
        AbstractC1294520jn8<C1295340joS, C1295340joS> abstractC1294520jn8 = null;
        C1295770jp9 c1295770jp9 = null;
        C1295020jnw c1295020jnwLIZIZ = null;
        C1295860jpI c1295860jpI = null;
        C1295720jp4 c1295720jp4 = null;
        float fLJIILLIIL6 = 0.0f;
        while (c1296380jq8.LJII()) {
            switch (c1296380jq8.LJJIL(LIZ)) {
                case 0:
                    strLJIJJ = c1296380jq8.LJIJJ();
                    break;
                case 1:
                    jLJIIZILJ = c1296380jq8.LJIIZILJ();
                    break;
                case 2:
                    strLJIJJ3 = c1296380jq8.LJIJJ();
                    break;
                case 3:
                    int iLJIIZILJ3 = c1296380jq8.LJIIZILJ();
                    enumC1294940jno = EnumC1294940jno.UNKNOWN;
                    if (iLJIIZILJ3 < enumC1294940jno.ordinal()) {
                        enumC1294940jno = EnumC1294940jno.values()[iLJIIZILJ3];
                    }
                    break;
                case 4:
                    jLJIIZILJ2 = c1296380jq8.LJIIZILJ();
                    break;
                case 5:
                    iLJIIZILJ = (int) (c1296380jq8.LJIIZILJ() * C1294350jmr.LIZJ());
                    break;
                case 6:
                    iLJIIZILJ2 = (int) (c1296380jq8.LJIIZILJ() * C1294350jmr.LIZJ());
                    break;
                case 7:
                    color = ColorProtector.parseColor(c1296380jq8.LJIJJ());
                    break;
                case 8:
                    c1295320joQLIZ = C1294760jnW.LIZ(c1296380jq8, c1294720jnS);
                    break;
                case BdTuring.TYPE_ECAF /* 9 */:
                    int iLJIIZILJ4 = c1296380jq8.LJIIZILJ();
                    if (iLJIIZILJ4 >= EnumC1295410joZ.values().length) {
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("Unsupported matte type: ");
                        sbLIZ.append(iLJIIZILJ4);
                        c1294720jnS.LIZ(C2188811AlT.LIZIZ(sbLIZ));
                    } else {
                        enumC1295410joZ = EnumC1295410joZ.values()[iLJIIZILJ4];
                        int i = C1295480jog.LIZ[enumC1295410joZ.ordinal()];
                        if (i != 1) {
                            if (i == 2) {
                                c1294720jnS.LIZ("Unsupported matte type: Luma Inverted");
                            }
                        } else {
                            c1294720jnS.LIZ("Unsupported matte type: Luma");
                        }
                        c1294720jnS.LJIILJJIL++;
                    }
                    break;
                case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                    EnumC1294970jnr enumC1294970jnr = null;
                    c1296380jq8.LIZ();
                    while (c1296380jq8.LJII()) {
                        c1296380jq8.LIZIZ();
                        C1294530jn9 c1294530jn9 = enumC1294970jnr;
                        C1295460joe c1295460joeLIZJ = enumC1294970jnr;
                        boolean zLJIILL2 = false;
                        while (c1296380jq8.LJII()) {
                            String strLJJL = c1296380jq8.LJJL();
                            strLJJL.getClass();
                            int iHashCode = strLJJL.hashCode();
                            if (iHashCode != 111) {
                                if (iHashCode != 3588) {
                                    if (iHashCode != 104433) {
                                        if (iHashCode == 3357091 && strLJJL.equals("mode")) {
                                            String strLJIJJ4 = c1296380jq8.LJIJJ();
                                            strLJIJJ4.getClass();
                                            int iHashCode2 = strLJIJJ4.hashCode();
                                            if (iHashCode2 != 97) {
                                                if (iHashCode2 != 105) {
                                                    if (iHashCode2 != 110) {
                                                        if (iHashCode2 == 115 && strLJIJJ4.equals("s")) {
                                                            enumC1294970jnr = EnumC1294970jnr.MASK_MODE_SUBTRACT;
                                                        } else {
                                                            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                                                            sbLIZ2.append("Unknown mask mode ");
                                                            sbLIZ2.append(strLJJL);
                                                            sbLIZ2.append(". Defaulting to Add.");
                                                            C1292050jj9.LIZIZ(C2188811AlT.LIZIZ(sbLIZ2));
                                                            enumC1294970jnr = EnumC1294970jnr.MASK_MODE_ADD;
                                                        }
                                                    } else if (strLJIJJ4.equals("n")) {
                                                        enumC1294970jnr = EnumC1294970jnr.MASK_MODE_NONE;
                                                    } else {
                                                        StringBuilder sbLIZ22 = C2188811AlT.LIZ();
                                                        sbLIZ22.append("Unknown mask mode ");
                                                        sbLIZ22.append(strLJJL);
                                                        sbLIZ22.append(". Defaulting to Add.");
                                                        C1292050jj9.LIZIZ(C2188811AlT.LIZIZ(sbLIZ22));
                                                        enumC1294970jnr = EnumC1294970jnr.MASK_MODE_ADD;
                                                    }
                                                } else if (strLJIJJ4.equals("i")) {
                                                    c1294720jnS.LIZ("Animation contains intersect masks. They are not supported but will be treated like add masks.");
                                                    enumC1294970jnr = EnumC1294970jnr.MASK_MODE_INTERSECT;
                                                } else {
                                                    StringBuilder sbLIZ222 = C2188811AlT.LIZ();
                                                    sbLIZ222.append("Unknown mask mode ");
                                                    sbLIZ222.append(strLJJL);
                                                    sbLIZ222.append(". Defaulting to Add.");
                                                    C1292050jj9.LIZIZ(C2188811AlT.LIZIZ(sbLIZ222));
                                                    enumC1294970jnr = EnumC1294970jnr.MASK_MODE_ADD;
                                                }
                                            } else if (strLJIJJ4.equals("a")) {
                                                enumC1294970jnr = EnumC1294970jnr.MASK_MODE_ADD;
                                            } else {
                                                StringBuilder sbLIZ2222 = C2188811AlT.LIZ();
                                                sbLIZ2222.append("Unknown mask mode ");
                                                sbLIZ2222.append(strLJJL);
                                                sbLIZ2222.append(". Defaulting to Add.");
                                                C1292050jj9.LIZIZ(C2188811AlT.LIZIZ(sbLIZ2222));
                                                enumC1294970jnr = EnumC1294970jnr.MASK_MODE_ADD;
                                            }
                                        } else {
                                            c1296380jq8.LJJJ();
                                        }
                                    } else if (strLJJL.equals("inv")) {
                                        zLJIILL2 = c1296380jq8.LJIILL();
                                    } else {
                                        c1296380jq8.LJJJ();
                                    }
                                } else if (strLJJL.equals("pt")) {
                                    c1294530jn9 = new C1294530jn9(C1294800jna.LIZ(c1296380jq8, c1294720jnS, C1294350jmr.LIZJ(), C1294750jnV.LIZ, false));
                                } else {
                                    c1296380jq8.LJJJ();
                                }
                            } else if (strLJJL.equals("o")) {
                                c1295460joeLIZJ = C1294870jnh.LIZJ(c1296380jq8, c1294720jnS);
                            } else {
                                c1296380jq8.LJJJ();
                            }
                        }
                        c1296380jq8.LJFF();
                        arrayList.add(new C1295690jp1(enumC1294970jnr, c1294530jn9, c1295460joeLIZJ, zLJIILL2));
                        enumC1294970jnr = null;
                    }
                    c1294720jnS.LJIILJJIL += arrayList.size();
                    c1296380jq8.LIZLLL();
                    break;
                case BdTuring.TYPE_EMAIL /* 11 */:
                    c1296380jq8.LIZ();
                    while (c1296380jq8.LJII()) {
                        InterfaceC1294510jn7 interfaceC1294510jn7LIZ = C1294690jnP.LIZ(c1296380jq8, c1294720jnS);
                        if (interfaceC1294510jn7LIZ != null) {
                            arrayList2.add(interfaceC1294510jn7LIZ);
                        }
                    }
                    c1296380jq8.LIZLLL();
                    break;
                case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                    c1296380jq8.LIZIZ();
                    while (c1296380jq8.LJII()) {
                        int iLJJIL = c1296380jq8.LJJIL(LIZIZ);
                        if (iLJJIL != 0) {
                            if (iLJJIL != 1) {
                                c1296380jq8.LJJIZ();
                                c1296380jq8.LJJJ();
                            } else {
                                c1296380jq8.LIZ();
                                if (c1296380jq8.LJII()) {
                                    C1296750jqj c1296750jqj = C1293820jm0.LIZ;
                                    c1296380jq8.LIZIZ();
                                    c1295770jp9 = null;
                                    while (c1296380jq8.LJII()) {
                                        if (c1296380jq8.LJJIL(C1293820jm0.LIZ) != 0) {
                                            c1296380jq8.LJJIZ();
                                            c1296380jq8.LJJJ();
                                        } else {
                                            c1296380jq8.LIZIZ();
                                            C1295450jod c1295450jodLIZ = null;
                                            C1295450jod c1295450jodLIZ2 = null;
                                            C1295020jnw c1295020jnwLIZIZ2 = null;
                                            C1295020jnw c1295020jnwLIZIZ3 = null;
                                            while (c1296380jq8.LJII()) {
                                                int iLJJIL2 = c1296380jq8.LJJIL(C1293820jm0.LIZIZ);
                                                if (iLJJIL2 != 0) {
                                                    if (iLJJIL2 != 1) {
                                                        if (iLJJIL2 != 2) {
                                                            if (iLJJIL2 != 3) {
                                                                c1296380jq8.LJJIZ();
                                                                c1296380jq8.LJJJ();
                                                            } else {
                                                                c1295020jnwLIZIZ3 = C1294870jnh.LIZIZ(c1296380jq8, c1294720jnS, true);
                                                            }
                                                        } else {
                                                            c1295020jnwLIZIZ2 = C1294870jnh.LIZIZ(c1296380jq8, c1294720jnS, true);
                                                        }
                                                    } else {
                                                        c1295450jodLIZ2 = C1294870jnh.LIZ(c1296380jq8, c1294720jnS);
                                                    }
                                                } else {
                                                    c1295450jodLIZ = C1294870jnh.LIZ(c1296380jq8, c1294720jnS);
                                                }
                                            }
                                            c1296380jq8.LJFF();
                                            c1295770jp9 = new C1295770jp9(c1295450jodLIZ, c1295450jodLIZ2, c1295020jnwLIZIZ2, c1295020jnwLIZIZ3);
                                        }
                                    }
                                    c1296380jq8.LJFF();
                                    if (c1295770jp9 == null) {
                                        c1295770jp9 = new C1295770jp9(null, null, null, null);
                                    }
                                }
                                while (c1296380jq8.LJII()) {
                                    c1296380jq8.LJJJ();
                                }
                                c1296380jq8.LIZLLL();
                            }
                        } else {
                            final List listLIZ = C1294800jna.LIZ(c1296380jq8, c1294720jnS, C1294350jmr.LIZJ(), new InterfaceC1295730jp5<C1295340joS>() { // from class: X.0jnc
                                public static final C1296750jqj LIZIZ = C1296750jqj.LIZ("t", "f", "s", "j", "tr", "lh", "ls", "fc", "sc", "sw", "of", "ps", "sz");

                                @Override // X.InterfaceC1295730jp5
                                public final C1295340joS LIZ(AbstractC1295900jpM abstractC1295900jpM, float f) {
                                    EnumC1295510joj enumC1295510joj = EnumC1295510joj.CENTER;
                                    abstractC1295900jpM.LIZIZ();
                                    String strLJIJJ5 = null;
                                    String strLJIJJ6 = null;
                                    PointF pointF = null;
                                    PointF pointF2 = null;
                                    float fLJIILLIIL7 = 0.0f;
                                    float fLJIILLIIL8 = 0.0f;
                                    float fLJIILLIIL9 = 0.0f;
                                    float fLJIILLIIL10 = 0.0f;
                                    int iLJIIZILJ5 = 0;
                                    int iLIZ = 0;
                                    int iLIZ2 = 0;
                                    boolean zLJIILL3 = true;
                                    while (abstractC1295900jpM.LJII()) {
                                        switch (abstractC1295900jpM.LJJIL(LIZIZ)) {
                                            case 0:
                                                strLJIJJ5 = abstractC1295900jpM.LJIJJ();
                                                break;
                                            case 1:
                                                strLJIJJ6 = abstractC1295900jpM.LJIJJ();
                                                break;
                                            case 2:
                                                fLJIILLIIL7 = (float) abstractC1295900jpM.LJIILLIIL();
                                                break;
                                            case 3:
                                                int iLJIIZILJ6 = abstractC1295900jpM.LJIIZILJ();
                                                enumC1295510joj = EnumC1295510joj.CENTER;
                                                if (iLJIIZILJ6 <= enumC1295510joj.ordinal() && iLJIIZILJ6 >= 0) {
                                                    enumC1295510joj = EnumC1295510joj.values()[iLJIIZILJ6];
                                                }
                                                break;
                                            case 4:
                                                iLJIIZILJ5 = abstractC1295900jpM.LJIIZILJ();
                                                break;
                                            case 5:
                                                fLJIILLIIL8 = (float) abstractC1295900jpM.LJIILLIIL();
                                                break;
                                            case 6:
                                                fLJIILLIIL9 = (float) abstractC1295900jpM.LJIILLIIL();
                                                break;
                                            case 7:
                                                iLIZ = C1294770jnX.LIZ(abstractC1295900jpM);
                                                break;
                                            case 8:
                                                iLIZ2 = C1294770jnX.LIZ(abstractC1295900jpM);
                                                break;
                                            case BdTuring.TYPE_ECAF /* 9 */:
                                                fLJIILLIIL10 = (float) abstractC1295900jpM.LJIILLIIL();
                                                break;
                                            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                                                zLJIILL3 = abstractC1295900jpM.LJIILL();
                                                break;
                                            case BdTuring.TYPE_EMAIL /* 11 */:
                                                abstractC1295900jpM.LIZ();
                                                pointF = new PointF(((float) abstractC1295900jpM.LJIILLIIL()) * f, ((float) abstractC1295900jpM.LJIILLIIL()) * f);
                                                abstractC1295900jpM.LIZLLL();
                                                break;
                                            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                                                abstractC1295900jpM.LIZ();
                                                pointF2 = new PointF(((float) abstractC1295900jpM.LJIILLIIL()) * f, ((float) abstractC1295900jpM.LJIILLIIL()) * f);
                                                abstractC1295900jpM.LIZLLL();
                                                break;
                                            default:
                                                abstractC1295900jpM.LJJIZ();
                                                abstractC1295900jpM.LJJJ();
                                                break;
                                        }
                                    }
                                    abstractC1295900jpM.LJFF();
                                    return new C1295340joS(strLJIJJ5, strLJIJJ6, fLJIILLIIL7, enumC1295510joj, iLJIIZILJ5, fLJIILLIIL8, fLJIILLIIL9, iLIZ, iLIZ2, fLJIILLIIL10, zLJIILL3, pointF, pointF2);
                                }
                            }, false);
                            abstractC1294520jn8 = new AbstractC1294520jn8<C1295340joS, C1295340joS>(listLIZ) { // from class: X.0jos
                                @Override // X.InterfaceC1294490jn5
                                public final AbstractC1295190joD LIZ() {
                                    return new C1295360joU(this.LIZ);
                                }
                            };
                        }
                    }
                    c1296380jq8.LJFF();
                    break;
                case BdTuring.TYPE_SMS_VOICE /* 13 */:
                    c1296380jq8.LIZ();
                    ArrayList arrayList3 = new ArrayList();
                    while (c1296380jq8.LJII()) {
                        c1296380jq8.LIZIZ();
                        while (c1296380jq8.LJII()) {
                            int iLJJIL3 = c1296380jq8.LJJIL(LIZJ);
                            if (iLJJIL3 != 0) {
                                if (iLJJIL3 != 1) {
                                    c1296380jq8.LJJIZ();
                                    c1296380jq8.LJJJ();
                                } else {
                                    arrayList3.add(c1296380jq8.LJIJJ());
                                }
                            } else {
                                int iLJIIZILJ5 = c1296380jq8.LJIIZILJ();
                                if (iLJIIZILJ5 == 29) {
                                    C1296750jqj c1296750jqj2 = C1293900jm8.LIZ;
                                    c1295860jpI = null;
                                    while (c1296380jq8.LJII()) {
                                        if (c1296380jq8.LJJIL(C1293900jm8.LIZ) != 0) {
                                            c1296380jq8.LJJIZ();
                                            c1296380jq8.LJJJ();
                                        } else {
                                            c1296380jq8.LIZ();
                                            while (c1296380jq8.LJII()) {
                                                c1296380jq8.LIZIZ();
                                                C1295860jpI c1295860jpI2 = null;
                                                while (true) {
                                                    boolean z2 = false;
                                                    while (c1296380jq8.LJII()) {
                                                        int iLJJIL4 = c1296380jq8.LJJIL(C1293900jm8.LIZIZ);
                                                        if (iLJJIL4 != 0) {
                                                            if (iLJJIL4 != 1) {
                                                                c1296380jq8.LJJIZ();
                                                                c1296380jq8.LJJJ();
                                                            } else if (z2) {
                                                                c1295860jpI2 = new C1295860jpI(C1294870jnh.LIZIZ(c1296380jq8, c1294720jnS, true));
                                                            } else {
                                                                c1296380jq8.LJJJ();
                                                            }
                                                        } else if (c1296380jq8.LJIIZILJ() == 0) {
                                                            z2 = true;
                                                        }
                                                    }
                                                    c1296380jq8.LJFF();
                                                    if (c1295860jpI2 != null) {
                                                        c1295860jpI = c1295860jpI2;
                                                    }
                                                }
                                            }
                                            c1296380jq8.LIZLLL();
                                        }
                                    }
                                } else if (iLJIIZILJ5 == 25) {
                                    C1294980jns c1294980jns = new C1294980jns();
                                    while (c1296380jq8.LJII()) {
                                        if (c1296380jq8.LJJIL(C1294980jns.LJFF) != 0) {
                                            c1296380jq8.LJJIZ();
                                            c1296380jq8.LJJJ();
                                        } else {
                                            c1296380jq8.LIZ();
                                            while (c1296380jq8.LJII()) {
                                                c1296380jq8.LIZIZ();
                                                String strLJIJJ5 = "";
                                                while (c1296380jq8.LJII()) {
                                                    int iLJJIL5 = c1296380jq8.LJJIL(C1294980jns.LJI);
                                                    if (iLJJIL5 != 0) {
                                                        if (iLJJIL5 != 1) {
                                                            c1296380jq8.LJJIZ();
                                                            c1296380jq8.LJJJ();
                                                        } else {
                                                            strLJIJJ5.getClass();
                                                            switch (strLJIJJ5.hashCode()) {
                                                                case 353103893:
                                                                    if (!strLJIJJ5.equals("Distance")) {
                                                                        c1296380jq8.LJJJ();
                                                                    } else {
                                                                        c1294980jns.LIZLLL = C1294870jnh.LIZIZ(c1296380jq8, c1294720jnS, true);
                                                                    }
                                                                    break;
                                                                case 397447147:
                                                                    if (!strLJIJJ5.equals("Opacity")) {
                                                                        c1296380jq8.LJJJ();
                                                                    } else {
                                                                        c1294980jns.LIZIZ = C1294870jnh.LIZIZ(c1296380jq8, c1294720jnS, false);
                                                                    }
                                                                    break;
                                                                case 1041377119:
                                                                    if (!strLJIJJ5.equals("Direction")) {
                                                                        c1296380jq8.LJJJ();
                                                                    } else {
                                                                        c1294980jns.LIZJ = C1294870jnh.LIZIZ(c1296380jq8, c1294720jnS, false);
                                                                    }
                                                                    break;
                                                                case 1379387491:
                                                                    if (!strLJIJJ5.equals("Shadow Color")) {
                                                                        c1296380jq8.LJJJ();
                                                                    } else {
                                                                        c1294980jns.LIZ = C1294870jnh.LIZ(c1296380jq8, c1294720jnS);
                                                                    }
                                                                    break;
                                                                case 1383710113:
                                                                    if (!strLJIJJ5.equals("Softness")) {
                                                                        c1296380jq8.LJJJ();
                                                                    } else {
                                                                        c1294980jns.LJ = C1294870jnh.LIZIZ(c1296380jq8, c1294720jnS, true);
                                                                    }
                                                                    break;
                                                                default:
                                                                    c1296380jq8.LJJJ();
                                                                    break;
                                                            }
                                                        }
                                                    } else {
                                                        strLJIJJ5 = c1296380jq8.LJIJJ();
                                                    }
                                                }
                                                c1296380jq8.LJFF();
                                            }
                                            c1296380jq8.LIZLLL();
                                        }
                                    }
                                    C1295450jod c1295450jod = c1294980jns.LIZ;
                                    if (c1295450jod != null && (c1295020jnw = c1294980jns.LIZIZ) != null && (c1295020jnw2 = c1294980jns.LIZJ) != null && (c1295020jnw3 = c1294980jns.LIZLLL) != null && (c1295020jnw4 = c1294980jns.LJ) != null) {
                                        c1295720jp4 = new C1295720jp4(c1295450jod, c1295020jnw, c1295020jnw2, c1295020jnw3, c1295020jnw4);
                                    } else {
                                        c1295720jp4 = null;
                                    }
                                }
                            }
                        }
                        c1296380jq8.LJFF();
                    }
                    c1296380jq8.LIZLLL();
                    StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                    sbLIZ3.append("Lottie doesn't support layer effects. If you are using them for  fills, strokes, trim paths etc. then try adding them directly as contents  in your shape. Found: ");
                    sbLIZ3.append(arrayList3);
                    c1294720jnS.LIZ(C2188811AlT.LIZIZ(sbLIZ3));
                    break;
                case 14:
                    fLJIILLIIL = (float) c1296380jq8.LJIILLIIL();
                    break;
                case 15:
                    fLJIILLIIL2 = (float) c1296380jq8.LJIILLIIL();
                    break;
                case 16:
                    fLJIILLIIL3 = (float) (c1296380jq8.LJIILLIIL() * ((double) C1294350jmr.LIZJ()));
                    break;
                case LiveToolbarIconStyleSetting.GRAY_WITH_TEXT /* 17 */:
                    fLJIILLIIL4 = (float) (c1296380jq8.LJIILLIIL() * ((double) C1294350jmr.LIZJ()));
                    break;
                case LiveToolbarIconStyleSetting.COLORFUL_WITH_TEXT /* 18 */:
                    fLJIILLIIL6 = (float) c1296380jq8.LJIILLIIL();
                    break;
                case 19:
                    fLJIILLIIL5 = (float) c1296380jq8.LJIILLIIL();
                    break;
                case LiveToolbarIconStyleSetting.HIGHLIGHT_WITH_TEXT /* 20 */:
                    c1295020jnwLIZIZ = C1294870jnh.LIZIZ(c1296380jq8, c1294720jnS, z);
                    break;
                case 21:
                    strLJIJJ2 = c1296380jq8.LJIJJ();
                    break;
                case 22:
                    zLJIILL = c1296380jq8.LJIILL();
                    break;
                default:
                    c1296380jq8.LJJIZ();
                    c1296380jq8.LJJJ();
                    break;
            }
            z = false;
        }
        c1296380jq8.LJFF();
        ArrayList arrayList4 = new ArrayList();
        if (fLJIILLIIL6 > 0.0f) {
            arrayList4.add(new C1294810jnb(c1294720jnS, fValueOf, fValueOf, (Interpolator) null, 0.0f, Float.valueOf(fLJIILLIIL6)));
        }
        if (fLJIILLIIL5 <= 0.0f) {
            fLJIILLIIL5 = c1294720jnS.LJIIJJI;
        }
        arrayList4.add(new C1294810jnb(c1294720jnS, fValueOf2, fValueOf2, (Interpolator) null, fLJIILLIIL6, Float.valueOf(fLJIILLIIL5)));
        arrayList4.add(new C1294810jnb(c1294720jnS, fValueOf, fValueOf, (Interpolator) null, fLJIILLIIL5, Float.valueOf(Float.MAX_VALUE)));
        if (strLJIJJ.endsWith(".ai") || "ai".equals(strLJIJJ2)) {
            c1294720jnS.LIZ("Convert your Illustrator layers to shape layers.");
        }
        return new C1294730jnT(arrayList2, c1294720jnS, strLJIJJ, jLJIIZILJ, enumC1294940jno, jLJIIZILJ2, strLJIJJ3, arrayList, c1295320joQLIZ, iLJIIZILJ, iLJIIZILJ2, color, fLJIILLIIL, fLJIILLIIL2, fLJIILLIIL3, fLJIILLIIL4, abstractC1294520jn8, c1295770jp9, arrayList4, enumC1295410joZ, c1295020jnwLIZIZ, zLJIILL, c1295860jpI, c1295720jp4);
    }
}
